package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.MaterialMasters_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class MaterialMaster_List extends MaterialMasters_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName;
	public static WebDriver iDriver;

	public MaterialMaster_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		SheetName = this.getClass().getSimpleName();

	}

	@FindBy(xpath = "//a[text()='Materials']")
	private WebElement materials;

	public void getmaterials() {
		w2.until(ExpectedConditions.elementToBeClickable(materials));
		materials.click();
	}

	@FindBy(name = "txtMaterialType")
	private WebElement materialtype;

	public void getmaterialtype() {
		w2.until(ExpectedConditions.elementToBeClickable(materialtype));
		materialtype.click();
	}

	@FindBy(name = "txtMaterialType")
	private WebElement selctmattype;

	public WebElement getselctmattype() {
		w2.until(ExpectedConditions.elementToBeClickable(selctmattype));
		return selctmattype;
	}

	@FindBy(name = "btnFilterGo")
	private WebElement go;

	public void getgo() {
		w2.until(ExpectedConditions.elementToBeClickable(go));
		go.click();
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

	public static void go() throws Throwable {

		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			materiallist.getmaterials();
			Frames.rightFrame();
			Thread.sleep(1000);
			materiallist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, SheetName, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", SheetName, Purchase.path);
		}
	}

	public static void materialtype() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			materiallist.getmaterials();
			Frames.rightFrame();
			materiallist.getmaterialtype();
			Thread.sleep(1000);
			materiallist.getselctmattype().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			materiallist.getselctmattype().sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			materiallist.getselctmattype().sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			materiallist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, SheetName, Purchase.path);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", SheetName, Purchase.path);
		}

	}
}
