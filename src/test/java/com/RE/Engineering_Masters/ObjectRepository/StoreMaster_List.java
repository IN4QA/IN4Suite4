package com.RE.Engineering_Masters.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering_Masters.Test.StoreMaster_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class StoreMaster_List extends StoreMaster_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "StoreMaster_List";
	public static WebDriver iDriver;
	public StoreMaster_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Store Master']")
	private WebElement storemaster;
	public void getStoreMasterlink() {
		storemaster.click();
	}
	@FindBy(xpath="//input[@id='txtCertifyingCompany']")
	private WebElement certifyCompany;
	public void getCertifyCompany() {
		certifyCompany.click();
	}
	@FindBy(xpath="//input[@id='txtCertifyingCompany']")
	private static WebElement certCompany;
	public WebElement getCertCompany() {
		return certCompany;
	}
	
	@FindBy(id="btnGO")
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
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("StoreMaster List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
		
	public void Go() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(2000);
		Storelist.getStoreMasterlink();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		Storelist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	

	public void cerCompany() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(2000);
		Storelist.getStoreMasterlink();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		Storelist.getCertifyCompany();
		Storelist.getCertCompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		certCompany.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		certCompany.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Storelist.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	
}