package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath= "//a[@id='btn_basic_example']")
	WebElement StartPracticingButton;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public AllAutomationPage clickStartPracticing() {
		StartPracticingButton.click();
		return new AllAutomationPage();
	}
	
	
	
}
