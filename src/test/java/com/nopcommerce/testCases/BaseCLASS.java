package com.nopcommerce.testCases;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.nopcommerce.utilities.ReadConfig;

public class BaseCLASS {

	ReadConfig readconfig = new ReadConfig(); // Creating object for ReadConfig.java class 
	
	//We have to call all methods present in the ReadConfig.Java
	public String URL = readconfig.getApplicationURl();
	public String UserName = readconfig.getUSername();
	public String Password = readconfig.getPassword();
	public String ItemName = readconfig.getItem();
	public String FirstName = readconfig.getFirstName();
	public String LastName = readconfig.getLastName();
	public String Mail = readconfig.getEmail();
	public String Password1 = readconfig.getPassword1();
	public String ConfiPass = readconfig.getConfirmPassword();
	public String title = readconfig.getTitle();
	public String comment = readconfig.getComment();
	
	
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String Browse) {
		if(Browse.equals("firefox")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getFirefoxPath());
        driver = new FirefoxDriver();
		}else {
			System.out.println("Browser name is not correct");
		}
		driver.get(URL);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	
}
