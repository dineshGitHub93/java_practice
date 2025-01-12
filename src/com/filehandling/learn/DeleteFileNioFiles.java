package com.filehandling.learn;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeleteFileNioFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter path : ");
			String str = sc.nextLine();
			
			Files.deleteIfExists(Paths.get(str));
			
			System.out.println("File Delete successfully");
		}
		catch (NoSuchFileException e) {
			
			System.out.println("No such file or directory exist");
			
		}
		catch (DirectoryNotEmptyException e) {
		
			System.out.println("Directory not empty");
		}
		catch (Exception e) {
			System.out.println("Invalid permission");
		}
	}

}
