package com.selenium.learning;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class Selenium4WindowHandles extends Base{
	
	@Test
	public void testOpenWindowsUsingSelenium4() {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//open a new tab and switch to it 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		
		//go back to original tab if need
		for(String switchBack : driver.getWindowHandles()) {
			driver.switchTo().window(switchBack);
		}
	}

}
