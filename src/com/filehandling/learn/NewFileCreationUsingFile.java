package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewFileCreationUsingFile {
	
	public void newFile() {
		try {
		String strPath , strName;
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter file path : ");
		
			strPath = br.readLine();
		
		System.out.println("Enter File Name : ");
		strName = br.readLine();
		
		//Create Object for file
		File file = new File(strPath+"\\"+strName+".txt");
		
		//Method creates a blank file 
		file.createNewFile();
		System.out.println("File created successfully..!");
		
		if(file.exists()) {
			System.out.println("File Heath-check");
			System.out.println("File Name : "+file.getName());
			System.out.println("File Directory : "+file.getPath());
			
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("Failed to create a file.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFileCreationUsingFile obj = new NewFileCreationUsingFile();
		obj.newFile();
		
	}

}
