package com.RE.Engineering.Createpages.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.ConsultantMaster_Create_Test;
import com.RE.Submodules.Engineering;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;


public class ConsultantMaster_Create extends ConsultantMaster_Create_Test {
	
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	int i=1;
	
	public ConsultantMaster_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname= this.getClass().getSimpleName();
	}

    //----List Page Elements---//
	@FindBy(xpath="//a[text()='Consultant']")
	private WebElement consultant;
	public void getConsultantLink() {
		consultant.click();
	}
	@FindBy(id="txtConsultantName")
	private WebElement firmName;
	public WebElement getFirmName() {
		return firmName;
	}	
	@FindBy(id="btnCreateConsultant")
	private WebElement consultantCrtBtn;
	public void getconsultantCrtBtn() {
		consultantCrtBtn.click();
	}
	@FindBy(id="btnGo")
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
	@FindBy(id="txtConsultantName")
	private WebElement consName;
	public WebElement getConsNameField() {
		return consName;
	}
	@FindBy(id="txtConsultantCode")
	private WebElement consCode;
	public WebElement getConsCodeField() {
		return consCode;
	}
	@FindBy(id="ddlVendorType")
	private WebElement vendorTypeDD;
	public WebElement getVendorTypeDD() {
		return vendorTypeDD;
	}
	@FindBy(id="txtPanNo")
	private WebElement panNoField;
	public WebElement getPanNoField() {
		return panNoField;
	}
	@FindBy(id="txtGSTIN")
	private WebElement gstinField;
	public WebElement getGSTINField() {
		return gstinField;
	}
	@FindBy(id="ddlApproved")
	private WebElement approvedDD;
	public WebElement getApprovedDD() {
		return approvedDD;
	}
	@FindBy(id="ddlStatus")
	private WebElement activeDD;
	public WebElement getActiveDD() {
		return activeDD;
	}
	
	//---Registered Office Address Elements----//
	@FindBy(xpath="//img[@id='ImgAddress']")
	private WebElement divArrowOfficeAddress;
	public void getDivArrowOfficeAddress() {
		divArrowOfficeAddress.click();
	}	
	@FindBy(id="txtStreet")
	private WebElement streetTextArea;
	public WebElement getStreetTextArea() {
		return streetTextArea;
	}
	@FindBy(id="ddlCountry")
	private WebElement countryDD;
	public WebElement getCountryDD() {
		return countryDD;
	}	
	@FindBy(id="ddlState")
	private WebElement stateDD;
	public WebElement getStateDD() {
		return stateDD;
	}
	@FindBy(id="ddlCity")
	private WebElement cityDD;
	public WebElement getCityDD() {
		return cityDD;
	}
	@FindBy(id="txtPinCode")
	private WebElement pinCodeField;
	public WebElement getPinCodeField() {
		return pinCodeField;
	}
	
	//---Expertise Elements---//
	@FindBy(xpath="//img[@id='imgExpertise']")
	private WebElement divArrowExpertise;
	public void getDivArrowExpertise() {
		divArrowExpertise.click();
	}
	@FindBy(id="btnAddExpertise")
	private WebElement addRowLink;
	public void getAddRowLink() {
		addRowLink.click();
	}	
	@FindBy(id="gvExpertise_ctl02_ddlMainSkill")
	private WebElement mainSkillDD;
	public WebElement getMainSkillDD() {
		return mainSkillDD;
	}
	@FindBy(id="btnSubmit")
	private WebElement submitBtn;
	public void getSubmitBtn() {
		submitBtn.click();
	}
	//Modify page
	@FindBy(id="btnUpdate")
	private WebElement modifyBtn;
	public void getModifyBtn() {
		modifyBtn.click();
	}
	@FindBy(id="txtEmail")
	private WebElement emailField;
	public WebElement getEmailField() {
		return emailField;
	}	
	@FindBy(id="ddlRegType")
	private WebElement regTypeDD;
	public WebElement getRegTypeDD() {
		return regTypeDD;
	}
	@FindBy(id="txtVATRegNo")
	private WebElement vatReg;
	public WebElement getVATReg() {
		return vatReg;
	}
	@FindBy(id="txtMobileNo")   // Registered Office Address table
	private WebElement mobileno;
	public WebElement getMobileNo() {
		return mobileno;
	}
	@FindBy(xpath="//img[@id='imgContactPersons']")
	private WebElement divArrowContact;
	public WebElement getDivArrowContact() {
		return divArrowContact;
	}
	@FindBy(id="gvContactperson_ctl02_txtName")
	private WebElement contactname;
	public WebElement getContactName() {
		return contactname;
	}	
	@FindBy(id="gvContactperson_ctl02_txtDesignation")
	private WebElement contactDesg;
	public WebElement getContactDesg() {
		return contactDesg;
	}
	@FindBy(id="txtCSTNo")
	private WebElement cstNoField;
	public WebElement getCSTNoField() {
		return cstNoField;
	}
	@FindBy(id="txtMSMENo")
	private WebElement msmeNo;
	public WebElement getMSMENo() {
		return msmeNo;
	}
	@FindBy(id="lblCreatePageTitle")
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
	
