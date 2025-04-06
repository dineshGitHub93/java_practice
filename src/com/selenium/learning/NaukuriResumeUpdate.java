package com.selenium.learning;

import org.testng.annotations.Test;

public class NaukuriResumeUpdate extends Base{

	String baseURL = "https://www.naukri.com/";
	NaukuriPageObject naukuriPageObject = new NaukuriPageObject(driver);
	
	@Test public void getUpdateResume() throws InterruptedException {
		test = extentReports.createTest("Test Alert Box");
		driver.get(baseURL);
		Thread.sleep(2000);
		naukuriPageObject.selectLogin();
		naukuriPageObject.enterCredentials("dineshspachaiyappan93@gmail.com", "Tccs@2022");
		
	}
}
