package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.NewsPagePO;

public class TC_NewsPage_008 extends BaseCLASS{

	@Test
	public void newsPage() throws InterruptedException {
		NewsPagePO news = new NewsPagePO(driver);
		news.ClickNews();
		news.readmore();
		news.enterTitle(title);
		news.enterComment(comment);
		news.ClickAddComment();
	}
	
}
