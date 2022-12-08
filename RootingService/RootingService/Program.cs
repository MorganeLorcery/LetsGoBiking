using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.ConstrainedExecution;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.ServiceModel.Description;
using System.Text;
using System.Threading.Tasks;
using static System.Net.WebRequestMethods;

namespace RootingService
{
    class Program
    {
        public static void Main(string[] args)
        {
            
            BasicHttpBinding binding = new BasicHttpBinding();

            //Créer un URI qui servira d'adresse de base
            Uri HttpUrl = new Uri("http://localhost:8733/Design_Time_Addresses/RootingService/Service1/");

            //Créer une instance de ServiceHost
            ServiceHost serviceHost = new ServiceHost(typeof(Service1), HttpUrl);

            //Ajouter un point de terminaison du service
            serviceHost.AddServiceEndpoint(typeof(IService1), binding, "");

            //Permettre l'échange de métadonnées
            ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
            smb.HttpsGetEnabled = true;
            smb.HttpGetEnabled = true;
            serviceHost.Description.Behaviors.Add(smb);

            //Démarrez le service
            serviceHost.Open();

            Console.ReadLine();

        }
    }
}
