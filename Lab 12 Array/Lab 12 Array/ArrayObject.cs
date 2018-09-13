using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_12_Array
{
    class ArrayObject
    {
        private int[] arr;
        private int numEntries;

        public ArrayObject(int[] arra, int numElements)
        {
            arr = arra;
            numEntries = numElements;
        }

        public void displayAt(int i)
        {
            Console.WriteLine($"Display element at index {i} of the array");
            Console.WriteLine($"Value at index {i} is: {arr[i]}");
        }

        public void displayAll()
        {
            Console.WriteLine("Displaying all members of the array");
            foreach(int el in arr)
            {
                Console.Write($"{el} ");
            }
            Console.WriteLine();
        }

        public int find(int value)
        {
            Console.WriteLine($"Find {value} in the array");
            for(int i = 0; i < numEntries; i++)
            {
                if(arr[i] == value)
                {
                    Console.WriteLine($"Number {value} was found at index {i} of the array");
                    return i;
                }
            }
            Console.WriteLine($"Number {value} was NOT found");
            return -1;
        }

        public void delete(int value)
        {
            Console.WriteLine($"Delete {value} from the array");
            int[] tmp = new int[numEntries + 1];
            int counter = 0;
            for(int i = 0; i< numEntries; i++)
            {
                if(arr[i] != value)
                {
                    tmp[counter] = arr[i];
                    counter++;
                }
            }
            numEntries--;
            arr = tmp;
        }

        public void bubbleSort()
        {
            int o,i;
            int tmp;
            for(o = numEntries-1; o>0; o--)
            {
                for (i = 0; i < o; i++)
                {
                    if (arr[i] > arr[i+1])
                    {
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                    }
                }
            }
        }

        public void insert(int n)
        {
            Console.WriteLine($"Insert {n} into the array and then display the array");
            int[] tmp = new int[numEntries + 1];
            Array.Copy(arr, tmp, numEntries);
            tmp[numEntries] = n;
            arr = tmp;
            displayAll();
        }
    }
}
