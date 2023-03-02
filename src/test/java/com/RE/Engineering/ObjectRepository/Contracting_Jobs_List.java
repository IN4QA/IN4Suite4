package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Engineering.Test.Contracting_Jobs_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Contracting_Jobs_List extends Contracting_Jobs_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	
	public  Contracting_Jobs_List(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(oDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Jobs']")
	private WebElement joblink;
	public void getjobs() {
		joblink.click();
	}
	
	@FindBy(name = "ddlStatus")
	private WebElement statusDD;
	public WebElement getstatusDD() {
		return statusDD;
	}
	@FindBy(name = "btnFilterGO")
	private WebElement gobutton;
	public void getgo() {
		gobutton.click();
	}
	
	
	public void MenuSubMenu() {
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickEngineering();
			Engineering en=new Engineering(iDriver);
			Thread.sleep(1000);
			en.clickContracting();
			Thread.sleep(1000);
			xml=new Datatable();
			sheet=xml.excelData(sheetname);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);	
		}
	}
	
	public void nofilter() throws Throwable{
		String nameofCurrrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		jobslist.getjobs();
		Thread.sleep(1000);
		Frames.rightFrame();
		jobslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrrentMethod, sheetname);
		Thread.sleep(1000);
	}
	
	public void closed() throws Throwable{
		String nameofCurrrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		jobslist.getjobs();
		Thread.sleep(1000);
		Frames.rightFrame(); 
		appInd.singleDropDown(getstatusDD(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		jobslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrrentMethod, sheetname);
		Thread.sleep(1000);
	}
	public void lost() throws Throwable{
		String nameofCurrrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		jobslist.getjobs();
		Thread.sleep(1000);
		Frames.rightFrame(); 
		appInd.singleDropDown(getstatusDD(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		jobslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrrentMethod, sheetname);
		Thread.sleep(1000);
	}
	public void open() throws Throwable{
		String nameofCurrrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		jobslist.getjobs();
		Thread.sleep(1000);
		Frames.rightFrame(); 
		appInd.singleDropDown(getstatusDD(), sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		jobslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrrentMethod, sheetname);
		Thread.sleep(1000);
	}
	public void own() throws Throwable{
		String nameofCurrrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		jobslist.getjobs();
		Thread.sleep(1000);
		Frames.rightFrame(); 
		appInd.singleDropDown(getstatusDD(), sheet.getRow(3).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		jobslist.getgo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrrentMethod, sheetname);
		Thread.sleep(1000);
	}
}
