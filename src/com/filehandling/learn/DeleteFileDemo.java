package com.filehandling.learn;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("Hello.txt");
		
		if(file.delete()) {
			
			System.out.println("File deleted successfully..!"+file.getName());
		}
		else {
			System.out.println("Filed in deleting the file");
		}
	}

}
