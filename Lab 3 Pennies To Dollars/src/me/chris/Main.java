package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter pennies: ");
		Converter conv = new Converter(scan.nextInt());
		conv.output();
		scan.close();
	}
}

/*
Please enter pennies: 141
Original Amount: 141
Number of Dollars: 1
Number of Quarters:  1
Number of Dimes:  1
Number of Nickels:  1
Number of Pennies:  1

Please enter pennies: 145
Original Amount: 145
Number of Dollars: 1
Number of Quarters:  1
Number of Dimes:  2
Number of Nickels:  0
Number of Pennies:  0

*/