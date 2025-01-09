package com.filehandling.learn;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileWriter writer = new FileWriter("Hello.txt");
			
			writer.write("I am writing text on note pad");
			
			writer.close();
			
			System.out.println("Text written successfully..!");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
