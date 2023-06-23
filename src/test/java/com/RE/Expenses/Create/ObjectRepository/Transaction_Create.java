package com.RE.Expenses.Create.ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Expenses.Create.Test.Transaction_Create_Test;
import com.RE.Submodules.Expenses;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Transaction_Create extends Transaction_Create_Test {

	public static XSSFSheet Budgetsheet;
	public static XSSFSheet WOsheet;
	public static XSSFSheet ADVPAYsheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String Budgetsheetname = "BudgetPeriod_Create";
	public static String WOsheetname = "WO_Create";
	public static String ADVPAYsheetname = "AdvanceAndPayments_Create";
	public static String Outputsheetname = "Transaction_Create";
	public static Expenses expense;
	public static Expenses exp;

	public Transaction_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	} 
	
	@FindBy(xpath = "//a[text()='Budget Period']")
	private WebElement BudgetPeriodLink;
	public void getBudgetPeriodLink() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetPeriodLink));
		BudgetPeriodLink.click();
	} 
	
	@FindBy(css = "#btnNewPeriod")
	private WebElement CreateBudgetPeriodBtn;
	public void getCreateBudgetPeriodBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBudgetPeriodBtn));
		CreateBudgetPeriodBtn.click();
	} 
	
	@FindBy(css = "#ddlCompany")
	private WebElement CompanyDD;
	public WebElement getCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
		return CompanyDD;
	} 
	
	@FindBy(css = "#txtFromDate_txtDatePicker")
	private WebElement FromDate;
	public WebElement getFromDate() {
		w2.until(ExpectedConditions.elementToBeClickable(FromDate));
		return FromDate;
	}
	
	@FindBy(css = "#txtToDate_txtDatePicker")
	private WebElement ToDate;
	public WebElement getToDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ToDate));
		return ToDate;
	}
	
	@FindBy(css = "#txtRemarks")
	private WebElement Remarks;
	public WebElement getRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(Remarks));
		return Remarks;
	}
	
	@FindBy(css = "#ddlStatus")
	private WebElement Status;
	public WebElement getStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(Status));
		return Status;
	}
	
	@FindBy(css = "#btnSubmit")
	private WebElement CreateBtn;
	public void getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		CreateBtn.click();
	}
	
	@FindBy(xpath = "//a[text()='Approvals ']")
	private WebElement ApprovalsLink;
	public void getApprovalsLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsLink));
		ApprovalsLink.click();
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']//following-sibling::div//a[text()='Budget Period']")
	private WebElement ApprovalsBudgetPeriod;
	public void getApprovalsBudgetPeriod() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsBudgetPeriod));
		ApprovalsBudgetPeriod.click();
	} 
	
	@FindBy(xpath = "//table[@id='dgBudgetPeriod']//a[contains(@id,'FromDate')]")
	private List<WebElement> clickBudgetPeriod;
	public List<WebElement> getclickBudgetPeriod() {
		return clickBudgetPeriod;
	} 
	
	@FindBy(xpath = "//a[text()='Budget'][@id='defTab']")
	private WebElement clickBudget;
	public void getclickBudget() {
		w2.until(ExpectedConditions.elementToBeClickable(clickBudget));
		clickBudget.click();
	} 
	
	// Budget entity
	
	@FindBy(xpath = "//a[text()='Budget'][@id='dir']")
	private WebElement clickBudgetBudget;
	public void getclickBudgetBudget() {
		w2.until(ExpectedConditions.elementToBeClickable(clickBudgetBudget));
		clickBudgetBudget.click();
	} 
	
	@FindBy(css = "#btnNewPeriod")
	private WebElement CreateBudgetBtn;
	public void getCreateBudgetBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBudgetBtn));
		CreateBudgetBtn.click();
	}
	
	@FindBy(css = "#ddlDate")
	private WebElement PeriodDD;
	public WebElement getPeriodDD() {
		w2.until(ExpectedConditions.elementToBeClickable(PeriodDD));
		return PeriodDD;
	} 
	
	@FindBy(css = "#txtDescription")
	private WebElement Description;
	public WebElement getDescription() {
		w2.until(ExpectedConditions.elementToBeClickable(Description));
		return Description;
	} 
	
	@FindBy(css = "#btnSearch")
	private WebElement GoBtn;
	public void getGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(GoBtn));
		GoBtn.click();
	}
	
	@FindBy(css = "#lnkBtnAddRow")
	private WebElement AddRowLink;
	public void getAddRowLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AddRowLink));
		AddRowLink.click();
	}
	
	@FindBy(xpath = "//select[contains(@id,'gvBudget')]")
	private WebElement AddType;
	public WebElement getAddType() {
		w2.until(ExpectedConditions.elementToBeClickable(AddType));
		return AddType;
	} 	
	
	@FindBy(xpath = "//input[contains(@id,'gvBudget')][contains(@title,'Click to add SubType  ')]")
	private WebElement ClickSubType;
	public void getClickSubType() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickSubType));
		ClickSubType.click();
	} 
	
	@FindBy(xpath = "//table[contains(@id,'gvBudgetView')]//tr//td[3]//input")
	private WebElement BudgetAllocatedAmount;
	public WebElement getBudgetAllocatedAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetAllocatedAmount));
		return BudgetAllocatedAmount;
	} 	
	
	@FindBy(css = "#btnUpdate")
	private WebElement Update;
	public WebElement getUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(Update));
		return Update;
	}
	
	@FindBy(xpath = "//table[@id='gvBudgetList']//tr[2]//a[contains(@id,'gvBudget')]")
	private WebElement ClickPeriod;
	public void getClickPeriod() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickPeriod));
		ClickPeriod.click();
	} 
	
	@FindBy(xpath = "//select[@id='ddlDate']//option[2]")
	private WebElement SelectedPeriod;
	public String getSelectedPeriod() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectedPeriod));
		return SelectedPeriod.getText();
	} 
	
	@FindBy(xpath = "//tr[3]//select[contains(@id,'gvBudget')]")
	private WebElement AddSubType;
	public WebElement getAddSubType() {
		w2.until(ExpectedConditions.elementToBeClickable(AddSubType));
		return AddSubType;
	} 
	
	@FindBy(css = "#btnModify")
	private WebElement BudgetCreateBtn;
	public void getBudgetCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetCreateBtn));
		BudgetCreateBtn.click();
	}
	
	@FindBy(css = "#btnSubmit")
	private WebElement SubmitBtn;
	public void getSubmitBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		SubmitBtn.click();
	}
	
	
	// Work Order Creation =========================================================================================================== 
	
	@FindBy(css = "#btnCreate")
	private WebElement CreateWOBtn;
	public void getCreateWOBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateWOBtn));
		CreateWOBtn.click();
	}
	
	@FindBy(css = "select#ddlCompany")
	private WebElement WOCompanyDD;
	public WebElement getWOCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(WOCompanyDD));
		return WOCompanyDD;
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
	private WebElement WOAddRowLink;
	public void getWOAddRowLink() {
		w2.until(ExpectedConditions.elementToBeClickable(WOAddRowLink));
		WOAddRowLink.click();
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
	private WebElement WOCreateBtn;
	public void getWOCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(WOCreateBtn));
		WOCreateBtn.click();
	}
	
	@FindBy(xpath = "//a[contains(@id,'dgWorkOrde')][contains(@href,'lnkDisplay')]")
	private WebElement WODisplayNumber;
	public WebElement getWODisplayNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(WODisplayNumber));
		return WODisplayNumber;
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']")
	private WebElement WOApprovalsLink;
	public void getWOApprovalsLink() {
		w2.until(ExpectedConditions.elementToBeClickable(WOApprovalsLink));
		WOApprovalsLink.click();
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
	
	// Advance and Payments======================================================================================
	
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
	
	@FindBy(xpath = "//a[text()='Approvals ']//following-sibling::div//a[contains(text(),'Advance')]")
	private WebElement ApprovalsADV;
	public void getApprovalsADV() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsADV));
		ApprovalsADV.click();
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
			MainMenu mm = new MainMenu(iDriver);
			mm.clickExpenses();
			Thread.sleep(2000);
			xml = new Datatable();
			Budgetsheet = xml.excelData(Budgetsheetname, Expenses.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	int date ;
	String budgetDate;
	public void createBudgetPeriod() throws Throwable {
		date = Integer.parseInt(Budgetsheet.getRow(0).getCell(1).getStringCellValue());

			try {
				Frames.SubMenuFrame();
				Thread.sleep(1000);
				getBudgetPeriodLink();
				Frames.rightFrame();
				getCreateBudgetPeriodBtn();
				Thread.sleep(1000);
				appInd.singleDropDown(getCompanyDD(), Budgetsheet.getRow(1).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				budgetDate = appInd.getDateAsSpecified(date);
				appInd.seletDate(getFromDate(), budgetDate);
				Thread.sleep(1000);
				appInd.seletDate(getToDate(), budgetDate);
				Thread.sleep(1000);
				getRemarks().sendKeys("Budget From and To Date - " + budgetDate);
				date--;
				appInd.singleDropDown(getStatus(), Budgetsheet.getRow(1).getCell(3).getStringCellValue());
				Thread.sleep(1000);
				getCreateBtn();
				Frames.SubMenuFrame();
				getApprovalsLink();
				Thread.sleep(1000);
				getApprovalsBudgetPeriod();
				Frames.rightFrame();
				
				for(WebElement e : getclickBudgetPeriod()) {
					
					if(e.getText().equals(budgetDate)) {
						e.click();
					}
				}
				appInd.singleDropDown(getStatus(), Budgetsheet.getRow(1).getCell(4).getStringCellValue());
				Thread.sleep(1000);
				getCreateBtn();
				
				Frames.SubMenuFrame();
				Thread.sleep(1000);
				getclickBudget();
				Frames.rightFrame();
				getCreateBudgetBtn();
				appInd.singleDropDown(getCompanyDD(), Budgetsheet.getRow(1).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPeriodDD(), (budgetDate+" - "+budgetDate));
				getDescription().sendKeys((budgetDate+" - "+budgetDate));
				getGoBtn();
				getAddRowLink();
				appInd.singleDropDown(getAddType(), Budgetsheet.getRow(1).getCell(5).getStringCellValue());
				getClickSubType();
				appInd.singleDropDown(getAddSubType(), Budgetsheet.getRow(1).getCell(6).getStringCellValue());
				getBudgetAllocatedAmount().sendKeys("1000000000");
				getBudgetCreateBtn();
				Thread.sleep(1000);
				
				appInd.singleDropDown(getStatus(), Budgetsheet.getRow(1).getCell(3).getStringCellValue());
				appInd.clickWebelement(getUpdate());
				appInd.singleDropDown(getCompanyDD(), Budgetsheet.getRow(1).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPeriodDD(), (budgetDate+" - "+budgetDate));
				getGoBtn();
				getClickPeriod();
				appInd.singleDropDown(getStatus(), Budgetsheet.getRow(1).getCell(4).getStringCellValue());
				appInd.clickWebelement(getUpdate());
				
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				Thread.sleep(1000);
				String parent = appInd.switchToChildWindow(null);
				getSubmitBtn();
				appInd.switchToParentWindow(parent);
				
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
					Datatable.writeExcel(budgetDate, "Budget Date Not Created", Outputsheetname, Expenses.CreateOutPutPath);
				} else {
					Datatable.writeExcel(budgetDate, "Budget Date Created", Outputsheetname, Expenses.CreateOutPutPath);
				}
			} catch (Exception e) {
				System.out.println(e);
				Datatable.writeExcel(budgetDate, "Budget Date Not Created", Outputsheetname, Expenses.CreateOutPutPath);
			}
		
		writeExcelBudget("Date", (String.valueOf((date))), Budgetsheetname, Expenses.CreateInputPath);
	}
	
	
	public void WOMenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickExpenses();
			Thread.sleep(2000);
			exp = new Expenses(iDriver);
			exp.clickWorkOrder();
			xml = new Datatable();
			WOsheet = xml.excelData(WOsheetname, Expenses.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	String WONumber;
	public void createWO() throws Throwable {

			try {
			Frames.rightFrame();
			getCreateWOBtn();
			appInd.singleDropDown(getWOCompanyDD(), WOsheet.getRow(1).getCell(0).getStringCellValue());
			appInd.singleDropDown(getWOtypeDD(), WOsheet.getRow(1).getCell(1).getStringCellValue());
			appInd.singleDropDown(getExpensetypeDD(), WOsheet.getRow(1).getCell(2).getStringCellValue());
			appInd.singleDropDown(getExpenseSubtypeDD(), WOsheet.getRow(1).getCell(3).getStringCellValue());
			appInd.singleDropDown(getVendorNameDD(), WOsheet.getRow(1).getCell(4).getStringCellValue());
			getScopeOfWork().sendKeys("Scope of Work" + WOsheet.getRow(1).getCell(6).getStringCellValue()+ WOsheet.getRow(1).getCell(7).getStringCellValue());
			getContactName().sendKeys(WOsheet.getRow(1).getCell(5).getStringCellValue());
			appInd.seletDate(getBudgetFromDate(), budgetDate);
			appInd.seletDate(getBudgetToDate(), budgetDate);
			String parent = appInd.switchToChildWindow(getAddWO());
			getWOAddRowLink();
			getItemName().sendKeys(WOsheet.getRow(1).getCell(8).getStringCellValue());
			getItemDescription().sendKeys(WOsheet.getRow(1).getCell(9).getStringCellValue());
			appInd.singleDropDown(getWOUnits(), WOsheet.getRow(1).getCell(10).getStringCellValue());
			getWORate().sendKeys(WOsheet.getRow(1).getCell(11).getStringCellValue());
			getWOQuantity().sendKeys(WOsheet.getRow(1).getCell(12).getStringCellValue());
			getWOSubmitBtn();
			appInd.switchToParentWindow(parent);
			Frames.rightFrame();
			getWODescriptions().sendKeys("Work Order Description");
			int Atax = Integer.parseInt(WOsheet.getRow(0).getCell(13).getStringCellValue());
			int Aitem = 1;
			for (int j = 1; j <= Atax; j++) {
				getAddTaxAddRow();
				appInd.singleDropDown(iDriver.findElement(By.xpath("(//select[contains(@id,'AdditionTax')][contains(@onchange,'IsTaxAdded')])[" + j + "]")),WOsheet.getRow(Aitem).getCell(13).getStringCellValue());
				Aitem++;
				appInd.singleDropDown(iDriver.findElement(By.xpath("(//select[contains(@id,'AdditionTax')][contains(@onchange,'IsInclusive')])[" + j + "]")),WOsheet.getRow(1).getCell(15).getStringCellValue());
				WebElement workOrderValue = iDriver.findElement(By.xpath("(//table[@id='dgTaxAdditions']//tr//td[6]//input)[" + j + "]"));
				workOrderValue.click();
				robotClickBackSpace(4);
				workOrderValue.sendKeys("100");

			}
			Thread.sleep(1000);
			int Dtax = Integer.parseInt(WOsheet.getRow(0).getCell(14).getStringCellValue());
			Aitem = 1;
			for (int j = 1; j <= Dtax; j++) {
				getDedTaxAddRow();
				appInd.singleDropDown(iDriver.findElement(By.xpath("(//select[contains(@id,'DeductionTax')][contains(@onchange,'IsTaxDedu')])[" + j + "]")),WOsheet.getRow(Aitem).getCell(14).getStringCellValue());
				Aitem++;
			}
			appInd.singleDropDown(getStatusDD(), "SUBMITTED");
			getWOCreateBtn();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel("Work Order", "Not Created", Outputsheetname, Expenses.CreateOutPutPath);
			} else {
				Datatable.writeExcel("Work Order", "Created", Outputsheetname, Expenses.CreateOutPutPath);
			}
			}catch (Exception e) {
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				Datatable.writeExcel("Work Order", "Not Created", Outputsheetname, Expenses.CreateOutPutPath);
			}
			try {
			WONumber = getWODisplayNumber().getText();
			Frames.SubMenuFrame();
			getWOApprovalsLink();
			getApprovalsWO();
			Frames.rightFrame();
			appInd.singleDropDown(getWOCompanyDD(), WOsheet.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getApprovalsWOtypeDD(), WOsheet.getRow(1).getCell(2).getStringCellValue());
			appInd.singleDropDown(getApprovalsWOSubtypeDD(), WOsheet.getRow(1).getCell(3).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getApprovalsWorkOrderDD(), WONumber);
			getApprovalsGoBtn();
			getWODisplayNumber().click();
			appInd.singleDropDown(getStatusDD(), "APPROVED");
			getWOCreateBtn();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel(WONumber, "Work Order not Approved", Outputsheetname, Expenses.CreateOutPutPath);
			} else {
				Datatable.writeExcel(WONumber, "Work Order Approved", Outputsheetname, Expenses.CreateOutPutPath);
			}
			}catch (Exception e) {
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				Datatable.writeExcel(WONumber, "Work Order not Approved", Outputsheetname, Expenses.CreateOutPutPath);
			}
		
	}
	MainMenu mm;
	public void ADVPAYMenuSubMenu() {
		try {
			mm = new MainMenu(iDriver);
			mm.clickExpenses();
			Thread.sleep(2000);
			exp = new Expenses(iDriver);
			xml = new Datatable();
			ADVPAYsheet = xml.excelData(ADVPAYsheetname, Expenses.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	String expID;

	public void createAdvanceAndPayments() throws Throwable {

			try {
			exp.clickPayments();
			getAdvanceLink();
			Frames.rightFrame();
			getCreateAdvance();
			appInd.singleDropDown(getAdvanceCompanyDD(), ADVPAYsheet.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getAdvanceExpenseTypeDD(), ADVPAYsheet.getRow(1).getCell(1).getStringCellValue());
			appInd.singleDropDown(getAdvanceExpenseSubTypeDD(), ADVPAYsheet.getRow(1).getCell(2).getStringCellValue());
			getAdvanceGoBtn();
			getAdvanceAmount().sendKeys("1000");
			appInd.seletDate(getAdvanceFromDate(), budgetDate);
			appInd.seletDate(getAdvanceToDate(), budgetDate);
			appInd.singleDropDown(getAdvanceVendorDD(), ADVPAYsheet.getRow(1).getCell(3).getStringCellValue());
			appInd.singleDropDown(getAdvanceWorkOrderNumber(), WONumber);
			appInd.Selectbyindex(getAdvancePlaceofSupply(), 1);
			getAdvanceInvoiceNumber().sendKeys(appInd.RandomNoAsSpecified(6));
			appInd.seletDate(getAdvanceInvoiceDate(), budgetDate);
			appInd.singleDropDown(getAdvanceModeOfpayment(), ADVPAYsheet.getRow(1).getCell(7).getStringCellValue());
			appInd.seletDate(getAdvancePaymentDueDate(), budgetDate);
			appInd.singleDropDown(getAdvanceStatus(), ADVPAYsheet.getRow(1).getCell(8).getStringCellValue());
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
			getApprovalsADV();
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
			appInd.seletDate(getAdvanceApprovalProcessedDate(), budgetDate);
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
				System.out.println("Alert name :: "+appInd.ifAlertPresentText());
			}
			getFinanceInstrumentNo().sendKeys(appInd.RandomNoAsSpecified(6));
			getFinanceSubmit();
			appInd.switchToParentWindow(parent);
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				System.out.println("Alert name :: "+appInd.ifAlertPresentText());
				Datatable.writeExcel(expID, "Advance Not Created", Outputsheetname, Expenses.CreateOutPutPath);
			} else {
				Datatable.writeExcel(expID, "Advance Created", Outputsheetname, Expenses.CreateOutPutPath);
			}
			}catch(Exception e) {
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
					Datatable.writeExcel(expID, "Advance Not Created", Outputsheetname, Expenses.CreateOutPutPath);
			}
			createPayments();
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
		appInd.singleDropDown(getAdvanceCompanyDD(), ADVPAYsheet.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAdvanceExpenseTypeDD(), ADVPAYsheet.getRow(1).getCell(1).getStringCellValue());
		appInd.singleDropDown(getAdvanceExpenseSubTypeDD(), ADVPAYsheet.getRow(1).getCell(2).getStringCellValue());
		getAdvanceGoBtn();
		getAdvanceAmount().sendKeys("1500");
		appInd.seletDate(getAdvanceFromDate(), budgetDate);
		appInd.seletDate(getAdvanceToDate(), budgetDate);
		appInd.singleDropDown(getAdvanceVendorDD(), ADVPAYsheet.getRow(1).getCell(3).getStringCellValue());
		appInd.singleDropDown(getAdvanceWorkOrderNumber(), ADVPAYsheet.getRow(1).getCell(6).getStringCellValue());
		appInd.Selectbyindex(getAdvancePlaceofSupply(), 1);
		getAdvanceInvoiceNumber().sendKeys(appInd.RandomNoAsSpecified(6));
		appInd.seletDate(getAdvanceInvoiceDate(), budgetDate);
		appInd.singleDropDown(getAdvanceModeOfpayment(), ADVPAYsheet.getRow(1).getCell(7).getStringCellValue());
		appInd.seletDate(getAdvancePaymentDueDate(), budgetDate);
		appInd.singleDropDown(getAdvanceStatus(), ADVPAYsheet.getRow(1).getCell(8).getStringCellValue());
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
			Datatable.writeExcel(expID, "Payment Not Created", Outputsheetname, Expenses.CreateOutPutPath);
		} else {
			Datatable.writeExcel(expID, "Payment Created", Outputsheetname, Expenses.CreateOutPutPath);
		}
		}catch(Exception e) {
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
				Datatable.writeExcel(expID, "Payment Not Created", Outputsheetname, Expenses.CreateOutPutPath);
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
			appInd.singleDropDown(getFinanceVendor(), ADVPAYsheet.getRow(1).getCell(3).getStringCellValue());
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
			appInd.singleDropDown(getFinanceVendor(), ADVPAYsheet.getRow(1).getCell(3).getStringCellValue());
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
				appInd.seletDate(getAdvanceApprovalProcessedDate(), budgetDate);
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
			appInd.singleDropDown(getFinanceVendor(), ADVPAYsheet.getRow(1).getCell(3).getStringCellValue());
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

	public void robotClickBackSpace(int n) throws Throwable {
		for (int i = 0; i < n; i++) {
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_BACK_SPACE);
			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
	}
	
	public void writeExcelBudget(String testname, String output, String sheetname, String path) throws IOException {

		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = null;
		Workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = Workbook.getSheet(sheetname);
		Row newRow = sheet.createRow(0);
		String s[] = { testname, output };
		for (int j = 0; j < 2; j++) {
			Cell cell = newRow.createCell(j);
			cell.setCellValue(s[j]);
		}
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		Workbook.write(outputStream);
		outputStream.close();
	}
}
