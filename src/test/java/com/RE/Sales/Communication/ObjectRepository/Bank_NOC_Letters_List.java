package com.RE.Sales.Communication.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Communication.Test.Bank_NOC_Letters_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Bank_NOC_Letters_List extends Bank_NOC_Letters_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	
	public Bank_NOC_Letters_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Bank NOC Letters']")
	private WebElement BankNOCLetters;
	public void getBankNOCLetters() {
		BankNOCLetters.click();
	}
	
	@FindBy(name = "ddlProjectList")
	public WebElement project;
	private WebElement getproject() {
		return project;
	}
	
	@FindBy(id = "ddlSubProjectList")
	public WebElement subproject;
	private WebElement getsubproject() {
		return subproject;
	}
	@FindBy(name = "btnSearch")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickCommunication();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void projectwithsubproject() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		BankNOCLettersList.getBankNOCLetters();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getsubproject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		BankNOCLettersList.getGoButton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname, Sales.path);
		Thread.sleep(1000);
	}
}
