package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.WishlistPageObject;

public class TC_WishList_005 extends BaseCLASS{
	
	@Test
	public void WishLIst() {
		WishlistPageObject Wishlist = new WishlistPageObject(driver);
		Wishlist.clickWishList();
	}

}
