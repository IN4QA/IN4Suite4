package com.RE.Sales.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.AgentDebitNote_Create_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class AgentDebitNote_Create extends AgentDebitNote_Create_Test{
	public static WebDriver iDriver;
	public static Datatable xml;
	public static String sheetnameAgentDebitNote;
	public static XSSFSheet sheetAgentDebitNote;
	int i =1;
	
	public AgentDebitNote_Create(WebDriver OBrowser) {
		iDriver=OBrowser;
		PageFactory.initElements(iDriver, this);
		sheetnameAgentDebitNote=this.getClass().getSimpleName();
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
	
	
	
	public void MenuSubMenuAgentDebitNote() throws Throwable {
		try {
		MainMenu mm=new MainMenu(iDriver);
		mm.clickSales();
		Thread.sleep(1000);
		Sales en=new Sales(iDriver);
		en.clickBilling();
		Thread.sleep(1000);
		xml=new Datatable();
		sheetAgentDebitNote=xml.excelData(sheetnameAgentDebitNote, Sales.CreatePath);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	String AgentDebitNoteDisplayNo;
	public void SalesAgentDebitNoteCreation() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		System.out.println("LAST ROW---"+sheetAgentDebitNote.getLastRowNum());
		for(i=1;i<=sheetAgentDebitNote.getLastRowNum();i++) {
			try {
		Frames.SubMenuFrame();
		getAgentDebitNotelink();
		Frames.rightFrame();
		getCreateAgentDebitNote();
		appInd.singleDropDown(getAgentDebitNoteTypeDD(), sheetAgentDebitNote.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentDebitNoteProjectDD(), sheetAgentDebitNote.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		try {
		appInd.singleDropDown(getAgentDebitNoteSubProjectDD(), sheetAgentDebitNote.getRow(i).getCell(2).getStringCellValue());
		}catch (Exception e) {
System.out.println(e+"  SUB PROJECT ");		}
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
			Datatable.writeExcel("Agent Debit Note ", "Not Created", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Created", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
			System.out.println(AgentDebitNoteDisplayNo+"  Agent Debit Note Created");
			count++;
		}
			}catch (Exception e) {
				Datatable.writeExcel("Agent Debit Note ", "Not Created Exception", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
			}
			getAgentDebittNoteModify();
			Thread.sleep(2000);
			try {
		switch (i) {
		case 1:
			getAgentDebitNoteAmount().clear();
			getAgentDebitNoteAmount().sendKeys(sheetAgentDebitNote.getRow(1).getCell(13).getStringCellValue());
			getAgentDebitNoteRemarks().clear();
			getAgentDebitNoteRemarks().sendKeys("Sales Agnet Debit Note Modified & Updated Through Automation");
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
			appInd.singleDropDown(getAgentDebitNoteAddTax2(), sheetAgentDebitNote.getRow(3).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			getAgentDebitNoteRemarks().clear();
			getAgentDebitNoteRemarks().sendKeys("Sales Agnet Debit Note Modified & Updated Through Automation");
	break;

		default:
			break;
		}
		Thread.sleep(2000);
		getAgentDebittNoteUpdate();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Updated ", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note is Updated ", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
			System.out.println(AgentDebitNoteDisplayNo+" Agent Debit Note is Updated");
		}
			}catch (Exception e) {
				Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Updated Exception ", sheetnameAgentDebitNote, Sales.OutPutCreatePath);			}
			
			try {
		getAgentDebitNoteChangeStatus();
		getAgentDebitNoteStatusDD().sendKeys("Approved");
		getAgentDebitNoteUpdateStatus();
		if(appInd.alertText().equalsIgnoreCase("Status Updated Succesfully")) {
			appInd.isAlertPresent();
			}else {
				Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Status Not updated", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
			}
		Thread.sleep(2000);
		if(getAgentDebitNoteCurrentStatus().equalsIgnoreCase("Approved")) {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Approved ", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
			System.out.println(AgentDebitNoteDisplayNo+"  Approved");
		}else {
			Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Approved ", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
		}
			}catch (Exception e) {
				Datatable.writeExcel(AgentDebitNoteDisplayNo, "Agent Debit Note Not Approved Exception", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
			}
		}
		if(count==sheetAgentDebitNote.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetnameAgentDebitNote, Sales.OutPutCreatePath);
		}
	}
}
