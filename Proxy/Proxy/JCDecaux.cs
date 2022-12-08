using System;
using System.Net.Http;
using System.Runtime.Serialization.Json;
using System.ServiceModel;
using System.Threading.Tasks;

//Pour la déserialisation 
namespace Proxy
{
    public class Station
    {
        public int number { get; set; }
        public string contractName { get; set; }
        public string name { get; set; }
        public string address { get; set; }
        public Position position { get; set; }
        public bool banking { get; set; }
        public bool bonus { get; set; }
        public string status { get; set; }
        public string lastUpdate { get; set; }
        public bool connected { get; set; }
        public bool overflow { get; set; }
        public object shape { get; set; }
        public TotalStands totalStands { get; set; }
        public MainStands mainStands { get; set; }
        public object overflowStands { get; set; }

    }

    public class Position
    {
        public double latitude { get; set; }
        public double longitude { get; set; }

    }

    public class TotalStands
    {
        public Avaibilities availabilities { get; set; }
        public int capacity { get; set; }

    }

    public class MainStands
    {
        public Avaibilities availabilities { get; set; }
        public int capacity { get; set; }
    }

    public class Avaibilities
    {
        public int bikes { get; set; }
        public int stands { get; set; }
        public int mechanicalBikes { get; set; }
        public int electricalBikes { get; set; }
        public int electricalInternalBatteryBikes { get; set; }
        public int electricalRemovableBatteryBikes { get; set; }
    }

    public class Contract
    {
        public string name { get; set; }

    }

    //On enregistre dans le cache sous forme d'objet JCDecaux
    class Objet
    {
        string json;

        public Objet(string url)
        {
            this.json = GetContracts(url).Result;
        }

        public async Task<String> GetContracts(string url)
        {
            HttpClient client = new HttpClient();
            string responseBody = "";

            try
            {
                HttpResponseMessage response = await client.GetAsync(url);
                response.EnsureSuccessStatusCode();
                responseBody = await response.Content.ReadAsStringAsync();
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine(e.Message);

            }

            return responseBody;
        }

        public string getJson()
        {
            return this.json;
        }
    }

    

}
