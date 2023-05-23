package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.RE.Engineering.Test.Material_Budget_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;
import freemarker.core.ReturnInstruction.Return;

public class WCB_MB_WO_List extends Material_Budget_List_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static String fromdt = "Jan 01, 2001";
	public static WebDriver iDriver;

	public WCB_MB_WO_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Projects']")
	private static WebElement Projects;
	public void getProjects() {
		Projects.click();
	}
	
	By ByProject=By.id("txtProject");
	
	@FindBy(id = "txtProject")
	private WebElement ProjectsLink;
	public WebElement getProjectsLink() {
		return ProjectsLink;
	}
	
	@FindBy(id = "txtSubProject")
	private WebElement SubProjectLink;
	public WebElement getSubProjectLink() {
		return SubProjectLink;
	}
	
	@FindBy(id = "btnGo")
	private WebElement Go;
	public void getGo() {
		Go.click();
	}
	
	By ByclickSubProject = By.xpath("//table[@class='in4-table']//td[3]//a");
	
	@FindBy(xpath = "//table[@class='in4-table']//td[3]//a")
	private WebElement clickSubProject;
	public WebElement getclickSubProject() {
		return clickSubProject;
	}
	
	By ByclickWorkCategoryBudget = By.xpath("//a[text()='Work Category Budget']");
	
	@FindBy(xpath = "//a[text()='Work Category Budget']")
	private WebElement clickWorkCategoryBudget;
	public void getclickWorkCategoryBudget() {
		clickWorkCategoryBudget.click();
	}
	
	By ByWorkCategoryBudgetPageName = By.xpath("//div[@class='in4-title']");
	
	@FindBy(xpath = "//div[@class='in4-title']")
	private WebElement PageName;
	public String getPageName() {
		return PageName.getText();
	}
	
	By ByMaterialBudget = By.xpath("//a[text()='Material Budget']");
	
	@FindBy(xpath = "//a[text()='Material Budget']")
	private WebElement clickMaterialBudget;
	public void getMaterialBudget() {
		clickMaterialBudget.click();
	}
	
	By ByWorkOrder = By.xpath("//td[text()='Work Order']");
	
	@FindBy(xpath = "//td[text()='Work Order']")
	private WebElement clickWorkOrder;
	public void getWorkOrder() {
		clickWorkOrder.click();
	}
	public static void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en = new Engineering(iDriver);
			//en.clickProjects();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Engineering.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:" + e);
		}
	}
	
	public void workCategoryBudget() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.mainFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByProject));
		getProjectsLink().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		getSubProjectLink().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		getGo();
		try {
			Thread.sleep(3000);
			w2.until(ExpectedConditions.visibilityOfElementLocated(ByclickSubProject));
		}catch(Exception e) {
			System.out.println(e);
		}try {
			getclickSubProject().click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Frames.tabFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByclickWorkCategoryBudget));
		getclickWorkCategoryBudget();
		Thread.sleep(2000);
		Frames.contentFrame();
		Thread.sleep(2000);
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByWorkCategoryBudgetPageName));
		//Assert.assertEquals(getPageName(), "View Sub Project Work Category Budget");
		
		if (getPageName().equals("View Sub Project Work Category Budget")) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname,Engineering.path);
			
		} else {
			
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname,Engineering.path);
		}
		 
		
	}
	
	public void MaterialBudget() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		getProjects();
		Frames.mainFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByProject));
		getProjectsLink().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		getSubProjectLink().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		getGo();
		try {
			Thread.sleep(3000);
			w2.until(ExpectedConditions.visibilityOfElementLocated(ByclickSubProject));
		}catch(Exception e) {
			System.out.println(e);
		}try {
		getclickSubProject().click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Frames.tabFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByMaterialBudget));
		getMaterialBudget();
		Thread.sleep(2000);
		Frames.contentFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByWorkCategoryBudgetPageName));
		//Assert.assertEquals(getPageName(), "View Sub Project Material Budget");
		if (getPageName().equals("View Sub Project Material Budget")) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname,Engineering.path);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname,Engineering.path);
			}
	}
	
	public void workOrderCount() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		getProjects();
		Frames.mainFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByProject));
		getProjectsLink().sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		getSubProjectLink().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		getGo();
		try {
			Thread.sleep(3000);
			w2.until(ExpectedConditions.visibilityOfElementLocated(ByclickSubProject));
		}catch(Exception e) {
			System.out.println(e);
		}try {
		getclickSubProject().click();
		}catch(Exception e) {
			System.out.println(e);
		}
		Frames.tabFrame();
		w2.until(ExpectedConditions.visibilityOfElementLocated(ByWorkOrder));
		getWorkOrder();
		Thread.sleep(2000);
		Frames.contentFrame();
		ListPageCount.PageCount(nameofCurrMethod, sheetname, Engineering.path);
	}
}
