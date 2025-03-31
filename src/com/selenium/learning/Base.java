package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
