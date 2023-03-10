package com.RE.Purchase.ObjectRepository;

import com.RE.Purchase.Test.MaterialBuyer_List_Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialBuyer_List extends MaterialBuyer_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName="MaterialBuyer_List";
	public static WebDriver iDriver;
	public MaterialBuyer_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		
	}
	@FindBy(xpath="//a[text()='Material Buyer']")
	private WebElement materialbuyer;
	public void getmaterialbuyer() {
		materialbuyer.click();
	}
	
	@FindBy(name = "btnGo")
	private WebElement go;
	public void getgo() {
		go.click();
	}
	
	@FindBy(name = "ddlCountry")
	private WebElement country;
	public WebElement getcountry() {
		return country;
	}
	
	@FindBy(name = "ddlState")
	private WebElement state;
	public WebElement getstate() {
		return state;
	}
	
	@FindBy(id = "ddlCity")
	private WebElement city;
	public WebElement getcity() {
		return city;
	}
	public static void MainSubmenu() {
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(1000);
			Purchase en=new Purchase(iDriver);
			en.clickmasters();
			Thread.sleep(1000);
			xml=new Datatable();
			sheet=xml.excelData("MaterialBuyer List");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:"+e);
		}
		
	}
	public void go() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		materialbuyerlist.getmaterialbuyer();
		Thread.sleep(1000);
		Frames.rightFrame();
		materialbuyerlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, SheetName);
		Thread.sleep(1000);
	}
	
	public void location() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		materialbuyerlist.getmaterialbuyer();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(materialbuyerlist.getcountry(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(materialbuyerlist.getstate(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(materialbuyerlist.getcity(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		materialbuyerlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, SheetName);
		Thread.sleep(1000);
	}
	
}
