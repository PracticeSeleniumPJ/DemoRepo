package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MenuClass extends TestBase{
	
	@FindBy(xpath="//a[text()='Simple Form Demo']")
	WebElement SimpleFormDemo;
	
	@FindBy(linkText="Check Box Demo")
	WebElement CheckBoxDemo;

	//@FindBy(xpath="//a[text()='Check Box Demo' and @class='list-group-item']")
	//WebElement CheckBoxDemo;
	
	@FindBy(linkText="Radio Buttons Demo")
	WebElement RadioButtonsDemo;
	
	@FindBy(linkText="Select Dropdown List")
	WebElement SelectDropdownList;
	
	@FindBy(xpath="//a[text()='Javascript Alerts' and @class='list-group-item']']")
	WebElement JavascriptAlerts;
	
	@FindBy(xpath="//a[text()='Window Popup Modal' and @class='list-group-item']']']")
	WebElement WindowPopupModal;
	
	@FindBy(xpath="//a[text()='//a[text()='Bootstrap Alerts' and @class='list-group-item']")
	WebElement BootstrapAlerts;
	
	@FindBy(xpath="//a[text()='//a[text()='Bootstrap Modals' and @class='list-group-item']")
	WebElement BootstrapModals;
	
	public FirstPage ClickSimpleFormDemo1() {
		SimpleFormDemo.click();
		return new FirstPage();
	}
	public CheckFormDemo ClickCheckBoxDemo() {
		CheckBoxDemo.click();
		return new CheckFormDemo();
	}
	public RadioButtonDemo ClickRadioButtonsDemo() {
		RadioButtonsDemo.click();
		return new RadioButtonDemo();
	}
	public SelectDropdownList ClickSelectDropdownList() {
		SelectDropdownList.click();
		return new SelectDropdownList();
	}
	public JavaScriptAlerts ClickJavascriptAlerts() {
		JavascriptAlerts.click();
		return new JavaScriptAlerts();
	}
	public WindowPopupModal ClickWindowPopupModal() {
		WindowPopupModal.click();
		return new WindowPopupModal();
	}
	public BootStrapsAlerts ClickBootstrapAlerts() {
		BootstrapAlerts.click();
		return new BootStrapsAlerts();
	}
	public BootStrapModals ClickBootstrapModals() {
		BootstrapModals.click();
		return new BootStrapModals();
	}
	
	
	
	public MenuClass() {
		PageFactory.initElements(driver, this);
		
		
	}
	

}
