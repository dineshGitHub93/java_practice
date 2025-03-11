package com.selenium.learning;



import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowser implements Browser {

	@Override
	public WebDriver createWebDriver() {
		// TODO Auto-generated method stub
		return new ChromeDriver();
	}

	@Override
	public WebDriver createRemoteWebDriver(String url){
		// TODO Auto-generated method stub
		try {
			return new RemoteWebDriver(new URL(url), new ChromeOptions());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}


}
