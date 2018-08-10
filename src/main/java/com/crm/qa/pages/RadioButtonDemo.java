package com.crm.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RadioButtonDemo extends TestBase{
	
	

	@FindBy(xpath="//input[@type='radio' and @value='Male' and @name='optradio']")
	WebElement btnRadioMale;
	
	@FindBy(xpath="//input[@type='radio' and @value='Female' and @name='optradio']")
	WebElement btnRadioFemale;
	
	@FindBy(xpath="//button[@type='button' and text()='Get Checked value']")
	WebElement btnGetChckedValue;
	
	@FindBy(xpath="//button[@type='button' and text()='Get values']")
	WebElement btnGrpGetChckedValue;
	
	@FindBy(xpath="//p[@class='radiobutton']")
	WebElement TextbelowBtn;
	
	@FindBy(xpath="//p[@class='groupradiobutton']")
	List <WebElement> TextbelowGrpBtn;
	

	@FindBy(xpath="//h4[text()='Sex : ']")
	List <WebElement> RadioSelection;;
	
	@FindBy(xpath="//p[@class='groupradiobutton' and text()='Sex : ']")
	WebElement TextbelowGrpBtnSex;
	
	@FindBy(xpath="//p[@class='groupradiobutton' and text()=' Age group: ']")
	WebElement TextbelowGrpBtnAgeGrp;
	
	@FindBy(xpath="//h4[text()='Sex : ']")
	List<WebElement> GrpRadioBtnSex;
	
	@FindBy(xpath="//h4[text()='Age Group : ']")
	List <WebElement> GrpRadioBtnAgeGrp;
	
	public String[][] readExcel(String filepath, String filename, String sheetName) throws IOException {
		String[][] arrayExcelData = null;
		File file = new File("C:\\Users\\priya\\Desktop\\Automation\\input.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = null;
		String fileext=filename.substring(filename.indexOf("."));
		
		if(fileext.equals(".xlsx"))
		{
			wb = new XSSFWorkbook(fis);
		}
		else if(fileext.equals(".xls")) {
			wb = new HSSFWorkbook(fis);
		}
		
		
		Sheet worksheet = wb.getSheet(sheetName);
		int rowcount = worksheet.getLastRowNum()-worksheet.getFirstRowNum();
		
		for(int i=1;i<rowcount+1;i++) {
			Row row = worksheet.getRow(i);
			for(int j=0;j< row.getLastCellNum();j++) {
				System.out.println(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
		return arrayExcelData;
		
	}
	
	
	public void selectMaleRadioBtn() {
		btnRadioMale.click();
	}
	
	public void selectFemaleRadioBtn() {
		btnRadioFemale.click();
	}
	
	public void clickGetChckedValue() {
		btnGetChckedValue.click();
	}
	
	public void clickGrpGetChckedValue() {
		btnGrpGetChckedValue.click();
	}
	
	
	public String getTextoftxtbox() {
		return TextbelowBtn.getText();
	}
	
	/*public String getTextofgrptxtbox() {
		return TextbelowGrpBtn.getText();
	}*/
	
	public void selectRadioBtn() {
		
		for(int i=0;i<GrpRadioBtnSex.size();i++)
		{
			GrpRadioBtnSex.get(i).click();
		}
		
		for(int i=0;i<GrpRadioBtnAgeGrp.size();i++) {
			GrpRadioBtnAgeGrp.get(i).click();
		}
		
	}
	
	public String getTextofgrptxtboxSex() {
		return TextbelowGrpBtnSex.getText();
	}
	
	public String getTextofgrptxtboxAgeGrp() {
		
		return TextbelowGrpBtnAgeGrp.getText();
	}
	
	public void selectany() {
	System.out.println(RadioSelection.get(0).toString());
		
	}
	public void selectMaleFromSexRBtn() {
	for(int i=0;i<GrpRadioBtnSex.size();i++) {
		GrpRadioBtnSex.get(i).click();
		
	}
	}
	
	public RadioButtonDemo(){
		PageFactory.initElements(driver, this);
		
	}
	
}
