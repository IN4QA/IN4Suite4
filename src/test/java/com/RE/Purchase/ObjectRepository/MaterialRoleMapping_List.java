package com.RE.Purchase.ObjectRepository;

import com.RE.Purchase.Test.MaterialRoleMapping_List_Test;
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

public class MaterialRoleMapping_List extends MaterialRoleMapping_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName = "MaterialRoleMapping_List";
	public static WebDriver iDriver;

	public MaterialRoleMapping_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		SheetName = this.getClass().getSimpleName();

	}

	@FindBy(xpath = "//a[text()='Material Role Mapping']")
	private WebElement materialrolemapping;

	public void getmaterialrolemapping() {
		w2.until(ExpectedConditions.elementToBeClickable(materialrolemapping));
		materialrolemapping.click();
	}

	@FindBy(id = "btnFilterGo")
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
			materialrolemappinglist.getmaterialrolemapping();
			Thread.sleep(1000);
			Frames.rightFrame();
			materialrolemappinglist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, SheetName, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", SheetName, Purchase.path);
		}

	}

}
