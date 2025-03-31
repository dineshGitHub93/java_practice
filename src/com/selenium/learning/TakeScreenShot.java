package com.selenium.learning;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Maximize window (optional)
		driver.manage().window().maximize();

		// Take Screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(srcFile, new File("screenshot.png"));
		Thread.sleep(2000);
		// Destination path
        File dest = new File("screenshot.png");
        Thread.sleep(2000);
        // Copy file to destination
        FileHandler.copy(srcFile, dest);
        Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("Screenshot saved successfully!");
	}

}
