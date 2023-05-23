package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.RE.Engineering.Test.Issue_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Issue_List extends Issue_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public Issue_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Issue Inventory']")
	private WebElement issueInventry;
	public void getIssueInventry() {
		issueInventry.click();
	}
	
	@FindBy(id = "ddlProjectList")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	@FindBy(id="ddlStatus")
	private WebElement status;
	public WebElement getstatus() {
		return status;
	}
	
	@FindBy(xpath = "//input[@id='btnFilterGo']")
	private WebElement go;
	public void getGo() {
		 go.click();
	}
	
	@FindBy(xpath = "//input[@id='rdoIssueCategoryList_1']")
	private WebElement asset;
	public void getAsset() {
		asset.click();
	}
	
	public  void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 Engineering.clickInventory();
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
	
	public  void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
}
	
	public  void material() throws Throwable {
		IssueList.getIssueInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(IssueList.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		IssueList.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
	public  void asset() throws Throwable {
		Frames.SubMenuFrame();
		IssueList.getIssueInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		IssueList.getAsset();
		Thread.sleep(2000);
		singleDD(IssueList.getproject(), sheet.getRow(0).getCell(1).getStringCellValue());
		IssueList.getGo();
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
   
public  void matstatus() throws Throwable {
		Frames.SubMenuFrame();
		IssueList.getIssueInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(IssueList.getstatus(), sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		IssueList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
    }
}

