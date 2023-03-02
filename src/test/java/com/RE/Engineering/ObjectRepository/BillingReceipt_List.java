package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering.Test.BillingReceipt_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class BillingReceipt_List extends BillingReceipt_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public static String fDate="Jan 01,2020";
	public static String toDate="Dec 31,2022";
	
	public BillingReceipt_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Receipt']")
	private WebElement receiptlink;
	public void getreceiptlink() {
		receiptlink.click();
	}
	
	@FindBy(name = "ddlFilterClient")
	private WebElement clientDD;
	public WebElement getclientDD() {
		return clientDD;
	}
	@FindBy(name = "ddlFilterProject")
	private WebElement projectDD;
	public WebElement getprojectDD() {
		return projectDD;
	}
	
	@FindBy(id ="dtpReceiptFromDate_txtDate")
	private WebElement fdatepicker;
	public WebElement getfdatepicker() {
		return fdatepicker;
	}
	@FindBy(id = "dtpReceiptToDate_txtDate")
	private WebElement todatepicker;
	public WebElement gettodatepicker() {
		return todatepicker;
	}
	
	@FindBy(name = "btnFilterGO")
	private WebElement gobutton;
	public void getgobutton() {
		gobutton.click();
	}
	
	
	
	public void MenuSubMenu() throws Throwable{
		try {
			
		MainMenu mm=new MainMenu(iDriver);
		mm.clickEngineering();
		Engineering en=new Engineering(iDriver);
		Thread.sleep(1000);
		en.clickBilling();
		Thread.sleep(1000);		
		xml=new Datatable();
		sheet=xml.excelData(sheetname);
	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	
	public void mandatoryfilter() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		receiptlist.getreceiptlink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getclientDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getprojectDD(), sheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		receiptlist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname);
		Thread.sleep(1000);
		
	}
	public void datefilter() throws Throwable {
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		receiptlist.getreceiptlink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.seletDate(fdatepicker, fDate);
		Thread.sleep(1000);
		appInd.seletDate(todatepicker, toDate);
		Thread.sleep(1000);
		appInd.singleDropDown(getclientDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getprojectDD(), sheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		receiptlist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname);
		Thread.sleep(1000);
		
	}
	
}
