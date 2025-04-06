package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukuriPageObject {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public NaukuriPageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="login_Layer")	WebElement	login; 
	@FindBy(xpath="//*[contains(@placeholder,\"Username\")]")	WebElement	username;
	@FindBy(xpath="//*[contains(@placeholder,\"password\")]")	WebElement	password;
	@FindBy(xpath="//button[text()=\"Login\"]")	WebElement	login_btn;
	@FindBy(xpath="//div[contains(@class,\"server-err\")]")	WebElement	alert_msg;
	@FindBy(xpath="//img[@alt=\"Naukri Logo\"][1]")	WebElement	logo;
	@FindBy(partialLinkText="Complete")	WebElement	view_profile_button; 
	@FindBy(xpath="//*[@id=\"_nj1mrmev4Navbar\"]/div")	WebElement	chat_close;
	@FindBy(xpath="//div[@id='result']/../input")	WebElement update_link;
	@FindBy(xpath="//div[contains(@class,\"resume-name\")]/div") WebElement resume_name;
	
	public void selectLogin()
	{
		login.click();
	}
	public void enterCredentials(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
	}
	public void selectLoginButton()
	{
		login_btn.click();
	}
	
	public void clickViewProfile()
	{
		view_profile_button.click();
	}
	public void clickUpdateLink() throws InterruptedException
	{
		Thread.sleep(5000);
		update_link.click();
		Thread.sleep(5000);
	}
	public void uploadResume() throws InterruptedException
	{
		Thread.sleep(5000);
		//js.executeScript("document.getElementByID(update_link)).value = 'E:\\Automation_pipeline\\ProfileUpdateInNaukri\\src\\main\\resources\\resume\\Dinesh_CV0325.pdf'");
		update_link.sendKeys("E:\\Automation_pipeline\\ProfileUpdateInNaukri\\src\\main\\resources\\resume\\Dinesh_CV0325.pdf");
		Thread.sleep(5000);
	}
	public String validateResumeName()
	{
		String name=resume_name.getText();
		return name;
	}
}
