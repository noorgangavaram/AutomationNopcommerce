package com.nopcommerce.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

public class XLUtility {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path = null;
	
    public XLUtility(String path){
    	this.path = path;
    }
    
    public int getRowCount(String sheetName) throws IOException {
    	fi = new FileInputStream(path);
    	workbook = new XSSFWorkbook(fi);
    	sheet = workbook.getSheet(sheetName);
    	int rowcount = sheet.getLastRowNum();
    	workbook.close();
    	fi.close();
    	return rowcount;
    }
    
    //we have pass sheetname and row number this will return the no.of cells present in that
    public int getCellCount(String sheetName,int rownum) throws IOException {
    	fi = new FileInputStream(path);
    	workbook = new XSSFWorkbook(fi);
    	sheet = workbook.getSheet(sheetName);
    	row = sheet.getRow(rownum);
    	int cellCount = row.getLastCellNum();
    	workbook.close();
    	fi.close();
    	return cellCount;
    }
    
    public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
    	fi = new FileInputStream(path);
    	workbook = new XSSFWorkbook(fi);
    	sheet = workbook.getSheet(sheetName);
    	row = sheet.getRow(rownum);
    	cell = row.getCell(colnum);
    	
    	//Excel have diff kind of data to neglete that we use this class
    	DataFormatter formatter = new DataFormatter();
    	String data;
    	try {
    		data = formatter.formatCellValue(cell); //This method will return data in the cell as string
    	}
    	catch(Exception e) {
    		data = " ";
    	}
    	workbook.close();
    	fi.close();
    	return data;
    }
    
    public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {
    	fi = new FileInputStream(path);
    	workbook = new XSSFWorkbook(fi);
    	sheet = workbook.getSheet(sheetName);
    	
    	row = sheet.getRow(rownum);
    	cell = row.getCell(colnum);
    	
    	style = workbook.createCellStyle();
    	
    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	
    	cell.setCellStyle(style);
    	workbook.write(fo);
    	workbook.close();
    	fi.close();
    	fo.close();
    }
    
    public void fillRedColor(String sheetName, int rownum, int colnum) throws IOException {
    	fi = new FileInputStream(path);
    	workbook = new XSSFWorkbook(fi);
    	sheet = workbook.getSheet(sheetName);
    	
    	row = sheet.getRow(rownum);
    	cell = row.getCell(colnum);
    	
    	style = workbook.createCellStyle();
    	
    	style.setFillForegroundColor(IndexedColors.RED.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	
    	cell.setCellStyle(style);
    	workbook.write(fo);
    	workbook.close();
    	fi.close();
    	fo.close();
    }
}
