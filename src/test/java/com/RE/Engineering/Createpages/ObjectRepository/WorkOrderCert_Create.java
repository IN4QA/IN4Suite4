package com.RE.Engineering.Createpages.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.WorkOrderCert_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Finance;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class WorkOrderCert_Create extends WorkOrderCert_Create_Test {
	public static WebDriver iDriver;
	public static String sheetname;
	public static Datatable xml;
	public static XSSFSheet sheet;
	int i=1;
	

	public WorkOrderCert_Create (WebDriver oBrowser) {
		 iDriver = oBrowser;
		 PageFactory.initElements(iDriver, this);
		 sheetname = this.getClass().getSimpleName();
	}

//------------------Work order certificate list page elements---------------//
	//WO certificate menu link
	@FindBy (xpath="//a[text()='Work Order']")
	public WebElement WOmenulink;
	public void WOmenulinkClick() {
		w2.until(ExpectedConditions.elementToBeClickable(WOmenulink));
		WOmenulink.click();
	}
	
	//project dropdown
	@FindBy (css="select#ddlProjectList")
	public WebElement projectDDList;
	public WebElement getProjectDDList() {
		w2.until(ExpectedConditions.elementToBeClickable(projectDDList));
		return projectDDList;
	}

	//certificate number field
	@FindBy (css="input#txtCertificateNo")
	public WebElement certNoField;
	public WebElement getCertNoField() {
		w2.until(ExpectedConditions.elementToBeClickable(certNoField));
		return certNoField;
	}
	
	//go button
	@FindBy (css="input#btnFilterGO")
	public WebElement goBtn;
	public void goBtnClick() {
		w2.until(ExpectedConditions.elementToBeClickable(goBtn));
		goBtn.click();
	}
	
	//WO certificate create button
	@FindBy (css="input#btnCreateDotNet")
	public WebElement certCreateBtn;
	public void certCreateBtnClick() {
		w2.until(ExpectedConditions.elementToBeClickable(certCreateBtn));
		certCreateBtn.click();
	}
	
	//clicking on certificate Hyperlink
	@FindBy (xpath="//a[contains(@id,'ViewCertificateDotNet')]")
	public WebElement certHL;
	public void certHLClick() {
		w2.until(ExpectedConditions.elementToBeClickable(certHL));
		certHL.click();
	}
	
//-------------work order certificate create page elements---------------------//
	
	//project dropdown
	@FindBy (css="select#ddlProject")
	public WebElement projectDDCreate;
	public WebElement getProjectDDCreate() {
		w2.until(ExpectedConditions.elementToBeClickable(projectDDCreate));
		return projectDDCreate;
	}
	
	//subproject dropdown
	@FindBy (css="select#ddlSubProject")
	public WebElement subProjectDDCreate;
	public WebElement getSubProjectDDCreate() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubProject']//option[2]")));
		return subProjectDDCreate;
	}
	
	//select workorder hyperlink
	@FindBy (css="a#lbnSelectWO")
	public WebElement selectWOlink;
	public WebElement getSelectWOlink() {
		return selectWOlink;
	}
	
		//workorder number field
		@FindBy (css="input#txtWorlOrder")
		public WebElement WOnumberField;
		public WebElement getWOnumberField() {
			return WOnumberField;
		}
	
		//search button
		@FindBy (css="input#btnSearch")
		public WebElement searchBtn;
		public void searchBtnClick() {
			searchBtn.click();
		}
		
		//clicking of radio button
		@FindBy (xpath="//table[@id='dvWorkOrderGrid']//input")
		public WebElement radioBtn;
		public void radioBtnClick() {
			w2.until(ExpectedConditions.elementToBeClickable(radioBtn));
			radioBtn.click();
		}
		
		//accept selected link
		@FindBy (xpath="//a[text()='Accept Selected']")
		public WebElement acceptSeleLink;
		public void acceptSeleLinkClick() {
			acceptSeleLink.click();
		}
		
	//type of certificate dropdown
	@FindBy (css="select#ddlCertificateType")
	public WebElement certTypeDD;
	public WebElement getCertTypeDD() {
		return certTypeDD;
	}	
	
	//sac code field
	@FindBy (css="input#txtSACCode")
	public WebElement SACCode;
	public WebElement getSACCode() {
		return SACCode;
	}
	
		
	//invoice amount field
	@FindBy (css="input#txtInvoiceAmt")
	public WebElement invoiceAmt;
	public WebElement getInvoiceAmt() {
		w2.until(ExpectedConditions.visibilityOf(invoiceAmt));
		return invoiceAmt;
	}
	
	//invoice number field
	@FindBy (css="input#txtInvoiceNo")
	public WebElement invoiceNo;
	public WebElement getInvoiceNo() {
		w2.until(ExpectedConditions.visibilityOf(invoiceAmt));
		return invoiceNo;
	}
	
	//E-Invoice dropdown
	@FindBy (css="select#ddlValidatedEInvoice")
	public WebElement EInvoiceDD;
	public WebElement getEInvoiceDD() {
		return EInvoiceDD;
	}
	
	//invoice date picker
	@FindBy (css="input#dtInvoiceDate_txtDate")
	public WebElement invoiceDatePicker;
	public WebElement getInvoiceDatePicker() {
		w2.until(ExpectedConditions.elementToBeClickable(invoiceDatePicker));
		return invoiceDatePicker;
	}
	
	//invoice date picker
	@FindBy (css="input#dtAbstractDate_txtDate")
	public WebElement abstDatePicker;
	public WebElement getAbstDatePicker() {
		w2.until(ExpectedConditions.elementToBeClickable(abstDatePicker));
		return abstDatePicker;
	}
	
	//Add BOQ Link
	@FindBy (xpath="//a[text()='Add BOQ']")
	public WebElement addBOQLink;
	public WebElement getAddBOQLink() {
		w2.until(ExpectedConditions.elementToBeClickable(addBOQLink));
		return addBOQLink;
	}
	
		//subproject dropdown
		@FindBy (css="select#ddlFilterSubProject")
		public WebElement subProjDDBOQ;
		public WebElement getSubProjDDBOQ() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlFilterSubProject']//option[2]")));
			return subProjDDBOQ;
		}
	
		//work category dropdown
		@FindBy (css="select#ddlFilterWorkCategory")
		public WebElement workcatDD;
		public WebElement getWorkCatDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlFilterWorkCategory']//option[2]")));
			return workcatDD;
		}
		
		
		//show BOQ button
		@FindBy (css="input#btnShowBOQs")
		public WebElement showBOQBtn;
		public void showBOQBtnClick() {
			w2.until(ExpectedConditions.elementToBeClickable(showBOQBtn));
			showBOQBtn.click();
		}
		
		//save and continue button
		@FindBy (css="input#btnSaveAndContinue")
		public WebElement saveandContinueBtn;
		public void saveandContinueBtnClick() {
			saveandContinueBtn.click();
		}
		
		//update button
		@FindBy (css="input#btnSubmit")
		public WebElement updateBtn;
		public void updateBtnClick() {
			updateBtn.click();
		}
		
		//Tax deduction grid
			//add new link
			@FindBy (xpath="//a[@id='lbnAddRow']")
			public WebElement addNewLink;
			public void addNewLinkClick() {
				addNewLink.click();
			}
			
			//tax category dropdown
			@FindBy (xpath="//table[@id='gvTaxDeduction']//select[contains(@id,'ddlTaxCategory')]")
			public WebElement taxCatDD;
			public WebElement getTaxCatDD() {
				return taxCatDD;
			}
			
			//tax dropdown
			@FindBy (xpath="(//table[@id='gvTaxDeduction']//select[contains(@id,'ddlTax')])[2]")
			public WebElement taxDD;
			public WebElement getTaxDD() {
				w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='gvTaxDeduction']//td[3]//select//option[2]")));
				return taxDD;
			}
		
		//other deduction field
		@FindBy (css="input#txtOtherDeductions")
		public WebElement otherDed;
		public WebElement getOtherDed() {
			return otherDed;
		}	
		
		//payment mode dropdown
		@FindBy (css="select#ddlPaymentMode")
		public WebElement paymentModeDD;
		public WebElement getPaymentModeDD() {
			return paymentModeDD;
		}	
		
		//payment due date picker
		@FindBy (css="input#dtPaymentDueDate_txtDate")
		public WebElement payDueDatePicker;
		public WebElement getPayDueDatePicker() {
			return payDueDatePicker;
		}
		
		//payment due date picker
		@FindBy (css="input#dtExpectedPaymentDate_txtDate")
		public WebElement expPayDatePicker;
		public WebElement getExpPayDatePicker() {
			return expPayDatePicker;
		}
	
		//remarks text area
		@FindBy (css="textarea#txtRemarks")
		public WebElement remarkTxtArea;
		public WebElement getRemarkTxtArea() {
			return remarkTxtArea;
		}
	
		//create button
		@FindBy (css="input#btnCreate")
		public WebElement createBtn;
		public void createBtnClick() {
			w2.until(ExpectedConditions.visibilityOf(createBtn));
			createBtn.click();
		}
		
		
		
