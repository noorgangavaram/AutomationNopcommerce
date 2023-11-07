package com.nopcommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPO {
	
	WebDriver driver;
	
	public SelectProductPO(WebDriver driver){
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WEBELEMENTS
	
	@FindBy(xpath = "(//a)[6]")
	WebElement Computers;
	
	//WebElement NoteBooks = driver.findElement(By.xpath("(//a[@href=\"/notebooks\"])[4]"));
	
	@FindBy(xpath = "(//a[@title=\"Show products in category Notebooks\"])[1]")
	WebElement NoteBooks;
	
	@FindBy(xpath = "(//a[@title=\"Show details for Asus N551JK-XO076H Laptop\"])")
	WebElement AppleLaptop;

	
	//ACTION METHODS
	
	public void clickComputers() throws InterruptedException {
		Thread.sleep(5000);
		Computers.click();
	}
	
	public void clickNoteBooks() throws InterruptedException {
		Thread.sleep(5000);
		NoteBooks.click();
	}
	
	public void ClickApple() throws InterruptedException {
		Thread.sleep(6000);
		AppleLaptop.click();
	}
	
	
}
