package me.chris;

public class PersonArray {
	private Person[] people;
	private int numPeople;
	
	public PersonArray(int personCount) {
		this.people = new Person[personCount];
		this.numPeople = personCount;
	}
	
	public void insert(String firstName, String lastName, int age) {
		for(int i=0; i<this.numPeople; i++) {
			if (this.people[i] == null) {
				this.people[i] = new Person(firstName, lastName, age);
				break;
			}
		}
	}
	
	public void delete(String lastName) {
		Person[] tmp = new Person[this.numPeople-1];
		int count = 0;
		for(int i = 0; i < this.numPeople; i++) {
			if (!this.people[i].getLastName().equals(lastName)) {
				tmp[count] = this.people[count];
				count++;
			}
		}
		this.numPeople -= 1;
		this.people = tmp;
	}
	
	public Person find(String lastName) {
		for(int i = 0; i < this.numPeople; i++) {
			if (this.people[i].getLastName().equals(lastName)) {
				return this.people[i];
			}
		}
		return null;
	}
	
	public void DisplayAll() {
		for(int i = 0; i< this.numPeople; i++) {
			System.out.println(this.people[i]);
		}
	}
}
