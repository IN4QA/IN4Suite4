package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.Return_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Return_List extends Return_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public Return_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Return Inventory']")
	private WebElement returnInventry;
	public void getReturnInventry() {
		returnInventry.click();
	}
	
	@FindBy(name = "ddlProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(id="ddlStatus")
	private WebElement status;
	public WebElement getstatus() {
		return status;
	}
	
	@FindBy(xpath = "//input[@id='btnGo']")
	private WebElement go;
	public void getGo() {
		 go.click();
	}
	
	@FindBy(xpath = "//input[@id='rdoIssueCategoryList_1']")
	private WebElement asset;
	public void getAsset() {
		asset.click();
	}
	
	public  void MenuSubMenu()
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
	 sheet = xml.excelData(sheetname,Engineering.inputPath);	
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
	public static void statusDD(WebElement comPath, String selectStatus) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(selectStatus);
}
	
	
	public  void material() throws Throwable {
		
		ReturnList.getReturnInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		projectDD(ReturnList.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		ReturnList.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
	public  void asset() throws Throwable {
		Frames.SubMenuFrame();
		ReturnList.getReturnInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		ReturnList.getAsset();
		Thread.sleep(2000);
		projectDD(ReturnList.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		ReturnList.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
	}

   
public  void matwithstatus() throws Throwable {
		Frames.SubMenuFrame();
		ReturnList.getReturnInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		projectDD(ReturnList.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		statusDD(ReturnList.getstatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		ReturnList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
    }
}

