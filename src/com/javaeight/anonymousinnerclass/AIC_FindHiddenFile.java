package com.javaeight.anonymousinnerclass;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class AIC_FindHiddenFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File[] hiddenFile = new File("D:\\Dinesh")
							.listFiles(new FileFilter() {
								
								@Override
								public boolean accept(File pathname) {
									// TODO Auto-generated method stub
									return pathname.isHidden();
								}
							});
		
		for (File file : hiddenFile) {
			
			System.out.println(file.getName());
		}
		
	}

}
