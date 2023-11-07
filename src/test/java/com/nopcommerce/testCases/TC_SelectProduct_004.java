package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.SelectProductPO;

public class TC_SelectProduct_004 extends BaseCLASS{
	
	@Test
	public void SelectProduct() throws InterruptedException {
		SelectProductPO  product = new SelectProductPO(driver);
		product.clickComputers();
		product.clickNoteBooks();
		product.ClickApple();
	}

}
