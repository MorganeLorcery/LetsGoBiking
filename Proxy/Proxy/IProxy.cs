using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Proxy
{
    [ServiceContract]
    public interface IProxy
    {
        [OperationContract]
        Station GetStationInfo(string contractName, string stationNumber);
        [OperationContract]
        List<Contract> GetListContract();
        [OperationContract]
        List<Station> GetListStation(string contractName);
        [OperationContract]
        List<Station> GetStations();
    }
}
