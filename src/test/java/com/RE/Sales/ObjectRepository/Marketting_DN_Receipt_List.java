package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Marketting_DN_Receipt_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Marketting_DN_Receipt_List extends Marketting_DN_Receipt_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public Marketting_DN_Receipt_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Debit Note Receipt']")
	private WebElement DNReceipt;
	public void getDNReceipt() {
		DNReceipt.click();
	}
	
	@FindBy(id = "ddlCompany")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
	
	@FindBy(name = "ddlProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(name = "btnSearch")
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
			en.clickMerketing();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void PayCompany() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		DNReceiptlist.getDNReceipt();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getcompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		DNReceiptlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}
	
	public void projectDD() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		DNReceiptlist.getDNReceipt();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getproject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		DNReceiptlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}
}
