package com.RE.Sales.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Sales.Create.Test.CustomerCreditNote_Create_Test;
import com.RE.Submodules.Sales;
import Utilities.AppIndependentMethods;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class CustomerCreditNote_Create extends CustomerCreditNote_Create_Test{
	public static WebDriver iDriver;
	public static Datatable xml;
	public static String sheetname;
	public static XSSFSheet sheet;
	int i =1;
	
	public CustomerCreditNote_Create(WebDriver OBrowser) {
		iDriver=OBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Customer Credit Note']")
	private WebElement CustomerCreditNoteLink;
	public void getCustomerCreditNoteLink() {
		w2.until(ExpectedConditions.elementToBeClickable(CustomerCreditNoteLink));
		CustomerCreditNoteLink.click();
	}
	@FindBy(id = "btnCreateCreditNote")
	private WebElement CreateCustomerCreditNote;
	public void getCreateCustomerCreditNote() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateCustomerCreditNote));
		CreateCustomerCreditNote.click();
	}
	@FindBy(id = "lbtnCustName")
	private WebElement SelectCutomerNameLink;
	public void getSelectCutomerNameLink() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectCutomerNameLink));
		 SelectCutomerNameLink.click();;
	}
	@FindBy(id = "txtCustomerLeadName")
	private WebElement EnetrCutomerName;
	public WebElement getEnetrCutomerName() {
		w2.until(ExpectedConditions.elementToBeClickable(EnetrCutomerName));
		return EnetrCutomerName;
	}
	@FindBy(id = "btnSearch")
	private WebElement CutomerNameGo;
	public void getCutomerNameGo() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerNameGo));
		 CutomerNameGo.click();
	}
	@FindBy(xpath = "//div[@id='pnlList']//tr[2]//td[1]//input")
	private WebElement SelectCutomerRadio;
	public void getSelectCutomerRadio() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectCutomerRadio));
		 SelectCutomerRadio.click();
	}
	@FindBy(id = "lnkAcceptSelected")
	private WebElement SelectCutomerAcceptSelected;
	public void getSelectCutomerAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectCutomerAcceptSelected));
		SelectCutomerAcceptSelected.click();
	}
	@FindBy(css = "select#ddlSourceList")
	private WebElement SourceDD;
	public WebElement getSourceDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SourceDD));
		return SourceDD;
	}
	@FindBy(css = "input#txtUnitNo")
	private WebElement SearchForUnit;
	public WebElement getSearchForUnit() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchForUnit));
		return SearchForUnit;
	}
	@FindBy(css = "select#ddlReasonList")
	private WebElement ReasonDD;
	public WebElement getReasonDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ReasonDD));
		return ReasonDD;
	}
	@FindBy(css = "input#dpCreditNoteDate_txtDate")
	private WebElement CreditNoteDate;
	public WebElement getCreditNoteDate() {
		w2.until(ExpectedConditions.elementToBeClickable(CreditNoteDate));
		return CreditNoteDate;
	}
	@FindBy(css = "select#ddlProjectlst")
	private WebElement ProjectDD;
	public WebElement getProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ProjectDD));
		return ProjectDD;
	}
	@FindBy(css = "select#ddlSubprojectlst")
	private WebElement SubProjectDD;
	public WebElement getSubProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SubProjectDD));
		return SubProjectDD;
	}
	@FindBy(css = "select#ddlUnitNo")
	private WebElement UnitDD;
	public WebElement getUnitDD() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitDD));
		return UnitDD;
	}
	@FindBy(css = "select#ddlInvoiceNo")
	private WebElement InvoiceDD;
	public WebElement getInvoiceDD() {
		w2.until(ExpectedConditions.elementToBeClickable(InvoiceDD));
		return InvoiceDD;
	}
	@FindBy(css = "input#txtAmount")
	private WebElement CutomerCreditNoteAmount;
	public WebElement getCutomerCreditNoteAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteAmount));
		return CutomerCreditNoteAmount;
	}
	@FindBy(id = "txtDescription")
	private WebElement CutomerCreditNoteDescription;
	public WebElement getCutomerCreditNoteDescription() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteDescription));
		return CutomerCreditNoteDescription;
	}
	@FindBy(xpath = "//tr[@id='trTaxRows']//a[@id='lnkAdd']")
	private WebElement CutomerCreditNoteAddTaxRow;
	public void getCutomerCreditNoteAddTaxRow() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteAddTaxRow));
		 CutomerCreditNoteAddTaxRow.click();
	}
	@FindBy(xpath = "//div[@id='upTaxAddition']//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement CutomerCreditNoteAddTaxCat;
	public WebElement getCutomerCreditNoteAddTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteAddTaxCat));
		return CutomerCreditNoteAddTaxCat;
	}
	@FindBy(xpath = "//div[@id='upTaxAddition']//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement CutomerCreditNoteAddTaxPer;
	public WebElement getCutomerCreditNoteAddTaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteAddTaxPer));
		return CutomerCreditNoteAddTaxPer;
	}
	
	@FindBy(xpath = "//div[@id='upTaxAddition']//table[@class='in4-table']//tr[3]//td[2]//select")
	private WebElement CutomerCreditNoteAddTaxCat2;
	public WebElement getCutomerCreditNoteAddTaxCat2() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteAddTaxCat2));
		return CutomerCreditNoteAddTaxCat2;
	}
	@FindBy(xpath = "//div[@id='upTaxAddition']//table[@class='in4-table']//tr[3]//td[3]//select")
	private WebElement CutomerCreditNoteAddTaxPer2;
	public WebElement getCutomerCreditNoteAddTaxPer2() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteAddTaxPer2));
		return CutomerCreditNoteAddTaxPer2;
	}
	@FindBy(xpath = "//tr[@id='trRowAddDel']//a[@id='lnkdedTaxAdd']")
	private WebElement CutomerCreditNoteDedTaxRow;
	public void getCutomerCreditNoteDedTaxRow() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteDedTaxRow));
		CutomerCreditNoteDedTaxRow.click();
	}
	@FindBy(xpath = "//div[@id='upTaxDeduction']//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement CutomerCreditNoteDedTaxCat;
	public WebElement getCutomerCreditNoteDedTaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteDedTaxCat));
		return CutomerCreditNoteDedTaxCat;
	}
	@FindBy(xpath = "//div[@id='upTaxDeduction']//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement CutomerCreditNoteDedTaxPer;
	public WebElement getCutomerCreditNoteDedTaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteDedTaxPer));
		return CutomerCreditNoteDedTaxPer;
	}
	@FindBy(id = "btnCreate")
	private WebElement CutomerCreditNoteCreateButton;
	public void getCutomerCreditNoteCreateButton() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteCreateButton));
		CutomerCreditNoteCreateButton.click();
	}
	@FindBy(id = "lblCreditNoteID")
	private WebElement CutomerCreditNoteID;
	public String getCutomerCreditNoteID() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteID));
		return CutomerCreditNoteID.getText();
	}
	@FindBy(css = "a#lbtnChangeStatus")
	private WebElement CutomerCreditNoteChangeStatus;
	public void getCutomerCreditNoteChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteChangeStatus));
		 CutomerCreditNoteChangeStatus.click();;
	}
	@FindBy(css = "select#ddlStatus")
	private WebElement CutomerCreditNoteStatusDD;
	public WebElement getCutomerCreditNoteStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteStatusDD));
		return CutomerCreditNoteStatusDD;
	}
	@FindBy(id = "lbtnUpdateStatus")
	private WebElement CutomerCreditNoteUpdateStatus;
	public void getCutomerCreditNoteUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteUpdateStatus));
		CutomerCreditNoteUpdateStatus.click();;
	}
	@FindBy(id = "lblStatusName")
	private WebElement CutomerCreditNoteCurrentStatus;
	public String getCutomerCreditNoteCurrentStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteCurrentStatus));
		return CutomerCreditNoteCurrentStatus.getText();
	}
	
	
	public void MenuSubMenuCutomerCreditNote() throws Throwable {
		try {
		MainMenu mm=new MainMenu(iDriver);
		mm.clickSales();
		Thread.sleep(1000);
		Sales en=new Sales(iDriver);
		en.clickBilling();
		Thread.sleep(1000);
		xml=new Datatable();
		sheet=xml.excelData(sheetname, Sales.CreatePath);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	String SalesCreditNoteID;
	public void CutomerCreditNoteCreation() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		for(i=1;i<=sheet.getLastRowNum();i++) {
		try {
		Frames.SubMenuFrame();
		getCustomerCreditNoteLink();
		Thread.sleep(1000);
		Frames.rightFrame();
		getCreateCustomerCreditNote();
		Thread.sleep(1000);
		getSelectCutomerNameLink();
		Thread.sleep(1000);
		try {
			WebElement frame = iDriver.findElement(By.cssSelector("iframe[class='cboxIframe']"));
			iDriver.switchTo().frame(frame);
		} catch (Exception e) {
			System.out.println(e);
		}
		getEnetrCutomerName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		getCutomerNameGo();
		getSelectCutomerRadio();
		getSelectCutomerAcceptSelected();
		Frames.rightFrame();
		appInd.singleDropDown(getSourceDD(), sheet.getRow(i).getCell(1).getStringCellValue());
		//getSearchForUnit().sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
		appInd.singleDropDown(getReasonDD(), sheet.getRow(i).getCell(3).getStringCellValue());
		appInd.seletDate(getCreditNoteDate(), appInd.getDateAsSpecified(0));
		appInd.singleDropDown(getProjectDD(), sheet.getRow(i).getCell(4).getStringCellValue());
		appInd.singleDropDown(getSubProjectDD(), sheet.getRow(i).getCell(5).getStringCellValue());
		appInd.singleDropDown(getUnitDD(), sheet.getRow(i).getCell(6).getStringCellValue());
		appInd.singleDropDown(getInvoiceDD(), sheet.getRow(i).getCell(7).getStringCellValue());
		getCutomerCreditNoteAmount().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getCutomerCreditNoteDescription().sendKeys("Sales Cutomer Credit Note created Through Automation");
		getCutomerCreditNoteAddTaxRow();
		appInd.singleDropDown(getCutomerCreditNoteAddTaxCat(), sheet.getRow(i).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getCutomerCreditNoteAddTaxPer(), sheet.getRow(i).getCell(10).getStringCellValue());
		Thread.sleep(1000);
		getCutomerCreditNoteAddTaxRow();
		appInd.singleDropDown(getCutomerCreditNoteAddTaxCat2(), sheet.getRow(i).getCell(11).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getCutomerCreditNoteAddTaxPer2(), sheet.getRow(i).getCell(12).getStringCellValue());
		Thread.sleep(1000);
		getCutomerCreditNoteDedTaxRow();
		appInd.singleDropDown(getCutomerCreditNoteDedTaxCat(), sheet.getRow(i).getCell(13).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getCutomerCreditNoteDedTaxPer(), sheet.getRow(i).getCell(14).getStringCellValue());
		Thread.sleep(2000);
		getCutomerCreditNoteCreateButton();
		Thread.sleep(1000);
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Cutomer Credit Note ","Not Created " , sheetname, Sales.OutPutCreatePath);
		}else {
			SalesCreditNoteID=getCutomerCreditNoteID();
			Datatable.writeExcel(SalesCreditNoteID,"Cutomer Credit Note Created" , sheetname, Sales.OutPutCreatePath);
			System.out.println("Cutomer Credit Note Created---"+SalesCreditNoteID);
			count++;
		}
		}catch (Exception e) {
			Datatable.writeExcel("Cutomer Credit Note ","Not Created Exception" , sheetname, Sales.OutPutCreatePath);
		}
		try {
		getCutomerCreditNoteChangeStatus();
		getCutomerCreditNoteStatusDD().sendKeys(sheet.getRow(i).getCell(15).getStringCellValue());
		getCutomerCreditNoteUpdateStatus();
		String CurrentStatus=getCutomerCreditNoteCurrentStatus();
		
		if(CurrentStatus.equalsIgnoreCase("Approved")) {
			Datatable.writeExcel(SalesCreditNoteID,"Cutomer Credit Note Approved" , sheetname, Sales.OutPutCreatePath);
			System.out.println("Sales Credit Note Create is Approved ");
		}else {
			Datatable.writeExcel(SalesCreditNoteID,"Cutomer Credit Note Not Approved" , sheetname, Sales.OutPutCreatePath);
			System.out.println("Sales Credit Note Create is Not Approved ");
		}
		}catch (Exception e) {
			Datatable.writeExcel(SalesCreditNoteID,"Cutomer Credit Note Not Approved Exception" , sheetname, Sales.OutPutCreatePath);
		}
	
		}
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrentmethod,"PASS" , sheetname, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod,"FAIL" , sheetname, Sales.OutPutCreatePath);
		}
	}
	
	
}

