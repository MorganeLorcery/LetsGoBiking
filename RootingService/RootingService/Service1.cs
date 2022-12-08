using System;
using System.Threading.Tasks;
using System.Net.Http;
using RootingService.ServiceReference1;
using System.Text.Json;
using System.Device.Location;
using Apache.NMS.ActiveMQ;
using Apache.NMS;
using System.ServiceModel.Web;

namespace RootingService
{
   public class Service1 : IService1
    {
         
        string KEY_GH = "759bc262-11f0-49da-bc17-986ebf79ce1c";


        ProxyClient client = new ProxyClient();

        public void GetItineraireActivemq(string origin, string destination)
        {
            try
            {
                Itineraire itineraire = GetItineraire(origin, destination);

                Uri connecturi = new Uri("activemq:tcp://localhost:61616");
                ConnectionFactory connectionFactory = new ConnectionFactory(connecturi);

                // Créer une Connection à partir de Connection Factory
                IConnection connection = connectionFactory.CreateConnection();
                connection.Start();

                // Créer une session à partir de la connection
                ISession session = connection.CreateSession();

                // Utilise la session pour cibler une queue
                IDestination queue = session.GetQueue("queue");

                // Créer un Producer qui va écrire sur la queue
                IMessageProducer producer = session.CreateProducer(queue);

                // Configuration Producer
                producer.DeliveryMode = MsgDeliveryMode.NonPersistent;

                ITextMessage message;


                // Envoi des messages sur la queue:

                //Cas d'erreur
                if (itineraire.Erreur)
                {
                    message = session.CreateTextMessage("Aucun itinéraire n'a été trouvé\n");
                    producer.Send(message);
                    return;
                }
                //Cas ou le vélo n'est pas utile
                if (itineraire.Utile == false)
                {
                    ITextMessage message_utile = session.CreateTextMessage("Ce n'est pas utile de faire ce trajet à vélo\n");
                    producer.Send(message_utile);
                    return;
                }


                //De l'adresse de départ à la station vélo
                message = session.CreateTextMessage("Suivez les instructions suivantes pour vous rendre à la station de vélo:\n");
                producer.Send(message);
                foreach (Instruction instruction in itineraire.Etape1.paths[0].instructions)
                {
                    message = session.CreateTextMessage(instruction.text);
                    producer.Send(message);
                }
                message = session.CreateTextMessage("\nVous êtes arrivé à la station de vélo, vous pouvez en prendre un.\n");
                producer.Send(message);


                //Trajet en vélo
                message = session.CreateTextMessage("Suivez les instructions suivantes pour vous rendre à la prochaine station de vélo:\n");
                producer.Send(message);
                foreach (Instruction instruction in itineraire.Etape2.paths[0].instructions)
                {
                    message = session.CreateTextMessage(instruction.text);
                    producer.Send(message);
                }
                message = session.CreateTextMessage("\nVous êtes arrivé à la station de vélo, vous pouvez y déposer votre vélo.\n");
                producer.Send(message);


                //De la station de vélo à l'adresse d'arrivée
                message = session.CreateTextMessage("Suivez les instructions suivantes pour vous rendre à l'adresse d'arrivée:\n");
                producer.Send(message);
                foreach (Instruction instruction in itineraire.Etape3.paths[0].instructions)
                {
                    message = session.CreateTextMessage(instruction.text);
                    producer.Send(message);
                }
                message = session.CreateTextMessage("\nVous êtes arrivé à destination !! \n");
                producer.Send(message);

            } catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
            

        }
        public Itineraire GetItineraire(string origin, string destination)
        {
            WebOperationContext.Current.OutgoingResponse.Headers.Add("Access-Control-Allow-Origin", "*");

            //Itinéraire retourner en cas d'erreur:
            Itineraire erreur = new Itineraire(true, false, null, null, null);

            //Converti l'adresse donnée en json avec les positions
            string origin_json = ConvertAdress(origin).Result;
            string destination_json = ConvertAdress(destination).Result;

            //Deserialize pour récupérer les coordonnées des adresses à partir des json
            Places origin_places;
            Places destination_places;
            try
            {
                origin_places = JsonSerializer.Deserialize<Places>(origin_json);
                destination_places = JsonSerializer.Deserialize<Places>(destination_json);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return erreur;
            }


            
            double origin_latitude;
            double origin_longitude;
            if (origin_places.hits.Length > 0)
            {
                origin_latitude = origin_places.hits[0].point.lat;
                origin_longitude = origin_places.hits[0].point.lng;

            }
            else
            {
                return erreur;
            }

            double destination_latitude;
            double destination_longitude;
            if (destination_places.hits.Length > 0)
            {
                destination_latitude = destination_places.hits[0].point.lat;
                destination_longitude = destination_places.hits[0].point.lng;

            }
            else
            {
                return erreur;
            }


            //Cherche les stations les plus proches
            GeoCoordinate origin_coordinate = new GeoCoordinate(origin_latitude, origin_longitude);
            GeoCoordinate destination_coordinate = new GeoCoordinate(destination_latitude, destination_longitude);
            double distance_origin_min = -1;
            double distance_destination_min = -1;

            //Station la plus proche de l'adresse de départ
            Station stationA = null;
            //Station la plus proche de l'adresse d'arrivée
            Station stationB = null;


            try
            {
                Contract[] contracts = GetContracts().Result;
                foreach (Contract c in contracts)
                {
                    try
                    {
                        var stations = GetStations(c.name).Result;
                        foreach (Station s in stations)
                        {
                            //Pour chaque station trouvée, on calcule sa distance avec les adresses de départ et d'arrivée
                            GeoCoordinate s_coordinate = new GeoCoordinate(s.position.latitude, s.position.longitude);
                            double distance_origin = s_coordinate.GetDistanceTo(origin_coordinate);
                            double distance_destination = s_coordinate.GetDistanceTo(destination_coordinate);


                            //On vérifie la disponibilité des vélos pour la station et on compare les distances
                            if (distance_origin < 10000 && distance_origin != 0 && distance_origin < distance_destination && (distance_origin_min == -1 || distance_origin < distance_origin_min) && BikeDispo(s))
                            {
                                stationA = s;
                                distance_origin_min = distance_origin;
                            }

                            if (distance_destination < 10000 && distance_destination != 0 && distance_origin > distance_destination && (distance_destination_min == -1 || distance_destination < distance_destination_min) && StandDispo(s))
                            {
                                stationB = s;
                                distance_destination_min = distance_destination;
                            }
                        }

                        
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine(e.Message);
                    }
                }
            } catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }


