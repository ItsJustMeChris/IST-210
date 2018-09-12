package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int digitIn;
		do {
			System.out.print("Enter a five digit integer: ");
			digitIn = scanner.nextInt();
		} while (! Integer.toString(digitIn).matches("[0-9]{5}"));
		
		Digits digits = new Digits(digitIn);
		
		int[] numberDigits = digits.digits();
		
		System.out.print("Digits in " + digits.number + " are ");
		
		for(int i=0; i<numberDigits.length; i++) {
			System.out.print(numberDigits[i] + "   ");
		}

		scanner.close();
	}
}

/*
Enter a five digit integer: 50739
Digits in 50739 are 5   0   7   3   9   

Enter a five digit integer: 12345
Digits in 12345 are 1   2   3   4   5   

Enter a five digit integer: 50
Enter a five digit integer: 12345
Digits in 12345 are 1   2   3   4   5   
*/