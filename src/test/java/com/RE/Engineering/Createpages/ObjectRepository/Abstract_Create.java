package com.RE.Engineering.Createpages.ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.Abstract_Create_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;
import Utilities.AppIndependentMethods;

public class Abstract_Create extends Abstract_Create_Test{


	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;

	public Abstract_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	
//------Abstract List page Elements----//
	
	//Abstract submenu link
	@FindBy(xpath="//a[text()='Abstracts']")
	public WebElement abstractLink;
	public void abstractLinkClick() {
		w2.until(ExpectedConditions.visibilityOf(abstractLink));
		abstractLink.click();
	}
	
	//Project dropdown
	@FindBy(css="select#ddlProjectList")
	public WebElement projectDD;
	public WebElement getProjectDD() {
		w2.until(ExpectedConditions.visibilityOf(projectDD));
		return projectDD;
	}
	
	//Subproject dropdown
	@FindBy(css="select#ddlSubProjectList")
	public WebElement subprojectDD;
	public WebElement getSubProjectDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlSubProjectList']//option[2]")));
		return subprojectDD;
	}
	
	//create abstract button
	@FindBy(css="input#btnCreate")
	public WebElement createAbstBtn;
	public void createAbstBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(createAbstBtn));
		createAbstBtn.click();
	}	
	
	//Go button
	@FindBy(css="input#btnFilterGO")
	public WebElement goBtn;
	public void goBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(createAbstBtn));
		goBtn.click();
	}
	
	
//----- Create page elements -----//
	
	//work category dropdown
	@FindBy(id="ddlWorkCategoryList")
	public WebElement workCatDD;
	public WebElement getWorkCatDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlWorkCategoryList']//option[2]")));
		return workCatDD;
	}
		
	//work subcategory dropdown
	@FindBy(id="ddlWorkSubCategoryList")
	public WebElement workSubCatDD;
	public WebElement getWorkSubCatDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlWorkSubCategoryList']//option[2]")));
		return workSubCatDD;
	}
		
	//workorder dropdown
	@FindBy(css="select#ddlWorkOrderList")
	public WebElement workorderDD;
	public WebElement getWorkorderDD() {
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlWorkOrderList']//option[2]")));
		return workorderDD;
	}
		
	//Reference/Bill number field
	@FindBy(css="input#txtRefBillNo")
	public WebElement billNo;
	public WebElement getBillNo() {
		return billNo;
	}	
		
	//work order value label
	@FindBy(css="span#lblWOValue")
	public WebElement woValueLabel;
	public WebElement getWOValueLabel() {
		w2.until(ExpectedConditions.visibilityOf(woValueLabel));
		return woValueLabel;
	}
	
	//Abstract date picker
	@FindBy(css="input#dtPicAbstractDate_txtDate")
	public WebElement abstractDatePicker;
	public WebElement getAbstractDatePicker() {
		 return abstractDatePicker;
	}
	
		//BOQ Filters elements
	//work category dropdown
	@FindBy(xpath="(//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
	public WebElement boqWorkCatDD;
	public WebElement getBOQWorkCatDD() {
		return boqWorkCatDD;
	}
	
	//work subcategory dropdown
	@FindBy(xpath="(//button[@class='multiselect dropdown-toggle btn btn-default'])[2]")
	public WebElement boqSubWorkCatDD;
	public WebElement getBOQSubWorkCatDD() {
		return boqSubWorkCatDD;
	}
	
	//search textbox in work category dropdown
	@FindBy(xpath="//input[@class='form-control multiselect-search']")
	public WebElement searchTxtWorkCatDD;
	public WebElement getSearchTxtWorkCatDD() {
		return searchTxtWorkCatDD;
	}
	
	
	
	//Go button
	@FindBy(css="input#btnGo")
	public WebElement createGoBtn;
	public void createGoBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(createGoBtn));
		createGoBtn.click();
	}
	
	//subproject checkbox
	@FindBy(xpath="(//table[@class='in4-table-boq']//td//input)[1]")
	public WebElement subProjChkBox;
	public WebElement getSubProjChkBox() {
		w2.until(ExpectedConditions.visibilityOf(subProjChkBox));
		return subProjChkBox;
	}
	
	//next button
	@FindBy(css="input#btnNext")
	public WebElement nextBtn;
	public void nextBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(nextBtn));
		nextBtn.click();
	}
	
	//save and continue button
	@FindBy(css="input#btnSaveAndContinue")
	public WebElement savecontBtn;
	public void savecontBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(savecontBtn));
		savecontBtn.click();
	}
	
	//This bill item qty field
	@FindBy(xpath="(//tr[@class='rowSubBOQ']//td[9]//input[contains(@id,'ThisBillItemQty')])[1]")
	public WebElement billItemQtyField;
	public WebElement getBillItemQtyField() {
		w2.until(ExpectedConditions.visibilityOf(billItemQtyField));
		return billItemQtyField;
	}
	
	//Finish button
	@FindBy(css="input#Button2")
	public WebElement finishBtn;
	public void finishBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(finishBtn));
		finishBtn.click();
	}
	
	//To get Abstract display number
	@FindBy(css="span#lblAbstractDisplayNo")
	public WebElement abstDispNo;
	public String getAbstDispNo() {
		w2.until(ExpectedConditions.visibilityOf(abstDispNo));
		return abstDispNo.getText();
	}
		
	//close button
	@FindBy(css="input#btnClose")
	public WebElement closeBtn;
	public void closeBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(closeBtn));
		closeBtn.click();
	}
	
	//work start date picker
	@FindBy(id="gvAbstratItems_ctl06_dtWorkStartDt_txtDatee")
	public WebElement fromdate;
	public WebElement getFromDate() {
		w2.until(ExpectedConditions.visibilityOf(fromdate));
		return fromdate;
	}
	

	

