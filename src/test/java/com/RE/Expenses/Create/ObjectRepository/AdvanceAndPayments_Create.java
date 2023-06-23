package com.RE.Expenses.Create.ObjectRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.RE.Expenses.Create.Test.AdvanceAndPayments_Create_Test;
import com.RE.Submodules.Expenses;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class AdvanceAndPayments_Create extends AdvanceAndPayments_Create_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Expenses exp;
	public static MainMenu mm;

	public AdvanceAndPayments_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	
	@FindBy(xpath = "//a[text()='Advance']")
	private WebElement AdvanceLink;
	public void getAdvanceLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceLink));
		AdvanceLink.click();
	}
	
	@FindBy(css = "#btnNewRequest")
	private WebElement CreateAdvance;
	public void getCreateAdvance() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateAdvance));
		CreateAdvance.click();
	}
	
	@FindBy(css = "select#ddlCompany")
	private WebElement AdvanceCompanyDD;
	public WebElement getAdvanceCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceCompanyDD));
		return AdvanceCompanyDD;
	} 
	
	@FindBy(css = "select#ddlExpenseType")
	private WebElement AdvanceExpenseTypeDD;
	public WebElement getAdvanceExpenseTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceExpenseTypeDD));
		return AdvanceExpenseTypeDD;
	} 
	
	@FindBy(css = "select#ddlExpenseSubType")
	private WebElement AdvanceExpenseSubTypeDD;
	public WebElement getAdvanceExpenseSubTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceExpenseSubTypeDD));
		return AdvanceExpenseSubTypeDD;
	} 
	
	@FindBy(css = "#btnGo")
	private WebElement AdvanceGoBtn;
	public void getAdvanceGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceGoBtn));
		AdvanceGoBtn.click();
	}
	
	@FindBy(xpath = "//table[@id='dgExpenseDetailItems']//input[contains(@id,'txtAmount')][@type='text']")
	private WebElement AdvanceAmount;
	public WebElement getAdvanceAmount() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceAmount));
		AdvanceAmount.clear();
		Thread.sleep(1000);
		return AdvanceAmount;
	}
	
	@FindBy(xpath = "//input[contains(@id,'txtFromDate_txtDatePicker')]")
	private WebElement AdvanceFromDate;
	public WebElement getAdvanceFromDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceFromDate));
		return AdvanceFromDate;
	}
	
	@FindBy(xpath = "//input[contains(@id,'txtToDate_txtDatePicker')]")
	private WebElement AdvanceToDate;
	public WebElement getAdvanceToDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceToDate));
		return AdvanceToDate;
	}
	
	@FindBy(css = "select#ddlVendor")
	private WebElement AdvanceVendorDD;
	public WebElement getAdvanceVendorDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceVendorDD));
		return AdvanceVendorDD;
	} 
	
	@FindBy(css = "select#ddlWorkOrder")
	private WebElement AdvanceWorkOrderNumber;
	public WebElement getAdvanceWorkOrderNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceWorkOrderNumber));
		return AdvanceWorkOrderNumber;
	} 
	
	@FindBy(css = "select#ddlPlaceofSupply")
	private WebElement AdvancePlaceofSupply;
	public WebElement getAdvancePlaceofSupply() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvancePlaceofSupply));
		return AdvancePlaceofSupply;
	} 
	
	@FindBy(css = "input#txtInvoiceNumber")
	private WebElement AdvanceInvoiceNumber;
	public WebElement getAdvanceInvoiceNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceInvoiceNumber));
		return AdvanceInvoiceNumber;
	} 
	
	@FindBy(css = "input#txtInvoiceDate_txtDatePicker")
	private WebElement AdvanceInvoiceDate;
	public WebElement getAdvanceInvoiceDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceInvoiceDate));
		return AdvanceInvoiceDate;
	} 
	
	@FindBy(css = "select#ddlModeOfpayment")
	private WebElement AdvanceModeOfpayment;
	public WebElement getAdvanceModeOfpayment() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceModeOfpayment));
		return AdvanceModeOfpayment;
	} 
	
	@FindBy(css = "input#txtPaymentDueDate_txtDatePicker")
	private WebElement AdvancePaymentDueDate;
	public WebElement getAdvancePaymentDueDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvancePaymentDueDate));
		return AdvancePaymentDueDate;
	} 
	
	@FindBy(css = "select#ddlStatus")
	private WebElement AdvanceStatus;
	public WebElement getAdvanceStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceStatus));
		return AdvanceStatus;
	} 
	
	@FindBy(css = "#btnSave")
	private WebElement AdvanceSaveBtn;
	public void getAdvanceSaveBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceSaveBtn));
		AdvanceSaveBtn.click();
	}
	
	@FindBy(css = "span#lblExpReqId")
	private WebElement AdvanceRequestId;
	public String getAdvanceRequestId() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceRequestId));
		return AdvanceRequestId.getText();
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']")
	private WebElement ApprovalsLink;
	public void getApprovalsLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsLink));
		ApprovalsLink.click();
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']//following-sibling::div//a[contains(text(),'Advance')]")
	private WebElement ApprovalsWO;
	public void getApprovalsWO() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsWO));
		ApprovalsWO.click();
	} 
	
	@FindBy(css = "#txtExpenseId")
	private WebElement AdvanceApprovalExpenseId;
	public WebElement getAdvanceApprovalExpenseId() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceApprovalExpenseId));
		return AdvanceApprovalExpenseId;
	} 
	
	@FindBy(css = "#btnSearch")
	private WebElement AdvanceApprovalGoBtn;
	public void getAdvanceApprovalGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceApprovalGoBtn));
		AdvanceApprovalGoBtn.click();
	}
	
	@FindBy(xpath = "//a[contains(@id,'lnkExpenseID')]")
	private WebElement AdvanceApprovalClickExpenseID;
	public void getAdvanceApprovalClickExpenseID() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceApprovalClickExpenseID));
		AdvanceApprovalClickExpenseID.click();
	} 
	
	@FindBy(css = "input#btnSave")
	private WebElement AdvanceApprovalUpdateBtn;
	public void getAdvanceApprovalUpdateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceApprovalUpdateBtn));
		AdvanceApprovalUpdateBtn.click();
	}
	
	@FindBy(css = "input#txtVoucherDate_txtDatePicker")
	private WebElement AdvanceApprovalProcessedDate;
	public WebElement getAdvanceApprovalProcessedDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceApprovalProcessedDate));
		return AdvanceApprovalProcessedDate;
	} 
	
	@FindBy(xpath = "//a[text()='Expense']")
	private WebElement FinanceExpense;
	public void getFinanceExpense() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceExpense));
		FinanceExpense.click();
	} 
	
	@FindBy(xpath = "//a[text()='Advance']")
	private WebElement FinanceAdvanceaTab;
	public void getFinanceAdvanceaTab() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceAdvanceaTab));
		FinanceAdvanceaTab.click();
	} 
	
	@FindBy(xpath = "//a[text()='Make Bank Payment']")
	private WebElement FinanceMakeBankPayment;
	public WebElement getFinanceMakeBankPayment() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceMakeBankPayment));
		return FinanceMakeBankPayment;
	} 
	
	@FindBy(css = "select#ddlBankCash")
	private WebElement FinanceBankAccount;
	public WebElement getFinanceBankAccount() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceBankAccount));
		return FinanceBankAccount;
	} 
	
	@FindBy(css = "input#txtInstrumentNo")
	private WebElement FinanceInstrumentNo;
	public WebElement getFinanceInstrumentNo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceInstrumentNo));
		return FinanceInstrumentNo;
	} 
	
	@FindBy(css = "input#btnSubmit")
	private WebElement FinanceSubmit;
	public void getFinanceSubmit() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceSubmit));
		FinanceSubmit.click();
	}
	
	@FindBy(css = "select#ddlVendor")
	private WebElement FinanceVendor;
	public WebElement getFinanceVendor() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceVendor));
		return FinanceVendor;
	} 
	
	@FindBy(css = "select#ddlStatus")
	private WebElement FinanceStatus;
	public WebElement getFinanceStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceStatus));
		return FinanceStatus;
	} 
	
	@FindBy(css = "select#cboPageSize")
	private WebElement FinancePageSize;
	public WebElement getFinancePageSize() {
		return FinancePageSize;
	} 
	
	@FindBy(xpath = "//table[@id='dgExpenseDetails']//td[text()='PROCESSED']/..//a[contains(@id,'lnkExpenseID')]")
	private List<WebElement> FinanceAllPendingAdv;
	public List<WebElement> getFinanceAllPendingAdv() {
		return FinanceAllPendingAdv;
	} 
	
	@FindBy(xpath = "//a[contains(@id,'lnkExpenseID')]")
	private List<WebElement> FinanceAllSubmittedAndApprovedAdv;
	public List<WebElement> getFinanceAllSubmittedAndApprovedAdv() {
		return FinanceAllSubmittedAndApprovedAdv;
	} 
	
	@FindBy(css = "#btnBack")
	private WebElement FinanceBackBtn;
	public WebElement getFinanceBackBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(FinanceBackBtn));
		return FinanceBackBtn;
	}
	
	// Payments Details
	@FindBy(xpath = "//a[text()='Payment']")
	private WebElement PaymentLink;
	public void getPaymentLink() {
		w2.until(ExpectedConditions.elementToBeClickable(PaymentLink));
		PaymentLink.click();
	}
	
	@FindBy(css = "#btnNewRequest")
	private WebElement CreatePaymentBtn;
	public void getCreatePaymentBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreatePaymentBtn));
		CreatePaymentBtn.click();
	}
	
	@FindBy(xpath = "//table[@id='dgAdavance']//tr[2]//td//input[contains(@id,'txtAdvance')]")
	private WebElement AdvanceDeducted;
	public WebElement getAdvanceDeducted() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceDeducted));
		AdvanceDeducted.clear();
		Thread.sleep(1000);
		return AdvanceDeducted;
	}
	
	@FindBy(xpath = "//table[@id='dgAdavance']//tr[2]//td//span[contains(@id,'lblAdavanceOutstanding')][not(contains(@id,'lblAdavanceOutstandingMul'))]")
	private WebElement AdvanceDeductedAmount;
	public String getAdvanceDeductedAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvanceDeductedAmount));
		return AdvanceDeductedAmount.getText();
	}
	
	public void MenuSubMenu() {
		try {
			mm = new MainMenu(iDriver);
			mm.clickExpenses();
			Thread.sleep(2000);
			exp = new Expenses(iDriver);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Expenses.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	String expID;

	public void createAdvanceAndPayments() throws Throwable {
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
			exp.clickPayments();
			getAdvanceLink();
			Frames.rightFrame();
			getCreateAdvance();
			appInd.singleDropDown(getAdvanceCompanyDD(), sheet.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getAdvanceExpenseTypeDD(), sheet.getRow(1).getCell(1).getStringCellValue());
			appInd.singleDropDown(getAdvanceExpenseSubTypeDD(), sheet.getRow(1).getCell(2).getStringCellValue());
			getAdvanceGoBtn();
			getAdvanceAmount().sendKeys("1000");
			appInd.seletDate(getAdvanceFromDate(), sheet.getRow(1).getCell(4).getStringCellValue());
			appInd.seletDate(getAdvanceToDate(), sheet.getRow(1).getCell(5).getStringCellValue());
			appInd.singleDropDown(getAdvanceVendorDD(), sheet.getRow(1).getCell(3).getStringCellValue());
			appInd.singleDropDown(getAdvanceWorkOrderNumber(), sheet.getRow(1).getCell(6).getStringCellValue());
			appInd.Selectbyindex(getAdvancePlaceofSupply(), 1);
			getAdvanceInvoiceNumber().sendKeys(appInd.RandomNoAsSpecified(6));
			appInd.seletDate(getAdvanceInvoiceDate(), sheet.getRow(1).getCell(4).getStringCellValue());
			appInd.singleDropDown(getAdvanceModeOfpayment(), sheet.getRow(1).getCell(7).getStringCellValue());
			appInd.seletDate(getAdvancePaymentDueDate(), sheet.getRow(1).getCell(4).getStringCellValue());
			appInd.singleDropDown(getAdvanceStatus(), sheet.getRow(1).getCell(8).getStringCellValue());
			getAdvanceSaveBtn();
			for (int j = 0; j < 4; j++) {
				if (appInd.AlertPresent()) {
					System.out.println(appInd.ifAlertPresentText());
					if (appInd.ifAlertPresentText().contains("successfully")) {
						appInd.isAlertPresent();
						break;
					} else {
						appInd.isAlertPresent();
					}
				} else {
					break;
				}
				Thread.sleep(1000);
			}
			expID = getAdvanceRequestId();
			Frames.SubMenuFrame();
			getApprovalsLink();
			getApprovalsWO();
			Frames.rightFrame();
			getAdvanceApprovalExpenseId().sendKeys(expID);
			getAdvanceApprovalGoBtn();
			getAdvanceApprovalClickExpenseID();
			appInd.singleDropDown(getAdvanceStatus(), "APPROVED");
			getAdvanceApprovalUpdateBtn();
			getAdvanceApprovalExpenseId().sendKeys(expID);
			getAdvanceApprovalGoBtn();
			getAdvanceApprovalClickExpenseID();
			appInd.singleDropDown(getAdvanceStatus(), "PROCESSED");
			appInd.seletDate(getAdvanceApprovalProcessedDate(), sheet.getRow(1).getCell(4).getStringCellValue());
			getAdvanceApprovalUpdateBtn();
			Frames.mainFrame();
			mm.clickFinance();
			Frames.SubMenuFrame();
			getFinanceExpense();
			Frames.tabFrame();
			getFinanceAdvanceaTab();
			Frames.mainDnFrame();
			getAdvanceApprovalExpenseId().sendKeys(expID);
			getAdvanceApprovalGoBtn();
			getAdvanceApprovalClickExpenseID();
			String parent = switchToChildWindow(getFinanceMakeBankPayment());
			try {
				appInd.selectDropDown(getFinanceBankAccount(), 1);
			} catch (Exception e) {
				System.out.println(e);
			}
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			getFinanceInstrumentNo().sendKeys(appInd.RandomNoAsSpecified(6));
			getFinanceSubmit();
			appInd.switchToParentWindow(parent);
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel(expID, "Advance Not Created", sheetname, Expenses.CreateOutPutPath);
			} else {
				Datatable.writeExcel(expID, "Advance Created", sheetname, Expenses.CreateOutPutPath);
			}
			}catch(Exception e) {
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
					Datatable.writeExcel(expID, "Advance Not Created", sheetname, Expenses.CreateOutPutPath);
			}
			createPayments();
		}
	}
	
	public void  createPayments() throws Throwable {
		try {
		toApprovedStatusAdavances();
		toProcessedStatusAdavances();
		toPaidStatusAdavances();
		mm.clickExpenses();
		exp.clickPayments();
		Thread.sleep(1000);
		getPaymentLink();
		Frames.rightFrame();
		getCreatePaymentBtn();
		appInd.singleDropDown(getAdvanceCompanyDD(), sheet.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAdvanceExpenseTypeDD(), sheet.getRow(1).getCell(1).getStringCellValue());
		appInd.singleDropDown(getAdvanceExpenseSubTypeDD(), sheet.getRow(1).getCell(2).getStringCellValue());
		getAdvanceGoBtn();
		getAdvanceAmount().sendKeys("1500");
		appInd.seletDate(getAdvanceFromDate(), sheet.getRow(1).getCell(4).getStringCellValue());
		appInd.seletDate(getAdvanceToDate(), sheet.getRow(1).getCell(5).getStringCellValue());
		appInd.singleDropDown(getAdvanceVendorDD(), sheet.getRow(1).getCell(3).getStringCellValue());
		appInd.singleDropDown(getAdvanceWorkOrderNumber(), sheet.getRow(1).getCell(6).getStringCellValue());
		appInd.Selectbyindex(getAdvancePlaceofSupply(), 1);
		getAdvanceInvoiceNumber().sendKeys(appInd.RandomNoAsSpecified(6));
		appInd.seletDate(getAdvanceInvoiceDate(), sheet.getRow(1).getCell(4).getStringCellValue());
		appInd.singleDropDown(getAdvanceModeOfpayment(), sheet.getRow(1).getCell(7).getStringCellValue());
		appInd.seletDate(getAdvancePaymentDueDate(), sheet.getRow(1).getCell(4).getStringCellValue());
		appInd.singleDropDown(getAdvanceStatus(), sheet.getRow(1).getCell(8).getStringCellValue());
		getAdvanceSaveBtn();
		for(int i=0;i<4;i++) {
			if (appInd.AlertPresent()) {
				System.out.println(appInd.ifAlertPresentText());
				if(appInd.ifAlertPresentText().contains("successfully")) {
					appInd.isAlertPresent();
					break;
				}else {
					appInd.isAlertPresent();
				}
			}else {
				break;
			}
			Thread.sleep(1000);
		}
		getAdvanceDeducted().sendKeys(getAdvanceDeductedAmount());	
		getAdvanceSaveBtn();
		for(int i=0;i<4;i++) {
			if (appInd.AlertPresent()) {
				if(appInd.ifAlertPresentText().contains("successfully")) {
					appInd.isAlertPresent();
					break;
				}else {
					appInd.isAlertPresent();
				}
			}else {
				break;
			}
			Thread.sleep(1000);
		}		
		expID = getAdvanceRequestId();
		if (appInd.AlertPresent()) {
			appInd.isAlertPresent();
			Datatable.writeExcel(expID, "Payment Not Created", sheetname, Expenses.CreateOutPutPath);
		} else {
			Datatable.writeExcel(expID, "Payment Created", sheetname, Expenses.CreateOutPutPath);
		}
		}catch(Exception e) {
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
				Datatable.writeExcel(expID, "Payment Not Created", sheetname, Expenses.CreateOutPutPath);
		}
	}

	int tosub = 1;

	public void toApprovedStatusAdavances() throws Throwable {
		Frames.mainFrame();
		mm.clickFinance();
		Frames.SubMenuFrame();
		getFinanceExpense();
		for (int i = 0; i < tosub; i++) {
			Frames.tabFrame();
			getFinanceAdvanceaTab();
			Frames.mainDnFrame();
			appInd.singleDropDown(getFinanceVendor(), sheet.getRow(1).getCell(3).getStringCellValue());
			appInd.singleDropDown(getFinanceStatus(), "SUBMITTED");
			getAdvanceApprovalGoBtn();
			try {
				if (getFinancePageSize().isDisplayed()) {
					appInd.singleDropDown(getFinancePageSize(), "All");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			if (i == 0) {
				tosub = getFinanceAllSubmittedAndApprovedAdv().size();
			}

			List<WebElement> processedRecords = getFinanceAllSubmittedAndApprovedAdv();
			if (processedRecords.size() > 0) {
				processedRecords.get(0).click();
				appInd.singleDropDown(getAdvanceStatus(), "APPROVED");
				getAdvanceApprovalUpdateBtn();
			}
		}
	}
	
	int toApp = 1;

	public void toProcessedStatusAdavances() throws Throwable {
		Frames.mainFrame();
		mm.clickFinance();
		Frames.SubMenuFrame();
		getFinanceExpense();
		for (int i = 0; i < toApp; i++) {
			Frames.tabFrame();
			getFinanceAdvanceaTab();
			Frames.mainDnFrame();
			appInd.singleDropDown(getFinanceVendor(), sheet.getRow(1).getCell(3).getStringCellValue());
			appInd.singleDropDown(getFinanceStatus(), "APPROVED");
			getAdvanceApprovalGoBtn();
			try {
				if (getFinancePageSize().isDisplayed()) {
					appInd.singleDropDown(getFinancePageSize(), "All");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			if (i == 0) {
				toApp = getFinanceAllSubmittedAndApprovedAdv().size();
			}
			List<WebElement> processedRecords = getFinanceAllSubmittedAndApprovedAdv();
			if (processedRecords.size() > 0) {
				processedRecords.get(0).click();
				appInd.singleDropDown(getAdvanceStatus(), "PROCESSED");
				appInd.seletDate(getAdvanceApprovalProcessedDate(), sheet.getRow(1).getCell(4).getStringCellValue());
				getAdvanceApprovalUpdateBtn();
			}
		}
	}
	

	int penAdv = 1;

	public void toPaidStatusAdavances() throws Throwable {
		Frames.mainFrame();
		mm.clickFinance();
		Frames.SubMenuFrame();
		getFinanceExpense();
		for (int i = 0; i < penAdv; i++) {
			Frames.tabFrame();
			getFinanceAdvanceaTab();
			Frames.mainDnFrame();
			appInd.singleDropDown(getFinanceVendor(), sheet.getRow(1).getCell(3).getStringCellValue());
			getAdvanceApprovalGoBtn();
			try {
				if (getFinancePageSize().isDisplayed()) {
					appInd.singleDropDown(getFinancePageSize(), "All");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			if (i == 0) {
				penAdv = getFinanceAllPendingAdv().size();
			}
			System.out.println(penAdv);
			List<WebElement> processedRecords = getFinanceAllPendingAdv();
			if (processedRecords.size() > 0) {
				processedRecords.get(0).click();

				String parent = switchToChildWindow(getFinanceMakeBankPayment());
				try {
					appInd.selectDropDown(getFinanceBankAccount(), 1);
				} catch (Exception e) {
					System.out.println(e);
				}
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				getFinanceInstrumentNo().sendKeys(appInd.RandomNoAsSpecified(6));
				getFinanceSubmit();
				appInd.switchToParentWindow(parent);
				Thread.sleep(1000);
			}
		}
	}
	
	public String switchToChildWindow(WebElement onClick) throws Throwable {
		
		String parent = oBrowser.getWindowHandle();
		if(onClick != null) {
			onClick.click();
		}
		Set<String> childs = oBrowser.getWindowHandles();
		for(String e : childs) {
			
			if(!e.equals(parent)) {
				oBrowser.switchTo().window(e);
			}
		}
		return parent;
	}
}
