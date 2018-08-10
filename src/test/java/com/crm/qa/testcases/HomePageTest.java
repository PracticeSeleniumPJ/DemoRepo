package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.MenuClass;

public class HomePageTest extends TestBase{
	HomePage hp;
	MenuClass MC;
	
	public HomePageTest() {
		super();
		
		
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		hp = new HomePage();
	}
	
	@Test(priority=1)
	public void StartTests() {
		hp.clickStartPracticing();
		
	}
	
	
	
	@AfterMethod()
		public void tearDown() {
		driver.quit();	
		}
	
}
