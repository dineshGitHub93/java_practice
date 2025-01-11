package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class CreateFileUsingFOS {

	public void newFile() {

		try {

			String strFilePath , strFileName ;

			// Creating BufferClass Object
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));

			// Asking user for File Name
			System.out.print("Enter the file name : ");
			strFileName = br.readLine();

			// Asking File path from User
			System.out.print("Enter the file path : ");
			strFilePath = br.readLine();
			
			//Object creation for fileOutputStream class to creation of new file
			FileOutputStream fos = new FileOutputStream(strFilePath+"\\"+strFileName+".txt");
			System.out.println("File created successfully...!");
		}
		catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateFileUsingFOS fos = new CreateFileUsingFOS();
		fos.newFile();
	}

}
