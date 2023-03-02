package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering.Test.CheckList_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class CheckList_List extends CheckList_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "CheckList_List";
	public static WebDriver iDriver;
	public CheckList_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Checklist ']")
	private static WebElement checklistlink;
	public void getChecklist() {
		checklistlink.click();
	}
	@FindBy(id="ddlProject")
	private static WebElement project;
	public static WebElement getProject() {
		return project;
	}
	@FindBy(id="ddlSubProject")
	private static WebElement subproject;
	public static WebElement getSubProject() {
		return subproject;
	}
	@FindBy(id="ddlFloorNo")
	private static WebElement floor;
	public static WebElement getFloorNo() {
		return floor;
	}	
	@FindBy(id="btnGo")
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
	 en.clickChecklist();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("CheckList List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
	public static void mandatoryfilters() throws Throwable {
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSubProject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getFloorNo(), sheet.getRow(2).getCell(1).getStringCellValue());
		checklist.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}


}

