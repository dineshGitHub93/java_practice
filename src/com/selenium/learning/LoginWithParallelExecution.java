package com.selenium.learning;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithParallelExecution {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) {
		
		switch(browser.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver();break;
		case "edge" : driver = new EdgeDriver();break;
		case "firefox" : driver = new FirefoxDriver();break;
		default : System.out.println("In-valid browser option");
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void loginWithParallelTest() {
		LoginPageForParallel lp = new LoginPageForParallel(driver);
		lp.setUserName("Admin");
		lp.setpassword("admin123");
		lp.clickOnLogin();
		boolean isNavigatedToHomePage = lp.homePageVerification();
		assertEquals(isNavigatedToHomePage, true, "Login successfully and navigated to home page");
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
