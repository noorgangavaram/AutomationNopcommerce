package com.nopcommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObject {
	
	WebDriver driver;
	
	public SearchPageObject(WebDriver driver){
		driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="small-searchterms")
	WebElement searchBox;
	
	@FindBy(className ="search-box-button")
	WebElement SearchIcon;
	
	public void enterItemName(String iteam) {
		searchBox.sendKeys(iteam);
	}
	
	public void clickSearchIcon() {
		SearchIcon.click();
	}
}
