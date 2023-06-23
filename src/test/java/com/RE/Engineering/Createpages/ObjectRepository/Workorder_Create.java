package com.RE.Engineering.Createpages.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.Indent_Create_Test;
import com.RE.Engineering.Createpages.Test.Workorder_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Workorder_Create extends Workorder_Create_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	int i=1;
	public Workorder_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	//-----Engineering Project Details Page Elements-----//
	
	//projects link
	@FindBy(xpath="//a[text()='Projects']")
	public WebElement projectLink;
	public void projectLinkClick() {
		w2.until(ExpectedConditions.visibilityOf(projectLink));
		projectLink.click();
	}	
	//subproject text field
	@FindBy(id="txtSubProject")
	public WebElement subProjectField;
	public WebElement getSubprojectField() {
		return subProjectField;
	}	
	//Clicking on subproject hyperlink
	@FindBy(xpath="(//table[@class='in4-table']//a)[2]")
	public WebElement subprojectHL;
	public void subprojectHLClick() {
		w2.until(ExpectedConditions.visibilityOf(subprojectHL));
		 subprojectHL.click();
	}	
	//go button
	@FindBy(css="input#btnGo")
	public WebElement goBtn;
	public void goBtnClick() {
		goBtn.click();
	}
	//workorder tab
	@FindBy(xpath="//td[text()='Work Order']")
	public WebElement workordertab;
	public void workorderTabClick() {
		w2.until(ExpectedConditions.visibilityOf(workordertab));
		workordertab.click();
	}
	
	//------ workorder list page elements----- //
	//create button
	@FindBy(id="btnCreateDotNet")
	public WebElement createWOBtn;
	public void creatWOBtnClick() {
		createWOBtn.click();
	}
	//go button
	@FindBy(css="input#btnFilterGO")
	public WebElement goBtnList;
	public void goBtnListClick() {
		w2.until(ExpectedConditions.visibilityOf(goBtnList));
		goBtnList.click();
	}
	//workorder number field
	@FindBy(css="input#txtFilterWorkOrder")
	public WebElement WOnoField;
	public WebElement getWONoField() {
		w2.until(ExpectedConditions.visibilityOf(WOnoField));
		return WOnoField;
	}
	//work order number hyperlink after searching
	@FindBy(xpath="(//table[@class='in4-table']//td//a)[1]")
	public WebElement WOnoHL;
	public void WOnoHLClick() {
		w2.until(ExpectedConditions.visibilityOf(WOnoHL));
		WOnoHL.click();
	}
	
	//-----work order create page elements-----//
	
	//WO currency type DD
	@FindBy(id="ddlWOCurrencyType")
	public WebElement WOcurrencyDD;
	public WebElement getWOcurrencyDD() {
		return WOcurrencyDD;
	}
	//WO scope DD
	@FindBy(id="ddlWorkorderscope")
	public WebElement WOscopeyDD;
	public WebElement getWOscopeDD() {
		return WOscopeyDD;
	}
	//WO type DD
	@FindBy(css="select#ddlWorkorderType")
	public WebElement WOtypeDD;
	public WebElement getWOtypeDD() {
		return WOtypeDD;
	}
	//work category DD
	@FindBy(css="select#ddlCategoryist")
	public WebElement workCatDD;
	public WebElement getWorkCatDD() {
		return workCatDD;
	}
	//work subcategory DD
	@FindBy(id="ddlSubCategoryList")
	public WebElement workSubCatDD;
	public WebElement getWorkSubCatDD() {
		return workSubCatDD;
	}
	//contractor select link
	@FindBy(xpath="//div[@id='updtPnlContractor']//a//b")
	public WebElement selectContHL;
	public WebElement selectContHL() {
		return selectContHL;
	}
	//work order payment from
	@FindBy(id="ddlCtWOPaymentFrom")
	public WebElement WOPayFrom;
	public WebElement WOPayFromDD() {
		return WOPayFrom;
	}
	
			
		//contractor select popup		
		@FindBy(css="input#btnFilterGO")
		public WebElement contrPopGoBtn;
		public WebElement getContrPopGoBtn() {
		return contrPopGoBtn;
		}		
		// contractor name selection	
		@FindBy(xpath="//table[@id='gvFirmList']//a[1]")
		public WebElement contractorHL;
		public void contractorHLClick() {
		 contractorHL.click();
		}
		
	
	
	//scope of work text area
	@FindBy(css="textarea#txtCtScopeOfWork")
	public WebElement scopeofWorkTxtArea;
	public WebElement getScopeofWorkTxtArea() {
		return scopeofWorkTxtArea;
	}
	//work description text area
	@FindBy(css="textarea#txtCtWorkDescription")
	public WebElement workDescTxtArea;
	public WebElement getWorkDescTxtArea() {
		return workDescTxtArea;
	}
	//From date picker
	@FindBy(id="dtpCtFromDt_txtDate")
	public WebElement fromDatePicker;
	public WebElement getFromDatePicker() {
		return fromDatePicker;
	}
	//To date picker
	@FindBy(id="dtpCtToDt_txtDate")
	public WebElement toDatePicker;
	public WebElement getToDatePicker() {
		return toDatePicker;
	}
	
	
	
	
	//----Tax addition Grid----///
	@FindBy(css="a#lnkAddNewTaxAddition")
	public WebElement addNewTaxAdd;
	public void addNewTaxAddLinkClick() {
		addNewTaxAdd.click();
	}
	//Tax category dropdown1
	@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[2]//select")
	public WebElement taxCategoryDD;
	public WebElement getTaxCatDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='in4-table']//tr[2]//td[2]//select//option[2]")));
		return taxCategoryDD;
	}
	//Tax dropdown2
	@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[3]//select")
	public WebElement taxDD;
	public WebElement getTaxDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='in4-table']//tr[2]//td[3]//select/option[2]")));
		return taxDD;
	}
	//Tax Type dropdown3
	@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[5]//select")
	public WebElement taxTypeDD;
	public WebElement getTaxTypeDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='in4-table']//tr[2]//td[5]//select//option[2]")));
		return taxTypeDD;
	}
	//% work order value field
	@FindBy(xpath="(//table[@class='in4-table']//tr[2]//td[6]//input)[1]")
	public WebElement percentofWOvalue;
	public WebElement getPercentOfWOValueField() {
		return percentofWOvalue;
	}
	
	
	//Tax deduction grid elements
		@FindBy(css="a#lnkAddNewTaxDeduction")
		public WebElement addNewDedTax;
		public void getAddNewDedTaxClick() {
			addNewDedTax.click();
		}
		
		//Tax category dropdown1
		@FindBy(xpath="//table[@id='grvTaxDeductionDetail']//td[2]//select")
		public WebElement dedTaxCategoryDD;
		public WebElement getDedTaxCatDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='grvTaxDeductionDetail']//td[2]//select//option[2]")));
			return dedTaxCategoryDD;
		}
		//Tax dropdown2
		@FindBy(xpath="//table[@id='grvTaxDeductionDetail']//td[3]//select")
		public WebElement dedTaxDD;
		public WebElement getDedTaxDD() {
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='grvTaxDeductionDetail']//td[3]//select/option[2]")));
			return dedTaxDD;
		}
		
	
	//create button
	@FindBy(id="btnCtCreate")
	public WebElement createBtn;
	public void createBtnClick() {
		createBtn.click();
	}
	
	
	
	
