package com.RE.Engineering.Createpages.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Engineering.Createpages.Test.StoreMaster_Create_Test;
import com.RE.Submodules.Engineering;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class StoreMaster_Create extends StoreMaster_Create_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	int i=1;
	
	public StoreMaster_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname= this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Store Master'][contains(@href,'Masters')]")
	private WebElement StoreMasterlink;
	public void getStoreMasterlink() {
		StoreMasterlink.click();
	}
	@FindBy(name = "btnCreateStore")
	private WebElement createstorebutton;
	public void getcreatestorebutton() {
		createstorebutton.click();
	}
	@FindBy(name = "txtStoreName")
	private WebElement storename;
	public WebElement getstorename() {
		return storename;
	}
	@FindBy(id = "txtStoreCode")
	private WebElement storecode;
	public WebElement getstorecode() {
		return storecode;
	}
	
	@FindBy(name = "ddlCertifyingCompany")
	private WebElement CompanyDD;
	public WebElement getCompanyDD() {
		return CompanyDD;
	}
	
	@FindBy(name = "txtContactPerson")
	private WebElement ContactPerson;
	public WebElement getContactPerson() {
		return ContactPerson;
	}
	
	@FindBy(id = "txtRemarks")
	private WebElement Reamrks;
	public WebElement getReamrks() {
		return Reamrks;
	}
	@FindBy(id = "ddlActive")
	private WebElement ActiveDD;
	public WebElement getActiveDD() {
		return ActiveDD;
	}
	@FindBy(name = "txtStreet")
	private WebElement Street;
	public WebElement getStreet() {
		return Street;
	}
	@FindBy(name = "ddlCountries")
	private WebElement CountryDD;
	public WebElement getCountryDD() {
		return CountryDD;
	}
	@FindBy(id = "ddlStates")
	private WebElement StateDD;
	public WebElement getStateDD() {
		return StateDD;
	}
	
	@FindBy(id = "ddlCity")
	private WebElement CityDD;
	public WebElement getCityDD() {
		return CityDD;
	}
	
	@FindBy(name = "txtPinCode")
	private WebElement PostalCode;
	public WebElement getPostalCode() {
		return PostalCode;
	}
	
	@FindBy(id = "txtPhone")
	private WebElement PhoneNo;
	public WebElement getPhoneNo() {
		return PhoneNo;
	}
	
	@FindBy(id = "txtMobile")
	private WebElement MobileNo;
	public WebElement getMobileNo() {
		return MobileNo;
	}
	
	@FindBy(name = "txtFax")
	private WebElement FAXNo;
	public WebElement getFAXNo() {
		return FAXNo;
	}
	@FindBy(xpath = "//a[text()='Add Sub Project']")
	private WebElement AddRowlink;
	public void getAddRowlink() {
		 AddRowlink.click();;
	}
