package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;



public class CheckFormDemo extends TestBase {
	public String chktobeselect="Option 3";
	
	@FindBy(xpath="//input[@id='isAgeSelected']")
			WebElement chkbox_isselected;
	
	@FindBy(xpath="//div[@id='txtAge' and text()='Success - Check box is checked']")
	WebElement SuccessText;
	
	@FindBy(xpath="//input[@type='checkbox' and @class='cb1-element']")
	List<WebElement> chkboxlist;
	
	@FindBy(xpath="//input[@value='Check All']")
	WebElement btnCheckAll;
	
	@FindBy(xpath="//input[@value='Uncheck All']")
	WebElement btnUncheckAll;
	
	public void clickSinglechkbox() {
		chkbox_isselected.click();
	
	}
	
	public void validateMessage(String messageSecondPage) {
	String text=	SuccessText.getText();
	Assert.assertEquals(messageSecondPage, text);
	}
	
	public void clickFromMultiplechkbox() {
		for(int i=0;i<chkboxlist.size();i++) {
			if(chkboxlist.get(i).getAttribute("value").equalsIgnoreCase(chktobeselect)) {
				chkboxlist.get(i).click();
			}
		}
		}
	
	
	public void checkStatusOfSelectedChckbox() {
		int flagselected=0;
	//	int flagunselected=0;
		for(int i=0;i<chkboxlist.size();i++) {
			if(chkboxlist.get(i).isSelected()) {
				flagselected++;
			
				System.out.println(i + "th chkbox is checked");
			}
		}
		System.out.println(flagselected);
	
		if(flagselected==chkboxlist.size()+1) {
			System.out.println("all are checked");
			
		}
		
		}
	
	public void checkStatusOfUnselectedChckbox() {
		int flagselected=0;
		int flagunselected=0;
		for(int i=0;i<chkboxlist.size();i++) {
			if(chkboxlist.get(i).isSelected()) {
				flagselected++;
			}
			else
				flagunselected++;
				System.out.println(i + "th chkbox is unchecked");
		}
		System.out.println(flagunselected);
		if(flagunselected==chkboxlist.size()+1) {
			System.out.println("all are unchecked");
			
		}
		
	}
	
	
	public void verifyUncheckAll()
	{
		/*for(int i=0;i<4;i++)
		{*/
System.out.println("value of list" +chkboxlist.size());
		//}
		
	}
	
	
	public void ClickCheckAll() {
		btnCheckAll.click();
		
	}
	
	public void ClickUncheckAll() {
		btnUncheckAll.click();
	}
	
	public CheckFormDemo () {
		PageFactory.initElements(driver, this);
	}
			

}