//---- Work order View page Elements-----//
	
	//view page title
	@FindBy(id="lblCreatePageTitle")
	public WebElement viewPageTitle;
	public WebElement getViewPageTitle() {
		return viewPageTitle;
	}
	
	//work order no field element to get work order number
	@FindBy(id="lblvwWONo")
	public WebElement WOnumber;
	public String getWOnumber() {
		return WOnumber.getText();
	}
	//BOQ tab link
	@FindBy(id="lnkWorkOrderBOQs")
	public WebElement BOQlink;
	public void BOQlinkClick() {
		BOQlink.click();
	}
	//Add boq link
	@FindBy(id="lnkAddNewBOQs")
	public WebElement addBOQlink;
	public WebElement getaddBOQLink() {
		return addBOQlink;
	}
	//Modify button
	@FindBy(id="btnvwModify")
	public WebElement modifyBtn;
	public void modifyBtnClick() {
		modifyBtn.click();
	}
	
	//status field element
	@FindBy(id="lblvwStatus")
	public WebElement getStatus;
	public String getCurrentStatus() {
		return getStatus.getText();
	}
	
	//Change status link	
	@FindBy(css="a#lnkChangeStatus")
	public WebElement changeStatusLink;
	public void changeStatusLinkClick() {
		changeStatusLink.click();
	}
	
	//change status dropdown
	@FindBy(css="select#ddlUpdateStatusList")
	public WebElement changeStatusDD;
	public WebElement changeStatusDD() {
		w2.until(ExpectedConditions.visibilityOf(changeStatusDD));
		return changeStatusDD;
	}
	
	//update status link
	@FindBy(css="a#lnkUpdateStatus")
	public WebElement updateStatusLink;
	public void updateStatusLinkClick() {
		w2.until(ExpectedConditions.visibilityOf(updateStatusLink));
		updateStatusLink.click();
	}
	
	//Status change Remarks text area
	@FindBy(css="textarea#txtStatusRemarks")
	public WebElement remarksTxtArea;
	public WebElement getRemarksTxtArea() {
		w2.until(ExpectedConditions.visibilityOf(remarksTxtArea));
		return remarksTxtArea;
	}
	
	
	
	
	
	
