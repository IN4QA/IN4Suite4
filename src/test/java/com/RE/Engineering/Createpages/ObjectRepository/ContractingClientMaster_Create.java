package com.RE.Engineering.Createpages.ObjectRepository;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.ContractingClientMaster_Create_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;


public class ContractingClientMaster_Create extends ContractingClientMaster_Create_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	int i=1;
	
	public ContractingClientMaster_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname= this.getClass().getSimpleName();
	}

    //----List Page Elements---//
	@FindBy(xpath="//a[text()='Contracting Client']")
	private WebElement contractingClient;
	public void getContractingClientLink() {
		contractingClient.click();
	}
	@FindBy(id="txtClientName")
	private WebElement clientNameFieldList;
	public WebElement getClientNameList() {
		return clientNameFieldList;
	}	
	@FindBy(id="btnCreateClient")
	private WebElement clientCrtBtn;
	public void getClientCrtBtn() {
		clientCrtBtn.click();
	}
	@FindBy(id="btnFilterGO")
	private WebElement goBtn;
	public void getGoBtn() {
		goBtn.click();
	}
	@FindBy(xpath="//table[@class='in4-table']//td//a")    //consultant name hyperlink
	private WebElement consHL; 
	public void getConsHLClick() {
		consHL.click();
	}
	
	
	
	//---Create Page Elements---//
	@FindBy(id="frmViewClient_txtClientName")
	private WebElement clientNameFieldCreate;
	public WebElement getClientNameFieldCreate() {
		return clientNameFieldCreate;
	}
	@FindBy(id="frmViewClient_txtClientCode")
	private WebElement clientCode;
	public WebElement getClientCodeField() {
		return clientCode;
	}
	@FindBy(id="frmViewClient_ddlVendorTypeList")
	private WebElement vendorTypeDD;
	public WebElement getVendorTypeDD() {
		return vendorTypeDD;
	}
	@FindBy(id="frmViewClient_txtPANNo")
	private WebElement panNoField;
	public WebElement getPanNoField() {
		return panNoField;
	}
	@FindBy(id="frmViewClient_txtGSTINNo")
	private WebElement gstinField;
	public WebElement getGSTINField() {
		return gstinField;
	}
	@FindBy(id="frmViewClient_ddlActiveFlagList")
	private WebElement activeDD;
	public WebElement getActiveDD() {
		return activeDD;
	}
	@FindBy(id="frmViewClient_ddlConstitutionList")
	private WebElement vendorTypeDD2;
	public WebElement getVendorTypeDD2() {
		return vendorTypeDD2;
	}
	
	//---Office Address Elements----//
	@FindBy(id="frmViewClient_txtStreet")
	private WebElement streetTextArea;
	public WebElement getStreetTextArea() {
		return streetTextArea;
	}
	@FindBy(id="frmViewClient_ddlCountryList")
	private WebElement countryDD;
	public WebElement getCountryDD() {
		return countryDD;
	}	
	@FindBy(id="frmViewClient_ddlStateList")
	private WebElement stateDD;
	public WebElement getStateDD() {
		return stateDD;
	}
	@FindBy(id="frmViewClient_ddlCityList")
	private WebElement cityDD;
	public WebElement getCityDD() {
		return cityDD;
	}
	@FindBy(id="frmViewClient_txtPinCode")
	private WebElement pinCodeField;
	public WebElement getPinCodeField() {
		return pinCodeField;
	}
	@FindBy(id="frmViewClient_txtMobilePhoneNo")
	private WebElement mobileNoField;
	public WebElement getMobileNoField() {
		return mobileNoField;
	}
	@FindBy(id="frmViewClient_txtEmailId")
	private WebElement emailID;
	public WebElement getEmailIDField() {
		return emailID;
	}
	
	
	//---Contact Details---//
	@FindBy(id="frmViewClient_lnkAddContactPerson")
	private WebElement addRowLink;
	public void getAddRowLink() {
		addRowLink.click();
	}	
	@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[2]//input")
	private WebElement nameField;
	public WebElement getNameFieldLine1() {
		return nameField;
	}
	@FindBy(xpath="//table[@class='in4-table']//tr[2]//td[3]//input")
	private WebElement designationField;
	public WebElement getDesignationFieldLine1() {
		return designationField;
	}
	@FindBy(id="btnCreate")
	private WebElement submitBtn;
	public void getSubmitBtn() {
		submitBtn.click();
	}
	//Modify page
	@FindBy(id="btnModify")
	private WebElement modifyBtn;
	public void getModifyBtn() {
		modifyBtn.click();
	}
	@FindBy(id="btnUpdate")
	private WebElement updateBtn;
	public void getUpdateBtn() {
		updateBtn.click();
	}
	@FindBy(id="frmViewClient_txtPFNo")
	private WebElement pfNo;
	public WebElement getPFNo() {
		return pfNo;
	}
	@FindBy(id="frmViewClient_txtOfficePhoneNo")
	private WebElement phoneNoField;
	public WebElement getPhoneNoField() {
		return phoneNoField;
	}
	@FindBy(id="frmViewClient_txtCSTNo")
	private WebElement cstNoField;
	public WebElement getCSTNoField() {
		return cstNoField;
	}
	@FindBy(id="frmViewClient_txtServiceTaxNo")
	private WebElement serviceTaxNoField;
	public WebElement getServiceTaxNoField() {
		return serviceTaxNoField;
	}
	@FindBy(id="frmViewClient_txtExciseDutyNo")
	private WebElement exciseDutyNo;
	public WebElement getExciseDutyNo() {
		return exciseDutyNo;
	}
	@FindBy(id="frmViewClient$gvContactPersonListEdit$ctl02$txtContactPersonMobileNo")   // Contact Details Grid
	private WebElement mobileno;
	public WebElement getMobileNo() {
		return mobileno;
	}	
	@FindBy(id="frmViewClient_gvContactPersonListEdit_ctl02_txtContactPersonAddress") // Contact Details Grid
	private WebElement addressTextArea;
	public WebElement getAddressTextArea() {
		return addressTextArea;
	}	
	@FindBy(id="lblClientPageTitle")
	private WebElement pageName;
	public WebElement getPageName() {
		return pageName;
	}
			
	
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
	
	
	String clientname;	

	public void contractingclientcreate() throws Throwable {
	    	    
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0, num=0;
		System.out.println(sheet.getLastRowNum());
	    for(;i<=sheet.getLastRowNum();i++)	{
	    	try {
	    Frames.SubMenuFrame();
	    getContractingClientLink();
	    Frames.rightFrame();
	   	w2.until(ExpectedConditions.visibilityOf(clientCrtBtn));
	   	getClientCrtBtn();
	   	clientname=appInd.getCurrentDateTime();
	   	getClientNameFieldCreate().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+clientname);	   		
	   	getClientCodeField().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+appInd.PanNumber());
	   	appInd.singleDropDown(getVendorTypeDD(),sheet.getRow(i).getCell(1).getStringCellValue());
		appInd.singleDropDown(getActiveDD(),sheet.getRow(i).getCell(2).getStringCellValue());
		getPanNoField().sendKeys(appInd.PanNumber());
		getGSTINField().sendKeys(appInd.gstinNumber());
		getStreetTextArea().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getCountryDD(),sheet.getRow(i).getCell(4).getStringCellValue());
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='frmViewClient_ddlStateList']//option[2]")));
		appInd.singleDropDown(getStateDD(),sheet.getRow(i).getCell(5).getStringCellValue());
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='frmViewClient_ddlCityList']//option[2]")));
		appInd.singleDropDown(getCityDD(),sheet.getRow(i).getCell(6).getStringCellValue());
		getPinCodeField().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getMobileNoField().sendKeys(clientname);
		getEmailIDField().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+"@gmail.com");
