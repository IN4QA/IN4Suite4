package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.AgentApp_Licensing_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class AgentApp_Licensing_List extends AgentApp_Licensing_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public AgentApp_Licensing_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
		
	}
	
	@FindBy(xpath = "//a[text()='Agent App Licensing']")
	private WebElement applicensing;
	public void getapplicensing() {
		applicensing.click();
	}
	@FindBy(name = "cboAction")
	private WebElement actionDD;
	public WebElement getactionDD() {
		return actionDD;
	}
	
	@FindBy(id = "cmdGo")
	private WebElement gobutton;
	public void getgobutton() {
		gobutton.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickAgent();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	public void nofilters() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		licensinglist.getapplicensing();
		Thread.sleep(1000);
		Frames.rightFrame();
		licensinglist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
	}
	
	public void enableuser() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		licensinglist.getapplicensing();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getactionDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		licensinglist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
	}
	public void disableuser() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		licensinglist.getapplicensing();
		Thread.sleep(1000);
		Frames.rightFrame();
		appInd.singleDropDown(getactionDD(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		licensinglist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
	}
}

