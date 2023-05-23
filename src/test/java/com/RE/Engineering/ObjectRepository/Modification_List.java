package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.Modification_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Modification_List extends Modification_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public Modification_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(id="ddlProject")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	
	@FindBy(id="ddlSubProject")
	private WebElement subproject;
	public WebElement getSubProject() {
		return subproject;
	}
	
	@FindBy(id="ddlEnggStatus")
	private WebElement status;
	public WebElement getEnggStatus() {
		return status;
	}
	
	@FindBy(xpath="//a[text()='Modification ']")
	private static WebElement modification;
	public static void clickmodificationlink()
	{
		modification.click();
	}
	
	@FindBy(id="btnGo")
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
	 Engineering.clickModifications();
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
	public static void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
	}
	
		
	public  void projectandsubproject() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(1000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(modificationlist.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		singleDD(modificationlist.getSubProject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		modificationlist.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
	public  void mandatorywithstatus() throws Throwable {
		Frames.SubMenuFrame();
		clickmodificationlink();
		Thread.sleep(1000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(modificationlist.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		singleDD(modificationlist.getSubProject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		singleDD(modificationlist.getEnggStatus(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		modificationlist.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	


}

