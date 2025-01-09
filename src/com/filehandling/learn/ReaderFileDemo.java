package com.filehandling.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File file = new File("biograph.txt");
		
		try {
			Scanner reader = new Scanner(file);
			
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}

	}

}
