package com.RE.Engineering.Createpages.ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.WorkorderAdvance_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Finance;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class WorkorderAdvance_Create extends WorkorderAdvance_Create_Test {
	public static WebDriver iDriver;
	public static String sheetname;
	public static Datatable xml;
	public static XSSFSheet sheet;
	int i=1;
	

	public WorkorderAdvance_Create (WebDriver oBrowser) {
		 iDriver = oBrowser;
		 PageFactory.initElements(iDriver, this);
		 sheetname = this.getClass().getSimpleName();
	}

//------------------Work order advance list page elements---------------//
	//Advance link
	@FindBy (xpath="//a[text()='Advance']")
	public WebElement advanceLink;
	public void advanceLinkClick() {
		w2.until(ExpectedConditions.elementToBeClickable(advanceLink));
		advanceLink.click();
	}
	
	//Create advance button
	@FindBy (css="input#btnCreateAdvance")
	public WebElement advanceCrtBtn;
	public void advanceCrtBtnClick() {
		w2.until(ExpectedConditions.elementToBeClickable(advanceCrtBtn));
		advanceCrtBtn.click();
	}
	
	//Project dropdown
	@FindBy (css="select#ddlProjectList")
	public WebElement projectDD;
	public WebElement getProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(projectDD));
		return projectDD;
	}	
	
	//Advance no field
	@FindBy (css="input#txtCertificateNo")
	public WebElement advanceNo;
	public WebElement getAdvanceNoField() {
		return advanceNo;
	}
	
	//advance no hyperlink
	@FindBy (xpath="//table[@id='gvAdvances']//tr[2]//a")
	public WebElement advanceNoHL;
	public void advanceNoHLClick() {
		w2.until(ExpectedConditions.elementToBeClickable(advanceNoHL));
		advanceNoHL.click();
	}
	
	// Go button
	@FindBy (css="input#btnListSearch")
	public WebElement goBtn;
	public void goBtnClick() {
		goBtn.click();
	}
	
//-----------------work order advance create page elements-------------//
	//Project dropdown
	@FindBy (css="select#ddlProject")
	public WebElement projectDDCreate;
	public WebElement getProjectDDCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(projectDDCreate));
		return projectDDCreate;
	}
	
	//Subproject dropdown
	@FindBy (css="select#ddlSubProject")
	public WebElement subProjectDDCreate;
	public WebElement getSubProjectDDCreate() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubProject']//option[2]")));
		return subProjectDDCreate;
	}
	
	//select hyperlink for workorder selection
	@FindBy (xpath="//a[text()='Select']")
	public WebElement WOSelectHL;
	public WebElement getWOSelectHL() {
		return WOSelectHL;
	}
	
		//work order number field
		@FindBy (xpath="//tr[@id='trWorkOrder']//td//input[@id='txtWorlOrder']")  //(//tr[@id='trWorkOrder']//td//input[@id='txtWorlOrder'])[1]
		public WebElement WONoField;
		public WebElement getWONoField() {
			w2.until(ExpectedConditions.elementToBeClickable(WONoField));
			return WONoField;
		}
		
		//Search button
		@FindBy (css="input#btnSearch")
		public WebElement searchBtn;
		public void searchBtnClick() {
			searchBtn.click();
		}
		
		//radio button
		@FindBy (xpath="(//table[@id='dvWorkOrderGrid']//input[@type='radio'])[1]")
		public WebElement radioButton;
		public void radioButtonClick() {
			w2.until(ExpectedConditions.elementToBeClickable(radioButton));
			radioButton.click();
		}
		
		//Accept Selected link
		@FindBy (xpath="//a[text()='Accept Selected']")
		public WebElement acceptSelected;
		public void acceptSelectedClick() {
			acceptSelected.click();
		}	
	
			
	// SAC/HSN code field
	@FindBy (css="input#txtSACCode")
	public WebElement SACCodeField;
	public WebElement getSACCodeField() {
		return SACCodeField;
	}
	
	// Bill/Invoice no field
	@FindBy (css="input#txtBillNo")
	public WebElement invoiceNoField;
	public WebElement getInvoiceNoField() {
		return invoiceNoField;
	}
	
	//Advance Type dropdown
	@FindBy (css="select#ddlAdvanceType")
	public WebElement advanceTypeDD;
	public WebElement getAdvanceTypeDD() {
		return advanceTypeDD;
	}
	
	// Bill/Invoice Date picker
	@FindBy (css="input#txtBillDate_txtDate")
	public WebElement invoiceDatePicker;
	public WebElement getInvoiceDatePicker() {
		return invoiceDatePicker;
	}
	
	//Certified amount field
	@FindBy (css="input#txtCertifiedAmount")
	public WebElement certAmtField;
	public WebElement getCertAmtField() {
		return certAmtField;
	}
	
	//payment due date picker
	@FindBy (css="input#txtdtdue_txtDate")
	public WebElement paymentDueDatePicker;
	public WebElement getPaymentDueDatePicker() {
		w2.until(ExpectedConditions.visibilityOf(paymentDueDatePicker));
		return paymentDueDatePicker;
	}
	
	//remarks textarea
	@FindBy (css="textarea#txtRemarks")
	public WebElement remarksTxtArea;
	public WebElement getRemarksTxtArea() {
		return remarksTxtArea;
	}
	
	//create button
	@FindBy (css="input#btnCreate")
	public WebElement createBtn;
	public void createBtnClick() {
		createBtn.click();
	}
	
