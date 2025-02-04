package com.testng.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	String message = "Kunja";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
