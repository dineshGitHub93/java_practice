package com.filehandling.learn;

import java.io.File;

public class CheckFileExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accept file name or directory name through
		//Comment line agrs
		//String fname = args[0];
		
		//Pass the file name or directory name to file object
		File f = new File("Hello1.txt");
		
		//Apple all methods of file class on file object
		System.out.println("File Name : "+f.getName());
		System.out.println("File Path : "+f.getPath());
		System.out.println("Abosulte Pathe : "+f.getAbsolutePath());
		System.out.println("Parent of File : "+f.getParent());
		System.out.println("Existence of File :"+f.exists());
		
		if(f.exists()) {
			System.out.println("Is Readable : "+f.canRead());
			System.out.println("Is Writeable : "+f.canWrite());
			System.out.println("Is a directory : "+f.isDirectory());
			System.out.println("File Lengtch : "+f.length());
		}

	}

}
