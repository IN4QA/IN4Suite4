package com.RE.Purchase.ObjectRepository;


import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Purchase.Test.RateComparision_List_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class RateComparision_List extends RateComparision_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;
	public RateComparision_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		Sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Rate Comparison']")
	private WebElement ratecomparision;
	public void getratecomparision() {
		ratecomparision.click();
	}
	@FindBy(name = "ddlcompany")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
	@FindBy(id="ddlProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(name = "btnGo")
	private WebElement go;
	public void getgo() {
		go.click();
	}
	
	public static void MenuSubMenu() {
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(1000);
			Purchase en=new Purchase(iDriver);
			en.clickquotation();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet=xml.excelData(Sheetname,Purchase.inputpath);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:"+e);
		}
	}
	
	public static void singleDD(WebElement compath, String company_name) {
	Select sct=new Select(compath);
	sct.selectByVisibleText(company_name);
	}
	public static void go() throws Throwable{
		String nameofCurrMethod=new Throwable().getStackTrace()[0].getMethodName();
		ratecomparisionlist.getratecomparision();
		Frames.rightFrame();
		Thread.sleep(1000);
		ratecomparisionlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod, Sheetname,Purchase.path);
		Thread.sleep(1000);
	}
	public static void company() throws Throwable{
		String nameofCurrMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		ratecomparisionlist.getratecomparision();
		Thread.sleep(1000);
		Frames.rightFrame();
		singleDD(ratecomparisionlist.getcompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		ratecomparisionlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod, Sheetname,Purchase.path);
		Thread.sleep(1000);
		
	}
	public static void companywithproject() throws Throwable{
		String nameofCurrMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		ratecomparisionlist.getratecomparision();
		Thread.sleep(1000);
		Frames.rightFrame();
		singleDD(ratecomparisionlist.getcompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		singleDD(ratecomparisionlist.getproject(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		ratecomparisionlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod, Sheetname,Purchase.path);
			
	}
	
}
