package me.chris;

public class ArrayObject {
	private int[] arr;
	private int numEntries;
	
	public ArrayObject(int[] arra, int numElements) {
		arr = arra;
		numEntries = numElements;
	}
	
	public void displayAt(int i) {
		System.out.println("Displaying element at index " + i + " of the array");
		System.out.println("Value at index " + i + " is: " + arr[i]);
	}
	
	public void displayAll() {
		System.out.println("Displaying all members of the array");
		for(int i = 0; i < numEntries; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int find(int value) {
		System.out.println("Find " + value + " in the array");
		for(int i=0; i< numEntries; i++) {
			if (arr[i] == value) {
				System.out.println("Number " + value + " was found at index " + i + " of the array");
				return i;
			}
		}
		System.out.println("Number " + value + " was NOT found");
		return -1;
	}
	
	public void Delete(int value) {
		System.out.println("Delete " + value + " from the array");
		int[] tmp = new int[numEntries-1];
		int counter = 0;
		for (int i = 0; i < numEntries; i++) {
			if (arr[i] != value) {
				tmp[counter] = arr[i];
				counter++;
			}
		}
		numEntries--;
		arr = tmp;
	}
	
	public void bubbleSort() {
		int out, in;
		int temp;

		for (out = numEntries - 1; out > 0; out--) // outer loop (backward)
		{
			for (in = 0; in < out; in++) // inner loop (forward)
			{

				// combined the old "swap" into the "if" loop
				if (arr[in] > arr[in + 1]) {
					temp = arr[in];
					arr[in] = arr[in + 1];
					arr[in + 1] = temp;
				} // end if
			} // inner for loop
		} // outer for loop
	} // end bubbleSort()

	
	public void insert(int n) {
		System.out.println("Insert " + n + " into the array and then display array");
		int[] tmp = new int[numEntries+1];
		System.arraycopy(arr, 0, tmp, 0, numEntries);
		tmp[numEntries] = n;
		numEntries++;
		arr = tmp;
		displayAll();
	}
}
