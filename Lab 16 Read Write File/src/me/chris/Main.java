package me.chris;

public class Main {
	public static void main(String[] args) {
		FileManager manager = new FileManager("test.txt");
		manager.read();
		manager.write("Hello from program!");
		manager.read();
		
	}
}

/*
Hello From File!
Hello from program!
*/