//--------------------- work order view page elements ---------------//
	
	//modify button
	@FindBy (css="input#btnModify")
	public WebElement modifyBtn;
	public void modifyBtnClick() {
		w2.until(ExpectedConditions.elementToBeClickable(modifyBtn));
		modifyBtn.click();
	}
	
	//advance no label
	@FindBy (css="span#lblCertificateumber")
	public WebElement createdAdvNo;
	public String getCreatedAdvNo() {
		w2.until(ExpectedConditions.visibilityOf(createdAdvNo));
		return createdAdvNo.getText();
	}
	
	//change status link
	@FindBy (css="a#lbnChangeStatus")
	public WebElement changeStatLink;
	public void changeStatLinkClick() {
		w2.until(ExpectedConditions.visibilityOf(changeStatLink));
		changeStatLink.click();
	}
	
	//change status dropdown
	@FindBy (css="select#ddlStatus")
	public WebElement changeStatusDD;
	public WebElement getChangeStatusDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlStatus']//option[2]")));
		return changeStatusDD;
	}
	
	//remarks for status change
	@FindBy (css="textarea#txtStatusRemarks")
	public WebElement changeStatusRemarks;
	public WebElement getChangeStatusRemarks() {
		w2.until(ExpectedConditions.visibilityOf(changeStatusRemarks));
		return changeStatusRemarks;
	}
	
	//update status link
	@FindBy (css="a#lbnUpdateStatus")
	public WebElement updateStatLink;
	public void updateStatLinkClick() {
		w2.until(ExpectedConditions.visibilityOf(updateStatLink));
		updateStatLink.click();
	}
	
	//expected payment date picker
	@FindBy (css="input#dtExpectedPaymentDate_txtDate")
	public WebElement expPaymDate;
	public WebElement getExpPaymDate() {
		w2.until(ExpectedConditions.visibilityOf(expPaymDate));
		return expPaymDate;
	}
	
	


	
//------------------work order modify page elements----------------//
	
	//update button
	@FindBy (css="input#btnUpdate")
	public WebElement updateBtn;
	public void updateBtnClick() {
		w2.until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
	}
	
	
	
