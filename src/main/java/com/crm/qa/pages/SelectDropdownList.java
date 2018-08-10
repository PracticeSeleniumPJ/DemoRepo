package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

import junit.framework.Assert;

public class SelectDropdownList extends TestBase{

	
	@FindBy(xpath="//select[@id='select-demo' and @class='form-control']")
	public	WebElement WebListSingleSelect;
	
	@FindBy(xpath="//select[@name='States']")
public WebElement WebListMultiplSelect;
	
	public SelectDropdownList chooseValueOne() {
		System.out.println("enetered choose method");
		System.out.println("enetered choose method1");
		//WebListSingleSelect.click();
		System.out.println("enetered choose method1");
		Select a = new Select(WebListSingleSelect);
		
		a.selectByVisibleText("Sunday");
		return new SelectDropdownList();
		
		//WebElement ActualValue = select1.getFirstSelectedOption();
		//System.out.println(ActualValue);
		//Assert.assertEquals(ExpValue, ActualValue);
	}
	
	public void SelectDropdownList() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
