package com.selenium.learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxBrowser implements Browser {

	@Override
	public WebDriver createWebDriver() {
		// TODO Auto-generated method stub
		return new FirefoxDriver();
	}

	@Override
	public WebDriver createRemoteWebDriver(String url) {
		// TODO Auto-generated method stub
		try {
			return new RemoteWebDriver(new URL(url), new FirefoxOptions());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
