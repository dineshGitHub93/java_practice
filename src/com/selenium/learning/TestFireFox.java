package com.selenium.learning;

import org.openqa.selenium.WebDriver;

public class TestFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = WebDriverFactory.createBrowser("Edge");
		
		WebDriver driver = browser.createWebDriver();
		
		driver.get("https://google.com");
		
		// Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
        
        driver = browser.createRemoteWebDriver(null);
	}

}
