package com.filehandling.learn;

import java.io.FilePermission;

public class HashCodeMethodUsingFP {

	public static void main(String[] args) {
		// Java Program illustrating hashCode() method
		
		FilePermission fp_obj1 = new FilePermission("bufferWrite", "read");
		
		int i = fp_obj1.hashCode();
		System.out.println("Hashcode value for FP_Obj1 : "+ i);

	}

}
