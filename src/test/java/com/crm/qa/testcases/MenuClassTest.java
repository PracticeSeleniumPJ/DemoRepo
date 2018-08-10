package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.MenuClass;

public class MenuClassTest extends TestBase {

	public MenuClass MC;
	public MenuClassTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		MC = new MenuClass();
		
	}
	
	@Test
	public void clickSFD() {
		MC.ClickSimpleFormDemo1();
	}
	
	@Test
	public void clickCBD() {
		MC.ClickCheckBoxDemo();
	}
	
	@Test
	public void clickRBD() {
		MC.ClickRadioButtonsDemo();
	}
	
	@Test
	public void clickSDL() {
		MC.ClickSelectDropdownList();
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
