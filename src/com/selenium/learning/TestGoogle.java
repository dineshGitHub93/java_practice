package com.selenium.learning;

import org.openqa.selenium.WebDriver;

public class TestGoogle {

	public static void main(String[] args) {
		//create a chrome browser instance using the factory
		Browser browser = WebDriverFactory.createBrowser("chrome");
		
		//Get webdriver from the browser instance
		WebDriver driver = browser.createWebDriver();
		
		//launch Google
		driver.get("https://www.google.com");
		
		// Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
	}

}
