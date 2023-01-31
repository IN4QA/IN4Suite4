package com.RE.Engineering.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.PO_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class PO_List extends PO_List_Test{
	

	public static WebDriver iDriver;
	public PO_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
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
	
	 public static void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickInventory();
	 Thread.sleep(1000);
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
}
	 public static void singleDD(WebElement comPath, String Company_Name) {
			WebElement Certifying_Company = oBrowser.findElement(By.xpath("//select[@id = 'ddlCertifyingCompany']"));
			Select sct = new Select(Certifying_Company);
			sct.selectByVisibleText(Company_Name);
	 }
	 
	 public static void Unfullfilled() throws Throwable {
		 POList.getPoLink();
		 Frames.rightFrame();
		 Thread.sleep(2000);
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 WebElement comPath = POList.getCerCompany();
		 String Company_Name = "Shrachi Developers";
		 singleDD(comPath, Company_Name);
		 comPath.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod);
		 Thread.sleep(4000);
		 
	 }
	 
	 public static void fullFilled() throws Throwable {
		 Frames.SubMenuFrame();
		 POList.getPoLink();
		 Frames.rightFrame();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 POList.getFFI_Radio();
		 Thread.sleep(2000);
		 WebElement comPath = POList.getCerCompany();
		 String Company_Name = "Shrachi Developers";
		 singleDD(comPath, Company_Name);
		 comPath.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod);
		 Thread.sleep(4000);
		 
	 }
	
	 public static void ROPO() throws Throwable {
		 Frames.SubMenuFrame();
		 POList.getPoLink();
		 Frames.rightFrame();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 POList.getRopo();
		 Thread.sleep(2000);
		 WebElement comPath = POList.getCerCompany();
		 String Company_Name = "Shrachi Developers";
		 singleDD(comPath, Company_Name);
		 comPath.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod);
		 Thread.sleep(4000);
		 
	 }
	 
	 public static void All_Radio() throws Throwable {
		 Frames.SubMenuFrame();
		 POList.getPoLink();
		 Frames.rightFrame();
		 String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		 POList.All();
		 Thread.sleep(2000);
		 WebElement comPath = POList.getCerCompany();
		 String Company_Name = "Shrachi Developers";
		 singleDD(comPath, Company_Name);
		 comPath.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 ListPageCount.PageCount(nameofCurrMethod);
		 Thread.sleep(4000);
		 
	 }
}