//		for(int i=0;i<4;i++) {
//			try {
//				getAddRowLink();
//			}catch(Exception e) {}
//			if(nameField.isDisplayed()) {
//				break;
//			}
//		}
//		w2.until(ExpectedConditions.visibilityOf(nameField));
//		getNameFieldLine1().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
//		getDesignationFieldLine1().sendKeys("Engineer");
		Thread.sleep(1000);
		getSubmitBtn();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + clientname), "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			getContractingClientLink();
		}else {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + clientname), "Created", sheetname, Engineering.outputCreatePath);
			count++;
		}
	}	
	    	catch (Exception e) {
	    		System.out.println(e);
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + clientname), "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			getContractingClientLink();
	}
	    	
	    	// Modify and update of contractor created above 
	    	
	    	try
	    	{
	   		Frames.SubMenuFrame();
	   		getContractingClientLink();
	  		Frames.rightFrame();
			w2.until(ExpectedConditions.visibilityOf(goBtn));
			getClientNameList().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+clientname);	
			Thread.sleep(2000);
			for(int i=0;i<4;i++) {
				try {
					getGoBtn();
				}catch(Exception e) {}
				Thread.sleep(2000);
				if(consHL.isDisplayed()) {
					break;
				}
			}
			Thread.sleep(2000);
			w2.until(ExpectedConditions.visibilityOf(consHL));
			getConsHLClick(); 
			w2.until(ExpectedConditions.visibilityOf(modifyBtn));
			getModifyBtn();
	    	w2.until(ExpectedConditions.textToBePresentInElement(pageName, "Edit Contracting Client"));
	    	switch(i) {
			
			case 1: getCSTNoField().sendKeys(appInd.RandomNumbers(10));
					break;
			case 2: getPFNo().sendKeys(appInd.RandomNumbers(12));
					break;
			case 3: getPhoneNoField().sendKeys(appInd.RandomNumbers(10));
					break;
			case 4: getServiceTaxNoField().sendKeys(appInd.RandomNumbers(10));
					break;
			case 5: getExciseDutyNo().sendKeys(appInd.RandomNumbers(5));
					break;
						
					default: break;
			}
	    	Thread.sleep(2000);
	    	getUpdateBtn();
	    	Datatable.writeExcel(sheet.getRow(i).getCell(0).getStringCellValue()+" " + clientname, "Modified and Updated", sheetname, Engineering.outputCreatePath);
	    	}	    	
	    	catch (Exception e) {
	    		System.out.println(e);
	    		System.out.println("Edit case failed for client: "+sheet.getRow(i).getCell(0).getStringCellValue()+" "+clientname);
	    		Datatable.writeExcel(sheet.getRow(i).getCell(0).getStringCellValue()+" " + clientname, "Modify Failed", sheetname, Engineering.outputCreatePath);
	    	}
	    	
    }
	    	
	    	System.out.println("Total contracting client created: "+count);
	    	if (sheet.getLastRowNum()==count) 
	    	{ 
	    		Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
	     	}
	    	else {
	    		Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
	    	}
	    }
	    	
}
