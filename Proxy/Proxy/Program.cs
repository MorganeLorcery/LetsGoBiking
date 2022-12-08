using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel.Description;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Proxy
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            BasicHttpBinding binding = new BasicHttpBinding();

            //Créer un URI qui servira d'adresse de base
            Uri HttpUrl = new Uri("http://localhost:8733/Design_Time_Addresses/Proxy/Proxy/");

            //Créer une instance de ServiceHost
            ServiceHost serviceHost = new ServiceHost(typeof(Proxy), HttpUrl);

            //Ajouter un point de terminaison du service
            serviceHost.AddServiceEndpoint(typeof(IProxy), binding, "");

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
