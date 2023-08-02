package com.RE.Engineering.Createpages.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.BOQ_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class BOQ_Create extends BOQ_Create_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;
	
	public BOQ_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	//Inspecting 'BOQ' link
	@FindBy(xpath = "//a[text()='BOQ']")
	private WebElement BOQlink;
	public void getBOQlink() {
		BOQlink.click();
	}
	//Inspecting 'Create BOQ' button
	@FindBy(id = "cmdCreateBOQ")
	private WebElement Createboqbutton;
	public void getCreateboqbutton() {
		Createboqbutton.click();
	}
	//Inspecting 'Project' dropdown
	@FindBy(name = "ddlProject")
	private WebElement project;
	public WebElement getproject() {
		return project;
	}
	//Inspecting 'Sub Project' dropdown
	@FindBy(id = "ddlSubProject")
	private WebElement subproject;
	public WebElement getsubproject() {
		return subproject;
	}
	//Inspecting 'Work Category' dropdown
	@FindBy(xpath = "//select[@id='ddlWorkCategory']")
	private WebElement WorkCat;
	public WebElement getWorkCat() {
		return WorkCat;
	}
	//Inspecting 'Work Sub Category' dropdown
	@FindBy(css = "select#ddlWorkSubCategory")
	private WebElement WorkSubCat;
	public WebElement getWorkSubCat() {
		return WorkSubCat;
	}
	//Inspecting 'BOQ Name' text field
	@FindBy(css = "input#txtBOQItemName")
	private WebElement BOQName;
	public WebElement getBOQName() {
		return BOQName;
	}
	//Inspecting 'BOQ Description' text area
	@FindBy(css = "textarea#txtBOQDescription")
	private WebElement BOQDesc;
	public WebElement getBOQDesc() {
		return BOQDesc;
	}
	//Inspecting 'UOM' dropdown
	@FindBy(id = "ddlUOM")
	private WebElement UOM;
	public WebElement getUOM() {
		return UOM;
	}
	//Inspecting 'BOQ Quantity (Cost)' text field
	@FindBy(xpath = "//input[@name='txtBOQQuantityCost']")
	private WebElement QtyCost;
	public WebElement getQtyCost() {
		return QtyCost;
	}
	//Inspecting  'BOQ Rate (Cost)' text field
	@FindBy(xpath = "//input[@name='txtBOQRateCost']")
	private WebElement Rate;
	public WebElement getRate() {
		return Rate;
	}
	@FindBy(xpath = "//textarea[@name='txtBOQNotes']")
	private WebElement Note;
	public WebElement getNote() {
		return Note;
	}
	//Inspecting 'Material Div' icon
	@FindBy(xpath = "//tr[1]//td[@class='vertical-middle in4-tabletitle']//input[@name='imbMaterial']")
	private WebElement MaterialDiv;
	public void getMaterialDiv() {
		MaterialDiv.click();
	}
	//Inspecting 'Assets Div' icon
	@FindBy(name = "imbAssets")
	private WebElement AssetDiv;
	public WebElement getAssetDiv() {
		return AssetDiv;
	}
	
	//Inspecting 'Add Material' link
	@FindBy(id = "lbnAddMaterialNew")
	private WebElement AddMaterial;
	public WebElement getAddMaterial() {
		w2.until(ExpectedConditions.elementToBeClickable(AddMaterial));
		return AddMaterial;
	}
	//Inspecting 'Add Assets' link
	@FindBy(id = "lbnAddAssetNew")
	private WebElement AddAssetLink;
	public void getAddAssetLink() {
		 AddAssetLink.click();;
	}
	//Inspecting 'Material Type' dropdown
	@FindBy(xpath = "//select[@name='ddlMaterialType']")
	private WebElement MaterilTypeDD;
	public WebElement getMaterilTypeDD() {
		return MaterilTypeDD;
	}
	//Inspecting 'Material Sub Type' dropdown
	@FindBy(xpath = "//select[@id='ddlMaterialSubtype']")
	private WebElement MaterilSubTypeDD;
	public WebElement getMaterilSubTypeDD() {
		return MaterilSubTypeDD;
	}
	//Inspecting 'Material' dropdown
	@FindBy(xpath = "//select[@id='ddlMaterial']")
	private WebElement MaterilDD;
	public WebElement getMaterilDD() {
		return MaterilDD;
	}
	//Inspecting 'Search' button in 'Search - Material' popup
	@FindBy(xpath = "//input[@id='btnSearch']")
	private WebElement Search;
	public void getSearch() {
		 Search.click();;
	}
	//Inspecting 'Select Check box ' in 'Search - Material' popup
	@FindBy(xpath = "//table[@class='in4-table1 mt-5']//tr[2]//input[@type='checkbox']")
	private WebElement SelectCheckbox;
	public void getSelectCheckbox() {
		SelectCheckbox.click();;
	}
	//Inspecting ' Accept Selected' link in 'Search - Material' popup
	@FindBy(xpath = "//a[text()='Accept Selected']")
	private WebElement AcceptSelcted;
	public void getAcceptSelcted() {
		AcceptSelcted.click();;
	}
	//Inspecting 'UOM' dropdown in the 'BOQ Item- Material' grid
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[5]//select[@class='input']")
	private WebElement MaterialUOM;
	public WebElement getMaterialUOM() {
		return MaterialUOM;
	}
	//Inspecting 'UOM' dropdown in the 'BOQ Item- Material' grid for second line item
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[5]//select[@class='input']")
	private WebElement MaterialUOM2;
	public WebElement getMaterialUOM2() {
		return MaterialUOM2;
	}
	////Inspecting 'Co-efficient factor'  in the 'BOQ Item- Material' grid
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[@class='nopadding info']//tr[1]//td[1]//input[@class='input']")
	private WebElement COEfactor;
	public WebElement getCOEfactor() {
		return COEfactor;
	}
