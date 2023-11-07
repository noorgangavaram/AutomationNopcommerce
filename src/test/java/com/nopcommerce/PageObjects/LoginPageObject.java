package com.nopcommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {


	WebDriver Localdriver; // This is object for Webdriver
	
	// This is Constructor
	public LoginPageObject(WebDriver Remotedriver){
		Localdriver = Remotedriver;
		PageFactory.initElements(Remotedriver, this);
	}
	
	@FindBy(name = "Email")
	WebElement Username;
	
	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(className="login-button")
	WebElement submit;
	
	
	
	public void setusername(String uname) {
		Username.sendKeys(uname);
	}
	
	public void setpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		submit.click();
	}
	
}
