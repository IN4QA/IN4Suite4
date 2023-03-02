package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.Mbook_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Mbook_List extends Mbook_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "Mbook_List";
	public static WebDriver iDriver;
	public Mbook_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='MBook']")
	private WebElement Mbooklink;
	public void Mbooklinkclick() {
		Mbooklink.click();
	}
	
	@FindBy(id="ddlProjectList")
	private static WebElement projectDD;
	public static WebElement getProjectDD() {
		return projectDD;
	}
	
	@FindBy(id="ddlAbstracted")
	private static WebElement abstractedstatusDD;
	public static WebElement getAbstractStatusDD() {
		return abstractedstatusDD;
	}
	
	
	@FindBy(id="btnFilterGO")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	
	
	
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickSiteActivity();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("Mbook List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
	public void Go() throws Throwable {
		Mbooklist.Mbooklinkclick();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getProjectDD(),sheet.getRow(0).getCell(1).getStringCellValue());
		Mbooklist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	}
	

	public void statusfilter() throws Throwable {
		Frames.SubMenuFrame();		
		Mbooklist.Mbooklinkclick();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getProjectDD(),sheet.getRow(0).getCell(1).getStringCellValue());
		appInd.singleDropDown(getAbstractStatusDD(),sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		Mbooklist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	
}