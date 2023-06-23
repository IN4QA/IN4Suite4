package com.RE.Sales.Create.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.Create_Booking_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Create_Booking extends Create_Booking_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales sale;

	public Create_Booking(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	
	@FindBy(css = "#txtLeadFullName")
	private WebElement SearchLead;
	public WebElement getSearchLead() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchLead));
		return SearchLead;
	} 
	
	@FindBy(css = "input#btnGo")
	private WebElement GoBtn;
	public void getGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(GoBtn));
		GoBtn.click();
	}
	
	@FindBy(xpath = "//table[@id='gdvListLeads']//tr[3]//td//a[@class='ShortDesc']")
	private WebElement ClickLead;
	public void getClickLead() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickLead));
		ClickLead.click();
	} 
	
	@FindBy(xpath = "//a[text()='Sales']")
	private WebElement ClickSalesTab;
	public void getClickSalesTab() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickSalesTab));
		ClickSalesTab.click();
	} 
	
	@FindBy(css = "#btnAccountItem")
	private WebElement AddBooking;
	public void getAddBooking() {
		w2.until(ExpectedConditions.elementToBeClickable(AddBooking));
		AddBooking.click();
	}
	
	@FindBy(css = "input#cmdmodify")
	private WebElement Modify;
	public void getModify() {
		w2.until(ExpectedConditions.elementToBeClickable(Modify));
		Modify.click();
	} 
	
	@FindBy(css = "input#txtPan")
	private WebElement PANno;
	public WebElement getPANno() {
		w2.until(ExpectedConditions.elementToBeClickable(PANno));
		PANno.clear();
		w2.until(ExpectedConditions.elementToBeClickable(PANno));
		return PANno;
	} 
	
	@FindBy(xpath = "//a[contains(@onclick,'address')]")
	private WebElement ClickAddressTab;
	public void getClickAddressTab() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickAddressTab));
		ClickAddressTab.click();
	} 
	
	@FindBy(css = "span#SpRadio3")
	private WebElement PermanentRadioBtn;
	public void getPermanentRadioBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentRadioBtn));
		PermanentRadioBtn.click();
	} 
	
	@FindBy(css = "textarea#txtPermanentStreet")
	private WebElement PermanentStreet;
	public WebElement getPermanentStreet() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentStreet));
		PermanentStreet.clear();
		w2.until(ExpectedConditions.elementToBeClickable(PermanentStreet));
		return PermanentStreet;
	} 
	
	@FindBy(css = "input#txtPermanentPobox")
	private WebElement PermanentPobox;
	public WebElement getPermanentPobox() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPobox));
		PermanentPobox.clear();
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPobox));
		return PermanentPobox;
	} 
	
	@FindBy(css = "select#cboPermanentCountry")
	private WebElement PermanentCountry;
	public WebElement getPermanentCountry() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentCountry));
		return PermanentCountry;
	} 
	
	@FindBy(css = "select#cboPermanentState")
	private WebElement PermanentState;
	public WebElement getPermanentState() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentState));
		return PermanentState;
	} 
	
	@FindBy(css = "select#cboPermanentCity")
	private WebElement PermanentCity;
	public WebElement getPermanentCity() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentCity));
		return PermanentCity;
	} 
	
	@FindBy(css = "input#txtPermanentPin")
	private WebElement PermanentPin;
	public WebElement getPermanentPin() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPin));
		PermanentPin.clear();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPin));
		return PermanentPin;
	} 
	
	@FindBy(css = "input#txtPermanentPhone")
	private WebElement PermanentPhone1;
	public WebElement getPermanentPhone1() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPhone1));
		PermanentPhone1.clear();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPhone1));
		return PermanentPhone1;
	} 
	
	@FindBy(css = "input#txtPermanentPhone2")
	private WebElement PermanentPhone2;
	public WebElement getPermanentPhone2() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPhone2));
		PermanentPhone2.clear();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		w2.until(ExpectedConditions.elementToBeClickable(PermanentPhone2));
		return PermanentPhone2;
	} 
	
	@FindBy(css = "input#txtPermanentMobile")
	private WebElement PermanentMobile1;
	public WebElement getPermanentMobile1() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentMobile1));
		PermanentMobile1.clear();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		w2.until(ExpectedConditions.elementToBeClickable(PermanentMobile1));
		return PermanentMobile1;
	}
	
	@FindBy(css = "input#txtPermanentMobile2")
	private WebElement PermanentMobile2;
	public WebElement getPermanentMobile2() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentMobile2));
		PermanentMobile2.clear();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		w2.until(ExpectedConditions.elementToBeClickable(PermanentMobile2));
		return PermanentMobile2;
	} 
	
	@FindBy(css = "input#txtPermanentFax")
	private WebElement PermanentFax;
	public WebElement getPermanentFax() {
		w2.until(ExpectedConditions.elementToBeClickable(PermanentFax));
		PermanentFax.clear();
		if(appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		w2.until(ExpectedConditions.elementToBeClickable(PermanentFax));
		return PermanentFax;
	}
	
	@FindBy(css = "#Button1")
	private WebElement Update;
	public void getUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(Update));
		Update.click();
	} 
	
	@FindBy(css = "select#ddlProjects")
	private WebElement ProjectsDD;
	public WebElement getProjectsDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ProjectsDD));
		return ProjectsDD;
	} 
	
	@FindBy(css = "select#ddlSubProjects")
	private WebElement SubProjectsDD;
	public WebElement getSubProjectsDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SubProjectsDD));
		return SubProjectsDD;
	}  
	
	@FindBy(css = "select#ddlUnitType")
	private WebElement UnitTypeDD;
	public WebElement getUnitTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitTypeDD));
		return UnitTypeDD;
	}
	
	@FindBy(css = "select#ddlUnitNumber")
	private WebElement UnitNumberDD;
	public WebElement getUnitNumberDD() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitNumberDD));
		return UnitNumberDD;
	} 
	
	@FindBy(css = "select#ddlPlanName")
	private WebElement PlanNameDD;
	public WebElement getPlanNameDD() {
		w2.until(ExpectedConditions.elementToBeClickable(PlanNameDD));
		return PlanNameDD;
	} 
	
	@FindBy(css = "input#btnCreate")
	private WebElement CreateBtn;
	public void getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		CreateBtn.click();
	} 
	
	@FindBy(xpath = "//select[@id='ddlUnitNumber']//option[2]")
	private WebElement CreatedUnitNO;
	public String getCreatedUnitNO() {
		w2.until(ExpectedConditions.elementToBeClickable(CreatedUnitNO));
		return CreatedUnitNO.getText();
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
	
	@FindBy(css = "select#cboCustomerGrade")
	private WebElement CategoryGrade;
	public WebElement getCategoryGrade() {
		return CategoryGrade;
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

	int count = 0;
	String UnitNumber = "";
	public void createBooking() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				Frames.SubMenuFrame();
				sale.clickLeads();
				Frames.mainFrame();
				getGoBtn();
				getClickLead();
				Frames.mainDnFrame();
				getModify();
				getPANno().sendKeys(appInd.PanNumber());
				getClickAddressTab();
				getPermanentRadioBtn();
				getPermanentStreet().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
				appInd.singleDropDown(getTypeCategory(), sheet.getRow(i).getCell(8).getStringCellValue());
				appInd.seletDate(getFollowUpDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
				appInd.singleDropDown(getCategoryGrade(), "Regular");
				getPermanentPobox().sendKeys(appInd.RandomNoAsSpecified(6));
				appInd.singleDropDown(getPermanentCountry(), sheet.getRow(i).getCell(5).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPermanentState(), sheet.getRow(i).getCell(6).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPermanentCity(), sheet.getRow(i).getCell(7).getStringCellValue());
				Thread.sleep(1000);
				getPermanentPin().sendKeys(appInd.RandomNoAsSpecified(4));
				getPermanentPhone1().sendKeys(appInd.RandomNoAsSpecified(10));
				getPermanentPhone2().sendKeys(appInd.RandomNoAsSpecified(10));
				getPermanentMobile1().sendKeys(appInd.RandomNoAsSpecified(10));
				getPermanentMobile2().sendKeys(appInd.RandomNoAsSpecified(10));
				getPermanentFax().sendKeys(appInd.RandomNoAsSpecified(4));
				getUpdate();
				Thread.sleep(3000);
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}

				Frames.tabFrame();
				getClickSalesTab();
				Frames.mainDnFrame();
				getAddBooking();

				appInd.singleDropDown(getProjectsDD(), sheet.getRow(i).getCell(0).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getSubProjectsDD(), sheet.getRow(i).getCell(1).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getUnitTypeDD(), sheet.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				appInd.Selectbyindex(getUnitNumberDD(), 1);
				Thread.sleep(1000);
				appInd.singleDropDown(getPlanNameDD(), sheet.getRow(i).getCell(3).getStringCellValue());
				Thread.sleep(1000);
				UnitNumber = getCreatedUnitNO();
				getCreateBtn();		
				System.out.println("Unit number :: "+UnitNumber);
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
					Datatable.writeExcel(UnitNumber, "Created", sheetname, Sales.OutPutCreatePath);
					count++;
				} else {
					
					Datatable.writeExcel(UnitNumber, "Not Created", sheetname, Sales.OutPutCreatePath);
				}
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
				appInd.isAlertPresent();
				Datatable.writeExcel(UnitNumber, "Not Created", sheetname, Sales.OutPutCreatePath);
			}
		}
		if (sheet.getLastRowNum() == count) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Sales.OutPutCreatePath);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Sales.OutPutCreatePath);
		}

	}
}
