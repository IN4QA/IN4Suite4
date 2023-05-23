package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.DPRCriticalpoint_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class DPRCriticalpoint_List extends DPRCriticalpoint_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname ;
	public static WebDriver iDriver;
	public static String fDate="Jan 01,2000";
	
	public DPRCriticalpoint_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Critical Point']")
	private WebElement checkpointlinkclick;
	public void checkpointLinkClick() {
		checkpointlinkclick.click();
	}
	
	@FindBy(id="ddlProject")
	private static WebElement projectDD;
	public static WebElement getProjectDD() {
		return projectDD;
	}
	
	@FindBy(id="dtDPR_FromDate_txtDate")
	private static WebElement fDatePicker;
	public static WebElement getfDatepicker() {
		return fDatePicker;
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
	 xml=new Datatable();
	 sheet = xml.excelData(sheetname,Engineering.inputPath);	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
	public void Go() throws Throwable {
		criticalpointlist.checkpointLinkClick();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		criticalpointlist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void project() throws Throwable {
		Frames.SubMenuFrame();		
		criticalpointlist.checkpointLinkClick();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getProjectDD(),sheet.getRow(0).getCell(1).getStringCellValue());
		criticalpointlist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
	
	public void projectwithdate() throws Throwable {
		Frames.SubMenuFrame();		
		criticalpointlist.checkpointLinkClick();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getProjectDD(),sheet.getRow(0).getCell(1).getStringCellValue());
		appInd.seletDate(fDatePicker,fDate);
		Thread.sleep(1000);
		criticalpointlist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
}