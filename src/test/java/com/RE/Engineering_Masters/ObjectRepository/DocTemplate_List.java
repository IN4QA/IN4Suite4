package com.RE.Engineering_Masters.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering_Masters.Test.DocTemplate_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class DocTemplate_List extends DocTemplate_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "DocTemp_List";
	public static WebDriver iDriver;
	public DocTemplate_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(id="ddlProjectList")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	
	@FindBy(id="ddlSubProjectList")
	private static WebElement subproject;
	public static WebElement getSubproject() {
		return subproject;
	}
	
	@FindBy(id="btnsearch")
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
	 en.clickTemplates();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("DocTemp List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
		public void mandatoryfilters() throws Throwable {
			Frames.rightFrame();		
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Thread.sleep(1000);
			appInd.singleDropDown(getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(500);
			appInd.singleDropDown(getSubproject(),sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			assetlist.getGo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod,sheetname);
			Thread.sleep(2000);
		
	}
	
}