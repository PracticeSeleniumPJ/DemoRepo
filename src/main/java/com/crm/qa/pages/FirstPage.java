package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import junit.framework.Assert;

public class FirstPage extends TestBase{
	
	public String Actualmsg;
	@FindBy(xpath="//input[@id='user-message']")
	WebElement TestMessage;
	
	
	//@FindBy(linkText="Simple Form Demo")
	//WebElement SimpleFormDemoButton;
	
	@FindBy(xpath="//button[text()='Show Message']")
	WebElement btnShowMessage;
	
	@FindBy(xpath="//span[@id='display']")
	WebElement DisplayMsg;
	
	@FindBy(id="sum1")
	WebElement FirstInput;
	
	@FindBy(id="sum2")
	WebElement SecondInput;
	
	@FindBy(xpath="//button[@type='button' and text()='Get Total']")
	WebElement Calculate;
	
	@FindBy(xpath="//span[@id='displayvalue']")
	WebElement TotalValue;
	
	
	public void EnterMessage(String message) {
		TestMessage.clear();
		TestMessage.sendKeys(message);
	}
	
	/*public String ClickShowmEssage() {
		btnShowMessage.click();
		System.out.println("msg shown");
		Actualmsg=DisplayMsg.getText();
		return Actualmsg;
	}*/
	
	public void ClickShowmEssage(String message) {
		TestMessage.clear();
		TestMessage.sendKeys(message);
		btnShowMessage.click();
		System.out.println("msg shown");
		Actualmsg=DisplayMsg.getText();
		System.out.println(Actualmsg);
	}
	
	public void validateMessage(String Expctedmsg) {
		TestMessage.clear();
		TestMessage.sendKeys(Expctedmsg);
		btnShowMessage.click();
		System.out.println("msg shown");
		Actualmsg=DisplayMsg.getText();
		System.out.println(Actualmsg);
		Assert.assertEquals(Expctedmsg, Actualmsg);
		
		}
	
	public void TwoInputFieldEnterValues(String valone, String valtwo) {
		FirstInput.clear();
		FirstInput.sendKeys(String.valueOf(valone));
		SecondInput.clear();
		SecondInput.sendKeys(String.valueOf(valtwo));
		
	}
	
	public void TwoInputFieldsCalculate(String valone, String valtwo) {
		FirstInput.clear();
		FirstInput.sendKeys(String.valueOf(valone));
		SecondInput.clear();
		SecondInput.sendKeys(String.valueOf(valtwo));
		Calculate.click();
	}
	
	public void TwoInputFieldsVerifyTotal(String valone, String valtwo, String tot) {
		FirstInput.clear();
		FirstInput.sendKeys(String.valueOf(valone));
		SecondInput.clear();
		SecondInput.sendKeys(String.valueOf(valtwo));
		Calculate.click();
		String getvalue=TotalValue.getText();
		Assert.assertEquals(tot, getvalue);
	}
	
	
	public FirstPage() {
		PageFactory.initElements(driver, this);
		
	}

}
