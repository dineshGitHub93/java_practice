package com.testng.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {

	String message = ".com";
	MessageUtil messageutil = new MessageUtil(message);

	@Test(groups = {"functest", "checkintest"})
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = ".com";
		Assert.assertEquals(message, messageutil.printMessage());
	}

	@Test(groups = {"checkintest"})
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "tutorialspoint" + ".com";
		Assert.assertEquals(message, messageutil.solutationMessage());
	}

	@Test(groups = {"functest"})
	public void testingExitMessage() {
		System.out.println("Inside testExitMessage()");
		message = "www." + "tutorialspoint"+".com";
		Assert.assertEquals(message, messageutil.exitMessage());
	}

}
