package com.selenium.learning;

public class WebDriverFactory {
	public static Browser createBrowser(String browserType) {
		return switch(browserType.toUpperCase()) {
			case "CHROME" -> new ChromeBrowser();
			case "FIREFOX" -> new FirefoxBrowser();
		default -> throw new IllegalArgumentException("Unexpected value: " + browserType.toUpperCase());
		};
	
	}

}
