package com.RE.Engineering_Masters.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.RE.Engineering_Masters.Test.RateMaster_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.AppIndependentMethods;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class RateMaster_List extends RateMaster_List_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public RateMaster_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Rate Master']")
	private WebElement ratemaster;
	public void getRateMasterLink() {
		ratemaster.click();
	}
	
	@FindBy(id="ddlProjectList")
	private static WebElement project;
	public static WebElement getProject() {
		return project;
	}
	@FindBy(id="ddlSubProjectList")
	private static WebElement subproject;
	public static WebElement getSubProject() {
		return subproject;
	}
	@FindBy(id="ddlItemTypes")
	private static WebElement itemtype;
	public static WebElement getItemType() {
		return itemtype;
	}
	@FindBy(xpath="(//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
	private static 	WebElement itemcategoryDD;
	public WebElement getItemCategoryDD() {
		return itemcategoryDD;
	}
	@FindBy(xpath="(//input[@class='form-control multiselect-search'])[1]")
	WebElement itemcategorySearchBoxClick;
	public WebElement getItemCategorySearchbox() {
	return itemcategorySearchBoxClick;
	}
	
	@FindBy(xpath = "//tr[@id='trCountry']//td[6]//li ")  //   (//ul[contains(@class,'multiselect')])[1]//li[@style='display: block;']
	private List<WebElement> ListedRecordsItemCatDD;
	public List<WebElement> getListedRecordsItemCatDD() {
		return ListedRecordsItemCatDD;
	}
	
	
	@FindBy(xpath="(//button[@class='multiselect dropdown-toggle btn btn-default'])[2]")
	private static WebElement itemsubcategoryDD;
	public WebElement getItemSubCategoryDD() {
		return itemsubcategoryDD;
	}
	@FindBy(xpath=" ( //input[@class='form-control multiselect-search'])[2]")
	private WebElement itemsubcategorySearchBoxclick;
	public  WebElement getItemSubCategorySearchBoxClick() {
		return itemsubcategorySearchBoxclick;
	}
	
	@FindBy(xpath = "//tr[@id='trProjSubProj']//td[6]//li")   // //tr[@id='trProjSubProj']//td[6]//li[@style='display: block;']
	private List<WebElement> ListedRecordsItemSubCatDD;
	public List<WebElement> getListedRecordsItemSubCatDD() {
		return ListedRecordsItemSubCatDD;
	}
	
	@FindBy(id="btnSearch")
	private WebElement go;
	public void getGo() {
		go.click();
	}
	
	

	
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 Engineering.clickMasters();
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
			
	public void mandatoryfilters() throws Throwable {
		Frames.SubMenuFrame();		
		ratemasterlist.getRateMasterLink();
		Thread.sleep(1000);
		Frames.rightFrame();		
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(1000);
		appInd.singleDropDown(getProject(),sheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSubProject(),sheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getItemType(),sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.multiDD_withText(ratemasterlist.getItemCategoryDD(), ratemasterlist.getItemCategorySearchbox(), sheet.getRow(3).getCell(1).getStringCellValue(), ratemasterlist.getListedRecordsItemCatDD());
		Thread.sleep(1000);
		appInd.multiDD_withText(ratemasterlist.getItemSubCategoryDD(), ratemasterlist.getItemSubCategorySearchBoxClick(), sheet.getRow(4).getCell(1).getStringCellValue(), ratemasterlist.getListedRecordsItemSubCatDD());
		Thread.sleep(1000);
		ratemasterlist.getGo();
		Thread.sleep(3000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		Thread.sleep(2000);
		
	}
	
}