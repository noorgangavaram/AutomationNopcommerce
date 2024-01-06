package com.nopcommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPO {
	
	WebDriver driver;
	
	public ContactUsPO(WebDriver driver){
		driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()=\"Contact us\"]")
	WebElement ContactUs;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your name.\"]")
	WebElement name;
	
	@FindBy(xpath= "//input[@placeholder=\"Enter your email address.\"]")
	WebElement email;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Enter your enquiry.\"]")
	WebElement enquire;
	
	@FindBy(xpath = "//button[@name=\"send-email\"]")
	WebElement submit;
	
	
	public void clickContactUs() throws InterruptedException {
		Thread.sleep(3000);
		ContactUs.click();
	}
	
	public void enterName(String ContactName) {
		name.sendKeys(ContactName);
	}
	
	public void enterEmail(String ContactEmail) {
		email.sendKeys(ContactEmail);
	}
	
	public void enterQuery(String ContactQuery) {
		enquire.sendKeys(ContactQuery);
	}
	
	public void clickSubmit() {
		submit.click();
	}
}