//	@FindBy(name = "gvProjectlist$ctl02$ddlProject")
//	private WebElement Addproject;
//	public WebElement getAddproject() {
//		 return Addproject;
//	} 
	
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select")
	private WebElement Addproject;
	public WebElement getAddproject() {
		return Addproject;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select")
	private WebElement AddSubproject;
	public WebElement getAddSubproject() {
		return AddSubproject;
	}
	
//	@FindBy(name = "gvProjectlist$ctl02$ddlSubProject")
//	private WebElement AddSubproject;
//	public WebElement getAddSubproject() {
//		 return AddSubproject;
//	}
	
	@FindBy(id = "btnCreate")
	private WebElement Create;
	public void getCreate() {
		Create.click();;
	}
	@FindBy(name = "btnAdd")
	private WebElement ModifyButton;
	public void getModifyButton() {
		ModifyButton.click();;
	}
	@FindBy(id = "btnBack")
	private WebElement Backbutton;
	public void getBackbutton() {
		Backbutton.click();;
	}
	@FindBy(id = "btnGO")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();;
	}
	@FindBy(id = "gvStoresList_ctl03_lnkStoreCode")
	private WebElement StoreID;
	public void getStoreID() {
		StoreID.click();;
	}
	@FindBy(id = "btnCreate")
	private WebElement update;
	public void getupdate() {
		update.click();
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
	String DateTime;
	String StoreName;
	public void CreateStoreMaster()throws Throwable{
		  String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
			int count=0, num=0;
			int updatecount=0;
			System.out.println(sheet.getLastRowNum());
		for(;i<=sheet.getLastRowNum();i++)
		{
			try {
		Frames.SubMenuFrame();
		getStoreMasterlink();
		Frames.rightFrame();
		getcreatestorebutton();
		DateTime=appInd.getCurrentDateTime();
		getstorename().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+DateTime);
		StoreName=(sheet.getRow(i).getCell(0).getStringCellValue());
		getstorecode().sendKeys(StoreName+appInd.RandomNumbers(3));
		getCompanyDD().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		getContactPerson().sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
		getReamrks().sendKeys("STORE CREATED THROUGH TEST AUTOMATION");
		getActiveDD().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		getStreet().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getCountryDD().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		Thread.sleep(2000);
		getStateDD().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		getCityDD().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getPostalCode().sendKeys(appInd.PostalCode());
		getAddRowlink();
		appInd.singleDropDown(getAddproject(), sheet.getRow(i).getCell(8).getStringCellValue());
		appInd.singleDropDown(getAddSubproject(), sheet.getRow(i).getCell(9).getStringCellValue());
		getCreate();
		Thread.sleep(1000);
		if (appInd.AlertPresent()) {
			Datatable.writeExcel(StoreName, "Not Created", sheetname, Engineering.outputCreatePath);
			
		} else {
			Datatable.writeExcel(StoreName, "Created", sheetname, Engineering.outputCreatePath);
			count++;
		}
		}
		catch (Exception e) {
			Datatable.writeExcel(StoreName, "Not Created-Exception", sheetname, Engineering.outputCreatePath);
			
			}
		 try {
			 getModifyButton();
			 switch (i) {
			case 1:getPhoneNo().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
				   appInd.singleDropDown(getAddproject(), sheet.getRow(i).getCell(10).getStringCellValue());
					
				break;
			case 2:getMobileNo().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
				   appInd.singleDropDown(getAddSubproject(), sheet.getRow(i).getCell(11).getStringCellValue());
				break;
			case 3:getFAXNo().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
				appInd.singleDropDown(getAddproject(), sheet.getRow(i).getCell(10).getStringCellValue());
				appInd.singleDropDown(getAddSubproject(), sheet.getRow(i).getCell(11).getStringCellValue());
				break;
			default:
				break;
			}
			getupdate();
			
			if(appInd.AlertPresent()) {
			Datatable.writeExcel(StoreName, "Not-Updated", sheetname, Engineering.outputCreatePath);
			}else
			{
				Datatable.writeExcel(StoreName, "Updated", sheetname, Engineering.outputCreatePath);
				updatecount++;
			}
			
		} catch (Exception e) {
			Datatable.writeExcel(StoreName, "Not  Updated Exception", sheetname, Engineering.outputCreatePath);
		}
		 getBackbutton();
		}
		System.out.println("Total Stores created: "+count);
		System.out.println("Total Stores Updated: "+updatecount);
    	if (sheet.getLastRowNum()==count) 
    	{ 
    		Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Engineering.outputCreatePath);
    	}
    	
    	if (sheet.getLastRowNum()==updatecount) 
    	{ 
    		Datatable.writeExcel("StoreUpdation", "PASS", sheetname, Engineering.outputCreatePath);
     	}
    	else {
    		Datatable.writeExcel("StoreUpdation", "FAIL", sheetname, Engineering.outputCreatePath);
    	}
    	
    	
	}
}

	
	


//try {
//	appInd.singleDropDown(getAddproject(), sheet.getRow(i).getCell(9).getStringCellValue());
//	}catch(Exception e) {
//		System.out.println("DD exception :: "+e);
//	}
//
//	appInd.singleDropDown(getAddSubproject(), sheet.getRow(i).getCell(10).getStringCellValue());











