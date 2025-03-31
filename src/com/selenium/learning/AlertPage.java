package com.selenium.learning;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class AlertPage {
	
	WebDriver driver;
	String baseURL = "https://testpages.herokuapp.com/styled/alerts/alert-test.html";
	
	public AlertPage(WebDriver driver){
		this.driver = driver;
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
		alertBtnWithOk.click();
		Alert switchToAlertBox = driver.switchTo().alert();
		String alertText = switchToAlertBox.getText();
		Thread.sleep(2000);
		assertEquals("I am an alert box!", alertText, "Alert text matched");
		Thread.sleep(2000);
		switchToAlertBox.accept();
	}

	public void showAlertBoxWithConfirmation(boolean clickAction) throws InterruptedException {
		alertBtnWithConfirmation.click();
		Alert switchToAlertBox = driver.switchTo().alert();
		String alertText = switchToAlertBox.getText();
		assertEquals("I am a confirm alert", alertText, "I am a confirm alert");
		Thread.sleep(2000);
		if(clickAction) {
			switchToAlertBox.accept();
			Assert.assertEquals(confirmationText.getText(), "You clicked OK, confirm returned "+clickAction+".", "display a TRUE confirm dialog when clicked");
		}else {
			Thread.sleep(2000);
			switchToAlertBox.dismiss();
			Assert.assertEquals(confirmationText.getText(), "You clicked Cancel, confirm returned "+clickAction+".", "display a FALSE confirm dialog when clicked");
		}
	}
	
	public void showAlertBoxWithPrompt(boolean clickAction, String text) throws InterruptedException {
		alertBtnWithPrompt.click();
		Alert switchToAlertBox = driver.switchTo().alert();
		String alertText = switchToAlertBox.getText();
		assertEquals(alertText, "I prompt you", "I am a confirm alert");
		Thread.sleep(2000);
		if(clickAction) {
			switchToAlertBox.sendKeys(text);
			switchToAlertBox.accept();
			Assert.assertEquals(promptText.getText(), "You clicked OK. 'prompt' returned "+text, "display a TRUE confirm dialog when clicked");
		}else {
			Thread.sleep(2000);
			switchToAlertBox.dismiss();
			Assert.assertEquals(promptText.getText(), "You clicked Cancel. 'prompt' returned null", "display a FALSE confirm dialog when clicked");
		}
	}
}