//--- Add BOQ popup window -----//
	//BOQ ID field
	@FindBy(id="txtFilterBoqId")
	public WebElement BOQIdfield;
	public WebElement getBOQIdfield() {
		w2.until(ExpectedConditions.visibilityOf(BOQIdfield));
		return BOQIdfield;
	}
	//Go button in add boq popup
	@FindBy(css="input#btnFilterGO")
	public WebElement goBtnAddBOQ;
	public void goBtnAddBOQClick() {		
		goBtnAddBOQ.click();
	}
	//check all -checkbox
	@FindBy(xpath="//table[@id='tblWorkOrderBoqItems']//th//input")
	public WebElement selectAllCheckBox;
	public void selectAllCheckBoxClick() {
		w2.until(ExpectedConditions.visibilityOf(selectAllCheckBox));
		selectAllCheckBox.click();
	}
	// Quantity field
	@FindBy(xpath="(//tr[@class='rowBOQ']//tr//td[5]//input)[1]")
	public WebElement qtyField;
	public WebElement getQtyField() {
		return qtyField;
	}
	//Rate Field
	@FindBy(xpath="(//tr[@class='rowBOQ']//tr//td[6]//input)[1]")
	public WebElement rateField;
	public WebElement getRateField() {
		return rateField;
	}
	//add button
	@FindBy(id="btnAddBoqs")
	public WebElement addBtn;
	public void addBtnClick() {
		addBtn.click();
	}
	
