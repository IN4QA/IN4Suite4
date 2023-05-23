package com.RE.Engineering.Createpages.ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Engineering.Createpages.Test.ContractorMaster_Create_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;



public class ContractorMaster_Create extends ContractorMaster_Create_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static String sheetname;
	public static WebDriver iDriver;
	int i=1;
	
	public ContractorMaster_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname= this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//a[text()='Contractor']")
	private WebElement contractor;
	public void getContractorLink() {
		contractor.click();
	}
	
	@FindBy(id="btnCreateContractor")
	private WebElement createContractorbtn;
	public void getcreateContractorbtnClick() {
		createContractorbtn.click();
	}
	
	@FindBy(id="txtContractorName")
	private WebElement contName;
	public WebElement getContractorName() {
		return contName;
	}
	
	@FindBy(id="ddlVendorType")
	private WebElement vendorTypeDD;
	public WebElement getvendorTypeDD() {
		return vendorTypeDD;
	}
	
	@FindBy(name="txtPanNo")
	private WebElement panNoField;
	public WebElement getPanNoField() {
		return panNoField;
	}
	
	@FindBy(name="ddlApproved")
	private WebElement approvedDD;
	public WebElement getapprovedDD() {
		return approvedDD;
	}
	
	@FindBy(name="ddlStatus")
	private WebElement activeDD;
	public WebElement getactiveDD() {
		return activeDD;
	}
	
	@FindBy(name="txtNotes")
	private WebElement noteTextArea;
	public WebElement getnoteTextArea() {
		return noteTextArea;
	}
	
	@FindBy(id="txtGSTIN")
	private WebElement gstinField;
	public WebElement getGSTIN() {
		return gstinField;
	}
	
	
	
	//Registered Office Address Elements
	@FindBy(xpath="//table[@id='Table4']//tr//img")
	private WebElement divArrow;
	public void getdivArrowClick() {
		divArrow.click();
	}	
	@FindBy(xpath="//table[@id='Table6']//td[2]//textarea")  
	private WebElement streetTextArea;
	public WebElement getstreetTextArea() {
		return streetTextArea;
	}
	
	@FindBy(tagName="textarea")
	private WebElement streetTextAreaTagName;
	public WebElement getstreetTextAreaTagName() {
		return streetTextAreaTagName;
	}
	
	
	@FindBy(id="ddlCountry")
	private WebElement countryDD;
	public WebElement getcountryDD() {
		return countryDD;
	}
	@FindBy(id="ddlState")
	private WebElement stateDD;
	public WebElement getstateDD() {
		return stateDD;
	}
	@FindBy(id="ddlCity")
	private WebElement cityDD;
	public WebElement getcityDD() {
		return cityDD;
	}
	@FindBy(id="txtPinCode")
	private WebElement pincodeTextField;
	public WebElement getpincodeTextField() {
		return pincodeTextField;
	}
	
	//Expertise section elements
	@FindBy(xpath="//td[@class='in4-tabletitle']//img")
	private WebElement divArrow1;
	public void getdivArrowClick1() {
		divArrow1.click();
	}
	@FindBy(id="btnAddExpertise")
	private WebElement addRowlink;
	public void getaddRowlinkClick() {
		addRowlink.click();
	}
	@FindBy(id="gvExpertise_ctl02_ddlMainSkill")
	private WebElement mainSkillDD;
	public WebElement getmainSkillDD() {
		return mainSkillDD;
	}
	
	@FindBy(name="gvExpertise_ctl02_txtRemarks")
	private WebElement specialityTextArea;
	public WebElement getspecialityTextArea() {
		return specialityTextArea;
	}
	@FindBy(id="btnSubmit")
	private WebElement createButton;
	public void getcreateButtonClick() {
		createButton.click();
	}
	//Get view page name
	@FindBy(xpath = "//div[@class='in4-title']")
	private WebElement PageName;
	public String getPageName() {
		return PageName.getText();
	}
	
	//list page 
	@FindBy(id="txtConsultantName")
	private WebElement firmName;
	public WebElement getFirmName() {
		return firmName;
	}
	
	@FindBy(id="btnGo")
	private WebElement gobtn;
	public void getGoBtnClick() {
		gobtn.click();
	}
	@FindBy(xpath="//table[@class='in4-table']//tr[2]//td//a")   // contractor name hyperlink element
	private WebElement contNameHL;
	public void getcontNameHLClick() {
		contNameHL.click();
	}
	
	
	
	
	//modify page
	
	@FindBy(id="btnUpdate")
	private WebElement modifybtn;
	public void getModifyBtnClick() {
		modifybtn.click();
	}	
	@FindBy(id="btnUpdate")
	private WebElement updatebtn;
	public void getUpdateBtnClick() {
		updatebtn.click();
	}
	@FindBy(id="txtCSTNo")
	private WebElement cstNo;
	public WebElement getCSTNo() {
		return cstNo;
	}	
	@FindBy(id="chkMiscContractor")
	private WebElement miscCheckbox;
	public void getMiscContCB() {
		miscCheckbox.click();
	}
	@FindBy(id="txtMobileNo")     //Registered Office Address
	private WebElement mobileNo;
	public WebElement getMobileNo() {
		return mobileNo;
	}
	@FindBy(id="txtEmail")       //Registered Office Address
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="txtMSMENo")       
	private WebElement MSMEno;
	public WebElement getMSMENo() {
		return MSMEno;
	}
	@FindBy(id="ddlPartyType")       
	private WebElement partyTypeDD;
	public WebElement getPartyTypeDD() {
		return partyTypeDD;
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
	

	
	

String contractorname;	

	public void contractorCreate() throws Throwable {
	    	    
	    String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0, num=0;
		System.out.println(sheet.getLastRowNum());
	    for(;i<=sheet.getLastRowNum();i++)	{
	    	try {
	    Frames.SubMenuFrame();
	    getContractorLink();
	    Frames.rightFrame();
	   	w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnCreateContractor']")));
		getcreateContractorbtnClick();		
		contractorname=appInd.getCurrentDateTime();
		getContractorName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+contractorname);
		System.out.println("created ::"+sheet.getRow(i).getCell(0).getStringCellValue()+" "+contractorname);
		appInd.singleDropDown(getvendorTypeDD(),sheet.getRow(i).getCell(1).getStringCellValue());
		appInd.singleDropDown(getapprovedDD(),sheet.getRow(i).getCell(2).getStringCellValue());
		appInd.singleDropDown(getactiveDD(),sheet.getRow(i).getCell(3).getStringCellValue());
		getPanNoField().sendKeys(appInd.PanNumber());
		getGSTIN().sendKeys(appInd.gstinNumber());
		getdivArrowClick();
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='Table6']//td[2]//textarea")));
		getstreetTextArea().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		appInd.singleDropDown(getcountryDD(),sheet.getRow(i).getCell(5).getStringCellValue());
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='ddlState']//option[2]")));
		appInd.singleDropDown(getstateDD(),sheet.getRow(i).getCell(6).getStringCellValue());
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='ddlCity']//option[2]")));
		appInd.singleDropDown(getcityDD(),sheet.getRow(i).getCell(7).getStringCellValue());
		getpincodeTextField().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getdivArrowClick1();
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnAddExpertise']")));
		getaddRowlinkClick();
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='gvExpertise_ctl02_ddlMainSkill']")));
		appInd.singleDropDown(getmainSkillDD(),sheet.getRow(i).getCell(9).getStringCellValue());
		getcreateButtonClick();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + contractorname), "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			getContractorLink();
		}else {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + contractorname), "Created", sheetname, Engineering.outputCreatePath);
			count++;
		}
	}	
	    	catch (Exception e) {
	    		System.out.println(e);
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + contractorname), "Not Created", sheetname, Engineering.outputCreatePath);
			Frames.SubMenuFrame();
			getContractorLink();
	}
	    	
	    	// Modify and update of contractor created above 
	    	
	    	try
	    	{
	   		Frames.SubMenuFrame();
	  		getContractorLink();
	  		Frames.rightFrame();
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnGo")));
			getFirmName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+contractorname);	
			System.out.println("searching ::"+sheet.getRow(i).getCell(0).getStringCellValue()+" "+contractorname);
			
			Thread.sleep(1000);
			for(int i=0;i<4;i++) {
				try {
					getGoBtnClick();
				}catch(Exception e) {}
				if(contNameHL.isDisplayed()) {
					break;
				}
			}
			Thread.sleep(2000);
			w2.until(ExpectedConditions.visibilityOf(contNameHL));
			getcontNameHLClick(); 
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnUpdate")));
			getModifyBtnClick();
	    	
	    	switch(i) {
			
			case 1: getCSTNo().sendKeys(sheet.getRow(1).getCell(12).getStringCellValue());
					getMiscContCB();
					break;
			case 2: getdivArrowClick();
					w2.until(ExpectedConditions.visibilityOf(email));
					getEmail().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+"@gmail.com");
					getMobileNo().sendKeys(appInd.getCurrentDateTime());
					break;
			case 3: getMSMENo().sendKeys(appInd.getCurrentDateTime());
					break;
			case 4: appInd.singleDropDown(getPartyTypeDD(),sheet.getRow(3).getCell(12).getStringCellValue());
					break;
			case 5: getGSTIN().sendKeys(appInd.gstinNumber());
			
					break;
				
					default: break;
			}
	    	
	    	w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnUpdate")));
	    	getUpdateBtnClick();
	    	Datatable.writeExcel(sheet.getRow(i).getCell(0).getStringCellValue()+" " + contractorname, "Modified and Updated", sheetname, Engineering.outputCreatePath);
	    	}	    	
	    	catch (Exception e) {
	    		System.out.println(e);
	    		System.out.println("Edit case failed for contractor: "+sheet.getRow(i).getCell(0).getStringCellValue()+" "+contractorname);
	    		Datatable.writeExcel(sheet.getRow(i).getCell(0).getStringCellValue()+" " + contractorname, "Modify Failed", sheetname, Engineering.outputCreatePath);
	    	}
	    	
	    }
	    	
	    	System.out.println("Total contractors created: "+count);
	    	if (sheet.getLastRowNum()==count) 
	    	{ 
	    		Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
	     	}
	    	else {
	    		Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
	    	}
	    }
	    	
}