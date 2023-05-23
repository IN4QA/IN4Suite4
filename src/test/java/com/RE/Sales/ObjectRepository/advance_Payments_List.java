package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.advance_Payments_List_Test;
import com.RE.Submodules.Sales;

import Utilities.AppIndependentMethods;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class advance_Payments_List extends advance_Payments_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static String fDate = "Jan 01, 2000";
	public advance_Payments_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text() = 'Advance Payments']")
	private WebElement advancePaymentLink;
	public void getAdvancePaymentLink() {
		advancePaymentLink.click();
	}
	
	@FindBy(css = "select#ddlProjectList")
	private WebElement proj;
	public WebElement getProj() {
		return proj;
	}
	
	@FindBy(css = "input#btnGO")
	private WebElement go;
	public void getGo() {
		 go.click();;
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
	public void noFilter() throws Throwable {
		getAdvancePaymentLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(2000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(4000);
	}
	
	public void project() throws Throwable {
		Frames.SubMenuFrame();
		getAdvancePaymentLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(getProj(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(4000);
	}
}
