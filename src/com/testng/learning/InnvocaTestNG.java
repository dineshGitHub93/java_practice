package com.testng.learning;

import org.testng.annotations.Test;

public class InnvocaTestNG {
	
	@Test(invocationCount = 5)
	public void sample1() {
		System.out.println("Test with invocation 10");
	}
	
	@Test
	public void samp1() {
		
	}

	@Test(invocationCount = 5, enabled=false)
	public void sample2() {
		System.out.println("Ingnore particual test cases");
	}
}
