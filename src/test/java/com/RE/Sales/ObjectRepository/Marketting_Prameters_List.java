package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Sales.Test.Marketting_Prameters_List_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Marketting_Prameters_List extends Marketting_Prameters_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Marketting_Prameters_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
		
	}
	
	@FindBy(xpath="//a[text()='Parameters']")
	private WebElement parameters;
	public void getparameterslink() {
		parameters.click();
	}
	
	@FindBy(id = "btnSearch")
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
			en.clickMerketing();
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
		parameterslist.getparameterslink();
		Thread.sleep(1000);
		Frames.rightFrame();
		parameterslist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Sales.path);
		Thread.sleep(1000);
	}
}
