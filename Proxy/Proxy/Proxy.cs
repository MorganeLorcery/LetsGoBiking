using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Json;
using System.ServiceModel;
using System.Text;
using System.Text.Json;

namespace Proxy
{
    public class Proxy : IProxy
    {
        string KEY_JC = "42a5d0191394c5fd5614f98bf07ce0fcfde8fc2d";

        Cache<Objet> proxy = new Cache<Objet>();


        //Récupère les informations d'une station
        public Station GetStationInfo(string contractName, string stationNumber)
        {
            int updateDuration = 60;
            string url = "https://api.jcdecaux.com/vls/v3/stations/" + stationNumber + "?contract=" + contractName + "&apiKey=" + KEY_JC;
            string response = proxy.Get(url, updateDuration).getJson().Replace("\\", string.Empty);
            return JsonSerializer.Deserialize<Station>(response);
        }

        //Récupère la liste des contracts
        public List<Contract> GetListContract()
        {
            string url = "https://api.jcdecaux.com/vls/v3/contracts?apiKey=" + KEY_JC;
            string response = proxy.Get(url).getJson().Replace("\\", string.Empty);
            return JsonSerializer.Deserialize<List<Contract>>(response);
        }

        //Récupère la liste des stations associées à un contract
        public List<Station> GetListStation(string contractName)
        {
            string url = "https://api.jcdecaux.com/vls/v3/stations?contract=" + contractName + "&apiKey=" + KEY_JC;
            string response = proxy.Get(url).getJson();
            return JsonSerializer.Deserialize<List<Station>>(response);
        }

        //Récupère la liste de toutes les stations
        public List<Station> GetStations()
        {
            string url = "https://api.jcdecaux.com/vls/v3/stations?apiKey=" + KEY_JC;
            string response = proxy.Get(url).getJson();
            return JsonSerializer.Deserialize<List<Station>>(response);
        }
    }
}