////Inspecting 'Co-efficient factor'  in the 'BOQ Item- Material' grid for second line item
	@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[@class='nopadding info']//tr[1]//td[1]//input[@class='input']")
	private WebElement COEfactor2;
	public WebElement getCOEfactor2() {
		return COEfactor2;
	}
	//Inspecting 'Create' button
	@FindBy(name = "btnCreate")
	private WebElement CreateButton;
	public void getCreateButton() {
		CreateButton.click();;
	}
	//Inspecting 'Modify' button in vie page
	@FindBy(name = "btnModify")
	private WebElement ModifyButton;
	public void getModifyButton() {
		ModifyButton.click();;
	}
	//Inspecting 'Update' button in edit page
	@FindBy(css = "input#btnUpdate")
	private WebElement updateButton;
	public void getupdateButton() {
		updateButton.click();;
	}
	//Inspecting 'Back' button in view page
	@FindBy(name = "btnBack")
	private WebElement backButton;
	public void getbackButton() {
		backButton.click();;
	}
	//Inspecting 'Change Status' link in view page
	@FindBy(xpath = "//a[text()='Change Status ']")
	private WebElement changestatus;
	public void getchangestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(changestatus));
		changestatus.click();
	}
	//Inspecting ' Status' Dropdown in view page
	@FindBy(css = "select#ddlStatus")
	private WebElement StatusDD;
	public WebElement getStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(StatusDD));
		return StatusDD;
	}
	//Inspecting 'Update Status' link in view page
	@FindBy(xpath = "//a[text()='Update Status']")
	private WebElement Updatestatus;
	public void getUpdatestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(Updatestatus));
		Updatestatus.click();
	}
	//Taking current status of 'BOQ' from view page
	@FindBy(css = "span#lblStatusValue")
	private WebElement currentstatus;
	public String getcurrentstatus() {
		return currentstatus.getText();
	}
	// Navigate to Main Module and Sub Module
	public void MenuSubMenu()
	 {
	try
	{
	MainMenu mm = new MainMenu(iDriver);
	 mm.clickEngineering();
	 Thread.sleep(2000);
	 Engineering en = new Engineering(iDriver);
	 en.clickMasters();
	 Thread.sleep(1000);
	 xml = new Datatable();
	 sheet = xml.excelData(sheetname,Engineering.inputCreatePath);	
	 }
	 	catch (Exception e)
	 	{
		
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
	 }
	String RandomNum;
	String boqname;
	//BOQ creating 
	public void BOQCreation() throws Throwable{
		// Getting the Current Method name and storing in variable
		 String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		 	int i =5;
			int count=0, num=0;
			int updatecount=0;
			System.out.println(sheet.getLastRowNum());
		for(;i<=sheet.getLastRowNum();i++) {
			try{
		Frames.SubMenuFrame();
		getBOQlink();
		Frames.rightFrame();
		getCreateboqbutton();
		appInd.singleDropDown(getproject(), sheet.getRow(i).getCell(0).getStringCellValue());
		appInd.singleDropDown(getsubproject(), sheet.getRow(i).getCell(1).getStringCellValue());
		appInd.singleDropDown(getWorkCat(), sheet.getRow(i).getCell(2).getStringCellValue());
		appInd.singleDropDown(WorkSubCat, sheet.getRow(i).getCell(3).getStringCellValue());
		RandomNum=appInd.RandomNumbers(5);
		getBOQName().sendKeys("BOQ"+RandomNum);
		boqname="BOQ"+RandomNum;
		getBOQDesc().sendKeys("BOQ Created Through Automation");
		getUOM().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getQtyCost().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		getRate().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		getMaterialDiv();				
		String parent = appInd.switchToChildWindow(getAddMaterial());
		appInd.singleDropDown(getMaterilTypeDD(), sheet.getRow(i).getCell(7).getStringCellValue());
		appInd.singleDropDown(getMaterilSubTypeDD(), sheet.getRow(i).getCell(8).getStringCellValue());
		appInd.singleDropDown(getMaterilDD(), sheet.getRow(i).getCell(9).getStringCellValue());
		getSearch();
		getSelectCheckbox();
		getAcceptSelcted();
		appInd.switchToParentWindow(parent);
		Frames.rightFrame();
		getMaterialUOM().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		Thread.sleep(1000);
		getCOEfactor().clear();
		getCOEfactor().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
		getCreateButton();
		Thread.sleep(2000);
		
		if(appInd.AlertPresent()) {
			Datatable.writeExcel(boqname, "NOT Created",  sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
		}
			
		else{
			Datatable.writeExcel(boqname, "Created",  sheetname, Engineering.outputCreatePath);
			count++;
		}
			}
			catch (Exception e) {
				Datatable.writeExcel(boqname, "NOT Created - Exception",  sheetname, Engineering.outputCreatePath);
				Frames.SubMenuFrame();
			}
			//Editing BOQ
			try {
			getModifyButton();
			switch (i) {
			case 1:getNote().sendKeys("Modified & Updated BOQ ");
			getMaterialDiv();				
			String parent = appInd.switchToChildWindow(getAddMaterial());
			appInd.singleDropDown(getMaterilTypeDD(), sheet.getRow(0).getCell(14).getStringCellValue());
			appInd.singleDropDown(getMaterilSubTypeDD(), sheet.getRow(1).getCell(14).getStringCellValue());
			appInd.singleDropDown(getMaterilDD(), sheet.getRow(2).getCell(14).getStringCellValue());
			getSearch();
			getSelectCheckbox();
			getAcceptSelcted();
			appInd.switchToParentWindow(parent);
			Frames.rightFrame();
			
			getMaterialUOM2().sendKeys(sheet.getRow(3).getCell(10).getStringCellValue());
			getCOEfactor2().clear();
			Thread.sleep(1000);
			getCOEfactor2().sendKeys(sheet.getRow(3).getCell(14).getStringCellValue());
			break;
			
			case 2: getNote().sendKeys("Modified & Updated BOQ ");
					getMaterialDiv();
					getCOEfactor().clear();
					getCOEfactor().sendKeys(sheet.getRow(3).getCell(14).getStringCellValue());
					
			break;
			case 3:
					getQtyCost().clear();
					getQtyCost().sendKeys(sheet.getRow(5).getCell(14).getStringCellValue());
			break;
			
			case 4: getNote().sendKeys("Modified & Updated BOQ ");
					getRate().clear();
					getRate().sendKeys(sheet.getRow(4).getCell(14).getStringCellValue());
			break;
			
			case 5:	getNote().sendKeys("Modified & Updated BOQ ");
					getQtyCost().clear();
					getQtyCost().sendKeys(sheet.getRow(5).getCell(14).getStringCellValue());
			break;
			
			default:
				break;
			}
			getupdateButton(); 
			if(appInd.AlertPresent()) {
				Datatable.writeExcel(boqname, "NOT Updated",  sheetname, Engineering.outputCreatePath);
				Frames.SubMenuFrame();
			}
				
			else{
				Datatable.writeExcel(boqname, "Updated",  sheetname, Engineering.outputCreatePath);
				updatecount++;
			}
			
			}catch (Exception e) {
				Datatable.writeExcel(boqname, "NOT Updated - Exception",  sheetname, Engineering.outputCreatePath);
				Frames.SubMenuFrame();
			}
			getchangestatus();
			getStatusDD().sendKeys("Submitted");
			getUpdatestatus();
			getchangestatus();
			getStatusDD().sendKeys("Approved");
			getUpdatestatus();
			
			if (getcurrentstatus().equals("Approved")) 
			{ 
	    		Datatable.writeExcel(boqname+" Approved", "PASS", sheetname, Engineering.outputCreatePath);
	     	}
	    	else {
	    		Datatable.writeExcel(boqname+" Approved", "FAIL", sheetname, Engineering.outputCreatePath);
	    	}
			getbackButton();
		}
		
		System.out.println("Total BOQ's created ---"+count);
		if (sheet.getLastRowNum()==count) 
    	{ 
    		Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
    	}
		System.out.println("Total BOQ's created ---"+updatecount);
		
		if (sheet.getLastRowNum()==count) 
		{ 
    		Datatable.writeExcel("BOQ Updation", "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel("BOQ Updation", "FAIL", sheetname, Engineering.outputCreatePath);
    	}
		if (getcurrentstatus().equals("Approved")) 
		{ 
    		Datatable.writeExcel("BOQ Approved", "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel("BOQ Approved", "FAIL", sheetname, Engineering.outputCreatePath);
    	}
	}
	}
	
	

	
	

