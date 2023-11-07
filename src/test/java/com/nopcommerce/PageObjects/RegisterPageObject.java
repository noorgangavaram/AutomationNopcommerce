package com.nopcommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageObject {
	
	WebDriver driver;
	
	public RegisterPageObject(WebDriver driver){
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// WEB-ELEMENTS

	@FindBy(className = "ico-register")
	WebElement RegisterBtn;
	
	@FindBy(id = "gender-male")
	WebElement Gender;
	
	@FindBy(name = "FirstName")
	WebElement firstName;
	
	@FindBy(name = "LastName")
	WebElement LastName;
	
	@FindBy(name="DateOfBirthDay")
	WebElement date;
	
	@FindBy(name="DateOfBirthMonth")
	WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	WebElement year;
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(name="ConfirmPassword")
	WebElement ConfirmPwd;
	
	@FindBy(name="register-button")
	WebElement submit;
	
	// ACTION METHODS
	
	public void clickRegisterBtn() {
		RegisterBtn.click();
	}
	
	public void clickGender() {
		Gender.click();
	}
	
	public void enterFirstName(String Fname) {
		firstName.sendKeys(Fname);
	}
	
	public void enterLastName(String Lname) {
		LastName.sendKeys(Lname);
	}
	
	public void Date() throws InterruptedException {
		Thread.sleep(5000);
		Select select = new Select(date);
		select.selectByIndex(5);
	}
	
	public void Month() throws InterruptedException {
		Thread.sleep(5000);
		Select select = new Select(month);
		select.selectByIndex(8);
	}
	
	public void Year() throws InterruptedException {
		Thread.sleep(5000);
		Select select = new Select(year);
		select.selectByIndex(6);
	}
	
	public void Email(String mail) {
		email.sendKeys(mail);
	}
	
	public void Password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void ConfirmPassword(String ConfiPwd) {
		ConfirmPwd.sendKeys(ConfiPwd);
	}
	
	public void Submit() {
		submit.click();
	}
}
