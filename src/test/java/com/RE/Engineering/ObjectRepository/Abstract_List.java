package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.Abstract_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Abstract_List extends Abstract_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;
	public Abstract_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Abstracts']")
	private WebElement advance;
	public void getAbstractlink() {
		advance.click();
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
	
	
	
	public  void MenuSubMenu()
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
	 sheet = xml.excelData(Sheetname,Engineering.inputPath);	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	public  void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
	}
	
		
	public  void project() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(2000);
		Abstractlist.getAbstractlink();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		singleDD(Abstractlist.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		Abstractlist.getGo();
		Thread.sleep(20000);
		ListPageCount.PageCount(nameofCurrMethod,Sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	

	public  void projectwithstatus() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(2000);
		Abstractlist.getAbstractlink();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getStatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		Abstractlist.getGo();
		Thread.sleep(20000);
		ListPageCount.PageCount(nameofCurrMethod,Sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
}