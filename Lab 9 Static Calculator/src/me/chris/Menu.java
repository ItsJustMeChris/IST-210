package me.chris;

import java.util.Scanner;

public class Menu {
	static void showMenu() {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Calculator Menu");
			System.out.println("1.\tAdd");
			System.out.println("2.\tSubtract");
			System.out.println("3.\tMultiply");
			System.out.println("4.\tDivide");
			System.out.println("5.\tModulus");
			System.out.println("6.\tQuit");
			System.out.print("Enter your selection [1-6]: ");
			int sel = scan.nextInt();
			if (validateSelection(sel) > 0) {
				int a;
				int b;
				System.out.print("Enter first number: ");
				a = scan.nextInt();
				System.out.print("Enter second number: ");
				b = scan.nextInt();
			
				runSelection(sel, a, b);
			} else if (sel == 6) {
				System.out.println("Goodbye..");
				break;
			} 
		}
		scan.close();
	}
	
	static void runSelection(int selection, int a, int b) {
		switch(selection) {
		case 1: 
			System.out.println("Sum of " + a + ", " + b + " is " + Calculator.Add(a, b));;
			break;
		case 2: 
			System.out.println("Difference of " + a + ", " + b + " is " + Calculator.Subtract(a, b));;
			break;
		case 3: 
			System.out.println("Product of " + a + ", " + b + " is " + Calculator.Multiply(a, b));;
			break;
		case 4: 
			System.out.println("Quotient of " + a + ", " + b + " is " + Calculator.Divide(a, b));;
			break;
		case 5: 
			System.out.println("Quotient of " + a + ", " + b + " is " + Calculator.Modulus(a, b));;
			break;
		default:
			showMenu();
		}
	}
	
	static int validateSelection(int res) {
		if (res >= 1 && res < 6) {
			return res;
		}
		return 0;
	}
}
