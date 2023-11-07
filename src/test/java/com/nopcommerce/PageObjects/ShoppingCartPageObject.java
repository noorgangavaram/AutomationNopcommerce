package com.nopcommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPageObject {
	
	WebDriver driver;
	
	public ShoppingCartPageObject(WebDriver driver){
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WEBELEMENTS
	
	@FindBy(className ="cart-label")
	WebElement Cart;
	
	
	
	//ACTION METHODS
	
	public void clickCart() {
		Cart.click();
	}
}
