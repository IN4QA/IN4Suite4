package com.RE.Expenses.Create.ObjectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Expenses.Create.Test.WO_Create_Test;
import com.RE.Submodules.Expenses;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class WO_Create extends WO_Create_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Expenses exp;

	public WO_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	

	
	@FindBy(css = "#btnCreate")
	private WebElement CreateWOBtn;
	public void getCreateWOBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateWOBtn));
		CreateWOBtn.click();
	}
	
	@FindBy(css = "select#ddlCompany")
	private WebElement CompanyDD;
	public WebElement getCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
		return CompanyDD;
	} 
	
	@FindBy(css = "select#ddlcurrencytype")
	private WebElement WOtypeDD;
	public WebElement getWOtypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(WOtypeDD));
		return WOtypeDD;
	} 
	
	@FindBy(css = "select#ddlType")
	private WebElement ExpensetypeDD;
	public WebElement getExpensetypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ExpensetypeDD));
		return ExpensetypeDD;
	} 
	
	@FindBy(css = "select#ddlSubType")
	private WebElement ExpenseSubtypeDD;
	public WebElement getExpenseSubtypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ExpenseSubtypeDD));
		return ExpenseSubtypeDD;
	} 
	
	@FindBy(css = "select#ddlContractorName")
	private WebElement VendorNameDD;
	public WebElement getVendorNameDD() {
		w2.until(ExpectedConditions.elementToBeClickable(VendorNameDD));
		return VendorNameDD;
	} 
	
	@FindBy(css = "textarea#txtScopeOfWork")
	private WebElement ScopeOfWork;
	public WebElement getScopeOfWork() {
		w2.until(ExpectedConditions.elementToBeClickable(ScopeOfWork));
		return ScopeOfWork;
	} 
	
	@FindBy(css = "#txtContactName")
	private WebElement ContactName;
	public WebElement getContactName() {
		w2.until(ExpectedConditions.elementToBeClickable(ContactName));
		return ContactName;
	} 
	
	@FindBy(css = "input#dtFromDate_txtDatePicker")
	private WebElement BudgetFromDate;
	public WebElement getBudgetFromDate() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetFromDate));
		return BudgetFromDate;
	} 
	
	@FindBy(css = "input#dtToDate_txtDatePicker")
	private WebElement BudgetToDate;
	public WebElement getBudgetToDate() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetToDate));
		return BudgetToDate;
	} 
	
	@FindBy(css = "#lnkWODetails")
	private WebElement AddWO;
	public WebElement getAddWO() {
		w2.until(ExpectedConditions.elementToBeClickable(AddWO));
		return AddWO;
	}
	
	@FindBy(css = "#lnkBtnWODetailsAddRow")
	private WebElement AddRowLink;
	public void getAddRowLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AddRowLink));
		AddRowLink.click();
	}
	
	@FindBy(xpath = "//input[contains(@id,'Item')]")
	private WebElement ItemName;
	public WebElement getItemName() {
		w2.until(ExpectedConditions.elementToBeClickable(ItemName));
		return ItemName;
	} 	
	
	@FindBy(xpath = "//textarea[contains(@id,'Desc')]")
	private WebElement ItemDescription;
	public WebElement getItemDescription() {
		w2.until(ExpectedConditions.elementToBeClickable(ItemDescription));
		return ItemDescription;
	} 
	
	@FindBy(xpath = "//select[contains(@id,'Units')]")
	private WebElement WOUnits;
	public WebElement getWOUnits() {
		w2.until(ExpectedConditions.elementToBeClickable(WOUnits));
		return WOUnits;
	} 
	
	@FindBy(xpath = "//input[contains(@id,'Rate')]")
	private WebElement WORate;
	public WebElement getWORate() {
		w2.until(ExpectedConditions.elementToBeClickable(WORate));
		return WORate;
	} 
	
	@FindBy(xpath = "//input[contains(@id,'Quantity')]")
	private WebElement WOQuantity;
	public WebElement getWOQuantity() {
		w2.until(ExpectedConditions.elementToBeClickable(WOQuantity));
		return WOQuantity;
	} 
	
	@FindBy(xpath = "//input[contains(@id,'btnSubmit')]")
	private WebElement WOSubmitBtn;
	public void getWOSubmitBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(WOSubmitBtn));
		WOSubmitBtn.click();
	} 
	
	@FindBy(css = "textarea#txtWorkDesc")
	private WebElement WODescriptions;
	public WebElement getWODescriptions() {
		w2.until(ExpectedConditions.elementToBeClickable(WODescriptions));
		return WODescriptions;
	}
	
	@FindBy(css = "#lnkBtnAddRow")
	private WebElement AddTaxAddRow;
	public void getAddTaxAddRow() {
		w2.until(ExpectedConditions.elementToBeClickable(AddTaxAddRow));
		AddTaxAddRow.click();
	}
	
	@FindBy(xpath = "(//select[contains(@id,'AdditionTax')][contains(@onchange,'IsTaxAdded')])")
	private WebElement TaxAdditionsItems;
	public WebElement getTaxAdditionsItems(int i) {
		TaxAdditionsItems.findElement(By.xpath("["+i+"]"));
		return TaxAdditionsItems;
	} 
	
	@FindBy(xpath = "//table[@id='dgTaxAdditions']")
	private WebElement TaxAdditionsType;
	public WebElement getTaxAdditionsType(int i) {
		TaxAdditionsType.findElement(By.xpath("//tr//td["+i+"]//select"));
		return TaxAdditionsType;
	} 
	
	@FindBy(xpath = "//table[@id='dgTaxAdditions']")
	private WebElement TaxAdditionsWorkOrderValue;
	public WebElement getTaxAdditionsWorkOrderValue(int i) {
		TaxAdditionsWorkOrderValue.findElement(By.xpath("//tr//td["+i+"]//input"));
		w2.until(ExpectedConditions.elementToBeClickable(TaxAdditionsWorkOrderValue));
		return TaxAdditionsWorkOrderValue;
	} 
	
	@FindBy(css = "#lnkBtnDedTaxAddRow")
	private WebElement DedTaxAddRow;
	public void getDedTaxAddRow() {
		w2.until(ExpectedConditions.elementToBeClickable(DedTaxAddRow));
		DedTaxAddRow.click();
	}
	
	@FindBy(xpath = "//table[@id='dgTaxDeductions']")
	private WebElement TaxDeductionsItems;
	public WebElement getTaxDeductionsItems(int i) {
		TaxAdditionsItems.findElement(By.xpath("//tr//td["+i+"]//select"));
		return TaxDeductionsItems;
	} 
	
	@FindBy(css = "select#ddlStatus")
	private WebElement StatusDD;
	public WebElement getStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(StatusDD));
		return StatusDD;
	}
	
	@FindBy(css = "#btnCreate")
	private WebElement CreateBtn;
	public void getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		CreateBtn.click();
	}
	
	@FindBy(xpath = "//a[contains(@id,'dgWorkOrde')][contains(@href,'lnkDisplay')]")
	private WebElement WODisplayNumber;
	public WebElement getWODisplayNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(WODisplayNumber));
		return WODisplayNumber;
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']")
	private WebElement ApprovalsLink;
	public void getApprovalsLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsLink));
		ApprovalsLink.click();
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']//following-sibling::div//a[contains(text(),'Work Order')]")
	private WebElement ApprovalsWO;
	public void getApprovalsWO() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsWO));
		ApprovalsWO.click();
	} 
	
	
	@FindBy(css = "select#ddlType")
	private WebElement ApprovalsWOtypeDD;
	public WebElement getApprovalsWOtypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsWOtypeDD));
		return ApprovalsWOtypeDD;
	} 
	
	@FindBy(css = "select#ddlSubType")
	private WebElement ApprovalsWOSubtypeDD;
	public WebElement getApprovalsWOSubtypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsWOSubtypeDD));
		return ApprovalsWOSubtypeDD;
	} 
	
	@FindBy(css = "select#ddlWorkOrder")
	private WebElement ApprovalsWorkOrderDD;
	public WebElement getApprovalsWorkOrderDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsWorkOrderDD));
		return ApprovalsWorkOrderDD;
	} 
	
	@FindBy(css = "#btnSearch")
	private WebElement ApprovalsGoBtn;
	public void getApprovalsGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsGoBtn));
		ApprovalsGoBtn.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickExpenses();
			Thread.sleep(2000);
			exp = new Expenses(iDriver);
			exp.clickWorkOrder();
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Expenses.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	String WONumber;
	public void createWO() throws Throwable {

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
			if (i != 1) {
				Frames.SubMenuFrame();
				exp.clickWorkOrder();
			}
			Frames.rightFrame();
			getCreateWOBtn();
			appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(0).getStringCellValue());
			appInd.singleDropDown(getWOtypeDD(), sheet.getRow(i).getCell(1).getStringCellValue());
			appInd.singleDropDown(getExpensetypeDD(), sheet.getRow(i).getCell(2).getStringCellValue());
			appInd.singleDropDown(getExpenseSubtypeDD(), sheet.getRow(i).getCell(3).getStringCellValue());
			appInd.singleDropDown(getVendorNameDD(), sheet.getRow(i).getCell(4).getStringCellValue());
			getScopeOfWork().sendKeys("Scope of Work" + sheet.getRow(i).getCell(6).getStringCellValue()+ sheet.getRow(i).getCell(7).getStringCellValue());
			getContactName().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
			appInd.seletDate(getBudgetFromDate(), sheet.getRow(i).getCell(6).getStringCellValue());
			appInd.seletDate(getBudgetToDate(), sheet.getRow(i).getCell(7).getStringCellValue());
			String parent = appInd.switchToChildWindow(getAddWO());
			getAddRowLink();
			getItemName().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
			getItemDescription().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
			appInd.singleDropDown(getWOUnits(), sheet.getRow(i).getCell(10).getStringCellValue());
			getWORate().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
			getWOQuantity().sendKeys(sheet.getRow(i).getCell(12).getStringCellValue());
			getWOSubmitBtn();
			appInd.switchToParentWindow(parent);
			Frames.rightFrame();
			getWODescriptions().sendKeys("Work Order Description");
			int Atax = Integer.parseInt(sheet.getRow(0).getCell(13).getStringCellValue());
			int Aitem = 1;
			for (int j = 1; j <= Atax; j++) {
				getAddTaxAddRow();
				appInd.singleDropDown(iDriver.findElement(By.xpath("(//select[contains(@id,'AdditionTax')][contains(@onchange,'IsTaxAdded')])[" + j + "]")),sheet.getRow(Aitem).getCell(13).getStringCellValue());
				Aitem++;
				appInd.singleDropDown(iDriver.findElement(By.xpath("(//select[contains(@id,'AdditionTax')][contains(@onchange,'IsInclusive')])[" + j + "]")),sheet.getRow(1).getCell(15).getStringCellValue());
				WebElement workOrderValue = iDriver.findElement(By.xpath("(//table[@id='dgTaxAdditions']//tr//td[6]//input)[" + j + "]"));
				workOrderValue.click();
				robotClickBackSpace(4);
				workOrderValue.sendKeys("100");

			}
			Thread.sleep(1000);
			int Dtax = Integer.parseInt(sheet.getRow(0).getCell(14).getStringCellValue());
			Aitem = 1;
			for (int j = 1; j <= Dtax; j++) {
				getDedTaxAddRow();
				appInd.singleDropDown(iDriver.findElement(By.xpath("(//select[contains(@id,'DeductionTax')][contains(@onchange,'IsTaxDedu')])[" + j + "]")),sheet.getRow(Aitem).getCell(14).getStringCellValue());
				Aitem++;
			}
			appInd.singleDropDown(getStatusDD(), "SUBMITTED");
			getCreateBtn();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel("Work Order", "Not Created", sheetname, Expenses.CreateOutPutPath);
			} else {
				Datatable.writeExcel("Work Order", "Created", sheetname, Expenses.CreateOutPutPath);
			}
			}catch (Exception e) {
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				Datatable.writeExcel("Work Order", "Not Created", sheetname, Expenses.CreateOutPutPath);
			}
			try {
			WONumber = getWODisplayNumber().getText();
			Frames.SubMenuFrame();
			getApprovalsLink();
			getApprovalsWO();
			Frames.rightFrame();
			appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getApprovalsWOtypeDD(), sheet.getRow(i).getCell(2).getStringCellValue());
			appInd.singleDropDown(getApprovalsWOSubtypeDD(), sheet.getRow(i).getCell(3).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getApprovalsWorkOrderDD(), WONumber);
			getApprovalsGoBtn();
			getWODisplayNumber().click();
			appInd.singleDropDown(getStatusDD(), "APPROVED");
			getCreateBtn();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel(WONumber, "Work Order not Approved", sheetname, Expenses.CreateOutPutPath);
			} else {
				Datatable.writeExcel(WONumber, "Work Order Approved", sheetname, Expenses.CreateOutPutPath);
			}
			}catch (Exception e) {
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				Datatable.writeExcel(WONumber, "Work Order not Approved Exception", sheetname, Expenses.CreateOutPutPath);
			}
		}
	}

	public void robotClickBackSpace(int n) throws Throwable {
		for (int i = 0; i < n; i++) {
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_BACK_SPACE);
			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
	}
}
