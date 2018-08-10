package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.Utility;

public class AllAutomationPage extends TestBase {

	
	//@FindBy(xpath="//a[text()='Simple Form Demo' and @class='list-group-item']")
	//WebElement SimpleFormDemoButton;
	
	@FindBy(linkText="Simple Form Demo")
		WebElement SimpleFormDemoButton;
	
	
	public FirstPage clickSimpleFormDemo() {
		
		SimpleFormDemoButton.click();
		
		System.out.println("clicked simpleformdemo");
		return new FirstPage();
		}
	public AllAutomationPage() {
		PageFactory.initElements(driver, this);
	}
}
