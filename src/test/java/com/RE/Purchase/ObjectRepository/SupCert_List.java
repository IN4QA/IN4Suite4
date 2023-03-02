package com.RE.Purchase.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Test.SupCert_List_Test;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class SupCert_List extends SupCert_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "SuppCert_ListTest";
	public static WebDriver iDriver;
	public SupCert_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}

	
	@FindBy(name = "txtCertifyingCompPO")
	private WebElement comp;
	public void getcomp() {
		comp.click();
	}
	@FindBy(name = "txtCertifyingCompPO")
	private WebElement company;
	public WebElement getCompany() {
		return company;
	}
	@FindBy(name = "txtProject")
	private WebElement pro;
	public void getpro() {
		pro.click();
	}
	@FindBy(xpath="//a[text()='Supplier Certificates']")
	private WebElement Supcert;
	public void getSupcert(){
		Supcert.click();
	}
	
	@FindBy(name = "txtProject")
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
	 sheet = xml.excelData("Suppcert List");
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed:"+e);
	 	}
}
	// public static void singleDD(WebElement comPath, String project_Name) {
	//		Select sct = new Select(comPath);
	//		sct.selectByVisibleText(project_Name);

	//}
	 public void company() throws Throwable{
			//Frames.SubMenuFrame();
			//Thread.sleep(1000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Frames.rightFrame();
			SupCertList.getcomp();
			//Frames.rightFrame();
			SupCertList.getCompany().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
//			System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//			project.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			 Thread.sleep(1000);
			 company.sendKeys(Keys.ARROW_DOWN);
			 Thread.sleep(1000);
			 company.sendKeys(Keys.ENTER);
			 Thread.sleep(1000);
			 SupCertList.getGo();
			 ListPageCount.PageCount(nameofCurrMethod,sheetname);
			Thread.sleep(2000);
		}
	 public void project() throws Throwable{
		 Frames.SubMenuFrame();
		 SupCertList.getSupcert();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Frames.rightFrame();
			SupCertList.getpro();
			SupCertList.getproject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			project.sendKeys(Keys.ARROW_DOWN);
			 Thread.sleep(1000);
			 project.sendKeys(Keys.ENTER);
			 Thread.sleep(1000);
			 SupCertList.getGo();
			 ListPageCount.PageCount(nameofCurrMethod,sheetname);
			Thread.sleep(2000);
	 }
}
