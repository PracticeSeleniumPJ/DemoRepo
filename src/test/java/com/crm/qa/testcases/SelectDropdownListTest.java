package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.MenuClass;
import com.crm.qa.pages.SelectDropdownList;
import com.crm.qa.util.Utility;

public class SelectDropdownListTest extends TestBase {
		
	public SelectDropdownList sdl;
	public MenuClassTest MCT;
	public HomePage hp;
	public MenuClass MC;
	public Utility TU;
	
	public SelectDropdownListTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		hp = new HomePage();
		MC = new MenuClass();
		sdl = new SelectDropdownList();
		MCT = new MenuClassTest();
		TU = new Utility();
		hp.clickStartPracticing();
		MC.ClickSelectDropdownList();
		System.out.println("clicked");
		TU.ByPixel();
		
				
		}
	
	@Test
	public void selectValuesFromSingle() {
		System.out.println("in the test");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdl.chooseValueOne();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	
}
