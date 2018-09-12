package me.chris;

public class Digits {
	int number;
	
	Digits(int num) 
    { 
		number = num;
    } 
	
	public int[] digits() {
		int[] arr = new int[Integer.toString(number).length()];
		int tmp = number;
		for(int i = Integer.toString(number).length()-1; i >= 0 ; i--) {
			arr[i] = tmp % 10;
			tmp/=10;
		}
		
		return arr;
	}
}
