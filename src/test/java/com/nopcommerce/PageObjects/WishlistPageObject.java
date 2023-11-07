package com.nopcommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPageObject {
	
	WebDriver driver;
	
	public WishlistPageObject(WebDriver driver){
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WEBELEMENTS
	@FindBy(className ="wishlist-label")
	WebElement Wishlist;
	
	
	
	//ACTION MEHTODS
	
	public void clickWishList() {
		Wishlist.click();
	}

}
