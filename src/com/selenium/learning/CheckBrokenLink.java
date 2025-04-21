package com.selenium.learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBrokenLink extends Base{

	@Test
	public void testBrokenLinksFromPage() {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String base = driver.getCurrentUrl();
		
		WebElement footer = driver.findElement(By.cssSelector("div[class^=' footer_top']"));
		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		
		footerLinks.forEach(link -> {
			try {
				URI baseURI = new URI(base).resolve(link.getDomAttribute("href"));
				URL url = baseURI.toURL(); 
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("HEAD");
				con.connect();
				
				int responseCode = con.getResponseCode();
				if(responseCode >400)
					System.out.println("FAILED URL : "+url+" Response Code :"+responseCode);
				else
					System.out.println("PASSED URL : "+url+" Response Code :"+responseCode);
				
			} catch (URISyntaxException | IOException e) {
				e.printStackTrace();
			}
		});
	}
}
