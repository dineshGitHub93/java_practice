package com.selenium.learning;

import org.openqa.selenium.WebDriver;

public interface Browser {
	
	WebDriver createWebDriver();
	WebDriver createRemoteWebDriver(String url);

}
