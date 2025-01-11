package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class DirectoryAccessDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//Get directory path details
		String path = br.readLine();
		
		//Get Directory name
		String name = br.readLine();
		
		//File object creation
		File f = new File(path, name);
		
		if(f.exists()) {
			
			String fname[] = f.list();
			
			int length = fname.length;
			
			for(int i = 0; i<length; i++) {
				
				File f1 = new File(f, fname[i]);
				
				if(f1.isFile()) {
					System.out.println(f1.getName() +" Is a file");
				}
				if(f1.isDirectory()) {
					System.out.println("Is a directory ");
				}
				
			}
			 System.out.println("\nNo of entries in this directory : " + length);
		}
		else {
			System.out.println("Unbale to found directory");
		}
	}

}
