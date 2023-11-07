package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.AddProductShoppingPO;

public class TC_AddProductShopping_007 extends BaseCLASS{

	@Test
	public void ProductWishList() throws InterruptedException {
		AddProductShoppingPO productWishList = new AddProductShoppingPO(driver);
		productWishList.clickComputers();
		productWishList.clickNoteBooks();
		productWishList.ClickAsus();
		productWishList.ClickAddtoCart();
		productWishList.ClickShoppingCart();
	}
	
}
