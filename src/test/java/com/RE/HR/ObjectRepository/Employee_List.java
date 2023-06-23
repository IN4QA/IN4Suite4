package com.RE.HR.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.HR.Test.Employee_List_Test;
import com.RE.Submodules.HR;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Employee_List extends Employee_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static HR hr;

	public Employee_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	
	@FindBy(css = "#ddlCompany")
	private WebElement CompanyDD;
	public WebElement getCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
		return CompanyDD;
	}
	
	@FindBy(css = "#btnGO")
	private WebElement GOBtn;
	public void getGOBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(GOBtn));
		GOBtn.click();
	}
	
	@FindBy(css = "#ddlPageSize")
	private WebElement PageSizeDD;
	public WebElement getPageSizeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(PageSizeDD));
		return PageSizeDD;
	}
	
	@FindBy(css = "#ddlStatus")
	private WebElement StatusDD;
	public WebElement getStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(StatusDD));
		return StatusDD;
	}
	
	@FindBy(css = "#ddlAppUser")
	private WebElement AppUserDD;
	public WebElement getAppUserDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AppUserDD));
		return AppUserDD;
	}
	
	@FindBy(css = "#lblTotalRecords")
	private WebElement TotalRecords;
	public int getTotalRecords() {
		w2.until(ExpectedConditions.elementToBeClickable(TotalRecords));
		return Integer.parseInt(TotalRecords.getText());
	}
	
	@FindBy(xpath = "//table[@id='dgEmployeeProfileList']//tr")
	private List<WebElement> EmployeeRecordsList;
	public int getEmployeeRecordsList() {
		return (EmployeeRecordsList.size()-1);
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickHR();
			Thread.sleep(2000);
			hr = new HR(iDriver);
			hr.clickEmpList();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, HR.ListInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void employeelist_NoFilters() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.mainFrame();
		appInd.singleDropDown(getStatusDD(), "--All--");
		getGOBtn();
		appInd.singleDropDown(getPageSizeDD(), "--All--");
		int TotalAvailabe = getTotalRecords();
		printRecords(nameofCurrMethod, TotalAvailabe);
		Thread.sleep(1000);
		int ActualListed = getEmployeeRecordsList();
		printRecords(nameofCurrMethod, TotalAvailabe);
		if(TotalAvailabe == ActualListed) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, HR.ListOutPutpath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "Fail", sheetname, HR.ListOutPutpath);
		}
	}
	
	public void employeelist_Company() throws Throwable {
		hr.clickEmpList();
		Frames.mainFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getCompanyDD(), sheet.getRow(1).getCell(0).getStringCellValue());
		getGOBtn();
		appInd.singleDropDown(getPageSizeDD(), "--All--");
		int TotalAvailabe = getTotalRecords();
		printRecords(nameofCurrMethod, TotalAvailabe);
		Thread.sleep(1000);
		int ActualListed = getEmployeeRecordsList();
		printRecords(nameofCurrMethod, TotalAvailabe);
		if(TotalAvailabe == ActualListed) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, HR.ListOutPutpath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "Fail", sheetname, HR.ListOutPutpath);
		}
	}
	
	public void employeelist_InActiveStatus() throws Throwable {
		hr.clickEmpList();
		Frames.mainFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getStatusDD(), "InActive");
		getGOBtn();
		appInd.singleDropDown(getPageSizeDD(), "--All--");
		int TotalAvailabe = getTotalRecords();
		printRecords(nameofCurrMethod, TotalAvailabe);
		Thread.sleep(1000);
		int ActualListed = getEmployeeRecordsList();
		printRecords(nameofCurrMethod, TotalAvailabe);
		if(TotalAvailabe == ActualListed) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, HR.ListOutPutpath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "Fail", sheetname, HR.ListOutPutpath);
		}
	}
	
	public void employeelist_ActiveStatus() throws Throwable {
		hr.clickEmpList();
		Frames.mainFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getStatusDD(), "Active");
		getGOBtn();
		appInd.singleDropDown(getPageSizeDD(), "--All--");
		int TotalAvailabe = getTotalRecords();
		printRecords(nameofCurrMethod, TotalAvailabe);
		Thread.sleep(1000);
		int ActualListed = getEmployeeRecordsList();
		printRecords(nameofCurrMethod, TotalAvailabe);
		if(TotalAvailabe == ActualListed) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, HR.ListOutPutpath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "Fail", sheetname, HR.ListOutPutpath);
		}
	}
	
	public void employeelist_InActiveAppUser() throws Throwable {
		hr.clickEmpList();
		Frames.mainFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		appInd.singleDropDown(getAppUserDD(), "InActive");
		getGOBtn();
		appInd.singleDropDown(getPageSizeDD(), "--All--");
		int TotalAvailabe = getTotalRecords();
		printRecords(nameofCurrMethod, TotalAvailabe);
		Thread.sleep(1000);
		int ActualListed = getEmployeeRecordsList();
		printRecords(nameofCurrMethod, TotalAvailabe);
		if(TotalAvailabe == ActualListed) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, HR.ListOutPutpath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "Fail", sheetname, HR.ListOutPutpath);
		}
	}
	
	public void printRecords(String nameofCurrMethod, int TotalAvailabe) {
		System.out.println(nameofCurrMethod+" "+TotalAvailabe);
	}
}
