package com.selenium.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScreenshotsTake extends Base{

	@Test
	public void takesScreenShot() {
		driver.get("https://google.com");
		
		try {
			Function<WebDriver, File> takesScreenShot = (WebDriver d) -> ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			File screenshot = takesScreenShot.apply(driver);
			
			FileUtils.copyFile(screenshot, new File("./reports/screenshots/screenshot.png"));
			System.out.println("Screen shot saved");
		}
		catch (IOException e) {
			e.getMessage();
		}
	}
	
}
