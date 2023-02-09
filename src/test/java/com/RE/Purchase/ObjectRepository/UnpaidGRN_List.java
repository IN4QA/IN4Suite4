package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Purchase.Test.UnpaidGRN_List_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class UnpaidGRN_List extends UnpaidGRN_List_Test{

	public static WebDriver iDriver;
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "UnpaidGRN_List";
	public UnpaidGRN_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Unpaid GRN']")
	private WebElement unpaidGRN;
	public void getUnpaidGRN() {
		unpaidGRN.click();
	}
	
	@FindBy(id = "ddlProject")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	
	 @FindBy(xpath="//input[@name='btnGo']") 
	 private WebElement gobutton;
	 public  void getGo()
	   {
		  gobutton.click();
	   }
	 
	 @FindBy(id="ddlStatus") 
	 private WebElement select;
	 public  WebElement getStatus()
	   {
		  return select;
	   }
	 
	 
	 
	public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickPurchase();
	 Thread.sleep(2000);
	 xml = new Datatable();
	 sheet = xml.excelData("UnpaidGRN List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}

	
	public static void projectDD(WebElement comPath, String Company_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(Company_Name);
}
	
	public static void statusDD(WebElement statusPath, String selectStatus) {
		Select sct = new Select(statusPath);
		sct.selectByVisibleText(selectStatus);
}
	//------- case1: Project wise ------//
	
		public static void project() throws Throwable {
			
			Frames.SubMenuFrame();
			UnpaidGRNList.getUnpaidGRN();
			Frames.rightFrame();
			Thread.sleep(1000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			projectDD(UnpaidGRNList.getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
			UnpaidGRNList.getGo();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(2000);
			}
		

  //---- case2: project wise with status----//
        public static void projectwithstatus() throws Throwable {
	
        	Frames.SubMenuFrame();
        	UnpaidGRNList.getUnpaidGRN();
        	Frames.rightFrame();
        	Thread.sleep(1000);
        	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        	projectDD(UnpaidGRNList.getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
        	Thread.sleep(1000);
        	statusDD(UnpaidGRNList.getStatus(),sheet.getRow(1).getCell(1).getStringCellValue());
        	UnpaidGRNList.getGo();
        	Thread.sleep(2000);
        	ListPageCount.PageCount(nameofCurrMethod, sheetname);
        	Thread.sleep(2000);
        	}
    	}	
	