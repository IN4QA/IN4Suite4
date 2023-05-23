package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.AgentCreditNote_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class AgentCreditNote_List extends AgentCreditNote_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public AgentCreditNote_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
		
	}
	
	@FindBy(xpath = "//a[text()='Agent Credit Note']")
	private WebElement agentcreditnote;
	public void getagentcreditnote() {
		agentcreditnote.click();
	}
	
	@FindBy(id = "ddlCompany")
	private WebElement companyDD;
	public WebElement getcompanyDD() {
		return companyDD;
	}
	
	@FindBy(id = "ddlProjectList")
	private WebElement projectDD;
	public WebElement getprojectDD() {
		return projectDD;
	}
	
	@FindBy(name = "btnSearch")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickBilling();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void company() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(2000);
		creditnotelist.getagentcreditnote();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getcompanyDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		creditnotelist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}
	public void project() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		creditnotelist.getagentcreditnote();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getcompanyDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getprojectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		creditnotelist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}

}
