package com.filehandling.learn;

import java.io.FilePermission;

public class GetActionsFromFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FilePermission fp_obj1 = new FilePermission("bufferWrite", "read, delete, write");
		FilePermission fp_obj2 = new FilePermission("sample_text", "write, read, execute");
		FilePermission fp_obj3 = new FilePermission("bufferWrite", "delete, readlink, read");

		//use of getAction() method
		String str = fp_obj1.getActions();
				System.out.println("Get Actions with FP_Obj1 : "+ str);

		String str1 = fp_obj2.getActions();
				System.out.println("Get Actions with FP_Obj2 : "+ str1);

		String str2 = fp_obj3.getActions();
				System.out.println("Get Actions with FP_Obj3 : "+ str2);
	}

}
