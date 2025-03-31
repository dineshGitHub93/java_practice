package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageForParallel {
	
	WebDriver driver;
	
	public LoginPageForParallel(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath ="//button[contains(@class,'oxd-button oxd-button')]")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//img[@alt='client brand banner']")
	private WebElement dashboard;

	public void setUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void setpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	
	public boolean homePageVerification() {
		return dashboard.isDisplayed();
	}
}