            //Coordonnées des stations trouvées
            double stationA_longitude = 0;
            double stationA_lattitude = 0;
            double stationB_longitude = 0;
            double stationB_lattitude = 0;

            if (stationA != null)
            {
                stationA_longitude = stationA.position.longitude;
                stationA_lattitude = stationA.position.latitude;
            }
            else
            {
                return erreur;
            }
            if (stationB != null)
            {
                stationB_longitude = stationB.position.longitude;
                stationB_lattitude = stationB.position.latitude;
            }
            else return erreur;



            //On crée les 3 étapes qui vont composer l'itinéraire à retourner
            Etape Etape1;
            Etape Etape2;
            Etape Etape3;

            try
            {
                //Première étape: de l'adresse de départ à la première station
                string itineraire1_json = Pathing(origin_longitude, origin_latitude, stationA_longitude, stationA_lattitude, "marche").Result;
                Etape1 = JsonSerializer.Deserialize<Etape>(itineraire1_json);

                //Deuxième étape: de la première station à la deuxième station
                string itineraire2_json = Pathing(stationA_longitude, stationA_lattitude, stationB_longitude, stationB_lattitude, "velo").Result;
                Etape2 = JsonSerializer.Deserialize<Etape>(itineraire2_json);

                //Troisième étape: de la deuxième station à l'adresse d'arrivée
                string itineraire3_json = Pathing(stationB_longitude, stationB_lattitude, destination_longitude, destination_latitude, "marche").Result;
                Etape3 = JsonSerializer.Deserialize<Etape>(itineraire3_json);

            } catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return erreur;
            }

            //Calcule le temps mis à vélo et on vérifie que c'est utile
            int temps_velo = Etape1.paths[0].time + Etape2.paths[0].time + Etape3.paths[0].time;
            bool utile = IsUtile(origin_longitude, origin_latitude, destination_longitude, destination_latitude, temps_velo);


