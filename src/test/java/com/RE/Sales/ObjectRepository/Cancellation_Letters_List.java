package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Cancellation_Letters_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Cancellation_Letters_List extends Cancellation_Letters_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	
	public Cancellation_Letters_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Cancellation Letters']")
	private WebElement cancellationletters;
	public void getcancellationletters() {
		cancellationletters.click();
	}
	
	@FindBy(name = "ddlProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(name = "ddlSubProjectList")
	private WebElement subproject;
	public WebElement getsubproject() {
		return subproject;
	}
	
	@FindBy(id = "ddlFileStatus")
	private WebElement FileStatus;
	public WebElement getfilestatus() {
		return FileStatus;
	}
	
	@FindBy(name = "btnListSearch")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickBilling();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void mandatory() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		cancellationletterslist.getcancellationletters();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getsubproject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		cancellationletterslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
		
	}

	public void filestatus() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		cancellationletterslist.getcancellationletters();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getsubproject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getfilestatus(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		cancellationletterslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
		
	}
	
}

