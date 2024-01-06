package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.ContactUsPO;

public class TC_ContactUs_010 extends BaseCLASS{
	
	@Test
	public void ContactTest() throws InterruptedException {
	
		ContactUsPO contactPo = new ContactUsPO(driver);
		contactPo.clickContactUs();
		contactPo.enterName(name);
		contactPo.enterEmail(email);
		contactPo.enterQuery(enquery);
		contactPo.clickSubmit();
		Thread.sleep(3000);
	}

}
