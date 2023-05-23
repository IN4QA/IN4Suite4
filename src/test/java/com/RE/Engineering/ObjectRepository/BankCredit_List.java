package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.BankCredit_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class BankCredit_List extends BankCredit_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String Sheetname;
	public static WebDriver iDriver;
	
	public BankCredit_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(oDriver, this);
		Sheetname=this.getClass().getSimpleName();
		}
	
	@FindBy(xpath="//a[text()='Bank Credit']")
	private WebElement bankcredit;
	public void getbankcredit() {
		bankcredit.click();
	}
	
	@FindBy(name = "ddlCompanies")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
	
	@FindBy(name = "btnGO")
	private WebElement gobutton;
	public void getgobutton() {
		gobutton.click();
	}
	
	public void MainSubMenu() throws Throwable{
		try {
			
			MainMenu mm=new MainMenu(iDriver);
			mm.clickEngineering();
			Engineering en=new Engineering(iDriver);
			en.clickContracting();
			Thread.sleep(1000);
			xml=new Datatable();
			sheet=xml.excelData(Sheetname,Engineering.inputPath);
				
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	
	public void company() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		bankcreditlist.getbankcredit();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getcompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		bankcreditlist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, Sheetname,Engineering.path);
		
	}

}
