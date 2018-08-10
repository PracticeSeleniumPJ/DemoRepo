package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.qa.base.TestBase;

public class Utility extends TestBase{
	
	public static Workbook book;
	public static Sheet sheet;
	
	public static long PAGELOAD_TIMEOUT=60;
	public static long IMPLICITWAIT_TIMEOUT=40;
	
	public static String TESTDATA_SHEET_PATH= "C:\\Users\\priya\\eclipse-workspace\\newproject\\src\\main\\java\\com\\crm\\qa\\Resources\\Input.xlsx";
public void ByPixel() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,2000)");
		 System.out.println("scrolled");
	}

public static Object[][] getTestData(String sheetName) {
	FileInputStream fis = null;
	
	try {
		fis = new FileInputStream(TESTDATA_SHEET_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		book = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	sheet = book.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	for(int i=0;i<sheet.getLastRowNum();i++) {
		for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
			data[i][k]= sheet.getRow(i+1).getCell(k).toString();
			
		}
	}
	return data;
}
}
