using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PersonAPp
{
    class Person
    {
        public String lastName { get; private set; }
        public String firstName { get; private set; }
        private int age { get; set; }

        public Person(String firstName, String lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public override string ToString()
        {
            return $"Person: {lastName}, {firstName}. Age: {age}";
        }
    }
}
