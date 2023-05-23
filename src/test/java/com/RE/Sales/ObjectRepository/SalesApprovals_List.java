package com.RE.Sales.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import com.RE.Sales.Test.SalesApprovals_List_Test;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class SalesApprovals_List extends SalesApprovals_List_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public SalesApprovals_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	@FindBy(xpath = "//a[text()='Transfer Unit'][contains(@href,'Approvals')]")
	private WebElement TrnasferUnit;
	public void getTrnasferUnit() {
		TrnasferUnit.click();
	}
	
	@FindBy(xpath = "//a[text()='Clean House'][contains(@href,'SalesCleanHouseListPage')]")
	private WebElement cleanhouse;
	public void getcleanhouse() {
		cleanhouse.click();
	}
	@FindBy(xpath = "//a[text()='Promotion Agent'][contains(@href,'Approvals')]")
	private WebElement PromotionAgent;
	public void getPromotionAgent() {
		PromotionAgent.click();
	}
	@FindBy(xpath = "//a[text()='Bookings'][contains(@href,'Approvals')]")
	private WebElement Bookings;
	public void getBookings() {
		Bookings.click();
	}
	
	@FindBy(xpath = "//a[text()='Saleable stock'][contains(@href,'Approvals')]")
	private WebElement SaleableStock;
	public void getSaleableStock() {
		SaleableStock.click();
	}
	@FindBy(xpath = "//a[text()='Sales Agent'][contains(@href,'Approvals')]")
	private WebElement SalesAgent;
	public void getSalesAgent() {
		SalesAgent.click();
	}
	@FindBy(xpath = "//a[text()='Bulk Charge Change'][contains(@href,'Approvals')]")
	private WebElement BulkChargeChange;
	public void getBulkChargeChange() {
		BulkChargeChange.click();
	}
	@FindBy(xpath = "//a[text()='Blocked Units'][contains(@href,'Approvals')]")
	private WebElement BlockedUnits;
	public void getBlockedUnits() {
		BlockedUnits.click();
	}
	@FindBy(xpath = "//a[text()='Units Moving Request'][contains(@href,'UnitsMovingApprovals')]")
	private WebElement UnitMoving;
	public void getUnitMoving() {
		UnitMoving.click();
	}
	
	@FindBy(xpath = "//a[text()='Standard Modification'][contains(@href,'Approvals')]")
	private WebElement StandardModification;
	public void getStandardModification() {
		StandardModification.click();
	}
	
	@FindBy(xpath = "//a[text()='Solicitor Master'][contains(@href,'Approvals')]")
	private WebElement SolicitorMaster;
	public void getSolicitorMaster() {
		SolicitorMaster.click();
	}
	@FindBy(xpath = "//a[text()='Loan Application'][contains(@href,'Approvals')]")
	private WebElement LoanApplication;
	public void getLoanApplication() {
		LoanApplication.click();
	}
	
	@FindBy(xpath = "//a[text()='Receipts'][contains(@href,'Approvals')]")
	private WebElement Receipts;
	public void getReceipts() {
		Receipts.click();
	}
	@FindBy(xpath = "//a[text()='Agent Receipt'][contains(@href,'Approvals')]")
	private WebElement SalesAgentReceipt;
	public void getagenteceipt() {
		SalesAgentReceipt.click();
	}
	
	@FindBy(xpath = "//a[text()='Administrative Receipts'][contains(@href,'Approvals')]")
	private WebElement AdministrativeReceipts;
	public void getAdministrativeReceipts() {
		AdministrativeReceipts.click();
	}
	
	@FindBy(xpath = "//a[text()='Temporary Receipts'][contains(@href,'Approvals')]")
	private WebElement TemporaryReceipts;
	public void getTemporaryReceipts() {
		TemporaryReceipts.click();
	}
	@FindBy(xpath = "//a[text()='Customer Request']")
	private WebElement CustomerRequest;
	public void getCustomerRequest() {
		CustomerRequest.click();
	}
	
	@FindBy(xpath = "//a[text()='Company Debit Note Receipt'][contains(@href,'Approvals')]")
	private WebElement CompanyDNReceipt;
	public void getCompanyDNReceipt() {
		CompanyDNReceipt.click();
	}
	
	@FindBy(xpath = "//a[text()='Solicitor Receipts'][contains(@href,'Approvals')]")
	private WebElement SolicitorReceipts;
	public void getSolicitorReceipts() {
		SolicitorReceipts.click();
	}
	
	@FindBy(xpath = "//a[text()='Sales Payments'][contains(@href,'Approvals')]")
	private WebElement SalesPayments;
	public void getSalesPayments() {
		SalesPayments.click();
	}
	
	@FindBy(xpath = "//a[text()='Advance Payments'][contains(@href,'APPROVALS')]")
	private WebElement AdvancePayments;
	public void getAdvancePayments() {
		AdvancePayments.click();
	}

	@FindBy(xpath = "//a[text()='Customer Credit Note'][contains(@href,'Approvals')]")
	private WebElement CustomerCreditNote;
	public void getCustomerCreditNote() {
		CustomerCreditNote.click();
	}
	
	@FindBy(xpath = "//a[text()='Agent Credit Note'][contains(@href,'ListSACreditNote')]")
	private WebElement agentcreditnote;
	public void getagentcreditnote() {
		agentcreditnote.click();
	}
	
	@FindBy(xpath = "//a[text()='Customer Debit Note'][contains(@href,'Approvals')]")
	private WebElement CustomerDebitNote;
	public void getCustomerDebitNote() {
		CustomerDebitNote.click();
	}
	
	@FindBy(xpath = "//a[text()='Agent Debit Note'][contains(@href,'ListSalesAgentDebitNote')]")
	private WebElement AgentDebitNote;
	public void getAgentDebitNote() {
		AgentDebitNote.click();
	}
	
	
	@FindBy(xpath = "//a[text()='Interest Waive Off'][contains(@href,'Approvals')]")
	private WebElement InterestWaiveOff;
	public void getInterestWaiveOff() {
		InterestWaiveOff.click();
	}
	
	@FindBy(xpath = "//a[text()='Direct Int.Waive Off'][contains(@href,'Approvals')]")
	private WebElement DirectIntWaiveOff;
	public void getDirectIntWaiveOff() {
		DirectIntWaiveOff.click();
	}

	@FindBy(xpath = "//a[text()='Company Payment'][contains(@href,'Approvals')]")
	private WebElement CompanyPayment;
	public void getCompanyPayment() {
		CompanyPayment.click();
	}
	
	@FindBy(xpath = "//a[text()='SDR Payments'][contains(@href,'Approvals')]")
	private WebElement SDRPayments;
	public void getSDRPayments() {
		SDRPayments.click();
	}
	
	@FindBy(xpath = "//a[text()='Promotion Budget'][contains(@href,'Approvals')]")
	private WebElement PromotionBudget;
	public void getPromotionBudget() {
		PromotionBudget.click();
	}
	
	@FindBy(xpath = "//a[text()='Promotion Request'][contains(@href,'ListApprovalPromotionRequests')]")
	private WebElement PromotionRequest;
	public void getPromotionRequest() {
		PromotionRequest.click();
	}

	@FindBy(xpath = "//a[text()='Promotion Payments']")
	private WebElement PromotionPayments;
	public void getPromotionPayments() {
		PromotionPayments.click();
	}
	
	@FindBy(xpath = "//a[text()='Agent Debit Note'][contains(@href,'ListPromotionalAgentDebitNote')]")
	private WebElement MarketAgentDebitNote;
	public void getMarketAgentDebitNote() {
		MarketAgentDebitNote.click();
	}
	
	@FindBy(xpath = "//a[text()='Agent Receipt'][contains(@href,'ListPADebitNoteReceipt')]")
	private WebElement AgentReceipt;
	public void getAgentReceipt() {
		AgentReceipt.click();
	}
	@FindBy(xpath = "//a[text()='Agent Credit Note'][contains(@href,'ListPACreditNote')]")
	private WebElement AgentCreditNote;
	public void getAgentCreditNote() {
		AgentCreditNote.click();
	}
	
	@FindBy(xpath = "//a[text()='No Due Certificates'][contains(@href,'NoDueCertificateListPage')]")
	private WebElement NoDueCertificates;
	public void getNoDueCertificates() {
		NoDueCertificates.click();
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			Sales en = new Sales(iDriver);
			en.clickApprovals();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname,Sales.inputPath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	
	public  void Quotations() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);
				
	}
	
	public  void TransferUnit() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getTrnasferUnit();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void CleanHouse() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getcleanhouse();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void PromotionAgent() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getPromotionAgent();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void Bookings() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getBookings();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void SaleableStock() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getSaleableStock();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void SalesAgent() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getSalesAgent();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void BulkChargeChange() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getBulkChargeChange();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void BlockedUnits() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getBlockedUnits();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void UnitMoving() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getUnitMoving();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void StandardModification() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getStandardModification();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void SolicitorMaster() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getSolicitorMaster();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void LoanApplication() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getLoanApplication();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	
	public  void PaymentReceipts() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getReceipts();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void SalesAgentReceipt() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getagenteceipt();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void AdministrativeReceipts() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getAdministrativeReceipts();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void TemporaryReceipts() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getTemporaryReceipts();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	
	public  void CustomerRequest() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getCustomerRequest();
		Thread.sleep(1000);
		Frames.innerFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(2000);			
	}
	public  void CompanyDNReceipt() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getCompanyDNReceipt();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void SolicitorReceipts() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getSolicitorReceipts();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	
	public  void SalesPayments() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getSalesPayments();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void AdvancePayments() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getAdvancePayments();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void CustomerCreditNote() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getCustomerCreditNote();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void Paymentsagentcreditnote() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getagentcreditnote();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void CustomerDebittNote() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getCustomerDebitNote();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void AgentDebittNote() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getAgentDebitNote();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void InterestWaiveOff() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getInterestWaiveOff();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void DirectIntWaiveOff() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getDirectIntWaiveOff();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void CompanyPayment() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getCompanyPayment();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void SDRPayment() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getSDRPayments();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void PromotionBudget() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getPromotionBudget();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void PromotionRequest() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Thread.sleep(1000);
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getPromotionRequest();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void PromotionPayments() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getPromotionPayments();
		Thread.sleep(1000);
		Frames.innerFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void MarkettingAgentDebitNote() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getMarketAgentDebitNote();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void AgentReceipt() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getAgentReceipt();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void AgentCreditNote() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getAgentCreditNote();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
	public  void NoDueCertificates() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(1000);
		SalesApprovalsList.getNoDueCertificates();
		Thread.sleep(1000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrMethod,sheetname,Sales.path);
		Thread.sleep(1000);			
	}
}

