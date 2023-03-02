package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering.Test.BondPayment_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class BondPayment_List extends BondPayment_List_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public BondPayment_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}

	@FindBy(xpath="//a[text()='Bond Payment']")
	private WebElement bondpaymentlink;
	public void getbondpaymentlink() {
		bondpaymentlink.click();
	}
	@FindBy(name = "ddlBank")
	private WebElement bankDD;
	public WebElement getbanname() {
		return bankDD;
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
	 			mm.clickEngineering();
	 			Thread.sleep(2000);
	 			Engineering en = new Engineering(iDriver);
	 			en.clickContracting();
	 			Thread.sleep(1000);
	 			xml = new Datatable();
	 			sheet = xml.excelData(sheetname);
	 		}
	 		catch (Exception e)
	 		{
		
	 			e.printStackTrace();
	 			System.out.println("Module, Sub module click case Failed: "+e);
	 		}
	 	}
		public void bankname() throws Throwable{
			String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
			bondpaymentlist.getbondpaymentlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			appInd.singleDropDown(getbanname(), sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			bondpaymentlist.getgo();
			Thread.sleep(1000);
			ListPageCount.PageCount(nameofCurrentMethod, sheetname);
			Thread.sleep(1000);	
	}
}
