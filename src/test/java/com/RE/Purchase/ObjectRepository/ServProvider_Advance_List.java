package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Test.ServProvider_Advance_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class ServProvider_Advance_List extends ServProvider_Advance_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;

	public ServProvider_Advance_List(WebDriver oDriver) {

		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Service Provider Advances']")
	private WebElement serviceadvance;

	public void getadvancelink() {
		w2.until(ExpectedConditions.elementToBeClickable(serviceadvance));
		serviceadvance.click();
	}

	@FindBy(name = "txtCertifyingCompPO")
	private WebElement clickcomp;

	public void getcomp() {
		w2.until(ExpectedConditions.elementToBeClickable(clickcomp));
		clickcomp.click();
	}

	@FindBy(name = "txtCertifyingCompPO")
	private WebElement companyDD;

	public WebElement getcompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(companyDD));
		return companyDD;
	}

	@FindBy(name = "txtProject")
	private WebElement clickproject;

	public void getproj() {
		w2.until(ExpectedConditions.elementToBeClickable(clickproject));
		clickproject.click();
	}

	@FindBy(name = "txtProject")
	private WebElement projectDD;

	public WebElement getprojectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(projectDD));
		return projectDD;
	}

	@FindBy(id = "btnFilterGO")
	private WebElement gobutton;

	public void getgobutton() {
		w2.until(ExpectedConditions.elementToBeClickable(gobutton));
		gobutton.click();
	}

	public void MenuSubMenu() throws Throwable {
		MainMenu mm = new MainMenu(iDriver);
		mm.clickPurchase();
		Purchase en = new Purchase(iDriver);
		en.clickPayments();
		Thread.sleep(2000);
		xml = new Datatable();
		sheet = xml.excelData(Sheetname, Purchase.inputpath);

	}

	public void company() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			advancelist.getadvancelink();
			Thread.sleep(1000);
			Frames.rightFrame();
			advancelist.getcomp();
			Thread.sleep(1000);
			advancelist.getcompanyDD().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			companyDD.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			companyDD.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			advancelist.getgobutton();
			Thread.sleep(3000);
			ListPageCount.PageCount(nameofCurrentMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

	public void project() throws Throwable {
		String nameofCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			Frames.SubMenuFrame();
			advancelist.getadvancelink();
			Thread.sleep(1000);
			Frames.rightFrame();
			advancelist.getcomp();
			Thread.sleep(1000);
			advancelist.getcompanyDD().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			companyDD.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			companyDD.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			advancelist.getprojectDD().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			projectDD.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			projectDD.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			advancelist.getgobutton();
			Thread.sleep(3000);
			ListPageCount.PageCount(nameofCurrentMethod, Sheetname, Purchase.path);
			Thread.sleep(1000);
		} catch (Exception e) {
			Datatable.writeExcel(nameofCurrentMethod, "Exception FAIL", Sheetname, Purchase.path);
		}
	}

}
