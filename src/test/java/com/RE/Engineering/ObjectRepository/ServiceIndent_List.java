package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.ServiceIndent_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class ServiceIndent_List extends ServiceIndent_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "ServiceInd_List";
	public static WebDriver iDriver;
	//public static String Project_Name = "BURDWAN TOWNSHIP, Burdwan";
	public ServiceIndent_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath = "//a[text()='Service Indent']")
	private WebElement serviceindent;
	public void getServiceIndent() {
		serviceindent.click();
	}
	
	@FindBy(xpath = "//input[@id='rdoServiceIndentType_1']")
	private WebElement unfulfilled;
	public void getUnfulFilled() {
		unfulfilled.click();
	}
	
	@FindBy(xpath = "//input[@id='rdoServiceIndentType_2']")
	private WebElement all;
	public void getAll() {
		all.click();
	}
	
	@FindBy(id = "ddlFilterProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(id = "btnFilterGO")
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
	 en.clickInventory();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("ServiceIndList");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
	public static void singleDD(WebElement comPath, String Company_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(Company_Name);
}
	
	public static void fulfilled() throws Throwable {
		
		Ser_List.getServiceIndent();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(Ser_List.getproject(),sheet.getRow(0).getCell(1).getStringCellValue());
		Ser_List.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	
	public static void unfulfilled() throws Throwable {
		
		Frames.SubMenuFrame();
		Ser_List.getServiceIndent();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Ser_List.getUnfulFilled();
		singleDD(Ser_List.getproject(),sheet.getRow(0).getCell(1).getStringCellValue());
		Ser_List.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	
	public static void all() throws Throwable {
		Frames.SubMenuFrame();
		Ser_List.getServiceIndent();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Ser_List.getAll();
		singleDD(Ser_List.getproject(),sheet.getRow(0).getCell(1).getStringCellValue());
		Ser_List.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
}
