package com.selenium.learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	 private static void verifyLink(String url) {
	        try {
	        	
	            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	            connection.setRequestMethod("HEAD");
	            connection.connect();
	            int responseCode = connection.getResponseCode();

	            if (responseCode >= 400) {
	                System.out.println("Broken: " + url + " [Code: " + responseCode + "]");
	            } else {
	                System.out.println("OK: " + url + " [Code: " + responseCode + "]");
	            }
	        } catch (Exception e) {
	            System.out.println("Exception for URL: " + url + " - " + e.getMessage());
	        }
	    }
	 

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		List<WebElement> links = driver.findElements(By.tagName("a"));
				
		links.stream()
				.map(link -> link.getDomAttribute("href"))
				.filter(url -> url != null && !url.isEmpty())
				.filter(url -> !url.startsWith("javascript:") && !url.startsWith("mailto:"))
				.distinct()
				.forEach(BrokenLink::verifyLink);

		driver.quit();
	}

}
