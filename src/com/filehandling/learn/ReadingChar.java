package com.filehandling.learn;

import java.io.FileReader;
import java.io.IOException;

public class ReadingChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fileReader = new FileReader("Hello1.txt");
		
		System.out.println("Reading char by char : \n");
		
		int i ;
		
		while((i = fileReader.read()) != -1) {
			
			System.out.print((char) i );
		}
		
		System.out.println("Reading using array : \n");
		
		char[] charArray = new char[10];
		
		fileReader.read(charArray);
		System.out.print(charArray);

		fileReader.close();
		System.out.println("FileReader Closed !");
	}

}
