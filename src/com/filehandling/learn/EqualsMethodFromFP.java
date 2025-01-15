package com.filehandling.learn;

import java.io.FilePermission;

public class EqualsMethodFromFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bool = false;

		FilePermission fp_obj1 = new FilePermission("bufferWrite", "read");
		FilePermission fp_obj2 = new FilePermission("sample_text", "write");
		FilePermission fp_obj3 = new FilePermission("bufferWrite", "read");

		//use of equals method
		bool = fp_obj1.equals(fp_obj2);
		System.out.println("Check FP_obj1 equals with FP_obj2 : "+ bool);
		
		bool = fp_obj2.equals(fp_obj3);
		System.out.println("Check FP_obj2 equals with FP_obj3 : "+ bool);
		
		bool = fp_obj1.equals(fp_obj3);
		System.out.println("Check FP_obj1 equals with FP_obj3 : "+ bool);
	}
	

}