String consultantname;	

	public void consultantcreate() throws Throwable {
	    	    
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0, num=0;
		System.out.println(sheet.getLastRowNum());
	    for(;i<=sheet.getLastRowNum();i++)	{
	    	try {
	    Frames.SubMenuFrame();
	    getConsultantLink();
	    Frames.rightFrame();
	   	w2.until(ExpectedConditions.visibilityOf(consultantCrtBtn));
	   	getconsultantCrtBtn();		
	   	consultantname=appInd.getCurrentDateTime();
	   	getConsNameField().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+consultantname);
		appInd.singleDropDown(getVendorTypeDD(),sheet.getRow(i).getCell(1).getStringCellValue());
		appInd.singleDropDown(getApprovedDD(),sheet.getRow(i).getCell(2).getStringCellValue());
		appInd.singleDropDown(getActiveDD(),sheet.getRow(i).getCell(3).getStringCellValue());
		getPanNoField().sendKeys(appInd.PanNumber());
		getGSTINField().sendKeys(appInd.gstinNumber());
		getDivArrowOfficeAddress();
		w2.until(ExpectedConditions.visibilityOf(streetTextArea));
		getStreetTextArea().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		appInd.singleDropDown(getCountryDD(),sheet.getRow(i).getCell(5).getStringCellValue());
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='ddlState']//option[2]")));
		appInd.singleDropDown(getStateDD(),sheet.getRow(i).getCell(6).getStringCellValue());
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='ddlCity']//option[2]")));
		appInd.singleDropDown(getCityDD(),sheet.getRow(i).getCell(7).getStringCellValue());
		getPinCodeField().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getDivArrowExpertise();
		w2.until(ExpectedConditions.visibilityOf(addRowLink));
		getAddRowLink();
		appInd.singleDropDown(getMainSkillDD(),sheet.getRow(i).getCell(9).getStringCellValue());
		getSubmitBtn();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + consultantname), "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			getConsultantLink();
		}else {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + consultantname), "Created", sheetname, Engineering.outputCreatePath);
			count++;
		}
	}	
	    	catch (Exception e) {
	    		System.out.println(e);
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + consultantname), "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			getConsultantLink();
	}
	    	
	    	// Modify and update of contractor created above 
	    	
	    	try
	    	{
	   		Frames.SubMenuFrame();
	   		getConsultantLink();
	  		Frames.rightFrame();
			w2.until(ExpectedConditions.visibilityOf(goBtn));
			getFirmName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+consultantname);	
			for(int i=0;i<4;i++) {
				try {
					getGoBtn();
				}catch(Exception e) {}
				if(consHL.isDisplayed()) {
					break;
				}
			}
			Thread.sleep(2000);
			w2.until(ExpectedConditions.visibilityOf(consHL));
			getConsHLClick(); 
			w2.until(ExpectedConditions.visibilityOf(modifyBtn));
			getModifyBtn();
	    	w2.until(ExpectedConditions.textToBePresentInElement(pageName, "Edit Consultant"));
	    	switch(i) {
			
			case 1: getCSTNoField().sendKeys(sheet.getRow(1).getCell(12).getStringCellValue());
					break;
			case 2: getDivArrowOfficeAddress();
					w2.until(ExpectedConditions.visibilityOf(emailField));
					getEmailField().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+"@gmail.com");
					getMobileNo().sendKeys(appInd.getCurrentDateTime());
					break;
			case 3: getMSMENo().sendKeys(appInd.getCurrentDateTime());
					break;
			case 4: appInd.singleDropDown(getRegTypeDD(),sheet.getRow(2).getCell(12).getStringCellValue());
					break;
			case 5: getVATReg().sendKeys(appInd.gstinNumber());
					break;
						
					default: break;
			}
	    	
	    	w2.until(ExpectedConditions.visibilityOf(modifyBtn));
	    	getModifyBtn();
	    	Datatable.writeExcel(sheet.getRow(i).getCell(0).getStringCellValue()+" " + consultantname, "Modified and Updated", sheetname, Engineering.outputCreatePath);
	    	}	    	
	    	catch (Exception e) {
	    		System.out.println(e);
	    		System.out.println("Edit case failed for contractor: "+sheet.getRow(i).getCell(0).getStringCellValue()+" "+consultantname);
	    		Datatable.writeExcel(sheet.getRow(i).getCell(0).getStringCellValue()+" " + consultantname, "Modify Failed", sheetname, Engineering.outputCreatePath);
	    	}
	    	
	    }
	    	
	    	System.out.println("Total consultant created: "+count);
	    	if (sheet.getLastRowNum()==count) 
	    	{ 
	    		Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
	     	}
	    	else {
	    		Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
	    	}
	    	
	    }
	    	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

