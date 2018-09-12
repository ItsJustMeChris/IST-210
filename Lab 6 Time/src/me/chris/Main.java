package me.chris;

public class Main {
	public static void main(String[] args) {
		
		Time t1 = new Time();
		
		System.out.println("Time created with constructor that has no arguments.");
		System.out.println(t1.toUniversal());
		System.out.println(t1.toStandard());

		Time t2 = new Time(3,20,20);
		
		System.out.println("Time created with constructor that has 3 arguments.");
		System.out.println(t2.toUniversal());
		System.out.println(t2.toStandard());

		Time t3 = new Time(13,45);
		System.out.println("Time created with constructor that has 2 arguments.");
		System.out.println(t3.toUniversal());
		System.out.println(t3.toStandard());

		Time t4 = new Time(15);
		
		System.out.println("Time created with constructor that has 1 argument.");
		System.out.println(t4.toUniversal());
		System.out.println(t4.toStandard());

		System.out.println("Time created with object 'time2'.");
		System.out.println(t2.toUniversal());
		System.out.println(t2.toStandard());

		t2.setHours(13);
		t2.setMinutes(27);
		t2.setSeconds(6);
		
		System.out.println("Change time to 13h, 27m and 6s and display updated time");
		System.out.println(t2.toUniversal());
		System.out.println(t2.toStandard());
	}
}

/*
Time created with constructor that has no arguments.
Universal time is 00:00:00
Standard time is 12:00:00 PM

Time created with constructor that has 3 arguments.
Universal time is 03:20:20
Standard time is -9:20:20 PM

Time created with constructor that has 2 arguments.
Universal time is 13:45:00
Standard time is 1:45:00 AM

Time created with constructor that has 1 argument.
Universal time is 15:00:00
Standard time is 3:00:00 AM

Time created with object 'time2'.
Universal time is 03:20:20
Standard time is -9:20:20 PM

Change time to 13h, 27m and 6s and display updated time
Universal time is 13:27:06
Standard time is 1:27:06 AM

*/