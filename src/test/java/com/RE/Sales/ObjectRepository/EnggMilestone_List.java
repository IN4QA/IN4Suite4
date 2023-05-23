package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Test.EnggMilestone_List_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class EnggMilestone_List extends EnggMilestone_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public EnggMilestone_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Engg. Milestone ']")
	private WebElement enggMilestonelink;
	public void getEnggMilestonelink() {
		enggMilestonelink.click();
	}
	
	@FindBy(css = "select#ddlProjectList")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	
	@FindBy(css = "input#btnEnggEventsSearch")
	private WebElement go;
	public void getGo() {
		 go.click();;
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickenggMilestone();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void projectCount() throws Throwable {
		Thread.sleep(2000);
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(2000);
		appInd.singleDropDown(getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(4000);
	}
}
