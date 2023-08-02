package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.RE.Purchase.Test.Quotation_Test_List;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Quotation_List extends Quotation_Test_List {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname = "Quotation_List";
	public static WebDriver iDriver;

	public Quotation_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Quotation']")
	private WebElement quotation;

	public void getQuotation() {
		w2.until(ExpectedConditions.elementToBeClickable(quotation));
		quotation.click();
	}

	@FindBy(id = "rbnFilter_0")
	private WebElement withrfq;

	public void getwithrfq() {
		w2.until(ExpectedConditions.elementToBeClickable(withrfq));
		withrfq.click();
	}

	@FindBy(id = "rbnFilter_1")
	private WebElement withoutrfq;

	public void getwithoutrfq() {
		w2.until(ExpectedConditions.elementToBeClickable(withoutrfq));
		withoutrfq.click();
	}

	@FindBy(id = "rbnFilter_2")
	private WebElement all;

	public void getall() {
		w2.until(ExpectedConditions.elementToBeClickable(all));
		all.click();
	}

	@FindBy(name = "ddlProject")
	private WebElement project;

	public WebElement getproject() {
		w2.until(ExpectedConditions.elementToBeClickable(project));
		return project;
	}

	@FindBy(name = "btnSearchQuotation")
	private WebElement go;

	public void getgo() {
		w2.until(ExpectedConditions.elementToBeClickable(go));
		go.click();
	}

	public static void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(2000);
			Purchase en = new Purchase(iDriver);
			Frames.SubMenuFrame();
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

	public static void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);

	}

	public static void WithRfq() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Quotationlist.getQuotation();
			Thread.sleep(1000);
			Frames.rightFrame();
			Quotationlist.getwithrfq();
			Thread.sleep(1000);
			Quotationlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public static void withoutrfq() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			Thread.sleep(1000);
			Quotationlist.getQuotation();
			Thread.sleep(1000);
			Frames.rightFrame();
			Quotationlist.getwithoutrfq();
			Thread.sleep(1000);
			Quotationlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public static void all() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			Thread.sleep(1000);
			Quotationlist.getQuotation();
			Thread.sleep(1000);
			Frames.rightFrame();
			Quotationlist.getall();
			Thread.sleep(1000);
			Quotationlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public static void projectwithrfq() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			Quotationlist.getQuotation();
			Frames.rightFrame();
			singleDD(Quotationlist.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
			Quotationlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public static void projectwithoutrfq() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			Quotationlist.getQuotation();
			Thread.sleep(1000);
			Frames.rightFrame();
			Quotationlist.getwithoutrfq();
			singleDD(Quotationlist.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			Quotationlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, Sheetname, Purchase.path);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public static void projectall() throws Exception {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			Quotationlist.getQuotation();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(1000);
			Quotationlist.getall();
			Thread.sleep(1000);
			singleDD(Quotationlist.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			Quotationlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", Sheetname, Purchase.path);
		}

	}
}