//---view page elements---//
	//Items button
	@FindBy(css="input#btnItems")
	public WebElement itemsBtn;
	public void itemsBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(itemsBtn));
		itemsBtn.click();
	}
	
	//modify item button
	@FindBy(id="Button3")
	public WebElement modifyItemBtn;
	public void modifyItemBtnClick() {
		w2.until(ExpectedConditions.visibilityOf(modifyItemBtn));
		modifyItemBtn.click();
	}

//---Edit page elements ---//
	//status dropdown
	@FindBy(id="ddlStatusList")
	public WebElement statusDD;
	public WebElement getStatusDD() {
		w2.until(ExpectedConditions.visibilityOf(statusDD));
		return statusDD;
	}
	
	//status remarks text area
	@FindBy(id="txtItemApproverRemarks")
	public WebElement statusRemarksTxtArea;
	public WebElement getStatusRemarksTxtArea() {
		return statusRemarksTxtArea;
	}
	
	//status update text element
	@FindBy(id="lblSaveStatus")
	public WebElement statusUpdateTxt;
	public WebElement getStatusUpdateTxt() {
		return statusUpdateTxt;
	}
	
	
		
	
	
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickSiteActivity();
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
	
	String abstractDisplayNo;
	int backDate;
	String CreateAlertMsg;
	String EditAlertMsg;
	
	public void abstractcreate() throws Throwable {
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0, num=0,updatecount=0;
		int ColumnTotal = sheet.getRow(2).getLastCellNum()-1; //getPhysicalNumberOfCells()-1		
		System.out.println("Total Columns in excel::"+ColumnTotal);
		for(int i=1;i<=sheet.getRow(2).getLastCellNum()-1;i++)	{ 
	    	try {
	    	Frames.SubMenuFrame();
	    	abstractLinkClick();	
	    	Frames.rightFrame();
	    	createAbstBtnClick();
	    	appInd.singleDropDown(getProjectDD(),appInd.convertCellToString(sheet, 1, i));
	    	appInd.singleDropDown(getSubProjectDD(),appInd.convertCellToString(sheet, 2, i));
	    	
	    	appInd.singleDropDown(getWorkCatDD(),appInd.convertCellToString(sheet, 4, i));
	    	appInd.singleDropDown(getWorkSubCatDD(),appInd.convertCellToString(sheet, 5, i));
	    	Thread.sleep(2000);
	    	appInd.singleDropDown(getWorkorderDD(),appInd.convertCellToString(sheet, 3, i));
	    	Thread.sleep(1000);
	    	w2.until(ExpectedConditions.visibilityOf(woValueLabel));
	    	backDate = Integer.parseInt(appInd.convertCellToString(sheet, 0, 1));
	    	appInd.seletDate(abstractDatePicker, appInd.getBackDatedDate(backDate));
	    	
	    	
	    	//w2.until(ExpectedConditions.visibilityOf(woValueLabel));	    	Thread.sleep(1000);
	    	createGoBtnClick();
	    	if(appInd.AlertPresent()) {
	    		CreateAlertMsg = iDriver.switchTo().alert().getText();
	    	}
	    
	    	Thread.sleep(1000);
	    	
	    	if(!getSubProjChkBox().isSelected()) {
	    		int cot=0;
	    		List<WebElement> boqlist = iDriver.findElements(By.xpath("//table[@id='gvAbstratItems']//tr//td[3]//span"));
	    		System.out.println(boqlist.size());
	    		for(int n=0;n<boqlist.size();n++) {
	    			cot++;
	    			System.out.println("n value :: "+n);
	    			System.out.println("get Text::"+boqlist.get(n).getText());
	    				if(boqlist.get(n).getText().equals(appInd.convertCellToString(sheet, 6, i))) {
	    				System.out.println(boqlist.get(n).getText());
	    				cot = cot + 1;
	    				System.out.println(cot);	    			
	    				iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+cot+"]//td[1]//input")).click();
	    				//Thread.sleep(2000);
	    				break;
	    					}	    				
	    				}
	   				}
	    	else {
				getSubProjChkBox().click();
	    		}
	    	
	    	nextBtnClick();
	    	if(appInd.AlertPresent()) {
	    		appInd.isAlertPresent();
	    	}
	    	w2.until(ExpectedConditions.visibilityOf(savecontBtn));
			
			
	    	int qtyField = 0;
	    	List<WebElement> boqNolist = iDriver.findElements(By.xpath("//table[@id='gvAbstratItems']//td[3]")); 	    	
	    	System.out.println(boqNolist.size()); 
	    	for(int j = 0;j<boqNolist.size();j++) {
	    		qtyField++;
	    		if(boqNolist.get(j).getText().equals(appInd.convertCellToString(sheet, 6, i))) {
	    			System.out.println("BOQ ID::"+appInd.convertCellToString(sheet, 6, i));
	    			System.out.println(boqNolist.get(j).getText());
	    			qtyField=qtyField+1;	    			
	    			System.out.println(qtyField);									    			
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+qtyField+"]//td[9]//input")).click();	    
	    			Robot robo = new Robot();
	    			robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+qtyField+"]//td[9]//input")).sendKeys(appInd.convertCellToString(sheet, 7, i));
	    			break;
	    		}
	    	}	    	
	    	//Thread.sleep(2000);
	    	finishBtnClick();
	    	abstractDisplayNo = getAbstDispNo();
	    		    	    	
	    	if(!closeBtn.isDisplayed()) {
				Datatable.writeExcel("Abstract No", "Not Created", sheetname, Engineering.outputCreatePath);
				Frames.SubMenuFrame();
				abstractLinkClick();
			}else {
				Datatable.writeExcel("WO: "+abstractDisplayNo, "Created", sheetname, Engineering.outputCreatePath);
				count++;
			}
	    }	    		    	
	    	catch (Exception e){
	    		System.out.println(e);
	    		Datatable.writeExcel("Abstract No", "Not Created---Validation: "+CreateAlertMsg, sheetname, Engineering.outputCreatePath);
				Frames.SubMenuFrame();
				abstractLinkClick();
	    	}
	    	
