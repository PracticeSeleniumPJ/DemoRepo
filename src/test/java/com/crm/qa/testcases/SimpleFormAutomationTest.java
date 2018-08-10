package com.crm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

import junit.framework.Assert;

public class SimpleFormAutomationTest extends TestBase {

public SimpleFormAutomationTest() {
	super();
	}

	@BeforeMethod()
	public void setUp(){
		initialization();
	}
	
	@Test(priority=1)
	public void ExecuteFirstFormTest() {
		BFF.EnterMessage(prop.getProperty("message"));
		System.out.println("test2 executed");
			}
	
	
	@Test(priority=2)
	public void ExecuteFirstFormTest1() {
		 messageRead=BFF.ReadMessage();
		 System.out.println("test3 executed");
	}
	
	@Test(priority=3)
	public void ExecuteFirstFormTest2() {
		BFF.ClickShowMessage();
		Assert.assertEquals(prop.getProperty("message"), messageRead);
		System.out.println("test4 executed");
	}
	
	@AfterTest()
	public void tearDown() {
		driver.close();
	}
	
}
