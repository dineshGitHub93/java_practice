package com.filehandling.learn;

import java.io.File;

public class DeleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("E:\\java_practice-1\\biograph.txt");
		
		if(file.delete()) {
			
			System.out.println("File deleted successfully");
		}
		else {
			
            System.out.println("Failed to delete the file");
        }
	}

}
