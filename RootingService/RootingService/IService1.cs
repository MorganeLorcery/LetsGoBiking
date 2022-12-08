using System;
using System.Globalization;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Threading.Tasks;

namespace RootingService
{
   [ServiceContract]
    public interface IService1
    {
        [OperationContract]
        Itineraire GetItineraire(string origin, string destination);

        [OperationContract]
        void GetItineraireActivemq(string origin, string destination);

    }
}
