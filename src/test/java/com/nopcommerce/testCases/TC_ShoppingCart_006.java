package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.ShoppingCartPageObject;

public class TC_ShoppingCart_006 extends BaseCLASS{

	@Test
	public void ShoppingCart() {
		ShoppingCartPageObject cart = new ShoppingCartPageObject(driver);
		cart.clickCart();
	}
	
}