//--------------work order certificate view page elements---------------//
		//modify button
		@FindBy (css="input#btnModify")
		public WebElement modifyBtn;
		public void modifyBtnClick() {
			modifyBtn.click();
		}
		
		//certificate number field
		@FindBy (css="span#lblDisplayNo")
		public WebElement certNo;
		public String getCertNo() {
			return certNo.getText();
		}
		

//--------------work order certificate edit page elements-----------------//
		//update button
		@FindBy (css="input#btnUpdate")
		public WebElement updateBtnEdit;
		public void updateBtnEditClick() {
			updateBtnEdit.click();
		}
		
		//change status link
		@FindBy (css="a#lbnChangeStatus")
		public WebElement changeStatusLink;
		public void changeStatusLinkClick() {
			w2.until(ExpectedConditions.visibilityOf(changeStatusLink));
			changeStatusLink.click();
		}
		
		//change status dropdown
		@FindBy (css="select#ddlStatus")
		public WebElement changeStatusDD;
		public WebElement getChangeStatusDD() {
			w2.until(ExpectedConditions.visibilityOf(changeStatusDD));
			return changeStatusDD;
		}
		
		//status change remarks
		@FindBy (css="textarea#txtStatusRemarks")
		public WebElement changeStatusRemarks;
		public WebElement getChangeStatusRemarks() {
			return changeStatusRemarks;
		}
		
		//update status link
		@FindBy (css="a#lbnUpdateStatus")
		public WebElement updateStatusLink;
		public void updateStatusLinkClick() {
			updateStatusLink.click();
		}
		
