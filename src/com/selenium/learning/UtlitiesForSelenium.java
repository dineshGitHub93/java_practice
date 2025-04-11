package com.selenium.learning;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtlitiesForSelenium {
	
	private WebDriver driver;
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//FluentWait Implementation
	Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);

	public static void clickThroughJavaScript(WebDriver driver, WebElement locator) {
		
		
	}
}
