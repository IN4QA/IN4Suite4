package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Marketting_DebitNoteReceipt_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MarkettingDebitNoteReceipt_List extends Marketting_DebitNoteReceipt_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public MarkettingDebitNoteReceipt_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Debit Note Receipt']")
	private WebElement DebitNoteReceiptLink;
	public void getDebitNoteReceiptLink() {
		DebitNoteReceiptLink.click();
	}
	
	@FindBy(id = "ddlCompany")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
	
	@FindBy(name = "btnSearch")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickMerketing();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void nofilter()throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		debitnotereceiptlist.getDebitNoteReceiptLink();
		Thread.sleep(1000);
		Frames.rightFrame();
		debitnotereceiptlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
		
		}
	
	public void company()throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		debitnotereceiptlist.getDebitNoteReceiptLink();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getcompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		debitnotereceiptlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
		
		}
}
