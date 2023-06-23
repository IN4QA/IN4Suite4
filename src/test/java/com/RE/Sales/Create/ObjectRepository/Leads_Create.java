package com.RE.Sales.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.Leads_Create_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Leads_Create extends Leads_Create_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;

	public Leads_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	@FindBy(css = "#btnCreateLead")
	private WebElement CreateLeadbtn;

	public WebElement getCreateLeadbtn() {
		return CreateLeadbtn;
	}

	@FindBy(css = "select#ddlTitle")
	private WebElement Title;

	public WebElement getTitle() {
		return Title;
	}

	@FindBy(css = "input#txtFirstName")
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(css = "input#txtLastName")
	private WebElement LastName;

	public void getLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	@FindBy(css = "select#ddlCountryCode")
	private WebElement CountryCode;

	public WebElement getCountryCode() {
		return CountryCode;
	}

	@FindBy(css = "input#txtPrefferedContactNo")
	private WebElement PrefferedContactNo;

	public void getPrefferedContactNo() {
		PrefferedContactNo.sendKeys(appInd.getCurrentDateTime());
	}

	@FindBy(xpath = "//select[@id='ddlEnquirySource']/..//p//span[@class='placeholder']")
	private WebElement EnquirySource;

	public WebElement getEnquirySource() {
		return EnquirySource;
	}

	@FindBy(xpath = "//select[@id='ddlEnquirySource']/..//input	")
	private WebElement EnterEnquirySource;

	public WebElement getEnterEnquirySource() {
		return EnterEnquirySource;
	}

	@FindBy(xpath = "//select[@id='ddlEnquirySource']/..//p[@class='select-all']")
	private List<WebElement> ListEnquirySource;

	public List<WebElement> getListEnquirySource() {
		return ListEnquirySource;
	}

	@FindBy(css = "input#txtInterestedIn")
	private WebElement InterestedIn;

	public WebElement getInterestedIn() {
		return InterestedIn;
	}

	@FindBy(css = "select#ddlAssignTo")
	private WebElement AssignTo;

	public WebElement getAssignTo() {
		return AssignTo;
	}

	@FindBy(css = "#btnSave")
	private WebElement Save;

	public void getSave() {
		Save.click();
	}

	@FindBy(css = "#txtLeadFullName")
	private WebElement SearchLead;

	public void getSearchLead(String search) {
		SearchLead.sendKeys(search);
	}

	@FindBy(css = "input#btnGo")
	private WebElement Go;

	public void getGo() {
		Go.click();
	}

	@FindBy(xpath = "//table[@id='gdvListLeads']")
	private WebElement ClickLead;

	public void getClickLead(String leadname) {
		w2.until(ExpectedConditions.elementToBeClickable(ClickLead));
		ClickLead.findElement(By.xpath("//td//a[contains(text(),'" + leadname + "')]")).click();
	}

	@FindBy(css = "input#cmdmodify")
	private WebElement Modify;

	public void getModify() {
		w2.until(ExpectedConditions.elementToBeClickable(Modify));
		Modify.click();
	}

	@FindBy(css = "select#cboCategory")
	private WebElement TypeCategory;

	public WebElement getTypeCategory() {
		return TypeCategory;
	}

	@FindBy(css = "select#cboCustomerGrade")
	private WebElement CustomerGradeCategory;

	public WebElement getCustomerGradeCategory() {
		return CustomerGradeCategory;
	}

	@FindBy(css = "input#txtFollowUpDate_txtDate")
	private WebElement FollowUpDate;
	public WebElement getFollowUpDate() {
		return FollowUpDate;
	}
	
	@FindBy(css = "#Button1")
	private WebElement Update;
	public void getUpdate() {
		Update.click();
	}

	@FindBy(css = "input#txtEmail")
	private WebElement PermanentEMail1;
	public WebElement getPermanentEMail1() {
		return PermanentEMail1;
	}
	

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickLeads();
			Thread.sleep(2000);
			en = new Sales(iDriver);
			en.clickQualified();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Sales.CreatePath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	String lastName;

	public void createLead() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count = 0, num=0;
		System.out.println(sheet.getLastRowNum());
		for (int i = 1;i<=sheet.getLastRowNum(); i++) {

			try {
				Frames.mainFrame();
				w2.until(ExpectedConditions.elementToBeClickable(getCreateLeadbtn()));
				getCreateLeadbtn().click();
				w2.until(ExpectedConditions.elementToBeClickable(getTitle()));
				appInd.singleDropDown(getTitle(), sheet.getRow(i).getCell(0).getStringCellValue());
				getFirstName().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
				lastName = appInd.getCurrentDateTime();
				getLastName(lastName);
				getPermanentEMail1().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue()+ appInd.getCurrentDateTime() + "@gmail.com");
				appInd.singleDropDown(getCountryCode(), sheet.getRow(i).getCell(2).getStringCellValue());
				getPrefferedContactNo();
				appInd.multiDD_withText(getEnquirySource(), getEnterEnquirySource(), sheet.getRow(i).getCell(3).getStringCellValue(), getListEnquirySource());
				getInterestedIn().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
				appInd.singleDropDown(getAssignTo(), sheet.getRow(i).getCell(5).getStringCellValue());
				getSave();
				if (appInd.AlertPresent()) {
					Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue() + lastName), "Not Created", sheetname, Sales.OutPutCreatePath);
					Frames.SubMenuFrame();
					en.clickQualified();
				}else {
					count++;
					Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue() + lastName), "Created", sheetname, Sales.OutPutCreatePath);
				}
			} catch (Exception e) {
				Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue() + lastName), "Not Created", sheetname, Sales.OutPutCreatePath);
				Frames.SubMenuFrame();
				en.clickQualified();
			}
			num = i;
		}
		Frames.mainFrame();
		getSearchLead(sheet.getRow(num).getCell(1).getStringCellValue() + " " + lastName);
		getGo();
		getClickLead(sheet.getRow(num).getCell(1).getStringCellValue());
		Frames.innerFrame();
		getModify();
		appInd.singleDropDown(getTypeCategory(), sheet.getRow(num).getCell(6).getStringCellValue());
		appInd.singleDropDown(getCustomerGradeCategory(), sheet.getRow(num).getCell(7).getStringCellValue());
		appInd.seletDate(getFollowUpDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
		getUpdate();
		w2.until(ExpectedConditions.alertIsPresent());
		appInd.isAlertPresent();
		if (sheet.getLastRowNum() == count) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Sales.OutPutCreatePath);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}
	}


}
