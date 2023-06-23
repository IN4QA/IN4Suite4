package com.RE.Sales.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Sales.Create.Test.Sales_Receipt_Create_Test;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Sales_Receipt_Create extends Sales_Receipt_Create_Test {

	public static XSSFSheet sheetUnit;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetnameUnit = "Sales_Receipt_Create";
	public static String outPutsheetTransaction = "Sales_Receipt_Create";
	public static Sales en;
	public static MainMenu mm;

	public Sales_Receipt_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	} 
	
	@FindBy(css = "#txtProject")
	private WebElement EnterProject;
	public WebElement getEnterProject() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterProject));
		return EnterProject;
		
	} 
	
	@FindBy(css = "#txtSubProject")
	private WebElement EntersubProject;
	public WebElement getEntersubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(EntersubProject));
		return EntersubProject;
	}  
	
	@FindBy(css = "#btnGo")
	private WebElement GoBtn;
	public void getGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(GoBtn));
		GoBtn.click();
	} 
	
	@FindBy(xpath = "//table[@class='in4-table']//td[3]//a")
	private WebElement SelectsubProject;
	public void getSelectsubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectsubProject));
		SelectsubProject.click();
	}  
	
	@FindBy(xpath = "//td[text()='Stock']")
	private WebElement StockTab;
	public void getStockTab() {
		w2.until(ExpectedConditions.elementToBeClickable(StockTab));
		StockTab.click();
	} 
	
	@FindBy(css = "#btnAddUnit")
	private WebElement AddUnitBtn;
	public void getAddUnitBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AddUnitBtn));
		AddUnitBtn.click();
	}  
	
	@FindBy(css = "select#ddlFloorNo")
	private WebElement FloorNoDD;
	public WebElement getFloorNoDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FloorNoDD));
		return FloorNoDD;
	}
	
	@FindBy(css = "select#ddlFloorType")
	private WebElement FloorTypeDD;
	public WebElement getFloorTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FloorTypeDD));
		return FloorTypeDD;
	}  
	
	@FindBy(css = "input#txtUnitNo")
	private WebElement UnitNo;
	public WebElement getUnitNo() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitNo));
		return UnitNo;
	}
	
	@FindBy(css = "select#ddlUnitType")
	private WebElement UnitType;
	public WebElement getUnitType() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitType));
		return UnitType;
	} 
	
	@FindBy(css = "input#txtSBA")
	private WebElement SaleableArea;
	public WebElement getSaleableArea() {
		w2.until(ExpectedConditions.elementToBeClickable(SaleableArea));
		return SaleableArea;
	}
	
	@FindBy(css = "input#btnCreate")
	private WebElement CreateBtn;
	public void getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		CreateBtn.click();;
	} 
	
	@FindBy(css = "#ddlType")
	private WebElement UnitTypeDD;
	public WebElement getUnitTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitTypeDD));
		return UnitTypeDD;
	}
	
	@FindBy(css = "select#ddlFromStatus")
	private WebElement FromStatusDD;
	public WebElement getFromStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(FromStatusDD));
		return FromStatusDD;
	}
	
	@FindBy(css = "select#ddlToStatus")
	private WebElement ToStatusDD;
	public WebElement getToStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ToStatusDD));
		return ToStatusDD;
	} 
	
	@FindBy(xpath = "//table[@class='in4-table1']//th[13]//tr[2]//input[contains(@id,'RelSalesAll')]")
	private WebElement SalesCheckBox;
	public void getSalesCheckBox() {
		w2.until(ExpectedConditions.elementToBeClickable(SalesCheckBox));
		SalesCheckBox.click();
	} 
	
	@FindBy(css = "#lnkChangeSts")
	private WebElement ChangeStatus;
	public void getChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ChangeStatus));
		ChangeStatus.click();
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
	public WebElement getFirstName() {
		return FirstName;
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

	@FindBy(css = "select#cboCustomerGrade")
	private WebElement CategoryGrade;
	public WebElement getCategoryGrade() {
		return CategoryGrade;
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

	public void getPermanentEMail1(String mail) {
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
	private WebElement ModifyLead;
	public void getModifyLead() {
		ModifyLead.click();
	}

	@FindBy(css = "#txtLeadFullName")
	private WebElement LeadSearchLead;
	public void getLeadSearchLead(String search) {
		LeadSearchLead.sendKeys(search);
	}

	@FindBy(css = "input#btnGo")
	private WebElement Go;

	public void getGo() {
		Go.click();
	}

//	@FindBy(xpath = "//table[@id='gdvListLeads']")
//	private WebElement ClickLead;
//
//	public void getClickLead(String leadname) {
//		w2.until(ExpectedConditions.elementToBeClickable(ClickLead));
//		ClickLead.findElement(By.xpath("//tr//td//a[contains(text(),'" + leadname + "')]")).click();
//	}

	@FindBy(css = "input#txtPan")
	private WebElement PAN;

	public void getPAN() {
		PAN.sendKeys(appInd.PanNumber());
	}

//	@FindBy(css = "#Button1")
//	private WebElement Update;
//
//	public void getUpdate() {
//		Update.click();
//	}
	
	// Create Booking Locators 
	
	@FindBy(css = "#txtLeadFullName")
	private WebElement SearchLead;
	public WebElement getSearchLead() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchLead));
		return SearchLead;
	} 
	
	@FindBy(css = "input#btnGo")
	private WebElement GoBtnBooking;
	public void getGoBtnBooking() {
		w2.until(ExpectedConditions.elementToBeClickable(GoBtnBooking));
		GoBtnBooking.click();
	}
	
	@FindBy(xpath = "//table[@id='gdvListLeads']//tr[2]//td//a[@class='ShortDesc']")
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
	private WebElement UnitTypeDDBooking;
	public WebElement getUnitTypeDDBooking() {
		w2.until(ExpectedConditions.elementToBeClickable(UnitTypeDDBooking));
		return UnitTypeDDBooking;
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
	private WebElement CreateBtnBooking;
	public void getCreateBtnBooking() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtnBooking));
		CreateBtnBooking.click();
	} 
	
	@FindBy(xpath = "//select[@id='ddlUnitNumber']//option[2]")
	private WebElement CreatedUnitNO;
	public String getCreatedUnitNO() {
		w2.until(ExpectedConditions.elementToBeClickable(CreatedUnitNO));
		return CreatedUnitNO.getText();
	} 
	
	@FindBy(css = "#txtLeadFullName")
	private WebElement SearchLeadBooking;
	public WebElement getSearchLeadBooking() {
		w2.until(ExpectedConditions.elementToBeClickable(SearchLeadBooking));
		return SearchLeadBooking;
	} 
	
	@FindBy(css = "input#dtLeadCreatedDate_txtDate")
	private WebElement LeadCreatedDate;
	public WebElement getLeadCreatedDate() {
		w2.until(ExpectedConditions.elementToBeClickable(LeadCreatedDate));
		return LeadCreatedDate;
	}
	
	@FindBy(css = "a#lbChangeAccStatus")
	private WebElement BookingChangeAccStatus;
	public void getBookingChangeAccStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(BookingChangeAccStatus));
		BookingChangeAccStatus.click();
	}
	
	@FindBy(css = "select#ddlAccNextStatus")
	private WebElement BookingNextStatus;
	public WebElement getBookingNextStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(BookingNextStatus));
		return BookingNextStatus;
	}
	
	@FindBy(css = "#lbAccUpdateStatus")
	private WebElement BookingUpdateStatus;
	public void getBookingUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(BookingUpdateStatus));
		BookingUpdateStatus.click();
	} 
	
	@FindBy(css = "input#dpBookingDate_txtDate")
	private WebElement BookingDate;
	public WebElement getBookingDate() {
		w2.until(ExpectedConditions.elementToBeClickable(BookingDate));
		return BookingDate;
	} 
	
	// receipt webelements
	
	@FindBy(css = "#txtUnitNo")
	private WebElement ReceiptEnterUnitNo;
	public WebElement getReceiptEnterUnitNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptEnterUnitNo));
		return ReceiptEnterUnitNo;
	} 
	
	@FindBy(css = "#btnGenerateText")
	private WebElement ReceiptGenerateBtn;
	public void getReceiptGenerateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptGenerateBtn));
		ReceiptGenerateBtn.click();
	} 
	
	@FindBy(xpath = "//div[contains(@id,'gdvStockList')]")
	private WebElement ReceiptClickUnit;
	public void getReceiptClickUnit(String UNO) {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptClickUnit));
		ReceiptClickUnit.findElement(By.xpath("//a[text()='"+UNO+"']")).click();
	} 
	
	@FindBy(css = "#aSchedule")
	private WebElement ReceiptSchedule;
	public void getReceiptSchedule() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptSchedule));
		ReceiptSchedule.click();
	} 
	
	@FindBy(xpath = "//a[text()='Receipts']")
	private WebElement ReceiptReceipts;
	public void getReceiptReceipts() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptReceipts));
		ReceiptReceipts.click();
	} 
	
	@FindBy(css = "#btnCreateReceipt")
	private WebElement ReceiptCreateReceipt;
	public void getReceiptCreateReceipt() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptCreateReceipt));
		ReceiptCreateReceipt.click();
	} 
	
	@FindBy(css = "input#dpReceiptDt_txtDate")
	private WebElement ReceiptReceiptDt;
	public WebElement getReceiptReceiptDt() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptReceiptDt));
		return ReceiptReceiptDt;
	} 
	
	@FindBy(css = "input#dpScheduleDt_txtDate")
	private WebElement ReceiptScheduleDt;
	public WebElement getReceiptScheduleDt() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptScheduleDt));
		return ReceiptScheduleDt;
	} 
	
	@FindBy(css = "input#btnGo")
	private WebElement ReceiptGoBtn;
	public void getReceiptGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptGoBtn));
		ReceiptGoBtn.click();
	} 
	
	@FindBy(css = "select#ddlPaymentMode")
	private WebElement ReceiptPaymentMode;
	public WebElement getReceiptPaymentMode() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptPaymentMode));
		return ReceiptPaymentMode;
	} 
	
	@FindBy(xpath = "//table[@class='in4-table']//select")
	private WebElement ReceiptBank;
	public WebElement getReceiptBank() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptBank));
		return ReceiptBank;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//td[3]//input")
	private WebElement ReceiptBranchName;
	public WebElement getReceiptBranchName() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptBranchName));
		return ReceiptBranchName;
	}  
	
	@FindBy(xpath = "//table[@class='in4-table']//td[4]//input")
	private WebElement ReceiptPayableAt;
	public WebElement getReceiptPayableAt() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptPayableAt));
		return ReceiptPayableAt;
	} 
	
	@FindBy(xpath = "//table[@class='in4-table']//td[5]//input")
	private WebElement ReceiptACNo;
	public WebElement getReceiptACNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptACNo));
		return ReceiptACNo;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//td[6]//input")
	private WebElement ReceiptInstrumentNo;
	public WebElement getReceiptInstrumentNo() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptInstrumentNo));
		return ReceiptInstrumentNo;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//td[7]//input")
	private WebElement ReceiptDate;
	public WebElement getReceiptDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptDate));
		return ReceiptDate;
	}
	
	@FindBy(xpath = "//table[@class='in4-table']//td[8]//input")
	private WebElement ReceiptAmount;
	public WebElement getReceiptAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptAmount));
		return ReceiptAmount;
	}
	
	@FindBy(css = "#btnFill")
	private WebElement ReceiptFillBtn;
	public void getReceiptFillBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptFillBtn));
		ReceiptFillBtn.click();
	} 
	
	@FindBy(css = "input#btnCreate")
	private WebElement ReceiptCreateBtn;
	public void getReceiptCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptCreateBtn));
		ReceiptCreateBtn.click();
	} 
	
	@FindBy(xpath = "//table[@class='in4-table'][@id='gvPaymentSchedule']//tr[1]//td")
	private List<WebElement> ReceiptIndexofTotalColumn;
	public int getReceiptIndexofTotalColumn() throws Throwable {
		Thread.sleep(2000);
		int rec = ReceiptIndexofTotalColumn.size();
		System.out.println("size given :: " +rec);
		rec = rec - 5;
		return ((rec * 2)+5);
	}
	
	
	@FindBy(css = "a#lbChangeStatus")
	private WebElement ReceiptChangeStatus;
	public void getReceiptChangeStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptChangeStatus));
		ReceiptChangeStatus.click();
	} 
	
	@FindBy(css = "select#ddlStatus")
	private WebElement ReceiptSelectStatus;
	public WebElement getReceiptSelectStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptSelectStatus));
		return ReceiptSelectStatus;
	}
	
	@FindBy(css = "a#lbUpdateStatus")
	private WebElement ReceiptUpdateStatus;
	public void getReceiptUpdateStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(ReceiptUpdateStatus));
		ReceiptUpdateStatus.click();
	} 
	
	@FindBy(xpath = "//table[@id='chargeTable_gvdCharges']//td[@class='total']//span[contains(@id,'ChargeAmt')][not(contains(@id,'ChargeAmtPaid'))]")
	private WebElement BillingReceiptAmount;
	public String getBillingReceiptAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(BillingReceiptAmount));
		return BillingReceiptAmount.getText();
	}
	
	public void MenuSubMenuUnit() {
		try {
			xml = new Datatable();
			sheetUnit = xml.excelData(sheetnameUnit, Sales.CreatePath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}

	public void genarateReceipt() throws Throwable {
		String unitNO = createUnit();
		String leadName = createSalesIndividualLeads();
		createBooking(unitNO, leadName);
		for(int i=1;i<=sheetUnit.getLastRowNum();i++) {
			createReceipt(unitNO, i);
		}
	}
	

	String UnitNumber = "";

	public String createUnit() throws Throwable {
//		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		mm = new MainMenu(iDriver);
		mm.clickProjects();
		Thread.sleep(2000);
		en = new Sales(iDriver);
		en.clickProjectMaster();
		Thread.sleep(1000);
		
		Frames.mainFrame();
		getEnterProject().sendKeys(sheetUnit.getRow(1).getCell(0).getStringCellValue());
		getEntersubProject().sendKeys(sheetUnit.getRow(1).getCell(1).getStringCellValue());
		getGoBtn();
		getSelectsubProject();
		try {
			Frames.tabFrame();
			getStockTab();
			Frames.mainDnFrame();
			getAddUnitBtn();
			appInd.singleDropDown(getFloorNoDD(), sheetUnit.getRow(1).getCell(2).getStringCellValue());
			appInd.singleDropDown(getFloorTypeDD(), sheetUnit.getRow(1).getCell(3).getStringCellValue());
			UnitNumber = (sheetUnit.getRow(1).getCell(4).getStringCellValue()
					+ String.valueOf(appInd.RandomNoAsSpecified(4)));
			getUnitNo().sendKeys(UnitNumber);
			appInd.singleDropDown(getUnitType(), sheetUnit.getRow(1).getCell(5).getStringCellValue());
			getSaleableArea().sendKeys(sheetUnit.getRow(1).getCell(6).getStringCellValue());
			getCreateBtn();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel(UnitNumber, "Not Created", outPutsheetTransaction, Sales.OutPutCreatePath);
			} else {
				Datatable.writeExcel(UnitNumber, "Created", outPutsheetTransaction, Sales.OutPutCreatePath);
			}
		} catch (Exception e) {
			Datatable.writeExcel(UnitNumber, "Not Created", outPutsheetTransaction, Sales.OutPutCreatePath);
		}
		Frames.tabFrame();
		getStockTab();
		Frames.mainDnFrame();
		appInd.singleDropDown(getUnitTypeDD(), "Sales");
		Thread.sleep(1000);
		appInd.singleDropDown(getFromStatusDD(), "Hold");
		Thread.sleep(1000);
		appInd.singleDropDown(getToStatusDD(), "Available");
		Thread.sleep(1000);
		getSalesCheckBox();
		getChangeStatus();
		if (appInd.AlertPresent()) {
			appInd.isAlertPresent();
		}
		return UnitNumber;
	}
	
	String lastNameIndividual;
	String leadName;

	public String createSalesIndividualLeads() throws Throwable {

//		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		mm = new MainMenu(iDriver);
		mm.clickSales();
		Thread.sleep(2000);
		en = new Sales(iDriver);
		en.clickLeads();
		Thread.sleep(1000);
		
		try {
//			Frames.SubMenuFrame();
//			en.clickLeads();

			Frames.mainFrame();
			w2.until(ExpectedConditions.elementToBeClickable(getCreateLeadbtn()));
			getCreateLeadbtn().click();
			appInd.singleDropDown(getTitle(), sheetUnit.getRow(1).getCell(7).getStringCellValue());
			getFirstName().sendKeys(sheetUnit.getRow(1).getCell(8).getStringCellValue());
			lastNameIndividual = appInd.getCurrentDateTime();
			getLastName(lastNameIndividual);
			appInd.singleDropDown(getTypeCategory(), sheetUnit.getRow(1).getCell(9).getStringCellValue());
			appInd.singleDropDown(getCategoryGrade(), "Regular");
			appInd.singleDropDown(getAssignTo(), sheetUnit.getRow(1).getCell(10).getStringCellValue());
			appInd.multiDD_withText(getEnquirySource(), getEnterEnquirySource(),
					sheetUnit.getRow(1).getCell(11).getStringCellValue(), getListEnquirySource());
			getPermanentEMail1(sheetUnit.getRow(1).getCell(8).getStringCellValue());
			appInd.seletDate(getFollowUpDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
			appInd.singleDropDown(getCountryCode(), sheetUnit.getRow(1).getCell(12).getStringCellValue());
			getPrefferedContactNo();
			appInd.seletDate(getLeadCreatedDate(), "Jan 01, 2022");
			getSubmit();
			leadName = (sheetUnit.getRow(1).getCell(8).getStringCellValue() + " " + lastNameIndividual);
			Thread.sleep(3000);
			if (appInd.AlertPresent()) {

				if (appInd.alertText().equalsIgnoreCase("Lead created sucessfully")) {

					Datatable.writeExcel(leadName, "Created", outPutsheetTransaction, Sales.OutPutCreatePath);
					w2.until(ExpectedConditions.alertIsPresent());
					appInd.isAlertPresent();
				} else {
					Datatable.writeExcel(leadName, "Not Created", outPutsheetTransaction, Sales.OutPutCreatePath);
				}
			} else {
				Datatable.writeExcel(leadName, "Not Created exception", outPutsheetTransaction, Sales.OutPutCreatePath);
			}

		} catch (Exception e) {
			Datatable.writeExcel(leadName, "Not Created", outPutsheetTransaction, Sales.OutPutCreatePath);
		}
		Thread.sleep(3000);
		return leadName;
	}
	
	public void createBooking(String UNO, String LName) throws Throwable {

		mm = new MainMenu(iDriver);
		Thread.sleep(3000);
		mm.clickSales();
		Thread.sleep(2000);
		en = new Sales(iDriver);
		en.clickLeads();
		Thread.sleep(1000);
		
		try {
			Frames.mainFrame();
			getSearchLeadBooking().sendKeys(LName);
			getGoBtnBooking();
			getClickLead();
			Frames.mainDnFrame();
			getModify();
			getPANno().sendKeys(appInd.PanNumber());
			getClickAddressTab();
			getPermanentRadioBtn();
			getPermanentStreet().sendKeys(sheetUnit.getRow(1).getCell(16).getStringCellValue());
			getPermanentPobox().sendKeys(appInd.RandomNoAsSpecified(6));
			appInd.singleDropDown(getPermanentCountry(), sheetUnit.getRow(1).getCell(17).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getPermanentState(), sheetUnit.getRow(1).getCell(18).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getPermanentCity(), sheetUnit.getRow(1).getCell(19).getStringCellValue());
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

			appInd.singleDropDown(getProjectsDD(), sheetUnit.getRow(1).getCell(22).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getSubProjectsDD(), sheetUnit.getRow(1).getCell(23).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getUnitTypeDDBooking(), sheetUnit.getRow(1).getCell(14).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getUnitNumberDD(), UNO);
			Thread.sleep(1000);
			appInd.seletDate(getBookingDate(), "Jan 01, 2022");
			Thread.sleep(3000);
			try {
				Thread.sleep(1000);
				appInd.singleDropDown(getPlanNameDD(), sheetUnit.getRow(1).getCell(15).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPlanNameDD(), sheetUnit.getRow(1).getCell(15).getStringCellValue());
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Payment plan :: " + e);
			}
			getCreateBtnBooking();
			Thread.sleep(1000);

			Frames.bookingAccountFrame();
			getBookingChangeAccStatus();
			appInd.singleDropDown(getBookingNextStatus(), "Auditor Checked");
			Thread.sleep(1000);
			getBookingUpdateStatus();
			Thread.sleep(2000);
			getBookingChangeAccStatus();
			appInd.singleDropDown(getBookingNextStatus(), "Approve Transaction Form");
			Thread.sleep(1000);
			getBookingUpdateStatus();

			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel(UNO, "Not Created", outPutsheetTransaction, Sales.OutPutCreatePath);
			} else {
				Datatable.writeExcel(UNO, "Transaction Booking Created", outPutsheetTransaction,
						Sales.OutPutCreatePath);
			}
		} catch (Exception e) {
			System.out.println(e);
			appInd.isAlertPresent();
			Datatable.writeExcel(UNO, "Not Created", outPutsheetTransaction, Sales.OutPutCreatePath);
		}
	}
	
	public void createReceipt(String UNO, int i) throws Throwable {
		try {
			
			Frames.mainFrame();
			Frames.mainDnFrame();
			Frames.bookingAccountTabFrame();
			getReceiptReceipts();	
			Frames.mainDnFrame();
			Frames.bookingAccountFrame();
			getReceiptCreateReceipt();
			appInd.seletDate(getReceiptReceiptDt(), sheetUnit.getRow(i).getCell(20).getStringCellValue());
			Thread.sleep(1000);
			appInd.seletDate(getReceiptScheduleDt(), sheetUnit.getRow(i).getCell(21).getStringCellValue());
			getReceiptGoBtn();
			Thread.sleep(10000);
			appInd.singleDropDown(getReceiptPaymentMode(), "Cheque Local");
			Thread.sleep(1000);
			appInd.singleDropDown(getReceiptBank(), sheetUnit.getRow(i).getCell(24).getStringCellValue());
			getReceiptBranchName().sendKeys(sheetUnit.getRow(i).getCell(25).getStringCellValue());
			getReceiptPayableAt().sendKeys(sheetUnit.getRow(i).getCell(26).getStringCellValue());
			getReceiptACNo().sendKeys(sheetUnit.getRow(i).getCell(27).getStringCellValue());
			getReceiptInstrumentNo().sendKeys(sheetUnit.getRow(i).getCell(28).getStringCellValue());
			appInd.seletDate(getReceiptDate(), sheetUnit.getRow(i).getCell(20).getStringCellValue());
			String installAmount = getBillingReceiptAmount();
			installAmount = installAmount.toString().substring(3, installAmount.length());
			System.out.println(installAmount);
			getReceiptAmount().sendKeys(installAmount);
			Thread.sleep(2000);
			getReceiptFillBtn();
			getReceiptCreateBtn();
//			getReceiptChangeStatus();
//			appInd.singleDD(getReceiptSelectStatus(), "Approved");
//			getReceiptUpdateStatus();
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
				Datatable.writeExcel(UNO, "Receipt is Not Generated", outPutsheetTransaction, Sales.OutPutCreatePath);
			} else {
				Datatable.writeExcel(UNO, "Receipt is Generated", outPutsheetTransaction, Sales.OutPutCreatePath);
			}
		} catch (Exception e) {
			if (appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			Datatable.writeExcel(UNO, "Receipt is Not Generated", outPutsheetTransaction, Sales.OutPutCreatePath);
		}
	}
}
