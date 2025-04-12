package com.selenium.learning;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;


public class AlertPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public AlertPage(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	};
	
	@FindBy(id="alertexamples")
	private WebElement alertBtnWithOk;
	
	@FindBy(id="confirmexample")
	private WebElement alertBtnWithConfirmation;
	
	@FindBy(id="confirmexplanation")
	private WebElement confirmationText;
	
	@FindBy(id="promptexample")
	private WebElement alertBtnWithPrompt;
	
	@FindBy(id="promptexplanation")
	private WebElement promptText;
	
	public void showAlertBox() throws InterruptedException {
		Base.test.info("Clicking Alert Button with OK");
		alertBtnWithOk.click();	    
		Alert switchToAlertBox = driver.switchTo().alert();
		String alertText = switchToAlertBox.getText();
		Base.test.info("Alert text: " + alertText);
		Thread.sleep(2000);
		
		Assert.assertEquals("I am an alert box!", alertText, "Alert text matched");
		
		String screenshotPath = Base.captureScreenshot(this.driver, "AlertBox");
		Base.test.pass("Alert box validated successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		
		switchToAlertBox.accept();
	}

	public void showAlertBoxWithConfirmation(boolean clickAction) throws InterruptedException {
		 Base.test.info("Clicking Alert Button with Confirmation");
		alertBtnWithConfirmation.click();
		Alert switchToAlertBox = driver.switchTo().alert();
		String alertText = switchToAlertBox.getText();
		Base.test.info("Alert text: " + alertText);
		assertEquals("I am a confirm alert", alertText, "I am a confirm alert");
		Thread.sleep(2000);
		if(clickAction) {
			switchToAlertBox.accept();
			Assert.assertEquals(confirmationText.getText(), "You clicked OK, confirm returned "+clickAction+".", "display a TRUE confirm dialog when clicked");
			String screenshotPath = Base.captureScreenshot(this.driver, "ConfirmationOK");
			Base.test.pass("Confirmation dialog validated successfully", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		
		}else {
			Thread.sleep(2000);
			switchToAlertBox.dismiss();
			Assert.assertEquals(confirmationText.getText(), "You clicked Cancel, confirm returned "+clickAction+".", "display a FALSE confirm dialog when clicked");
		}
	}
	
	public void showAlertBoxWithPrompt(boolean clickAction, String text) throws InterruptedException {
		Base.test.info("Clicking Alert Button with Prompt");
		alertBtnWithPrompt.click();
		Alert switchToAlertBox = driver.switchTo().alert();
		String alertText = switchToAlertBox.getText();
		Base.test.info("Alert text: " + alertText);
		assertEquals(alertText, "I prompt you", "I am a confirm alert");
		Thread.sleep(2000);
		if(clickAction) {
			switchToAlertBox.sendKeys(text);
			switchToAlertBox.accept();
			Assert.assertEquals(promptText.getText(), "You clicked OK. 'prompt' returned "+text, "display a TRUE confirm dialog when clicked");
			String screenshotPath = Base.captureScreenshot(this.driver, "PromptOK");
			Base.test.pass("Prompt dialog validated successfully", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		}else {
			Thread.sleep(2000);
			switchToAlertBox.dismiss();
			Assert.assertEquals(promptText.getText(), "You clicked Cancel. 'prompt' returned null", "display a FALSE confirm dialog when clicked");
			Base.test.pass("Prompt cancellation validated successfully");
		}
	}
}
