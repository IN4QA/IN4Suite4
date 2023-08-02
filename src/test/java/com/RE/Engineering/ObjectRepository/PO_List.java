package com.RE.Engineering.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.PO_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class PO_List extends PO_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public PO_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text() = 'Purchase Orders']")
	private WebElement poLink;
	public void getPoLink() {
		poLink.click();
	}
	
	@FindBy(xpath = "//input[@id='rdoPOStatusList_1']")
	private WebElement FFI_Radio;
	public void getFFI_Radio() {
		FFI_Radio.click();
	}
	
	@FindBy(xpath="//input[@id='rdoPOStatusList_2']")
	private WebElement Ropo;
	public void getRopo()
	{
		Ropo.click();
	}
	
	@FindBy(xpath="//input[@id='rdoPOStatusList_3']")
	private WebElement All;
	public void All()
	{
		All.click();
	}
	
	@FindBy(xpath = "//select[@id = 'ddlCertifyingCompany']")
	private WebElement CerCompany;
	public WebElement getCerCompany() {
		return CerCompany;
	}
	
	@FindBy(xpath = "//tr[@id = 'trProjSubProj']/td[2]/span/div/button")
	private WebElement project;
	public WebElement getProject() {
		return project;
	}
	
	@FindBy(xpath = "(//li[@class = 'multiselect-item multiselect-filter']/div/input)[1]")
	private WebElement project_SK;
	public WebElement getProject_Sk() {
		return project_SK;
	}
	
	@FindBy(xpath = "//tr[@id='trProjSubProj']//td[2]//button[@class = 'multiselect dropdown-toggle btn btn-default']/following-sibling::ul/li")
	private List<WebElement> list_Project_DD;
	public List<WebElement> getlist_Project_DD(){
		return list_Project_DD;
	}
	
	//Project
	@FindBy(xpath = "(//tr[@id='trProjSubProj']//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
	private WebElement projectClick;
	public WebElement getprojectClick() {
		return projectClick;
	}
	@FindBy(xpath = "(//tr[@id='trProjSubProj']//input[@placeholder='Search'])[1]")
	private WebElement entrProjectName;
	public WebElement getentrProjectName() {
		return entrProjectName;
	}
	@FindBy(xpath = "//tr[@id='trProjSubProj']//td[2]//li")
	private List<WebElement> ListedRecordsDD;
	public List<WebElement> getListedRecordsDD() {
		return ListedRecordsDD;
	}
	
	// subproject
	@FindBy(xpath = "(//tr[@id='trProjSubProj']//button[@class='multiselect dropdown-toggle btn btn-default'])[2]")
	private WebElement subprojectClick;
	public WebElement getsubprojectClick() {
		return subprojectClick;
	}

	@FindBy(xpath = "(//tr[@id='trProjSubProj']//input[@placeholder='Search'])[2]")
	private WebElement entrsubProjectName;
	public WebElement getentrsubProjectName() {
		return entrsubProjectName;
	}
	
	@FindBy(xpath = "//tr[@id='trProjSubProj']//td[4]//li")
	private List<WebElement> ListedRecordsSubDD;
	public List<WebElement> getListedRecordsSubDD() {
		return ListedRecordsSubDD;
	}
	
	@FindBy(xpath = "//input[@name='btnFilterGO']")
	private WebElement gobutton;
	public void clickgobutton() {
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
	 public static void singleDD(WebElement comPath, String Company_Name) {
			Select sct = new Select(comPath);
			sct.selectByVisibleText(Company_Name);
	 }
	 
	 public  void Unfullfilled() throws Throwable {
		 POList.getPoLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 singleDD(POList.getCerCompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		 Thread.sleep(2000);
			appInd.multiDD_withText(POList.getprojectClick(), POList.getentrProjectName(), sheet.getRow(1).getCell(1).getStringCellValue(), POList.getListedRecordsDD());
			Thread.sleep(3000);
			appInd.multiDD_withText(POList.getsubprojectClick(), POList.getentrsubProjectName(), sheet.getRow(2).getCell(1).getStringCellValue(), POList.getListedRecordsSubDD());
			Thread.sleep(2000);
			POList.clickgobutton();
			Thread.sleep(3000);
		 
		 ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		 Thread.sleep(4000);
		 
	 }
	 
	 public  void fullFilled() throws Throwable {
		 Frames.SubMenuFrame();
		 POList.getPoLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 POList.getFFI_Radio();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 singleDD(POList.getCerCompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		 
			appInd.multiDD_withText(POList.getprojectClick(), POList.getentrProjectName(), sheet.getRow(1).getCell(1).getStringCellValue(), POList.getListedRecordsDD());
			Thread.sleep(3000);
			appInd.multiDD_withText(POList.getsubprojectClick(), POList.getentrsubProjectName(),sheet.getRow(2).getCell(1).getStringCellValue(), POList.getListedRecordsSubDD());
			POList.clickgobutton();
			Thread.sleep(3000);
		 
		 ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		 Thread.sleep(4000);
		 
	 }
	
	 public  void ROPO() throws Throwable {
		 Frames.SubMenuFrame();
		 POList.getPoLink();
		 Frames.rightFrame();
		 POList.getRopo();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Thread.sleep(2000);
		 singleDD(POList.getCerCompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		 
			appInd.multiDD_withText(POList.getprojectClick(), POList.getentrProjectName(), sheet.getRow(1).getCell(1).getStringCellValue(), POList.getListedRecordsDD());
			Thread.sleep(3000);
			appInd.multiDD_withText(POList.getsubprojectClick(), POList.getentrsubProjectName(), sheet.getRow(2).getCell(1).getStringCellValue(), POList.getListedRecordsSubDD());
			POList.clickgobutton();
			Thread.sleep(3000);
		 
		 ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		 Thread.sleep(4000);
		 
	 }
	 
	 public  void All_Radio() throws Throwable {
		 Frames.SubMenuFrame();
		 POList.getPoLink();
		 Frames.rightFrame();
		 POList.All();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Thread.sleep(2000);
		 singleDD(POList.getCerCompany(), sheet.getRow(0).getCell(1).getStringCellValue());
		 
			appInd.multiDD_withText(POList.getprojectClick(), POList.getentrProjectName(), sheet.getRow(1).getCell(1).getStringCellValue(), POList.getListedRecordsDD());
			Thread.sleep(3000);
			appInd.multiDD_withText(POList.getsubprojectClick(), POList.getentrsubProjectName(), sheet.getRow(2).getCell(1).getStringCellValue(), POList.getListedRecordsSubDD());
			POList.clickgobutton();
			Thread.sleep(3000);
		 
		 ListPageCount.PageCount(nameofCurrMethod,sheetname,Engineering.path);
		 Thread.sleep(4000);
		 
	 }
}
