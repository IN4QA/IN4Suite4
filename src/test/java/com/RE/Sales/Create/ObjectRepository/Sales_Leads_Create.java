package com.RE.Sales.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Sales.Create.Test.Sales_Leads_Create_Test;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Sales_Leads_Create extends Sales_Leads_Create_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales sale;

	public Sales_Leads_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	@FindBy(css = "#btnCreateLead")
	private WebElement CreateLeadbtn;

	public WebElement getCreateLeadbtn() {
		return CreateLeadbtn;
	}

	@FindBy(css = "select#cboTitle")
	private WebElement Title;

	public WebElement getTitle() {
		return Title;
	}

	@FindBy(css = "input#txtName")
	private WebElement FirstName;

	public void getFirstName(int i) {
		FirstName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
	}

	@FindBy(css = "input#txtLastName")
	private WebElement LastName;

	public void getLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	@FindBy(css = "select#cboCategory")
	private WebElement TypeCategory;

	public WebElement getTypeCategory() {
		return TypeCategory;
	}

	@FindBy(css = "input#txtFollowUpDate_txtDate")
	private WebElement FollowUpDate;

	public WebElement getFollowUpDate() {
		return FollowUpDate;
	}

	@FindBy(css = "select#ddlCountryCode")
	private WebElement CountryCode;

	public WebElement getCountryCode() {
		return CountryCode;
	}

	@FindBy(css = "input#txtPrefContact")
	private WebElement PrefferedContactNo;

	public void getPrefferedContactNo() {
		if (PrefferedContactNo.getAttribute("value") == "") {
			PrefferedContactNo.sendKeys(appInd.getCurrentDateTime());
		} else {
			PrefferedContactNo.clear();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			PrefferedContactNo.sendKeys(appInd.getCurrentDateTime());
		}
	}

	@FindBy(css = "select#cboAssignedTo")
	private WebElement AssignTo;

	public WebElement getAssignTo() {
		return AssignTo;
	}

	@FindBy(xpath = "//select[@id='cboEnquirySource']/..//p//span[@class='placeholder']")
	private WebElement EnquirySource;

	public WebElement getEnquirySource() {
		return EnquirySource;
	}

	@FindBy(xpath = "//select[@id='cboEnquirySource']/..//input	")
	private WebElement EnterEnquirySource;

	public WebElement getEnterEnquirySource() {
		return EnterEnquirySource;
	}

	@FindBy(xpath = "//select[@id='cboEnquirySource']/..//p[@class='select-all']")
	private List<WebElement> ListEnquirySource;

	public List<WebElement> getListEnquirySource() {
		return ListEnquirySource;
	}

	@FindBy(css = "input#txtPermanentEMail1")
	private WebElement PermanentEMail1;

	public void getPermanentEMail1(String mail, int i) {
		PermanentEMail1.sendKeys(mail + appInd.getCurrentDateTime() + "@gmail.com");
	}

	@FindBy(css = "input#cmdSubmit")
	private WebElement Submit;

	public void getSubmit() {
		Submit.click();
	}

	@FindBy(xpath = "//div[@class='additinaltabs']//div//label[@for='rdoCorporate']")
	private WebElement Corporate;

	public WebElement getCorporate() {
		return Corporate;
	}

	@FindBy(css = "input#txtCompany")
	private WebElement Company;
	public WebElement getCompany() {
		return Company;
	}

	@FindBy(css = "input#cmdmodify")
	private WebElement Modify;

	public void getModify() {
		Modify.click();
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
		ClickLead.findElement(By.xpath("//tr//td//a[contains(text(),'" + leadname + "')]")).click();
	}

	@FindBy(css = "input#txtPan")
	private WebElement PAN;

	public void getPAN() {
		PAN.sendKeys(appInd.PanNumber());
	}

	@FindBy(css = "#Button1")
	private WebElement Update;

	public void getUpdate() {
		Update.click();
	}

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickSales();
			Thread.sleep(2000);
			sale = new Sales(iDriver);
			sale.clickLeads();
			Thread.sleep(1000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Sales.CreatePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	String lastNameIndividual;

	public void createSalesIndividualLeads() throws Throwable {

		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count = 0, num = 0, leadnum = 0;
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				if (num == 0) {
					num++;
				} else {
					Frames.SubMenuFrame();
					sale.clickLeads();
				}
				Frames.mainFrame();
				w2.until(ExpectedConditions.elementToBeClickable(getCreateLeadbtn()));
				getCreateLeadbtn().click();
				appInd.singleDropDown(getTitle(), sheet.getRow(i).getCell(0).getStringCellValue());
				getFirstName(i);
				lastNameIndividual = appInd.getCurrentDateTime();
				getLastName(lastNameIndividual);
				appInd.singleDropDown(getTypeCategory(), sheet.getRow(i).getCell(2).getStringCellValue());
				appInd.singleDropDown(getAssignTo(), sheet.getRow(i).getCell(3).getStringCellValue());
				appInd.multiDD_withText(getEnquirySource(), getEnterEnquirySource(), sheet.getRow(i).getCell(4).getStringCellValue(), getListEnquirySource());
				getPermanentEMail1(sheet.getRow(i).getCell(1).getStringCellValue(), i);
				appInd.seletDate(getFollowUpDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
				appInd.singleDropDown(getCountryCode(), sheet.getRow(i).getCell(5).getStringCellValue());
				getPrefferedContactNo();
				getSubmit();
				Thread.sleep(1000);
				if (appInd.AlertPresent()) {

					if (appInd.alertText().equalsIgnoreCase("Lead created sucessfully")) {
						count++;
						Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Created", sheetname, Sales.OutPutCreatePath);
						w2.until(ExpectedConditions.alertIsPresent());
						appInd.isAlertPresent();
					} else {
						Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Not Created", sheetname, Sales.OutPutCreatePath);
						Frames.SubMenuFrame();
						sale.clickLeads();
					}
				} else {
					Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Not Created exception", sheetname, Sales.OutPutCreatePath);
					Frames.SubMenuFrame();
					sale.clickLeads();
				}
			} catch (Exception e) {
				Datatable.writeExcel((sheet.getRow(i).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Not Created", sheetname, Sales.OutPutCreatePath);
				Frames.SubMenuFrame();
				sale.clickLeads();
			}
			leadnum = i;
		}
		try {
		Frames.SubMenuFrame();
		sale.clickLeads();
		Frames.mainFrame();
		getSearchLead(sheet.getRow(leadnum).getCell(1).getStringCellValue() + " " + lastNameIndividual);
		getGo();
		getClickLead(sheet.getRow(leadnum).getCell(1).getStringCellValue());
		Frames.innerFrame();
		getModify();
		getPAN();
		getPrefferedContactNo();
		getUpdate();
		Thread.sleep(1000);
		if (appInd.AlertPresent()) {

			if (appInd.alertText().equalsIgnoreCase("Details updated sucessfully")) {
				Datatable.writeExcel((sheet.getRow(leadnum).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Updated",
						sheetname, Sales.OutPutCreatePath);
				w2.until(ExpectedConditions.alertIsPresent());
				appInd.isAlertPresent();
			} else {
				Datatable.writeExcel((sheet.getRow(leadnum).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Not Updated",
						sheetname, Sales.OutPutCreatePath);
				Frames.SubMenuFrame();
				sale.clickQualified();
			}
		} else {
			Datatable.writeExcel((sheet.getRow(leadnum).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Not Updated",
					sheetname, Sales.OutPutCreatePath);
			Frames.SubMenuFrame();
			sale.clickQualified();
		}
		}catch(Exception e) {
			Datatable.writeExcel((sheet.getRow(leadnum).getCell(1).getStringCellValue()+" " + lastNameIndividual), "Not Updated",
					sheetname, Sales.OutPutCreatePath);
			Frames.SubMenuFrame();
			sale.clickQualified();
		}

		if (count == sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Sales.OutPutCreatePath);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}
		Frames.SubMenuFrame();
		sale.clickLeads();
	}

	String lastNameCorporate;
	
	public void createSalesCorporateLeads() throws Throwable {

		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count = 0, num = 0, leadnum = 0;
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				if (num == 0) {
					num++;
				} else {
					Frames.SubMenuFrame();
					sale.clickLeads();
				}
				Frames.mainFrame();
				w2.until(ExpectedConditions.elementToBeClickable(getCreateLeadbtn()));
				getCreateLeadbtn().click();
				w2.until(ExpectedConditions.elementToBeClickable(getCorporate()));
				getCorporate().click();
				w2.until(ExpectedConditions.elementToBeClickable(getCompany()));
				lastNameCorporate = appInd.getCurrentDateTime();
				getCompany().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue() + " " + lastNameCorporate);
				appInd.singleDropDown(getTypeCategory(), sheet.getRow(i).getCell(2).getStringCellValue());
				appInd.singleDropDown(getAssignTo(), sheet.getRow(i).getCell(3).getStringCellValue());
				appInd.multiDD_withText(getEnquirySource(), getEnterEnquirySource(),sheet.getRow(i).getCell(4).getStringCellValue(), getListEnquirySource());
				String[] emailFirst = sheet.getRow(i).getCell(6).getStringCellValue().split(" ");
				getPermanentEMail1(emailFirst[0], i);
				appInd.singleDropDown(getCountryCode(), sheet.getRow(i).getCell(5).getStringCellValue());
				getPrefferedContactNo();
				getSubmit();
				Thread.sleep(1000);
				if (appInd.AlertPresent()) {

					if (appInd.alertText().equalsIgnoreCase("Lead created sucessfully")) {
						count++;
						Datatable.writeExcel((sheet.getRow(i).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Created", sheetname, Sales.OutPutCreatePath);
						w2.until(ExpectedConditions.alertIsPresent());
						appInd.isAlertPresent();
					} else {
						Datatable.writeExcel((sheet.getRow(i).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Not Created", sheetname, Sales.OutPutCreatePath);
						Frames.SubMenuFrame();
						sale.clickLeads();
					}
				} else {
					Datatable.writeExcel((sheet.getRow(i).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Not Created exception", sheetname, Sales.OutPutCreatePath);
					Frames.SubMenuFrame();
					sale.clickLeads();
				}
			} catch (Exception e) {
				Datatable.writeExcel((sheet.getRow(i).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Not Created", sheetname, Sales.OutPutCreatePath);
				Frames.SubMenuFrame();
				sale.clickLeads();
			}
			leadnum = i;
		}
		Frames.SubMenuFrame();
		sale.clickLeads();
		Frames.mainFrame();
		getSearchLead(sheet.getRow(leadnum).getCell(6).getStringCellValue() + " " + lastNameCorporate);
		getGo();
		getClickLead(sheet.getRow(leadnum).getCell(6).getStringCellValue());
		Frames.innerFrame();
		getModify();
		getPAN();
		getPrefferedContactNo();
		getUpdate();
		Thread.sleep(1000);
		if (appInd.AlertPresent()) {

			if (appInd.alertText().equalsIgnoreCase("Details updated sucessfully")) {
				Datatable.writeExcel((sheet.getRow(leadnum).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Updated", sheetname, Sales.OutPutCreatePath);
				w2.until(ExpectedConditions.alertIsPresent());
				appInd.isAlertPresent();
			} else {
				Datatable.writeExcel((sheet.getRow(leadnum).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Not Updated", sheetname, Sales.OutPutCreatePath);
				Frames.SubMenuFrame();
				sale.clickQualified();
			}
		} else {
			Datatable.writeExcel((sheet.getRow(leadnum).getCell(6).getStringCellValue()+" " + lastNameCorporate), "Not Updated", sheetname, Sales.OutPutCreatePath);
			Frames.SubMenuFrame();
			sale.clickQualified();
		}
		if (count == sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Sales.OutPutCreatePath);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}
	}

}
