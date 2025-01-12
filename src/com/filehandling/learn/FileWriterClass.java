package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class FileWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//text to be written into file
		String text = "I am writing text into file using file write class \n and print the same into console using read method";
		
		
		try {
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));

			System.out.println("Please enter path : ");
			
			String path = br.readLine();
			
			//Definging file name using path
			Path fileName = Path.of(path);
			
			//Create a FileWriter Object to write in the file
			 FileWriter fwriter = new  FileWriter(path);
			
			fwriter.write(text);
			
			System.out.println(text);
			
			fwriter.close();
		}
		catch (Exception e) {
			System.out.println("Exception ocurred while writing file "+ e.getMessage());
		}
	}

}
