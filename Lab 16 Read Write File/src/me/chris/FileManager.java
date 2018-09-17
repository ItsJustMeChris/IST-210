package me.chris;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	private String fileName;
	private String line;
	
	FileManager(String fileName) {
		this.fileName = fileName;
	}
	
	void read() {
        FileReader fileReader = null;
        
		try {
			fileReader = new FileReader(this.fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
			while((line = bufferedReader.readLine()) != null) {
			    System.out.println(this.line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}   

        try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
        
	}
	
	void write(String text) {
        FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(this.fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
        	bufferedWriter.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        try {
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
