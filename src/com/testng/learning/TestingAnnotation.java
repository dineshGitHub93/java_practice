package com.testng.learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotation {


	@Test //Test case1
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test //Test case2
	public void testCase2() {
		System.out.println("Test case 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite");
	}

}
