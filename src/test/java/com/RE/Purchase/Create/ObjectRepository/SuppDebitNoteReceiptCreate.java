package com.RE.Purchase.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.SuppDebitNoteReceiptCreate_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class SuppDebitNoteReceiptCreate extends SuppDebitNoteReceiptCreate_Test{
	public static Datatable xml;
	public static XSSFSheet sheet;
	public static String sheetname;
	public static WebDriver iDriver;
	int i =1;
	public SuppDebitNoteReceiptCreate(WebDriver oBrowser) {
		iDriver=oBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Supplier Debit Note Receipt']")
	private WebElement SuppDNRecptLink;
		public void getSuppDNRecptLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptLink));
			SuppDNRecptLink.click();
		}
	@FindBy(id = "ButtonCreate")
	private WebElement CreateSuppDNRecpt;
	public void getCreateSuppDNRecpt() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateSuppDNRecpt));
		CreateSuppDNRecpt.click();
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlCompanyList")
	private WebElement SuppDNRecptComp;
	public WebElement getSuppDNRecptComp() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptComp));
		return SuppDNRecptComp;
	}

	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlProjectList")
	private WebElement SuppDNRecptProj;
	public WebElement getSuppDNRecptProj() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptProj));
		return SuppDNRecptProj;
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlSubProjectList")
	private WebElement SuppDNRecptSubProj;
	public WebElement getSuppDNRecptSubProj() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptSubProj));
		return SuppDNRecptSubProj;
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlSupplierList")
	private WebElement SuppDNRecptSupplier;
	public WebElement getSuppDNRecptSupplier() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptSupplier));
		return SuppDNRecptSupplier;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_dtReceiptDate_txtDatePicker")
	private WebElement SuppDNReceiptDate;
	public WebElement getSuppDNReceiptDate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptDate));
		return SuppDNReceiptDate;
	}
	@FindBy(css = "input#FormViewDebitNoteReceipt_txtReceiptAmount")
	private WebElement SuppDNReceiptAmount;
	public WebElement getSuppDNReceiptAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAmount));
		return SuppDNReceiptAmount;
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlPaymentModeList")
	private WebElement SuppDNReceiptPaymentMode;
	public WebElement getSuppDNReceiptPaymentMode() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptPaymentMode));
		return SuppDNReceiptPaymentMode;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtRemarks")
	private WebElement SuppDNReceiptRemarks;
	public WebElement getSuppDNReceiptRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptRemarks));
		return SuppDNReceiptRemarks;
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlReceiptCurrency")
	private WebElement SuppDNReceiptCurrency;
	public WebElement getSuppDNReceiptCurrency() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptCurrency));
		return SuppDNReceiptCurrency;
	}
	@FindBy(id = "FormViewDebitNoteReceipt_ddlBankList")
	private WebElement SuppDNReceiptBankList;
	public WebElement getSuppDNReceiptBankList() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptBankList));
		return SuppDNReceiptBankList;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtBranchName")
	private WebElement SuppDNReceiptBranchName;
	public WebElement getSuppDNReceiptBranchName() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptBranchName));
		return SuppDNReceiptBranchName;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtPayableAt")
	private WebElement SuppDNReceiptPayableAt;
	public WebElement getSuppDNReceiptPayableAt() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptPayableAt));
		return SuppDNReceiptPayableAt;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtAccountNumber")
	private WebElement SuppDNReceiptAccountNumber;
	public WebElement getSuppDNReceiptAccountNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAccountNumber));
		return SuppDNReceiptAccountNumber;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_dtInstrumentDate_txtDatePicker")
	private WebElement SuppDNReceiptInstrumentDate;
	public WebElement getSuppDNReceiptInstrumentDate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptInstrumentDate));
		return SuppDNReceiptInstrumentDate;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentAmount")
	private WebElement SuppDNReceiptInstrumentAmount;
	public WebElement getSuppDNReceiptInstrumentAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptInstrumentAmount));
		return SuppDNReceiptInstrumentAmount;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentNumber")
	private WebElement SuppDNReceiptInstrumentNumber;
	public WebElement getSuppDNReceiptInstrumentNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptInstrumentNumber));
		return SuppDNReceiptInstrumentNumber;
	}
	@FindBy(id = "FormViewDebitNoteReceipt_chkProjectBranch")
	private WebElement SuppDNReceiptIsSameBranch;
	public void getSuppDNReceiptIsSameBranch() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptIsSameBranch));
		 SuppDNReceiptIsSameBranch.click();;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_lnkAddNewDebitNote")
	private WebElement SuppDNReceiptAddDebitNote;
	public WebElement getSuppDNReceiptAddDebitNote() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAddDebitNote));
		return SuppDNReceiptAddDebitNote;
	}
	
	@FindBy(css = "input#txtDebitNoteNo")
	private WebElement SuppDNReceiptEnterDebitNoteNo;
	public WebElement getSuppDNReceiptEnterDebitNoteNo() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptEnterDebitNoteNo));
		return SuppDNReceiptEnterDebitNoteNo;
	}
	
	@FindBy(css = "input#txtFilterPurchaseOrder")
	private WebElement SuppDNReceiptEnterPurchaseOrder;
	public WebElement getSuppDNReceiptEnterPurchaseOrder() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptEnterPurchaseOrder));
		return SuppDNReceiptEnterPurchaseOrder;
	}
	
	@FindBy(css = "input#btnFilterGO")
	private WebElement SuppDNReceiptSearchGO;
	public void getSuppDNReceiptSearchGO() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptSearchGO));
		 SuppDNReceiptSearchGO.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input")
	private WebElement SuppDNReceiptSelectDN;
	public void getSuppDNReceiptSelectDN() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptSelectDN));
		 SuppDNReceiptSelectDN.click();;
	}

	@FindBy(id = "lnkAcceptSelected")
	private WebElement SuppDNReceiptAcceptSelected;
	public void getSuppDNReceiptAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAcceptSelected));
		 SuppDNReceiptAcceptSelected.click();;
	}
	
	@FindBy(xpath = "//div[@id='FormViewDebitNoteReceipt_upGridViewList']//tr[2]//td[9]//input")
	private WebElement SuppDNCurrentReceiptAmount;
	public WebElement getSuppDNCurrentReceiptAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNCurrentReceiptAmount));
		return SuppDNCurrentReceiptAmount;
	}

	
	@FindBy(css = "input#ButtonCreate")
	private WebElement SuppDNReceiptCreate;
	public void getSuppDNReceiptCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptCreate));
		 SuppDNReceiptCreate.click();;
	}
	
	
	@FindBy(id = "FormViewDebitNoteReceipt_btnFillDNAmt")
	private WebElement SuppDNReceiptFillAmount;
	public void getSuppDNReceiptFillAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptFillAmount));
		SuppDNReceiptFillAmount.click();;
	}
	
	@FindBy(id = "ButtonModify")
	private WebElement SuppDNReceiptModify;
	public void getSuppDNReceiptModify() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptModify));
		SuppDNReceiptModify.click();;
	}
	
	@FindBy(id = "ButtonUpdate")
	private WebElement SuppDNReceiptUpdate;
	public void getSuppDNReceiptUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptUpdate));
		SuppDNReceiptUpdate.click();;
	}
	
	
	@FindBy(id = "FormViewDebitNoteReceipt_lblReceiptNoValue")
	private WebElement SuppDNReceiptID;
	public String getSuppDNReceiptID() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptID));
		return SuppDNReceiptID.getText();
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_linkChangeStatus")
	private WebElement SuppDNReceiptChangeStatus;
	public void getSuppDNReceiptChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptChangeStatus));
		SuppDNReceiptChangeStatus.click();;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_ddlUpdateStatusList")
	private WebElement SuppDNReceiptStatusDD;
	public WebElement getSuppDNReceiptStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptStatusDD));
		return SuppDNReceiptStatusDD;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_linkUpdateStatus")
	private WebElement SuppDNReceiptUpdateStatus;
	public void getSuppDNReceiptUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptUpdateStatus));
		SuppDNReceiptUpdateStatus.click();;
	}
	
	
	@FindBy(id = "FormViewDebitNoteReceipt_ddlBankHeaderAccount")
	private WebElement BankHeaderAccount;
	public WebElement getBankHeaderAccount() {
		w2.until(ExpectedConditions.elementToBeClickable(BankHeaderAccount));
		return BankHeaderAccount;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_dtReceivedDate_txtDatePicker")
	private WebElement ReceivedDate;
	public WebElement getReceivedDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceivedDate));
		return ReceivedDate;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtStatusRemark")
	private WebElement StatusRemarks;
	public WebElement getStatusRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(StatusRemarks));
		return StatusRemarks;
	}
	
	@FindBy(css = "input#FormViewDebitNoteReceipt_dtRealizedDate_txtDatePicker")
	private WebElement RealizedDate;
	public WebElement getRealizedDate() {
		w2.until(ExpectedConditions.elementToBeClickable(RealizedDate));
		return RealizedDate;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_lblStatusValue")
	private WebElement SuppDNReceiptCurrentStatus;
	public String getSuppDNReceiptCurrentStatus() {
		return SuppDNReceiptCurrentStatus.getText();
	}
	public void MenuSubMenuSuppDNReceipt() throws Throwable {
		try {
			MainMenu mm=new MainMenu(oBrowser);
			mm.clickPurchase();
			Purchase en=new Purchase(oBrowser);
			en.clickPayments();
			Thread.sleep(1000);
			xml=new Datatable();
			sheet=xml.excelData(sheetname, Purchase.InputCreatePath);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		 	}
	
		}
	String SuppDebitNoteReceiptID;
	String SuppDebitNoteReceiptCurrentStatus;
	public void SupplierDebitNoteReceiptCreation() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int updatecount=0;
		System.out.println("Total Rows in Excel---"+sheet.getLastRowNum());
			for(i=1;i<=sheet.getLastRowNum();i++) {
				try {	
		Frames.SubMenuFrame();
		getSuppDNRecptLink();
		Frames.rightFrame();
		getCreateSuppDNRecpt();
		appInd.singleDropDown(getSuppDNRecptComp(), sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getSuppDNRecptProj(), sheet.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getSuppDNRecptSubProj(), sheet.getRow(i).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getSuppDNRecptSupplier(), sheet.getRow(i).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSuppDNReceiptCurrency(), sheet.getRow(i).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getSuppDNReceiptDate(), appInd.getDateAsSpecified(0));
		Thread.sleep(1000);
		getSuppDNReceiptAmount().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		getSuppDNReceiptPaymentMode().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		Thread.sleep(3000);
		String ParentAddDN=appInd.switchToChildWindow(SuppDNReceiptAddDebitNote);
		getSuppDNReceiptEnterPurchaseOrder().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getSuppDNReceiptEnterDebitNoteNo().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getSuppDNReceiptSearchGO();
		getSuppDNReceiptSelectDN();
		getSuppDNReceiptAcceptSelected();
		appInd.switchToParentWindow(ParentAddDN);
		Frames.rightFrame();
		getSuppDNReceiptBankList().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
		getSuppDNReceiptBranchName().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		getSuppDNReceiptPayableAt().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
		getSuppDNReceiptAccountNumber().sendKeys(sheet.getRow(i).getCell(12).getStringCellValue());
		appInd.seletDate(getSuppDNReceiptInstrumentDate(), appInd.getDateAsSpecified(0));
		getSuppDNReceiptInstrumentNumber().sendKeys(sheet.getRow(i).getCell(13).getStringCellValue());
		getSuppDNReceiptInstrumentAmount().sendKeys(sheet.getRow(i).getCell(14).getStringCellValue());
		getSuppDNReceiptIsSameBranch();
		Thread.sleep(1500);
		getSuppDNReceiptFillAmount();
		Thread.sleep(1000);
		getSuppDNReceiptRemarks().sendKeys("Supplier Debit Note Receipt is Cretaed Through Automation");
		Thread.sleep(1000);
		getSuppDNReceiptCreate();
		SuppDebitNoteReceiptID=getSuppDNReceiptID();
		Thread.sleep(5000);
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("SuppDebit Note Receipt ",  "is Not Created", sheetname, Purchase.OutputCreatePath);
			System.out.println("  SuppDebit Note Receipt is NOT Created");
		}else {
			Datatable.writeExcel(SuppDebitNoteReceiptID, "SuppDebit Note Receipt is Created", sheetname, Purchase.OutputCreatePath);
			count++;
			System.out.println(SuppDebitNoteReceiptID+"  SuppDebit Note Receipt is Created");
		}
				} catch (Exception e) {
				Datatable.writeExcel("SuppDebit Note Receipt",  "is Not Created Exception", sheetname, Purchase.OutputCreatePath);
				System.out.println(" SuppDebit Note Receipt is NOT Created - Exception");
				}
				
		//Modifying the SuppDebit Note Receipt	
				getSuppDNReceiptModify();
				Thread.sleep(2000);
				try {
				switch (i) {
				case 1:	appInd.seletDate(getSuppDNReceiptDate(), appInd.getDateAsSpecified(0));
						Thread.sleep(1000);
						getSuppDNReceiptRemarks().clear();
						getSuppDNReceiptRemarks().sendKeys("Supplier Debit Note Receipt is Modified and updated  Through Automation");
					
					break;
					
				case 2: getSuppDNReceiptPaymentMode().sendKeys(sheet.getRow(1).getCell(18).getStringCellValue());
						Thread.sleep(2000);
						getSuppDNReceiptRemarks().clear();
						getSuppDNReceiptRemarks().sendKeys("Supplier Debit Note Receipt is Modified and updated  Through Automation");
					break;
					
				case 3: getSuppDNReceiptInstrumentAmount().clear();
						getSuppDNReceiptInstrumentAmount().sendKeys(sheet.getRow(2).getCell(18).getStringCellValue());
						getSuppDNReceiptFillAmount();
						getSuppDNReceiptRemarks().clear();
						getSuppDNReceiptRemarks().sendKeys("Supplier Debit Note Receipt is Modified and updated  Through Automation");
					break;
			
				default:
					break;
				}
				Thread.sleep(2000);
				getSuppDNReceiptUpdate();
				if(appInd.AlertPresent()) {
					Datatable.writeExcel(SuppDebitNoteReceiptID,  "is Not Modified & Updated ", sheetname, Purchase.OutputCreatePath);
					System.out.println("  SuppDebit Note Receipt is NOT Modified & Updated");
				}else {
					Datatable.writeExcel(SuppDebitNoteReceiptID, "SuppDebit Note Receipt is  Modified & Updated", sheetname, Purchase.OutputCreatePath);
					updatecount++;
					System.out.println(SuppDebitNoteReceiptID+"  SuppDebit Note Receipt is Modified & Updated");
				}
						} catch (Exception e) {
						Datatable.writeExcel(SuppDebitNoteReceiptID,  "is Not Modified & Updated- Exception", sheetname, Purchase.OutputCreatePath);
						System.out.println(" SuppDebit Note Receipt is Not Modified & Updated- Exception");
						}
			//Status Changing
				try {
			getSuppDNReceiptChangeStatus();
			getSuppDNReceiptStatusDD().sendKeys("Submitted");
			getStatusRemarks().sendKeys("Submitting SuppDebit Note Receipt Through Automation");
			getSuppDNReceiptUpdateStatus();
			Thread.sleep(1000);
			getSuppDNReceiptChangeStatus();
			getSuppDNReceiptStatusDD().sendKeys("Approved");
			getStatusRemarks().sendKeys("Approving SuppDebit Note Receipt Through Automation");
			getSuppDNReceiptUpdateStatus();
			Thread.sleep(1000);
			getSuppDNReceiptChangeStatus();
			getSuppDNReceiptStatusDD().sendKeys("Processed");
			getStatusRemarks().sendKeys("Processing SuppDebit Note Receipt Through Automation");
			getSuppDNReceiptUpdateStatus();
			Thread.sleep(1000);
			getSuppDNReceiptChangeStatus();
			getSuppDNReceiptStatusDD().sendKeys("Received");
			appInd.seletDate(getReceivedDate(), appInd.getDateAsSpecified(0));
			Thread.sleep(1000);
			appInd.singleDropDown(getBankHeaderAccount(), sheet.getRow(i).getCell(15).getStringCellValue());
			getStatusRemarks().sendKeys("Received SuppDebit Note Receipt Through Automation");
			getSuppDNReceiptUpdateStatus();
			Thread.sleep(1000);
			getSuppDNReceiptChangeStatus();
			getSuppDNReceiptStatusDD().sendKeys("Realized");
			appInd.seletDate(getRealizedDate(), appInd.getDateAsSpecified(0));	
			getStatusRemarks().sendKeys("Realized SuppDebit Note Receipt Through Automation");
			getSuppDNReceiptUpdateStatus();
			Thread.sleep(1000);
			SuppDebitNoteReceiptCurrentStatus=	getSuppDNReceiptCurrentStatus();
			if(SuppDebitNoteReceiptCurrentStatus.equalsIgnoreCase("Realized"))
			{
				Datatable.writeExcel(SuppDebitNoteReceiptID, "SuppDebit Note Receipt is Realized", sheetname, Purchase.OutputCreatePath);
				System.out.println(SuppDebitNoteReceiptID+"SuppDebit Note Receipt is Realized  ");
			}else {
				Datatable.writeExcel(SuppDebitNoteReceiptID, "SuppDebit Note Receipt is Not Realized", sheetname, Purchase.OutputCreatePath);
			}
			
				}catch (Exception e) {
				Datatable.writeExcel(SuppDebitNoteReceiptID, "SuppDebit Note Receipt is Not Realized - Exception", sheetname, Purchase.OutputCreatePath);
			}
			
			
			}
			if(count==sheet.getLastRowNum())
			{
				Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Purchase.OutputCreatePath);
			}else {
				Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Purchase.OutputCreatePath);
			}
			if(count==sheet.getLastRowNum())
			{
				Datatable.writeExcel("SupplierDebitNoteReceiptUpdation", "PASS", sheetname, Purchase.OutputCreatePath);
			}else {
				Datatable.writeExcel("SupplierDebitNoteReceiptUpdation", "FAIL", sheetname, Purchase.OutputCreatePath);
			}
	
	}
	}

