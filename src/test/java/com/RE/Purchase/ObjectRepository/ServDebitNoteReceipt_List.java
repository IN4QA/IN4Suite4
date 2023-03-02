package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Test.ServDebitNoteReceipt_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class ServDebitNoteReceipt_List extends ServDebitNoteReceipt_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName="ServDebitNoteReceipt_List" ;
	public static WebDriver iDriver;
	public  ServDebitNoteReceipt_List(WebDriver odriver) {
		iDriver=odriver;
		PageFactory.initElements(iDriver,this);
		
	}
	@FindBy(xpath="//a[text()='Service Debit Note Receipt']")
	public WebElement servdebnoterecipt;
	public void getservdebnoterecipt() {
		servdebnoterecipt.click();
	}
	@FindBy(name="txtCertifyingComp")
	public WebElement comp;
	public void getcomp() {
		comp.click();
	}
	@FindBy(name="txtCertifyingComp")
	public WebElement company;
	public WebElement getcompany() {
		return company;
	}
	@FindBy(name="txtProject")
	public WebElement proj;
	public void getproj() {
		proj.click();
	}
	@FindBy(name="txtProject")
	public WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(name="btnFilterGO")
	public WebElement Go;
	public void getGo() {
		Go.click();
	}
	
	 public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	mm.clickPurchase();
	 Thread.sleep(2000);
	 Purchase en = new Purchase(iDriver);
	// Frames.SubMenuFrame();
	 Thread.sleep(2000);
	 en.clickPayments();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData("ServDebitNoteReceipt List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed:"+e);
	 	}
}
	 public void companyproject() throws Throwable{
		 String nameofCurrentmethod=new Throwable().getStackTrace()[0].getMethodName();
		 ServDebitNoteReceipt.getservdebnoterecipt();
		 Thread.sleep(1000);
		 Frames.rightFrame();
		 ServDebitNoteReceipt.getcomp();
		 Thread.sleep(1000);
		 ServDebitNoteReceipt.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ENTER);
		 ServDebitNoteReceipt.getproj();
		 Thread.sleep(1000);
		 ServDebitNoteReceipt.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ENTER);
		 ServDebitNoteReceipt.getGo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrentmethod, SheetName);
		 Thread.sleep(1000);
		 }
	
}