//---------------------Finance module elements--------------------------//
		//engineering third level menu link
		@FindBy (xpath="//a[text()='Engineering']")
		public WebElement enggLink;
		public void enggLinkClick() {
			w2.until(ExpectedConditions.elementToBeClickable(enggLink));
			enggLink.click();
		}
		
		//status dropdown
		@FindBy (css="select#ddlStatusList")
		public WebElement statusDD;
		public WebElement getStatusDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlStatusList']//option[2]")));
			return statusDD;
		}
		
		//WO payment tab
		@FindBy (xpath="//a[text()='WO Payments']")
		public WebElement WOPaymentTab;
		public void WOPaymentTabClick() {
			w2.until(ExpectedConditions.elementToBeClickable(WOPaymentTab));
			WOPaymentTab.click();
		}
		
		
		
		//certificate tab page title 
		@FindBy (xpath="//span[contains(text(),'Work Order Certificate List')]")
		public WebElement pageTitle;
		public WebElement getPageTitle() {
			w2.until(ExpectedConditions.visibilityOf(pageTitle));
			return pageTitle;
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
		
		
		
		public void MenuSubMenu_WOCert(){
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
		
		
		
		String createdCertNo;
		public void WOCertCreate() throws Throwable {

			String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
			int createcount=0, updatecount=0;
			
			System.out.println(sheet.getLastRowNum());
			for(;i<=sheet.getLastRowNum();i++) {
				
//			try {
				MenuSubMenu_WOCert();
				Frames.SubMenuFrame();
				WOmenulinkClick();
				Frames.rightFrame();
				certCreateBtnClick();
				appInd.singleDropDown(getProjectDDCreate(),appInd.convertCellToString(sheet, i, 0));
				appInd.singleDropDown(getSubProjectDDCreate(), appInd.convertCellToString(sheet, i, 1));
				
				//switching to work order select popup and performing action there
				Thread.sleep(1000);
				String WOselect=appInd.switchToChildWindow(getSelectWOlink());
				getWOnumberField().sendKeys(appInd.convertCellToString(sheet, i, 2));
				searchBtnClick();
				radioBtnClick();
				acceptSeleLinkClick();				
				appInd.switchToParentWindow(WOselect); //switching back to parent window
				
				Frames.rightFrame();
				getSACCode().sendKeys(appInd.RandomNumbers(4));
				appInd.singleDropDown(getCertTypeDD(), appInd.convertCellToString(sheet, i, 3));
				Thread.sleep(1000);
				getInvoiceAmt().sendKeys(appInd.convertCellToString(sheet, i, 4));
				getInvoiceNo().sendKeys("INV-"+appInd.RandomNoAsSpecified(5));
				
				appInd.seletDate(getInvoiceDatePicker(), appInd.getDateAsSpecified(0));
				Thread.sleep(1000);
				appInd.seletDate(getAbstDatePicker(), appInd.convertCellToString(sheet, i, 5));
				Thread.sleep(1000);
				
				//switching to add BOQ popup
				for(int n=0;n<2;n++) {
				String BOQselect=appInd.switchToChildWindow(getAddBOQLink());
				showBOQBtnClick();
				
				w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='grvWOPaymentBOQItems']")));
							
				int boqline=0;
				List<WebElement> boqNolist = iDriver.findElements(By.xpath("//table[@id='grvWOPaymentBOQItems']//td[4]")); 	    	
		    	System.out.println(boqNolist.size()); 
		    	for(int j = 0;j<boqNolist.size();j++) {
		    		boqline++;
		    		if(boqNolist.get(j).getText().equals(appInd.convertCellToString(sheet, i, 6))) {
		    			System.out.println("BOQ ID::"+appInd.convertCellToString(sheet, i, 6));
		    			System.out.println(boqNolist.get(j).getText());
		    			boqline=boqline+1;
		    			System.out.println(boqline);
		    			
		    			//entering this certificate amount
		    			iDriver.findElement(By.xpath("//table[@id='grvWOPaymentBOQItems']//tr["+boqline+"]//td[10]//input")).clear();
		    			iDriver.findElement(By.xpath("//table[@id='grvWOPaymentBOQItems']//tr["+boqline+"]//td[10]//input")).sendKeys(appInd.convertCellToString(sheet, i, 7));
		    			break;
				
		    			}	
				}
		    	Thread.sleep(2000);
		    	updateBtnClick();
		    	appInd.switchToParentWindow(BOQselect);
		    	Frames.rightFrame();
		    	}
		    	
		   		    	
		    	Frames.rightFrame();		    	
//		    	addNewLinkClick();
//		    	appInd.singleDropDown(getTaxCatDD(),appInd.convertCellToString(sheet, i, 8));
//		    	appInd.singleDropDown(getPaymentModeDD(), appInd.convertCellToString(sheet, i, 9));
		    	appInd.seletDate(getPayDueDatePicker(), appInd.getDateAsSpecified(-2));
		    	appInd.seletDate(getExpPayDatePicker(), appInd.getDateAsSpecified(-2));
		    	getRemarkTxtArea().sendKeys("Created through automation");
		    	Thread.sleep(2000);
		    	
		    	createBtnClick();
		    	Thread.sleep(2000);
		    	if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(2000);
		    	}
		    	
		    	if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(2000);
		    	}
		    	
		    	if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(2000);
		    	}
		    	
		    	w2.until(ExpectedConditions.visibilityOf(modifyBtn));
		    	createdCertNo=getCertNo();
		    	
		    	
		    	
		    	if(appInd.AlertPresent()) {
					String alertText = appInd.alertText();
					Datatable.writeExcel("workorder cert", "Not Created::"+alertText, sheetname, Engineering.outputCreatePath);
				}
					else {
						Datatable.writeExcel("workordercert", "Cert Created::"+createdCertNo, sheetname, Engineering.outputCreatePath);
						createcount++;
					}
