using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PersonAPp
{
    class Program
    {
        static void Main(string[] args)
        {
            PersonArray pa = new PersonArray(5);
            pa.Insert("Joe", "Peps1", 19);
            pa.Insert("Joe", "Peps2", 15);
            pa.Insert("Joe", "Peps3", 16);
            pa.Insert("Joe", "Peps4", 29);
            pa.Insert("Joe", "Peps5", 39);
            Console.WriteLine("PersonArray.Insert()");
            Console.WriteLine("PersonArray.DisplayAll()");
            pa.DisplayAll();
            Console.WriteLine("PersonArray.Delete('Peps5')");
            pa.Delete("Peps5");
            Console.WriteLine("PersonArray.DisplayAll()");
            pa.DisplayAll();
            Console.WriteLine("PersonArray.Find('Peps3')");
            if (pa.Find("Peps3") == null)
            {
                Console.WriteLine("Error, not found");
            } else
            {
                Console.WriteLine(pa.Find("Peps3"));
            }

            Console.ReadLine();
        }
    }
}

/*
 * PersonArray.Insert()
PersonArray.DisplayAll()
Person: Peps1, Joe. Age: 19
Person: Peps2, Joe. Age: 15
Person: Peps3, Joe. Age: 16
Person: Peps4, Joe. Age: 29
Person: Peps5, Joe. Age: 39
PersonArray.Delete('Peps5')
PersonArray.DisplayAll()
Person: Peps1, Joe. Age: 19
Person: Peps2, Joe. Age: 15
Person: Peps3, Joe. Age: 16
Person: Peps4, Joe. Age: 29
PersonArray.Find('Peps3')
Person: Peps3, Joe. Age: 16
*/