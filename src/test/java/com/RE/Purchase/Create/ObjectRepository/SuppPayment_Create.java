package com.RE.Purchase.Create.ObjectRepository;


import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.SuppPayment_Create_Test;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class SuppPayment_Create extends SuppPayment_Create_Test {
	
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static XSSFSheet sheet;
	
	public SuppPayment_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Supplier Certificates']")
	private WebElement SuppCertLink;
	public void getSuppCertLink() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertLink));
		SuppCertLink.click();
	}
	@FindBy(id = "btnCreateNew")
	private WebElement CreateSuppCertButton;
	public void getCreateSuppCertButton() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateSuppCertButton));
		CreateSuppCertButton.click();
	}
	@FindBy(css = "select#ddlCertifyingCompany")
	private WebElement SuppCertCompDD;
	public WebElement getSuppCertCompDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertCompDD));
		return SuppCertCompDD;
	}
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//span//button")
	private WebElement SuppCertProjectDD;
	public WebElement getSuppCertProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertProjectDD));
		return SuppCertProjectDD;
	}
	
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//input[@placeholder='Search']")
	private WebElement SuppCertEnterProject;
	public WebElement getSuppCertEnterProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterProject));
		return SuppCertEnterProject;
	}
	
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//li")
	private List<WebElement> SuppCertProjectList;
	public List<WebElement> getSuppCertProjectList() {
		return	SuppCertProjectList;
	}
	@FindBy(id = "ddlPayingCompanyProvider")
	private WebElement SuppPayCompDD;
	public WebElement getSuppPayCompDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppPayCompDD));
		return SuppPayCompDD;
	}
	@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//button")
	private WebElement SuppCertSubProjectDD;
	public WebElement getSuppCertSubProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSubProjectDD));
		return SuppCertSubProjectDD;
	}
	@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//input[@placeholder='Search']")
	private WebElement SuppCertEnterSubProject;
	public WebElement getSuppCertEnterSubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterSubProject));
		return SuppCertEnterSubProject;
	}
	
	@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//li")
	private List<WebElement> SuppCertSubProjectList;
	public List<WebElement> getSuppCertSubProjectList() {
		return	SuppCertSubProjectList;
	}
	
	@FindBy(id = "ddlSupplierList")
	private WebElement SuppCertSupplierDD;
	public WebElement getSuppCertSupplierDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSupplierDD));
		return SuppCertSupplierDD;
	}
	@FindBy(id = "ddlPoType")
	private WebElement SuppCertPOTypeDD;
	public WebElement getSuppCertPOTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertPOTypeDD));
		return SuppCertPOTypeDD;
	}
	@FindBy(css = "a#lbnSelectPO")
	private WebElement SuppCertSelecttPOLink;
	public WebElement getSuppCertSelecttPOLink() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelecttPOLink));
		return SuppCertSelecttPOLink;
	}
	@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//span//button")
	private WebElement SuppCertPODD;
	public WebElement getSuppCertPODD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertPODD));
		return SuppCertPODD;
	}
	@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//li//input[@placeholder='Search']")
	private WebElement SuppCertEnterPO;
	public WebElement getSuppCertEnterPO() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterPO));
		return SuppCertEnterPO;
	}
	@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//li")
	private List<WebElement> SuppCertPOList;
	public List<WebElement> getSuppCertPOList() {
		return SuppCertPOList;
	}
	@FindBy(id = "btnSearch")
	private WebElement SuppCertSearchPO;
	public void getSuppCertSearchPO() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSearchPO));
		 SuppCertSearchPO.click();;
	}
	
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//input")
	private WebElement SuppCertSelcetPOcheck;
	public void getSuppCertSelcetPOcheck() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetPOcheck));
		 SuppCertSelcetPOcheck.click();;
	}
	@FindBy(xpath = "//a[text()='Accept Selected']")
	private WebElement SuppCertPOAcceptSelected;
	public void getSuppCertPOAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertPOAcceptSelected));
		 SuppCertPOAcceptSelected.click();;
	}
	@FindBy(css = "input#txtInvoiceNo")
	private WebElement SuppCertInvoiceNO;
	public WebElement getSuppCertInvoiceNO() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceNO));
		return SuppCertInvoiceNO;
	}
	@FindBy(css = "select#ddlEInvoice")
	private WebElement SuppCertE_Invoice;
	public WebElement getSuppCertE_Invoice() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertE_Invoice));
		return SuppCertE_Invoice;
	}
	@FindBy(css = "input#txtInvoiceAmount")
	private WebElement SuppCertInvoiceAmt;
	public WebElement getSuppCertInvoiceAmt() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceAmt));
		return SuppCertInvoiceAmt;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[6]")
	private WebElement SuppCertGRNAMOUNT;
	public String getSuppCertGRNAMOUNT() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertGRNAMOUNT));
		return SuppCertGRNAMOUNT.getText();
	}
	@FindBy(css =  "input#dtInvioceDate_txtDatePicker")
	private WebElement SuppCertInvoiceDate;
	public WebElement getSuppCertInvoiceDate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceDate));
		return SuppCertInvoiceDate;
	}
	@FindBy(css = "select#ddlCertificateType")
	private WebElement SuppCertTypeDD;
	public WebElement getSuppCertTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertTypeDD));
		return SuppCertTypeDD;
	}
	
	@FindBy(xpath = "//a[text()='Select GRN']")
	private WebElement SuppCertSelcetGRNLink;
	public WebElement getSuppCertSelcetGRNLink() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetGRNLink));
		return SuppCertSelcetGRNLink;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input[@type='checkbox']")
	private WebElement SuppCertSelcetGRNCheck;
	public void getSuppCertSelcetGRNCheck() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetGRNCheck));
		 SuppCertSelcetGRNCheck.click();;
	}
	
	@FindBy(css =  "input#lnkNext_ShowMaterialSelection")
	private WebElement SuppCertAddGRN_NextButton;
	public void getSuppCertAddGRN_NextButton() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddGRN_NextButton));
		 SuppCertAddGRN_NextButton.click();;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']")
	private WebElement SuppCertGRNQty;
	public WebElement getSuppCertGRNQty() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertGRNQty));
		return SuppCertGRNQty;
	}
	@FindBy(css =  "input#btnAcceptSelected")
	private WebElement SuppCertAddGRN_AcceptSelcet;
	public void getSuppCertAddGRN_AcceptSelcet() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddGRN_AcceptSelcet));
		 SuppCertAddGRN_AcceptSelcet.click();;
	}
	@FindBy(xpath = "//a[text()='Add Row ']")
	private WebElement SuppCertAddRowDed;
	public void getSuppCertAddRowDed() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddRowDed));
		 SuppCertAddRowDed.click();
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select[@class='input']")
	private WebElement SuppCertDedTaxCat1;
	public WebElement getSuppCertDedTaxCat1() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCat1));
		return SuppCertDedTaxCat1;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select[@class='input']")
	private WebElement SuppCertDedTaxCatPer1;
	public WebElement getSuppCertDedTaxCatPer1() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCatPer1));
		return SuppCertDedTaxCatPer1;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select[@class='input']")
	private WebElement SuppCertDedTaxCat2;
	public WebElement getSuppCertDedTaxCat2() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCat2));
		return SuppCertDedTaxCat2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select[@class='input']")
	private WebElement SuppCertDedTaxCatPer2;
	public WebElement getSuppCertDedTaxCatPer2() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCatPer2));
		return SuppCertDedTaxCatPer2;
	}
	@FindBy(css = "input#txtOtherDeduction")
	private WebElement SuppCertOtherDed;
	public WebElement getSuppCertOtherDed() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDed));
		return SuppCertOtherDed;
	}
	@FindBy(id = "txtOthDedRemarks")
	private WebElement SuppCertOtherDedRemarksclick;
	public void getSuppCertOtherDedRemarksclick() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDedRemarksclick));
		 SuppCertOtherDedRemarksclick.click();;
	}
	@FindBy(id = "txtOthDedRemarks")
	private WebElement SuppCertOtherDedRemarks;
	public WebElement getSuppCertOtherDedRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDedRemarks));
		return SuppCertOtherDedRemarks;
	}
	@FindBy(css = "input#txtOtherAdditions")
	private WebElement SuppCertOtherAddTax;
	public WebElement getSuppCertOtherAddTax() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTax));
		return SuppCertOtherAddTax;
	}
	@FindBy(id = "txtOthAddRemarks")
	private WebElement SuppCertOtherAddTaxRemarksclick;
	public void getSuppCertOtherAddTaxRemarksclick() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTaxRemarksclick));
		 SuppCertOtherAddTaxRemarksclick.click();;
	}
	@FindBy(id = "txtOthAddRemarks")
	private WebElement SuppCertOtherAddTaxRemarks;
	public WebElement getSuppCertOtherAddTaxRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTaxRemarks));
		return SuppCertOtherAddTaxRemarks;
	}
	@FindBy(id = "txtRetentionPercentValue")
	private WebElement SuppCertRetentionPer;
	public WebElement getSuppCertRetentionPer() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertRetentionPer));
		return SuppCertRetentionPer;
	}
	
	@FindBy(id = "ddlPaymentMode")
	private WebElement SuppCertPayModeDD;
	public WebElement getSuppCertPayModeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertPayModeDD));
		return SuppCertPayModeDD;
	}
	@FindBy(css = "input#dtpDueDate_txtDatePicker")
	private WebElement SuppCertPayDueDate;
	public WebElement getSuppCertPayDueDate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertPayDueDate));
		return SuppCertPayDueDate;
	}
	@FindBy(css = "textarea#txtRemarks")
	private WebElement SuppCertRemarks;
	public WebElement getSuppCertRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertRemarks));
		return SuppCertRemarks;
	}
	@FindBy(css = "input#btnSave")
	private WebElement SuppCertCreate;
	public void getSuppCertCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertCreate));
		 SuppCertCreate.click();
	}
	@FindBy(id = "lblCertificateNoValue")
	private WebElement suppcetNo;
	public String getsuppcetNo() {
		w2.until(ExpectedConditions.elementToBeClickable(suppcetNo));
		return suppcetNo.getText();
	}
	
	@FindBy(id = "btnModify")
	private WebElement SuppCertModify;
	public void getSuppCertModify() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertModify));
		SuppCertModify.click();
	}
	@FindBy(id = "btnUpdate")
	private WebElement SuppCertUpdate;
	public void getSuppCertUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertUpdate));
		SuppCertUpdate.click();
	}
	@FindBy(id = "lbnChangeStatus")
	private WebElement SuppCertChangeStatus;
	public void getSuppCertChangeStatus(){
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertChangeStatus));
		SuppCertChangeStatus.click();
	}
	@FindBy(css = "select#ddlStatus")
	private WebElement SuppCertChangeStatusDD;
	public WebElement getSuppCertChangeStatusDD(){
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertChangeStatusDD));
		return SuppCertChangeStatusDD;
	}
	@FindBy(css = "a#lbnUpdateStatus")
	private WebElement SuppCertUpdateStatus;
	public void getSuppCertUpdateStatus(){
		w2.until(ExpectedConditions.elementToBeClickable(SuppCertUpdateStatus));
		SuppCertUpdateStatus.click();
	}
	@FindBy(xpath="//a[text()='Purchase']")
	private static WebElement FinPurApprovals;
	public void getFinPurApprovals() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurApprovals));
		 FinPurApprovals.click();
	}
	@FindBy(xpath = "//a[text()='Supplier Cert.']")
	private static WebElement FinPurSuppCert;
	public void getFinPurSuppCertv() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCert));
		FinPurSuppCert.click();
	}
	@FindBy(css = "input#txtCertifyingCompPO")
	private static WebElement FinCertCompany;
	public WebElement getFinCertCompany() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertCompany));
		return FinCertCompany;
	}
	
	@FindBy(css = "input#txtCertificateNo")
	private static WebElement FinCertNo;
	public WebElement getFinCertNo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertNo));
		return FinCertNo;
	}
	
	@FindBy(css = "input#btnFilterGO")
	private static WebElement FinPurSuppCertGo;
	public void getFinPurSuppCertGo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCertGo));
		FinPurSuppCertGo.click();
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//a")
	private static WebElement FinCertNoclick;
	public void getFinCertNoclick() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertNoclick));
		FinCertNoclick.click();
	}
	@FindBy(xpath = "//a[text()='Make Bank Payment']")
	private static WebElement PaymentLink;
	public WebElement getPaymentLink() {
		w2.until(ExpectedConditions.elementToBeClickable(PaymentLink));
	return	PaymentLink;
	}
	@FindBy(css = "select#ddlBankCash")
	private static WebElement BankAccountDD;
	public WebElement getBankAccountDD() {
		w2.until(ExpectedConditions.elementToBeClickable(BankAccountDD));
	return	BankAccountDD;
	}
	@FindBy(css = "input#txtInstrumentNo")
	private static WebElement InstrumentNo;
	public WebElement getInstrumentNo() {
		w2.until(ExpectedConditions.elementToBeClickable(InstrumentNo));
	return	InstrumentNo;
	}
	@FindBy(css = "input#btnSubmit")
	private static WebElement PaymentSubmit;
	public void getPaymentSubmit() {
		w2.until(ExpectedConditions.elementToBeClickable(PaymentSubmit));
		PaymentSubmit.click();
	}
	@FindBy(css = "span#lblStatusValue")
	private static WebElement Supppaymentstatus;
	public String getSupppaymentstatus() {
		w2.until(ExpectedConditions.elementToBeClickable(Supppaymentstatus));
	return	Supppaymentstatus.getText();
	}
	public void MenuSubMenu()throws Throwable{
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(2000);
			Purchase en=new Purchase(iDriver);
			en.clickPayments();
			Thread.sleep(2000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Purchase.InputCreatePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	int i=1;
	String SupperCertNo;
	public void SupplierPaymentCreation() throws Throwable{
		int count=0;
		int	updatecount=0;
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		for(i=1;i<=sheet.getLastRowNum();i++) {
		try {
		MenuSubMenu();
		getSuppCertLink();
		Frames.rightFrame();
		getCreateSuppCertButton();
		appInd.singleDropDown(getSuppCertCompDD(), sheet.getRow(i).getCell(0).getStringCellValue());
		SuppCertMultiproject();
	//	appInd.singleDropDown(getSuppPayCompDD(), sheet.getRow(i).getCell(2).getStringCellValue());
		SuppCertMultiSubproject();
		appInd.singleDropDown(getSuppCertSupplierDD(), sheet.getRow(i).getCell(4).getStringCellValue());
		appInd.singleDropDown(getSuppCertPOTypeDD(), sheet.getRow(i).getCell(5).getStringCellValue());
		String ParentSelectPO=appInd.switchToChildWindow(SuppCertSelecttPOLink);
		SuppCertMultiPO();
		Thread.sleep(2000);
		getSuppCertSearchPO();
		getSuppCertSelcetPOcheck();
		getSuppCertPOAcceptSelected();
		Thread.sleep(1000);
		appInd.switchToParentWindow(ParentSelectPO);
		Thread.sleep(3000);
		Frames.rightFrame();
		getSuppCertInvoiceNO().sendKeys("INNO"+appInd.RandomNumbers(4));
		appInd.singleDropDown(getSuppCertE_Invoice(),sheet.getRow(i).getCell(7).getStringCellValue());
		appInd.seletDate(getSuppCertInvoiceDate(), appInd.getDateAsSpecified(0));
		appInd.singleDropDown(getSuppCertTypeDD(), sheet.getRow(i).getCell(8).getStringCellValue());
		String ParentSelectGRN=appInd.switchToChildWindow(SuppCertSelcetGRNLink);
		getSuppCertSelcetGRNCheck();
		String GRNAMOUNT=getSuppCertGRNAMOUNT();
		getSuppCertAddGRN_NextButton();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) iDriver;  
		try {
			jsExecutor.executeScript("document.getElementByXpath('//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']').value='0.1'");
		}catch(Exception e) {
			jsExecutor.executeScript("arguments[0].value='0.1'", getSuppCertGRNQty());  
		}
	//	int Qtynumbers = getSuppCertGRNQty().getText().length();
//		for (int i = 0; i < Qtynumbers; i++) {
//			Robot robo = new Robot();
//			robo.keyPress(KeyEvent.VK_BACK_SPACE);
//			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
//		}
		Thread.sleep(2000);
		getSuppCertAddGRN_AcceptSelcet();
		appInd.isAlertPresent();		
		appInd.switchToParentWindow(ParentSelectGRN);
		Frames.rightFrame();
		getSuppCertInvoiceAmt().sendKeys("50000");
		Thread.sleep(2000);
		getSuppCertAddRowDed();
		Thread.sleep(2000);
		appInd.singleDropDown(getSuppCertDedTaxCat1(),sheet.getRow(i).getCell(10).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSuppCertDedTaxCatPer1(),sheet.getRow(i).getCell(11).getStringCellValue());
		Thread.sleep(1000);
		getSuppCertAddRowDed();
		Thread.sleep(2000);
		appInd.singleDropDown(getSuppCertDedTaxCat2(),sheet.getRow(i).getCell(12).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSuppCertDedTaxCatPer2(),sheet.getRow(i).getCell(13).getStringCellValue());
		getSuppCertOtherDed().sendKeys(sheet.getRow(i).getCell(14).getStringCellValue());
		getSuppCertOtherDedRemarksclick();
		Thread.sleep(1000);
		getSuppCertOtherDedRemarks().sendKeys("Other Deductions for Delay");
		getSuppCertOtherAddTax().sendKeys(sheet.getRow(i).getCell(15).getStringCellValue());
		getSuppCertOtherAddTaxRemarksclick();
		Thread.sleep(1000);
		getSuppCertOtherAddTaxRemarks().sendKeys("Other Addition Tax");
		getSuppCertRetentionPer().sendKeys(sheet.getRow(i).getCell(16).getStringCellValue());
		appInd.singleDropDown(getSuppCertPayModeDD(),sheet.getRow(i).getCell(17).getStringCellValue());
		appInd.seletDate(getSuppCertPayDueDate(), appInd.getDateAsSpecified(-30));
		getSuppCertRemarks().sendKeys("Supplier Certificate Created Through Automation");
		Thread.sleep(3000);
		getSuppCertCreate();
		Thread.sleep(3000);
	 SupperCertNo=getsuppcetNo();
		if (appInd.AlertPresent()) {
			Datatable.writeExcel("Supplier Certificate ",  "is Not Created", sheetname, Purchase.OutputCreatePath);
		} else {
			
			Datatable.writeExcel("Certificate No. "+SupperCertNo,  "is Created", sheetname, Purchase.OutputCreatePath);
			count++;
		}
		}catch (Exception e) {
			Datatable.writeExcel("Supplier Certificate ",  "is Not Created-Exception", sheetname, Purchase.OutputCreatePath);
		}
		try {
		getSuppCertModify();
		Thread.sleep(2000);
		
		switch (i) {
		case 1: appInd.singleDropDown(getSuppCertDedTaxCatPer1(),sheet.getRow(1).getCell(20).getStringCellValue());
				appInd.singleDropDown(getSuppCertDedTaxCatPer2(),sheet.getRow(1).getCell(22).getStringCellValue());
				getSuppCertRemarks().clear();
				Thread.sleep(2000);
				getSuppCertRemarks().sendKeys("Supplier Certificate Edited and Updated Through Automation Test");
			
			break;
			
		case 2:	getSuppCertOtherDed().clear();
				getSuppCertOtherDed().sendKeys(sheet.getRow(2).getCell(20).getStringCellValue());
				getSuppCertRemarks().clear();
				Thread.sleep(2000);
				getSuppCertRemarks().sendKeys("Supplier Certificate Edited and Updated Through Automation Test");
			
			break;
			
		case 3:	getSuppCertOtherAddTax().clear();
				getSuppCertOtherAddTax().sendKeys(sheet.getRow(2).getCell(22).getStringCellValue());
				getSuppCertRemarks().clear();
				Thread.sleep(2000);
				getSuppCertRemarks().sendKeys("Supplier Certificate Edited and Updated Through Automation Test");
			
			break;

		default:
			break;
		}
		Thread.sleep(2000);
		getSuppCertUpdate();
		Thread.sleep(5000);
		
		if (appInd.AlertPresent()) {
			Datatable.writeExcel("Supplier Certificate ",  "is Not Updated", sheetname, Purchase.OutputCreatePath);
		} else {
			Datatable.writeExcel("Certificate No. "+SupperCertNo,  "is Updated", sheetname, Purchase.OutputCreatePath);
			updatecount++;
		}
		}catch (Exception e) {
			Datatable.writeExcel("Supplier Certificate ",  "is Not Updated-Exception", sheetname, Purchase.OutputCreatePath);
		}
		
		//Approved
		getSuppCertChangeStatus();
		Thread.sleep(2000);
		getSuppCertChangeStatusDD().sendKeys("Approved");
		Thread.sleep(2000);
		getSuppCertUpdateStatus();
		Thread.sleep(2000);
		getSuppCertChangeStatus();
		Thread.sleep(2000);
		getSuppCertChangeStatusDD().sendKeys("Processed");
		Thread.sleep(2000);
		getSuppCertUpdateStatus();
		Thread.sleep(3000);
		SupplierPayment(); //Supplier Payment Process From Finance Module
		}
		if(count==sheet.getLastRowNum())
		{
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		if(updatecount==sheet.getLastRowNum())
		{
			Datatable.writeExcel("Supplier Payment Update", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Supplier Payment Update", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		
		
		
	}
	public void SupplierPayment() throws Throwable{
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickFinance();
			Thread.sleep(2000);
			Finance en=new Finance(iDriver);
			//en.clickFinApprovals();
			//Thread.sleep(2000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Purchase.InputCreatePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
		Frames.SubMenuFrame();
		getFinPurApprovals();
		Frames.tabFrame();
		getFinPurSuppCertv();
		try {
		Frames.innerFrame();
		WebElement searchcompny=SuppPaymentCreate.getFinCertCompany();
		searchcompny.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		searchcompny.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchcompny.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	//	getFinPurAdvstatusDD().clear();
	
		getFinCertNo().sendKeys(SupperCertNo);
		Thread.sleep(1000);
		getFinPurSuppCertGo();
		Thread.sleep(100);
		getFinCertNoclick();
		Frames.innerFrame();
		String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
		Thread.sleep(1000);
		appInd.singleDropDown(getBankAccountDD(),sheet.getRow(1).getCell(24).getStringCellValue());
		Thread.sleep(1000);
		appInd.isAlertPresent();
		Thread.sleep(1000);
		getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
		Thread.sleep(1000);
		getPaymentSubmit();
		Thread.sleep(2000);
		appInd.switchToParentWindow(Parent_Payment);
		Frames.innerFrame();
		Thread.sleep(3000);
	//	String AdvancePaymentStatus=getpaymentstatus();
		if(getSupppaymentstatus().equals("Paid")) {
			Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Paid", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
		}else {
			Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Not Paid", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
		}
		}catch (Exception e) {
			Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Not Paid-Exception", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
	}
	}
	
	public void SuppCertMultiproject() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", getSuppCertProjectDD());
		}catch(Exception e) {
			System.out.println(e);
		}
		w2.until(ExpectedConditions.elementToBeClickable(getSuppCertEnterProject()));
		getSuppCertEnterProject().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		for (WebElement e : getSuppCertProjectList()) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		try {
		js.executeScript("arguments[0].click();", getSuppCertEnterProject());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			js.executeScript("arguments[0].click();", getSuppCertProjectDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
	}
	public void SuppCertMultiSubproject() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", getSuppCertSubProjectDD());
		}catch(Exception e) {
			System.out.println(e);
		}
		w2.until(ExpectedConditions.elementToBeClickable(getSuppCertEnterSubProject()));
		getSuppCertEnterSubProject().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		for (WebElement e : getSuppCertSubProjectList()) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		try {
		js.executeScript("arguments[0].click();", getSuppCertEnterSubProject());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			js.executeScript("arguments[0].click();", getSuppCertSubProjectDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
	}
	public void SuppCertMultiPO() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", getSuppCertPODD());
		}catch(Exception e) {
			System.out.println(e);
		}
		w2.until(ExpectedConditions.elementToBeClickable(getSuppCertEnterPO()));
		getSuppCertEnterPO().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		for (WebElement e : getSuppCertPOList()) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		try {
		js.executeScript("arguments[0].click();", getSuppCertEnterPO());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			js.executeScript("arguments[0].click();", getSuppCertPODD());
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
	}
	


}