//				}		
//						catch(Exception e) {
//								System.out.println(e);
//								Datatable.writeExcel("work order cert", "Not Created"+e, sheetname, Engineering.outputCreatePath);
//						}
			
				
			
			
			
//modify and update of workorder certificate created above
			
//			try {
				Frames.SubMenuFrame();
				WOmenulinkClick();
				Frames.rightFrame();
				appInd.singleDropDown(getProjectDDList(), appInd.convertCellToString(sheet, i, 0));
				w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubProjectList']//option[2]")));
				getCertNoField().sendKeys(createdCertNo);
				Thread.sleep(1000);
				goBtnClick();
				
				w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+createdCertNo+"']")));
				iDriver.findElement(By.xpath("//a[text()='"+createdCertNo+"']")).click(); //clicking on the certificate number hyper link
				w2.until(ExpectedConditions.visibilityOf(modifyBtn));
				
				modifyBtnClick();
				w2.until(ExpectedConditions.visibilityOf(updateBtnEdit));
				
				switch(i) {
				
				case 1: getSACCode().clear();
						getSACCode().sendKeys(appInd.RandomNoAsSpecified(4));
						break;
						
				case 2: getInvoiceNo().clear();
						getInvoiceNo().sendKeys(appInd.RandomNoAsSpecified(6));
						break;
				
				case 3: appInd.singleDropDown(getPaymentModeDD(), appInd.convertCellToString(sheet, 1, 10));
						break;
						
				default:
						break;
							
				}
				
				getRemarkTxtArea().clear();
				getRemarkTxtArea().sendKeys("Modified through automation");
				updateBtnEditClick();
				Thread.sleep(2000);
				if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(1000);
				}
		    	
				if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(1000);
		    	}
				
				if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(2000);
		    	}
				
				try{
						if(updateBtnEdit.isDisplayed()) {
						updateBtnEditClick();
							}
					}
						catch(Exception e) {
							System.out.println(e);
						}
				
					
				w2.until(ExpectedConditions.visibilityOf(modifyBtn));
		    	
				for(int k=0;k<5;k++) {
					changeStatusLinkClick();
					if(getChangeStatusDD().isDisplayed()) {
						break;
						}
				}
				appInd.singleDropDown(getChangeStatusDD(), "Approved");
				Thread.sleep(1000);
				getChangeStatusRemarks().sendKeys("Status changed to Approved");
				updateStatusLinkClick();
				Thread.sleep(1000);
				if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(1000);
		    	}
				
				Thread.sleep(1000);
				changeStatusLinkClick();			
				appInd.singleDropDown(getChangeStatusDD(), "Processed");
				Thread.sleep(1000);
				getChangeStatusRemarks().sendKeys("Status changed to Processed");
				updateStatusLinkClick();
				Thread.sleep(1000);
				if(appInd.AlertPresent()) {
		    		appInd.isAlertPresent();
		    		Thread.sleep(1000);
		    	}
					
		    	
				if(appInd.AlertPresent()) {
					String alertText = appInd.alertText();
					Datatable.writeExcel("workorder cert", "Modify Failed::"+alertText,sheetname, Engineering.outputCreatePath);
				}
					else {
						Datatable.writeExcel("workordercert", "Modified and Updated",sheetname, Engineering.outputCreatePath);
						updatecount++;
							}			
