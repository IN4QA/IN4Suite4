package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.GRN_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class GRN_List extends GRN_List_Test{

	public static WebDriver iDriver;
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public GRN_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text() = 'GRN']")
	private WebElement GRN;
	public void getGRN() {
		GRN.click();
	}
	
	@FindBy(id = "rdoGRNCategoryList_1")
	private WebElement Asset;
	public void getAsset() {
		Asset.click();
	}
	
	@FindBy(xpath = "//select[@id = 'ddlCertifyingCompany']")
	private WebElement certiCompany;
	public WebElement getCertiCompany() {
		return certiCompany;
	}
	
	@FindBy(xpath = "//select[@id = 'ddlStatusList']")
	private WebElement status;
	public WebElement getStatus() {
		return status;
	}
	
	
	@FindBy(id = "btnFilterGO")
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
	 en.clickInventory();
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
	
	public static void companyDD(WebElement comPath, String Company_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(Company_Name);
 }
	
	public static void statusDD(WebElement statusPath, String selectStatus) {
		Select sct = new Select(statusPath);
		sct.selectByVisibleText(selectStatus);
 }
	
	
	
	//------- Material category case ------//
	
	public  void material() throws Throwable {
		
		GRNList.getGRN();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		companyDD(GRNList.getCertiCompany(),sheet.getRow(0).getCell(1).getStringCellValue());
//	    WebElement project=iDriver.findElement(By.name("txtProject"));
		GRNList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
		}
	
	//------- Asset category case ------//	
	
	public  void Asset() throws Throwable {
		
		Frames.SubMenuFrame();
		GRNList.getGRN();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		GRNList.getAsset();
		Thread.sleep(1000);
		companyDD(GRNList.getCertiCompany(),sheet.getRow(0).getCell(1).getStringCellValue());
		GRNList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
	//-----Case 3: Material Category with status -----//

	public  void materialwithstatus() throws Throwable {
		Frames.SubMenuFrame();
		GRNList.getGRN();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		companyDD(GRNList.getCertiCompany(),sheet.getRow(0).getCell(10).getStringCellValue());
		statusDD(GRNList.getStatus(),sheet.getRow(1).getCell(1).getStringCellValue());
		GRNList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
		}

	// Case 4: Asset Category with status ----//
	
	public  void assetwithstatus() throws Throwable {
		Frames.SubMenuFrame();
		GRNList.getGRN();
		Frames.rightFrame();
		Thread.sleep(1000);
		GRNList.getAsset();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		companyDD(GRNList.getCertiCompany(),sheet.getRow(0).getCell(1).getStringCellValue());
		statusDD(GRNList.getStatus(),sheet.getRow(1).getCell(1).getStringCellValue());
		GRNList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
		}
}
