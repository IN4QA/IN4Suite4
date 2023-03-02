package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Purchase.Test.Pur_Search_List_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Pur_Search_List extends Pur_Search_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "Pur_Search_List";
	public static WebDriver iDriver;
	public Pur_Search_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(name = "ddlSearchList")
	private WebElement searchfor;
	public WebElement getsearchfor() {
		return searchfor;
	}
	
	@FindBy(id="rdoSearchList_1")
	private WebElement advancecert;
	public void getadvancecert() {
		advancecert.click();
	}
	
	@FindBy(name = "btnSearch")
	private WebElement go;
	public void getgo() {
		go.click();
	}
	 public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	mm.clickPurchase();
	 Thread.sleep(2000);
	 Purchase en = new Purchase(iDriver);
	 Frames.SubMenuFrame();
	 Thread.sleep(2000);
	 en.clicksearch();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("Purchase Search List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed:"+e);
	 	}
}
	 public void searchsuppcert() throws Throwable{
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Frames.rightFrame();
		 Thread.sleep(1000);
		 appInd.singleDropDown(searchsuppliercert.getsearchfor(), sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 searchsuppliercert.getgo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrMethod, sheetname);
		 Thread.sleep(1000);
	 }
	 
	 public void searchsuppadvance() throws Throwable{
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Frames.rightFrame();
		 Thread.sleep(1000);
		 appInd.singleDropDown(searchsuppliercert.getsearchfor(), sheet.getRow(0).getCell(1).getStringCellValue());
		 searchsuppliercert.getadvancecert();
		 Thread.sleep(1000);
		 searchsuppliercert.getgo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrMethod, sheetname);
		 Thread.sleep(1000);
	 }
	 
	 public void searchpurchaseorders() throws Throwable{
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Frames.rightFrame();
		 Thread.sleep(1000);
		 appInd.singleDropDown(searchsuppliercert.getsearchfor(), sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 searchsuppliercert.getgo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrMethod, sheetname);
		 Thread.sleep(1000);
	 }
	 
	 public void searchTransferorders() throws Throwable{
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Frames.rightFrame();
		 Thread.sleep(1000);
		 appInd.singleDropDown(searchsuppliercert.getsearchfor(), sheet.getRow(2).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 searchsuppliercert.getgo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrMethod, sheetname);
		 Thread.sleep(1000);
	 }
	 public void searchsuppliers() throws Throwable{
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Frames.rightFrame();
		 Thread.sleep(1000);
		 appInd.singleDropDown(searchsuppliercert.getsearchfor(), sheet.getRow(3).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 searchsuppliercert.getgo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrMethod, sheetname);
		 Thread.sleep(1000);
	 }
	 
	 
}
