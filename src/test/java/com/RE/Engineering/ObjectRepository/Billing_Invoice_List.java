package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.Billing_Invoice_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Billing_Invoice_List extends Billing_Invoice_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Billing_Invoice_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy (xpath = "//a[text()='Invoice']")
	private WebElement invoicelink;
	public void getinvoicelink() {
		invoicelink.click();
	}
	
	@FindBy(name = "ddlProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(id = "ddlClientList")
	private WebElement clientname;
	public WebElement getclientname() {
		return clientname;
	}
	
	@FindBy(name = "btnFilterGO")
	private WebElement GoButton;
	public void getGo() {
		GoButton.click();
	}
	public void MenuSubMenu() throws Throwable{
		try {
			
		MainMenu mm=new MainMenu(iDriver);
		mm.clickEngineering();
		Engineering en=new Engineering(iDriver);
		Thread.sleep(1000);
		en.clickBilling();
		Thread.sleep(1000);		
		xml=new Datatable();
		sheet=xml.excelData(sheetname,Engineering.inputPath);
	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	
	public void nofilter() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		invoicelist.getinvoicelink();
		Thread.sleep(1000);
		Frames.innerFrame();
		invoicelist.getGo();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		
	}
	public void project() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		invoicelist.getinvoicelink();
		Thread.sleep(1000);
		Frames.innerFrame();
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		invoicelist.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		
	}
	
	public void projectwithclient() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		invoicelist.getinvoicelink();
		Thread.sleep(1000);
		Frames.innerFrame();
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getclientname(), sheet.getRow(1).getCell(1).getStringCellValue());
		invoicelist.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		
	}
	
}
