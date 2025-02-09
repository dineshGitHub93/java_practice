package com.testng.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {

	String message = "Kunja";
	MessageUtil msgUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Kunja";
		Assert.assertEquals(message, msgUtil.printMessage());
	}
	
	@Test(dependsOnMethods = {"iniEnvironement"})
	public void testSolutionMessage() {
		System.out.println("Inside testSolutionMessage()");
		message = "Hi!"+"Kunja";
		Assert.assertEquals(message, msgUtil.solutationMessage());
	}
	
	@Test
	public void iniEnvironement() {
		System.out.println("This is iniEnvironement()");
	}
	
}
