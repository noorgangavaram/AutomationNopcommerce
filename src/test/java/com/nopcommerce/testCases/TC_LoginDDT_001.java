package com.nopcommerce.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopcommerce.PageObjects.LoginPageObject;
import com.nopcommerce.utilities.XLUtility;

public class TC_LoginDDT_001 extends BaseCLASS {
	
	@Test(dataProvider = "Loginsource")
	public void LoginDDT(String user, String pwd) {
		
		LoginPageObject lp = new LoginPageObject(driver);
		lp.setusername(user);
		lp.setpassword(pwd);
		lp.clickLogin();
		
	}
	
	@DataProvider(name = "Loginsource")
	public String[][] getData() throws IOException {
		
		//Get the data from excel
		String path = "C:\\Users\\Admin\\eclipse-workspace\\AutomatingNopcommerce\\src\\test\\java\\com\\nopcommerce\\testData\\LoginTestData.xlsx";
		XLUtility xlutil = new XLUtility(path);
		
		int totalRows = xlutil.getRowCount("Sheet1");
		int totalCells = xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[totalRows][totalCells];
		
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<totalCells;j++)
			{
				loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
				
			}
		}
		return loginData;
	}
	
}
