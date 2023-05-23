package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Marketing_Agent_Debit_Note_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Marketing_Agent_Debit_Note_List extends Marketing_Agent_Debit_Note_List_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static String fDate = "Jan 01, 2000";
	public Marketing_Agent_Debit_Note_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[contains(@href,'Marketing')][text()='Agent Debit Note']")
	private WebElement marketingAgentDebitNoteLink;
	public void getMarketingAgentDebitNoteLink() {
		marketingAgentDebitNoteLink.click();
	}
	
	@FindBy(css = "select#ddlPromotionType")
	private WebElement proj;
	public WebElement getProj() {
		return proj;
	}
	
	@FindBy(css = "input#btnPADebitListGO")
	private WebElement go;
	public void getGo() {
		 go.click();;
	}
	
	@FindBy(css = "input#dpFromDate_txtDate")
	private WebElement fdate;
	public WebElement getFdate() {
		return fdate;
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
	public void noFilter() throws Throwable {
		getMarketingAgentDebitNoteLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.seletDate(getFdate(), fDate);
		Thread.sleep(2000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(4000);
	}
	
	public void promotion() throws Throwable {
		Frames.SubMenuFrame();
		getMarketingAgentDebitNoteLink();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(getProj(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.seletDate(getFdate(), fDate);
		Thread.sleep(1000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(4000);
	}
}
