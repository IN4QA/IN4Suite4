package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Test.ServDebitNote_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;


public class ServDebitNote_List extends ServDebitNote_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String SheetName="ServDebitNote_List";
	public static WebDriver iDriver;
	public ServDebitNote_List(WebDriver odriver) {
		iDriver=odriver;
		PageFactory.initElements(iDriver, this);
	}
	
	@FindBy(xpath="//a[text()='Service Debit Note']")
	private WebElement serdebitnote;
	public void getserdebitnote() {
		serdebitnote.click();
	}
	@FindBy(name="txtCertifyingCompPO")
	private WebElement comp;
	public void getcomp() {
		comp.click();
	}
	@FindBy(name="txtCertifyingCompPO")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
		@FindBy(name="txtProject")
		private WebElement proj;
		public void getproj() {
			proj.click();
		}
		@FindBy(name="txtProject")
		private WebElement project;
		public WebElement getproject() {
			return project;
		}
		
	@FindBy(id="btnGo")
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
	 sheet = xml.excelData("ServDebitNote List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed:"+e);
	 	}
}
	 public void company() throws Throwable {
		 String nameofCurrentmethod= new Throwable().getStackTrace()[0].getMethodName();
		 ServDebitNoteList.getserdebitnote();
		 Thread.sleep(1000);
		 Frames.rightFrame();
		 ServDebitNoteList.getcomp();
		 ServDebitNoteList.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 ServDebitNoteList.getGo();
		 Thread.sleep(1000);
		 ListPageCount.PageCount(nameofCurrentmethod,SheetName);
		 Thread.sleep(1000);
	 }
	 
	 public void companywithproject() throws Throwable{
		 String nameofCurrentmethod=new Throwable().getStackTrace()[0].getMethodName();
		 Frames.SubMenuFrame();
		 ServDebitNoteList.getserdebitnote();
		 Thread.sleep(1000);
		 Frames.rightFrame();
		 ServDebitNoteList.getcomp();
		 ServDebitNoteList.getcompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 company.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 ServDebitNoteList.getproj();
		 ServDebitNoteList.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 project.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 ServDebitNoteList.getGo();
		 ListPageCount.PageCount(nameofCurrentmethod, SheetName);
		 Thread.sleep(1000);
		 
		 
	 }
	

}
