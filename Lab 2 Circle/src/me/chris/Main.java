package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = scan.nextInt();
		System.out.printf("Radius: %d\n", radius);
		System.out.printf("Diameter: %.2f\n", Circle.diameter(radius));
		System.out.printf("Circumference: %.2f\n", Circle.circumference(radius));
		System.out.printf("Area: %.2f\n", Circle.area(radius));
	}
}

/*
Enter radius: 8
Radius: 8
Diameter: 16.00
Circumference: 50.27
Area: 201.06

*/