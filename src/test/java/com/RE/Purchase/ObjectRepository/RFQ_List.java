package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.RFQ_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class RFQ_List extends RFQ_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;

	public RFQ_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='RFQ']")
	private WebElement rfq;

	public void getrfqlink() {
		w2.until(ExpectedConditions.elementToBeClickable(rfq));
		rfq.click();
	}

	@FindBy(id = "Button3")
	private WebElement go;

	public void getgo() {
		w2.until(ExpectedConditions.elementToBeClickable(go));
		go.click();
	}

	@FindBy(name = "ddlcert")
	private WebElement company;

	public WebElement getcompany() {
		w2.until(ExpectedConditions.elementToBeClickable(company));
		return company;
	}

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(2000);
			Purchase en = new Purchase(iDriver);
			// Frames.SubMenuFrame();
			Thread.sleep(2000);
			en.clickquotation();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(Sheetname, Purchase.inputpath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:" + e);
		}
	}

	public void go() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			rfqlist.getrfqlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(1000);
			rfqlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public void company() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			rfqlist.getrfqlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(rfqlist.getcompany(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			rfqlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}
}
