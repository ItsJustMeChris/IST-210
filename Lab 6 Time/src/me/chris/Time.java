package me.chris;

public class Time {
	int hours;
	int minutes;
	int seconds;
	
	Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	Time(int h, int m, int s) {
	    hours = h;
	    minutes = m;
	    seconds = s;
	}
	
	Time(int h, int m) {
	    hours = h;
	    minutes = m;
	    seconds = 0;
	}
	
	Time(int h) {
	    hours = h;
	    minutes = 0;
	    seconds = 0;
	}
	
	void setHours(int h) {
		hours = h;
	}
	
	void setMinutes(int m) {
		minutes = m;
	}
	
	void setSeconds(int s) {
		seconds = s;
	}
	
	String toStandard() {
		int tmpHours = (hours < 12) ? (hours == 0) ? 12 : hours-12 : hours-12;
		
		String isPM = (hours < 12) ? "PM" : "AM";
		
		return String.format("Standard time is "+
							 "%d:%02d:%02d %s%n", tmpHours, minutes, seconds, isPM);
	}
	
	String toUniversal() {
		
		return String.format("Universal time is "+
							 "%02d:%02d:%02d", hours, minutes, seconds);
	}
}
