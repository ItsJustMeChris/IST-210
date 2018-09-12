package me.chris;

public class Main {
	public static void main(String[] args) {
		Employee bob = new Employee("Bob", "Jones", 34500.00f);
		Employee susan = new Employee("Susan", "Baker", 37809.00f);

		System.out.println(bob.toString());
		System.out.println(susan.toString());
		
		bob.increasePay(10);
		susan.increasePay(10);
		
		System.out.println(bob.toString());
		System.out.println(susan.toString());
	}
}

/*
Bob Jones, Yearly Salary: $34500.00
Susan Baker, Yearly Salary: $37809.00
Bob Jones, Yearly Salary: $37950.00
Susan Baker, Yearly Salary: $41589.90

*/