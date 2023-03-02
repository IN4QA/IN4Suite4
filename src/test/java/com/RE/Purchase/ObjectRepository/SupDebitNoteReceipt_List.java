package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Test.SupDebitNoteReceipt_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class SupDebitNoteReceipt_List extends SupDebitNoteReceipt_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "SupDebitNoteReceipt_List";
	public static WebDriver iDriver;
	public SupDebitNoteReceipt_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
	@FindBy(xpath="//a[text()='Supplier Debit Note Receipt']")
	private WebElement SupDebitNoteReceipt;
	public void getSupDebitNoteReceipt(){
		SupDebitNoteReceipt.click();
	}
	@FindBy(name = "txtCertifyingComp")
	private WebElement comp;
	public void getcomp() {
		comp.click();
	}
	@FindBy(name = "txtCertifyingComp")
	private WebElement company;
	public WebElement getcompany(){
		return company;
	}
	@FindBy(id = "txtProject")
	private WebElement pro;
	public void getpro() {
		pro.click();
	}
	@FindBy(id = "txtProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(name = "btnFilterGO")
	private WebElement Go;
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
	 sheet = xml.excelData("SupDebitNoteRec List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed:"+e);
	 	}
}
	 public void company() throws Throwable{
		 String nameofCurrentmethod=new Throwable().getStackTrace()[0].getMethodName();
		 SupRecList.getSupDebitNoteReceipt();
		 Thread.sleep(1000);
		 Frames.rightFrame();
		 SupRecList.getcomp();
		 Thread.sleep(1000);
		 SupRecList.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 SupRecList.getpro();
		 Thread.sleep(1000);
		 SupRecList.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(4000);
		 project.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 SupRecList.getGo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrentmethod, sheetname);
		 Thread.sleep(2000);

	 }
	 

}
