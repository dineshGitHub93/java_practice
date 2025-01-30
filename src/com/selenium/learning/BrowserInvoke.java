package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserInvoke {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void launchApplication() {
		driver.get("https://www.tutorialspoint.com/testng/testng_execution_procedure.htm");
		System.out.println("Page Title :"+driver.getTitle());
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		if(driver != null) {
			Thread.sleep(5000);
			driver.quit();
		}
	}
	
}
