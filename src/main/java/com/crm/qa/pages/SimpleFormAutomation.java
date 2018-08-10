package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SimpleFormAutomation extends TestBase{

	@FindBy(xpath="//input[@type='text' and @id='user-message']")
	WebElement InputBox;
	
	@FindBy(xpath="//button[@type='button' and text()='Show Message']")
	WebElement ShowMessageButton;
	
	public void EnterMessage(String message) {
		InputBox.sendKeys(message);
	}
	
	public void ClickShowMessage() {
		ShowMessageButton.click();
	}
	
	public String ReadMessage() {
	String textMessage=	InputBox.getText();
	return textMessage;
	}
	
	public SimpleFormAutomation() {
		PageFactory.initElements(driver, this);
		
	}
}
