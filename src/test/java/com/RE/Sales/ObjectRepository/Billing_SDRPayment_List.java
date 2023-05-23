package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Billing_SDRPayment_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Billing_SDRPayment_List extends Billing_SDRPayment_List_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public static String fDate = "Jan 01, 2000";
	
	public Billing_SDRPayment_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy(xpath="//a[text()='SDR Payments']")
	private WebElement SDRcompanypaymentslink;
	public void SDRpaymentslinkclick() {
		SDRcompanypaymentslink.click();
	}
	@FindBy(name = "ddlProjectList")
	private WebElement projectDD;
	public WebElement getProjectDD() {
		return projectDD;
	}
	@FindBy(name = "ddlSubProjectList")
	private WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		return subprojectDD;
	}
	@FindBy(id = "dtFromDate_txtDate")
	private WebElement fromdatepicker;
	public WebElement getfDatepicker() {
		return fromdatepicker;
	}
	
	@FindBy(name = "btnGO")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	
	 	public void MenuSubMenu()
	 	{
	 		try
	 		{
	 			MainMenu mm = new MainMenu(iDriver);
	 			mm.clickSales();
	 			Thread.sleep(2000);
	 			Sales en = new Sales(iDriver);
	 			en.clickBilling();
	 			Thread.sleep(2000);
	 			xml = new Datatable();
	 			sheet = xml.excelData(sheetname,Sales.inputPath);
	 		}
	 		catch (Exception e)
	 		{
		
	 			e.printStackTrace();
	 			System.out.println("Module, Sub module click case Failed: "+e);
	 		}
	 	}
	 	public void go() throws Throwable{
			String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
			SDRpaymentslinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			SDRPayment.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(1000);	
	}
	 	
	 	
	 	public void projectandfromdatefilter() throws Throwable{
			Frames.SubMenuFrame();
			Thread.sleep(1000);
	 		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
	 		SDRpaymentslinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			appInd.seletDate(getfDatepicker(),fDate);
			Thread.sleep(2000);
			SDRPayment.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(1000);	
	}
}
