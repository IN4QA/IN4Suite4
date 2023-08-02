package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.RE.Purchase.Test.UnpaidGRN_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class UnpaidGRN_List extends UnpaidGRN_List_Test {

	public static WebDriver iDriver;
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName = "UnpaidGRN_List";

	public UnpaidGRN_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		SheetName = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Unpaid GRN']")
	private WebElement unpaidGRN;

	public void getUnpaidGRN() {
		w2.until(ExpectedConditions.elementToBeClickable(unpaidGRN));
		unpaidGRN.click();
	}

	@FindBy(id = "ddlProject")
	private WebElement project;

	public WebElement getProject() {
		w2.until(ExpectedConditions.elementToBeClickable(project));
		return project;
	}

	@FindBy(xpath = "//input[@name='btnGo']")
	private WebElement gobutton;

	public void getGo() {
		w2.until(ExpectedConditions.elementToBeClickable(gobutton));
		gobutton.click();
	}

	@FindBy(id = "ddlStatus")
	private WebElement select;

	public WebElement getStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(select));
		return select;
	}

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(2000);
			xml = new Datatable();
			sheet = xml.excelData(SheetName, Purchase.inputpath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	public static void projectDD(WebElement comPath, String Company_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(Company_Name);
	}

	public static void statusDD(WebElement statusPath, String selectStatus) {
		Select sct = new Select(statusPath);
		sct.selectByVisibleText(selectStatus);
	}
	// ------- case1: Project wise ------//

	public void project() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			UnpaidGRNList.getUnpaidGRN();
			Frames.rightFrame();
			Thread.sleep(1000);

			projectDD(UnpaidGRNList.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(3000);
			UnpaidGRNList.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, SheetName, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", SheetName, Purchase.path);
		}
	}

	// ---- case2: project wise with status----//
	public void projectwithstatus() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			UnpaidGRNList.getUnpaidGRN();
			Frames.rightFrame();
			Thread.sleep(1000);
			projectDD(UnpaidGRNList.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			statusDD(UnpaidGRNList.getStatus(), sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(3000);
			UnpaidGRNList.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, SheetName, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", SheetName, Purchase.path);
		}
	}
}
