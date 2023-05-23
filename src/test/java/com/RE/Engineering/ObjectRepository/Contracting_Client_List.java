package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.Contracting_Client_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Contracting_Client_List extends Contracting_Client_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public Contracting_Client_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Clients']")
	private WebElement clientlink;
	public void getclient() {
		clientlink.click();
	}
	@FindBy(name = "ddStatus")
	private WebElement statusDD;
	public WebElement getstatusDD() {
		return statusDD;
	}
	
	@FindBy(name = "btnFilterGO")
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
	 sheet = xml.excelData(sheetname,Engineering.inputPath);
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
   }
	public void allclients() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		Frames.SubMenuFrame();
		clientlist.getclient();
		Thread.sleep(1000);	
		Frames.rightFrame();
		appInd.singleDropDown(getstatusDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		clientlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		}
	
	public void activeclients() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		clientlist.getclient();
		Thread.sleep(1000);	
		Frames.rightFrame();
		appInd.singleDropDown(getstatusDD(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		clientlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		}
	
	public void inactiveclients() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		clientlist.getclient();
		Thread.sleep(1000);		
		Frames.rightFrame();
		appInd.singleDropDown(getstatusDD(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		clientlist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(1000);
		}
}

