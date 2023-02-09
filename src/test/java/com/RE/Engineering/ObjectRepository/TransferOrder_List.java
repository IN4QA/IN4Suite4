package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.TransferOrder_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class TransferOrder_List extends TransferOrder_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "TransferOrder_List";
	public static WebDriver iDriver;
	public TransferOrder_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath = "//a[text()='Transfer Order']")
	private WebElement transferOrder;
	public void getTransferOrder() {
		transferOrder.click();
	}
	
	@FindBy(id = "rdoTransferOrder_1")
	private WebElement Asset;
	public void getAsset() {
	   Asset.click();
	}
		
	@FindBy(id = "ddlFromStore")
	private WebElement fromStore;
	public WebElement getFromStore() {
		return fromStore;
	}
	
	@FindBy(xpath = "//input[@id='btnGo']")
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
	 sheet = xml.excelData("TransferOrder List");	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	
	public static void fromStoreDD(WebElement comPath, String from_Store) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(from_Store);
}

	//---case1: show transfer order for material----//
	public static void material() throws Throwable {
		
		TransferOrder.getTransferOrder();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		TransferOrder.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	
	//---case2: show transfer order for asset---//
    public static void asset() throws Throwable {
    	Frames.SubMenuFrame();
		TransferOrder.getTransferOrder();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TransferOrder.getAsset();		
		Thread.sleep(2000);
		TransferOrder.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	//---case3:show transfer order for material with from store selection----//
	public static void materialwithfromstore() throws Throwable {
		Frames.SubMenuFrame();
		TransferOrder.getTransferOrder();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		fromStoreDD(TransferOrder.getFromStore(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		TransferOrder.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}
	//---case4: show transfer order for asset with from store selection----//
	public static void assetwithfromstore() throws Throwable {
		Frames.SubMenuFrame();
		TransferOrder.getTransferOrder();
		Frames.rightFrame();
		Thread.sleep(1000);
		TransferOrder.getAsset();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		fromStoreDD(TransferOrder.getFromStore(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		TransferOrder.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(2000);
		
	}

}
