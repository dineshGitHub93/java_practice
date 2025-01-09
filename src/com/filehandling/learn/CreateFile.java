package com.filehandling.learn;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		try {
			File file = new File("Hello1.txt");

			if(file.createNewFile()) {
					System.out.println("File created successfully :"+file.getName());
					System.out.println("Path :"+file.getAbsolutePath());
			}
			else {
				System.out.println("File is already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error has occurred.");
            e.printStackTrace();
		}


	}
}