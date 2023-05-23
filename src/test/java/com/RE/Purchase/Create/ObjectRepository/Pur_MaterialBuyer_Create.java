package com.RE.Purchase.Create.ObjectRepository;

import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Purchase.Create.Test.Pur_MaterialBuyer_Create_Test;
import com.RE.Submodules.Purchase;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Pur_MaterialBuyer_Create extends Pur_MaterialBuyer_Create_Test {
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales sale;
	int i=1;
	
	public Pur_MaterialBuyer_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//a[text()='Material Buyer']")
	private WebElement materialbuyer;
	public void getmaterialbuyerlink() {
		materialbuyer.click();
	}
	
	@FindBy(name = "btnCreate")
	private WebElement creatematerialbuyer;
	public void getcreatematerialbuyer() {
		creatematerialbuyer.click();
	}
	@FindBy(name = "txtBuyerName")
	private WebElement searchbuyername;
	public WebElement getsearchbuyername() {
		return searchbuyername;
	}
	@FindBy(id = "btnGo")
	private WebElement GoButton;
	public void getGoButton() {
		GoButton.click();;
	}
	
	@FindBy(id = "gvMaterialBuyers_ctl03_lnkViewBuyers")
	private WebElement BuyerID;
	public void getBuyerID() {
		BuyerID.click();;
	}
	@FindBy(name = "txtBuyerName")
	private WebElement buyername;
	public WebElement getbuyername() {
		return buyername;
	}
	
	@FindBy(name = "txtPrintName")
	private WebElement printname;
	public WebElement getprintname() {
		return printname;
	}

	@FindBy(name = "txtBuyerNameCode")
	private WebElement buyercode;
	public WebElement getbuyercode() {
		return buyercode;
	}
	
	@FindBy(name = "ddlVendorType")
	private WebElement vendorTypeDD;
	public WebElement getvendorTypeDD() {
		return vendorTypeDD;
	}
	@FindBy(name = "txtContactName")
	private WebElement contactname;
	public WebElement getcontactname() {
		return contactname;
	}
	@FindBy(name = "txtRating")
	private WebElement Rating;
	public WebElement getRating() {
		return Rating;
	}
	@FindBy(id = "txtLSTNo")
	private WebElement LSTNo;
	public WebElement getLSTNo() {
		return LSTNo;
	}
	

	@FindBy(id = "txtCSTNo")
	private WebElement CSTNo;
	public WebElement getCSTNo() {
		return CSTNo;
	}
	
	@FindBy(id = "txtPANNo")
	private WebElement PANNo;
	public WebElement getPANNo() {
		return PANNo;
	}
	
	@FindBy(id = "txtVATRegistrationNo")
	private WebElement VATNo;
	public WebElement getVATNo() {
		return VATNo;
	}
	
	@FindBy(id = "txtExcisedutyNo")
	private WebElement ExcisedutyNo;
	public WebElement getExcisedutyNo() {
		return ExcisedutyNo;
	}
	@FindBy(id = "txtGSTIN")
	private WebElement GSTIN;
	public WebElement getGSTIN() {
		return GSTIN;
	}
	@FindBy(name = "txtMSMENO")
	private WebElement MSMENO;
	public WebElement getMSMENO() {
		return MSMENO;
	}
	@FindBy(name = "txtFavoring")
	private WebElement FavoringName;
	public WebElement getFavoringName() {
		return FavoringName;
	}
	
	@FindBy(name = "txtRemarks")
	private WebElement remarks;
	public WebElement getremarks() {
		return remarks;
	}
	
	@FindBy(id = "ddlActive")
	private WebElement ActiveDD;
	public WebElement getActiveDD() {
		return ActiveDD;
	}
	
	@FindBy(id = "txtStreet")
	private WebElement Street;
	public WebElement getStreet() {
		return Street;
	}
	
	@FindBy(id = "ddlCountry")
	private WebElement CountryDD;
	public WebElement getCountryDD() {
		return CountryDD;
	}
	
	@FindBy(id = "ddlState")
	private WebElement StateDD;
	public WebElement getStateDD() {
		return StateDD;
	}
	@FindBy(id = "ddlCity")
	private WebElement CityDD;
	public WebElement getCityDD() {
		return CityDD;
	}
	
	@FindBy(name = "txtPincode")
	private WebElement PostalCode;
	public WebElement getPostalCode() {
		return PostalCode;
	}
	@FindBy(name = "txtPhoneOffice")
	private WebElement PhoneOff;
	public WebElement getPhoneOff() {
		return PhoneOff;
	}
	@FindBy(name = "txtPhoneRes")
	private WebElement PhoneRes;
	public WebElement getPhoneRes() {
		return PhoneRes;
	}
	@FindBy(name = "txtFax")
	private WebElement FAXNo;
	public WebElement getFAXNo() {
		return FAXNo;
	}
	
	@FindBy(name = "txtMobile")
	private WebElement MobileNo;
	public WebElement getMobileNo() {
		return MobileNo;
	}
	@FindBy(name = "txtEmail")
	private WebElement EMail;
	public WebElement getEMail() {
		return EMail;
	}
	@FindBy(name = "txtWebsite")
	private WebElement WebSite;
	public WebElement getWebSite() {
		return WebSite;
	}
	@FindBy(name = "ddlPartyType")
	private WebElement PartyDD;
	public WebElement getPartyDD() {
		return PartyDD;
	}
	@FindBy(name = "btnsubmit")
	private WebElement CreateBut;
	public void getCreateBut() {
		 CreateBut.click();
	}
	
	@FindBy(name = "btnModify")
	private WebElement Modify;
	public void getModify() {
		 Modify.click();;
	}
	@FindBy(name = "btnUpdate")
	private WebElement Update;
	public void getUpdate() {
		 Update.click();
	}
	@FindBy(name = "btnCancel")
	private WebElement Back;
	public void getBack() {
		 Back.click();;
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
	String	BuyerName;
	String DateTime;
	
	public void MaterialBuyerCreation() throws Throwable{
		String nameofCurrentmethod=new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int updatecount=0;
		System.out.println(sheet.getLastRowNum());
		getmaterialbuyerlink();
		for(; i<=sheet.getLastRowNum() ; i++) {
			try {
				Frames.rightFrame();
				getcreatematerialbuyer();
				DateTime=appInd.getCurrentDateTime();
				getbuyername().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+DateTime);
				getbuyercode().sendKeys("Code"+appInd.getCurrentDateTime());
				getcontactname().sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
				getPANNo().sendKeys(appInd.PanNumber());
				getremarks().sendKeys("Material Buyer Created Through Test Automation");
				getStreet().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
				getCountryDD().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
				getStateDD().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
				getCityDD().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
				getPostalCode().sendKeys(appInd.PostalCode());
				getPhoneOff().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
				getCreateBut();
				Thread.sleep(2000);
				if (appInd.AlertPresent()) {
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue())+" Material Buyer", "Not Created", sheetname, Purchase.OutputCreatePath);
					Frames.SubMenuFrame();
					getmaterialbuyerlink();
					
				} else {
					
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue())+" Material Buyer", "Created", sheetname, Purchase.OutputCreatePath);
					count++;
				}
				
			} catch (Exception e) {
				Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue())+" Material Buyer", "Not Created Exception", sheetname, Purchase.OutputCreatePath);
				Frames.SubMenuFrame();
				getmaterialbuyerlink();
			}
			
			try {
				Thread.sleep(2000);
				getModify();
				Thread.sleep(2000);
				BuyerName=sheet.getRow(i).getCell(0).getStringCellValue()+DateTime;
				switch (i) {
				case 1:	getRating().sendKeys(sheet.getRow(10).getCell(11).getStringCellValue());
						getLSTNo().sendKeys(sheet.getRow(0).getCell(11).getStringCellValue());
					break;
				case 2: getCSTNo().sendKeys(sheet.getRow(1).getCell(11).getStringCellValue());
						getVATNo().sendKeys(sheet.getRow(2).getCell(11).getStringCellValue());
						break;
				case 3: getExcisedutyNo().sendKeys(sheet.getRow(3).getCell(11).getStringCellValue());
						getGSTIN().sendKeys(appInd.gstinNumber());
						break;
				case 4: getMSMENO().sendKeys(sheet.getRow(4).getCell(11).getStringCellValue());
						getActiveDD().sendKeys(sheet.getRow(5).getCell(11).getStringCellValue());
						getPhoneRes().sendKeys(sheet.getRow(6).getCell(11).getStringCellValue());
						break;
				case 5:	getFAXNo().sendKeys(sheet.getRow(7).getCell(11).getStringCellValue());
						getMobileNo().sendKeys(sheet.getRow(8).getCell(11).getStringCellValue());
						break;
				case 6: getEMail().sendKeys(BuyerName+"@gmail.com");
						getWebSite().sendKeys(BuyerName+".com");
						getPartyDD().sendKeys(sheet.getRow(9).getCell(11).getStringCellValue());
				default:
					break;
				}
				Thread.sleep(1000);
				getUpdate();
				Thread.sleep(1000);
				getBack();
				Thread.sleep(1000);
				if(appInd.AlertPresent()) {
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue())+" Material Buyer", "Not Updated", sheetname, Purchase.OutputCreatePath);
					Frames.SubMenuFrame();
					getmaterialbuyerlink();
				}else {
					Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue())+" Material Buyer", "Updated", sheetname, Purchase.OutputCreatePath);
					updatecount++;
				}
				
			} catch (Exception e) {
				Datatable.writeExcel((sheet.getRow(i).getCell(0).getStringCellValue())+" Material Buyer", "Exception - Not Updated", sheetname, Purchase.OutputCreatePath);
				Frames.SubMenuFrame();
				getmaterialbuyerlink();
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
			Datatable.writeExcel("Material Buyer Updation", "PASS", sheetname, Purchase.OutputCreatePath);
		}else {
			Datatable.writeExcel("Material Buyer Updation", "FAIL", sheetname, Purchase.OutputCreatePath);
		}
	}
	
}




