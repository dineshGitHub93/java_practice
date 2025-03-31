package com.selenium.learning;


import org.testng.annotations.Test;

public class RunnerForAlert extends Base{
	
	AlertPage alertPage;
	
	@Test
	public void runAlert() throws InterruptedException {
		
		alertPage = new AlertPage(driver);
		alertPage.showAlertBox();
		alertPage.showAlertBoxWithConfirmation(false);
		alertPage.showAlertBoxWithPrompt(false, "Kunja");
		
	}
	

}
