package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllDirFileAccess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Enter the path and dirname
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter Path of directory : ");
		String path = br.readLine();
		
		System.out.println("Enter Name of directory : ");
		String name = br.readLine();
		
		File file = new File(path, name);
		
		if(file.exists()) {
		
		String[] arr = file.list();
		
		int n = arr.length;
		
		for(int i=0; i< n; i++) {
			
			System.out.println(arr[i] +" ");
			
			File f1 = new File(file, arr[i]);
			
			if(f1.isFile()) 
				System.out.println(f1.getName() + ": Is a file ");
			if(f1.isDirectory())
				System.out.println(": Is a directory");
			
			
		}
		System.out.println("\n No of entries in this directory : " + n);
		}
		else {
			System.out.println("Directory Not Found");
		}
	}

}
