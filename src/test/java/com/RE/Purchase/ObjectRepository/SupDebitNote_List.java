package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.SupDebitNote_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class SupDebitNote_List extends SupDebitNote_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;

	public SupDebitNote_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Supplier Debit Note']")
	private WebElement suppdebitnote;

	public void getsuppdebitnote() {
		w2.until(ExpectedConditions.elementToBeClickable(suppdebitnote));
		suppdebitnote.click();
	}

	@FindBy(name = "txtCertifyingCompPO")
	private WebElement comp;

	public void getcomp() {
		w2.until(ExpectedConditions.elementToBeClickable(comp));
		comp.click();
	}

	@FindBy(name = "txtCertifyingCompPO")
	private WebElement company;

	public WebElement getcompany() {
		w2.until(ExpectedConditions.elementToBeClickable(company));
		return company;
	}

	@FindBy(name = "txtProject")
	private WebElement pro;

	public void getpro() {
		w2.until(ExpectedConditions.elementToBeClickable(pro));
		pro.click();
	}

	@FindBy(name = "txtProject")
	private WebElement project;

	public WebElement getproject() {
		w2.until(ExpectedConditions.elementToBeClickable(project));
		return project;
	}

	@FindBy(name = "btnGo")
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
			// Frames.SubMenuFrame();
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
	// public static void singleDD(WebElement comPath, String project_Name) {
	// Select sct = new Select(comPath);
	// sct.selectByVisibleText(project_Name);

	// }
	public void company() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			SupDebitNote.getsuppdebitnote();
			Thread.sleep(1000);
			Frames.rightFrame();
			SupDebitNote.getcomp();
			Thread.sleep(1000);
			SupDebitNote.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			company.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			company.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			SupDebitNote.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentmethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentmethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public void project() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			SupDebitNote.getsuppdebitnote();
			Thread.sleep(1000);
			Frames.rightFrame();
			SupDebitNote.getpro();
			Thread.sleep(1000);
			SupDebitNote.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			project.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			SupDebitNote.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentmethod, Sheetname, Purchase.path);
			Thread.sleep(2000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentmethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}
}
