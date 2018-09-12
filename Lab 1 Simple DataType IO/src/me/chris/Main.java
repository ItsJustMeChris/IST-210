package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		byte b = 'P';
		short s = 16;
		int i = 10;
		long l = 64;
		float f = 88133.125000f;
		double d = 3377.123456789012400;
		char c = 'X';
		String str = "myString";
		boolean bool = true;
		Object o = "myObject";
		
		System.out.println("**** Part1: ****\n");
		System.out.printf("Byte = %c\n", b);
		System.out.printf("Short = %d\n", s);
		System.out.printf("Int = %d\n", i);
		System.out.printf("Long = %d\n", l);
		System.out.printf("Float = %f\n", f);
		System.out.printf("Double = %f\n", d);
		System.out.printf("Char = %c\n", c);
		System.out.printf("String = %s\n", str);
		System.out.printf("Boolean = %S\n", bool);
		System.out.printf("Object = %s\n", o);
		
		System.out.println("**** Part2: ****\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a byte: ");
		b = input.nextByte();
		System.out.printf("Byte = %c\n", b);
		System.out.print("Enter an Int: ");
		i = input.nextInt();
		System.out.printf("Int = %d\n", i);
		System.out.print("Enter an Int16: ");
		s = input.nextShort();
		System.out.printf("Short = %d\n", s);
		System.out.print("Enter a Long Int: ");
		l = input.nextLong();
		System.out.printf("Long = %d\n", l);
		System.out.print("Enter a Float: ");
		f = input.nextFloat();
		System.out.printf("Float = %f\n", f);
		System.out.print("Enter a Double: ");
		d = input.nextDouble();
		System.out.printf("Double = %f\n", d);
		System.out.print("Enter a String: ");
		c = input.next().charAt(0);
		System.out.printf("Char = %c\n", c);
		System.out.print("Enter a String: ");
		str = input.next();
		System.out.printf("String = %s\n", str);
		System.out.print("Enter a Boolean (true/false): ");
		bool = input.nextBoolean();
		System.out.printf("Boolean (uppercase) = %S\n", bool);
		System.out.print("Enter a String: ");
		o = input.next();
		System.out.printf("Object = %s\n", o);
		System.out.println("Done...");
	}
}

/* 
**** Part1: ****

Byte = P
Short = 16
Int = 10
Long = 64
Float = 88133.125000
Double = 3377.123457
Char = X
String = myString
Boolean = TRUE
Object = myObject
**** Part2: ****

Enter a byte: 86
Byte = V
Enter an Int: 4455
Int = 4455
Enter an Int16: 32
Short = 32
Enter a Long Int: 999999
Long = 999999
Enter a Float: 1234567.123456789
Float = 1234567.125000
Enter a Double: 1234567.123456789
Double = 1234567.123457
Enter a String: Saleem
Char = S
Enter a String: Yusuf
String = Yusuf
Enter a Boolean (true/false): true
Boolean (uppercase) = TRUE
Enter a String: Michael
Object = Michael
*/