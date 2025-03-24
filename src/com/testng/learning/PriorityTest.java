package com.testng.learning;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = -5)
	public void sample() {
		System.out.println("Test with priority -5");
	}
	
	@Test(priority = 10)
	public void sample1() {
		System.out.println("Set priority to 10 ");
	}
	
	@Test(priority = 10)
	public void sample3() {
		System.out.println("Test with priority to 10 for check , how it prioritize");
	}
	
	@Test
	public void sample5() {
		System.out.println("Test method without setting priority");
	}
	
	@Test(priority = 100)
	public void sample4() {
		System.out.println("Test priority with 100");
	}
}
