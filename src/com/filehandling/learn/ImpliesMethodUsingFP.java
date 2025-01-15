package com.filehandling.learn;

import java.io.FilePermission;

public class ImpliesMethodUsingFP {

	public static void main(String[] args) {
		// Java Program illustrating implies() method
		
		boolean check = false;
		
		// Creating new FilePermissions
		FilePermission fp_obj1 = new FilePermission("bufferWrite", "read");
		FilePermission fp_obj2 = new FilePermission("sample_text", "write");
		FilePermission fp_obj3 = new FilePermission("bufferWrite", "read");
		
		// Use of implies() method
		
		//use of implies method
				check = fp_obj1.implies(fp_obj2);
				System.out.println("Using implies for FP_obj1 : "+ check);

				 // Checked here with the same FilePermission object
				check = fp_obj2.implies(fp_obj2);
				System.out.println("Using implies for FP_obj2 : "+ check);
	}

}
