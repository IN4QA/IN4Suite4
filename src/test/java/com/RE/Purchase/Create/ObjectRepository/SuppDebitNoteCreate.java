package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Purchase.Create.Test.SuppDebitNoteCreate_Test;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class SuppDebitNoteCreate extends SuppDebitNoteCreate_Test{
	public static WebDriver iDriver;
	public static Datatable xml;
	public static XSSFSheet sheet;
	public static String sheetname;
	int i =1;
	public SuppDebitNoteCreate(WebDriver obrowser) {
		iDriver=oBrowser;
		PageFactory.initElements(iDriver, this);
		sheetname=this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Supplier Debit Note']")
	private WebElement SuppDNlink;
	public void getSuppDNlink() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNlink));
		SuppDNlink.click();
	}
	@FindBy(id = "btnCreateDebitNew")
	private WebElement SuppDNCreate;
	public void getSuppDNCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNCreate));
		SuppDNCreate.click();
	}
	
	@FindBy(css = "select#ddlCertifyingCompany")
	private WebElement SuppDNCertComp;
	public WebElement getSuppDNCertComp() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNCertComp));
		return SuppDNCertComp;
	}
	
	
	@FindBy(id = "ddlPayingCompanyProvider")
	private WebElement SuppDNPayingComp;
	public WebElement getSuppDNPayingComp() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNPayingComp));
		return SuppDNPayingComp;
	}

	@FindBy(xpath = "//tr[@id='trProject']//button")
	private WebElement SuppDNProject;
	public WebElement getSuppDNProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNProject));
		return SuppDNProject;
	}
	@FindBy(xpath = "//tr[@id='trProject']//input[@placeholder='Search']")
	private WebElement SuppDNEnterProject;
	public WebElement getSuppDNEnterProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNEnterProject));
		return SuppDNEnterProject;
	}
	@FindBy(xpath = "//tr[@id='trProject']//li")
	private List<WebElement> SuppDNListOfProject;
	public List<WebElement> getSuppDNListOfProject() {
		return SuppDNListOfProject;
	}
	
	@FindBy(xpath = "//tr[@id='trSubProject']//button")
	private WebElement SuppDNSubProject;
	public WebElement getSuppDNSubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNSubProject));
		return SuppDNSubProject;
	}
	@FindBy(xpath = "//tr[@id='trSubProject']//input[@placeholder='Search']")
	private WebElement SuppDNEnterSubProject;
	public WebElement getSuppDNEnterSubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNEnterSubProject));
		return SuppDNEnterSubProject;
	}
	@FindBy(xpath = "//tr[@id='trSubProject']//li")
	private List<WebElement> SuppDNListOfSubProject;
	public List<WebElement> getSuppDNListOfSubProject() {
		return SuppDNListOfSubProject;
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
	private WebElement SearchAdvPO;
	public void getSearchAdvPO() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchAdvPO));
		SearchAdvPO.click();
	}
	

	
	@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input")
	private WebElement SuppDNPO_Radio;
	public void getSuppDNPO_Radio() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNPO_Radio));
		SuppDNPO_Radio.click();
	}
	
	@FindBy(css = "a#btnAcceptSelected")
	private WebElement SuppDN_PO_selected;
	public void getSuppDN_PO_selected() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDN_PO_selected));
		SuppDN_PO_selected.click();
	}
	

	@FindBy(css = "input#txtinvoice")
	private WebElement SuppDNInvNo;
	public WebElement getSuppDNInvNo() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNInvNo));
	return	SuppDNInvNo;
	}

	@FindBy(css = "select#ddlReasonType")
	private WebElement SuppDNReasonTypeDD;
	public WebElement getSuppDNReasonTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNReasonTypeDD));
	return	SuppDNReasonTypeDD;
	}
	
	
	@FindBy(css = "input#txtDebitNoteAmt")
	private WebElement SuppDNAmount;
	public WebElement getSuppDNAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNAmount));
	return	SuppDNAmount;
	}
	
	@FindBy(css = "input#dtDebitNoteDate_txtDatePicker")
	private WebElement SuppDNDate;
	public WebElement getSuppDNDate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNDate));
	return	SuppDNDate;
	}
	
	@FindBy(css = "input#txtdebitnotedate_txtDatePicker")
	private WebElement SuppDNDateEdit;
	public WebElement getSuppDNDateEdit() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNDateEdit));
	return	SuppDNDateEdit;
	}
	@FindBy(xpath = "//textarea[@id='txtRemarks']")
	private WebElement SuppDNremarks;
	public WebElement getSuppDNremarks() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNremarks));
	return	SuppDNremarks;
	}
	
	@FindBy(css = "input#chkTaxImpact")
	private WebElement SuppDNTaxImpact;
	public void getSuppDNTaxImpact() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNTaxImpact));
		SuppDNTaxImpact.click();;
	}
	
	@FindBy(xpath = "//div[@id='upMaterialDetailsEdit']//tr[2]//td[5]//input[1]")
	private WebElement SuppDNPOQty;
	public WebElement getSuppDNPOQty() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNPOQty));
	return	SuppDNPOQty;
	}
	
	@FindBy(xpath = "//a[text()='Add Rate/Tax']")
	private WebElement SuppDNAddRateNTax;
	public WebElement getSuppDNAddRateNTax() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNAddRateNTax));
	return	SuppDNAddRateNTax;
	}
	
	@FindBy(css = "input#txtUnitRate")
	private WebElement SuppDN_rateperUOM;
	public WebElement getSuppDN_rateperUOM() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDN_rateperUOM));
	return	SuppDN_rateperUOM;
	}
	@FindBy(css = "input#btnCalculate")
	private WebElement SuppDNCaluRate;
	public void getSuppDNCaluRate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNCaluRate));
		SuppDNCaluRate.click();
	}
	@FindBy(css = "input#btnSave")
	private WebElement SuppDBsaveRate;
	public void getSuppDNsaveRate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDBsaveRate));
		SuppDBsaveRate.click();
	}
	
	@FindBy(css = "input#btnCreate")
	private WebElement SuppDNcreateButton;
	public void getSuppDNcreateButton() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNcreateButton));
		SuppDNcreateButton.click();
	}
	
	
	@FindBy(id = "lblDebitNoteDisplayID")
	private WebElement SuppDN_ID;
	public String getSuppDN_ID() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDN_ID));
		return SuppDN_ID.getText() ;
	}
	
	@FindBy(id = "btnModify")
	private WebElement SuppDNModifyButton;
	public void getSuppDNModifyButton() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNModifyButton));
		SuppDNModifyButton.click();
	}
	
	@FindBy(id = "btnUpdate")
	private WebElement SuppDNUpdateButton;
	public void getSuppDNUpdateButton() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNUpdateButton));
		SuppDNUpdateButton.click();
	}
	
	@FindBy(xpath = "//a[text()='Change Status']")
	private WebElement SuppDNChangeStatus;
	public void getSuppDNChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNChangeStatus));
		SuppDNChangeStatus.click();
	}
	
	@FindBy(css = "select#ddlStatus")
	private WebElement SuppDNStatusDD;
	public WebElement getSuppDNStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNStatusDD));
		return SuppDNStatusDD;
	}
	@FindBy(css = "input#txtProcesseddate_txtDatePicker")
	private WebElement SuppDNprocessDate;
	public WebElement getSuppDNprocessDate() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNprocessDate));
		return SuppDNprocessDate;
	}
	
	@FindBy(xpath = "//a[text()='Update Status']")
	private WebElement SuppDNUpdateStatus;
	public void getSuppDNUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(SuppDNUpdateStatus));
		SuppDNUpdateStatus.click();
	}
	public void MenuSubMenuSuppDN() throws Throwable{
		try {
		MainMenu mm=new MainMenu(iDriver);
		mm.clickPurchase();
		Purchase en=new Purchase(iDriver);
		en.clickPayments();
		 xml=new Datatable();
		 sheet=xml.excelData(sheetname,Purchase.InputCreatePath);
	}
	catch (Exception e)
 	{
	e.printStackTrace();
	System.out.println("Module, Sub module click case Failed: "+e);
 	}
	}
	
	String SuppDNID;
	public void SuppDebitNoteCreation() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int updatecount=0;
			System.out.println("Total Rows in Excel --"+sheet.getLastRowNum());
			for(i=1;i<=sheet.getLastRowNum();i++){
				try {	
				Frames.SubMenuFrame();
				Thread.sleep(1000);
				getSuppDNlink();
				Frames.rightFrame();
				Thread.sleep(1000);
				getSuppDNCreate();
				appInd.singleDropDown(getSuppDNCertComp(), sheet.getRow(i).getCell(0).getStringCellValue());
				Thread.sleep(1000);
				getSuppDNProject().click();
				Thread.sleep(1000);
				appInd.createMultiDD_withText(getSuppDNProject(), getSuppDNEnterProject(), sheet.getRow(i).getCell(1).getStringCellValue(), getSuppDNListOfProject());
				//appInd.singleDropDown(getSuppDNPayingComp(), sheet.getRow(i).getCell(2).getStringCellValue());
				
				
				getSuppDNSubProject().click();
				Thread.sleep(2000);
				appInd.createMultiDD_withText(getSuppDNSubProject(), getSuppDNEnterSubProject(), sheet.getRow(i).getCell(3).getStringCellValue(), getSuppDNListOfSubProject());
				
				String ParentSelectPO=appInd.switchToChildWindow(SelectPOlink);
				getPO_NumDD().click();
				Thread.sleep(1000);
				appInd.createMultiDD_withText(getPO_NumDD(), getEnterSuppDNEnterPO(), sheet.getRow(i).getCell(4).getStringCellValue(), getSuppDNListOfPO());
				getSearchAdvPO();
				getSuppDNPO_Radio();
				getSuppDN_PO_selected();
				appInd.switchToParentWindow(ParentSelectPO);
				Frames.rightFrame();
				Thread.sleep(1000);
				getSuppDNInvNo().sendKeys("INVNo"+appInd.RandomNoAsSpecified(3));
				appInd.singleDropDown(getSuppDNReasonTypeDD(), sheet.getRow(i).getCell(5).getStringCellValue());
				Thread.sleep(1000);
				//getSuppDNAmount().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
				appInd.seletDate(getSuppDNDate(), appInd.getDateAsSpecified(0));
				Thread.sleep(1000);
				getSuppDNTaxImpact();
				Thread.sleep(1000);
				getSuppDNPOQty().clear();
				Thread.sleep(1000);
				getSuppDNPOQty().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
				String ParentAddRateTax=appInd.switchToChildWindow(SuppDNAddRateNTax);
				getSuppDN_rateperUOM().clear();
				if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
				}
				getSuppDN_rateperUOM().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
				getSuppDNCaluRate();
				getSuppDNsaveRate();
				appInd.switchToParentWindow(ParentAddRateTax);
				Frames.rightFrame();
				getSuppDNremarks().sendKeys("Supplier Debit Note Created Through Automation");
				Thread.sleep(2000);
				getSuppDNcreateButton();
				Thread.sleep(1000);
				appInd.isAlertPresent();
				Thread.sleep(1000);
				 SuppDNID=getSuppDN_ID();
				if(appInd.AlertPresent()) {
					Datatable.writeExcel("Supplier Debit Note", "Not Created", sheetname, Purchase.OutputCreatePath);
				}else {
					Datatable.writeExcel(SuppDNID, " Created", sheetname, Purchase.OutputCreatePath);
					count++;
				}
				}catch (Exception e) {
					Datatable.writeExcel("Supplier Debit Note", "Not Created Exception", sheetname, Purchase.OutputCreatePath);
						}
			System.out.println("Supplie DN "+SuppDNID+"  Created");
			getSuppDNModifyButton();
			Thread.sleep(1000);
			switch (i) {
			case 1:
					String ParentAddRateTax=appInd.switchToChildWindow(SuppDNAddRateNTax);
					getSuppDN_rateperUOM().clear();
					if(appInd.AlertPresent()) {
					appInd.isAlertPresent();
					}
					getSuppDN_rateperUOM().sendKeys(sheet.getRow(1).getCell(11).getStringCellValue());
					getSuppDNCaluRate();
					getSuppDNsaveRate();
					appInd.switchToParentWindow(ParentAddRateTax);
					Frames.rightFrame();
					getSuppDNremarks().clear();
					Thread.sleep(1000);
				    getSuppDNremarks().sendKeys("Supplier Debit Note Modified & Updated Through Automation");
				
				break;
				
			case 2:
				String ParentAddRateTax2=appInd.switchToChildWindow(SuppDNAddRateNTax);
				getSuppDN_rateperUOM().clear();
				if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
				}
				getSuppDN_rateperUOM().sendKeys(sheet.getRow(2).getCell(11).getStringCellValue());
				getSuppDNCaluRate();
				getSuppDNsaveRate();
				appInd.switchToParentWindow(ParentAddRateTax2);
				Frames.rightFrame();
				getSuppDNremarks().clear();
				Thread.sleep(2000);
			    getSuppDNremarks().sendKeys("Supplier Debit Note Modified & Updated Through Automation");
			    Thread.sleep(2000);
			    appInd.seletDate(getSuppDNDateEdit(),appInd.getDateAsSpecified(1));
				break;
				
			case 3:
				//Modified and Updated without Editing
				break;
				
			default:
				break;
			}
		Thread.sleep(2000);
		getSuppDNUpdateButton();
		
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Supplier Debit Note", "Not Updated", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(SuppDNID, " Updated", sheetname, Purchase.OutputCreatePath);
			updatecount++;
		}
		System.out.println("Supplie DN "+SuppDNID+"  Updated");
		
		getSuppDNChangeStatus();
		Thread.sleep(1000);
		getSuppDNStatusDD().sendKeys("Approved");
		Thread.sleep(1000);
		getSuppDNUpdateStatus();
		Thread.sleep(1000);
		getSuppDNChangeStatus();
		Thread.sleep(1000);
		getSuppDNStatusDD().sendKeys("Processed");Thread.sleep(1000);
		appInd.seletDate(getSuppDNprocessDate(), appInd.getDateAsSpecified(0));
		getSuppDNUpdateStatus();
		Thread.sleep(1000);
		
		System.out.println("Supplie DN "+SuppDNID+"  Status Changed");
		}
			if(count==sheet.getLastRowNum()) {
				Datatable.writeExcel("Supplier Debit Note Creation", "PASS", sheetname, Purchase.OutputCreatePath);
			}else {
				Datatable.writeExcel("Supplier Debit Note Creation", "PASS", sheetname, Purchase.OutputCreatePath);
			}
			if(updatecount==sheet.getLastRowNum()) {
				Datatable.writeExcel("Supplier Debit Note Creation", "PASS", sheetname, Purchase.OutputCreatePath);
			}else {
				Datatable.writeExcel("Supplier Debit Note Creation", "PASS", sheetname, Purchase.OutputCreatePath);
			}
			
			
	}
}

