package com.nopcommerce.testCases;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.LoginPageObject;


public class TC_LoginTest_001 extends BaseCLASS
{
   
	@Test
    public void loginTest() throws InterruptedException {
		 
		LoginPageObject lp = new LoginPageObject(driver);
		lp.setusername(UserName);
		lp.setpassword(Password);
		lp.clickLogin();
		Thread.sleep(4000);
	
	}
	
	@Test
	public void logoutTestcase() {
		System.out.println("Logut test case");
	}
}