//					}
//						catch(Exception e){
//								System.out.println(e);
//								Datatable.writeExcel("workorder cert", "Modify Failed",sheetname, Engineering.outputCreatePath);
//						}
			
				WOCertPayment();
			}
			
			if(createcount==sheet.getLastRowNum()) {
				Datatable.writeExcel("WO Cert Create", "PASS", sheetname, Engineering.outputCreatePath);
			}else {
				Datatable.writeExcel("WO Cert Create", "FAIL", sheetname, Engineering.outputCreatePath);
			}
			if(updatecount==sheet.getLastRowNum()) {
				Datatable.writeExcel("WO Cert Updation", "PASS", sheetname, Engineering.outputCreatePath);
			}else {
				Datatable.writeExcel("WO Cert Updation", "FAIL", sheetname, Engineering.outputCreatePath);
			}
			
			
}
		
		
		public void WOCertPayment() throws Throwable {
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
			
//				try {
					Frames.SubMenuFrame();
					enggLinkClick();
					
					Frames.rightFrame();					
					Frames.mainDnFrame();
					w2.until(ExpectedConditions.visibilityOf(pageTitle));
					appInd.singleDropDown(getProjectDDList(),appInd.convertCellToString(sheet, i, 0));
					w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubProjectList']//option[2]")));
					getCertNoField().sendKeys(createdCertNo);
					appInd.singleDropDown(getStatusDD(), "Processed");
					Thread.sleep(2000);
					goBtnClick();
					
					w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+createdCertNo+"']")));
					iDriver.findElement(By.xpath("//a[text()='"+createdCertNo+"']")).click(); //clicking on the certificate number hyper link
					w2.until(ExpectedConditions.visibilityOf(makeBankPayLink));
					
					Frames.mainDnFrame();			
					String financePay=appInd.switchToChildWindow(getMakeBankPayLink());			
					appInd.singleDropDown(getBankAccDD(), appInd.convertCellToString(sheet, i, 8));
					w2.until(ExpectedConditions.alertIsPresent());
					appInd.isAlertPresent();			
					getInstrNoField().sendKeys(appInd.RandomNoAsSpecified(4));
					submitBtnClick();
					try {
						if(appInd.AlertPresent()) {
							appInd.isAlertPresent();
						}
						Thread.sleep(2000);
						if(appInd.AlertPresent()) {
							appInd.isAlertPresent();
						}
						Thread.sleep(2000);
						appInd.switchToParentWindow(financePay);
						Thread.sleep(1000);
					}
						catch (Exception e)	{
						Thread.sleep(2000);
						appInd.switchToParentWindow(financePay);
						Thread.sleep(1000);
						}
					
					Frames.mainDnFrame();
					w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='bcWOCertificate_gvBankOrCash']//span[contains(@id,'lblModeOfPayment')]"))); //waiting for visibility of details updated in payment details 
					if(getStatus().equalsIgnoreCase("Paid")) {
						Datatable.writeExcel("WO cert Payment for "+ createdCertNo,"Paid", sheetname, Engineering.outputCreatePath);
						System.out.println("Payment Status--"+ createdCertNo +getStatus());
					}
					else {
						Datatable.writeExcel("WO cert Payment for "+ createdCertNo,"Not Paid", sheetname, Engineering.outputCreatePath);
						System.out.println("Payment Status--"+ createdCertNo +getStatus());
					}
													
//			}
//					catch (Exception e) {
//						System.out.println(e);
//						Datatable.writeExcel("WO cert Payment for "+ createdCertNo,"Not Paid", sheetname, Engineering.outputCreatePath);
//						System.out.println("Payment Status--"+ createdCertNo +getStatus());
//					}
//			
		}


}
				
		
		
		
