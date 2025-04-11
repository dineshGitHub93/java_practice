package com.selenium.learning;

import java.rmi.server.ExportException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestWaitForElement extends Base {

	@Test
	public void testDifferentWaitForElements() {
		
		driver.get("https://demoqa.com/alerts");
		//WebDriver Wait implementation
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//FluentWait Implementation
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement element=driver.findElement(By.id("timerAlertButton"));
		js.executeScript("arguments[0].click();", element);
		Alert alert =  fwait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		
	}
}
