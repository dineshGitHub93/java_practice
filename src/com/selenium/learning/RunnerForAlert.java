package com.selenium.learning;


import org.testng.annotations.Test;

public class RunnerForAlert extends Base{
	
	AlertPage alertPage;
	String baseURL = "https://testpages.herokuapp.com/styled/alerts/alert-test.html";
	
	
	@Test
	public void runAlertBox() throws InterruptedException {
		test = extentReports.createTest("Test Alert Box");
		driver.get(baseURL);
		
		alertPage = new AlertPage(driver);
		alertPage.showAlertBox();
	}
	
	@Test
	public void testAlertWithConfirmation() throws InterruptedException {
		 test = extentReports.createTest("Test Alert Box with Confirmation");
		 driver.get(baseURL);
		 
		 alertPage = new AlertPage(driver);
		 alertPage.showAlertBoxWithConfirmation(true);
	}

	@Test
	public void testAlertWithPrompt() throws InterruptedException {
		test = extentReports.createTest("Test Alert Box with Prompt");
		driver.get(baseURL);
		 
		 alertPage = new AlertPage(driver);
		 alertPage.showAlertBoxWithPrompt(true, "Kunja");
	}
}
