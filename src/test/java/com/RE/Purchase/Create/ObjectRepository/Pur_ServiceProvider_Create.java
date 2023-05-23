package com.RE.Purchase.Create.ObjectRepository;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RE.Purchase.Create.Test.Pur_ServiceProvider_Create_Test;
import com.RE.Submodules.Purchase;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Pur_ServiceProvider_Create extends Pur_ServiceProvider_Create_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales sale;
	int i=1;
	
	public Pur_ServiceProvider_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	@FindBy(xpath = "//a[text()='Service Provider'][contains(@href,'ListServiceProviders')]")
	private WebElement ServiceProvider;
	public void getServiceProviderLink() {
		ServiceProvider.click();
	}
	@FindBy(id = "btnAddServiceProvider")
	private WebElement CreateServiceProvider;
	public void getCreateServiceProvider() {
		CreateServiceProvider.click();
	}
	
	@FindBy(name = "txtServiceProvider")
	private WebElement SearchServiceProvider;
	public WebElement getSearchServiceProvider() {
		return SearchServiceProvider;
	}
	@FindBy(name = "Button1")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();
	}
	@FindBy(id = "gvServiceProviderList_ctl03_lnkServiceProvider")
	private WebElement name;
	public void getname() {
		name.click();
	}
	
	@FindBy(name = "txtServiceProviderName")
	private WebElement ServiceProviderName;
	public WebElement getServiceProviderName() {
		return ServiceProviderName;
	}
	@FindBy(name = "ddlVendorType")
	private WebElement VendorTypeDD;
	public WebElement getVendorTypeDD() {
		return VendorTypeDD;
	}
	@FindBy(name = "txtContactName")
	private WebElement ContactName;
	public WebElement getContactName() {
		return	ContactName;
	}
	@FindBy(name = "txtRating")
	private WebElement rating;
	public WebElement getrating() {
		return rating;
	}
	@FindBy(id = "txtLST")
	private WebElement LSTNo;
	public WebElement getLSTNo() {
		 return LSTNo;
	}
	@FindBy(id = "txtCST")
	private WebElement CSTNo;
	public void getCSTNo() {
		CSTNo.click();
	}
	@FindBy(id = "txtPAN")
	private WebElement PANNo;
	public WebElement getPANNo() {
		return PANNo ;
	}
	@FindBy(id = "txtServiceTaxno")
	private WebElement ServiceTaxNo;
	public WebElement getServiceTaxNo() {
		return	ServiceTaxNo;
	}
	@FindBy(name = "txtVATRegNo")
	private WebElement VATNo;
	public WebElement getVATNo() {
		return	VATNo;
	}
	
	@FindBy(id = "txtGSTIN")
	private WebElement GSTIN;
	public WebElement getGSTIN() {
		return GSTIN;
	}
	@FindBy(name = "txtMSMENO")
	private WebElement MSMENo;
	public WebElement getMSMENo() {
		return MSMENo;
	}
	@FindBy(name = "txtRemarks")
	private WebElement Remarks;
	public WebElement getRemarks() {
		return	Remarks;
	}
	@FindBy(id = "ddlStatus")
	private WebElement ActiveDD;
	public WebElement getActiveDD() {
		return ActiveDD;
	}
	@FindBy(name = "ddlConstitution")
	private WebElement ConstitutionDD;
	public WebElement getConstitutionDD() {
		return ConstitutionDD;
	}
	
	@FindBy(name = "txtAddress")
	private WebElement Street;
	public WebElement getStreet() {
		return	Street;
	}
	@FindBy(name = "ddlCountries")
	private WebElement CountryDD;
	public WebElement getCountryDD() {
		return CountryDD;
	}
	@FindBy(name = "ddlStates")
	private WebElement StateDD;
	public WebElement getStateDD() {
		return StateDD;
	}
	@FindBy(id = "ddlCity")
	private WebElement CityDD;
	public WebElement getCityDD() {
		return CityDD;
	}
	@FindBy(name = "txtZip")
	private WebElement PostalCode;
	public WebElement getPostalCode() {
		return PostalCode;
	}
	@FindBy(name = "txtOffPhone")
	private WebElement Phone_off;
	public WebElement getPhone_off() {
		return	Phone_off;
	}
	
	@FindBy(name = "txtResPhone")
	private WebElement Phone_Res;
	public WebElement getPhone_Res() {
		return Phone_Res;
	}
	@FindBy(id = "txtFax")
	private WebElement FAX;
	public WebElement getFAX() {
		return FAX;
	}
	@FindBy(name = "txtMobile")
	private WebElement Mobile;
	public WebElement getMobile() {
		return Mobile;
	}
	@FindBy(id = "txtEmail")
	private WebElement E_Mail;
	public WebElement getE_Mail() {
		return E_Mail;
	}
	@FindBy(name = "txtWebSite")
	private WebElement Website;
	public WebElement getWebsite() {
		return Website;
	}
	@FindBy(id = "ddlRegType")
	private WebElement RegTypeDD;
	public WebElement getRegTypeDD() {
		return	RegTypeDD;
	}
	@FindBy(id = "ddlPartyType")
	private WebElement PartyTypeDD;
	public WebElement getPartyTypeDD() {
		return PartyTypeDD;
	}
	
	@FindBy(id = "btnAdd")
	private WebElement CreateButton;
	public void getCreateButton() {
		CreateButton.click();
	}
	@FindBy(name = "btnModify")
	private WebElement ModifyButton;
	public void getModifyButton() {
		ModifyButton.click();
	}
	@FindBy(name = "btnAdd")
	private WebElement UpdateButton;
	public void getUpdateButton() {
		UpdateButton.click();
	}
	
	@FindBy(id = "btnBack")
	private WebElement BackButton;
	public void getBackButton() {
		BackButton.click();
	}
	public  void MainSubmenu() {
		try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickPurchase();
			Thread.sleep(1000);
			Purchase en=new Purchase(iDriver);
			en.clickmasters();
			Thread.sleep(1000);
			xml=new Datatable();
			sheet=xml.excelData(sheetname , Purchase.InputCreatePath);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed:"+e);
		}
	}
	String DateTime ;
	String  servicerproviderName;
	
	public void ServiceProvderCreation() throws Throwable {
		String nameofCurrentmethod=new Throwable().getStackTrace()[0].getMethodName();
		int count = 0;
		int updatecount=0;
		System.out.println(sheet.getLastRowNum());
		getServiceProviderLink();
		for (; i<=sheet.getLastRowNum() ; i++) {
		try {
		Frames.rightFrame();
		getCreateServiceProvider();
		DateTime=appInd.getCurrentDateTime();
		getServiceProviderName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue() +" "+ DateTime);
		getContactName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		getVendorTypeDD().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		getRemarks().sendKeys("Service Provider Created Through TEST_AUTOMATION");
		getPANNo().sendKeys(appInd.PanNumber());
		getGSTIN().sendKeys(appInd.gstinNumber());
		getStreet().sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
		getCountryDD().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		getStateDD().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getCityDD().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		getPostalCode().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		getPhone_off().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getCreateButton();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()), "Not Created", sheetname, Purchase.OutputCreatePath);
			Frames.SubMenuFrame();
			getServiceProviderLink();
		}else {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()), "Created", sheetname, Purchase.OutputCreatePath);
			count++;
		}
	}catch (Exception e) {
		Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()), "Not Created", sheetname, Purchase.OutputCreatePath);
		Frames.SubMenuFrame();
		getServiceProviderLink();
	}
		try {
		getSearchServiceProvider().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+ " " +DateTime);
		getGoButton();
		getname();
		getModifyButton();
		
	
		servicerproviderName=(sheet.getRow(i).getCell(0).getStringCellValue()+" "+ DateTime);
		String[] EMail=servicerproviderName.split(" ");
		
		
		switch (i) {
		case 1: getrating().sendKeys(sheet.getRow(0).getCell(9).getStringCellValue());
				getE_Mail().sendKeys(EMail[0]+"@gmail.com");
				getLSTNo().sendKeys(sheet.getRow(1).getCell(9).getStringCellValue());
				break;
		case 2: getServiceTaxNo().sendKeys(sheet.getRow(2).getCell(9).getStringCellValue());
				getVATNo().sendKeys(sheet.getRow(3).getCell(9).getStringCellValue());
				getE_Mail().sendKeys(EMail[0]+"@gmail.com");
				break; 
		case 3: getMSMENo().sendKeys(sheet.getRow(4).getCell(9).getStringCellValue());
				getActiveDD().sendKeys(sheet.getRow(5).getCell(9).getStringCellValue());
				break;
		case 4: getConstitutionDD().sendKeys(sheet.getRow(6).getCell(9).getStringCellValue());
				getPhone_Res().sendKeys(sheet.getRow(7).getCell(9).getStringCellValue());
				getE_Mail().sendKeys(EMail[0]+"@gmail.com");
				break;
		case 5: getFAX().sendKeys(sheet.getRow(8).getCell(9).getStringCellValue());
				getMobile().sendKeys(sheet.getRow(9).getCell(9).getStringCellValue());
				break;
		case 6: getE_Mail().sendKeys(EMail[0]+"@gmail.com");
				getWebsite().sendKeys(servicerproviderName+ ".com");
				break;
		case 7: getRegTypeDD().sendKeys(sheet.getRow(10).getCell(9).getStringCellValue());
				getPartyTypeDD().sendKeys(sheet.getRow(11).getCell(9).getStringCellValue());
				break;
		default:
			break;
		}
		
		Thread.sleep(2000);
		getUpdateButton();
		getBackButton();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()), "Not Updated", sheetname, Purchase.OutputCreatePath);
			Frames.SubMenuFrame();
			getServiceProviderLink();
		}else {
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()), "Updated", sheetname, Purchase.OutputCreatePath);
			updatecount++;
		}
		
		}	
		catch (Exception e) {
			if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()), "Not Updated exception", sheetname, Purchase.OutputCreatePath);
			Frames.SubMenuFrame();
			getServiceProviderLink();	
		}
	
		}
		System.out.println("Total suppliers created: "+count);
		if(sheet.getLastRowNum() == count) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Purchase.OutputCreatePath);
		}
		System.out.println("Total suppliers Updated: "+updatecount);
		if(sheet.getLastRowNum() == updatecount) {
			Datatable.writeExcel("ServiceProviderUpdation", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("ServiceProviderUpdation", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
	}
}


	
