package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import com.RE.Purchase.Test.MaterialSaleReceipt_List_Test;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialSaleReceipt_List extends MaterialSaleReceipt_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;

	public MaterialSaleReceipt_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Material Sales Receipt']")
	private WebElement MaterialSaleReceipt;

	public void getMaterialSaleReceipt() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialSaleReceipt));

		MaterialSaleReceipt.click();
	}

	@FindBy(name = "ddlBuyerType")
	private WebElement BuyerType;

	public WebElement getBuyerType() {
		w2.until(ExpectedConditions.elementToBeClickable(BuyerType));

		return BuyerType;
	}

	@FindBy(name = "btnGo")
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
			en.clickPayments();
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
			MaterialSaleReceiptList.getMaterialSaleReceipt();
			Thread.sleep(1000);
			Frames.rightFrame();
			MaterialSaleReceiptList.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public void contarctor() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			MaterialSaleReceiptList.getMaterialSaleReceipt();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(1000);
			appInd.singleDropDown(MaterialSaleReceiptList.getBuyerType(),
					sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			MaterialSaleReceiptList.getgo();
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}

	}

	public void supplier() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			MaterialSaleReceiptList.getMaterialSaleReceipt();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(1000);
			appInd.singleDropDown(MaterialSaleReceiptList.getBuyerType(),
					sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			MaterialSaleReceiptList.getgo();
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public void ThirdPartyBuyer() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			MaterialSaleReceiptList.getMaterialSaleReceipt();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(1000);
			appInd.singleDropDown(MaterialSaleReceiptList.getBuyerType(),
					sheet.getRow(2).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			MaterialSaleReceiptList.getgo();
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

}
