package com.RE.Purchase.ObjectRepository;

import com.RE.Purchase.Test.MaterialBuyer_List_Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialBuyer_List extends MaterialBuyer_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName;
	public static WebDriver iDriver;

	public MaterialBuyer_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		SheetName = this.getClass().getSimpleName();

	}

	@FindBy(xpath = "//a[text()='Material Buyer']")
	private WebElement materialbuyer;

	public void getmaterialbuyer() {
		w2.until(ExpectedConditions.elementToBeClickable(materialbuyer));
		materialbuyer.click();
	}

	@FindBy(name = "btnGo")
	private WebElement go;

	public void getgo() {
		w2.until(ExpectedConditions.elementToBeClickable(go));
		go.click();
	}

	@FindBy(name = "ddlCountry")
	private WebElement country;

	public WebElement getcountry() {
		w2.until(ExpectedConditions.elementToBeClickable(country));
		return country;
	}

	@FindBy(name = "ddlState")
	private WebElement state;

	public WebElement getstate() {
		w2.until(ExpectedConditions.elementToBeClickable(state));
		return state;
	}

	@FindBy(id = "ddlCity")
	private WebElement city;

	public WebElement getcity() {
		w2.until(ExpectedConditions.elementToBeClickable(city));
		return city;
	}

	public static void MainSubmenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(1000);
			Purchase en = new Purchase(iDriver);
			en.clickmasters();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(SheetName, Purchase.inputpath);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:" + e);
		}

	}

	public void go() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			materialbuyerlist.getmaterialbuyer();
			Thread.sleep(1000);
			Frames.rightFrame();
			materialbuyerlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, SheetName, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", SheetName, Purchase.path);
		}
	}

	public void location() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			materialbuyerlist.getmaterialbuyer();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(materialbuyerlist.getcountry(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(materialbuyerlist.getstate(), sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(materialbuyerlist.getcity(), sheet.getRow(2).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			materialbuyerlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, SheetName, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", SheetName, Purchase.path);
		}
	}

}