//---modify and update then status change of abstract created above---//
	    	try {
	    		Frames.SubMenuFrame();
		    	abstractLinkClick();	
		    	Frames.rightFrame();
		    	appInd.singleDropDown(getProjectDD(),appInd.convertCellToString(sheet, 1, i));
		    	appInd.singleDropDown(getSubProjectDD(),appInd.convertCellToString(sheet, 2, i));
		    	Thread.sleep(2000);
		    	appInd.singleDropDown(getWorkorderDD(),appInd.convertCellToString(sheet, 3, i));
		    	Thread.sleep(2000);
		    	goBtnClick();		    	
		    	w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='gvAbstractList']")));
		    	
		    	
		    	//finding of workorder and clicking on it by giving abstract display no
		    	int WOlist = 0;
		    	List<WebElement> abstList = iDriver.findElements(By.xpath("//table[@id='gvAbstractList']//td[4]")); 	    	
		    	System.out.println(abstList.size()); 
		    	for(int j = 0;j<abstList.size();j++) {
		    		WOlist++;
		    		if(abstList.get(j).getText().equals(abstractDisplayNo)) {
		    			//System.out.println("abstract::"+abstractDisplayNo);
		    			System.out.println(abstList.get(j).getText());
		    			WOlist=WOlist+1;
		    			System.out.println(WOlist);
		    			iDriver.findElement(By.xpath("//table[@id='gvAbstractList']//tr["+WOlist+"]//td[3]//a")).click();
		    			break;
		    		}
		    	}
		    	
		    	//modifying of created abstract
		    	itemsBtnClick();
		    	
		    	int boqline = 0;
		    	List<WebElement> boqNolist = iDriver.findElements(By.xpath("//table[@id='gvAbstratItems']//td[3]")); 	    	
		    	System.out.println(boqNolist.size()); 
		    	for(int j = 0;j<boqNolist.size();j++) {
		    		boqline++;
		    		if(boqNolist.get(j).getText().equals(appInd.convertCellToString(sheet, 6, i))) {
		    			System.out.println("BOQ ID::"+appInd.convertCellToString(sheet, 6, i));
		    			System.out.println(boqNolist.get(j).getText());
		    			boqline=boqline+1;
		    			System.out.println(boqline);
		    			
		    			//clicking on boq checkbox
		    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+boqline+"]//td[1]//input")).click();
		    			
		    			//click on modify items button
		    			modifyItemBtnClick();
		    			
		    			//updating work complete date
		    			WebElement workcompleteDate = iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+boqline+"]//td[19]//input"));
		    			appInd.seletDate(workcompleteDate, appInd.getBackDatedDate(backDate+1));		    			
		    			iDriver.findElement(By.xpath("//table[@id='gvAbstratItems']//tr["+boqline+"]//td[22]//textarea")).sendKeys("Updated through automation");
		    			break;     	
		    		}
		    	}	
		    	
		    	appInd.singleDropDown(getStatusDD(), "Approved");
		    	getStatusRemarksTxtArea().sendKeys("Status updated as Approved through automation");
		    	finishBtnClick(); 
		    	if(appInd.AlertPresent()) {
		    		EditAlertMsg = iDriver.switchTo().alert().getText();
		    	}
		    			    	
		    	if(getStatusUpdateTxt().getText().equalsIgnoreCase("Items Updated Successfully.")) {
		    		Datatable.writeExcel("WO: "+abstractDisplayNo, "Modified and Updated", sheetname, Engineering.outputCreatePath);
					updatecount++;		    		
					}else {
						Datatable.writeExcel("Abstract No", "Modify and Update Failed", sheetname, Engineering.outputCreatePath);
						Frames.SubMenuFrame();
						abstractLinkClick();
					}	    	
		    	
	    	}
	    	
	    	catch (Exception e) {
					Datatable.writeExcel("Abstract No"+abstractDisplayNo, "Modify and Update Failed--Validation: "+EditAlertMsg, sheetname, Engineering.outputCreatePath);
					Frames.SubMenuFrame();
					abstractLinkClick();
	    		
	    	}  	
	    		    	
	    }
		System.out.println(backDate);
		backDate--;
		writeExcelAbstract("Back Date", String.valueOf(backDate), sheetname, Engineering.inputCreatePath);
		
		if(count==sheet.getRow(2).getLastCellNum()-1) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
			
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
		}
		if(updatecount==sheet.getRow(2).getLastCellNum()-1) {
			Datatable.writeExcel("Abstract Edit", "PASS", sheetname, Engineering.outputCreatePath);
			
		}else {
			Datatable.writeExcel("Abstract Edit", "FAIL", sheetname, Engineering.outputCreatePath);
		}
		
	}
	 public static void writeExcelAbstract(String testname, String output, String sheetname,String path) throws IOException{

	        File file =    new File(path);
	        FileInputStream inputStream = new FileInputStream(file);
	        Workbook guru99Workbook = null;
	        guru99Workbook = new XSSFWorkbook(inputStream);
	        Sheet sheet = guru99Workbook.getSheet(sheetname);
	        Row newRow = sheet.createRow(0);	   
	        String s[] = {testname,output};
	        for(int j = 0; j < 2; j++){	    	
	        Cell cell = newRow.createCell(j);	        
	        cell.setCellValue(s[j]);
	    }
	    inputStream.close();
	    FileOutputStream outputStream = new FileOutputStream(file);
	    guru99Workbook.write(outputStream);
	    outputStream.close();
		
	    }
}
