package com.learn.interviewquestion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", args);
		
	}
}

