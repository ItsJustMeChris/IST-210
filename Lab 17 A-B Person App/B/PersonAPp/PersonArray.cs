using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PersonAPp
{
    class PersonArray
    {
        private Person[] people;
        private int numPeople;
        public PersonArray(int personCount)
        {
            this.numPeople = personCount;
            people = new Person[personCount];
        }

        public void Insert(String firstName, String lastName, int age)
        {
            for(var i=0; i<numPeople; i++)
            {
                if (people[i] == null)
                {
                    people[i] = new Person(firstName, lastName, age);
                    break;
                }
            }
        }

        public void Delete(String lastName)
        {
            Person[] tmp = new Person[this.numPeople-1];
            var count = 0;
            for(var i = 0; i < numPeople; i++)
            {
                if (!people[i].lastName.Equals(lastName))
                {
                    tmp[count] = people[count];
                    count++;
                }
            }
            numPeople -= 1;
            people = tmp;
        }

        public Person Find(String lastName)
        {
            foreach (Person p in people)
            {
                if (p.lastName.Equals(lastName))
                {
                    return p;
                }
            }
            return null;
        }

        public void DisplayAll()
        {
            for(var i = 0; i< numPeople; i++)
            {
                Console.WriteLine(people[i]);
            }
        }
    }
}
