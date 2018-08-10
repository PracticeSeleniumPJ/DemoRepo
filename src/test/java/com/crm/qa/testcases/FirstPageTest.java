package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AllAutomationPage;
import com.crm.qa.pages.FirstPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.Utility;

public class FirstPageTest extends TestBase{
	FirstPage firstpage;
	AllAutomationPage AAP;
	HomePage HP;
	Utility TU;
	public FirstPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		firstpage = new FirstPage();
		AAP = new AllAutomationPage();
		HP = new HomePage();
		TU = new Utility();
		AAP = HP.clickStartPracticing();
		
		TU.ByPixel();
			
//boolean flag=	firstpage.SimpleFormDemoButton.isDisplayed();
//System.out.println(flag);
			firstpage=AAP.clickSimpleFormDemo();
		//firstpage.clickSimpleFormDemo();
				
	}
	
	@Test(priority=1)
	public void SetMessage() {
		TU.ByPixel();
		firstpage.EnterMessage(prop.getProperty("message"));
		System.out.println("Message set succesfully");
		}
	
	/*@Test(priority=2)
	public String getMessage() {
		String ActualMsg= firstpage.ClickShowmEssage();
		System.out.println("Message got succesfully");
		System.out.println("ActualMsg");
		return ActualMsg;
	}*/
	
	@Test(priority=2)
	public void getMessage() {
		 firstpage.ClickShowmEssage(prop.getProperty("message"));
		
	}
	
	@Test(priority=3)
	public void validateMessage() {
		
		 firstpage.validateMessage(prop.getProperty("message"));
		 
		
	}
	
	@Test(priority=4)
	public void enterValues() {
		firstpage.TwoInputFieldEnterValues(prop.getProperty("value1"), prop.getProperty("value2"));
		
	}
	
	@Test(priority=5)
	public void CalculateTotal() {
		firstpage.TwoInputFieldsCalculate(prop.getProperty("value1"), prop.getProperty("value2"));
	}

	
	@Test(priority=6)
	public void VerifyTot() {
		firstpage.TwoInputFieldsVerifyTotal(prop.getProperty("value1"), prop.getProperty("value2"), prop.getProperty("tot"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
