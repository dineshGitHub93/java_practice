package com.testng.learning;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGSimpleTest {
	
	@Test
	public void addTest() {
		String str = "TestNG is working fine";
		assertEquals("TestNG is working fine", str);
		
	}

}
