package me.chris;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}
	

}
