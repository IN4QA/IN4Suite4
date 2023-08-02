package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.SupCert_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class SupCert_List extends SupCert_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname = "SuppCert_List";
	public static WebDriver iDriver;

	public SupCert_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(name = "txtCertifyingCompPO")
	private WebElement comp;

	public void getcomp() {
		w2.until(ExpectedConditions.elementToBeClickable(comp));
		comp.click();
	}

	@FindBy(name = "txtCertifyingCompPO")
	private WebElement company;

	public WebElement getCompany() {
		w2.until(ExpectedConditions.elementToBeClickable(company));
		return company;
	}

	@FindBy(name = "txtProject")
	private WebElement pro;

	public void getpro() {
		w2.until(ExpectedConditions.elementToBeClickable(pro));
		pro.click();
	}

	@FindBy(xpath = "//a[text()='Supplier Certificates']")
	private WebElement Supcert;

	public void getSupcert() {
		w2.until(ExpectedConditions.elementToBeClickable(Supcert));
		Supcert.click();
	}

	@FindBy(name = "txtProject")
	private WebElement project;

	public WebElement getproject() {
		w2.until(ExpectedConditions.elementToBeClickable(project));
		return project;
	}

	@FindBy(name = "btnFilterGO")
	private WebElement Go;

	public void getGo() {
		w2.until(ExpectedConditions.elementToBeClickable(Go));
		Go.click();
	}

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(2000);
			Purchase en = new Purchase(iDriver);
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

	public void company() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.rightFrame();
			SupCertList.getcomp();
			Thread.sleep(1000);
			SupCertList.getCompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			company.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			company.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			SupCertList.getGo();
			Thread.sleep(3000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public void project() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			SupCertList.getSupcert();
			Frames.rightFrame();
			SupCertList.getpro();
			SupCertList.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			project.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			SupCertList.getGo();
			Thread.sleep(3000);
			ListPageCount.PageCount(nameofCurrMethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}
}
