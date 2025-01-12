package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class DeleteFileMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			
			System.out.println("Please enter file path name : ");
			String filePath = br.readLine();
			
			File file = new File(filePath);
			
			if(file.delete()) {
				System.out.println("File deleted successfully..! ");
			}
			else 
			{
				System.out.println("File not found to delete");
			}
		}
		catch (Exception e) {
			
			System.out.println("Exception occured : "+e.getMessage());
		}
		
	}

}
