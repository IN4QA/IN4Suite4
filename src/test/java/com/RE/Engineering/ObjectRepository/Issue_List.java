package com.RE.Engineering.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.Issue_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Issue_List extends Issue_List_Test{

	public static WebDriver iDriver;
	public static String project_Name = "BURDWAN TOWNSHIP PHASE -2, Burdwan";
	public Issue_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
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
	
	public static void singleDD(WebElement comPath, String project_Name) {
		Select sct = new Select(comPath);
		sct.selectByVisibleText(project_Name);
}
	
	public static void material() throws Throwable {
		
		IssueList.getIssueInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		singleDD(IssueList.getproject(), project_Name);
		Thread.sleep(1000);
		IssueList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod);
		Thread.sleep(2000);
		
	}
	
	public static void asset() throws Throwable {
		Frames.SubMenuFrame();
		IssueList.getIssueInventry();
		Frames.rightFrame();
		Thread.sleep(1000);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		IssueList.getAsset();
		singleDD(IssueList.getproject(), project_Name);
		IssueList.getGo();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod);
		Thread.sleep(2000);
		
	}
}
