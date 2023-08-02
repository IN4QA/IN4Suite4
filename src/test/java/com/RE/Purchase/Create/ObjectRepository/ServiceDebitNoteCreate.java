package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.ServiceDebitNoteCreate_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class ServiceDebitNoteCreate extends ServiceDebitNoteCreate_Test{
	public static WebDriver iDriver;
	public static String sheetname;
	public static XSSFSheet sheet;
	public static Datatable xml;
	int i =1;
	public ServiceDebitNoteCreate(WebDriver oBrowser) {
		iDriver=oBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
		
	}
	
	@FindBy(xpath = "//a[text()='Service Provider Debit Note']")
	private WebElement ServDNLink;
	public void getServDNLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNLink));
		ServDNLink.click();
	}
	@FindBy(id = "btnCreate")
	private WebElement CreateServDebitNote;
	public void getCreateServDebitNote() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateServDebitNote));
		CreateServDebitNote.click();
	}
	@FindBy(css = "select#ddlCertifyingCompany")
	private WebElement ServDNCertComp;
	public WebElement getServDNCertComp() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNCertComp));
		return ServDNCertComp;
	}
	@FindBy(id = "ddlPayingCompanyProvider")
	private WebElement ServDNPayingComp;
	public WebElement getServDNPayingComp() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNPayingComp));
		return ServDNPayingComp;
	}
	
	@FindBy(xpath = "//table[@id='CreateTable']//tr[2]//button")
	private WebElement ServDNProject;
	public WebElement getServDNProject() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNProject));
		return ServDNProject;
	}
	@FindBy(xpath = "//table[@id='CreateTable']//tr[2]//input[@placeholder='Search']")
	private WebElement ServDNEnterProject;
	public WebElement getServDNEnterProject() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNEnterProject));
		return ServDNEnterProject;
	}
	@FindBy(xpath = "//table[@id='CreateTable']//tr[2]//li")
	private List<WebElement> ServDNListOfProject;
	public List<WebElement> getServDNListOfProject() {
		return ServDNListOfProject;
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
	
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
	private WebElement EnterSuppDNEnterPO;
	public WebElement getEnterSuppDNEnterPO() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterSuppDNEnterPO));
	return	EnterSuppDNEnterPO;
	}
	
	@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
	private List<WebElement> SuppDNListOfPO;
	public List<WebElement> getSuppDNListOfPO() {
	return	SuppDNListOfPO;
	}
	
	@FindBy(id = "btnSearch")
	private WebElement SearchSuppDNPO;
	public void getSearchSuppDNPO() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchSuppDNPO));
		SearchSuppDNPO.click();
	}
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input")
	private WebElement ServDNPO_Radio;
	public void getServDNPO_Radio() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDNPO_Radio));
		ServDNPO_Radio.click();
	}
	
	@FindBy(css = "a#btnAcceptSelected")
	private WebElement ServDN_PO_selected;
	public void getServDN_PO_selected() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_PO_selected));
		ServDN_PO_selected.click();
	}
	@FindBy(id = "lnkBtnServiceProviderSelect")
	private WebElement ServDN_SelectServProvider;
	public WebElement getServDN_SelectServProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_SelectServProvider));
		return ServDN_SelectServProvider;
	}
	@FindBy(id = "textServiceProviderName")
	private WebElement ServDN_EnterServProviderName;
	public WebElement getServDN_EnterServProviderName() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_EnterServProviderName));
		return ServDN_EnterServProviderName;
	}
	
	@FindBy(id = "btnFilterGO")
	private WebElement ServDN_ServProviderGOButton;
	public WebElement getServDN_ServProviderGOButton() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_ServProviderGOButton));
		return ServDN_ServProviderGOButton;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//a[@id='gdvServiceProviderList_ctl02_lnkServiceProviderName']")
	private WebElement clickServiceProvider;
	public void getclickServiceProvider() {
		w2.until(ExpectedConditions.elementToBeClickable(clickServiceProvider));
		clickServiceProvider.click();
	}
	

	@FindBy(id = "lblinvoice")
	private WebElement ServDN_InvNo;
	public WebElement getServDN_InvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_InvNo));
		return ServDN_InvNo;
	}
	
	@FindBy(id = "txtInvoiceEdit")
	private WebElement ServDN_InvNoEdit;
	public WebElement getServDN_InvNoEdit() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_InvNoEdit));
		return ServDN_InvNoEdit;
	}
	
	
	@FindBy(css = "select#ddlReasonType")
	private WebElement ServDN_ReasonTypeDD;
	public WebElement getServDN_ReasonTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_ReasonTypeDD));
		return ServDN_ReasonTypeDD;
	}
	
	@FindBy(id = "txtDebitNoteamt")
	private WebElement ServDN_Amount;
	public WebElement getServDN_Amount() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_Amount));
		return ServDN_Amount;
	}

	@FindBy(id = "txtdebitnotedate_txtDatePicker")
	private WebElement ServDN_Date;
	public WebElement getServDN_Date() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_Date));
		return ServDN_Date;
	}
	
	
	@FindBy(id = "txtDebitNoteDateEdit_txtDatePicker")
	private WebElement ServDN_DateEdit;
	public WebElement getServDN_DateEdit() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_DateEdit));
		return ServDN_DateEdit;
	}
	
	@FindBy(id = "txtRemarks")
	private WebElement ServDN_Remarks;
	public WebElement getServDN_Remarks() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_Remarks));
		return ServDN_Remarks;
	}
	
	
	@FindBy(id = "txtRemarksEdit")
	private WebElement ServDN_RemarksEdit;
	public WebElement getServDN_RemarksEdit() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_RemarksEdit));
		return ServDN_RemarksEdit;
	}
	
	@FindBy(css = "a#lnkbtnAddTaxAdditionRow")
	private WebElement ServDN_AddRowLink;
	public void getServDN_AddRowLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_AddRowLink));
		 ServDN_AddRowLink.click();
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement ServDN_TaxCat;
	public WebElement getServDN_TaxCat() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxCat));
		return ServDN_TaxCat;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement ServDN_TaxPer;
	public WebElement getServDN_TaxPer() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxPer));
		return ServDN_TaxPer;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[4]//select")
	private WebElement ServDN_TaxType;
	public WebElement getServDN_TaxType() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxType));
		return ServDN_TaxType;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select")
	private WebElement ServDN_TaxCat2;
	public WebElement getServDN_TaxCat2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxCat2));
		return ServDN_TaxCat2;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select")
	private WebElement ServDN_TaxPer2;
	public WebElement getServDN_TaxPer2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxPer2));
		return ServDN_TaxPer2;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[4]//select")
	private WebElement ServDN_TaxType2;
	public WebElement getServDN_TaxType2() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxType2));
		return ServDN_TaxType2;
	}

	@FindBy(id = "btnCreate")
	private WebElement ServDN_Create;
	public WebElement getServDN_Create() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_Create));
		return ServDN_Create;
	}
	
	@FindBy(id = "lblDebitNoteDisplayID")
	private WebElement ServDN_ID;
	public String getServDN_ID() {
		return ServDN_ID.getText();
	}
	@FindBy(id = "btnModify")
	private WebElement ServDN_Modify;
	public void getServDN_Modify() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_Modify));
		 ServDN_Modify.click();
	}
	@FindBy(css = "input#btnUpdate")
	private WebElement ServDN_Update;
	public void getServDN_Update() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_Update));
		 ServDN_Update.click();;
	}
	@FindBy(id = "lnkBtnChangeStatus")
	private WebElement ServDN_ChangeStatus;
	public void getServDN_ChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_ChangeStatus));
		ServDN_ChangeStatus.click();;
	}
	@FindBy(css = "select#ddlNextStatus")
	private WebElement ServDN_StatusDD;
	public WebElement getServDN_StatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_StatusDD));
		return ServDN_StatusDD;
	}
	@FindBy(css = "a#lnkBtnUpdateStatus")
	private WebElement ServDN_UpdateStatus;
	public void getServDN_UpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ServDN_UpdateStatus));
		ServDN_UpdateStatus.click();;
	}
	@FindBy(css = "input#dtProcessedDt_txtDatePicker")
	private WebElement ServDN_ProcessDate;
	public WebElement getServDN_ProcessDate() {
		return ServDN_ProcessDate;
	}
	
	@FindBy(id = "lblStatus")
	private WebElement ServDN_CurrentStatus;
	public String getServDN_CurrentStatus() {
		return ServDN_CurrentStatus.getText();
	}
	
	public void MenuSubMenuServDN() throws Throwable{
		try {
		MainMenu mm=new MainMenu(iDriver);
		mm.clickPurchase();
		Purchase en=new Purchase(iDriver);
		en.clickPayments();
		xml=new Datatable();
		sheet=xml.excelData(sheetname, Purchase.InputCreatePath);
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
		}
	}
	String ServDebitNoteID;
	public void ServDNCreation() throws Throwable{
		int count=0;
		int updatecount=0;
		for(i=1;i<=sheet.getLastRowNum();i++) {
		try {
			Frames.SubMenuFrame();
			getServDNLink();
			Frames.rightFrame();
			getCreateServDebitNote();
			getServDNCertComp().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
//			getServDNPayingComp().sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
			getServDNProject().click();
			Thread.sleep(2000);
			appInd.createMultiDD_withText(getServDNProject(),getServDNEnterProject(), sheet.getRow(i).getCell(1).getStringCellValue(), getServDNListOfProject());
			String ParentSelectPO=appInd.switchToChildWindow(SelectPOlink);
			getPO_NumDD().click();
			Thread.sleep(1500);
			appInd.createMultiDD_withText(getPO_NumDD(),getEnterSuppDNEnterPO(), sheet.getRow(i).getCell(3).getStringCellValue(), getSuppDNListOfPO());
			getSearchSuppDNPO();
			getServDNPO_Radio();
			getServDN_PO_selected();
			appInd.switchToParentWindow(ParentSelectPO);
			Frames.rightFrame();
			String ParentSelectServProvider=appInd.switchToChildWindow(ServDN_SelectServProvider);
			getServDN_EnterServProviderName().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
			getServDN_ServProviderGOButton();
			getclickServiceProvider();
			appInd.switchToParentWindow(ParentSelectServProvider);
			Frames.rightFrame();
			getServDN_InvNo().sendKeys("InvNo"+appInd.RandomNoAsSpecified(3));
			appInd.singleDropDown(getServDN_ReasonTypeDD(), sheet.getRow(i).getCell(5).getStringCellValue());
			getServDN_Amount().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
			appInd.seletDate(getServDN_Date(), appInd.getDateAsSpecified(0));
			getServDN_AddRowLink();
			Thread.sleep(1000);
			getServDN_AddRowLink();
			appInd.singleDropDown(getServDN_TaxCat(), sheet.getRow(i).getCell(7).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getServDN_TaxPer(), sheet.getRow(i).getCell(8).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getServDN_TaxType(), sheet.getRow(i).getCell(9).getStringCellValue());
			Thread.sleep(2000);
			getServDN_AddRowLink();
			appInd.singleDropDown(getServDN_TaxCat2(), sheet.getRow(i).getCell(10).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getServDN_TaxPer2(), sheet.getRow(i).getCell(11).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getServDN_TaxType2(), sheet.getRow(i).getCell(12).getStringCellValue());
			Thread.sleep(2000);
			getServDN_Remarks().sendKeys("Service Debit Note Created Through Automation");
			Thread.sleep(1000);
			getServDN_Create().click();
			Thread.sleep(2000);
			ServDebitNoteID=getServDN_ID();
			Thread.sleep(1000);
			System.out.println("Service Debit Note "+ServDebitNoteID+" is created");
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("Service Debit Note", "Not Created", sheetname, Purchase.OutputCreatePath);
			}else {
				Datatable.writeExcel(ServDebitNoteID, " Created", sheetname, Purchase.OutputCreatePath);
				count++;
			}
			
		} catch (Exception e) {
			Datatable.writeExcel("Service Debit Note", "Not Created Exception", sheetname, Purchase.OutputCreatePath);
		}
		
		getServDN_Modify();
		Thread.sleep(1000);
		try {
		switch (i) {
		case 1:
			  appInd.seletDate(getServDN_DateEdit(), appInd.getDateAsSpecified(0));	
			  getServDN_RemarksEdit().clear();
			  Thread.sleep(1000);
			  getServDN_RemarksEdit().sendKeys("Service Debit Note Modified & Updated Through Automation");
			break;
		case 2:	getServDN_InvNoEdit().clear();
				Thread.sleep(1000);
				getServDN_InvNoEdit().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
				getServDN_RemarksEdit().clear();
				Thread.sleep(1000);
				getServDN_RemarksEdit().sendKeys("Service Debit Note Modified & Updated Through Automation");
			break;	
			
		case 3:
			  getServDN_RemarksEdit().clear();
			  Thread.sleep(1000);
			  getServDN_RemarksEdit().sendKeys("Service Debit Note Modified & Updated Through Automation");
			break;
		default:
			break;
		}
		
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Service Debit Note", "Not Updated", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(ServDebitNoteID, " Updated", sheetname, Purchase.OutputCreatePath);
			updatecount++;
			System.out.println("Service Debit Note "+ServDebitNoteID+"Updated");
		}
		}catch (Exception e) {
			Datatable.writeExcel("Service Debit Note", "Not Updated Exception", sheetname, Purchase.OutputCreatePath);
		}
		
		
		Thread.sleep(1000);
		getServDN_Update();
		try {
		getServDN_ChangeStatus();
		Thread.sleep(1500);
		getServDN_StatusDD().sendKeys("Approved");
		Thread.sleep(1500);
		getServDN_UpdateStatus();
		Thread.sleep(1500);
		getServDN_ChangeStatus();
		Thread.sleep(1500);
		getServDN_StatusDD().sendKeys("Processed");
		Thread.sleep(1500);
		appInd.seletDate(getServDN_ProcessDate(), appInd.getDateAsSpecified(0));
		Thread.sleep(1500);
		getServDN_UpdateStatus();
		Thread.sleep(1500);
		String	DebitNoteStatus =getServDN_CurrentStatus();
		if(DebitNoteStatus.equalsIgnoreCase("Processed")) {
			Datatable.writeExcel(ServDebitNoteID, "is Processed", sheetname, Purchase.OutputCreatePath);
			System.out.println("Service Debit Note "+ServDebitNoteID+"Processed");
		}else{
			Datatable.writeExcel(ServDebitNoteID, "is Not Processed", sheetname, Purchase.OutputCreatePath);
		}
		}
		catch (Exception e) {
			Datatable.writeExcel(ServDebitNoteID, "is Not Processed Exception", sheetname, Purchase.OutputCreatePath);		
			}
		
	}
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel("Supplier Debit Note Creation", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Supplier Debit Note Creation", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		if(updatecount==sheet.getLastRowNum()) {
			Datatable.writeExcel("Supplier Debit Note Updation", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Supplier Debit Note Updation", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
	}
}
