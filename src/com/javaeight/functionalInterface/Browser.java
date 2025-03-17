package com.javaeight.functionalInterface;

@FunctionalInterface
public interface Browser {

	//We can write n. number of default methods in the functional interface 
	// we can use this default methods though we don't to give any implementation 
	public void browse();
	default public void saveBookmark() {
		System.out.println("Save book mark in the browser");
	}
	
}
