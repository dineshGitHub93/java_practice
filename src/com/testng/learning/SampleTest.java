package com.testng.learning;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.oops_framework.learning.MessageUtil;

public class SampleTest {
	
	String message = "Hello TestNG";
	
	MessageUtil msg = new MessageUtil(message);
	
	@Test
	public void printMessage() {
		assertEquals(message, msg.printMessage());
	}

}
