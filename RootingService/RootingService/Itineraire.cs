using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Configuration;
using System.Runtime.InteropServices;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace RootingService
{
    [DataContract]
    public class Itineraire
    {
        [DataMember]
        public Etape Etape1 { get; set; }
        
        [DataMember]
        public Etape Etape2 { get; set; }
        [DataMember]
        public Etape Etape3 { get; set; }
        [DataMember]
        public bool Erreur { get; set; }
        [DataMember]
        public bool Utile { get; set; }


        public Itineraire(bool Erreur, bool Utile, Etape Etape1, Etape Etape2, Etape Etape3)
        {
            this.Erreur = Erreur;
            this.Utile = Utile;
            this.Etape1 = Etape1;
            this.Etape2 = Etape2;
            this.Etape3 = Etape3;

        }
    }

    [DataContract]
    public class Etape
    {
        [DataMember]
        public Paths[] paths { get; set; }

    }

    [DataContract]
    public class Paths
    {
        [DataMember]
        public int[] bbox;
        [DataMember]
        public Points points;
        public int time { get; set; }
        [DataMember]
        public List<Instruction> instructions { get; set; }

    }

    
    
    [DataContract]
    public class Instruction
    {
        [DataMember]
        public double distance { get; set; }
        [DataMember]
        public string text { get; set; }
        

    }

    public class Points
    {
        public int[][] coordinates;
    }

    public class Places
    {
        public Hit[] hits { get; set; }

    }
    public class Hit
    {
        public string name { get; set; }
        public Point point { get; set; }
    }

    public class Point
    {
        public double lng { get; set; }
        public double lat { get; set; }

    }

}
