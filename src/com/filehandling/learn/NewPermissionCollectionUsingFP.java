package com.filehandling.learn;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class NewPermissionCollectionUsingFP {

	public static void main(String[] args) {
		// Java Program illustrating 
		// newPermissionCollection() method
		
		 // Creating new FilePermissions
		FilePermission fp_obj1 = new FilePermission("bufferWrite.txt", "read");

		// Creating new PermissionCollection
        // Use of newPermissionCollection() 
		PermissionCollection FP = fp_obj1.newPermissionCollection();
		
		// Collecting the Permissions of FP_obj1 for FP
		FP.add(fp_obj1);
		
		boolean check = FP.implies(new FilePermission("bufferWrite.txt", "read"));
		System.out.println("Is newPermissionCollection() method is working : "+ check);
		
	}

}
