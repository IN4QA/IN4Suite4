package com.RE.Sales.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RE.Sales.Create.Test.PromotionAgent_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class PromotionAgent_Create extends PromotionAgent_Create_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;
	
	public PromotionAgent_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	@FindBy(xpath = "//a[text()='Promotion Agent']")
	private WebElement promotionagentlink;
	public void getpromotionagentlink() {
		promotionagentlink.click();
	}
	@FindBy(name = "btnCreatePromotionAgent")
	private WebElement createagentbutton;
	public void getcreateagentbutton() {
		createagentbutton.click();
	}
	@FindBy(css="input#txtAgentName")
	private WebElement AgentName;
	public WebElement getAgentName() {
		return AgentName;
	}
	@FindBy(css = "select#ddlVendorType")
	private WebElement VendorTypeDD;
	public WebElement getVendorTypeDD() {
		return VendorTypeDD;
	}
	@FindBy(name = "ddlConstitution")
	private WebElement Constitution;
	public WebElement getConstitution() {
		return Constitution;
	}
	@FindBy(css = "input#txtBrokerage")
	private WebElement BrokeragePer;
	public WebElement getBrokeragePer() {
		return BrokeragePer;
	}
	@FindBy(css = "input#txtPanNo")
	private WebElement PanNo;
	public WebElement getPanNo() {
		return PanNo;
	}
	@FindBy(css = "input#txtGSTINo")
	private WebElement GSTIN;
	public WebElement getGSTIN() {
		return GSTIN;
	}
	
	@FindBy(css = "input#txtMSMENo")
	private WebElement TaxNo;
	public WebElement getTaxNo() {
		return TaxNo;
	}
	@FindBy(css="input#txtMSMENo")
	private WebElement MSMENo;
	public WebElement getMSMENo() {
		return MSMENo;
	}
	@FindBy(name = "ddlRegType")
	private WebElement RegTypeDD;
	public WebElement getRegTypeDD() {
		return RegTypeDD;
	}
	
	@FindBy(id = "ddlPartyType")
	private WebElement PartyTypeDD;
	public WebElement getPartyTypeDD() {
		return PartyTypeDD;
	}
	
	@FindBy(css = "select#ddlActive")
	private WebElement ActiveDD;
	public WebElement getActiveDD() {
		return ActiveDD;
	}
	
	@FindBy(id = "txtStreet")
	private WebElement Street;
	public WebElement getStreet() {
		return Street;
	}
	
	
	@FindBy(css = "select#ddlCountry")
	private WebElement CountryDD;
	public WebElement getCountryDD() {
		return CountryDD;
	}
		
	@FindBy(css = "select#ddlState")
	private WebElement StateDD;
	public WebElement getStateDD() {
		return StateDD;
	}
	@FindBy(css = "select#ddlCity")
	private WebElement CityDD;
	public WebElement getCityDD() {
		return CityDD;
	}
	
	@FindBy(css = "input#txtPinCode")
	private WebElement PinCode;
	public WebElement getPinCode() {
		return PinCode;
	}
	@FindBy(css = "input#txtOffPhone")
	private WebElement Phone;
	public WebElement getPhone() {
		return Phone;
	}
	@FindBy(name = "txtMobileCD")
	private WebElement Mobile;
	public WebElement getMobile() {
		return Mobile;
	}
	@FindBy(name = "txtFaxCD")
	private WebElement Fax;
	public WebElement getFax() {
		return Fax;
	}
	@FindBy(css = "input#txtEmailCD")
	private WebElement EMail;
	public WebElement getEMail() {
		return EMail;
	}
	
	@FindBy(name = "txtURLCD")
	private WebElement Url;
	public WebElement getUrl() {
		return Url;
	}
	//Other Contact person grid
	
	@FindBy(xpath="//td[@class='ptb-5']//a[@id='lnkbtnAddRow']")
	private WebElement addcontact;
	public void getaddcontact() {
		addcontact.click();
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//input[@type='text']")
	private WebElement ContactName;
	public WebElement getContactName() {
		return ContactName;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//input[@class='input']")
	private WebElement Designation;
	public WebElement getDesignation() {
		return Designation;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[4]//textarea[@rows='2']")
	private WebElement Address;
	public WebElement getAddress() {
		return Address;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[5]//input[@class='input']")
	private WebElement ContactEMail;
	public WebElement getContactEMail() {
		return ContactEMail;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[6]//input[@type='text']")
	private WebElement ContactPhone;
	public WebElement getContactPhone() {
		return ContactPhone;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[7]//input[@type='text']")
	private WebElement ContactMobile;
	public WebElement getContactMobile() {
		return ContactMobile;
	}
	@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']")
	private WebElement ContactFax;
	public WebElement getContactFax() {
		return ContactFax;
	}
	@FindBy(xpath="//div[@id='pnlExpert']//table[@class='in4-table']//tr[2]//input[@type='checkbox']")
	private WebElement Expertise;
	public WebElement getExpertise() {
		return Expertise;
	}

	@FindBy(name = "btnCreate")
	private WebElement Create;
	public void getCreate() {
		Create.click();;
	}
	@FindBy(id = "btnModify")
	private WebElement Modify;
	public void getModify() {
		Modify.click();;
	}
	
	@FindBy(name = "btnUpdate")
	private WebElement update;
	public void getupdate() {
		update.click();;
	}
	@FindBy(name = "btnBack")
	private WebElement back;
	public void getback() {
		back.click();;
	}
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();;
			Thread.sleep(2000);
			en = new Sales(iDriver);
			en.clickAgent();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Sales.CreatePath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	String DateTime;
	String PromotionAgentName;
	int i = 1;
	
	public void AgentCreation() throws Throwable{
		String nameofCurrentmethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int updatecount=0;
		System.out.println(sheet.getLastRowNum());
		for(;i<=sheet.getLastRowNum();i++)
		{
			try {
		Frames.SubMenuFrame();
		getpromotionagentlink();
		Frames.rightFrame();
		getcreateagentbutton();
		
		DateTime=appInd.getCurrentDateTime();
		PromotionAgentName=sheet.getRow(i).getCell(0).getStringCellValue();
		getAgentName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()+DateTime);
		getVendorTypeDD().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		getConstitution().sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
		getPanNo().sendKeys(appInd.PanNumber());
		Thread.sleep(1000);
		getGSTIN().sendKeys(appInd.gstinNumber());
		getActiveDD().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		getStreet().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		getCountryDD().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		getStateDD().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		getCityDD().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		getPinCode().sendKeys(appInd.RandomNumbers(6));
		getPhone().sendKeys(appInd.RandomNumbers(10));
		getaddcontact();
		getContactName().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
		getDesignation().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
		getAddress().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		getContactEMail().sendKeys(PromotionAgentName+"@gmail.com");
		getContactPhone().sendKeys(appInd.RandomNumbers(12));
		getContactMobile().sendKeys(appInd.RandomNumbers(10));
		getContactFax().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
		getExpertise().click();
		Thread.sleep(1000);
		getCreate();
		if(appInd.AlertPresent()) {
			Datatable.writeExcel(PromotionAgentName, "Not Created", sheetname, Sales.OutPutCreatePath);
			
		}else{
			
			Datatable.writeExcel(PromotionAgentName, "Created", sheetname, Sales.OutPutCreatePath);
			count++;
		}
		
			}catch (Exception e) {
				Datatable.writeExcel(PromotionAgentName, "Not Created", sheetname, Sales.OutPutCreatePath);
			}
		
		
		Thread.sleep(2000);
		try {
		getModify();
		switch (i) {
		case 1:
			getTaxNo().sendKeys(sheet.getRow(0).getCell(11).getStringCellValue()+appInd.RandomNumbers(5));
			getMSMENo().sendKeys(sheet.getRow(1).getCell(14).getStringCellValue()+appInd.RandomNumbers(7));
			break;
		case 2:
			getRegTypeDD().sendKeys(sheet.getRow(2).getCell(14).getStringCellValue());
			getPartyTypeDD().sendKeys(sheet.getRow(3).getCell(14).getStringCellValue());
			break;
		case 3:
			getBrokeragePer().sendKeys(sheet.getRow(4).getCell(14).getStringCellValue());
			getFax().sendKeys(sheet.getRow(5).getCell(14).getStringCellValue());
			break;
		case 4:
			getPartyTypeDD().sendKeys(sheet.getRow(6).getCell(14).getStringCellValue());
			getUrl().sendKeys(sheet.getRow(7).getCell(14).getStringCellValue());
			break;
		case 5:
			getBrokeragePer().sendKeys(sheet.getRow(8).getCell(14).getStringCellValue());
			break;
			
		case 6:
			getBrokeragePer().sendKeys(sheet.getRow(9).getCell(14).getStringCellValue());
			getActiveDD().sendKeys(sheet.getRow(10).getCell(14).getStringCellValue());
			break;
			
		default:
			break;
		}
		
		getupdate();
		
		if(appInd.AlertPresent()) {
			Datatable.writeExcel(PromotionAgentName, "Not-Updated", sheetname, Sales.OutPutCreatePath);
			}else
			{
				Datatable.writeExcel(PromotionAgentName, "Updated", sheetname, Sales.OutPutCreatePath);
				updatecount++;
			}
		}
			catch (Exception e) {
				
				Datatable.writeExcel(PromotionAgentName, "Not Updated", sheetname, Sales.OutPutCreatePath);
			}
		getback();
		}	
		System.out.println("Total Number of Promotion Agents Created ----"+count);
		if(sheet.getLastRowNum()==count) {
			Datatable.writeExcel(nameofCurrentmethod, "PASS", sheetname, Sales.OutPutCreatePath);
			
		}else {
			Datatable.writeExcel(nameofCurrentmethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}
		System.out.println("Total Number of Promotion Agents Updated ----"+updatecount);
		if(sheet.getLastRowNum()==updatecount) {
			Datatable.writeExcel("AgentUpadtion", "PASS", sheetname, Sales.OutPutCreatePath);
			
		}else {
			Datatable.writeExcel("AgentUpadtion", "FAIL", sheetname, Sales.OutPutCreatePath);
		}
	}

}
