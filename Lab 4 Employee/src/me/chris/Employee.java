package me.chris;

public class Employee {
	String firstName;
	String lastName;
	double salary;

	
	Employee(String first, String last, float sal){
		firstName = first;
		lastName = last;
		salary = sal;
	}
	
	public void increasePay(int percent) {
		salary += salary/percent;
	}
	
	public String toString() {
		return String.format("%s %s, Yearly Salary: $%.02f", firstName, lastName, salary);
	}
}
