package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.BondRequest_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class BondRequest_List extends BondRequest_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public BondRequest_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Bond Request']")
	private WebElement bondrequest;
	public void getbondrequest() {
		bondrequest.click();
	}
	@FindBy(id = "ddlClient")
	private WebElement clientDD;
	public WebElement getclientname() {
		return clientDD;
	}
	
	@FindBy(name = "btnGo")
	private WebElement gobutton;
	public void getgobutton() {
		gobutton.click();
	}
	public void MenuSubMenu() throws Throwable{
		try {
			
		MainMenu mm=new MainMenu(iDriver);
		mm.clickEngineering();
		Engineering en=new Engineering(iDriver);
		Thread.sleep(1000);
		en.clickContracting();
		Thread.sleep(1000);		
		xml=new Datatable();
		sheet=xml.excelData(sheetname,Engineering.inputPath);
	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	
	public void clientname() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		bondrequestlist.getbondrequest();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getclientname(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		bondrequestlist.getgobutton();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		
	}

}
