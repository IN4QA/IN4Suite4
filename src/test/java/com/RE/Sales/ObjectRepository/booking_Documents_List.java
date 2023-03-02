package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.booking_Documents_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class booking_Documents_List extends booking_Documents_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public booking_Documents_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Booking Documents')]")
	private WebElement bookingDocumentsLink;
	public void getbookingDocumentsLink() {
		bookingDocumentsLink.click();
	}
	
	@FindBy(css = "select#ddlProjectList")
	private WebElement proj;
	public WebElement getProj() {
		return proj;
	}
	
	@FindBy(css = "input#btnsearch")
	private WebElement go;
	public void getGo() {
		 go.click();;
	}
	
	@FindBy(css = "select#ddlSubProjectList")
	private WebElement subProj;
	public WebElement getsubProj() {
		return subProj;
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickCommunication();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void project() throws Throwable {
		Frames.SubMenuFrame();
		getbookingDocumentsLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(getProj(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getsubProj(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(4000);
	}
}
