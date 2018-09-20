package me.chris;

public class Main {
	public static void main(String[] args) {
		PersonArray pa = new PersonArray(5);
		System.out.println("PersonArray.Insert()");
		pa.insert("Joe", "Peps1", 19);
		pa.insert("Joe", "Peps2", 19);
		pa.insert("Joe", "Peps3", 19);
		pa.insert("Joe", "Peps4", 19);
		pa.insert("Joe", "Peps5", 19);
		System.out.println("PersonArray.DisplayAll()");
		pa.DisplayAll();
		System.out.println("PersonArray.Delete(\"Peps5\")");
		pa.delete("Peps5");
		System.out.println("PersonArray.DisplayAll()");
		pa.DisplayAll();
		System.out.println("PersonArray.Find('Peps3')");
		System.out.println(pa.find("Peps3"));
	}
}

/*
PersonArray.Insert()
PersonArray.DisplayAll()
Person [lastName=Peps1, firstName=Joe, age=19]
Person [lastName=Peps2, firstName=Joe, age=19]
Person [lastName=Peps3, firstName=Joe, age=19]
Person [lastName=Peps4, firstName=Joe, age=19]
Person [lastName=Peps5, firstName=Joe, age=19]
PersonArray.Delete("Peps5")
PersonArray.DisplayAll()
Person [lastName=Peps1, firstName=Joe, age=19]
Person [lastName=Peps2, firstName=Joe, age=19]
Person [lastName=Peps3, firstName=Joe, age=19]
Person [lastName=Peps4, firstName=Joe, age=19]
PersonArray.Find('Peps3')
Person [lastName=Peps3, firstName=Joe, age=19]
*/