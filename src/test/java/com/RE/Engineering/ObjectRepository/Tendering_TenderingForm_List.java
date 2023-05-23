package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.Tendering_TenderingForm_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Tendering_TenderingForm_List extends Tendering_TenderingForm_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public Tendering_TenderingForm_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Tender Opening Form']")
	private WebElement Tenderopenform;
	public void getTenderOpenFormlink() {
		Tenderopenform.click();
	}
	@FindBy(id="ddlProject")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	@FindBy(id="btnGoList")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	
	
	
	public  void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickTendering();
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
	public static void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
	}
	
		
	public  void go() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(1000);
		TenderingForm.getTenderOpenFormlink();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		TenderingForm.getGo();
		Thread.sleep(1000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
/*	public static void project() throws Throwable {
		Frames.SubMenuFrame();		
		Thread.sleep(1000);
		TenderingForm.getTenderOpenFormlink();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(TenderingForm.getProject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		TenderingForm.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}*/


}

