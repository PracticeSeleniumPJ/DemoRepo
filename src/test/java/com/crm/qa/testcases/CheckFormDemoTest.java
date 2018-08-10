package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CheckFormDemo;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.MenuClass;
import com.crm.qa.util.Utility;

import junit.framework.Assert;


public class CheckFormDemoTest extends TestBase{

	public CheckFormDemo CFD;
	public HomePage hp;
	MenuClass MC;
	Utility TU;
	
	public CheckFormDemoTest() {
		super();
		
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		CFD = new CheckFormDemo();
		hp = new HomePage();
		MC= new MenuClass();
		hp.clickStartPracticing();
		System.out.println("clicked");
		MC.ClickCheckBoxDemo();
		TU = new Utility();
		
		TU.ByPixel();
	}
	
	@Test(priority=1)
	public void ClickSingleCheckbox() throws InterruptedException {
		System.out.println("entered 1st tc");
		TU.ByPixel();
		CFD.clickSinglechkbox();
	Thread.sleep(30);
		CFD.validateMessage(prop.getProperty("SecondPageSuccessMessage"));
		
		//Assert.assertEquals(expected, actual);
		
	}
	
	@Test(priority=2)
	public void clickbtnCheckAll() {
		System.out.println("entered 2nd tc");
		CFD.ClickCheckAll();
		CFD.checkStatusOfSelectedChckbox();
		
		
		
	}
	
	@Test(priority=3)
	public void clickbtnUncheckAll() {
		System.out.println("entered 3rd tc");
		CFD.ClickCheckAll();
		CFD.ClickUncheckAll();
		CFD.verifyUncheckAll();
		CFD.checkStatusOfUnselectedChckbox();
	}
	
	
	/*@Test
	public void clickCheckAllButton() {
		
	}*/
	
	@AfterMethod
	public void tearDown() {
	driver.close();	
	}
	
}

