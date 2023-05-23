package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Billing_BrokerInvoice_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Billing_BrokerInvoice_List extends Billing_BrokerInvoice_List_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public static String fDate = "Jan 01, 2000";
	
	public Billing_BrokerInvoice_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy(xpath="//a[text()='Broker Invoices']")
	private WebElement brokerinvoicelink;
	public void brokerinvoicelinkclick() {
		brokerinvoicelink.click();
	}
	@FindBy(name = "ddlProjectList")
	private WebElement projectDD;
	public WebElement getProjectDD() {
		return projectDD;
	}
	@FindBy(name = "ddlSubProject")
	private WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		return subprojectDD;
	}
	@FindBy(id = "dpReceiptDate_txtDate")
	private WebElement referencedatepicker;
	public WebElement referenceDatePicker() {
		return referencedatepicker;
	}
	
	@FindBy(name = "btnBrokerInvoiceList")
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
			brokerinvoicelinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			BrokerInvoices.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(1000);	
	}
	 	
	 	
	 	public void projectfilter() throws Throwable{
			Frames.SubMenuFrame();
			Thread.sleep(1000);
	 		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
	 		brokerinvoicelinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			BrokerInvoices.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(1000);	
	}
}
