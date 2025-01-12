package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteTextIntoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String text = " Hello Dinesh how are you \n how is file learning is going ";
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			//Get path details from file
			String path = br.readLine();
			
			//Defining file name
			Path fileName = Path.of(path);
			
			//writeString method using to write a text into file
			Files.writeString(fileName, text);
			
			//readString method using to read a text from file
			Files.readString(fileName);
			
		}
		catch (Exception e) {
			
			System.out.println("Error Occured : "+e.getMessage());
		}

	}

}
