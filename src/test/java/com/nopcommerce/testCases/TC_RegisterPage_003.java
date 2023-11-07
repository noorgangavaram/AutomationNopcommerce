package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.RegisterPageObject;

public class TC_RegisterPage_003 extends BaseCLASS{
	
	@Test
	public void RegisterPage() throws InterruptedException {
		
		RegisterPageObject Register = new RegisterPageObject(driver);
		Register.clickRegisterBtn();
		Register.clickGender();
		Register.enterFirstName(FirstName);
		Register.enterLastName(LastName);
		Register.Date();
		Register.Month();
		Register.Year();
		Register.Email(Mail);
		Register.Password(Password1);
		Register.ConfirmPassword(ConfiPass);
		Register.Submit();
		
	}

}
