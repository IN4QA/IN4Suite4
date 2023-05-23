package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering.Test.Contracting_Leads_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Contracting_Leads_List extends Contracting_Leads_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Contracting_Leads_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement ledaslink;
	public void getleadslink() {
		ledaslink.click();
	}
	
	@FindBy(id = "ddStatus")
	private WebElement statusDD;
	public WebElement getstatus() {
		return statusDD;
	}
	
	@FindBy (name = "btnFilterGO")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickContracting();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData(sheetname,Engineering.inputPath);
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
	public void allleads() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		leadslist.getleadslink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getstatus(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		leadslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		
	}
	
	public void activeleads() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		leadslist.getleadslink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getstatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		leadslist.getgo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
	public void inactiveleads() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		leadslist.getleadslink();
		Thread.sleep(2000);
		Frames.rightFrame();
		appInd.singleDropDown(getstatus(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		leadslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
}
