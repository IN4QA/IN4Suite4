package com.RE.Sales.Communication.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Communication.Test.AdditionalWork_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class AdditionalWork_List extends AdditionalWork_List_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static String fromdate="01 Jan 2020";
	
	public AdditionalWork_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Additional Work']")
	private WebElement AdditionalWork;
	public void getAdditionalWork() {
		AdditionalWork.click();
	}
	@FindBy(name = "ddlProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(name = "dtFromDate$txtDate")
	private WebElement fdate;
	public WebElement getfdate() {
		return fdate;
	}
	
	@FindBy(name = "btnGo")
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
			sheet=xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	public void nofilter() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		AdditionalWorkList.getAdditionalWork();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		AdditionalWorkList.getGoButton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname, Sales.path);
		Thread.sleep(1000);
	}
	public void project() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		AdditionalWorkList.getAdditionalWork();		
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getfdate(), fromdate);
		Thread.sleep(1000);
		AdditionalWorkList.getGoButton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname, Sales.path);
		Thread.sleep(1000);
	}
}