//----------------Finance approvals page elements------------------//
	
	//engineering third level menu link
	@FindBy (xpath="//a[text()='Engineering']")
	public WebElement enggLink;
	public void enggLinkClick() {
		w2.until(ExpectedConditions.elementToBeClickable(enggLink));
		enggLink.click();
	}
	
	//advance payment tab
	@FindBy (xpath="//a[text()='Adv. Payments']")
	public WebElement advPayTab;
	public void advPayTabClick() {
		w2.until(ExpectedConditions.elementToBeClickable(advPayTab));
		advPayTab.click();
	}
	
	//advance certificate tab page title 
	@FindBy (xpath="//span[contains(text(),'Advance Certificate List')]")
	public WebElement pageTitle;
	public WebElement getPageTitle() {
		w2.until(ExpectedConditions.visibilityOf(pageTitle));
		return pageTitle;
	}
	
	//status dropdown
	@FindBy (css="select#ddlStatus")
	public WebElement statusDD;
	public WebElement getStatusDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlStatus']//option[2]")));
		return statusDD;
	}
	
	//advance no field
	@FindBy (css="input#txtCertificateNo")
	public WebElement advCertNo;
	public WebElement getAdvCertNo() {
		return advCertNo;
	}
	
	//go button
	@FindBy (css="input#btnListSearch")
	public WebElement goBtnFinance;
	public void goBtnFinanceClick() {
		goBtnFinance.click();
	}
	
	//make bank payment link
	@FindBy (xpath="//a[@id='lbnMakeBankPayment']")
	public WebElement makeBankPayLink;
	public WebElement getMakeBankPayLink() {
		return makeBankPayLink;
	}
	
		//bank account dropdown
		@FindBy (css="select#ddlBankCash")
		public WebElement bankAccDD;
		public WebElement getBankAccDD() {
			return bankAccDD;
		}
		
		//instrument number field
		@FindBy (css="input#txtInstrumentNo")
		public WebElement instrNoField;
		public WebElement getInstrNoField() {
			return instrNoField;
		}
		
		//submit button
		@FindBy (css="input#btnSubmit")
		public WebElement submitBtn;
		public void submitBtnClick() {
			submitBtn.click();
		}
		
		//status field
		@FindBy (xpath="//span[@id='lblStatus']")
		public WebElement statusField;
		public String getStatus() {
			return statusField.getText();
		}
		
	
	//make cash payment link
	@FindBy (xpath="//a[@id='lbnMakeCashPayment']")
	public WebElement makeCashPayLink;
	public WebElement getCashBankPayLink() {
		return makeCashPayLink;
	}
	
		
	
	public void MenuSubMenu_WOAdvance(){
	try
	{
	 MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickBilling();
	 Thread.sleep(2000);
	 xml = new Datatable();
	 sheet = xml.excelData(sheetname,Engineering.inputCreatePath);
	 }
	 	catch (Exception e)
	 	{
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
	}
	
	String createdAdvanceNo;
	int statuscount;
	
	@SuppressWarnings("deprecation")
	public void WOAdvCreate() throws Throwable {
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int createcount=0, updatecount=0;
		
		System.out.println(sheet.getLastRowNum());
		for(;i<=sheet.getLastRowNum();i++) {
		try {
			MenuSubMenu_WOAdvance();
			Frames.SubMenuFrame();
			advanceLinkClick();
			Frames.rightFrame();
			advanceCrtBtnClick();
			appInd.singleDropDown(getProjectDDCreate(), appInd.convertCellToString(sheet, i, 0));
			appInd.singleDropDown(getSubProjectDDCreate(), appInd.convertCellToString(sheet, i, 1));
			
			//switching to workorder selection 
			String parent=appInd.switchToChildWindow(getWOSelectHL());			
			getWONoField().sendKeys(appInd.convertCellToString(sheet, i, 2));					
			searchBtnClick();			
			radioButtonClick();
			acceptSelectedClick();
			appInd.switchToParentWindow(parent);
			
			Frames.rightFrame();
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("lblInitialWOValue")));
			getSACCodeField().sendKeys(appInd.RandomNoAsSpecified(4));
			getInvoiceNoField().sendKeys("INV"+appInd.RandomNoAsSpecified(5));
			appInd.singleDropDown(getAdvanceTypeDD(),appInd.convertCellToString(sheet, i, 3));
			appInd.seletDate(getInvoiceDatePicker(),appInd.getDateAsSpecified(0)); //selecting current date in invoice date field
			iDriver.findElement(By.xpath("//body")).click();
			
			getCertAmtField().sendKeys(appInd.convertCellToString(sheet, i, 4));
			iDriver.findElement(By.xpath("//body")).click();
			
			List<WebElement> additionTaxlineItem = iDriver.findElements(By.xpath("//table[@id='grvTaxAdditionDetail']//tr"));
			System.out.println(additionTaxlineItem.size());
			if(additionTaxlineItem.size()>1) {
				for(int j=1;j<additionTaxlineItem.size();j++) {
					Thread.sleep(2000);
					iDriver.findElement(By.xpath("(//input[contains(@id,'txtTaxableAmount')])["+j+"]")).click();
//					Robot robo = new Robot();	    			
//					robo.keyPress(KeyEvent.VK_BACK_SPACE);	    								
//					robo.keyRelease(KeyEvent.VK_BACK_SPACE);
					iDriver.findElement(By.xpath("(//input[contains(@id,'txtTaxableAmount')])["+j+"]")).sendKeys(appInd.convertCellToString(sheet, i, 4));
					iDriver.findElement(By.xpath("//body")).click();
					Thread.sleep(1000);
					appInd.isAlertPresent();					
				}
			}
			
			Thread.sleep(2000);
			appInd.seletDate(getPaymentDueDatePicker(), appInd.getDateAsSpecified(0));
			getRemarksTxtArea().sendKeys("Created Through Automation");
			Thread.sleep(2000);
			createBtnClick();
			
//			if(appInd.alertText().equalsIgnoreCase("The vendor does not have GSTIN and the certificate does not have RCM taxes. Do you want to proceed?")) {
//				appInd.isAlertPresent();				
//			}
			if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			
			w2.until(ExpectedConditions.visibilityOf(modifyBtn));
			createdAdvanceNo = getCreatedAdvNo();
			
			if(appInd.AlertPresent()) {
				String alertText = appInd.alertText();
				Datatable.writeExcel("workorder advance", "Not Created::"+alertText, sheetname, Engineering.outputCreatePath);
			}
				else {
					Datatable.writeExcel("workorderadvance", "Adv Created::"+createdAdvanceNo, sheetname, Engineering.outputCreatePath);
					createcount++;
				}
			}		
					catch(Exception e) {
							System.out.println(e);
							Datatable.writeExcel("work order advance", "Not Created"+e, sheetname, Engineering.outputCreatePath);
					}
		
		
			

// modify and status change of above created work order advance		
		
		try {
			Frames.SubMenuFrame();
			advanceLinkClick();
			Frames.rightFrame();
			appInd.singleDropDown(getProjectDD(),appInd.convertCellToString(sheet, i, 0));
			//Thread.sleep(2000);
			
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlListSubProjectList']//option[2]")));  //to wait for list page refresh after selecting the project 
			getAdvanceNoField().sendKeys(createdAdvanceNo);
			Thread.sleep(1000);
			goBtnClick();
			advanceNoHLClick();
			//iDriver.findElement(By.xpath("//table[@id='gvAdvances']//a[text()='"+createdAdvanceNo+"']"));
			
			modifyBtnClick();
			w2.until(ExpectedConditions.visibilityOf(updateBtn));
						
			switch(i) {
			case 1: getInvoiceNoField().sendKeys("INV"+appInd.RandomNoAsSpecified(6));
					break;
			
			case 2: getRemarksTxtArea().clear();
					getRemarksTxtArea().sendKeys("Modified and updated through Automation");
					break;
					
			default:	break;
			}
			
			updateBtnClick();
			
//			if(appInd.alertText().equalsIgnoreCase("The vendor does not have GSTIN and the certificate does not have RCM taxes. Do you want to proceed?")) {
//				appInd.isAlertPresent();				
//			}
			
			if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			
			Thread.sleep(3000);
			for(int k=0;k<5;k++) {
				changeStatLinkClick();
				if(getChangeStatusDD().isDisplayed()) {
					break;
					}
			}
			appInd.singleDropDown(getChangeStatusDD(), "Approved");
			Thread.sleep(1000);
			getChangeStatusRemarks().sendKeys("Status changed to Approved");
			updateStatLinkClick();
			
			Thread.sleep(3000);
			for(int k=0;k<5;k++) {
				changeStatLinkClick();
				if(getChangeStatusDD().isDisplayed()) {
					break;
					}
			}			
			appInd.singleDropDown(getChangeStatusDD(), "Processed");
			Thread.sleep(1000);
			appInd.seletDate(getExpPaymDate(), appInd.getDateAsSpecified(0));
			getChangeStatusRemarks().sendKeys("Status changed to Processed");
			updateStatLinkClick();
			
			
		
			if(appInd.AlertPresent()) {
				String alertText = appInd.alertText();
				Datatable.writeExcel("workorder advance", "Modify Failed::"+alertText,sheetname, Engineering.outputCreatePath);
			}
				else {
					Datatable.writeExcel("workorderadvance", "Modified and Updated",sheetname, Engineering.outputCreatePath);
					updatecount++;
						}			
				}
					catch(Exception e){
							System.out.println(e);
							Datatable.writeExcel("workorder advance", "Modify Failed",sheetname, Engineering.outputCreatePath);
					}
			
		WOAdvancePayment();
			
							
		}
	
		
		if(createcount==sheet.getLastRowNum()) {
			Datatable.writeExcel("WO Advance Create", "PASS", sheetname, Engineering.outputCreatePath);
		}else {
			Datatable.writeExcel("WO Advance Create", "FAIL", sheetname, Engineering.outputCreatePath);
		}
		if(updatecount==sheet.getLastRowNum()) {
			Datatable.writeExcel("WO Advance Updation", "PASS", sheetname, Engineering.outputCreatePath);
		}else {
			Datatable.writeExcel("WO Advance Updation", "FAIL", sheetname, Engineering.outputCreatePath);
		}
			
	}
	
	
	public void WOAdvancePayment() throws Throwable {
		try
		{
		 Frames.MainMenuFrame();
		 MainMenu mm = new MainMenu(iDriver);
		 mm.clickFinance();
		 Thread.sleep(1000);
		 Finance en = new Finance(iDriver);
		 //en.clickFinApprovals();
		 Thread.sleep(1000);
		 }
		 	catch (Exception e)
		 	{
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: "+e);
		 	}
		
		try {
			Frames.SubMenuFrame();
			enggLinkClick();
			Frames.tabFrame();
			advPayTabClick();
			
			
			Frames.mainDnFrame();
			w2.until(ExpectedConditions.visibilityOf(pageTitle));
			appInd.singleDropDown(getProjectDD(), appInd.convertCellToString(sheet, i, 0));
			
			
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlListSubProjectList']//option[2]")));  //to wait for list page refresh after selecting the project 
			appInd.singleDropDown(getStatusDD(), "Processed");
			getAdvCertNo().sendKeys(createdAdvanceNo);
			goBtnFinanceClick();
			
			
			iDriver.findElement(By.xpath("//a[text()='"+createdAdvanceNo+"']")).click(); //finding the advance number hyper link and clicking on it
			
			Frames.mainDnFrame();			
			String financePay=appInd.switchToChildWindow(getMakeBankPayLink());			
			appInd.singleDropDown(getBankAccDD(), appInd.convertCellToString(sheet, i, 5));
			w2.until(ExpectedConditions.alertIsPresent());
			appInd.isAlertPresent();			
			getInstrNoField().sendKeys(appInd.RandomNoAsSpecified(4));
			submitBtnClick();
//			if(appInd.AlertPresent()) {
//				appInd.isAlertPresent();
//			}
			appInd.switchToParentWindow(financePay);
			Thread.sleep(1000);
			
			Frames.mainDnFrame();
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='bcWOAdvance_gvBankOrCash']//span[contains(@id,'lblBankOrCashItem')]"))); //waiting for visibility of details updated in payment details 
			if(getStatus().equalsIgnoreCase("Paid")) {
				Datatable.writeExcel("WO Advance Payment for "+createdAdvanceNo,"Paid", sheetname, Engineering.outputCreatePath);
				System.out.println("Payment Status::"+createdAdvanceNo+getStatus());
			}
			else {
				Datatable.writeExcel("WO Advance Payment for "+createdAdvanceNo,"Not Paid", sheetname, Engineering.outputCreatePath);
				System.out.println("Payment Status::"+createdAdvanceNo+getStatus());
			}
			
		}		
		catch(Exception e) {
			System.out.println(e);	
			Datatable.writeExcel("WO Advance Payment for "+createdAdvanceNo,"Not Paid", sheetname, Engineering.outputCreatePath);
			System.out.println("Payment Status::"+createdAdvanceNo+getStatus());
		}
	}

}