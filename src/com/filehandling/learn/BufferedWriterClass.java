package com.filehandling.learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Text to be written 
		String text = "Write into file using Buffered Writer Class \n happy to write this program";
		try {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//File path
		System.out.println("Please enter file path details : ");
		String filePath = br.readLine();
		
		//File name
		System.out.println("Please enter file name details : ");
		String fileName = br.readLine();
		
		//FileOutputStream fos = new FileOutputStream(filePath+"\\"+fileName+".txt");
		File file = new File(filePath+"\\"+fileName+".txt");
		file.createNewFile();
		System.out.println("File created successfully");
		
		if(file.exists()) {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			bw.write(text);
			
			System.out.println(text);
			
			bw.close();
		}
		
		
		}
		catch (Exception e) {
			System.out.println("Exception occured "+e.getMessage());
		}
	}

}
