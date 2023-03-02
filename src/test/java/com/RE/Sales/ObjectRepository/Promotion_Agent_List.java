package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.Promotion_Agent_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Promotion_Agent_List extends Promotion_Agent_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public Promotion_Agent_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Promotion Agent']")
	private WebElement promotionAgent;
	public void getPromotionAgent() {
		promotionAgent.click();
	}
	@FindBy(css = "select#ddlExpertise")
	private WebElement expertise;
	public WebElement getExpertise() {
		return expertise;
	}
	
	@FindBy(css = "input#btnSalesAgentPromotion")
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
			en.clickAgent();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	public void noFilter() throws Throwable {
		getPromotionAgent();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(4000);
	}
	
	public void expertiseCount() throws Throwable {
		Frames.SubMenuFrame();
		getPromotionAgent();
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(2000);
		Thread.sleep(1000);
		appInd.singleDropDown(getExpertise(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname);
		Thread.sleep(4000);
	}
}
