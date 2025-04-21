package com.learn.locator;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base {

	protected static WebDriver driver;
	protected static ExtentReports extentReports;
	protected static ExtentTest test;
	private String reportPath;

	@BeforeSuite
	public void setupExtent() {
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		reportPath = "./reports/ExtentReport_"+timestamp+".html";

		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		extentReports = new ExtentReports();
		extentReports.attachReporter(spark);
		test = extentReports.createTest("Test");
	}


	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT); // Always accept alerts
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown(ITestResult result){
		String screenshotPath = captureScreenshot(driver, result.getName());
		
		if (test != null) {
		if (result.getStatus() == ITestResult.FAILURE) {
	         // your screenshot logic here

	        if (screenshotPath != null && !screenshotPath.trim().isEmpty()) {
	            test.fail("Test Failed: " + result.getThrowable(),
	                MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	        } else {
	            test.fail("Test Failed: " + result.getThrowable());
	            test.warning("Screenshot not available or path was null.");
	        }
	    } else if (result.getStatus() == ITestResult.SUCCESS) {
	    	test.pass("Test Passed",
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    }

		 } else {
		        System.out.println("ExtentTest object is null. Skipping Extent Report logging.");
		    }
		

		if(driver !=null) 
		{
			driver.quit();
		}
	    // flush extent
		extentReports.flush();
	    
	    
	}

	public static String  captureScreenshot(WebDriver driver, String testName) {
		
		 try {
		        TakesScreenshot ts = (TakesScreenshot) driver;
		        File source = ts.getScreenshotAs(OutputType.FILE);
		        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		        String path = System.getProperty("user.dir") + "/screenshots/"+testName + "_"+timestamp +".png";
		        File destination = new File(path);
		        FileUtils.copyFile(source, destination);
		        return path;
		    } catch (Exception e) {
		        e.printStackTrace();
		        return null; // very important to return null on failure
		    }
	}
}