//-- Workorder modify page---//
	//discount type dropdown
	@FindBy(id="ddlEdtDiscountType")
	public WebElement discountTypeDD;
	public WebElement getDiscTypeDD() {
		return discountTypeDD;
	}
	//mobilization percent
	@FindBy(id="txtEdtMobilizationAdvPerc")
	public WebElement mobilizationPercent;
	public WebElement getMobiliPercent() {
		return mobilizationPercent;
	}
	//update button
	@FindBy(id="btnEdtUpdate")
	public WebElement updateBtn;
	public void updateBtnClick() {
		updateBtn.click();
	}
	
	
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.getProjectsLink();
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
	
	String createdWONo;

	public void workordercreate() throws Throwable {
	    	    
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0, num=0, updatecount=0;
		System.out.println(sheet.getLastRowNum());
	    for(;i<=sheet.getLastRowNum();i++)	{
	    	try {
	    		Frames.rightFrame();
	    		w2.until(ExpectedConditions.visibilityOf(subProjectField));
	    		getSubprojectField().sendKeys(appInd.convertCellToString(sheet, i, 1));
	    		goBtnClick();
	    		Thread.sleep(1000);
	    		subprojectHLClick();
	    		Thread.sleep(1000);
	    		Frames.tabFrame();
	    		workorderTabClick();
	    		Thread.sleep(1000);
	    		Frames.contentFrame();
	    		w2.until(ExpectedConditions.visibilityOf(createWOBtn));
	    		creatWOBtnClick();
	    		//appInd.singleDropDown(getWOcurrencyDD(),(appInd.convertCellToString(sheet, i, 2)));
	    		//appInd.singleDropDown(getWOscopeDD(),(appInd.convertCellToString(sheet, i, 3)));
	    		//appInd.singleDropDown(getWOtypeDD(),(appInd.convertCellToString(sheet, i, 4)));
	    		appInd.singleDropDown(getWorkCatDD(),(appInd.convertCellToString(sheet, i, 5)));
	    		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubCategoryList']//option[2]")));	    				
	    		appInd.singleDropDown(getWorkSubCatDD(),(appInd.convertCellToString(sheet, i, 6)));
	    		appInd.singleDropDown(WOPayFromDD(),appInd.convertCellToString(sheet, i, 7));
	    		
	    		String WOpage = appInd.switchToChildWindow(selectContHL());
	    		w2.until(ExpectedConditions.visibilityOf(contrPopGoBtn));
	    		contractorHLClick();	    		
	    		appInd.switchToParentWindow(WOpage);
	    		
	    		//Thread.sleep(2000);
	    		Frames.contentFrame();
	    		getScopeofWorkTxtArea().sendKeys("Created through automation");
	    		getWorkDescTxtArea().sendKeys("Created through automation");
	    		addNewTaxAddLinkClick();
	    		Thread.sleep(2000);
	    		appInd.singleDropDown(getTaxCatDD(),(appInd.convertCellToString(sheet, i, 8)));
	    		appInd.singleDropDown(getTaxDD(),(appInd.convertCellToString(sheet, i, 9)));
	    		Thread.sleep(2000);
	    		appInd.singleDropDown(getTaxTypeDD(),(appInd.convertCellToString(sheet, i, 10)));
	    		getPercentOfWOValueField().clear();
	    		getPercentOfWOValueField().sendKeys("100");
	    		Thread.sleep(2000);
	    		
	    		getAddNewDedTaxClick();
	    		appInd.singleDropDown(getDedTaxCatDD(),(appInd.convertCellToString(sheet, i, 14)));
	    		appInd.singleDropDown(getDedTaxDD(),(appInd.convertCellToString(sheet, i, 15)));
	    		Thread.sleep(2000);
	    		createBtnClick();
	    		
	    		
	    		w2.until(ExpectedConditions.textToBePresentInElement(viewPageTitle,"View Work Order"));
	    		createdWONo= getWOnumber();
	    		BOQlinkClick();
	    		String BOQparent = appInd.switchToChildWindow(getaddBOQLink());
	    		getBOQIdfield().sendKeys(appInd.convertCellToString(sheet, i, 11));
	    		goBtnAddBOQClick();
	    		selectAllCheckBoxClick();
	    		getQtyField().clear();
	    		getQtyField().sendKeys(appInd.convertCellToString(sheet, i, 12));
	    		getRateField().clear();
	    		getRateField().sendKeys(appInd.convertCellToString(sheet, i, 13));
	    		addBtnClick();
	    		appInd.switchToParentWindow(BOQparent);
	    		  		
	    		
	    		
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("WO:NA", "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			projectLinkClick();
		}else {
			Datatable.writeExcel("WO: "+createdWONo, "Created", sheetname, Engineering.outputCreatePath);
			count++;
		}
  }
	    catch (Exception e) {
		    System.out.println(e);
			Datatable.writeExcel("WO:NA", "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			projectLinkClick();
	}	
	    	
	    		    	
	// modify and update the above created workorder
	    	
	    	try{
	    		Frames.SubMenuFrame();
	    		projectLinkClick();
	    		Frames.rightFrame();
	    		w2.until(ExpectedConditions.visibilityOf(subProjectField));
	    		getSubprojectField().sendKeys(appInd.convertCellToString(sheet, i, 1));
	    		goBtnClick();
	    		subprojectHLClick();
	    		//Thread.sleep(1000);
	    		Frames.tabFrame();
	    		workorderTabClick();
	    		//Thread.sleep(1000);
	    		Frames.contentFrame();
	    		getWONoField().sendKeys(createdWONo);
	    		//Thread.sleep(1000);
	    		goBtnListClick();
	    		Thread.sleep(2000);
	    		WOnoHLClick();						    		
	    		w2.until(ExpectedConditions.visibilityOf(modifyBtn));
	    		modifyBtnClick();
	    		switch(i) {
				
				case 1: appInd.singleDropDown(getDiscTypeDD(),appInd.convertCellToString(sheet, 1, 17));
						break;
				case 2: getMobiliPercent().clear();
						Thread.sleep(1000);
						getMobiliPercent().sendKeys(appInd.convertCellToString(sheet, 2, 17));
						break;
	    		}
	    		Thread.sleep(2000);
	    		updateBtnClick();
	    		if(appInd.AlertPresent()){
	    			appInd.isAlertPresent();
	    			}
	    		if(appInd.AlertPresent()) {
	    			Datatable.writeExcel(createdWONo, "Modify Failed", sheetname, Engineering.outputCreatePath);
	    			Frames.SubMenuFrame();
	    			projectLinkClick();
	    		}else {
	    			Datatable.writeExcel(createdWONo, "Modified and Updated", sheetname, Engineering.outputCreatePath);
	    			updatecount++;
	    			Frames.SubMenuFrame();
	    			projectLinkClick();
	    			}
	    	}
	    		catch (Exception e) {
		    		System.out.println(e);
				Datatable.writeExcel(createdWONo, "Modify Failed"+e, sheetname, Engineering.outputCreatePath);
				Frames.SubMenuFrame();
				projectLinkClick();
	    		
	    		}	    	
	    	
	    
	    
	// status change of above modified workorder
	    try{
    		Frames.SubMenuFrame();
    		projectLinkClick();
    		Frames.rightFrame();
    		w2.until(ExpectedConditions.visibilityOf(subProjectField));
    		getSubprojectField().sendKeys(appInd.convertCellToString(sheet, i, 1));
    		goBtnClick();
    		Thread.sleep(1000);
    		//w2.until(ExpectedConditions.visibilityOf(subprojectHL));
    		subprojectHLClick();
    		//Thread.sleep(1000);
    		Frames.tabFrame();
    		workorderTabClick();
    		//Thread.sleep(1000);
    		Frames.contentFrame();
    		getWONoField().sendKeys(createdWONo);
    		//Thread.sleep(1000);
    		goBtnListClick();
    		Thread.sleep(2000);
    		WOnoHLClick();						    		
    		w2.until(ExpectedConditions.visibilityOf(changeStatusLink));
    		
    		changeStatusLinkClick();
    		appInd.singleDropDown(changeStatusDD(),"Submitted");
    		getRemarksTxtArea().sendKeys("Changing Status to Submitted");
    		updateStatusLinkClick();
    		appInd.isAlertPresent();
    		Thread.sleep(2000);
    		
    		changeStatusLinkClick();
    		appInd.singleDropDown(changeStatusDD(),"Approved");
    		getRemarksTxtArea().sendKeys("Changing Status to Approved");
    		updateStatusLinkClick();
    		appInd.isAlertPresent();
    		Thread.sleep(2000);
    		
    		
    		if(getCurrentStatus().equalsIgnoreCase("Approved")) {
    			Datatable.writeExcel(createdWONo, "Status Changed", sheetname, Engineering.outputCreatePath);
    			Frames.SubMenuFrame();
    			projectLinkClick();
    			}
    		else {
    			Datatable.writeExcel(createdWONo, "Status Change Failed", sheetname, Engineering.outputCreatePath);
    			Frames.SubMenuFrame();
    			projectLinkClick();
    			}
    	}
    		catch (Exception e) {
	    		System.out.println(e);
			Datatable.writeExcel(createdWONo, "Status Change Failed", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			projectLinkClick();
    		
    		}	    	
	    }
      	
	   
	    System.out.println("Total workorder created: "+count);
    	if (sheet.getLastRowNum()==count) 
    	{ 
    		Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
    	}
    	if (sheet.getLastRowNum()==updatecount) 
    	{ 
    		Datatable.writeExcel("WO Edit", "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel("WO Edit", "FAIL", sheetname, Engineering.outputCreatePath);
    	}
    }
    	
}
	


	
	
	
	
	
	
