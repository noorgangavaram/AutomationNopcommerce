package com.nopcommerce.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPagePO {
	
	WebDriver driver;
	
	public NewsPagePO(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//WEBELEMENTS
	@FindBy(xpath= "//a[text()=\"News\"]")
	WebElement News;
	
	@FindBy(xpath="(//a[@class=\"read-more\"])[1]")
	WebElement ReadMore;
	
	@FindBy(className = "enter-comment-title")
	WebElement TitleText;
	
	@FindBy(className ="enter-comment-text")
	WebElement CommentText;
	
	@FindBy(name="add-comment")
	WebElement addComment;
	
	//ACTION METHODS
	public void ClickNews() {
		News.click();
	}

	public void readmore() {
		ReadMore.click();
	}

	public void enterTitle(String Title) {
		TitleText.sendKeys(Title);
	}
	
	public void enterComment(String Comment) {
		CommentText.sendKeys(Comment);
	}
	
	public void ClickAddComment() {
		addComment.click();
	}
}
