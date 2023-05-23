package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.Utilities_BankDetails_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Utilities_BankDetails_List extends Utilities_BankDetails_List_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Utilities_BankDetails_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy(xpath="//a[text()='Bank Detail(s)']")
	private WebElement bankdetaillink;
	public void Bankdetaillinkclick() {
		bankdetaillink.click();
	}
	@FindBy(name = "ddlprojectList")
	private WebElement projectDD;
	public WebElement getProjectDD() {
		return projectDD;
	}
	@FindBy(name = "ddlSubProject")
	private WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		return subprojectDD;
	}
	@FindBy(name = "btnGO")
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
		public void go() throws Throwable{
			String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
			Bankdetaillinkclick();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(getProjectDD(), sheet.getRow(0).getCell(1).getStringCellValue());
			appInd.singleDropDown(getSubProjectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			bankdetails.getgo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
			Thread.sleep(2000);	
	}
}
