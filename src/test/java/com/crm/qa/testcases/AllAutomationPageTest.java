package com.crm.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AllAutomationPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.Utility;

public class AllAutomationPageTest extends TestBase {

	public AllAutomationPage AAP;
	public HomePage HP;
	Utility TU;
	
	public AllAutomationPageTest () {
		super();
	}
	
	@BeforeMethod
		public void setUp() throws InterruptedException {
		initialization();
		HP = new HomePage();
		AAP = HP.clickStartPracticing();
		TU= new Utility();
		System.out.println("clicked");
		Thread.sleep(5000);
		
		//AAP = new AllAutomationPage();
	}
	
	@Test(priority=2)
	public void clickStartDemo() {
		TU.ByPixel();
		AAP.clickSimpleFormDemo();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
