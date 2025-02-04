package com.testng.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	String message = "Kunja";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Kunja";
		Assert.assertEquals(message,messageUtil.solutationMessage());
	}

}
