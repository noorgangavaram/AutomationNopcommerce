package com.nopcommerce.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath = "C:\\Users\\Admin\\eclipse-workspace\\AutomatingNopcommerce\\src\\test\\java\\com\\nopcommerce\\testData\\LoginTestData.xlsx";
		
		FileInputStream InputStream = new FileInputStream(excelFilePath);

		//now we need to get workbook
		XSSFWorkbook workbook = new XSSFWorkbook(InputStream);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");  //XSSFSheet sheet = workbook.getSheeAT(0); 
		
		//Reading data have 2 methods
		//Method 1 = Using For Loop  // Method 2 Using Iterator
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=rows;r++) // THis is for row
		{
			XSSFRow row = sheet.getRow(r); //First we need to get row
			
			for(int c=0;c<columns;c++) // This represent the cells in a each row
			{
				XSSFCell cell = row.getCell(c);
				//cell.getCellType();  //This return the data type int, string
				
				switch(cell.getCellType())
				{
				case STRING :
					System.out.print(cell.getStringCellValue());
				    break;
				case NUMERIC :
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
	

}
