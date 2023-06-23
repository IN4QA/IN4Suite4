package com.RE.Sales.Create.ObjectRepository;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.Unit_Create_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Unit_Create extends Unit_Create_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;
	public static String IndentNo;

	public Unit_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	
	@FindBy(css = "#txtProject")
	private WebElement EnterProject;
	public WebElement getEnterProject() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterProject));
		return EnterProject;
	} 
	
	@FindBy(css = "#txtSubProject")
	private WebElement EntersubProject;
	public WebElement getEntersubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(EntersubProject));
		return EntersubProject;
	}  
	
	@FindBy(css = "#btnGo")
	private WebElement GoBtn;
	public void getGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(GoBtn));
		GoBtn.click();
	} 
	
	@FindBy(xpath = "//table[@class='in4-table']//td[3]//a")
	private WebElement SelectsubProject;
	public void getSelectsubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectsubProject));
		SelectsubProject.click();
	}  
	
	@FindBy(xpath = "//td[text()='Stock']")
	private WebElement StockTab;
	public void getStockTab() {
		w2.until(ExpectedConditions.elementToBeClickable(StockTab));
		StockTab.click();
	} 
	
	@FindBy(css = "#btnAddUnit")
	private WebElement AddUnitBtn;
	public void getAddUnitBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AddUnitBtn));
		AddUnitBtn.click();
	}  
	
	@FindBy(css = "select#ddlFloorNo")
	private WebElement FloorNoDD;
	public WebElement getFloorNoDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FloorNoDD));
		return FloorNoDD;
	}
	
	@FindBy(css = "select#ddlFloorType")
	private WebElement FloorTypeDD;
	public WebElement getFloorTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FloorTypeDD));
		return FloorTypeDD;
	}  
	
	@FindBy(css = "input#txtUnitNo")
	private WebElement UnitNo;
	public WebElement getUnitNo() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitNo));
		return UnitNo;
	}
	
	@FindBy(css = "select#ddlUnitType")
	private WebElement UnitType;
	public WebElement getUnitType() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitType));
		return UnitType;
	} 
	
	@FindBy(css = "input#txtSBA")
	private WebElement SaleableArea;
	public WebElement getSaleableArea() {
		w2.until(ExpectedConditions.elementToBeClickable(SaleableArea));
		return SaleableArea;
	}
	
	@FindBy(css = "input#btnCreate")
	private WebElement CreateBtn;
	public void getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		CreateBtn.click();;
	} 
	
	@FindBy(css = "#ddlType")
	private WebElement UnitTypeDD;
	public WebElement getUnitTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitTypeDD));
		return UnitTypeDD;
	}
	
	@FindBy(css = "select#ddlFromStatus")
	private WebElement FromStatusDD;
	public WebElement getFromStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FromStatusDD));
		return FromStatusDD;
	}
	
	@FindBy(css = "select#ddlToStatus")
	private WebElement ToStatusDD;
	public WebElement getToStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ToStatusDD));
		return ToStatusDD;
	} 
	
	@FindBy(xpath = "//table[@class='in4-table1']//th[13]//tr[2]//input[contains(@id,'RelSalesAll')]")
	private WebElement SalesCheckBox;
	public void getSalesCheckBox() {
		w2.until(ExpectedConditions.elementToBeClickable(SalesCheckBox));
		SalesCheckBox.click();
	} 
	
	@FindBy(css = "#lnkChangeSts")
	private WebElement ChangeStatus;
	public void getChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ChangeStatus));
		ChangeStatus.click();
	} 
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickProjects();
			Thread.sleep(2000);
			en = new Sales(iDriver);
			en.clickProjectMaster();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Sales.CreatePath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	int count = 0;
	String UnitNumber="";
	public void createUnit() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Frames.mainFrame();
		getEnterProject().sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		getEntersubProject().sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		getGoBtn();
		getSelectsubProject();

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				Frames.tabFrame();
				getStockTab();
				Frames.mainDnFrame();
				getAddUnitBtn();
				appInd.singleDropDown(getFloorNoDD(), sheet.getRow(i).getCell(2).getStringCellValue());
				appInd.singleDropDown(getFloorTypeDD(), sheet.getRow(i).getCell(3).getStringCellValue());
				UnitNumber = (sheet.getRow(i).getCell(4).getStringCellValue() + String.valueOf(appInd.RandomNoAsSpecified(4)));
				getUnitNo().sendKeys(UnitNumber);
				appInd.singleDropDown(getUnitType(), sheet.getRow(i).getCell(5).getStringCellValue());
				getSaleableArea().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
				getCreateBtn();
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
					Datatable.writeExcel(UnitNumber, "Not Created", sheetname, Sales.OutPutCreatePath);
				} else {
					count++;
					Datatable.writeExcel(UnitNumber, "Created",sheetname, Sales.OutPutCreatePath);
				}
			} catch (Exception e) {
				Datatable.writeExcel(UnitNumber, "Not Created",sheetname, Sales.OutPutCreatePath);
			}
		
		Frames.tabFrame();
		getStockTab();
		Frames.mainDnFrame();
		appInd.singleDropDown(getUnitTypeDD(), "Sales");
		Thread.sleep(1000);
		appInd.singleDropDown(getFromStatusDD(), "Hold");
		Thread.sleep(1000);
		appInd.singleDropDown(getToStatusDD(), "Available");
		Thread.sleep(1000);
		getSalesCheckBox();
		getChangeStatus();
		if (appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
	}
		if(sheet.getLastRowNum() == count) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Sales.OutPutCreatePath);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}
	}
}
