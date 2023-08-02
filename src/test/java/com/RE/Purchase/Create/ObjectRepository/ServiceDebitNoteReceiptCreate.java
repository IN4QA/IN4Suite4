package com.RE.Purchase.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Purchase.Create.Test.ServiceDebitNoteReceiptCreate_Test;
import com.RE.Submodules.Purchase;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class ServiceDebitNoteReceiptCreate extends ServiceDebitNoteReceiptCreate_Test{
	public static WebDriver iDriver;
	public static Datatable xml;
	public static XSSFSheet sheet;
	public static String sheetname;
	int i=1;
	public ServiceDebitNoteReceiptCreate(WebDriver oBrowser) {
		iDriver=oBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
  
	@FindBy(xpath = "//a[text()='Service Provider Debit Note Receipt']")
	private WebElement ServDNRecptLink;
		public void getServDNRecptLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptLink));
			ServDNRecptLink.click();
		}
	@FindBy(id = "ButtonCreate")
	private WebElement CreateServDNRecpt;
	public void getCreateServDNRecpt() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateServDNRecpt));
		CreateServDNRecpt.click();
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlCompanyList")
	private WebElement ServDNRecptComp;
	public WebElement getServDNRecptComp() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptComp));
		return ServDNRecptComp;
	}
	
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlProjectList")
	private WebElement ServDNRecptProj;
	public WebElement getServDNRecptProj() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptProj));
		return ServDNRecptProj;
	}

	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlserviceProvider")
	private WebElement ServDNRecptserviceProvider;
	public WebElement getServDNRecptserviceProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptserviceProvider));
		return ServDNRecptserviceProvider;
	}

	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlReceiptCurrency")
	private WebElement ServDNReceiptCurrency;
	public WebElement getServDNReceiptCurrency() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptCurrency));
		return ServDNReceiptCurrency;
	}
	@FindBy(id = "FormViewDebitNoteReceipt_dtReceiptDate_txtDatePicker")
	private WebElement ServDNReceiptDate;
	public WebElement getServDNReceiptDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptDate));
		return ServDNReceiptDate;
	}
	
	@FindBy(css = "input#FormViewDebitNoteReceipt_txtReceiptAmount")
	private WebElement ServDNReceiptAmount;
	public WebElement getServDNReceiptAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAmount));
		return ServDNReceiptAmount;
	}
	@FindBy(css = "select#FormViewDebitNoteReceipt_ddlPaymentModeList")
	private WebElement ServDNReceiptPaymentMode;
	public WebElement getServDNReceiptPaymentMode() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptPaymentMode));
		return ServDNReceiptPaymentMode;
	}
	@FindBy(id = "FormViewDebitNoteReceipt_lnkAddNewDebitNote")
	private WebElement ServDNReceiptAddDebitNote;
	public WebElement getServDNReceiptAddDebitNote() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAddDebitNote));
		return ServDNReceiptAddDebitNote;
	}
	@FindBy(css = "input#txtDebitNoteNo")
	private WebElement ServDNReceiptEnterDebitNoteNo;
	public WebElement getServDNReceiptEnterDebitNoteNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptEnterDebitNoteNo));
		return ServDNReceiptEnterDebitNoteNo;
	}
	
	@FindBy(css = "input#txtFilterPurchaseOrder")
	private WebElement ServDNReceiptEnterPurchaseOrder;
	public WebElement getServDNReceiptEnterPurchaseOrder() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptEnterPurchaseOrder));
		return ServDNReceiptEnterPurchaseOrder;
	}
	
	@FindBy(css = "input#btnFilterGO")
	private WebElement ServDNReceiptSearchGO;
	public void getServDNReceiptSearchGO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptSearchGO));
		ServDNReceiptSearchGO.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input")
	private WebElement ServDNReceiptSelectDN;
	public void getServDNReceiptSelectDN() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptSelectDN));
		ServDNReceiptSelectDN.click();;
	}

	@FindBy(id = "lnkAcceptSelected")
	private WebElement ServDNReceiptAcceptSelected;
	public void getServDNReceiptAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAcceptSelected));
		ServDNReceiptAcceptSelected.click();;
	}
	
	
	@FindBy(id = "FormViewDebitNoteReceipt_ddlBankList")
	private WebElement ServDNReceiptBankList;
	public WebElement getServDNReceiptBankList() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptBankList));
		return ServDNReceiptBankList;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtBranchName")
	private WebElement ServDNReceiptBranchName;
	public WebElement getServDNReceiptBranchName() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptBranchName));
		return ServDNReceiptBranchName;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtPayableAt")
	private WebElement ServDNReceiptPayableAt;
	public WebElement getServDNReceiptPayableAt() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptPayableAt));
		return ServDNReceiptPayableAt;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtAccountNumber")
	private WebElement ServDNReceiptAccountNumber;
	public WebElement getServDNReceiptAccountNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAccountNumber));
		return ServDNReceiptAccountNumber;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_dtInstrumentDate_txtDatePicker")
	private WebElement ServDNReceiptInstrumentDate;
	public WebElement getServDNReceiptInstrumentDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptInstrumentDate));
		return ServDNReceiptInstrumentDate;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentAmount")
	private WebElement ServDNReceiptInstrumentAmount;
	public WebElement getServDNReceiptInstrumentAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptInstrumentAmount));
		return ServDNReceiptInstrumentAmount;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentNumber")
	private WebElement ServDNReceiptInstrumentNumber;
	public WebElement getServDNReceiptInstrumentNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptInstrumentNumber));
		return ServDNReceiptInstrumentNumber;
	}
	@FindBy(id = "FormViewDebitNoteReceipt_chkProjectBranch")
	private WebElement ServDNReceiptIsSameBranch;
	public void getServDNReceiptIsSameBranch() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptIsSameBranch));
		ServDNReceiptIsSameBranch.click();;
	}
	

	@FindBy(xpath = "//div[@id='FormViewDebitNoteReceipt_upGridViewList']//tr[2]//td[9]//input")
	private WebElement ServDNCurrentReceiptAmount;
	public WebElement getServDNCurrentReceiptAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNCurrentReceiptAmount));
		return ServDNCurrentReceiptAmount;
	}

	
	@FindBy(css = "input#ButtonCreate")
	private WebElement ServDNReceiptCreate;
	public void getServDNReceiptCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptCreate));
		ServDNReceiptCreate.click();
	}
	
	
	@FindBy(id = "FormViewDebitNoteReceipt_btnFillDNAmt")
	private WebElement ServDNReceiptFillAmount;
	public void getServDNReceiptFillAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptFillAmount));
		ServDNReceiptFillAmount.click();
	}
	
	@FindBy(id = "ButtonModify")
	private WebElement ServDNReceiptModify;
	public void getServDNReceiptModify() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptModify));
		ServDNReceiptModify.click();
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_txtRemarks")
	private WebElement ServDNReceiptRemarks;
	public WebElement getServDNReceiptRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptRemarks));
		return ServDNReceiptRemarks;
	}
	
	@FindBy(id = "ButtonUpdate")
	private WebElement ServDNReceiptUpdate;
	public void getServDNReceiptUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptUpdate));
		ServDNReceiptUpdate.click();
	}
	
	
	@FindBy(id = "FormViewDebitNoteReceipt_lblReceiptNoValue")
	private WebElement ServDNReceiptID;
	public String getServDNReceiptID() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptID));
		return ServDNReceiptID.getText();
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_linkChangeStatus")
	private WebElement ServDNReceiptChangeStatus;
	public void ServDNReceiptChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptChangeStatus));
		ServDNReceiptChangeStatus.click();;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_ddlUpdateStatusList")
	private WebElement ServDNReceiptStatusDD;
	public WebElement getServDNReceiptStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptStatusDD));
		return ServDNReceiptStatusDD;
	}
	
	@FindBy(id = "FormViewDebitNoteReceipt_linkUpdateStatus")
	private WebElement ServDNReceiptUpdateStatus;
	public void getServDNReceiptUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptUpdateStatus));
		ServDNReceiptUpdateStatus.click();;
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
	private WebElement ServDNReceiptCurrentStatus;
	public String getServDNReceiptCurrentStatus() {
		return ServDNReceiptCurrentStatus.getText();
	}
	
	public void MenuSubMenuServDNReceipt() throws Throwable {
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
	
	String ServDebitNoteReceiptID;
	String ServDebitNoteReceiptCurrentStatus;
	public void ServiceDebitNoteReceiptCreation() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int updatecount=0;
		System.out.println("Total Rows in Excel---"+sheet.getLastRowNum());
			for(i=1;i<=sheet.getLastRowNum();i++) {
				try {	
		Frames.SubMenuFrame();
		getServDNRecptLink();
		Frames.rightFrame();
		getCreateServDNRecpt();
		appInd.singleDropDown(getServDNRecptComp(), sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getServDNRecptProj(), sheet.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getServDNRecptserviceProvider(), sheet.getRow(i).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getServDNReceiptCurrency(), sheet.getRow(i).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getServDNReceiptDate(), appInd.getDateAsSpecified(0));
		Thread.sleep(1000);
		getServDNReceiptAmount().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getServDNReceiptPaymentMode().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		Thread.sleep(3000);
		String ParentAddDN=appInd.switchToChildWindow(ServDNReceiptAddDebitNote);
		getServDNReceiptEnterPurchaseOrder().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		getServDNReceiptEnterDebitNoteNo().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getServDNReceiptSearchGO();
		getServDNReceiptSelectDN();
		getServDNReceiptAcceptSelected();
		appInd.switchToParentWindow(ParentAddDN);
		Frames.rightFrame();
		getServDNReceiptBankList().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getServDNReceiptBranchName().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
		getServDNReceiptPayableAt().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		getServDNReceiptAccountNumber().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
		appInd.seletDate(getServDNReceiptInstrumentDate(), appInd.getDateAsSpecified(0));
		getServDNReceiptInstrumentNumber().sendKeys(sheet.getRow(i).getCell(12).getStringCellValue());
		getServDNReceiptInstrumentAmount().sendKeys(sheet.getRow(i).getCell(13).getStringCellValue());
		getServDNReceiptIsSameBranch();
		Thread.sleep(1500);
		getServDNReceiptFillAmount();
		Thread.sleep(1000);
		getServDNReceiptRemarks().sendKeys("Service Provider Debit Note Receipt is Cretaed Through Automation");
		Thread.sleep(1000);
		getServDNReceiptCreate();
		ServDebitNoteReceiptID=getServDNReceiptID();
		Thread.sleep(5000);
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Service Provider Debit Note Receipt ",  "is Not Created", sheetname, Purchase.OutputCreatePath);
			System.out.println("  Service Provider Debit Note Receipt is NOT Created");
		}else {
			Datatable.writeExcel(ServDebitNoteReceiptID, "Service Provider Debit Note Receipt is Created", sheetname, Purchase.OutputCreatePath);
			count++;
			System.out.println(ServDebitNoteReceiptID+"  Service Provider Debit Note is Created");
		}
				} catch (Exception e) {
				Datatable.writeExcel("Service Provider Debit Note Receipt",  "is Not Created Exception", sheetname, Purchase.OutputCreatePath);
				System.out.println(" Service Provider Debit Note Receipt is NOT Created - Exception");
				}
				
		//Modifying the SuppDebit Note Receipt	
				getServDNReceiptModify();
				Thread.sleep(2000);
				try {
				switch (i) {
				case 1:	getServDNReceiptRemarks().clear();
						getServDNReceiptRemarks().sendKeys("Service Provider Debit Note Receipt is Modified and updated  Through Automation");
					
					break;
					
				case 2: getServDNReceiptPaymentMode().sendKeys(sheet.getRow(1).getCell(17).getStringCellValue());
						Thread.sleep(2000);
						getServDNReceiptRemarks().clear();
						getServDNReceiptRemarks().sendKeys("Service Provider Debit Note Receipt is Modified and updated  Through Automation");
					break;
					
				case 3: getServDNReceiptInstrumentAmount().clear();
						getServDNReceiptInstrumentAmount().sendKeys(sheet.getRow(2).getCell(17).getStringCellValue());
						getServDNReceiptFillAmount();
						getServDNReceiptRemarks().clear();
						getServDNReceiptRemarks().sendKeys("Service Provider Debit Note Receipt is Modified and updated  Through Automation");
					break;
			
				default:
					break;
				}
				Thread.sleep(2000);
				getServDNReceiptUpdate();
				if(appInd.AlertPresent()) {
					Datatable.writeExcel(ServDebitNoteReceiptID,  "is Not Modified & Updated ", sheetname, Purchase.OutputCreatePath);
					System.out.println("  Service Provider Debit Note Receipt is NOT Modified & Updated");
				}else {
					Datatable.writeExcel(ServDebitNoteReceiptID, "Service Provider Debit Note Receipt is  Modified & Updated", sheetname, Purchase.OutputCreatePath);
					updatecount++;
					System.out.println(ServDebitNoteReceiptID+"  Service Provider Debit Note Receipt is Modified & Updated");
				}
						} catch (Exception e) {
						Datatable.writeExcel(ServDebitNoteReceiptID,  "is Not Modified & Updated- Exception", sheetname, Purchase.OutputCreatePath);
						System.out.println(" Service Provider Debit Note Receipt is Not Modified & Updated- Exception");
						}
			//Status Changing
				try {
			ServDNReceiptChangeStatus();
			getServDNReceiptStatusDD().sendKeys("Submitted");
			getStatusRemarks().sendKeys("Submitting Service Provider Debit Note Receipt Through Automation");
			getServDNReceiptUpdateStatus();
			Thread.sleep(1000);
			ServDNReceiptChangeStatus();
			getServDNReceiptStatusDD().sendKeys("Approved");
			getStatusRemarks().sendKeys("Approving Service Provider Debit Note Receipt Through Automation");
			getServDNReceiptUpdateStatus();
			Thread.sleep(1000);
			ServDNReceiptChangeStatus();
			getServDNReceiptStatusDD().sendKeys("Processed");
			getStatusRemarks().sendKeys("Processing Service Provider Debit Note Receipt Through Automation");
			getServDNReceiptUpdateStatus();
			Thread.sleep(1000);
			ServDNReceiptChangeStatus();
			getServDNReceiptStatusDD().sendKeys("Received");
			appInd.seletDate(getReceivedDate(), appInd.getDateAsSpecified(0));
			Thread.sleep(1000);
			appInd.singleDropDown(getBankHeaderAccount(), sheet.getRow(i).getCell(14).getStringCellValue());
			getStatusRemarks().sendKeys("Received Service Provider Debit Note Receipt Through Automation");
			getServDNReceiptUpdateStatus();
			Thread.sleep(1000);
			ServDNReceiptChangeStatus();
			getServDNReceiptStatusDD().sendKeys("Realized");
			appInd.seletDate(getRealizedDate(), appInd.getDateAsSpecified(0));	
			getStatusRemarks().sendKeys("Realized Service Provider Debit Note Receipt Through Automation");
			getServDNReceiptUpdateStatus();
			Thread.sleep(1000);
			ServDebitNoteReceiptCurrentStatus=	getServDNReceiptCurrentStatus();
			if(ServDebitNoteReceiptCurrentStatus.equalsIgnoreCase("Realized"))
			{
				Datatable.writeExcel(ServDebitNoteReceiptID, "Service Provider Debit Note Receipt is Realized", sheetname, Purchase.OutputCreatePath);
				System.out.println(ServDebitNoteReceiptID+"Service Provider Debit Note Receipt is Realized  ");
			}else {
				Datatable.writeExcel(ServDebitNoteReceiptID, "Service Provider Debit Note Receipt is Not Realized", sheetname, Purchase.OutputCreatePath);
			}
			
				}catch (Exception e) {
				Datatable.writeExcel(ServDebitNoteReceiptID, "Service Provider Debit Note Receipt is Not Realized - Exception", sheetname, Purchase.OutputCreatePath);
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
