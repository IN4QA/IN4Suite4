package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.ServAdvance_Create_Test;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class ServAdvance_Create extends ServAdvance_Create_Test{
	
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static XSSFSheet sheet;
	int i;
	public ServAdvance_Create(WebDriver oDriver) {
		iDriver=oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
		}
	@FindBy(xpath = "//a[text()='Service Provider Advances']")
	private WebElement ServAdvlink;
	public void getServAdvlink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvlink));
		ServAdvlink.click();
	}
	@FindBy(id = "btnCreate")
	private WebElement CreateServAdvbutton;
	public void getCreateServAdvbutton() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateServAdvbutton));
		CreateServAdvbutton.click();
	}
	@FindBy(css = "select#ddlCertifyingCompany")
	private WebElement ServAdvCompDD;
	public WebElement getServAdvCompDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvCompDD));
		return ServAdvCompDD;
	}
	@FindBy(xpath = "//div[@id='upServiceProviderCreateOrModifyMode']//tr[2]//button")
	private WebElement ServAdvProjDD;
	public WebElement getServAdvProjDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvProjDD));
		return ServAdvProjDD;
	}
	@FindBy(xpath = "//div[@id='upServiceProviderCreateOrModifyMode']//tr[2]//input[@placeholder='Search']")
	private WebElement ServAdvEnterProj;
	public WebElement getServAdvEnterProj() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvEnterProj));
		return ServAdvEnterProj;
	}
	@FindBy(xpath = "//div[@id='upServiceProviderCreateOrModifyMode']//tr[2]//li")
	private List<WebElement> ServAdvEnterListofProj;
	public List<WebElement> getServAdvEnterListofProj() {
		return ServAdvEnterListofProj;
	}
	@FindBy(id = "ddlPayingCompanyProvider")
	private WebElement ServAdvPayComp;
	public WebElement getServAdvPayComp() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvPayComp));
		return ServAdvPayComp;
	}
	@FindBy(id = "lnkBtnPOSelect")
	private WebElement ServAdvSelectPOLink;
	public WebElement getServAdvSelectPOLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectPOLink));
		return ServAdvSelectPOLink;
	}
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
	private WebElement ServAdvPODD;
	public WebElement getServAdvPODD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvPODD));
		return ServAdvPODD;
	}
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
	private WebElement ServAdvEnterPO;
	public WebElement getServAdvEnterPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvEnterPO));
		return ServAdvEnterPO;
	}
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
	private List<WebElement> ServAdvListofPO;
	public List<WebElement> getServAdvListofPO() {
		return ServAdvListofPO;
	}
	@FindBy(id = "btnSearch")
	private WebElement ServAdvSearchPO;
	public void getServAdvSearchPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSearchPO));
		ServAdvSearchPO.click();
	}
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input[@type='radio']")
	private WebElement ServAdvSelectPORadio;
	public void getServAdvSelectPORadio() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectPORadio));
		ServAdvSelectPORadio.click();
	}
	@FindBy(css = "a#btnAcceptSelected")
	private WebElement ServAdvAcceptSelectdPO;
	public void getServAdvAcceptSelectdPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAcceptSelectdPO));
		ServAdvAcceptSelectdPO.click();
	}
	@FindBy(id = "lnkBtnServiceProviderSelect")
	private WebElement ServAdvSelectServProviderLink;
	public WebElement getServAdvSelectServProviderLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectServProviderLink));
		return ServAdvSelectServProviderLink;
	}
	@FindBy(id = "textServiceProviderName")
	private WebElement ServAdvEnterSerProvider;
	public WebElement getServAdvEnterSerProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvEnterSerProvider));
		return ServAdvEnterSerProvider;
	}
	@FindBy(id = "btnFilterGO")
	private WebElement ServAdvSerProviderGo;
	public void getServAdvSerProviderGo() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSerProviderGo));
		 ServAdvSerProviderGo.click();;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//a")
	private WebElement ServAdvSelectSerProvider;
	public void getServAdvSelectSerProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectSerProvider));
		ServAdvSelectSerProvider.click();;
	}
	@FindBy(css = "input#txtInvoiceNumber")
	private WebElement ServAdvInvNo;
	public WebElement getServAdvInvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvInvNo));
		return ServAdvInvNo;
	}
	@FindBy(css = "input#txtInvoiceAmt")
	private WebElement ServAdvInvAmount;
	public WebElement getServAdvInvAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvInvAmount));
		return ServAdvInvAmount;
	}
	@FindBy(css = "input#invoicedt_txtDatePicker")
	private WebElement ServAdvInvDate;
	public WebElement getServAdvInvDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvInvDate));
		return ServAdvInvDate;
	}
	@FindBy(css = "input#txtCertifiedAmount")
	private WebElement ServAdvCertAmt;
	public WebElement getServAdvCertAmt() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvCertAmt));
		return ServAdvCertAmt;
	}
	@FindBy(id = "ddlModeOfPayment")
	private WebElement ServAdvPayMode;
	public WebElement getServAdvPayMode() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvPayMode));
		return ServAdvPayMode;
	}
	@FindBy(css = "input#dpPaymentDueDate_txtDatePicker")
	private WebElement ServAdvPayDueDate;
	public WebElement getServAdvPayDueDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvPayDueDate));
		return ServAdvPayDueDate;
	}
	@FindBy(css = "input#txtFavouring")
	private WebElement ServAdvFavouring;
	public WebElement getServAdvFavouring() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvFavouring));
		return ServAdvFavouring;
	}
	@FindBy(id = "txtRemarks")
	private WebElement ServAdvCreateRemarks;
	public WebElement getServAdvCreateRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvCreateRemarks));
		return ServAdvCreateRemarks;
	}
	@FindBy(css = "a#lnkbtnAddTaxAdditionRow")
	private WebElement ServAdvTaxAddRow;
	public void getServAdvTaxAddRow() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvTaxAddRow));
		 ServAdvTaxAddRow.click();;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement ServAdvAddTaxCat;
	public WebElement getServAdvAddTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxCat));
		return ServAdvAddTaxCat;
	}

	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select")
	private WebElement ServAdvAddTaxCat2;
	public WebElement getServAdvAddTaxCat2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxCat2));
		return ServAdvAddTaxCat2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement ServAdvAddTaxPer;
	public WebElement getServAdvAddTaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxPer));
		return ServAdvAddTaxPer;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select")
	private WebElement ServAdvAddTaxPer2;
	public WebElement getServAdvAddTaxPer2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxPer2));
		return ServAdvAddTaxPer2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[4]//select")
	private WebElement ServAdvAddTaxType;
	public WebElement getServAdvAddTaxType() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxType));
		return ServAdvAddTaxType;
	}
	@FindBy(css = "a#lnkbtnAddTaxRow")
	private WebElement ServAdvTaxDedRow;
	public void getServAdvTaxDedRow() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvTaxDedRow));
		 ServAdvTaxDedRow.click();
	}
	@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement ServAdvDedTaxCat;
	public WebElement getServAdvDedTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvDedTaxCat));
		return ServAdvDedTaxCat;
	}
	@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement ServAdvDedTaxPer;
	public WebElement getServAdvDedTaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvDedTaxPer));
		return ServAdvDedTaxPer;
	}

	@FindBy(css = "input#btnCreate")
	private WebElement ServAdvCreate;
	public WebElement getServAdvCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvCreate));
		return ServAdvCreate;
	}
	@FindBy(css = "input#btnModify")
	private WebElement ServAdvModify;
	public void getServAdvModify() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvModify));
		 ServAdvModify.click();;
	}
	@FindBy(css = "input#btnUpdate")
	private WebElement ServAdvUpdate;
	public void getServAdvUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvUpdate));
		 ServAdvUpdate.click();
	}
	@FindBy(id = "lnkBtnChangeStatus")
	private WebElement ServAdvChangeStatus;
	public void getServAdvChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvChangeStatus));
		 ServAdvChangeStatus.click();;
	}
	@FindBy(css = "a#lnkBtnUpdateStatus")
	private WebElement ServAdvUpdateStatus;
	public void getServAdvUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvUpdateStatus));
		ServAdvUpdateStatus.click();;
	}
	@FindBy(css = "select#ddlNextStatus")
	private WebElement ServAdvStatusDD;
	public WebElement getServAdvStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvStatusDD));
		return ServAdvStatusDD;
	}
	@FindBy(xpath = "//div[@class='in4-container mt-10 clear']//span[@id='lblViewAdvanceNumber']")
	private WebElement ServAdvNumber;
	public String getServAdvNumber() {
		return ServAdvNumber.getText();
	}
	
	
	@FindBy(css = "input#dtProcessedDt_txtDatePicker")
	private WebElement ProcessedDt;
	public WebElement getProcessedDt() {
		w2.until(ExpectedConditions.elementToBeClickable(ProcessedDt));
		return ProcessedDt;
	}
	
	@FindBy(xpath="//a[text()='Purchase']")
	private static WebElement FinPurApprovals;
	public void getFinPurApprovals() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurApprovals));
		 FinPurApprovals.click();
	}
	
	@FindBy(xpath="//a[text()='Service Advance']")
	private static WebElement FinPurServAdv;
	public void getFinPurServAdv() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurServAdv));
		FinPurServAdv.click();
	}
	@FindBy(css = "input#txtCertifyingCompPO")
	private static WebElement FinCertCompany;
	public WebElement getFinCertCompany() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertCompany));
		return FinCertCompany;
	}
	
	@FindBy(css = "input#txtCertificateNo")
	private static WebElement EnterFinServAdvNo;
	public WebElement getEnterFinServAdvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterFinServAdvNo));
		return EnterFinServAdvNo;
	}
	@FindBy(css = "input#btnFilterGO")
	private static WebElement FinAdvNoGo;
	public void getFinAdvNoGo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinAdvNoGo));
		FinAdvNoGo.click();
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//a")
	private static WebElement FinAdvNoclick;
	public void getFinAdvNoclick() {
		w2.until(ExpectedConditions.elementToBeClickable(FinAdvNoclick));
		FinAdvNoclick.click();
	}
	@FindBy(xpath = "//table[@id='tblBankPaymentsLinks']//tr[3]//a[2]")
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
	@FindBy(css = "input#txtFavouring")
	private static WebElement FinFavouringName;
	public WebElement getFinFavouringName() {
		w2.until(ExpectedConditions.elementToBeClickable(FinFavouringName));
	return	FinFavouringName;
	}
	
	@FindBy(css = "input#btnSubmit")
	private static WebElement PaymentSubmit;
	public void getPaymentSubmit() {
		w2.until(ExpectedConditions.elementToBeClickable(PaymentSubmit));
		PaymentSubmit.click();
	}
	@FindBy(css = "span#lblStatus")
	private static WebElement paymentstatus;
	public String getpaymentstatus() {
		w2.until(ExpectedConditions.elementToBeClickable(paymentstatus));
	return	paymentstatus.getText();
	}
	
	
	
	
	public void MenuSubMenuServiceAdvance()throws Throwable{
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
	String Service_Advance_No;
	public void ServiceAdvanceCreation() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		
		int count=0;
		int updatecount=0;
		for(i=1;i<=sheet.getLastRowNum();i++) {
		try {
		MenuSubMenuServiceAdvance();
		getServAdvlink();
		Frames.rightFrame();
		getCreateServAdvbutton();
		appInd.singleDropDown(getServAdvCompDD() ,(sheet.getRow(i).getCell(0).getStringCellValue()));
		Thread.sleep(1000);
		getServAdvProjDD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getServAdvProjDD(), getServAdvEnterProj(), sheet.getRow(i).getCell(1).getStringCellValue(), getServAdvEnterListofProj());
		String PatentPO=appInd.switchToChildWindow(ServAdvSelectPOLink);
		getServAdvPODD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getServAdvPODD(), getServAdvEnterPO(), sheet.getRow(i).getCell(3).getStringCellValue(), getServAdvListofPO());
		getServAdvSearchPO();
		getServAdvSelectPORadio();
		getServAdvAcceptSelectdPO();
		appInd.switchToParentWindow(PatentPO);
		Frames.rightFrame();
		String PatentServProvider=appInd.switchToChildWindow(ServAdvSelectServProviderLink);
		getServAdvEnterSerProvider().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getServAdvSerProviderGo();
		getServAdvSelectSerProvider();
		appInd.switchToParentWindow(PatentServProvider);
		Frames.rightFrame();
		Thread.sleep(1000);
		getServAdvInvNo().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
		getServAdvInvAmount().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		appInd.seletDate(getServAdvInvDate(), appInd.getDateAsSpecified(0));
		getServAdvCertAmt().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		appInd.singleDropDown(getServAdvPayMode(), sheet.getRow(i).getCell(7).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getServAdvPayDueDate(), appInd.getDateAsSpecified(-30));
		Thread.sleep(1000);
	
		getServAdvTaxAddRow();
		Thread.sleep(1000);
		appInd.singleDropDown(getServAdvAddTaxCat(), sheet.getRow(1).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getServAdvAddTaxPer(), sheet.getRow(1).getCell(10).getStringCellValue());	
		Thread.sleep(1000);
		getServAdvTaxAddRow();
		Thread.sleep(2000);
		appInd.singleDropDown(getServAdvAddTaxCat2(), sheet.getRow(2).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getServAdvAddTaxPer2(), sheet.getRow(2).getCell(10).getStringCellValue());
		Thread.sleep(1000);
		
		getServAdvTaxDedRow();
		Thread.sleep(1000);
		appInd.singleDropDown(getServAdvDedTaxCat(), sheet.getRow(i).getCell(11).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getServAdvDedTaxPer(), sheet.getRow(i).getCell(12).getStringCellValue());
		Thread.sleep(1000);
		
		getServAdvCreateRemarks().sendKeys("Service Provider Certificate Created Through Automation");
		Thread.sleep(2000);
		getCreateServAdvbutton();
		Thread.sleep(1000);
		Service_Advance_No=getServAdvNumber();
		if(appInd.AlertPresent())
		{
			Datatable.writeExcel("Service Advance", "is Not Created", sheetname, Purchase.OutputCreatePath);
			
		}else {
			Datatable.writeExcel(Service_Advance_No, "Supplier Advance is  Created", sheetname, Purchase.OutputCreatePath);
			System.out.println(Service_Advance_No+">>> Service Advance Created");
			count++;
			}
		}catch (Exception e) {
			Datatable.writeExcel("Service Advance", "is Not Created Exception", sheetname, Purchase.OutputCreatePath);
			}
		try {
		Thread.sleep(1000);
		getServAdvModify();
		Thread.sleep(1000);
		switch (i) {
		case 1:
//			getServAdvCertAmt().clear();
//			Thread.sleep(1000);
//			getServAdvCertAmt().sendKeys(sheet.getRow(1).getCell(15).getStringCellValue());
			getServAdvCreateRemarks().clear();
			Thread.sleep(1000);
			getServAdvCreateRemarks().sendKeys("Service Provider Advance Modified & Updated Through Automation");
			break;
		case 2:
			getServAdvFavouring().sendKeys("APL Services");
			appInd.singleDropDown(getServAdvPayMode(), sheet.getRow(3).getCell(15).getStringCellValue());
			getServAdvCreateRemarks().clear();
			Thread.sleep(1000);
			getServAdvCreateRemarks().sendKeys("Service Provider Advance Modified & Updated Through Automation");
			break;
		case 3:
			appInd.seletDate(getServAdvPayDueDate(), appInd.getDateAsSpecified(-40));
			getServAdvInvAmount().clear();
			Thread.sleep(1000);
			getServAdvInvAmount().sendKeys(sheet.getRow(2).getCell(15).getStringCellValue());
			getServAdvCreateRemarks().clear();
			Thread.sleep(1000);
			getServAdvCreateRemarks().sendKeys("Service Provider Advance Modified & Updated THrough Automation");
			break;	
		default:
			break;
		}
		
		Thread.sleep(2000);
		getServAdvUpdate();
		Thread.sleep(1000);
		if(appInd.AlertPresent())
		{
			Datatable.writeExcel("Service Advance", "is Not Updated", sheetname, Purchase.OutputCreatePath);
			
		}else {
			Datatable.writeExcel(Service_Advance_No, "Supplier Advance is  Updated", sheetname, Purchase.OutputCreatePath);
			System.out.println(Service_Advance_No+">>> Service Advance Updated");
			updatecount++;
		}
	}catch (Exception e) {
		Datatable.writeExcel("Service Advance", "is Not Updated Exception", sheetname, Purchase.OutputCreatePath);
		}
	getServAdvChangeStatus();
	Thread.sleep(1000);
	getServAdvStatusDD().sendKeys("Approved");
	Thread.sleep(1000);
	getServAdvUpdateStatus();
	Thread.sleep(1000);
	getServAdvChangeStatus();
	Thread.sleep(1000);
	getServAdvStatusDD().sendKeys("Processed");
	Thread.sleep(1000);
	appInd.seletDate(getProcessedDt(), appInd.getDateAsSpecified(0));
	Thread.sleep(1000);
	getServAdvUpdateStatus();
	if(appInd.AlertPresent()) {
		appInd.isAlertPresent();
	}else{	
		Thread.sleep(1000);
	}
	ServiceAdvancePayment();
		}
		
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		if(updatecount==sheet.getLastRowNum()) {
			Datatable.writeExcel("Service Advance Updation", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Service Advance Updation", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
	
	
}
	
					public void ServiceAdvancePayment() throws Throwable{
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
						getFinPurServAdv();
						Thread.sleep(1000);
						Frames.innerFrame();
						WebElement searchcompny=servAdvancecreate.getFinCertCompany();
						searchcompny.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
						Thread.sleep(2000);
						searchcompny.sendKeys(Keys.ARROW_DOWN);
						Thread.sleep(1000);
						searchcompny.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						getEnterFinServAdvNo().sendKeys(Service_Advance_No);
						Thread.sleep(1000);
						getFinAdvNoGo();
						Thread.sleep(1000);
						getFinAdvNoclick();
						try {
						Frames.innerFrame();
						String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
						Thread.sleep(2000);
						appInd.singleDropDown(getBankAccountDD(),sheet.getRow(1).getCell(8).getStringCellValue());
						//appInd.singleDropDown(getBankAccountDD(),sheet.getRow(i).getCell(8).getStringCellValue());
						Thread.sleep(1000);
						appInd.isAlertPresent();
						Thread.sleep(1000);
						getFinFavouringName().sendKeys("Automation Payee");
						getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
						Thread.sleep(1000);
						getPaymentSubmit();
						Thread.sleep(2000);
						appInd.switchToParentWindow(Parent_Payment);
						Frames.innerFrame();
						Thread.sleep(3000);
						System.out.println("STATUS----"+getpaymentstatus());
						if(getpaymentstatus().equals("Paid")) {
							Datatable.writeExcel(Service_Advance_No, "Advance is Paid", sheetname, Purchase.OutputCreatePath);
							System.out.println("PAYMENT STATUS ---"+Service_Advance_No+" "+ getpaymentstatus());
						}else {
							Datatable.writeExcel(Service_Advance_No, "Advance is Not Paid", sheetname, Purchase.OutputCreatePath);
							System.out.println("PAYMENT STATUS ---"+Service_Advance_No+" "+ getpaymentstatus());
						}
						}catch (Exception e) {
							Datatable.writeExcel(Service_Advance_No, "Advance is Not Paid-Exception", sheetname, Purchase.OutputCreatePath);
							System.out.println("Advance is Not Paid-Exception---------"+e);
							System.out.println("PAYMENT STATUS ---"+Service_Advance_No+" "+ getpaymentstatus());
						}
					}
						
				}
					


