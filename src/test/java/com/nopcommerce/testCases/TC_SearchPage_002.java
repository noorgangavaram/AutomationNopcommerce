package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.SearchPageObject;

import org.openqa.selenium.WebDriver;


public class TC_SearchPage_002 extends BaseCLASS{

	@Test
	public void SearchPage() {
		
		SearchPageObject searchPO = new SearchPageObject(driver);
		searchPO.enterItemName(ItemName);
		searchPO.clickSearchIcon();
	}
	
}
