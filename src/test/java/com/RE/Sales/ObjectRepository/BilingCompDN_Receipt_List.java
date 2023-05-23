package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.BilingCompDN_Receipt_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class BilingCompDN_Receipt_List extends BilingCompDN_Receipt_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	
	public BilingCompDN_Receipt_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Company Debit Note Receipt']")
	private WebElement CompDNReceipt;
	public void getcompanyDNReceiptlink() {
		CompDNReceipt.click();
	}
	
	@FindBy(id = "ddlCompany")
	private WebElement PayingCompany;
	public WebElement getcompnay() {
		return PayingCompany;
	}
	
	@FindBy(name = "btnSearch")
	private WebElement gobutton;
	public void getGo() {
		gobutton.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickBilling();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void nofilter() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		CompanyDNReceiptList.getcompanyDNReceiptlink();
		Frames.rightFrame();
		Thread.sleep(2000);
		CompanyDNReceiptList.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}
public void payingcomp() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		CompanyDNReceiptList.getcompanyDNReceiptlink();
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getcompnay(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		CompanyDNReceiptList.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}
	
}
