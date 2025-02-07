package com.testng.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	String message = "Kunja";
	MessageUtil messageutil = new MessageUtil(message);
	
	@Test(enabled = false)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage() method");
		message = "Kunja";
		Assert.assertEquals(message, messageutil.printMessage());
	}
	
	@Test
	public void testSolutionMessage() {
		System.out.println("Inside testSolutionMessage() method");
		message = "Hi!"+ message;
		Assert.assertEquals(message, messageutil.solutationMessage());
	}

}
