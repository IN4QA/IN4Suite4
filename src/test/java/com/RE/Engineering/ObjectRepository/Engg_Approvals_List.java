package com.RE.Engineering.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering.Test.Engg_Approvals_List_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.ListPageCount;
import Utilities.MainMenu;

public class Engg_Approvals_List extends Engg_Approvals_List_Test{
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	public Engg_Approvals_List(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	@FindBy(xpath = "//a[text()='Consultant'][contains(@href,'Approvals')]")
	private WebElement consultant;
	public void getconsultant() {
		consultant.click();
	}
	@FindBy(xpath = "//a[contains(@href,'ListClient')][contains(@href,'Approvals')]")
	private WebElement contarctclient;
	public void getcontarctclient() {
		contarctclient.click();
	}
	@FindBy(xpath = "//a[text()='Contractor WO'][contains(@href,'Approvals')]")
	private WebElement contractorWO;
	public void getcontractorWO() {
		contractorWO.click();
	}
	@FindBy(xpath = "//a[text()='Consultant WO'][contains(@href,'Approvals')]")
	private WebElement consultantWO;
	public void getconsultantWO() {
		consultantWO.click();
	}
	
	@FindBy(xpath = "//a[text()='Internal WO']")
	private WebElement InternalWO;
	public void getInternalWO() {
		InternalWO.click();
	}
	@FindBy(xpath = "//a[text()='Labour WO']")
	private WebElement labourWO;
	public void getlabourWO() {
		labourWO.click();
	}
	
	@FindBy(xpath = "//a[text()='BOQ'][contains(@href,'Approvals')]")
	private WebElement boq;
	public void getboq() {
		boq.click();
	}
	
	@FindBy(xpath = "//a[text()='Abstract'][contains(@href,'Approvals')]")
	private WebElement EnggAbstract;
	public void getabstract() {
		EnggAbstract.click();
	}
	@FindBy(xpath = "//a[text()='Indent'][contains(@href,'Approvals')]")
	private WebElement Indent;
	public void getIndent() {
		Indent.click();
	}
	
	@FindBy(xpath = "//a[text()='Service Indent'][contains(@href,'Approvals')]")
	private WebElement ServiceIndent;
	public void getServiceIndent() {
		ServiceIndent.click();
	}
	
	@FindBy(xpath = "//a[text()='GRN'][contains(@href,'Approvals')]")
	private WebElement GRN;
	public void getGRN() {
		GRN.click();
	}
	
	@FindBy(xpath = "//a[text()='Issue'][contains(@href,'Approvals')]")
	private WebElement Issue;
	public void getIssue() {
		Issue.click();
	}
	@FindBy(xpath = "//a[text()='Return'][contains(@href,'Approvals')]")
	private WebElement Return;
	public void getReturn() {
		Return.click();
	}
	@FindBy(xpath = "//a[text()='Transfer Order'][contains(@href,'Approvals')]")
	private WebElement TransferOrder;
	public void getTransferOrder() {
		TransferOrder.click();
	}
	
	@FindBy(xpath = "//a[text()='Gate Pass'][contains(@href,'Approvals')]")
	private WebElement GatePass;
	public void getGatePass() {
		GatePass.click();
	}
	@FindBy(xpath = "//a[text()='Work Order'][contains(@href,'Approvals')]")
	private WebElement WorkOrder;
	public void getWorkOrder() {
		WorkOrder.click();
	}
	@FindBy(xpath = "//a[text()='Misc. Expenses'][contains(@href,'Approvals')]")
	private WebElement MiscExpenses;
	public void getMiscExpenses() {
		MiscExpenses.click();
	}
	@FindBy(xpath = "//a[text()='Advance'][contains(@href,'Approvals')]")
	private WebElement EnggAdvance;
	public void getEnggAdvance() {
		EnggAdvance.click();
	}
	
	@FindBy(xpath = "//a[text()='Debit Note'][contains(@href,'Approvals')]")
	private WebElement DebitNote;
	public void getDebitNote() {
		DebitNote.click();
	}
	
	@FindBy(xpath = "//a[text()='Debit Note Receipt'][contains(@href,'Approvals')]")
	private WebElement DebitNoteReceipt;
	public void getDebitNoteReceipt() {
		DebitNoteReceipt.click();
	}
	
	@FindBy(xpath = "//a[text()='Labour Payment'][contains(@href,'Approvals')]")
	private WebElement LabourPayment;
	public void getLabourPayment() {
		LabourPayment.click();
	}
	
	@FindBy(xpath = "//a[text()='DPR Labour Advance'][contains(@href,'Approvals')]")
	private WebElement DPRLabourAdvance;
	public void getDPRLabourAdvance() {
		DPRLabourAdvance.click();
	}
	@FindBy(xpath = "//a[text()='Work Category'][contains(@href,'Approvals')]")
	private WebElement WorkCategoryBudget;
	public void getWorkCategoryBudget() {
		WorkCategoryBudget.click();
	}
	
	@FindBy(xpath = "//a[text()='Material'][contains(@href,'Approvals')]")
	private WebElement MaterialBudget;
	public void getMaterialBudget() {
		MaterialBudget.click();
	}
	
	@FindBy(xpath = "//a[text()='Contracting Order'][contains(@href,'Approvals')]")
	private WebElement contractingorder;
	public void getcontractingorder() {
		contractingorder.click();
	}
	
	@FindBy(xpath = "//a[text()='Invoice'][contains(@href,'Approvals')]")
	private WebElement invoice;
	public void getinvoice() {
		invoice.click();
	}
	@FindBy(xpath = "//a[text()='Invoice (Advance)'][contains(@href,'Approvals')]")
	private WebElement invoiceadvance;
	public void getinvoiceadvance() {
		invoiceadvance.click();
	}
	
	@FindBy(xpath = "//a[text()='Receipt'][contains(@href,'Approvals')]")
	private WebElement Receipt;
	public void getReceipt() {
		Receipt.click();
	}
	@FindBy(xpath = "//a[text()='Credit Note'][contains(@href,'Approvals')]")
	private WebElement CreditNote;
	public void getCreditNote() {
		CreditNote.click();
	}
	
	@FindBy(xpath = "//a[text()='CO Abstract'][contains(@href,'Approvals')]")
	private WebElement COAbstract;
	public void getCOAbstract() {
		COAbstract.click();
	}
	
	@FindBy(xpath = "//a[text()='Contractor WO'][contains(@href,'ApprovalTermination')]")
	private WebElement ContractorWoTermination;
	public void getContractorWoTermination() {
		ContractorWoTermination.click();
	}
	@FindBy(xpath = "//a[text()='Consultant WO'][contains(@href,'ApprovalTermination')]")
	private WebElement ConsultantWoTermination;
	public void getConsultantWoTermination() {
		ConsultantWoTermination.click();
	}
	@FindBy(xpath = "//a[text()='Internal WO'][contains(@href,'ApprovalTermination')]")
	private WebElement InternalTermination;
	public void getInternalWOTermination() {
		InternalTermination.click();
	}
	@FindBy(xpath = "//a[text()='Labour WO'][contains(@href,'ApprovalTermination')]")
	private WebElement LabourWOTermination;
	public void getLabourWOTermination() {
		LabourWOTermination.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListPOTermination')][contains(@href,'Approvals')]")
	private WebElement PurchaseOrderTermination;
	public void getPurchaseOrderTermination() {
		PurchaseOrderTermination.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'ListModificationApproval')][text()='Rental Modification']")
	private WebElement ModificationsTermination;
	public void getModificationsTermination() {
		ModificationsTermination.click();
	}
	@FindBy(xpath = "//a[contains(@href,'Approvals')][text()='Tender Document']")
	private WebElement TenderDocument;
	public void getTenderDocument() {
		TenderDocument.click();
	}
	@FindBy(xpath = "//a[contains(@href,'Approvals')][text()='Pre-Tender Estimate']")
	private WebElement TenderEstimate;
	public void getTenderEstimate() {
		TenderEstimate.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'Approvals')][text()='Tender Receipt']")
	private WebElement TenderReceipt;
	public void getTenderReceipt() {
		TenderReceipt.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'Approvals')][text()='Float Tender']")
	private WebElement FloatTender;
	public void getFloatTender() {
		FloatTender.click();
	}
	
	@FindBy(xpath = "//a[contains(@href,'Approvals')][text()='Rate Comparison']")
	private WebElement RateComparision;
	public void getRateComparision() {
		RateComparision.click();
	}
	public static void MainSubmenu() {
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en=new Engineering(iDriver);
			Engineering.clickApprovals();
			Thread.sleep(2000);
			xml=new Datatable();
			sheet = xml.excelData(sheetname,Engineering.inputPath);
			} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:"+e);
		}
		
	}
	public void Contractor() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname, Engineering.path);
		Thread.sleep(2000);
	}

	public void Consultant() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getconsultant();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname , Engineering.path);
		Thread.sleep(2000);
	}
	public void Contarcting_Client() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getcontarctclient();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname , Engineering.path);
		Thread.sleep(2000);
	}
	
	public void ConttractorWO() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getcontractorWO();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname ,Engineering.path);
		Thread.sleep(2000);
	}
	public void ConsultantWO() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getconsultantWO();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void InternalWO() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getInternalWO();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void LabourWO() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getlabourWO();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void BOQ() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getboq();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname , Engineering.path);
		Thread.sleep(2000);
	}
	public void EnggAbstract() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getabstract();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void Indent() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getIndent();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void ServiceIndent() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getServiceIndent();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void GRN() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getGRN();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void IssueInventory() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getIssue();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void ReturnInventory() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getReturn();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void TransferOrder() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getTransferOrder();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void GatePass() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getGatePass();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void WorkOrderPayments() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getWorkOrder();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void Misc_Expenses() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getMiscExpenses();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void Advances() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getEnggAdvance();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void EnggDebitNote() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getDebitNote();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void DebitNote() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getDebitNote();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void DebitNoteReceipt() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getDebitNoteReceipt();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void LabourPayment() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getLabourPayment();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void DPRLabourAdvance() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getDPRLabourAdvance();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void WorkCategoryBudget() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getWorkCategoryBudget();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void MaterialBudget() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getMaterialBudget();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void ContractingOrder() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getcontractingorder();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void Invoice() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getinvoice();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void AdvanceInvoices() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getinvoiceadvance();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void Receipt() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getReceipt();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void CreditNote() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getCreditNote();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void CoAbstract() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName() + " Approvals";
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getCOAbstract();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void ContractorWOTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getContractorWoTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void ConsultantWOTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getConsultantWoTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void InternalWOTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getInternalWOTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void LabourWOTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getLabourWOTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void POTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getPurchaseOrderTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void ModificationTermination() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getModificationsTermination();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void TenderDocument() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getTenderDocument();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void TenderEstimate() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getTenderEstimate();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void TenderReceipt() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getTenderReceipt();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
	public void FloatTender() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getFloatTender();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	public void TenderingRateComparision() throws Throwable{
		String nameofCurrentMethod=new Throwable().getStackTrace()[0].getMethodName();
		Frames.SubMenuFrame();
		Thread.sleep(2000);
		EnggApprovalsList.getRateComparision();
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		ListPageCount.PageCount(nameofCurrentMethod, sheetname,Engineering.path);
		Thread.sleep(2000);
	}
	
}
