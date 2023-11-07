package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.BlogPO;

public class TC_Blog_009 extends BaseCLASS{

	@Test
	public void blog() {
		BlogPO blogpo = new BlogPO(driver);
		blogpo.ClickBlog();
	}
	
}
