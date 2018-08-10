package com.crm.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.MenuClass;
import com.crm.qa.pages.RadioButtonDemo;
import com.crm.qa.util.Utility;



public class RadioButtonDemoTest extends TestBase {
	
	public RadioButtonDemo RBD;
	public HomePage hp;
	public MenuClass MC;
	public Utility TU;
	
	public RadioButtonDemoTest() {
		super();
	}
	
	
	
	
	
	@BeforeMethod
	public void SetUp() throws FileNotFoundException {
		initialization();
		
		RBD = new RadioButtonDemo();
		hp = new HomePage();
		MC = new MenuClass();
		hp.clickStartPracticing();
		MC.ClickRadioButtonsDemo();
		TU = new Utility();
		
		TU.ByPixel();
		
		
	}
	
	
	
	
	
	
	@Test(priority=1, enabled=false)
	public void TC1() {	//TestCase for 1st section 2 radion buttons, select none
		String expectedmsg = prop.getProperty("RBDTextNoneChecked");
		RBD.clickGetChckedValue();
		String actualmsg = RBD.getTextoftxtbox();
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	
	@Test(priority=2, enabled=false)
	public void TC2() {	//TestCase for 1st section 2 radion buttons, select 1st
		String expectedmsg = prop.getProperty("RBDTextMaleChecked");
		RBD.selectMaleRadioBtn();
		RBD.clickGetChckedValue();
		String actualmsg = RBD.getTextoftxtbox();
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	
	@Test(priority=3)
	public void TC3() {	//TestCase for 1st section 2 radion buttons, select 2nd
		String expectedmsg = prop.getProperty("RBDTextFemaleChecked");
		RBD.selectFemaleRadioBtn();
		RBD.clickGetChckedValue();
		String actualmsg = RBD.getTextoftxtbox();
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	
	@Test(priority=4)
	public void TC4() {
		RBD.clickGrpGetChckedValue();
		RBD.getTextofgrptxtboxSex();
		RBD.getTextofgrptxtboxAgeGrp();
	}
	
	/*@Test(priority=5)
	public void TC5() { //
		RBD.clickGrpGetChckedValue();
		String expectedgrptxtboxSex="Sex :
									Age group:";
		//String expectedgrptxtboxAgeGrp=" Age group: ";
		String actualgrptxtboxSex = RBD.getTextofgrptxtboxSex();
		Assert.assertEquals(expectedgrptxtboxSex, actualgrptxtboxSex);
		//String actualgrptxtboxAgeGrp = RBD.getTextofgrptxtboxAgeGrp();
		//Assert.assertEquals(expectedgrptxtboxAgeGrp, actualgrptxtboxAgeGrp);
	}*/
	
	@Test(priority=5)
	public void TestCase1() throws IOException {
		// String filePath = System.getProperty("user.dir")+"\\Users\\priya\\Desktop\\Automation";
		//RBD.readExcel(filePath, "Input.xlsx", "Sheet1");
		RBD.selectany();
		
		 
		 }
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
