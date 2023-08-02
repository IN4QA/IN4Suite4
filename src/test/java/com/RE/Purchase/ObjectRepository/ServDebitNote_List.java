package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.ServDebitNote_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class ServDebitNote_List extends ServDebitNote_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName;
	public static WebDriver iDriver;

	public ServDebitNote_List(WebDriver odriver) {
		iDriver = odriver;
		PageFactory.initElements(iDriver, this);
		SheetName = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Service Provider Debit Note']")
	private WebElement serdebitnote;

	public void getserdebitnote() {
		w2.until(ExpectedConditions.elementToBeClickable(serdebitnote));
		serdebitnote.click();
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
	private WebElement proj;

	public void getproj() {
		w2.until(ExpectedConditions.elementToBeClickable(proj));
		proj.click();
	}

	@FindBy(name = "txtProject")
	private WebElement project;

	public WebElement getproject() {
		w2.until(ExpectedConditions.elementToBeClickable(project));
		return project;
	}

	@FindBy(id = "btnGo")
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
			sheet = xml.excelData(SheetName, Purchase.inputpath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:" + e);
		}
	}

	public void company() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			ServDebitNoteList.getserdebitnote();
			Thread.sleep(1000);
			Frames.rightFrame();
			ServDebitNoteList.getcomp();
			ServDebitNoteList.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			company.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			company.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			ServDebitNoteList.getGo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentmethod, SheetName, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentmethod, "Exception FAIL", SheetName, Purchase.path);
		}
	}

	public void companywithproject() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			ServDebitNoteList.getserdebitnote();
			Thread.sleep(1000);
			Frames.rightFrame();
			ServDebitNoteList.getcomp();
			ServDebitNoteList.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			company.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			company.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			ServDebitNoteList.getproj();
			ServDebitNoteList.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			project.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			ServDebitNoteList.getGo();
			ListPageCount.PageCount(nameofCurrentmethod, SheetName, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentmethod, "Exception FAIL", SheetName, Purchase.path);
		}

	}

}
