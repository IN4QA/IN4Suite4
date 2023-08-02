package com.RE.Sales.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.AgentCreditNote_Create_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class AgentCreditNote_Create extends AgentCreditNote_Create_Test {
	public static WebDriver iDriver;
	public static Datatable xml;
	public static String sheetname;
	public static XSSFSheet sheet;
	int i =1;
	
	public AgentCreditNote_Create(WebDriver OBrowser) {
		iDriver=OBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
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

	public void MenuSubMenuAgentCreditNote() throws Throwable {
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
	String AgentCreditNoteDisplayNo;
	public void SalesAgentCreditNoteCreation() throws Throwable{
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		System.out.println("LAST ROW---"+sheet.getLastRowNum());
		for(i=1;i<=sheet.getLastRowNum();i++) {
		try {
		Thread.sleep(2000);
		Frames.SubMenuFrame();
		getAgentCreditNoteLink();
		Frames.rightFrame();
		getCreateAgentCreditNote();
		appInd.singleDropDown(getAgentCreditNoteCompanyDD(), sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentCreditNoteprojectDD(), sheet.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getAgentCreditNoteSubprojectDD(), sheet.getRow(i).getCell(2).getStringCellValue());
		WebElement AgentName = getAgentCreditNoteAgentName();
		AgentName.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		AgentName.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		AgentName.sendKeys(Keys.ENTER);
		getAgentCreditNote_SelectDebitNote();
		getAgentCreditNoteAmountRecover().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		appInd.seletDate(getAgentCreditNoteDate(), appInd.getDateAsSpecified(0));
		getAgentCreditNoteAmount().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		getAgentCreditNoteRemarks().sendKeys("Agent Credit Note is created through Automation");
		Thread.sleep(2000);
		getAgentCreditNoteCreate();
		Thread.sleep(2000);
		AgentCreditNoteDisplayNo=getAgentCreditNoteID();
		if(appInd.AlertPresent()) {
			Thread.sleep(2000);
			Datatable.writeExcel("Sales", "Agent DebitNote Not Created", sheetname, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(AgentCreditNoteDisplayNo, "Agent DebitNote  Created", sheetname, Sales.OutPutCreatePath);
			count++;
			}
		
		}catch (Exception e) {
			Datatable.writeExcel("Sales", "Agent DebitNote Not Created Exception", sheetname, Sales.OutPutCreatePath);		
			}
		
		
		try {
			getAgentCreditNoteChangeStatus();
			getAgentCreditNoteStatusDD().sendKeys("Approved");
			getAgentCreditNoteUpdateStatus();
			Thread.sleep(1000);
			if(getAgentCreditNoteCurrentStatus().equalsIgnoreCase("Approved")) {
				Datatable.writeExcel(AgentCreditNoteDisplayNo, "Approved", sheetname, Sales.OutPutCreatePath);
				System.out.println(AgentCreditNoteDisplayNo+"  Agent DebitNote is Approved");
			}else {
				Datatable.writeExcel(AgentCreditNoteDisplayNo, "Not Approved", sheetname, Sales.OutPutCreatePath);
				System.out.println(AgentCreditNoteDisplayNo+"  Agent Debit Note is Not Approved");
			}
		}catch (Exception e) {
			Datatable.writeExcel(AgentCreditNoteDisplayNo, "Not Approved ", sheetname, Sales.OutPutCreatePath);
			System.out.println(AgentCreditNoteDisplayNo+"  Agent Debit Note is Not Approved Exception");
		}
		}
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}
	}

}
