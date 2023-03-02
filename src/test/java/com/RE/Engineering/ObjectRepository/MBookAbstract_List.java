package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.MBookAbstract_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MBookAbstract_List extends MBookAbstract_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname="MBookAbst_List";
	public static WebDriver iDriver;
	public MBookAbstract_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='MBook Abstracts']")
	private WebElement MbookAbstlink;
	public void MbookAbstlinkclick() {
		MbookAbstlink.click();
	}
	
	@FindBy(name = "ddlSubProjectList")
	private WebElement subprojectDD;
	public WebElement getsubproject() {
		return subprojectDD;
	}
	
	@FindBy(id = "ddlWorkOrderList")
	private WebElement workorder;
	public WebElement getworkorder() {
		return workorder;
	}
	
	@FindBy(id="ddlProjectList")
	private static WebElement projectDD;
	public static WebElement getProjectDD() {
		return projectDD;
	}
	
	@FindBy(id="ddlWorkOrderList")
	private static WebElement workorderDD;
	public static WebElement getWorkOrderDD() {
		return workorderDD;
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
	 sheet = xml.excelData("MbookAbst List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
	public void Go() throws Throwable {
		MbookAbstractlist.MbookAbstlinkclick();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getProjectDD(),sheet.getRow(0).getCell(1).getStringCellValue());
		appInd.singleDropDown(getsubproject(),sheet.getRow(1).getCell(1).getStringCellValue());
		appInd.singleDropDown(getworkorder(), sheet.getRow(2).getCell(1).getStringCellValue());
		MbookAbstractlist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
	}
	
}
