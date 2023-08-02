package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.ServPayment_Create_Test;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Purchase;
import com.github.dockerjava.api.model.Frame;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class ServPayment_Create extends ServPayment_Create_Test{
	
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static XSSFSheet sheet;
	int i=1;
	public ServPayment_Create(WebDriver oDriver) {
	iDriver=oDriver;
	PageFactory.initElements(iDriver, this);
	sheetname=this.getClass().getSimpleName();
	
	}
	
	@FindBy(xpath = "//a[text()='Service Provider Certificates']")
	private WebElement SerCertificateLink;
	public void getSerCertificateLink() {
		w2.until(ExpectedConditions.elementToBeClickable(SerCertificateLink));
		SerCertificateLink.click();
	}
	@FindBy(id = "btnCreate")
	private WebElement CreateSerCertificate;
	public void getCreateSerCertificate() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateSerCertificate));
		CreateSerCertificate.click();
	}
	
	@FindBy(css = "select#ddlCertifyingCompany")
	private WebElement ServCertCompDD;
	public WebElement getServCertCompDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertCompDD));
		return ServCertCompDD;
	}
	
	@FindBy(xpath = "//table[@class='in4-filter mb-10']//tr[2]//button")
	private WebElement getSerCertProjDD;
	public WebElement getSerCertProjDD() {
		w2.until(ExpectedConditions.elementToBeClickable(getSerCertProjDD));
		return getSerCertProjDD;
	}
	@FindBy(xpath = "//table[@class='in4-filter mb-10']//tr[2]//input[@placeholder='Search']")
	private WebElement SerCertEnterProj;
	public WebElement getSerCertEnterProj() {
		w2.until(ExpectedConditions.elementToBeClickable(SerCertEnterProj));
		return SerCertEnterProj;
	}
	@FindBy(xpath = "//table[@class='in4-filter mb-10']//tr[2]//li")
	private List<WebElement> SerCertListOfProj;
	public List<WebElement> getSerCertListOfProj() {
		return SerCertListOfProj;
	}
	@FindBy(id = "lnkBtnPOSelect")
	private WebElement ServCertSelectPOLink;
	public WebElement getServCertSelectPOLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectPOLink));
		return ServCertSelectPOLink;
	}
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
	private WebElement ServCertPODD;
	public WebElement getServCertPODD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertPODD));
		return ServCertPODD;
	}
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
	private WebElement ServCertEnterPO;
	public WebElement getServCertEnterPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertEnterPO));
		return ServCertEnterPO;
	}
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
	private List<WebElement> ServCertListofPO;
	public List<WebElement> getServCertListofPO() {
		return ServCertListofPO;
	}
	
	@FindBy(id = "btnSearch")
	private WebElement ServCertSearchPO;
	public void getServCertSearchPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertSearchPO));
		ServCertSearchPO.click();
	}
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input[@type='radio']")
	private WebElement ServCertSelectPORadio;
	public void getServCertSelectPORadio() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectPORadio));
		ServCertSelectPORadio.click();
	}
	@FindBy(css = "a#btnAcceptSelected")
	private WebElement ServcertAcceptSelectdPO;
	public void getServcertAcceptSelectdPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServcertAcceptSelectdPO));
		ServcertAcceptSelectdPO.click();
	}
	
	
	
	@FindBy(id = "lnkBtnServiceProviderSelect")
	private WebElement ServAdvSelectServProviderLink;
	public WebElement getServCertSelectServProviderLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectServProviderLink));
		return ServAdvSelectServProviderLink;
	}
	@FindBy(id = "textServiceProviderName")
	private WebElement ServCertEnterSerProvider;
	public WebElement getServCertEnterSerProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertEnterSerProvider));
		return ServCertEnterSerProvider;
	}
	@FindBy(id = "btnFilterGO")
	private WebElement ServCertSerProviderGo;
	public void getServCertSerProviderGoo() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertSerProviderGo));
		ServCertSerProviderGo.click();
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//a")
	private WebElement ServCertSelectSerProvider;
	public void getServCertSelectSerProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectSerProvider));
		ServCertSelectSerProvider.click();
	}
	
	@FindBy(css = "input#txtInvoiceNo")
	private WebElement ServCertInvNo;
	public WebElement getServCertInvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertInvNo));
		return ServCertInvNo;
	}
	@FindBy(css = "input#txtInvoiceAmount")
	private WebElement ServCertInvAmount;
	public WebElement getServCertInvAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertInvAmount));
		return ServCertInvAmount;
	}
	@FindBy(css = "input#dpInvoiceDate_txtDatePicker")
	private WebElement ServCertInvDate;
	public WebElement getServCertInvDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertInvDate));
		return ServCertInvDate;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[1]//input[@type='checkbox']")
	private WebElement ServCertSelectGRN;
	public void getServCertSelectGRN() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectGRN));
		 ServCertSelectGRN.click();
	}

	@FindBy(xpath = "//table[@id='gvGRNTaxesAndCharges']//tr[4]//td[6]//input")
	private WebElement ServCertGRNValue;
	public WebElement getServCertGRNValue() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertGRNValue));
		return ServCertGRNValue;
	}
	
	@FindBy(css = "a#lnkbtnAddTaxAdditionRow")
	private WebElement ServCertTaxAddRow;
	public void getServCertTaxAddRow() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertTaxAddRow));
		ServCertTaxAddRow.click();;
	}
	
	@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//td[3]//select")
	private WebElement ServCertAddTaxCat;
	public WebElement getServCertAddTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxCat));
		return ServCertAddTaxCat;
	}
	@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//td[4]//select")
	private WebElement ServCertAddTaxPer;
	public WebElement getServCertAddTaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxPer));
		return ServCertAddTaxPer;
	}
	@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//td[5]//select")
	private WebElement ServCertAddTaxType;
	public WebElement getServCertAddTaxType() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxType));
		return ServCertAddTaxType;
	}
	
	@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//td[3]//select")
	private WebElement ServCertAddTaxCat2;
	public WebElement getServCertAddTaxCat2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxCat2));
		return ServCertAddTaxCat2;
	}
	@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//td[4]//select")
	private WebElement ServCertAddTaxPer2;
	public WebElement getServCertAddTaxPer2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxPer2));
		return ServCertAddTaxPer2;
	}
	@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//td[5]//select")
	private WebElement ServCertAddTaxType2;
	public WebElement getServCertAddTaxType2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxType2));
		return ServCertAddTaxType2;
	}
	
	@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//a//img")
	private WebElement ServCertTaxAddDiv;
	public void getServServCertTaxAddDiv() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertTaxAddDiv));
		ServCertTaxAddDiv.click();
	}
	@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//a//img")
	private WebElement ServCertTaxAddDiv2;
	public void getServServCertTaxAddDiv2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertTaxAddDiv2));
		ServCertTaxAddDiv2.click();
	}
	
	@FindBy(xpath = "//a[text()='Apply All']")
	private WebElement ServCertAddTAxApplyAll;
	public void getServCertAddTAxApplyAll() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTAxApplyAll));
		 ServCertAddTAxApplyAll.click();;
	}
	
	@FindBy(xpath = "//div[@id='divAddition2']//a[text()='Apply All']")
	private WebElement ServCertAddTAxApplyAll2;
	public void getServCertAddTAxApplyAll2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTAxApplyAll2));
		 ServCertAddTAxApplyAll2.click();;
	}
	
	@FindBy(css = "a#lnkbtnAddTaxRow")
	private WebElement ServCertDedTaxAddRow;
	public void getServCertDedTaxAddRow() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxAddRow));
		ServCertDedTaxAddRow.click();;
	}
	@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table1']//tr[2]//td[3]//select")
	private WebElement ServCertDedTaxCat;
	public WebElement getServCertDedTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxCat));
		return ServCertDedTaxCat;
	}
	@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table1']//tr[2]//td[4]//select")
	private WebElement ServCertDedTaxper;
	public WebElement getServCertDedTaxper() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxper));
		return ServCertDedTaxper;
	}
	@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table1']//tr[2]//a//img")
	private WebElement ServCertDedTaxDiv;
	public void getServCertDedTaxDiv() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxDiv));
		ServCertDedTaxDiv.click();;
	}
	@FindBy(xpath = "//div[@id='upTaxDeductionList']//a[text()='Apply All']")
	private WebElement ServCertDedTaxApplyAll;
	public void getServCertDedTaxApplyAll() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxApplyAll));
		 ServCertDedTaxApplyAll.click();;
	}
	@FindBy(id ="ddlModeOfPayment")
	private WebElement ServCertModeofPay;
	public WebElement getServCertModeofPay() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertModeofPay));
		return ServCertModeofPay;
	}
	@FindBy(css = "input#dpPaymentDueDate_txtDatePicker")
	private WebElement ServCertPayDueDate;
	public WebElement getServCertPayDueDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertPayDueDate));
		return ServCertPayDueDate;
	}
	
	@FindBy(css = "textarea#txtRemarks")
	private WebElement ServCertRemarks;
	public WebElement getServCertRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertRemarks));
		return ServCertRemarks;
	}
	
	@FindBy(css = "input#btnCreate")
	private WebElement ServCertCreateButton;
	public void getServCertCreateButton() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertCreateButton));
		 ServCertCreateButton.click();;
	}
	
	@FindBy(id = "lblCertificateNoView")
	private WebElement ServCertNumber;
	public String getServCertNumber() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertNumber));
		return ServCertNumber.getText();
	}
	
	@FindBy(id = "lnkBtnChangeStatus")
	private WebElement ServCertChangeStatus;
	public void getServCertChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertChangeStatus));
		ServCertChangeStatus.click();;
	}
	@FindBy(css = "select#ddlNextStatus")
	private WebElement ServCertStatusDD;
	public WebElement getServCertStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertStatusDD));
		return ServCertStatusDD;
	}
	@FindBy(css = "a#lnkBtnUpdateStatus")
	private WebElement ServCertUpdateStatus;
	public void getServCertUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertUpdateStatus));
		ServCertUpdateStatus.click();;
	}
	
	
	@FindBy(css = "input#dtProcessedDt_txtDatePicker")
	private WebElement ServCertProcesDate;
	public WebElement getServCertProcesDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertProcesDate));
		return ServCertProcesDate;
	}
	
	@FindBy(css = "input#btnModify")
	private WebElement ServCertModify;
	public void getServCertModify() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertModify));
		ServCertModify.click();;
	}
	
	@FindBy(css = "input#btnUpdate")
	private WebElement ServCertUpdate;
	public void getServCertUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertUpdate));
		ServCertUpdate.click();;
	}
	
	@FindBy(id = "lblStatus")
	private WebElement ServCertCurrentStatus;
	public String getServCertCurrentStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServCertCurrentStatus));
		return ServCertCurrentStatus.getText();
	}
	
	@FindBy(xpath="//a[text()='Purchase']")
	private  WebElement FinPurApprovals;
	public void getFinPurApprovals() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurApprovals));
		 FinPurApprovals.click();
	}
	@FindBy(xpath="//a[text()='Service Cert.']")
	private  WebElement ServiceCertTab;
	public void getServiceCertTab() {
		w2.until(ExpectedConditions.elementToBeClickable(ServiceCertTab));
		ServiceCertTab.click();
	}
	@FindBy(css = "input#txtCertifyingCompPO")
	private  WebElement FinCertCompany;
	public WebElement getFinCertCompany() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertCompany));
		return FinCertCompany;
	}
	@FindBy(css = "input#txtCertificateNo")
	private  WebElement FinCertNo;
	public WebElement getFinCertNo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertNo));
		return FinCertNo;
	}
	
	@FindBy(css = "input#btnFilterGO")
	private  WebElement FinPurSuppCertGo;
	public void getFinPurSuppCertGo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCertGo));
		FinPurSuppCertGo.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[2]//a")
	private  WebElement FinCertNoclick;
	public void getFinCertNoclick() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertNoclick));
		FinCertNoclick.click();
	}
	@FindBy(xpath = "//table[@id='tblBankPaymentsLinks']//a[2]")
	private  WebElement PaymentLink;
	public WebElement getPaymentLink() {
		w2.until(ExpectedConditions.elementToBeClickable(PaymentLink));
	return	PaymentLink;
	}
	@FindBy(css = "select#ddlBankCash")
	private  WebElement BankAccountDD;
	public WebElement getBankAccountDD() {
		w2.until(ExpectedConditions.elementToBeClickable(BankAccountDD));
	return	BankAccountDD;
	}
	@FindBy(css = "input#txtInstrumentNo")
	private  WebElement InstrumentNo;
	public WebElement getInstrumentNo() {
		w2.until(ExpectedConditions.elementToBeClickable(InstrumentNo));
	return	InstrumentNo;
	}
	@FindBy(css = "input#btnSubmit")
	private  WebElement PaymentSubmit;
	public void getPaymentSubmit() {
		w2.until(ExpectedConditions.elementToBeClickable(PaymentSubmit));
		PaymentSubmit.click();
	}
	@FindBy(id = "lblStatus")
	private  WebElement ServPaymentstatus;
	public String getServPaymentstatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServPaymentstatus));
	return	ServPaymentstatus.getText();
	}

	@FindBy(css = "input#txtFavouring")
	private  WebElement FavoringPayee;
	public WebElement getFavoringPayee() {
		w2.until(ExpectedConditions.elementToBeClickable(FavoringPayee));
	return	FavoringPayee;
	}
	
	public void MenuSubMenuServicecertifiacte()throws Throwable{
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
	
	String ServiceCertNum;
	public void Servcertcreation() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int updatecount=0;
		System.out.println("Total Rows in Excel---"+sheet.getLastRowNum());
		for(i=1;i<=sheet.getLastRowNum();i++)  {
		try {
		MenuSubMenuServicecertifiacte();
		Frames.SubMenuFrame();
		getSerCertificateLink();
		Frames.rightFrame();
		getCreateSerCertificate();
		getServCertCompDD().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		getSerCertProjDD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getSerCertProjDD(), getSerCertEnterProj(), sheet.getRow(i).getCell(1).getStringCellValue(), getSerCertListOfProj());
		String ParentSelectPO=appInd.switchToChildWindow(ServCertSelectPOLink);
		getServCertPODD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getServCertPODD(), getServCertEnterPO(), sheet.getRow(i).getCell(3).getStringCellValue(),getServCertListofPO());
		getServCertSearchPO();
		getServCertSelectPORadio();
		getServcertAcceptSelectdPO();
		appInd.switchToParentWindow(ParentSelectPO);
		Frames.rightFrame();
		String ParentSelectServProv=appInd.switchToChildWindow(ServAdvSelectServProviderLink);
		getServCertEnterSerProvider().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getServCertSerProviderGoo();
		getServCertSelectSerProvider();
		appInd.switchToParentWindow(ParentSelectServProv);
		Frames.rightFrame();
		getServCertInvNo().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
		getServCertInvAmount().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		appInd.seletDate(getServCertInvDate(), appInd.getDateAsSpecified(0));
		getServCertSelectGRN();
		Thread.sleep(2000);
		getServCertGRNValue().clear();
		Thread.sleep(2000);
		getServCertGRNValue().sendKeys(sheet.getRow(i).getCell(15).getStringCellValue());
		Thread.sleep(2000);
		appInd.clickOutside();
		Thread.sleep(2000);
		getServCertTaxAddRow();
		getServCertAddTaxCat().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		Thread.sleep(1000);
		getServCertAddTaxPer().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		Thread.sleep(1000);
		getServCertAddTaxType().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getServServCertTaxAddDiv();
		Thread.sleep(1000);
		getServCertAddTAxApplyAll();
		Thread.sleep(1000);
		
		getServCertTaxAddRow();
		getServCertAddTaxCat2().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		getServCertAddTaxPer2().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		Thread.sleep(1000);
		getServCertAddTaxType2().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
		getServServCertTaxAddDiv2();
		Thread.sleep(1000);
		getServCertAddTAxApplyAll2();
		Thread.sleep(1000);
		
		getServCertDedTaxAddRow();
		getServCertDedTaxCat().sendKeys(sheet.getRow(i).getCell(12).getStringCellValue());
		Thread.sleep(2000);
		getServCertDedTaxper().sendKeys(sheet.getRow(i).getCell(13).getStringCellValue());
		Thread.sleep(1000);
		getServCertDedTaxDiv();
		Thread.sleep(2000);
		getServCertDedTaxApplyAll();
		Thread.sleep(2000);
		
		getServCertModeofPay().sendKeys(sheet.getRow(i).getCell(14).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getServCertPayDueDate(), appInd.getDateAsSpecified(-30));
		Thread.sleep(2000);
		getServCertRemarks().sendKeys("Service Provider Payment Created Through Automation");
		Thread.sleep(2000);
		getServCertCreateButton();
		if(appInd.AlertPresent()) {
		String AlertText=iDriver.switchTo().alert().getText();
		if(AlertText.equalsIgnoreCase("Vendor does not have GSTIN and the certificate does not have RCM taxes. Do you want to proceed?")) {
			appInd.isAlertPresent();
			Thread.sleep(2000);
			ServiceCertNum =getServCertNumber();
			System.out.println("ServiceCertNum   "+ServiceCertNum);
			Datatable.writeExcel(ServiceCertNum,  "Certificate is Created", sheetname, Purchase.OutputCreatePath);
		}else {
			System.out.println("Alert Displayed ---"+AlertText);
			Datatable.writeExcel("Service Certificate ",  "is Not Created", sheetname, Purchase.OutputCreatePath);
			}
		}
	}
		catch (Exception e) {
		Datatable.writeExcel("Service Certificate ",  "is Not Created Exception", sheetname, Purchase.OutputCreatePath);
		}
		
		getServCertModify();
		Thread.sleep(2000);
		try {
		switch (i) {
		case 1:
			getServCertGRNValue().clear();
			Thread.sleep(2000);
			getServCertGRNValue().sendKeys(sheet.getRow(1).getCell(18).getStringCellValue());
			Thread.sleep(2000);
			appInd.clickOutside();
			getServCertRemarks().clear();
			Thread.sleep(1000);
			getServCertRemarks().sendKeys("Service Provider Payment Modified & Updated Through Automation");
			break;
		case 2:
			getServCertModeofPay().sendKeys(sheet.getRow(2).getCell(18).getStringCellValue());
			getServCertRemarks().clear();
			Thread.sleep(1000);
			getServCertRemarks().sendKeys("Service Provider Payment Modified & Updated Through Automation");
			break;
			
		case 3:
			//Modifying and Updating without editing any data
			getServCertRemarks().clear();
			Thread.sleep(1000);
			getServCertRemarks().sendKeys("Service Provider Payment Modified & Updated Through Automation");
			break;

		default:
			break;
		}
		Thread.sleep(2000);
		getServCertUpdate();
		Thread.sleep(2000);
		if(appInd.AlertPresent()) {
			String AlertText=iDriver.switchTo().alert().getText();
			if(AlertText.equalsIgnoreCase("Vendor does not have GSTIN and the certificate does not have RCM taxes. Do you want to proceed?")) {
				appInd.isAlertPresent();
				Thread.sleep(2000);
				Datatable.writeExcel(ServiceCertNum,  "Certificate is Modified & Updated", sheetname, Purchase.OutputCreatePath);
			}else {
				System.out.println("Alert Displayed ---"+AlertText);
				Datatable.writeExcel(ServiceCertNum,  "is Not Updated", sheetname, Purchase.OutputCreatePath);
				}
			}
		}catch (Exception e) {
			Datatable.writeExcel(ServiceCertNum,  "is Not Updated Exception", sheetname, Purchase.OutputCreatePath);
		}	
		//Status Changing
		getServCertChangeStatus();
		getServCertStatusDD().sendKeys("Approved");
		getServCertUpdateStatus();
		Thread.sleep(1000);
		getServCertChangeStatus();
		getServCertStatusDD().sendKeys("Processed");
		Thread.sleep(1000);
		appInd.seletDate(getServCertProcesDate(), appInd.getDateAsSpecified(0));
		Thread.sleep(1000);
		getServCertUpdateStatus();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
	Thread.sleep(2000);
	String CurentStatus=getServCertCurrentStatus();
	if(CurentStatus.equalsIgnoreCase("Processed")) {
		Datatable.writeExcel(ServiceCertNum, "Processed", sheetname, Purchase.OutputCreatePath);
	}else{
		Datatable.writeExcel(ServiceCertNum, "Status Not Updated", sheetname, Purchase.OutputCreatePath);
	}
	ServicePaymentProcess();
		}
		
		if(count==sheet.getLastRowNum())
		{
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		if(updatecount==sheet.getLastRowNum())
		{
			Datatable.writeExcel("Service Payment Update", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Service Payment Update", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
	}
	
	public void ServicePaymentProcess() throws Throwable{
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
		Thread.sleep(3000);
		getServiceCertTab();
		try {
		Frames.innerFrame();
		WebElement searchcompny=ServPaymentCreate.getFinCertCompany();
		searchcompny.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		searchcompny.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchcompny.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	//	getFinPurAdvstatusDD().clear();
	
		getFinCertNo().sendKeys(ServiceCertNum);
		Thread.sleep(1000);
		getFinPurSuppCertGo();
		Thread.sleep(100);
		getFinCertNoclick();
		Frames.innerFrame();
		String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
		Thread.sleep(1000);
		appInd.singleDropDown(getBankAccountDD(),sheet.getRow(i).getCell(16).getStringCellValue());
		Thread.sleep(1000);
		appInd.isAlertPresent();
		Thread.sleep(1000);
		getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
		Thread.sleep(1000);
		getFavoringPayee().clear();
		Thread.sleep(1000);
		getFavoringPayee().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getPaymentSubmit();
		Thread.sleep(2000);
		appInd.switchToParentWindow(Parent_Payment);
		Frames.innerFrame();
		Thread.sleep(3000);
	//	String AdvancePaymentStatus=getpaymentstatus();
		if(getServPaymentstatus().equals("Paid")) {
			Datatable.writeExcel("Certificate No. "+ServiceCertNum, "Service Payment is Paid", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+ServiceCertNum+" "+ getServPaymentstatus());
		}else {
			Datatable.writeExcel("Certificate No. "+ServiceCertNum, "Service Payment is Not Paid", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+ServiceCertNum+" "+ getServPaymentstatus());
		}
		}catch (Exception e) {
			Datatable.writeExcel("Certificate No. "+ServiceCertNum, "Service Payment is Not Paid-Exception", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+ServiceCertNum+" "+ getServPaymentstatus());
	}
	}
}
