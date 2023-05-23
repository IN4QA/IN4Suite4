package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Biling_SolicitorReceipt_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Biling_SolicitorReceipt_List extends Biling_SolicitorReceipt_List_Test{
	

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	
	public Biling_SolicitorReceipt_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Solicitor Receipts']")
	private WebElement SolicitorReceip;
	public void getSolicitorReceipLink() {
		SolicitorReceip.click();
	}
	@FindBy(name = "ddlProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	
	@FindBy(id = "btnStackholderReceiptsList")
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
	
	public void nofilters() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		SolicitorReceiptList.getSolicitorReceipLink();
		Thread.sleep(1000);
		Frames.rightFrame();
		SolicitorReceiptList.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod,sheetname,Sales.path);
		Thread.sleep(1000);
		}
	
	public void project() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SolicitorReceiptList.getSolicitorReceipLink();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		SolicitorReceiptList.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
		}
}
