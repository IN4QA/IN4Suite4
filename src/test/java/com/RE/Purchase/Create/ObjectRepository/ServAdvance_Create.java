package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.ServAdvance_Create_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class ServAdvance_Create extends ServAdvance_Create_Test{
	
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static XSSFSheet sheet;
	
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
	public WebElement getServAdvTaxAddRow() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvTaxAddRow));
		return ServAdvTaxAddRow;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement ServAdvAddTaxCat;
	public WebElement getServAdvAddTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxCat));
		return ServAdvAddTaxCat;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement ServAdvAddTaxPer;
	public WebElement getServAdvAddTaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxPer));
		return ServAdvAddTaxPer;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[4]//select")
	private WebElement ServAdvAddTaxType;
	public WebElement getServAdvAddTaxType() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxType));
		return ServAdvAddTaxType;
	}
	@FindBy(css = "a#lnkbtnAddTaxRow")
	private WebElement ServAdvTaxDedRow;
	public WebElement getServAdvTaxDedRow() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvTaxDedRow));
		return ServAdvTaxDedRow;
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
	public WebElement getServAdvModify() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvModify));
		return ServAdvModify;
	}
	@FindBy(css = "input#btnUpdate")
	private WebElement ServAdvUpdate;
	public WebElement getServAdvUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvUpdate));
		return ServAdvUpdate;
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
	public void getServAdvStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServAdvStatusDD));
		ServAdvStatusDD.click();
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
	
	public void ServiceAdvanceCreation() throws Throwable{
		Frames.SubMenuFrame();
		getServAdvlink();
		Frames.rightFrame();
		getCreateServAdvbutton();
		appInd.singleDropDown(getServAdvCompDD() ,(sheet.getRow(1).getCell(0).getStringCellValue()));
		getServAdvProjDD().click();
		Thread.sleep(1000);
		
		appInd.createMultiDD_withText(getServAdvProjDD(), getServAdvEnterProj(), sheet.getRow(1).getCell(1).getStringCellValue(), getServAdvEnterListofProj());
		String PatentPO=appInd.switchToChildWindow(ServAdvSelectPOLink);
		appInd.createMultiDD_withText(getServAdvPODD(), getServAdvEnterPO(), sheet.getRow(1).getCell(3).getStringCellValue(), getServAdvListofPO());
		getServAdvSearchPO();
		getServAdvSelectPORadio();
		getServAdvAcceptSelectdPO();
		appInd.switchToParentWindow(PatentPO);
		String PatentServProvider=appInd.switchToChildWindow(ServAdvSelectServProviderLink);
		getServAdvEnterSerProvider();
		getServAdvSerProviderGo();
		getServAdvSelectSerProvider();
		appInd.switchToParentWindow(PatentServProvider);
		getServAdvInvNo().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
		getServAdvInvAmount().sendKeys(sheet.getRow(1).getCell(5).getStringCellValue());
		appInd.seletDate(getServAdvInvDate(), appInd.getDateAsSpecified(0));
		getServAdvCertAmt().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
		appInd.singleDropDown(getServAdvPayMode(), sheet.getRow(1).getCell(7).getStringCellValue());
		
		
	}
}
