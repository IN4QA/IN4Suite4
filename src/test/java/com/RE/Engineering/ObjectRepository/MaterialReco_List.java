package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.MaterialReco_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialReco_List extends MaterialReco_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "MaterialReco_List";
	public static WebDriver iDriver;
	public MaterialReco_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath = "//a[text()='Material Reconciliation']")
	private WebElement materialReco;
	public void getmaterialReco() {
		materialReco.click();
	}
	
	@FindBy(id = "ddlFilterCertifyingCompany")
	private WebElement certCompany;
	public WebElement getCompany() {
		return certCompany;
	}
	@FindBy(id="ddlFilterStatus")
	private WebElement status;
	public WebElement getStatus() {
		return status;
	}
	
	@FindBy(xpath = "//input[@id='btnFilterGO']")
	private WebElement go;
	public void getGo() {
		 go.click();
	}
	
	@FindBy(id="ddlFilterStore")
	private WebElement store;
	public WebElement getStore() {
		return store;
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
	 sheet = xml.excelData("MaterialReco List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
	public static void companyDD(WebElement comPath, String certifying_company) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(certifying_company);
}
	public static void statusDD(WebElement comPath, String selectStatus) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(selectStatus);
}
	
	
	public static void company() throws Throwable {
		MaterialReco.getmaterialReco();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		companyDD(MaterialReco.getCompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		MaterialReco.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	
	
	public static void companywithstore() throws Throwable {
		Frames.SubMenuFrame();
		MaterialReco.getmaterialReco();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		companyDD(MaterialReco.getCompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		statusDD(MaterialReco.getStatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		MaterialReco.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
    }
}

