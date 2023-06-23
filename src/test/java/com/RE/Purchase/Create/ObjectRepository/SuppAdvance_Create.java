package com.RE.Purchase.Create.ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Purchase.Create.Test.SuppAdvance_Create_Test;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Purchase;
import com.codeborne.selenide.commands.GetAttribute;
import com.github.dockerjava.api.model.Driver;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;
import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class SuppAdvance_Create extends SuppAdvance_Create_Test{
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static XSSFSheet sheet;
	
	public SuppAdvance_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Supplier Advances']")
	private WebElement SuppAdvlink;
	public void getSuppAdvlink() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppAdvlink));
		SuppAdvlink.click();
	}
	
	@FindBy(id = "btnCreate")
	private WebElement CreateSuppAdvButton;
	public void getCreateSuppAdvButton() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateSuppAdvButton));
		CreateSuppAdvButton.click();
	}
	
	@FindBy(css = "select#ddlCertifyingCompany")
	private WebElement AdvCompanyDD;
	public WebElement getAdvCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvCompanyDD));
	return	AdvCompanyDD;
	}
	
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//button")
	private WebElement AdvprojectDD;
	public WebElement getAdvprojectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvprojectDD));
	return	AdvprojectDD;
	}
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//button")
	private WebElement AdvprojectDDClick;
	public void getAdvprojectDDClick() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvprojectDDClick));
		AdvprojectDD.click();
	}
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//input[@placeholder='Search']")
	private WebElement AdvEnterProjDD;
	public WebElement getAdvEnterProjDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvEnterProjDD));
	return	AdvEnterProjDD;
	}
	@FindBy(xpath = "//tr[@id='trProject']//td[2]//li")
	private List<WebElement> AdvListofProj;
	public List<WebElement> getAdvListofProj() {
		return	AdvListofProj;
	}
	
	
	
	@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//button")
	private WebElement AdvSubprojectDD;
	public WebElement getAdvSubprojectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvSubprojectDD));
	return	AdvSubprojectDD;
	}
	
	@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//input[@placeholder='Search']")
	private WebElement AdvEnterSubProjDD;
	public WebElement getAdvEnterSubProjDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvEnterSubProjDD));
	return	AdvEnterSubProjDD;
	}
	@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//li")
	private List<WebElement> AdvListofSubProj;
	public List<WebElement> getAdvListofSubProj() {
		return	AdvListofSubProj;
	}
	
	@FindBy(id = "ddlPayingCompanyProvider")
	private WebElement AdvPayCompDD;
	public WebElement getAdvPayCompDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvPayCompDD));
	return	AdvPayCompDD;
	}
	
	@FindBy(xpath = "//a[text()='Select']")
	private WebElement SelectPOlink;
	public WebElement getSelectPOlink() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectPOlink));
	return	SelectPOlink;
	}

	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
	private WebElement PO_NumDD;
	public WebElement getPO_NumDD() {
		w2.until(ExpectedConditions.elementToBeClickable(PO_NumDD));
	return	PO_NumDD;
	}
	//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
	private WebElement EnterAdvPO;
	public WebElement getEnterAdvPO() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterAdvPO));
	return	EnterAdvPO;
	}
	
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
	private List<WebElement> EnterAdvListOfPO;
	public List<WebElement> getEnterAdvListOfPO() {
	return	EnterAdvListOfPO;
	}
	
	@FindBy(id = "btnSearch")
	private WebElement SearchAdvPO;
	public void getSearchAdvPO() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchAdvPO));
		SearchAdvPO.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//input[@type='radio']")
	private WebElement AdvPORadio;
	public void getAdvPORadio() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvPORadio));
		AdvPORadio.click();
	}
	
	@FindBy(css = "a#btnAcceptSelected")
	private WebElement AdvPOAcceptSelected;
	public void getAdvPOAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvPOAcceptSelected));
		AdvPOAcceptSelected.click();
	}
	@FindBy(css = "input#chkTaximpact")
	private WebElement AdvTaxImpact;
	public void getAdvTaxImpact() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvTaxImpact));
		AdvTaxImpact.click();
	}
	@FindBy(css = "input#txtInvoiceNumber")
	private WebElement AdvInvoiceNo;
	public WebElement getAdvInvoiceNo() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceNo));
		return AdvInvoiceNo;
	}
	@FindBy(css = "input#txtInvoiceAmt")
	private WebElement AdvInvoiceAmt;
	public WebElement getAdvInvoiceAmt() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceAmt));
		return AdvInvoiceAmt;
	}
	@FindBy(css = "input#invoicedt_txtDatePicker")
	private WebElement AdvInvoiceDate;
	public WebElement getAdvInvoiceDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceDate));
		return AdvInvoiceDate;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//input[@type='text']")
	private WebElement AdvPOQty;
	public WebElement getAdvPOQty() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvPOQty));
		return AdvPOQty;
	}
	@FindBy(xpath = "//a[text()='Add Rate/Tax']")
	private WebElement Adv_AddRateTax;
	public void getAdv_AddRateTax() {
		w2.until(ExpectedConditions.elementToBeClickable(Adv_AddRateTax));
		 Adv_AddRateTax.click();
	}
	@FindBy(css = "input#txtUnitRate")
	private WebElement Adv_Rate;
	public WebElement getAdv_Rate() {
		w2.until(ExpectedConditions.elementToBeClickable(Adv_Rate));
		return Adv_Rate;
	}
	@FindBy(css = "input#txtUnitRate")
	private List<WebElement> AdvCharges;
	public List<WebElement> getAdvCharges(){
		return AdvCharges;
	}
	@FindBy(css = "a#lnkbtnAddTaxRow")
	private WebElement AdvDedTax;
	public void getAdvDedTax(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTax));
		AdvDedTax.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//div//select")
	private WebElement AdvDedTaxCategory;
	public WebElement getAdvDedTaxCategory(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxCategory));
	return	AdvDedTaxCategory;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//div//select")
	private WebElement AdvDedTaxPer;
	public WebElement getAdvDedTaxPer(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxPer));
	return	AdvDedTaxPer;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[5]//div//input")
	private WebElement AdvDedTaxableAmt;
	public WebElement getAdvDedTaxableAmt(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxableAmt));
	return	AdvDedTaxableAmt;
	}
	@FindBy(css = "a#lnkbtnAddTaxRow")
	private WebElement AdvDedTax2;
	public void getAdvDedTax2(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTax2));
		AdvDedTax2.click();
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//div//select")
	private WebElement AdvDedTaxCategory2;
	public WebElement getAdvDedTaxCategory2(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxCategory2));
	return	AdvDedTaxCategory2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//div//select")
	private WebElement AdvDedTaxPer2;
	public WebElement getAdvDedTaxPer2(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxPer2));
	return	AdvDedTaxPer2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[5]//div//input")
	private WebElement AdvDedTaxableAmt2;
	public WebElement getAdvDedTaxableAmt2(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxableAmt2));
	return	AdvDedTaxableAmt2;
	}
	@FindBy(css = "input#btnCreate")
	private WebElement AdvCreate;
	public void getAdvCreate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvCreate));
		AdvCreate.click();
	}
	
	@FindBy(css = "input#btnCalculate")
	private WebElement AdvCalRate;
	public void getAdvCalRate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvCalRate));
		AdvCalRate.click();
	}
	@FindBy(css = "input#btnSave")
	private WebElement AdvSaveRate;
	public void getAdvSaveRate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvSaveRate));
		AdvSaveRate.click();
	}
	
	@FindBy(css = "select#ddlModeOfPayment")
	private WebElement AdvModeofPay;
	public WebElement getAdvModeofPay(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvModeofPay));
		return AdvModeofPay;
	}
	@FindBy(css = "input#dtPaymentDueDate_txtDatePicker")
	private WebElement AdvPayDueDate;
	public WebElement getAdvPayDueDate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvPayDueDate));
		return AdvPayDueDate;
	}
	@FindBy(id = "txtFavouring")
	private WebElement AdvFavouring;
	public WebElement getAdvFavouring(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvFavouring));
		return AdvFavouring;
	}
	
	@FindBy(css = "textarea#txtRemarks")
	private WebElement AdvRemarks;
	public WebElement getAdvRemarks(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvRemarks));
		return AdvRemarks;
	}
	
	
	@FindBy(id = "lblAdvanceNoView")
	private WebElement Advnumber;
	public String getAdvnumber(){
		w2.until(ExpectedConditions.elementToBeClickable(Advnumber));
		 return Advnumber.getText();
	}
	
	@FindBy(css = "input#btnModify")
	private WebElement AdvModify;
	public void getAdvModify(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvModify));
		AdvModify.click();
	}
	@FindBy(css = "input#btnUpdate")
	private WebElement AdvUpdate;
	public void getAdvUpdate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvUpdate));
		AdvUpdate.click();
	}
	@FindBy(id = "lnkBtnChangeStatus")
	private WebElement AdvChangestatus;
	public void getAdvChangestatus(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvChangestatus));
		AdvChangestatus.click();
	}
	@FindBy(css = "select#ddlNextStatus")
	private WebElement AdvStatusDD;
	public WebElement getAdvStatusDD(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvStatusDD));
		return AdvStatusDD;
	}
	@FindBy(css = "a#lnkBtnUpdateStatus")
	private WebElement AdvUpdateStatus;
	public void getAdvUpdateStatus(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvUpdateStatus));
		AdvUpdateStatus.click();
	}
	
	@FindBy(css = "input#dtExpectedDate_txtDatePicker")
	private WebElement AdvExpectedDate;
	public WebElement getAdvExpectedDate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvExpectedDate));
		return AdvExpectedDate;
	}
	
	@FindBy(css = "input#dtProcessedDate_txtDatePicker")
	private WebElement AdvprocessDate;
	public WebElement getAdvprocessDate(){
		w2.until(ExpectedConditions.elementToBeClickable(AdvprocessDate));
		return AdvprocessDate;
	}
	@FindBy(xpath="//a[text()='Purchase']")
	private static WebElement FinPurApprovals;
	public void getFinPurApprovals() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurApprovals));
		 FinPurApprovals.click();
	}
	@FindBy(xpath="//a[text()='Supplier Adv.']")
	private static WebElement FinPurAdv;
	public void getFinPurAdv() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurAdv));
		FinPurAdv.click();
	}
	@FindBy(css = "input#txtCertifyingCompPO")
	private static WebElement FinCertCompany;
	public WebElement getFinCertCompany() {
		w2.until(ExpectedConditions.elementToBeClickable(FinCertCompany));
		return FinCertCompany;
	}
	@FindBy(css = "input#txtStatus")
	private static WebElement FinPurAdvstatus;
	public WebElement getFinPurAdvstatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FinPurAdvstatus));
		return FinPurAdvstatus;
	}
	
	@FindBy(id = "txtAdvanceNo")
	private static WebElement FinAdvNo;
	public WebElement getFinAdvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinAdvNo));
		return FinAdvNo;
	}
	
	@FindBy(id = "btnGo")
	private static WebElement FinAdvGo;
	public void getFinAdvGo() {
		w2.until(ExpectedConditions.elementToBeClickable(FinAdvGo));
		FinAdvGo.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table mt-10']//tr[2]//a")
	private static WebElement AdvNo;
	public void getAdvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(AdvNo));
		AdvNo.click();
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
	@FindBy(id = "lblStatus")
	private static WebElement paymentstatus;
	public String getpaymentstatus() {
		w2.until(ExpectedConditions.elementToBeClickable(paymentstatus));
	return	paymentstatus.getText();
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
	int	i;
	String Supplier_Advance_No="";
	public void CreateSuppAdvanace() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int	updatecount=0;
		for(i=1;i<=sheet.getLastRowNum();i++) {
	try {
		MenuSubMenu();
		getSuppAdvlink();
		Frames.rightFrame();
		getCreateSuppAdvButton();
		appInd.singleDropDown(getAdvCompanyDD(), sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		Multiproject();
		MultiSubProject();
		//multiDDspecific(getAdvprojectDD(),  getAdvEnterProjDD(),  sheet.getRow(i).getCell(1).getStringCellValue(),getAdvListofProj());
		Thread.sleep(1000);
		//multiDDspecific(getAdvSubprojectDD(),  getAdvEnterSubProjDD(),  sheet.getRow(i).getCell(3).getStringCellValue(),getAdvListofSubProj());
		String parentPOSelect=appInd.switchToChildWindow(SelectPOlink);
		MultiPOSelect();
		//multiDDspecific(getPO_NumDD(),  getEnterAdvPO(),  sheet.getRow(i).getCell(4).getStringCellValue(),getEnterAdvListOfPO());
		Thread.sleep(2000);
		getSearchAdvPO();
		getAdvPORadio();
		Thread.sleep(2000);
		getAdvPOAcceptSelected();
		appInd.switchToParentWindow(parentPOSelect);
		Frames.rightFrame();
		getAdvInvoiceNo().sendKeys("ADVIN"+appInd.RandomNumbers(4));
		getAdvInvoiceAmt().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());;
		appInd.seletDate(getAdvInvoiceDate(), appInd.getDateAsSpecified(0));
		getAdvTaxImpact();
		getAdvPOQty().clear();
		appInd.isAlertPresent();
		Thread.sleep(2000);
		getAdvPOQty().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		String parentRateTax=appInd.switchToChildWindow(Adv_AddRateTax);
		getAdv_Rate().clear();
		appInd.isAlertPresent();
		getAdv_Rate().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getAdvCalRate();
		getAdvSaveRate();
		appInd.switchToParentWindow(parentRateTax);
		Frames.rightFrame();
		appInd.singleDropDown(getAdvModeofPay(), sheet.getRow(i).getCell(9).getStringCellValue());
		getAdvFavouring().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		getAdvPayDueDate().sendKeys(appInd.getBackDatedDate(-30));
		getAdvRemarks().sendKeys("Supplier Advance Created Through Automation");
		getAdvDedTax();
		appInd.singleDropDown(getAdvDedTaxCategory(), sheet.getRow(i).getCell(11).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getAdvDedTaxPer(), sheet.getRow(i).getCell(12).getStringCellValue());
		Thread.sleep(2000);
		//getAdvDedTaxableAmt().sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		getAdvDedTax2();
		appInd.singleDropDown(getAdvDedTaxCategory2(),sheet.getRow(i).getCell(13).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getAdvDedTaxPer2(),sheet.getRow(i).getCell(14).getStringCellValue());
		//getAdvDedTaxableAmt2().sendKeys(sheet.getRow(0).getCell(14).getStringCellValue());
		Thread.sleep(2000);
		getAdvCreate();
		Thread.sleep(2000);
		Supplier_Advance_No=getAdvnumber();
		if(appInd.AlertPresent())
		{
			Datatable.writeExcel("Supplier Advance", "is Not Created", sheetname, Purchase.OutputCreatePath);
			
		}else {
			Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is  Created", sheetname, Purchase.OutputCreatePath);
			System.out.println("Supplier Advance Number(Created) ----------"+Supplier_Advance_No);
			count++;
		}
	}catch (Exception e) {
		Datatable.writeExcel("Supplier Advance", "is Not Created-Exception", sheetname, Purchase.OutputCreatePath);
		}
	
	try {
		getAdvModify();
		Thread.sleep(1000);
		switch (i) {
		case 1:	getAdvPOQty().clear();
				Thread.sleep(1000);
				getAdvPOQty().sendKeys(sheet.getRow(0).getCell(19).getStringCellValue());
				Thread.sleep(1000);
				String parentRateTax1=appInd.switchToChildWindow(Adv_AddRateTax);
				Thread.sleep(1000);
				getAdvCalRate();
				getAdvSaveRate();
				appInd.switchToParentWindow(parentRateTax1);
				Frames.rightFrame();
		
			break;
		case 2: getAdvPOQty().clear();
				Thread.sleep(2000);
				getAdvPOQty().sendKeys(sheet.getRow(1).getCell(19).getStringCellValue());
				Thread.sleep(2000);
				String parentRateTax2=appInd.switchToChildWindow(Adv_AddRateTax);
				getAdv_Rate().clear();
				appInd.isAlertPresent();
				getAdv_Rate().sendKeys(sheet.getRow(2).getCell(19).getStringCellValue());
				Thread.sleep(1000);
				getAdvCalRate();
				Thread.sleep(1000);
				getAdvSaveRate();
				appInd.switchToParentWindow(parentRateTax2);
				Frames.rightFrame();
			
			break;
		case 3:
//		try {
//			getAdvDedTaxableAmt().clear();
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			System.out.println("Taxable Amount Exception---------"+e);
//		}
//				
//				getAdvDedTaxableAmt().sendKeys(sheet.getRow(3).getCell(19).getStringCellValue());
//				Thread.sleep(1000);
//				appInd.isAlertPresent();
//		
//		getAdvDedTaxableAmt().click();
//		WebElement TaaxableAmtfiled=iDriver.findElement(By.xpath("//table[@class='in4-table']//tr[2]//td[5]//div//input"));
//		String typevalue=TaaxableAmtfiled.getAttribute("value");
//		System.out.println("Value of type attribute: "+typevalue);
//		
//		Robot robo=new Robot();
//		for(int j=1;j<=typevalue.length();j++) {
//		robo.keyPress(KeyEvent.VK_DELETE);
//		robo.keyRelease(KeyEvent.KEY_RELEASED);
//		j++;		
//			}
//		
//		getAdvDedTaxableAmt().sendKeys(sheet.getRow(3).getCell(19).getStringCellValue());
//		Thread.sleep(2000);
//				getAdvDedTaxableAmt2().clear();
//				Thread.sleep(1000);
//				getAdvDedTaxableAmt2().sendKeys(sheet.getRow(3).getCell(19).getStringCellValue());
//				appInd.isAlertPresent();
			break;

		default:
			break;
		}
		Thread.sleep(3000);
		getAdvUpdate();
	if(appInd.AlertPresent())
	{
		Datatable.writeExcel("Supplier Advance", "is Not Updated", sheetname, Purchase.OutputCreatePath);
		
	}else {
		Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is  Updated", sheetname, Purchase.OutputCreatePath);
		System.out.println("Supplier Advance Number(Updated) ----------"+Supplier_Advance_No);
		updatecount++;
	}
		
	}catch (Exception e) {
		Datatable.writeExcel("Supplier Advance", "is Not Updated-Exception", sheetname, Purchase.OutputCreatePath);
	}
		getAdvChangestatus();
		getAdvStatusDD().sendKeys("Approved");
		getAdvUpdateStatus();
		getAdvChangestatus();
		getAdvStatusDD().sendKeys("Processed");
		appInd.seletDate(getAdvExpectedDate(), appInd.getDateAsSpecified(-30));
		Thread.sleep(2000);
		appInd.seletDate(getAdvprocessDate(), appInd.getDateAsSpecified(0));
		Thread.sleep(2000);
		getAdvUpdateStatus();
		Thread.sleep(1000);
		
	}
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Purchase.OutputCreatePath);
		}

		if(updatecount==sheet.getLastRowNum()) {
			Datatable.writeExcel("Supplier Advance Edit & Upudate", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Supplier Advance Edit & Upudate", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		AdvPayment(); //Supplier Payment Process From Finance Module
		
	}
	
	
	
	
	
	
	
	
	
	
	public void Multiproject() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", getAdvprojectDD());
		}catch(Exception e) {
			System.out.println(e);
		}
		w2.until(ExpectedConditions.elementToBeClickable(getAdvEnterProjDD()));
		getAdvEnterProjDD().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		for (WebElement e : getAdvListofProj()) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		try {
		js.executeScript("arguments[0].click();", getAdvEnterProjDD());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			js.executeScript("arguments[0].click();", getAdvSubprojectDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
	}
	
	public void MultiSubProject() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", getAdvSubprojectDD());
		}catch(Exception e) {
			System.out.println(e);
		}
		w2.until(ExpectedConditions.elementToBeClickable(getAdvEnterSubProjDD()));
		getAdvEnterSubProjDD().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		for (WebElement e : getAdvListofSubProj()) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		try {
		js.executeScript("arguments[0].click();", getAdvEnterSubProjDD());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			js.executeScript("arguments[0].click();", getAdvSubprojectDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
	}
	public void MultiPOSelect() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", getPO_NumDD());
		}catch(Exception e) {
			System.out.println("PO Select Exception -----"+e);
		}
		w2.until(ExpectedConditions.elementToBeClickable(getEnterAdvPO()));
		getEnterAdvPO().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		for (WebElement e : getEnterAdvListOfPO()) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		try {
		js.executeScript("arguments[0].click();", getEnterAdvPO());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			js.executeScript("arguments[0].click();", getPO_NumDD());
			}catch(Exception e) {
				System.out.println(e);
			}
			appInd.clickOutside();
	}
	public void multiDDspecific(WebElement projectClick, WebElement entrProjectName, String projectname,List<WebElement> ListedRecordsDD) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) oBrowser;
		try {
		js.executeScript("arguments[0].click();", projectClick);
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
		w2.until(ExpectedConditions.elementToBeClickable(entrProjectName));
		entrProjectName.sendKeys(projectname);
		for (WebElement e : ListedRecordsDD) {
			if (e.getText().contains("Select")) {
				Thread.sleep(2000);
				e.click();
				break;
			}
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
		js.executeScript("arguments[0].click();", projectClick);
		}catch(Exception e) {
			System.out.println(e);
		}
		appInd.clickOutside();
	}
	
	public void AdvPayment() throws Throwable{
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
		getFinPurAdv();
		try {
		Frames.innerFrame();
		WebElement searchcompny=Createsuppadvance.getFinCertCompany();
		searchcompny.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		searchcompny.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchcompny.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	//	getFinPurAdvstatusDD().clear();
		getFinAdvNo().sendKeys(Supplier_Advance_No);
		Thread.sleep(1000);
		getFinAdvGo();
		Thread.sleep(100);
		getAdvNo();
		Frames.innerFrame();
		String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
		Thread.sleep(1000);
		appInd.singleDropDown(getBankAccountDD(),sheet.getRow(1).getCell(15).getStringCellValue());
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
		if(getpaymentstatus().equals("Paid")) {
			Datatable.writeExcel(Supplier_Advance_No, "Advance is Paid", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
		}else {
			Datatable.writeExcel(Supplier_Advance_No, "Advance is Not Paid", sheetname, Purchase.OutputCreatePath);
			System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
		}
		}catch (Exception e) {
			Datatable.writeExcel(Supplier_Advance_No, "Advance is Not Paid-Exception", sheetname, Purchase.OutputCreatePath);
			System.out.println("Advance is Not Paid-Exception---------"+e);
			System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
	}
	}
}
