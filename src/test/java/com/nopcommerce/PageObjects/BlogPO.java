package com.nopcommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPO {

	WebDriver driver;
	public BlogPO(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Blog\"]")
	WebElement Blog;
	
	
	
	public void ClickBlog() {
		Blog.click();
	}
	
}
