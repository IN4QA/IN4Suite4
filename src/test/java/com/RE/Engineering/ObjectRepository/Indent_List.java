package com.RE.Engineering.ObjectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.RE.Engineering.Test.Indent_List_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Indent_List extends Indent_List_Test {
	// Initializing Web Driver

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname = "Indent_List";
	public static String fromdt = "Jan 01, 2001";
	public static WebDriver iDriver;

	public Indent_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}

	// Declaring and Initializing Web Elements of Indent list page

	@FindBy(xpath = "//a[text()='Indents']")
	private WebElement indlink;

	public void getindlink() {
		indlink.click();
	}

	@FindBy(xpath = "//input[@id='rdoIndentStatusList_1']")
	private WebElement UnflIss;

	public void unfulfilledissue() {
		UnflIss.click();
	}

	@FindBy(xpath = "//input[@id='rdoIndentStatusList_2']")
	private WebElement FulPOTO;

	public void fulfilledPOTO() {
		FulPOTO.click();
	}

	@FindBy(xpath = "//input[@id='rdoIndentStatusList_3']")
	private WebElement FulIss;

	public void fulfilledIssue() {
		FulIss.click();
	}

	@FindBy(xpath = "//input[@id='rdoIndentStatusList_4']")
	private WebElement All;

	public void getAll() {
		All.click();
	}

	@FindBy(xpath = "//input[@id='txtProject']")
	private WebElement proj;

	public WebElement selectproject() {
		return proj;
	}

	@FindBy(xpath = "//input[@id='txtSubProject']")
	private WebElement subproj;

	public WebElement selectsubproject() {
		return subproj;
	}

	@FindBy(xpath = "//input[@id='txtContractor']")
	private WebElement contr;

	public WebElement selectcontractor() {
		return contr;
	}

	@FindBy(xpath = "//input[@id='txtWorkCategory']")
	private WebElement Wrkcat;

	public WebElement selectworkcatrgory() {
		return Wrkcat;
	}

	@FindBy(xpath = "//input[@id='txtMaterialType']")
	private WebElement MatT;

	public WebElement selectmaterialtype() {
		return MatT;
	}

	@FindBy(xpath = "//input[@id='txtMaterialSubType']")
	private WebElement MatST;

	public WebElement selectmaterialsubtype() {
		return MatST;
	}

	@FindBy(xpath = "//input[@id='txtMaterial']")
	private WebElement Mat;

	public WebElement selectmaterial() {
		return Mat;
	}

	@FindBy(xpath = "//input[@id='txtStatus']")
	private WebElement Status;

	public WebElement selectstatus() {
		return Status;
	}

	@FindBy(xpath = "//input[@id='dtIndentFromDate_txtDatePicker']")
	private static WebElement Fromdate;

	public WebElement selectfromdate() {
		return Fromdate;
	}

	@FindBy(xpath = "//select[@title='Change the month']")
	private static WebElement frommonth;

	public WebElement selectfrommonth() {
		return frommonth;
	}

	@FindBy(xpath = "//select[@title='Change the year']")
	private static WebElement fromyear;

	public WebElement selectfromyear() {
		return fromyear;
	}

	@FindBy(xpath = "//input[@id='dtIndentToDate_txtDatePicker']") // to date
	private static WebElement Todate;

	public WebElement selecttodate() {
		return Todate;
	}

	@FindBy(xpath = "//select[@id='ddldebitable']")
	private static WebElement Debitable;

	public WebElement selectdebitable() {
		return Debitable;
	}

	@FindBy(xpath = "//input[@id='txtIndentType']")
	private WebElement Indtype;

	public WebElement selectindenttype() {
		return Indtype;
	}

	@FindBy(xpath = "(//tr[@id='trProjSubProj']//button[@class='multiselect dropdown-toggle btn btn-default'])[2]")
	private WebElement sub;
	public void getSub() {
		sub.click();
	}
	@FindBy(xpath = "//input[@name='btnFilterGO']")
	private WebElement gobutton;
	public void clickgobutton() {
		gobutton.click();
	}
	

	// Utilization

	// Click on Engineering and Inventory Link

	public static void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en = new Engineering(iDriver);
			en.clickInventory();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData("Indent List");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:" + e);
		}
	}

	// ************Case1*************//

	public static void UnfullfilledPOTO() {
		try {
			Indent_ListObj.getindlink();
			Frames.rightFrame();
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			System.out.println(nameofCurrMethod);
			Thread.sleep(2000);
			WebElement project = iDriver.findElement(By.name("txtProject"));

			project.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			project.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Unfullfilled POTO case Passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Unfullfilled POTO case Failed");
		}
	}

	// ************Case2*************//
	public static void Unfullfilledissue() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.unfulfilledissue();
			Thread.sleep(2000);
			WebElement project1 = iDriver.findElement(By.name("txtProject"));
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Unfullfilled issue case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Unfullfilled issue case Failed:" + e);
		}
	}

	// ************Case3************//

	public static void FulfilledPOTO() throws Throwable {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.fulfilledPOTO();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Unfullfilled issue case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("fullfilled POTO case Failed:" + e);
		}
	}

	public static void FulfilledIssue() throws Throwable {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.fulfilledIssue();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Unfullfilled issue case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("fullfilled POTO case Failed:" + e);
		}
	}

	public static void All() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("All radio case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("All radio case Failed:" + e);
		}
	}

	// ************Case4*************//
	public static void SubProject() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement subproject = Indent_ListObj.selectsubproject();
			subproject.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			subproject.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			subproject.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Subproject case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("SubProject case Failed:" + e);
		}
	}

	// ************Case5*************//
	public static void Status() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement status = Indent_ListObj.selectstatus();
			status.sendKeys("Approved");
			Thread.sleep(4000);
			for (int g = 1; g < 3; g++) {
				status.sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			status.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Status case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Status case Failed:" + e);
		}
	}

	// ************Case6*************//
	public static void Contractor() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement contractor = Indent_ListObj.selectcontractor();
			contractor.sendKeys("Windor Aluminium Pvt. Ltd.");
			Thread.sleep(2000);
			contractor.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			contractor.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Contractor case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Contractor case Failed:" + e);
		}
	}

	// ************Case7*************//
	public static void Date() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			appInd.seletDate(Indent_ListObj.selectfromdate(), fromdt);
			appInd.seletDate(Indent_ListObj.selecttodate(), appInd.CurrentDateIn_MMM_DD_YYYY());

			Thread.sleep(2000);
			Indent_ListObj.clickgobutton();
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Dates cases passed");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("From and To date case Failed:" + e);
		}
	}

	// ************Case8*************//
	public static void WorkCategory() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			WebElement workcatagory = Indent_ListObj.selectworkcatrgory();
			workcatagory.sendKeys("Painting");
			Thread.sleep(2000);
			for (int g = 1; g <= 2; g++) {
				workcatagory.sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			workcatagory.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(4000);
			System.out.println("Work Category case passed");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Work Category case Failed:" + e);
		}
	}

	// ************Case9*************//
	public static void TypeOfIndent() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			WebElement typeofindent = Indent_ListObj.selectindenttype();
			typeofindent.sendKeys("PO & ISSUE ");
			Thread.sleep(2000);
			typeofindent.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			typeofindent.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(2000);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Type Of Indent case Failed:" + e);
		}
	}

	// ************Case10*************//
	public static void Debitable() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			appInd.seletDate(Indent_ListObj.selectfromdate(), fromdt);
			appInd.seletDate(Indent_ListObj.selecttodate(), appInd.CurrentDateIn_MMM_DD_YYYY());
			appInd.singleDropDown(Indent_ListObj.selectdebitable(), "Yes");
			Thread.sleep(2000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Debitable case Failed:" + e);
		}
	}

	// ************Case11*************//
	public static void MaterialType() {
		try {
			Frames.SubMenuFrame();
			Indent_ListObj.getindlink();
			Thread.sleep(1000);
			Frames.rightFrame();
			Thread.sleep(2000);
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			Indent_ListObj.getAll();
			Thread.sleep(2000);
			WebElement project1 = Indent_ListObj.selectproject();
			project1.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			project1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			project1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Indent_ListObj.selectmaterialtype().sendKeys("CEMENT");
			Thread.sleep(2000);
			for (int g = 1; g <= 2; g++) {
				Indent_ListObj.selectmaterialtype().sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			Indent_ListObj.selectmaterialtype().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Indent_ListObj.clickgobutton();
			Thread.sleep(2000);
			ListPageCount.PageCount(nameofCurrMethod, sheetname);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Material type case Failed:" + e);
		}
	}
}