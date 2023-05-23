package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.Utilities_AreaFinalization_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Utilities_AreaFinalization_List extends Utilities_AreaFinalization_List_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Utilities_AreaFinalization_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy(xpath="//a[text()='Area Finalization']")
	private WebElement areafinal;
	public void AreaFinallinkclick() {
		areafinal.click();
	}
	@FindBy(name = "ddlProject")
	private WebElement projectDD;
	public WebElement getProjectDD() {
		return projectDD;
	}
	@FindBy(name = "ddlSubProject")
	private WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		return subprojectDD;
	}
	@FindBy(name = "ddlAreaFinSts")
	private WebElement statusDD;
	public WebElement getStatusDD() {
		return statusDD;
	}	
	@FindBy(name = "btnGo")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	
	 	public void MenuSubMenu()
	 	{
	 		try
	 		{
	 			MainMenu mm = new MainMenu(iDriver);
	 			mm.clickSales();
	 			Thread.sleep(2000);
	 			Sales en = new Sales(iDriver);
	 			en.clickUtilities();
	 			Thread.sleep(1000);
	 			xml = new Datatable();
	 			sheet = xml.excelData(sheetname,Sales.inputPath);
	 		}
	 		catch (Exception e)
	 		{
		
	 			e.printStackTrace();
	 			System.out.println("Module, Sub module click case Failed: "+e);
	 		}
	 	}
		public void mandatoryfilters() throws Throwable{
			String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
			AreaFinlist.AreaFinallinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getSubProjectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			AreaFinlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(1000);	
	}
		public void mandatorywithstatus() throws Throwable{
			String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
			Frames.SubMenuFrame();
			AreaFinlist.AreaFinallinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getSubProjectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getStatusDD(), sheet.getRow(2).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			AreaFinlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(1000);	
	}
}
