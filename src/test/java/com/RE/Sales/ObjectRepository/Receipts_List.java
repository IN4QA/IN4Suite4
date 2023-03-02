package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.Receipts_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Receipts_List extends Receipts_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;

	public Receipts_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text() = 'Receipts']")
	private WebElement ReceiptsLink;
	public void getReceiptsLink() {
		ReceiptsLink.click();
	}
	@FindBy(id = "txtProject")
	private WebElement slctproject;
	public void getslctproject() {
		slctproject.click();
	}
	
	@FindBy(id = "txtProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}

	@FindBy(id = "txtSubProject")
	private WebElement subproject;
	public WebElement getsubproject() {
		return subproject;
	}
	
	@FindBy(id = "btnGO")
	private WebElement go_btn;
	public void getGo_Btn() {
		 go_btn.click();
	}
	
	@FindBy(css = "input#txtUnitNo")
	private WebElement unit;
	public WebElement getUnit() {
		return unit;
	}
	
	@FindBy(css = "input#txtStatus")
	private WebElement status;
	public WebElement getStatus() {
		return status;
	}
	
	@FindBy(css = "input#txtSearch")
	private WebElement customer;
	public WebElement getCustomer() {
		return customer;
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
			sheet = xml.excelData(sheetname);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	 public void getProjectCount() throws Throwable {
		 reclist.getReceiptsLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 reclist.getslctproject();
		 Thread.sleep(1000);
		 WebElement proj = reclist.getproject();
		 proj.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
	 	 proj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
	     proj.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 reclist.getGo_Btn();
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod,sheetname);
		 Thread.sleep(4000);
	 }

	 public void getSubProjectCount() throws Throwable {
		 Frames.SubMenuFrame();
		 reclist.getReceiptsLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 WebElement proj = reclist.getproject();
		 proj.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
	 	 proj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
	     proj.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement subProj = reclist.getsubproject();
		 subProj.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 reclist.getGo_Btn();
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod,sheetname);
		 Thread.sleep(4000);
	 }
	 
	 public void getUnitCount() throws Throwable {
		 Frames.SubMenuFrame();
		 reclist.getReceiptsLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 WebElement proj = reclist.getproject();
		 proj.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
	 	 proj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
	     proj.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement subProj = reclist.getsubproject();
		 subProj.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ENTER);
		 WebElement unit = reclist.getUnit();
		 unit.sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 unit.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 unit.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 reclist.getGo_Btn();
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod,sheetname);
		 Thread.sleep(4000);
	 }
	 
	 public void getStatusCount() throws Throwable {
		 Frames.SubMenuFrame();
		 reclist.getReceiptsLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 WebElement proj = reclist.getproject();
		 proj.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
	 	 proj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
	     proj.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement subProj = reclist.getsubproject();
		 subProj.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ENTER);
		 WebElement status = reclist.getStatus();
		 status.sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 status.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 status.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 reclist.getGo_Btn();
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod,sheetname);
		 Thread.sleep(4000);
	 }
	 
	 public void getCustomerCount() throws Throwable {
		 Frames.SubMenuFrame();
		 reclist.getReceiptsLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 WebElement proj = reclist.getproject();
		 proj.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
	 	 proj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
	     proj.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement subProj = reclist.getsubproject();
		 subProj.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 subProj.sendKeys(Keys.ENTER);
		 WebElement cust = getCustomer();
		 cust.sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 cust.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 cust.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 reclist.getGo_Btn();
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod,sheetname);
		 Thread.sleep(4000);
	 }
}
