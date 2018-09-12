package me.chris;

public class Circle {
	public static double diameter(int radius) {
		return 2*radius;
	}
	public static double circumference(int radius) {
		return (2*Math.PI)*radius;
	}
	public static double area(int radius) {
		return Math.PI*Math.pow(radius, 2);
	}
}
