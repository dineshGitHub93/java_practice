package com.selenium.learning;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class WindowHandles  extends Base {

	@Test
	public void testWindowHandles() {

		try {

			// Open the first window and navigate to a website
			driver.get("https://google.com");
			String getFirstWindowHandles = driver.getWindowHandle();

			//Open a new window tab
			driver.switchTo().newWindow(WindowType.WINDOW);

			//get all windows and store it the 
			Set<String> getAllWindowsHandle = driver.getWindowHandles();
			String secoundWindow =getAllWindowsHandle.stream()
					.filter(i -> !i.equals(getFirstWindowHandles))
					.findFirst()
					.orElse(null);

		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.switchTo().window(secoundWindow);
		String getTitle = driver.getTitle();
		Thread.sleep(2000);
		driver.switchTo().window(getFirstWindowHandles);
		String getTitleOfFirstWindow = driver.getTitle();
		System.out.println(getTitle + " "+getTitleOfFirstWindow);
		driver.switchTo().window(secoundWindow).close();
		driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
