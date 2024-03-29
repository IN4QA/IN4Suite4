package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.RE.Purchase.Test.MaterialSales_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialSales_List extends MaterialSales_List_Test {

	public static WebDriver iDriver;
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;

	public MaterialSales_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//td[@id='Root']//tr[8]")
	private WebElement materialsales;

	public void getMaterialSales() {
		w2.until(ExpectedConditions.elementToBeClickable(materialsales));

		materialsales.click();
	}

	@FindBy(id = "rdoSalesList_1")
	private WebElement asset;

	public void getAsset() {
		w2.until(ExpectedConditions.elementToBeClickable(asset));

		asset.click();
	}

	@FindBy(id = "ddlFromStore")
	private WebElement store;

	public WebElement getStore() {
		w2.until(ExpectedConditions.elementToBeClickable(store));

		return store;
	}

	@FindBy(xpath = "//input[@id='btnGo']")
	private WebElement go;

	public void getGo() {
		w2.until(ExpectedConditions.elementToBeClickable(go));

		go.click();
	}

	public static void storeDD(WebElement statusPath, String selectStatus) {
		Select sct = new Select(statusPath);
		sct.selectByVisibleText(selectStatus);
	}

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(2000);
			xml = new Datatable();
			sheet = xml.excelData(Sheetname, Purchase.inputpath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	// ------- case1: material wise ------//

	public void material() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		try {
			MaterialSalesList.getMaterialSales();
			Frames.rightFrame();
			Thread.sleep(1000);

//	    storeDD(MaterialSalesList.getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
			MaterialSalesList.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}

	}

	public void asset() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			MaterialSalesList.getMaterialSales();
			Frames.rightFrame();
			MaterialSalesList.getAsset();
			Thread.sleep(1000);
//	    storeDD(MaterialSalesList.getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
			MaterialSalesList.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}

	}

	public void materialwithfromstore() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			MaterialSalesList.getMaterialSales();
			Frames.rightFrame();
			Thread.sleep(2000);
			storeDD(MaterialSalesList.getStore(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			MaterialSalesList.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}

	}
}
