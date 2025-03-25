package com.javaeight.MethodReference;

import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.stream.Stream;

public class HiddenFileFound {

	public void toFoundHiddenFileBeforeJava8(File file) {

		File[] fileName = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isHidden();
			}
		});

		for(File filename :fileName) {
			System.out.println(filename);
		}
	}

	public void toFoundHiddenFileUsingMethodReference(File file) {

		File[] fileName = file.listFiles(File :: isHidden);
		
		for(File filename :fileName) {
			System.out.println(filename);
		}
		
	}

	public void toFoundHiddenFileUsingLambda(File file) {

		File[] fileName = file.listFiles(files->files.isHidden());

		for(File files :fileName) {
			System.out.println(files);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiddenFileFound hiddenFiles = new HiddenFileFound();
		File pathname = new File("D:\\Dinesh");
		//hiddenFiles.toFoundHiddenFileBeforeJava8(pathname);
		//hiddenFiles.toFoundHiddenFileUsingLambda(pathname);
		hiddenFiles.toFoundHiddenFileUsingMethodReference(pathname);
	}

}
