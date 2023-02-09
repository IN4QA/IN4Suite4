package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.Billing_WO_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Billing_WO_List extends Billing_WO_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "Billing_WO_List";
	public static WebDriver iDriver;
	public Billing_WO_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Work Order']")
	private WebElement workorder;
	public void getWorkOrder() {
		workorder.click();
	}
	@FindBy(id="ddlProjectList")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	@FindBy(id="ddlStatusList")
	private WebElement status;
	public WebElement getStatus() {
		return status;
	}
	@FindBy(id="btnFilterGO")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	
	
	
	public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickBilling();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("WOcert List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	public static void projectDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
	}
	public static void statusDD(WebElement comPath, String select_Status) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(select_Status);
	}
		
	public static void project() throws Throwable {
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		WOcertList.getWorkOrder();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		projectDD(WOcertList.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		WOcertList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}

	public static void projectwithstatus() throws Throwable {
		Frames.SubMenuFrame();
		WOcertList.getWorkOrder();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		projectDD(WOcertList.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		statusDD(WOcertList.getStatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		WOcertList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	
	}
}
