using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_12_Array
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[10];
            arr[0] = 77;            // insert 10 items
            arr[1] = 99;
            arr[2] = 44;
            arr[3] = 55;
            arr[4] = 22;
            arr[5] = 88;
            arr[6] = 11;
            arr[7] = 3;
            arr[8] = 66;
            arr[9] = 33;
            int nElems = 10;

            ArrayObject ao = new ArrayObject(arr, nElems);
            ao.displayAll();

            ao.displayAt(6);

            ao.find(55);

            ao.delete(55);

            ao.find(55);

            ao.displayAll();

            ao.bubbleSort();

            Console.WriteLine("Sorting the array");
            ao.displayAll();

            ao.insert(49);

            Console.ReadLine();
        }
    }
}

/*
 * Displaying all members of the array
77 99 44 55 22 88 11 3 66 33
Display element at index 6 of the array
Value at index 6 is: 11
Find 55 in the array
Number 55 was found at index 3 of the array
Delete 55 from the array
Find 55 in the array
Number 55 was NOT found
Displaying all members of the array
77 99 44 22 88 11 3 66 33 0 0
Sorting the array
Displaying all members of the array
3 11 22 33 44 66 77 88 99 0 0
Insert 49 into the array and then display the array
Displaying all members of the array
3 11 22 33 44 66 77 88 99 49

*/