            //Retourne un itinéraire composé des 3 étapes trouvées précédemment
            return new Itineraire(false, utile, Etape1, Etape2, Etape3);

        }

        
        async Task<string> ConvertAdress(string adresse)
        {
            HttpClient client = new HttpClient();
            string responseBody;
           
            try
            {
                //Récupère les informations de position depuis l'adresse donnée
                HttpResponseMessage response = await client.GetAsync("https://graphhopper.com/api/1/geocode?q=" + adresse + "&locale=fr&key=" + KEY_GH);
                response.EnsureSuccessStatusCode();
                responseBody = await response.Content.ReadAsStringAsync();
                return responseBody;
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine("\nException Caught!");
                Console.WriteLine("Message :{0} ", e.Message);
                return "";
            }
        }

        
        /*Station[] GetStationProche(double origin_latitude, double origin_longitude, double destination_latitude, double destination_longitude)
        {
            GeoCoordinate origin_coordinate = new GeoCoordinate(origin_latitude, origin_longitude);
            GeoCoordinate destination_coordinate = new GeoCoordinate(destination_latitude, destination_longitude);
            double distance_origin_min = -1;
            double distance_destination_min = -1;

            Station[] stationProche = null;

            try
            {

                Contract[] contracts = GetContracts().Result;
                foreach (Contract c in contracts)
                {
                    var stations = GetStations(c.name).Result;
                    foreach (Station s in stations)
                    {

                        GeoCoordinate s_coordinate = new GeoCoordinate(s.position.latitude, s.position.longitude);
                        double distance_origin = s_coordinate.GetDistanceTo(origin_coordinate);
                        double distance_destination = s_coordinate.GetDistanceTo(origin_coordinate);


                        // Check des vélo available
                        
                        if ((distance_origin_min == -1 || distance_origin <= distance_origin_min) && BikeDispo(s))
                        {
                            distance_origin_min = distance_origin;
                            stationProche[0] = s;
                        }
                        
                        
                        if (distance_destination < distance_destination_min && StandDispo(s))
                        {
                            distance_destination_min = distance_destination;
                            stationProche[1] = s;
                        }
                    }
                }
            
            } catch (AggregateException e) {
                Console.WriteLine(e.Message);
            }

            return stationProche;
        }*/



        async Task<Contract[]> GetContracts()
        {
            Contract[] response = await client.GetListContractAsync();
            return response;
        }
        async Task<Station[]> GetStations(string contractName)
        {
            var response = await client.GetListStationAsync(contractName);
            return response;
        }


       
        //Appel OpenStreetMap et renvoie un object contenant le chemin entre deux points
        async Task<string> Pathing(double originLongitude, double originLatitude, double destinationLongitude, double destinationLatitude, string type)
        {
            string startLong = ("" + originLongitude).Replace(",", ".");
            string startLat = ("" + originLatitude).Replace(",", ".");
            string endLong = ("" + destinationLongitude).Replace(",", ".");
            string endLat = ("" + destinationLatitude).Replace(",", ".");

            HttpClient client = new HttpClient();

            string responseBody = "";
            try
            {
                if (type == "marche")
                {
                    //Récupère le chemin entre 2 points grâce aux coordonnées (à pied)
                    HttpResponseMessage response = await client.GetAsync("https://graphhopper.com/api/1/route?vehicle=foot" + "&locale=fr&key=" + KEY_GH + "&type=json&points_encoded=false&point=" + startLat + "," + startLong + "&point=" + endLat + "," + endLong);
                    response.EnsureSuccessStatusCode();
                    responseBody = await response.Content.ReadAsStringAsync();
                }
                else
                {
                    //Récupère le chemin entre 2 points grâce aux coordonnées (à vélo)
                    HttpResponseMessage response = await client.GetAsync("https://graphhopper.com/api/1/route?vehicle=bike" + "&locale=fr&key=" + KEY_GH + "&type=json&points_encoded=false&point=" + startLat + "," + startLong + "&point=" + endLat + "," + endLong);
                    response.EnsureSuccessStatusCode();
                    responseBody = await response.Content.ReadAsStringAsync();
                }
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine("\nException Caught!");
                Console.WriteLine("Message :{0} ", e.Message);
            }

            return responseBody;
        }

        public bool IsUtile(double originLongitude, double originLattitude, double destinationLongitude, double destinationLattitude, int temps_velo)
        {            
            //une seule étape de l'origine à la destination
            string itineraire_json = Pathing(originLongitude, originLattitude, destinationLongitude, destinationLattitude, "marche").Result;
            Etape etape = JsonSerializer.Deserialize<Etape>(itineraire_json);


            //Calcule le temps mis à pied et le compare avec le temps mis à vélo
            int temps_marche = etape.paths[0].time;

            //si c'est plus rapide à vélo, on renvoie true
            //sinon on renvoie false
            if(temps_marche > temps_velo)
            {
                return true;
            }
            else
            {
                return false;
            }

        }



        Boolean BikeDispo(Station station)
        {
            //Vérifie qu'il y a des vélos disponibles à une station donnée
            if (station.totalStands.availabilities.bikes != 0)
            {
                return true;
            }
            return false;
        }

        

        Boolean StandDispo(Station station)
        {
            //Vérifie qu'il y a une place libre pour déposer un vélo à une station donnée
            if (station.totalStands.availabilities.stands != 0)
            {
                return true;
            }
            return false;
        }



        

    }
}
