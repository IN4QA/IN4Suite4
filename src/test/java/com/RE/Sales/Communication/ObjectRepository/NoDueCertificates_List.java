package com.RE.Sales.Communication.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Communication.Test.NoDueCertificates_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class NoDueCertificates_List extends NoDueCertificates_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static String fdate="01-01-2019";
	
	public NoDueCertificates_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='No Due Certificates']")
	private WebElement NoDueCertificates;
	public void getNoDueCertificates() {
		NoDueCertificates.click();
	}
	
	@FindBy(id = "ddlProjectList")
	private WebElement project;
	public WebElement project() {
		return project;
	}
	
	@FindBy(id = "dtFromDate_txtDate")
	private WebElement Date;
	public WebElement getDate() {
		return Date;
	}
	
	@FindBy(name = "btnGo")
	private WebElement GoButton;
	public void GoButton() {
		GoButton.click();
	}
	

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickCommunication();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void nofilter() throws Throwable{
		String nemeofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		NoDueCertificatesList.getNoDueCertificates();
		Thread.sleep(1000);
		Frames.rightFrame();
		NoDueCertificatesList.GoButton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nemeofCurrentMethod, sheetname, Sales.path);
		Thread.sleep(1000);
	}
	public void projectwithdate() throws Throwable{
		String nemeofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		NoDueCertificatesList.getNoDueCertificates();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(project(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getDate(), fdate);
		Thread.sleep(1000);
		NoDueCertificatesList.GoButton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nemeofCurrentMethod, sheetname, Sales.path);
		Thread.sleep(1000);
	}
}
