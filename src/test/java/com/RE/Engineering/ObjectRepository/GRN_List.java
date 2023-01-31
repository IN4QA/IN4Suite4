package com.RE.Engineering.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.GRN_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class GRN_List extends GRN_List_Test{

	public static WebDriver iDriver;
	public static String Company_Name = "Shrachi Developers";
	public GRN_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
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
	
	
	@FindBy(id = "btnFilterGO")
	private WebElement go;
	public void getGo() {
		 go.click();
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
		Select sct = new Select(comPath);
		sct.selectByVisibleText(Company_Name);
 }
	
	public static void material() throws Throwable {
		
		GRNList.getGRN();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(GRNList.getCertiCompany(), Company_Name);
		GRNList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod);
		Thread.sleep(2000);
		
	}
	
	
	public static void Asset() throws Throwable {
		
		Frames.SubMenuFrame();
		GRNList.getGRN();
		Frames.rightFrame();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		GRNList.getAsset();
		Thread.sleep(1000);
		singleDD(GRNList.getCertiCompany(), Company_Name);
		GRNList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod);
		Thread.sleep(2000);
		
	}
}
