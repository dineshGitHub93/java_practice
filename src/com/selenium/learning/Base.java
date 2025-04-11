package com.selenium.learning;

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
		reportPath = "reports/ExtentReport_"+timestamp+".html";
		
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		extentReports = new ExtentReports();
		extentReports.attachReporter(spark);
	}
	

	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
	    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT); // Always accept alerts
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result	){
		
		String screenshotPath = captureScreenshot(result.getName());
		
		switch(result.getStatus()) {
	    case ITestResult.FAILURE:
	        test.fail("Test Failed: " + result.getThrowable().getMessage(),
	            MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	        break;
	    case ITestResult.SUCCESS:
	        test.pass("Test Passed",
	            MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	        break;
	    case ITestResult.SKIP:
	        test.skip("Test Skipped");
	        break;
	}
		if(driver !=null) 
		{
			driver.quit();
		}
	}
	
	@AfterSuite
	public void flushReport() 
	{
		extentReports.flush();
	}
	public static String  captureScreenshot(String testName) {
		  if (driver == null) {
		        System.out.println("Driver is null. Cannot take screenshot.");
		        return null;
		    }
		 try {
			 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        
		        // Create a folder for screenshots if it doesn't exist
		        File screenshotDir = new File(System.getProperty("user.dir") + "/reports/screenshots");
		        if (!screenshotDir.exists()) {
		            screenshotDir.mkdirs();
		        }

		        // Generate timestamped filename
		        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		        String screenshotPath = screenshotDir + "/" + testName + "_" + timestamp + ".png";

		        // Save the file
		        File dest = new File(screenshotPath);
		        FileUtils.copyFile(src, dest);
		        
		        return screenshotPath;
		 }
		 catch (Exception e) {
			e.printStackTrace();
			return null;
	}
}
}