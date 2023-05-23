package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.BillingCreditNote_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class BillingCreditNote_List extends BillingCreditNote_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public BillingCreditNote_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Credit Note']")
	private WebElement creditnotelink;
	public void getcreditnotelink() {
		creditnotelink.click();
	}
	
	@FindBy(name = "ddlProjectList")
	private WebElement projectDD;
	public WebElement getprojectDD() {
		return projectDD;
	}
	
	@FindBy(name = "btnFilterGO")
	private WebElement gobutton;
	public void getgobutton() {
		gobutton.click();
	}
	@FindBy(id="ddlStatusList")
	private WebElement status;
	public WebElement getstatus() {
		return status;
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
		sheet = xml.excelData(sheetname,Engineering.inputPath);
	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	
	public void project() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		crditnotelist.getcreditnotelink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getprojectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		crditnotelist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
	}
	public void projectwithstatus() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		crditnotelist.getcreditnotelink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getprojectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getstatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		crditnotelist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
	
	}
}
