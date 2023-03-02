package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Submodules.Purchase;
import com.RE.Purchase.Test.MaterialSaleReceipt_List_Test;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialSaleReceipt_List extends MaterialSaleReceipt_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname="MaterialSaleReceipt_List";
	public static WebDriver iDriver;
	public MaterialSaleReceipt_List (WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Material Sales Receipt']")
	private WebElement MaterialSaleReceipt;
	public void getMaterialSaleReceipt() {
		MaterialSaleReceipt.click();
	}
	
	@FindBy(name = "ddlBuyerType")
	private WebElement BuyerType;
	public WebElement getBuyerType() {
		return BuyerType;
	}
	@FindBy(name = "btnGo")
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
	// Frames.SubMenuFrame();
	 Thread.sleep(2000);
	 en.clickPayments();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("MaterialSaleReceipt List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed:"+e);
	 	}
  }
	 	public void go() throws Throwable{
	 		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	 		MaterialSaleReceiptList.getMaterialSaleReceipt();
	 		Thread.sleep(1000);
	 		Frames.rightFrame();
	 		MaterialSaleReceiptList.getgo();
	 		Thread.sleep(1000);
	 		ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(1000);
	 	}
	 	public void contarctor() throws Throwable{
	 		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	 		Frames.SubMenuFrame();
	 		MaterialSaleReceiptList.getMaterialSaleReceipt();
	 		Thread.sleep(1000);
	 		Frames.rightFrame();
	 		Thread.sleep(1000);
	 		appInd.singleDropDown(MaterialSaleReceiptList.getBuyerType(), sheet.getRow(0).getCell(1).getStringCellValue());
	 		Thread.sleep(1000);
	 		MaterialSaleReceiptList.getgo();
	 		ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(1000);
	 		
	 	}
	 	public void supplier() throws Throwable{
	 		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	 		Frames.SubMenuFrame();
	 		MaterialSaleReceiptList.getMaterialSaleReceipt();
	 		Thread.sleep(1000);
	 		Frames.rightFrame();
	 		Thread.sleep(1000);
	 		appInd.singleDropDown(MaterialSaleReceiptList.getBuyerType(), sheet.getRow(1).getCell(1).getStringCellValue());
	 		Thread.sleep(1000);
	 		MaterialSaleReceiptList.getgo();
	 		ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(1000);
	 	}
	 	public void ThirdPartyBuyer() throws Throwable{
	 		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	 		Frames.SubMenuFrame();
	 		MaterialSaleReceiptList.getMaterialSaleReceipt();
	 		Thread.sleep(1000);
	 		Frames.rightFrame();
	 		Thread.sleep(1000);
	 		appInd.singleDropDown(MaterialSaleReceiptList.getBuyerType(), sheet.getRow(2).getCell(1).getStringCellValue());
	 		Thread.sleep(1000);
	 		MaterialSaleReceiptList.getgo();
	 		ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(1000);
	 	}
	 	
}
