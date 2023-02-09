package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Purchase.Test.MaterialSales_List_Test;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialSales_List extends MaterialSales_List_Test{

	public static WebDriver iDriver;
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "MaterialSales_List";
	public MaterialSales_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//td[@id='Root']//tr[8]")
	private WebElement materialsales;
	public void getMaterialSales() {
		materialsales.click();
	}
	
	@FindBy(id="rdoSalesList_1")
	private WebElement asset;
	public void getAsset() {
		asset.click();
	}
	
	@FindBy(id="ddlFromStore")
	private WebElement store;
	public WebElement getStore() {
		return store;
	}
	
	@FindBy(xpath="//input[@id='btnGo']")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	
	public static void storeDD(WebElement statusPath, String selectStatus) {
		Select sct = new Select(statusPath);
		sct.selectByVisibleText(selectStatus);
	}
		
	public static void MenuSubMenu()
		 {
		try
		{
		MainMenu mm = new MainMenu(iDriver);
		 mm.clickPurchase();
		 Thread.sleep(2000);
		 xml = new Datatable();
		 sheet = xml.excelData("MaterialSales List");
		 }
		 	catch (Exception e)
		 	{
			
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		 	}
	}
		
		//------- case1: material wise ------//
		
	public static void material() throws Throwable {
				
		Frames.SubMenuFrame();
		MaterialSalesList.getMaterialSales();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
//	    storeDD(MaterialSalesList.getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
	    MaterialSalesList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname);
		Thread.sleep(2000);
	
	}
	
	public static void asset() throws Throwable {
		
		Frames.SubMenuFrame();
		MaterialSalesList.getMaterialSales();
		Frames.rightFrame();
		MaterialSalesList.getAsset();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
//	    storeDD(MaterialSalesList.getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
	    MaterialSalesList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname);
		Thread.sleep(2000);
	
	}
	
	public static void materialwithfromstore() throws Throwable {
		
		Frames.SubMenuFrame();
		MaterialSalesList.getMaterialSales();
		Frames.rightFrame();
		Thread.sleep(2000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	    storeDD(MaterialSalesList.getStore(),sheet.getRow(0).getCell(1).getStringCellValue());
	    Thread.sleep(2000);
	    MaterialSalesList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname);
		Thread.sleep(2000);
	
	}
}
	