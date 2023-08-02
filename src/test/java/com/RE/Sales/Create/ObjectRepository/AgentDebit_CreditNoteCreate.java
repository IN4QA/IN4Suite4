package com.RE.Sales.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.AgentDebit_CreditNoteCreate_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class AgentDebit_CreditNoteCreate extends AgentDebit_CreditNoteCreate_Test{
	
	
	public static XSSFSheet sheetPO;
	public static String sheetnamePO = "PO_Create";
	public static String SuppMultiRecoveryOutput="Supp_MultiRecovery_Create";
	
	public static WebDriver iDriver;
	public static Datatable xml;
	public static XSSFSheet sheetCreditNote;
	public static XSSFSheet sheetAgentDebitNote;
	public static String sheetnameDebitNote = "AgentDebitNote_Create";
	public static String sheetnameCreditNote = "AgentCreditNote_Create";
	public static String AgentDebitCreditNoteCreateOutput="AgentDebit_CreditNoteCreate";
	int i =1;
	
	public AgentDebit_CreditNoteCreate(WebDriver OBrowser) {
		iDriver=OBrowser;
		PageFactory.initElements(iDriver, this);
	}

	@FindBy(xpath = "//a[text()='Agent Debit Note']")
	private WebElement AgentDebitNotelink;
	public void getAgentDebitNotelink() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNotelink));
		AgentDebitNotelink.click();
	}
	@FindBy(id = "btnCreateSADebitNoteNew")
	private WebElement CreateAgentDebitNote;
	public void getCreateAgentDebitNote() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateAgentDebitNote));
		CreateAgentDebitNote.click();
	}
	
	@FindBy(css = "select#ddlDebitNoteType")
	private WebElement AgentDebitNoteTypeDD;
	public WebElement getAgentDebitNoteTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteTypeDD));
		return AgentDebitNoteTypeDD;
	}
	@FindBy(css = "select#ddlProjectList")
	private WebElement AgentDebitNoteProjectDD;
	public WebElement getAgentDebitNoteProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteProjectDD));
		return AgentDebitNoteProjectDD;
	}
	@FindBy(css = "select#ddlSubProjectList")
	private WebElement AgentDebitNoteSubProjectDD;
	public WebElement getAgentDebitNoteSubProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteSubProjectDD));
		return AgentDebitNoteSubProjectDD;
	}
	@FindBy(css = "select#ddlUnitNo")
	private WebElement AgentDebitNoteUnitDD;
	public WebElement getAgentDebitNoteUnitDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteUnitDD));
		return AgentDebitNoteUnitDD;
	}
	@FindBy(css = "input#txtAgent")
	private WebElement AgentDebitNote_AgentName;
	public WebElement getAgentDebitNote_AgentName() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNote_AgentName));
		return AgentDebitNote_AgentName;
	}
	@FindBy(id = "ddlReason")
	private WebElement AgentDebitNoteReasonDD;
	public WebElement getAgentDebitNoteReasonDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteReasonDD));
		return AgentDebitNoteReasonDD;
	}
	@FindBy(css = "input#dpToDate_txtDate")
	private WebElement AgentDebitNoteDate;
	public WebElement getAgentDebitNoteDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteDate));
		return AgentDebitNoteDate;
	}
	@FindBy(id = "txtInvoiceNo")
	private WebElement AgentDebitNoteInvoiceNo;
	public WebElement getAgentDebitNoteInvoiceNo() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteInvoiceNo));
		return AgentDebitNoteInvoiceNo;
	}
	@FindBy(css = "input#txtAmount")
	private WebElement AgentDebitNoteAmount;
	public WebElement getAgentDebitNoteAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteAmount));
		return AgentDebitNoteAmount;
	}
	@FindBy(css = "textarea#txtRemarks")
	private WebElement AgentDebitNoteRemarks;
	public WebElement getAgentDebitNoteRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteRemarks));
		return AgentDebitNoteRemarks;
	}
	@FindBy(xpath = "//a[@id='lnkAdd']")
	private WebElement AgentDebitNoteAddRowlink;
	public void getAgentDebitNoteAddRowlink() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteAddRowlink));
		 AgentDebitNoteAddRowlink.click();
	}
	@FindBy(xpath = "//table[@id='gvTaxAddition']//tr[2]//td[2]//select")
	private WebElement AgentDebitNoteAddTaxCatDD1;
	public WebElement getAgentDebitNoteAddTaxCatDD1() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteAddTaxCatDD1));
		return AgentDebitNoteAddTaxCatDD1;
	}
	@FindBy(xpath = "//table[@id='gvTaxAddition']//tr[2]//td[3]//select[1]")
	private WebElement AgentDebitNoteAddTax1;
	public WebElement getAgentDebitNoteAddTax1() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteAddTax1));
		return AgentDebitNoteAddTax1;
	}
	@FindBy(xpath = "//table[@id='gvTaxAddition']//tr[3]//td[2]//select")
	private WebElement AgentDebitNoteAddTaxCatDD2;
	public WebElement getAgentDebitNoteAddTaxCatDD2() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteAddTaxCatDD2));
		return AgentDebitNoteAddTaxCatDD2;
	}
	@FindBy(xpath = "//table[@id='gvTaxAddition']//tr[3]//td[3]//select[1]")
	private WebElement AgentDebitNoteAddTax2;
	public WebElement getAgentDebitNoteAddTax2() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteAddTax2));
		return AgentDebitNoteAddTax2;
	}
	
	@FindBy(id = "btnCreate")
	private WebElement AgentDebitNoteCreate;
	public void getAgentDebitNoteCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteCreate));
		 AgentDebitNoteCreate.click();
	}

	@FindBy(id = "lbChangeStatus")
	private WebElement AgentDebitNoteChangeStatus;
	public void getAgentDebitNoteChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteChangeStatus));
		AgentDebitNoteChangeStatus.click();
	}
	@FindBy(css  = "select#ddlStatus")
	private WebElement AgentDebitNoteStatusDD;
	public WebElement getAgentDebitNoteStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteStatusDD));
		return AgentDebitNoteStatusDD;
	}
	@FindBy(css = "a#lbtnUpdateStatus")
	private WebElement AgentDebittNoteUpdateStatus;
	public void getAgentDebitNoteUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebittNoteUpdateStatus));
		AgentDebittNoteUpdateStatus.click();
	}
	
	@FindBy(id = "lblAgentID")
	private WebElement AgentDebitNoteID;
	public String getAgentDebitNoteID() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteID));
		return AgentDebitNoteID.getText();
	}
	@FindBy(id = "lblStatusVal")
	private WebElement AgentDebitNoteCurrentStatus;
	public String getAgentDebitNoteCurrentStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebitNoteCurrentStatus));
		return AgentDebitNoteCurrentStatus.getText();
	}
	@FindBy(id = "btnCreateModify")
	private WebElement AgentDebittNoteModify;
	public void getAgentDebittNoteModify() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebittNoteModify));
		AgentDebittNoteModify.click();
	}
	@FindBy(id = "btnCreate")
	private WebElement AgentDebittNoteUpdate;
	public void getAgentDebittNoteUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentDebittNoteUpdate));
		AgentDebittNoteUpdate.click();
	}
	@FindBy(xpath = "//a[text()='Agent Credit Note']")
	private WebElement AgentCreditNoteLink;
	public void getAgentCreditNoteLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteLink));
		AgentCreditNoteLink.click();
	}
	@FindBy(id = "btnCreateCreditNote")
	private WebElement CreateAgentCreditNote;
	public void getCreateAgentCreditNote() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateAgentCreditNote));
		CreateAgentCreditNote.click();
	}
	@FindBy(css = "select#ddlCompany")
	private WebElement AgentCreditNoteCompanyDD;
	public WebElement getAgentCreditNoteCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteCompanyDD));
		return AgentCreditNoteCompanyDD;
	}
	@FindBy(css = "select#ddlProject")
	private WebElement AgentCreditNoteprojectDD;
	public WebElement getAgentCreditNoteprojectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteprojectDD));
		return AgentCreditNoteprojectDD;
	}
	@FindBy(css = "select#ddlSubProjectList")
	private WebElement AgentCreditNoteSubprojectDD;
	public WebElement getAgentCreditNoteSubprojectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteSubprojectDD));
		return AgentCreditNoteSubprojectDD;
	}
	@FindBy(css = "input#txtAgentName")
	private WebElement AgentCreditNote_AgentName;
	public WebElement getAgentCreditNoteAgentName() {
		return AgentCreditNote_AgentName;
	}
	@FindBy(css="input#dpCreditNoteDt_txtDate")
	private WebElement AgentCreditNoteDate;
	public WebElement getAgentCreditNoteDate() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteDate));
		return AgentCreditNoteDate;
	}
	@FindBy(css = "input#txtAmount")
	private WebElement AgentCreditNoteAmount;
	public WebElement getAgentCreditNoteAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteAmount));
		return AgentCreditNoteAmount;
	}
	@FindBy(css = "textarea#txtComments")
	private WebElement AgentCreditNoteRemarks;
	public WebElement getAgentCreditNoteRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteRemarks));
		return AgentCreditNoteRemarks;
	}
	@FindBy(xpath = "//table[@id='gvDebitNoteList']//tr[2]//td[1]//input")
	private WebElement AgentCreditNote_SelectDebitNote;
	public void getAgentCreditNote_SelectDebitNote() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNote_SelectDebitNote));
		 AgentCreditNote_SelectDebitNote.click();;
	}
	@FindBy(xpath = "//table[@id='gvDebitNoteList']//tr[2]//td[8]//input[@type='text']")
	private WebElement AgentCreditNoteAmountRecover;
	public WebElement getAgentCreditNoteAmountRecover() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteAmountRecover));
		return AgentCreditNoteAmountRecover;
	}
	
	@FindBy(css = "input#btnCreate")
	private WebElement AgentCreditNoteCreate;
	public void getAgentCreditNoteCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteCreate));
		 AgentCreditNoteCreate.click();
	}
	@FindBy(xpath = "//span[@id='lblID']")
	private WebElement AgentCreditNoteID;
	public String getAgentCreditNoteID() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteID));
		return AgentCreditNoteID.getText();
	}
	@FindBy(id = "lnkChangeStatus")
	private WebElement AgentCreditNoteChangeStatus;
	public void getAgentCreditNoteChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteChangeStatus));
		 AgentCreditNoteChangeStatus.click();
	}
	@FindBy(css  = "select#ddlStatus")
	private WebElement AgentCreditNoteStatusDD;
	public WebElement getAgentCreditNoteStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteStatusDD));
		return AgentCreditNoteStatusDD;
	}
	@FindBy(css = "a#lnkUpdateStatus")
	private WebElement AgentCreditNoteUpdateStatus;
	public void getAgentCreditNoteUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteUpdateStatus));
		AgentCreditNoteUpdateStatus.click();
	}
	
	@FindBy(id = "lblStatusName")
	private WebElement AgentCreditNoteCurrentStatus;
	public String getAgentCreditNoteCurrentStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(AgentCreditNoteCurrentStatus));
		return AgentCreditNoteCurrentStatus.getText();
	}

	@FindBy(xpath = "//div[@id='upDebitNoteList']//tr//td[2]")
	private List<WebElement> AgentDebitNoteCount;
	public List<WebElement> getAgentDebitNoteCount() {
		return AgentDebitNoteCount;
	}
	int count=0;
	public void SalesAgentDebitCreditNoteCreation() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		xml=new Datatable();
		sheetAgentDebitNote=xml.excelData(sheetnameDebitNote, Sales.CreatePath);
		for(i=1;i<=sheetAgentDebitNote.getLastRowNum();i++) {
		MenuSubMenuAgentDebitNote();
		SalesAgentDebitNoteCreation();
		MenuSubMenuAgentCreditNote();
		SalesAgentCreditNoteCreation();
	
		}
		if(count==sheetAgentDebitNote.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
		}
	}
	
	public void MenuSubMenuAgentDebitNote() throws Throwable {
		
		try {
		MainMenu mm=new MainMenu(iDriver);
		mm.clickSales();
		Thread.sleep(1000);
		Sales en=new Sales(iDriver);
		en.clickBilling();
		Thread.sleep(1000);
		xml=new Datatable();
		sheetAgentDebitNote=xml.excelData(sheetnameDebitNote, Sales.CreatePath);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	String AgentDebitNoteDisplayNo;
	public void SalesAgentDebitNoteCreation() throws Throwable {
			try {
		Frames.SubMenuFrame();
		getAgentDebitNotelink();
		Frames.rightFrame();
		getCreateAgentDebitNote();
		appInd.singleDropDown(getAgentDebitNoteTypeDD(), sheetAgentDebitNote.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteProjectDD(), sheetAgentDebitNote.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(2000);

		appInd.singleDropDown(getAgentDebitNoteSubProjectDD(), sheetAgentDebitNote.getRow(i).getCell(2).getStringCellValue());

		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteUnitDD(), sheetAgentDebitNote.getRow(i).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		WebElement AgentName=getAgentDebitNote_AgentName();
		AgentName.sendKeys(sheetAgentDebitNote.getRow(i).getCell(4).getStringCellValue());
		AgentName.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		AgentName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteReasonDD(), sheetAgentDebitNote.getRow(i).getCell(5).getStringCellValue());
		Thread.sleep(1000);
		appInd.seletDate(getAgentDebitNoteDate(), appInd.getDateAsSpecified(0));
		getAgentDebitNoteInvoiceNo().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
		getAgentDebitNoteAmount().clear();
		Thread.sleep(1000);
		getAgentDebitNoteAmount().sendKeys(sheetAgentDebitNote.getRow(i).getCell(6).getStringCellValue());
		getAgentDebitNoteRemarks().sendKeys("Sales Agnet Debit Note Created Through Automation");
		getAgentDebitNoteAddRowlink();
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteAddTaxCatDD1(), sheetAgentDebitNote.getRow(i).getCell(7).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteAddTax1(), sheetAgentDebitNote.getRow(i).getCell(8).getStringCellValue());
		Thread.sleep(1000);
		getAgentDebitNoteAddRowlink();
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteAddTaxCatDD2(), sheetAgentDebitNote.getRow(i).getCell(9).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteAddTax2(), sheetAgentDebitNote.getRow(i).getCell(10).getStringCellValue());
		Thread.sleep(3000);
		getAgentDebitNoteCreate();
		Thread.sleep(2000);
		AgentDebitNoteDisplayNo=getAgentDebitNoteID();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Agent Debit Note ", "Not Created", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Created", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			System.out.println(AgentDebitNoteDisplayNo+"  Agent Debit Note Created");
		}
			}catch (Exception e) {
				Datatable.writeExcel("Agent Debit Note ", "Not Created Exception", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			}
			getAgentDebittNoteModify();
			Thread.sleep(2000);
			try {
		switch (i) {
		case 1:
			getAgentDebitNoteAmount().clear();
			getAgentDebitNoteAmount().sendKeys(sheetAgentDebitNote.getRow(i).getCell(6).getStringCellValue());
			getAgentDebitNoteRemarks().clear();
			getAgentDebitNoteRemarks().sendKeys("Sales Agent Debit Note Modified & Updated Through Automation");
			break;
			
		case 2:
			getAgentDebitNoteUnitDD().sendKeys(sheetAgentDebitNote.getRow(2).getCell(13).getStringCellValue());
			getAgentDebitNoteRemarks().clear();
			getAgentDebitNoteRemarks().sendKeys("Sales Agnet Debit Note Modified & Updated Through Automation");
			break;
			
		case 3:
			appInd.singleDropDown(getAgentDebitNoteAddTaxCatDD1(), sheetAgentDebitNote.getRow(3).getCell(12).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getAgentDebitNoteAddTax1(), sheetAgentDebitNote.getRow(3).getCell(13).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getAgentDebitNoteAddTaxCatDD2(), sheetAgentDebitNote.getRow(3).getCell(14).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getAgentDebitNoteAddTax2(), sheetAgentDebitNote.getRow(3).getCell(15).getStringCellValue());
			Thread.sleep(1000);
			getAgentDebitNoteRemarks().clear();
			getAgentDebitNoteRemarks().sendKeys("Sales Agent Debit Note Modified & Updated Through Automation");
	break;

		default:
			break;
		}
		Thread.sleep(2000);
		getAgentDebittNoteUpdate();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Updated ", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note is Updated ", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			System.out.println(AgentDebitNoteDisplayNo+" Agent Debit Note is Updated");
		}
			}catch (Exception e) {
				Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Updated Exception ", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);			}
			
			try {
		getAgentDebitNoteChangeStatus();
		getAgentDebitNoteStatusDD().sendKeys("Approved");
		getAgentDebitNoteUpdateStatus();
		if(appInd.alertText().equalsIgnoreCase("Status Updated Succesfully")) {
			appInd.isAlertPresent();
			}else {
				Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Status Not updated", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			}
		Thread.sleep(2000);
		if(getAgentDebitNoteCurrentStatus().equalsIgnoreCase("Approved")) {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Approved ", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			System.out.println(AgentDebitNoteDisplayNo+"  Approved");
		}else {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Approved ", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
		}
			}catch (Exception e) {
				Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Approved Exception", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			}
		}
	
	public void MenuSubMenuAgentCreditNote() throws Throwable {
		try {
		MainMenu mm=new MainMenu(iDriver);
		mm.clickSales();
		Thread.sleep(1000);
		Sales en=new Sales(iDriver);
		en.clickBilling();
		Thread.sleep(1000);
		xml=new Datatable();
		sheetCreditNote=xml.excelData(sheetnameCreditNote, Sales.CreatePath);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	String AgentCreditNoteDisplayNo;
	String DebitNoteBalance;
	public void SalesAgentCreditNoteCreation() throws Throwable{
		try {
		Thread.sleep(2000);
		Frames.SubMenuFrame();
		getAgentCreditNoteLink();
		Frames.rightFrame();
		getCreateAgentCreditNote();
		appInd.singleDropDown(getAgentCreditNoteCompanyDD(), sheetCreditNote.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentCreditNoteprojectDD(), sheetCreditNote.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentCreditNoteSubprojectDD(), sheetCreditNote.getRow(i).getCell(2).getStringCellValue());
		WebElement AgentName = getAgentCreditNoteAgentName();
		AgentName.sendKeys(sheetCreditNote.getRow(i).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		AgentName.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		AgentName.sendKeys(Keys.ENTER);
		
		//Selecting Debit Note
		try {
			int DebitNoteCount=0;
			System.out.println("Total Debit Note Listing ---"+DebitNoteCount);
			Thread.sleep(1000);
			for(int j=0; j<=getAgentDebitNoteCount().size(); j++) {
				Thread.sleep(1000);
				DebitNoteCount++;
				Thread.sleep(2000);
				if(getAgentDebitNoteCount().get(j).getText().equals(AgentDebitNoteDisplayNo))
				{
					Thread.sleep(2000);
					DebitNoteCount = DebitNoteCount + 1;
					Thread.sleep(2000);
					System.out.println("FINAL DEBIT NOTE COUNT---"+DebitNoteCount);
					iDriver.findElement(By.xpath("//div[@id='upDebitNoteList']//tr["+DebitNoteCount+"]//td[1]//input[@type='checkbox']")).click();
					Thread.sleep(1000);
					 DebitNoteBalance=iDriver.findElement(By.xpath("//div[@id='upDebitNoteList']//tr["+DebitNoteCount+"]//td[7]")).getText();
					 Thread.sleep(1000);
					System.out.println("DEBIT NOTE BALANCE===="+DebitNoteBalance);
			
//					iDriver.findElement(By.xpath("//div[@id='upDebitNoteList']//tr["+DebitNoteCount+"]//td[8]//input[@type='text']")).clear();
//					Thread.sleep(1000);
//					iDriver.findElement(By.xpath("//div[@id='upDebitNoteList']//tr["+DebitNoteCount+"]//td[8]//input[@type='text']")).click();
					Thread.sleep(1000);
					iDriver.findElement(By.xpath("//div[@id='upDebitNoteList']//tr["+DebitNoteCount+"]//td[8]//input[@type='text']")).sendKeys(DebitNoteBalance);
					Thread.sleep(2000);
					break;		
				}
			}
			}catch (Exception e) {
				System.out.println("Agent Debit Note Adjustment Exception"+e);

			}
		appInd.seletDate(getAgentCreditNoteDate(), appInd.getDateAsSpecified(0));
		getAgentCreditNoteAmount().sendKeys(DebitNoteBalance);
		getAgentCreditNoteRemarks().sendKeys("Agent Credit Note is created through Automation");
		Thread.sleep(2000);
		getAgentCreditNoteCreate();
		Thread.sleep(2100);
		AgentCreditNoteDisplayNo=getAgentCreditNoteID();
		if(appInd.AlertPresent()) {
			Thread.sleep(2000);
			Datatable.writeExcel("Sales", "Agent Credit Note Not Created", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(AgentCreditNoteDisplayNo, "Agent Credit Note  Created", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			count++;
			}
		
		}catch (Exception e) {
			Datatable.writeExcel("Sales", "Agent Credit Note Not Created Exception", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);		
			}
		
		
		try {
			getAgentCreditNoteChangeStatus();
			getAgentCreditNoteStatusDD().sendKeys("Approved");
			getAgentCreditNoteUpdateStatus();
			Thread.sleep(1000);
			if(getAgentCreditNoteCurrentStatus().equalsIgnoreCase("Approved")) {
				Datatable.writeExcel(AgentCreditNoteDisplayNo, "Approved", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
				System.out.println(AgentCreditNoteDisplayNo+"  Agent DebitNote is Approved");
			}else {
				Datatable.writeExcel(AgentCreditNoteDisplayNo, "Not Approved", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
				System.out.println(AgentCreditNoteDisplayNo+"  Agent Debit Note is Not Approved");
			}
		}catch (Exception e) {
			Datatable.writeExcel(AgentCreditNoteDisplayNo, "Not Approved ", AgentDebitCreditNoteCreateOutput, Sales.OutPutCreatePath);
			System.out.println(AgentCreditNoteDisplayNo+"  Agent Debit Note is Not Approved Exception");
		}
		
		
	}
}
