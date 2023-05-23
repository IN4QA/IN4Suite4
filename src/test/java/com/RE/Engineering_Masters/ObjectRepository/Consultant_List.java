package com.RE.Engineering_Masters.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering_Masters.Test.Consultant_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.AppIndependentMethods;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Consultant_List extends Consultant_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public Consultant_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Consultant']")
	private WebElement consultant;
	public void getConsultantLink() {
		consultant.click();
	}
	
	@FindBy(id="ddlStatusList")
	private static   WebElement status;
	public static WebElement getStatus() {
		return status;
	}
	
	@FindBy(id="btnGo")
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
	 en.clickMasters();
	 Thread.sleep(2000);
	 xml = new Datatable();
	 sheet = xml.excelData(sheetname,Engineering.inputPath);	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
	public void Go() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		consultantlist.getConsultantLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		consultantlist.getGo();
		Thread.sleep(4000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(4000);
		
	}
	

	public void status() throws Throwable {
		Frames.SubMenuFrame();		
		consultantlist.getConsultantLink();
		Thread.sleep(1000);
		Frames.rightFrame();		
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(getStatus(),sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		consultantlist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
}