package com.RE.Purchase.Create.ObjectRepository;


import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Purchase.Create.Test.Pur_SupplierMaster_Create_Test;
import com.RE.Submodules.Purchase;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Pur_SupplierMaster_Create extends Pur_SupplierMaster_Create_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales sale;
	int i=1;
	public Pur_SupplierMaster_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	@FindBy(xpath = "//a[text()='Supplier']")
	private WebElement Supplier;
	public void getSupplier() {
		Supplier.click();
	}
	
	@FindBy(id = "btnAddSupplier")
	private WebElement createbutton;
	public WebElement getcreatebutton() {
		return createbutton;
	}
	
	@FindBy(name = "txtSupplierName")
	private WebElement Suppname;
	
	public void getsuppname() {
		Suppname.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" "+suppname);
	}
	@FindBy(name = "txtSupplierCode")
	private WebElement suppcode;
	public void getsuppcode() {
		 suppcode.sendKeys("Code" +suppname);
		
	}
	@FindBy(name = "ddlVendorType")
	private WebElement vendortypeDD;
	public WebElement getvendortypeDD() {
		return vendortypeDD;
	}
	@FindBy(name = "txtContactName")
	private WebElement contactname;
	public WebElement getcontactname() {
		return contactname;
	}
	@FindBy(css = "input#txtPAN")
	private WebElement PANno;
	public void getPANno() {
		 PANno.sendKeys(appInd.PanNumber());
	}
	
	@FindBy(name = "txtRemarks")
	private WebElement Remarks;
	public WebElement getRemarks() {
		return Remarks;
	}
	@FindBy(id = "ddlStatus")
	private WebElement ActiveDD;
	public WebElement getActiveDD() {
		return ActiveDD;
	}
	@FindBy(name = "txtAddress")
	private WebElement Streetname;
	public void getStreetname() {
		Streetname.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());;
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
	@FindBy(name = "ddlCity")
	private WebElement CityDD;
	public WebElement getCityDD() {
		return CityDD;
	}
	@FindBy(css = "input#txtZip")
	private WebElement PostalCode;
	public void getPostalCode() {
		PostalCode.sendKeys(suppname);
	}
	@FindBy(name = "txtOffPhone")
	private WebElement PhoneOff;
	public WebElement getPhoneOff() {
		return PhoneOff;
	}
	@FindBy(css="input#txtMobile")
	private WebElement MobileNo;
	public void getMobileNo() {
		MobileNo.sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
	}
	@FindBy(css="input#txtEmail")
	private WebElement EMail;
	public WebElement getEMail() {
		return EMail;
	}
	
	@FindBy(name = "txtGSTIN")
	private WebElement GSTIN;
	public WebElement getGSTIN() {
		return GSTIN;
	}
	
	@FindBy(name = "txtFax")
	private WebElement FAXNo;
	public WebElement getFAXNo() {
		return FAXNo;
	}
	@FindBy(name = "txtVATRegNo")
	private WebElement VATNo;
	public WebElement getVATNo() {
		return VATNo;
	}
	@FindBy(name = "ddlConstitution")
	private WebElement ConstitutionDD;
	public WebElement getConstitutionDD() {
		return ConstitutionDD;
	}
	
	@FindBy(id = "txtExiceDutyNo")
	private WebElement ExciseDutyNo;
	public WebElement getExciseDutyNo() {
		return ExciseDutyNo;
	}
	
	@FindBy(id = "txtCreditPeriod")
	private WebElement CreditPeriod;
	public WebElement getCreditPeriod() {
		return CreditPeriod;
	}
	@FindBy(name = "ddlRegType")
	private WebElement RegistrationTypeDD;
	public WebElement getRegistrationTypeDD() {
		return RegistrationTypeDD;
	}
	
	@FindBy(id = "ddlPartyType")
	private WebElement PartyTypeDD;
	public WebElement getPartyTypeDD() {
		return PartyTypeDD;
	}
	
	@FindBy(id = "txtLBT")
	private WebElement LBTNo;
	public WebElement getLBTNo() {
		return LBTNo;
	}
	
	@FindBy(css="input#btnAdd")
	private WebElement create;
	public void getcreate() {
		create.click();
	}
	
	@FindBy(name = "txtSupplier")
	private WebElement SuppNameSearch;
	public WebElement getSuppNameSearch() {
		return SuppNameSearch;
	}
	
	@FindBy(name = "btnSearch")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();
	}
	
	@FindBy(id = "gvSupplierList_ctl03_lblId")
	private WebElement SuppID;
	public void getSuppID() {
		SuppID.click();
	}
	
	@FindBy(name = "btnModify")
	private WebElement ModifyButton;
	public void getModifyButton() {
		ModifyButton.click();
	}
	
	@FindBy(name = "txtMSMENO")
	private WebElement MSMENo;
	public WebElement getMSMENo() {
		return MSMENo;
	}
	@FindBy(name = "btnAdd")
	private WebElement UpdateButton;
	public void getUpdateButton() {
		UpdateButton.click();
	}
	@FindBy(id = "btnBack")
	private WebElement BakcButton;
	public void getBakcButton() {
		BakcButton.click();
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
String suppname;

	public void CreateSupplier()throws Throwable{
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count = 0, num=0;
		System.out.println(sheet.getLastRowNum());
		SupplierCreate.getSupplier();
		for (; i<=sheet.getLastRowNum() ; i++) {
			try {
			
				Frames.rightFrame();
				w2.until(ExpectedConditions.elementToBeClickable(getcreatebutton()));
				getcreatebutton().click();
				suppname=appInd.getCurrentDateTime();
				getsuppname();
				getsuppcode();
				appInd.singleDropDown(getvendortypeDD(),"Company");
				getcontactname().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
				getPANno();
				getRemarks().sendKeys("SUPPLIER CREATED THROUGH AUTOMATION");
				getStreetname();
				appInd.singleDropDown(getCountryDD(), sheet.getRow(i).getCell(3).getStringCellValue());
				appInd.singleDropDown(getStateDD(), sheet.getRow(i).getCell(4).getStringCellValue());
				appInd.singleDropDown(getCityDD(), sheet.getRow(i).getCell(5).getStringCellValue());
				getPostalCode();
				getPhoneOff().sendKeys(suppname);
				getcreate();
				if(appInd.AlertPresent()) {
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + suppname), "Not Created", sheetname, Purchase.OutputCreatePath);
					Frames.SubMenuFrame();
					SupplierCreate.getSupplier();
				}else {
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + suppname), "Created", sheetname, Purchase.OutputCreatePath);
					count++;
				}
			}
				catch (Exception e) {
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue()+" " + suppname), "Not Created", sheetname, Purchase.OutputCreatePath);
					Frames.SubMenuFrame();
					SupplierCreate.getSupplier();
			
		}
				
			
			getSuppNameSearch().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+" " + suppname);
			Thread.sleep(1000);
			getGoButton();
			getSuppID();
			getModifyButton();
			switch(i) {
			
			case 1: getEMail().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+"@gmail.com");
					getcontactname().sendKeys(sheet.getRow(1).getCell(7).getStringCellValue());
					break;
			case 2: appInd.singleDropDown(getActiveDD(), sheet.getRow(2).getCell(7).getStringCellValue());
					getExciseDutyNo().sendKeys(sheet.getRow(3).getCell(7).getStringCellValue());
					break;
			case 3: getMSMENo().sendKeys(sheet.getRow(4).getCell(7).getStringCellValue());
					getPhoneOff().sendKeys(sheet.getRow(5).getCell(7).getStringCellValue());
					break;
			case 4: getRegistrationTypeDD().sendKeys(sheet.getRow(6).getCell(7).getStringCellValue());
					getFAXNo().sendKeys(sheet.getRow(7).getCell(7).getStringCellValue());
					break;
			case 5: getGSTIN().sendKeys(appInd.gstinNumber());
					getVATNo().sendKeys(sheet.getRow(8).getCell(7).getStringCellValue());
					break;
			case 6: getCreditPeriod().sendKeys(sheet.getRow(9).getCell(7).getStringCellValue());
					getLBTNo().sendKeys(sheet.getRow(10).getCell(7).getStringCellValue());
					break;
			case 7: appInd.singleDropDown(getConstitutionDD(), sheet.getRow(11).getCell(7).getStringCellValue());
					appInd.singleDropDown(getPartyTypeDD(), sheet.getRow(12).getCell(7).getStringCellValue());
					break;
	
					default: break;
			}
			Thread.sleep(1000);
			getUpdateButton();
			getBakcButton();
			}
		
		System.out.println("Total suppliers created: "+count);
		if(sheet.getLastRowNum() == count) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Purchase.OutputCreatePath);
		}
	}
}




