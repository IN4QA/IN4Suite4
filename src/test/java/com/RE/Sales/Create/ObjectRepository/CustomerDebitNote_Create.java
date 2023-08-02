package com.RE.Sales.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.CustomerDebitNote_Create_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class CustomerDebitNote_Create extends CustomerDebitNote_Create_Test{
	public static WebDriver iDriver;
	public static Datatable xml;
	public static String sheetname;
	public static XSSFSheet sheet;
	int i =1;
	public CustomerDebitNote_Create(WebDriver oBrowser) {
		iDriver=oBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
		}
	
	
	@FindBy(xpath = "//a[text()='Customer Debit Note'][contains(@href,'ListDebitNotes')]")
	private WebElement CustomerDebitNoteLink;
	public void getCustomerDebitNoteLink() {
		w2.until(ExpectedConditions.elementToBeClickable(CustomerDebitNoteLink));
		CustomerDebitNoteLink.click();
	}
	@FindBy(id = "btnCreateDebitNote")
	private WebElement CreateCustomerDebitNote;
	public void getCreateCustomerDebitNote() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateCustomerDebitNote));
		CreateCustomerDebitNote.click();
	}
	@FindBy(id = "lbtnCustName")
	private WebElement SelectCutomerNameLink;
	public void getSelectCutomerNameLink() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectCutomerNameLink));
		 SelectCutomerNameLink.click();
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
	@FindBy(css = "select#ddlReasonList")
	private WebElement ReasonDD;
	public WebElement getReasonDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ReasonDD));
		return ReasonDD;
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
	@FindBy(css = "select#ddlChargesList")
	private WebElement ChargeTypeDD;
	public WebElement getChargeTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ChargeTypeDD));
		return ChargeTypeDD;
	}
	
	@FindBy(id = "lnkBtnAdd")
	private WebElement AddRemoveTaxLink;
	public void getAddRemoveTaxLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AddRemoveTaxLink));
		 AddRemoveTaxLink.click();
	}
	@FindBy(css = "input#txtAmount")
	private WebElement CutomerDebitNoteAmount;
	public WebElement getCutomerDebitNoteAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNoteAmount));
		return CutomerDebitNoteAmount;
	}
	@FindBy(css = "input#txtUnitNo")
	private WebElement SearchForUnit;
	public WebElement getSearchForUnit() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchForUnit));
		return SearchForUnit;
	}
	@FindBy(css = "a#hlViewPaymentSchedule")
	private WebElement ViewPaymentSchedule;
	public void getViewPaymentSchedule() {
		w2.until(ExpectedConditions.elementToBeClickable(ViewPaymentSchedule));
		ViewPaymentSchedule.click();
	}
	
	@FindBy(css = "a#lbChangeStatus")
	private WebElement CutomerCreditNoteChangeStatus;
	public void getCutomerCreditNoteChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerCreditNoteChangeStatus));
		 CutomerCreditNoteChangeStatus.click();;
	}
	@FindBy(css = "select#ddlStatus")
	private WebElement CutomerDebitNoteStatusDD;
	public WebElement getCutomerDebitNoteStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNoteStatusDD));
		return CutomerDebitNoteStatusDD;
	}
	@FindBy(css = "a#lbUpdateStatus")
	private WebElement CutomerDebitNoteUpdateStatus;
	public void getCutomerDebitNoteUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNoteUpdateStatus));
		CutomerDebitNoteUpdateStatus.click();;
	}
	@FindBy(css = "textarea#txtRemarks")
	private WebElement CutomerDebitNoteStatusRemarks;
	public WebElement getCutomerDebitNoteStatusRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNoteStatusRemarks));
		return CutomerDebitNoteStatusRemarks;
	}
	@FindBy(id = "lblStatusVal")
	private WebElement CutomerDebitNoteCurrentStatus;
	public String getCutomerDebitNoteCurrentStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNoteCurrentStatus));
		return CutomerDebitNoteCurrentStatus.getText();
	}
	
	
	@FindBy(xpath = "//table[@id='gvSchedule']//tr[2]//td[2]//input")
	private WebElement ScheduleDate;
	public WebElement getScheduleDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ScheduleDate));
		return ScheduleDate;
	}
	@FindBy(xpath = "//table[@id='gvSchedule']//tr[2]//td[3]//input")
	private WebElement ScheduleAmount;
	public WebElement getScheduleAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ScheduleAmount));
		return ScheduleAmount;
	}
	@FindBy(id = "lblDisplayNoVal")
	private WebElement CutomerDebitNoteID;
	public String getCutomerDebitNoteID() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNoteID));
		return CutomerDebitNoteID.getText();
	}
	@FindBy(css = "input#btnCreate")
	private WebElement CutomerDebitNotecreate;
	public void getCutomerDebitNotecreate() {
		w2.until(ExpectedConditions.elementToBeClickable(CutomerDebitNotecreate));
		CutomerDebitNotecreate.click();
	}
	
	@FindBy(css = "#lbtnAddRow")
	private WebElement AddSchedule;
	public void getAddSchedule() {
		w2.until(ExpectedConditions.elementToBeClickable(AddSchedule));
		AddSchedule.click();
	}
	@FindBy(xpath = "//table[@id='chkListCharges']//tr//label")
	private List<WebElement> ChargesList;
	public List<WebElement> getChargesList() {
		return ChargesList;
	}
	

	@FindBy(css = "input#btnAddCharges")
	private WebElement AddTaxSubmit;
	public void getAddTaxSubmit() {
		w2.until(ExpectedConditions.elementToBeClickable(AddTaxSubmit));
		AddTaxSubmit.click();
	}
	
	
	public void MenuSubMenuCutomerDebitNote() throws Throwable {
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
	String CutomerDebitNoteDisplayNo;
	String DebitNoteCurrentStatus;
	public void CutomerDebitNoteCreation() throws Throwable{
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		System.out.println("Total Rows in Excel---"+sheet.getLastRowNum());
		for(i=1;i<=sheet.getLastRowNum();i++) {
			try {
		Frames.SubMenuFrame();
		getCustomerDebitNoteLink();
		Frames.rightFrame();
		getCreateCustomerDebitNote();
//		WebElement SearchByUnit = CustomerDebitNoteCreate.getSearchForUnit();
//		SearchByUnit.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
//		Thread.sleep(2000);
//		SearchByUnit.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1000);
//		SearchByUnit.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
		Thread.sleep(1000);
		getSelectCutomerNameLink();
		Thread.sleep(1000);
		try {
				WebElement frame = iDriver.findElement(By.cssSelector("iframe[class='cboxIframe']"));
				iDriver.switchTo().frame(frame);
			} catch (Exception e) {
				System.out.println(e);
			}
		Thread.sleep(1000);
		getEnetrCutomerName().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		getCutomerNameGo();
		Thread.sleep(1000);
		getSelectCutomerRadio();
		getSelectCutomerAcceptSelected();
		Frames.rightFrame();
		Thread.sleep(1000);
		appInd.singleDropDown(getReasonDD(), sheet.getRow(i).getCell(2).getStringCellValue());
		getCutomerDebitNoteAmount().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		appInd.singleDropDown(getProjectDD(), sheet.getRow(i).getCell(4).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSubProjectDD(), sheet.getRow(i).getCell(5).getStringCellValue());
		appInd.singleDropDown(getUnitDD(), sheet.getRow(i).getCell(6).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getChargeTypeDD(), sheet.getRow(i).getCell(7).getStringCellValue());
		//Adding Taxes
		getAddRemoveTaxLink();
		String TaxesCount=sheet.getRow(i).getCell(10).getStringCellValue();
		int CountTax=Integer.parseInt(TaxesCount);
		int chargecount=0;
		Thread.sleep(1000);
		int k=11;
		for(int l=1;l<=CountTax;l++) {
		for(int j=0;j<=getChargesList().size();j++) {
			chargecount++;
			String AdditionTax=sheet.getRow(i).getCell(k).getStringCellValue();
			System.out.println("AdditionTax//"+AdditionTax);
			System.out.println("getChargesList().get(j).getText()  "+getChargesList().get(j).getText());
			
			if(getChargesList().get(j).getText().equalsIgnoreCase(AdditionTax)) {
				System.out.println("chargecount///"+chargecount);
				iDriver.findElement(By.xpath("//table[@id='chkListCharges']//tr["+chargecount+"]//input")).click();
				k++;
				chargecount=0;
				break;
			}
		}
		Thread.sleep(1000);
		}
		getAddTaxSubmit();
			
		getAddSchedule();
		Thread.sleep(1500);
		appInd.seletDate(getScheduleDate(), appInd.getDateAsSpecified(0));
		getScheduleAmount().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		Thread.sleep(5000);
		getCutomerDebitNotecreate();
		Thread.sleep(5000);
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Cutomer DebitNote ","Not Created " , sheetname, Sales.OutPutCreatePath);
		}else {
			CutomerDebitNoteDisplayNo=getCutomerDebitNoteID();
			Datatable.writeExcel(CutomerDebitNoteDisplayNo,"Cutomer DebitNote Created" , sheetname, Sales.OutPutCreatePath);
			System.out.println("Cutomer DebitNote Created---"+CutomerDebitNoteDisplayNo);
			count++;
		}
			}catch (Exception e) {
				Datatable.writeExcel("Cutomer DebitNote ","Not Created Exception " , sheetname, Sales.OutPutCreatePath);
			}
		try {
		getCutomerCreditNoteChangeStatus();
		getCutomerDebitNoteStatusDD().sendKeys("Approved");
		getCutomerDebitNoteStatusRemarks().sendKeys("Sales Customer Debit Note is Approving through Automation");
		Thread.sleep(1000);
		getCutomerDebitNoteUpdateStatus();
		if(appInd.AlertPresent()) {
			if(iDriver.switchTo().alert().getText().equalsIgnoreCase("Status Updated Succesfully")) {
				appInd.isAlertPresent();
				
			}else {
				System.out.println("Status not updated alert---");
			}
		}
		DebitNoteCurrentStatus=getCutomerDebitNoteCurrentStatus();
		if(DebitNoteCurrentStatus.equalsIgnoreCase("Approved")) {
			Datatable.writeExcel(CutomerDebitNoteDisplayNo,"DebitNote is Approved" , sheetname, Sales.OutPutCreatePath);
			System.out.println(CutomerDebitNoteDisplayNo +"DebitNote is Approved");
		}else {
			Datatable.writeExcel(CutomerDebitNoteDisplayNo,"DebitNote is Not Approved" , sheetname, Sales.OutPutCreatePath);
			System.out.println(CutomerDebitNoteDisplayNo +"DebitNote is Not Approved");
		}
		}catch (Exception e) {
		Datatable.writeExcel(CutomerDebitNoteDisplayNo,"DebitNote is Not Approved Exception " , sheetname, Sales.OutPutCreatePath);
		System.out.println(CutomerDebitNoteDisplayNo +"DebitNote is Not Approved Exception");
		}
	}
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrentmethod,"PASS" , sheetname, Sales.OutPutCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod,"FAIL" , sheetname, Sales.OutPutCreatePath);
		}
	}

	
}
