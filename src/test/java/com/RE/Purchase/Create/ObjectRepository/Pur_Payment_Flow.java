package com.RE.Purchase.Create.ObjectRepository;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.ObjectRepository.Indent_Create;
import com.RE.Purchase.Create.Test.Pur_Payment_Flow_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Finance;
import com.RE.Submodules.Purchase;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Pur_Payment_Flow extends Pur_Payment_Flow_Test{
	public static XSSFSheet sheet;
	public static XSSFSheet sheetPO;
	public static XSSFSheet sheetGRN;
	public static XSSFSheet sheetAdv;
	public static XSSFSheet sheetSuppDN;
	public static XSSFSheet sheetPayment;
	public static XSSFSheet sheetBOQ;
	public static XSSFSheet sheetServAdv;
	public static XSSFSheet sheetServCert;
	public static XSSFSheet sheetSuppDNReceipt;
	public static XSSFSheet sheetServDN;
	public static XSSFSheet sheetServDNReceipt;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String PurpaymentflowOutput="Pur_Payment_Flow";
	public static Indent_Create IndentCreate;
	public static String sheetname = "Indent_Create";
	public static String sheetnamePO = "PO_Create";
	public static String sheetnameGRN = "GRN_Create";
	public static String sheetnameBOQ = "BOQ_Create";
	public static String sheetnameAdv = "SuppAdvance_Create";
	public static String sheetnamePayment = "SuppPayment_Create";
	public static String sheetnameSuppDN = "SuppDebitNoteCreate";
	public static String sheetnameSuppDNReceipt = "SuppDebitNoteReceiptCreate";
	public static String sheetnameServAdv = "ServAdvance_Create";
	public static String sheetnameServcert = "ServPayment_Create";
	public static String sheetnameServDN = "ServiceDebitNoteCreate";
	public static String sheetnameServDNReceipt = "ServiceDebitNoteReceiptCreate";
	public static String Indentstartdate="May 01, 2022";
	int i =1;
	public Pur_Payment_Flow(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	} 
	@FindBy(xpath = "//a[text()='Indents']")
	private WebElement indlink;
	public void getindlink() {
		indlink.click();
	}
	@FindBy(css = "input#btnCreate")
	private WebElement CreateIndBtn;
	public void getCreateIndBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateIndBtn));
		CreateIndBtn.click();
	}
	@FindBy(name = "ddlIndentType")
	private WebElement IndentTypeDD;
	public WebElement getIndentTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(IndentTypeDD));
		return IndentTypeDD;
	}
	// Project Drop down
		@FindBy(css = "select#ddlProject")
		private WebElement IndProjectDD;
		public WebElement getIndProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(IndProjectDD));
			return IndProjectDD;
		} 
		
		@FindBy(css = "select#ddlSubProject")
		private WebElement IndSubProjectDD;
		public WebElement getIndSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(IndSubProjectDD));
			return IndSubProjectDD;
		} 
		@FindBy(css = "select#ddlProjectList")
		private WebElement POProjectDD;
		public WebElement getPOProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(POProjectDD));
			return POProjectDD;
		} 
		
		@FindBy(css = "select#ddlSubProject")
		private WebElement POSubProjectDD;
		public WebElement getPOSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(POSubProjectDD));
			return POSubProjectDD;
		}
		
		// WO select Link
		@FindBy(css = "a#lnkSelectWorkOrder")
		private WebElement SelectWorkOrder;
		public WebElement getSelectWorkOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectWorkOrder));
			return SelectWorkOrder;
		} 
		
		// Search WO button
		@FindBy(css = "#txtWorlOrder")
		private WebElement EnterWorkOrder;
		public WebElement getEnterWorkOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterWorkOrder));
			return EnterWorkOrder;
		} 
		
		//search button in Select WO page
		@FindBy(css = "#btnSearch")
		private WebElement SearchWorkOrder;
		public void getSearchWorkOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchWorkOrder));
			SearchWorkOrder.click();
		}
		
		// Select WO record 
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input")
		private WebElement SelectWorkOrderRadio;
		public void getSelectWorkOrderRadio() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectWorkOrderRadio));
			SelectWorkOrderRadio.click();
		} 
		
		// Accept Selected button
//		@FindBy(xpath = "//a[text()='Accept Selected']")
//		private WebElement AcceptSelected;
//		public void getAcceptSelected() {
//			w2.until(ExpectedConditions.elementToBeClickable(AcceptSelected));
//			AcceptSelected.click();
//		} 
		// MM Store 
		@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//td[4]//select")
		private WebElement StoreDD;
		public WebElement getStoreDD() {
			w2.until(ExpectedConditions.elementToBeClickable(StoreDD));
			return StoreDD;
		} 
		
		// MM Quantity 
		@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//td[6]//input")
		private WebElement Quantity;
		public WebElement getQuantity() {
			w2.until(ExpectedConditions.elementToBeClickable(Quantity));
			Quantity.clear();
			return Quantity;
		}
		// Delivery Schedule downward arrow
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//input[@type='image']")
		private WebElement DownArrow;
		public void getDownArrow() {
			w2.until(ExpectedConditions.elementToBeClickable(DownArrow));
			DownArrow.click();
		} 
		// Add Button
		@FindBy(css = "input#BtnAddItem")
		private WebElement AddBtn;
		public void getAddBtn() {
			w2.until(ExpectedConditions.elementToBeClickable(AddBtn));
			AddBtn.click();
		}
		
		// Delivery Date of downward arrow
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//table//tr[2]//table//tr[2]//td[3]//input")
		private WebElement DeliveryDateArrow;
		public WebElement getDeliveryDateArrow() {
			w2.until(ExpectedConditions.elementToBeClickable(DeliveryDateArrow));
			return DeliveryDateArrow;
		} 
		
		// Quantity of downward arrow
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//table//tr[2]//table//tr[2]//td[4]//input")
		private WebElement QuantityArrow;
		public WebElement getQuantityArrow() throws Throwable {
			w2.until(ExpectedConditions.elementToBeClickable(QuantityArrow));
			QuantityArrow.clear();
			Thread.sleep(2000);
			w2.until(ExpectedConditions.elementToBeClickable(QuantityArrow));
			return QuantityArrow;
		} 
		// Remarks field in Create indent page
		@FindBy(css = "textarea#txtRemarks")
		private WebElement Remarks;
		public WebElement getRemarks() {
			return Remarks;
		} 
		
		// Create button in Create indent page
		@FindBy(css = "input#btnCreate")
		private WebElement CreateBtn;
		public WebElement getCreateBtn() {
			return CreateBtn;
		}
		// WO Summary button
		@FindBy(css = "input#btnWorkOrderSummary")
		private WebElement WorkOrderSummaryBtn;
		public void getWorkOrderSummaryBtn() {
			w2.until(ExpectedConditions.elementToBeClickable(WorkOrderSummaryBtn));
			WorkOrderSummaryBtn.click();
		} 

		// Add Material button
		@FindBy(css = "#btnIndentAddItem")
		private WebElement IndentAddItemBtn;
		public WebElement getIndentAddItemBtn() {
			w2.until(ExpectedConditions.elementToBeClickable(IndentAddItemBtn));
			return IndentAddItemBtn;
		} 

		//Selecting records in WO Summary
		@FindBy(xpath = "//table[@class='in4-table1 mt-5']//tr[2]//td//input[@type='checkbox']")
		private WebElement WOSummaryRecord;
		public void getWOSummaryRecord() {
			w2.until(ExpectedConditions.elementToBeClickable(WOSummaryRecord));
			WOSummaryRecord.click();
		} 
		
		// Indent Number
		@FindBy(xpath = "//div[@id='upIndentType']/..//span[@id='lblIndentNo']")
		private WebElement IndentNumber;
		public String getIndentNumber() throws Throwable {
			w2.until(ExpectedConditions.elementToBeClickable(IndentNumber));
			return IndentNumber.getText();
		}
		@FindBy(id = "lnkChangeStatus")
		private WebElement changestatus;
		public void getchangestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(changestatus));
			changestatus.click();
		}
		@FindBy(css = "select#ddlUpdateStatusList")
		private WebElement StatusDD;
		public WebElement getStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(StatusDD));
			return StatusDD;
		}
		@FindBy(css = "a#lnkUpdateStatus")
		private WebElement updatestatus;
		public void getupdatestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(updatestatus));
			updatestatus.click();
		}
		//Purchase Order
		@FindBy(xpath = "//a[text()='Purchase Orders']")
		private WebElement POlink;
		public void getPOlink() {
			w2.until(ExpectedConditions.elementToBeClickable(POlink));
			POlink.click();
		}
		@FindBy(name = "btnCreate")
		private WebElement CreatePObutton;
		public void getCreatePObutton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreatePObutton));
			CreatePObutton.click();
		}

		@FindBy(xpath = "//table[@id='frmViewPOIndent_rdPOTypeList']//tr[1]//td[1]//input[@type='radio']")
		private WebElement DomesticPO;
		public void getDomesticPO() {
			w2.until(ExpectedConditions.elementToBeClickable(DomesticPO));
			DomesticPO.click();
		}
		@FindBy(xpath = "//table[@id='frmViewPOIndent_rdoPOCategoryList']//tr[1]//td[1]//input[@type='radio']")
		private WebElement MaterialPO;
		public void getMaterialPO() {
			w2.until(ExpectedConditions.elementToBeClickable(MaterialPO));
			MaterialPO.click();
		}
		@FindBy(css = "select#frmViewPOIndent_ddlCompanyList")
		private WebElement Company;
		public WebElement getCompany() {
			w2.until(ExpectedConditions.elementToBeClickable(Company));
			return Company;
		}
		@FindBy(xpath = "//input[@displaytext='Purchase Order Date']")
		private WebElement POdate;
		public WebElement getPOdate() {
			w2.until(ExpectedConditions.elementToBeClickable(POdate));
			return POdate;
		}
		@FindBy(css = "input#frmViewPOIndent_chkDebitable")
		private WebElement Debitable;
		public void getDebitable() {
			w2.until(ExpectedConditions.elementToBeClickable(Debitable));
			Debitable.click();
		}
		
		@FindBy(css = "select#frmViewPOIndent_ddlSupplier")
		private WebElement supplier;
		public WebElement getsupplier() {
			w2.until(ExpectedConditions.elementToBeClickable(supplier));
			return supplier;
		}
		@FindBy(id = "frmViewPOIndent_txtPORef")
		private WebElement POrefNo;
		public WebElement getPOrefNo() {
			w2.until(ExpectedConditions.elementToBeClickable(POrefNo));
			return POrefNo;
		}
		@FindBy(id = "frmViewPOIndent_txtDocThru")
		private WebElement DocumentThrough	;
		public WebElement getDocumentThrough() {
			w2.until(ExpectedConditions.elementToBeClickable(DocumentThrough));
			return DocumentThrough;
		}
		@FindBy(id = "frmViewPOIndent_btnIndent")
		private WebElement AddMaterial_Indent;
		public void getAddMaterial_Indent() {
			w2.until(ExpectedConditions.elementToBeClickable(AddMaterial_Indent));
			 AddMaterial_Indent.click();;
		}
		@FindBy(name = "txtFilterIndentNumber")
		private WebElement Indent_No;
		public WebElement getIndent_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Indent_No));
			return Indent_No;
		}
		@FindBy(name = "txtFilterWorkOrder")
		private WebElement WO_No;
		public WebElement getWO_No() {
			w2.until(ExpectedConditions.elementToBeClickable(WO_No));
			return WO_No;
		}
		@FindBy(css = "input#dtIndentFromDate_txtDate")
		private WebElement IndentFromdate;
		public WebElement getIndentFromdate() {
			w2.until(ExpectedConditions.elementToBeClickable(IndentFromdate));
			return IndentFromdate;
		}
		@FindBy(css = "input#dtIndenToDate_txtDate")
		private WebElement ToDate;
		public WebElement getToDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ToDate));
			return ToDate;
		}
		@FindBy(name = "btnFilterGO")
		private WebElement Search;
		public void getSearch() {
			w2.until(ExpectedConditions.elementToBeClickable(Search));
			 Search.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input[@type='checkbox']")
		private WebElement checkbox;
		public void getcheckbox() {
			w2.until(ExpectedConditions.elementToBeClickable(checkbox));
			checkbox.click();
		}
		
		@FindBy(xpath = "//a[text()='Accept Selected']")
		private WebElement WOAcceptSelected;
		public void getWOAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(WOAcceptSelected));
			WOAcceptSelected.click();
		}
		@FindBy(id = "lnkAcceptSelected")
		private WebElement GRNAcceptSelected;
		public void getGRNAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNAcceptSelected));
			GRNAcceptSelected.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//input[@type='text']")
		private WebElement PO_Qty;
		public WebElement getPO_Qty() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_Qty));
			return PO_Qty;
		}
		//Rate and Tax page
		@FindBy(name = "btnCreate")
		private WebElement createbutton;
		public void getcreatebutton() {
			w2.until(ExpectedConditions.elementToBeClickable(createbutton));
			createbutton.click();
		}
		@FindBy(xpath = "//a[text()='Add Rate/Tax']")
		private WebElement AddRateTax;
		public WebElement getAddRateTax() {
			w2.until(ExpectedConditions.elementToBeClickable(AddRateTax));
			return AddRateTax;
		}
		
		By ByRate = By.xpath("//td[@class='nopadding']//tr[2]//td[2]//input[@name='txtUnitRate']");
		
		@FindBy(xpath = "//td[@class='nopadding']//tr[2]//td[2]//input[@name='txtUnitRate']")
		private WebElement Rate;
		public WebElement getRate() {
			w2.until(ExpectedConditions.elementToBeClickable(Rate));
			return Rate;
		}
		@FindBy(css = "input#btnCalculate")
		private WebElement CalRate;
		public void getCalRate() {
			w2.until(ExpectedConditions.elementToBeClickable(CalRate));
			CalRate.click();
		}
		@FindBy(css = "input#btnSave")
		private WebElement SaveRate;
		public void getSaveRate() {
			w2.until(ExpectedConditions.elementToBeClickable(SaveRate));
			SaveRate.click();
		}
		@FindBy(css = "input#btnUpdate")
		private WebElement UpdateRate;
		public void getUpdateRate() {
			w2.until(ExpectedConditions.elementToBeClickable(UpdateRate));
			UpdateRate.click();
		}
		//Terms and Conditions page
		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement Servcheckbox;
		public void getServcheckbox() {
			w2.until(ExpectedConditions.elementToBeClickable(Servcheckbox));
			Servcheckbox.click();
		}
		By BySelectServLink = By.xpath("//a[text()='Select']");
		
		@FindBy(xpath = "//a[text()='Select']")
		private WebElement SelectServLink;
		public WebElement getSelectServLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectServLink));
		return	SelectServLink;
		}
		@FindBy(name = "textServiceProviderName")
		private WebElement SearchBy;
		public WebElement getSearchBy() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchBy));
		return	SearchBy;
		}
		
		@FindBy(name = "btnFilterGO")
		private WebElement Gobutton;
		public void getGobutton() {
			w2.until(ExpectedConditions.elementToBeClickable(Gobutton));
			Gobutton.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//a[@id='gdvServiceProviderList_ctl02_lnkServiceProviderName']")
		private WebElement ServiceProviderName;
		public void getServiceProviderName() {
			w2.until(ExpectedConditions.elementToBeClickable(ServiceProviderName));
			ServiceProviderName.click();
		}
		
		@FindBy(css = "input#FormViewTermsAndConditions_txtSupplierAdvanceAllowed")
		private WebElement SuppAdvance;
		public WebElement getSuppAdvance() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppAdvance));
			return SuppAdvance;
		}
		@FindBy(css = "input#FormViewTermsAndConditions_txtServiceCertificateAdvanceAllowed")
		private WebElement ServAdvance;
		public WebElement getServAdvance() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvance));
			return ServAdvance;
		}

		@FindBy(name = "ButtonUpdate")
		private WebElement UpdateTermandConditions;
		public void getUpdateTermandConditions() {
			w2.until(ExpectedConditions.elementToBeClickable(UpdateTermandConditions));
			 UpdateTermandConditions.click();
		}
		@FindBy(css = "a#frmViewPOIndent_lnkChangeStatus")
		private WebElement changetstaus;
		public void getchangetstaus() {
			w2.until(ExpectedConditions.elementToBeClickable(changetstaus));
			changetstaus.click();
		}
		
		@FindBy(css = "select#frmViewPOIndent_ddlUpdateStatusList")
		private WebElement stausDD;
		public WebElement getstausDD() {
			w2.until(ExpectedConditions.elementToBeClickable(stausDD));
			return stausDD;
		}
		
		@FindBy(xpath = "//a[text()='Update Status']")
		private WebElement upadtetstaus;
		public void getupadtetstaus() {
			w2.until(ExpectedConditions.elementToBeClickable(upadtetstaus));
			upadtetstaus.click();
		}
		@FindBy(css = "textarea#frmViewPOIndent_txtStatusRemark")
		private WebElement ApproverRemarks;
		public WebElement getApproverRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(ApproverRemarks));
			return ApproverRemarks;
		}
		//table[@class='in4-table']//tr
		////table[@class='in4-table']//tr//td[1]
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr//td[1]")
		private List<WebElement> Charges;
		public List<WebElement> getCharges() {
			return Charges;
		}
		@FindBy(id = "frmViewPOIndent_lblPODisplayNoValue")
		private WebElement POnumber;
		public String getPOnumber() {
			w2.until(ExpectedConditions.elementToBeClickable(POnumber));
			return POnumber.getText();
		}
		@FindBy(css = "a#frmViewPOIndent_lnkChangeStatus")
		private WebElement POchangestatus;
		public void getPOchangestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(POchangestatus));
			POchangestatus.click();
		}
		@FindBy(css = "select#frmViewPOIndent_ddlUpdateStatusList")
		private WebElement POstatusDD;
		public WebElement getPOstatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(POstatusDD));
			return POstatusDD;
		}
		@FindBy(xpath = "//a[@id='frmViewPOIndent_lnkUpdateStatus']")
		private WebElement POUpdatestaus;
		public void getPOUpdatestaus() {
			w2.until(ExpectedConditions.elementToBeClickable(POUpdatestaus));
			POUpdatestaus.click();
		}
		//GRN 
		// 'GRN' link in sub frame
		@FindBy(xpath = "//a[text()='GRN']")
		private WebElement GRN_Link;
		public void getGRN_Link() {
			w2.until(ExpectedConditions.elementToBeClickable(GRN_Link));
			GRN_Link.click();
		}
		//
		@FindBy(id = "btnCreateGRN")
		private WebElement CreateGRN;
		public void getCreateGRN() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateGRN));
			CreateGRN.click();
		}
		@FindBy(id = "ddlGRNType")
		private WebElement GRNTypeDD;
		public WebElement getGRNTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNTypeDD));
			return GRNTypeDD;
		}
		@FindBy(css = "select#ddlSupplierList")
		private WebElement SupplierDD;
		public WebElement getSupplierDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SupplierDD));
			return SupplierDD;
		}
		@FindBy(id = "ddlCertifyingCompany")
		private WebElement CompanyDD;
		public WebElement getCompanyDD() {
			w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
			return CompanyDD;
		}
		//tr[@id='trProject']//select[@class='multiselect dropdown-toggle btn btn-default']
		@FindBy(xpath = "//tr[@id='trProject']//input[@placeholder='Search']")
		private WebElement EnterGRNProject;
		public WebElement getEnterGRNProject() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterGRNProject));
			return EnterGRNProject;
		}
		@FindBy(xpath = "//tr[@id='trProject']//li")
		private List<WebElement> ListtOfGRNProject;
		public List<WebElement> getListtOfGRNProject() {
				return ListtOfGRNProject;
		}
		@FindBy(xpath = "//tr[@id='trProject']//span[@class='multiselect-selected-text']")
		private WebElement GRNProjectDD;
		public WebElement getGRNProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNProjectDD));
			return GRNProjectDD;
		}
		

		@FindBy(xpath = "//tr[@id='trSubProject']//span[@class='multiselect-selected-text']")
		private WebElement GRNSubProjectDD;
		public WebElement getGRNSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNSubProjectDD));
			return GRNSubProjectDD;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProject']//input[@placeholder='Search']")
		private WebElement EnterGRNSubProject;
		public WebElement getEnterGRNSubProject() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterGRNSubProject));
			return EnterGRNSubProject;
		}
		@FindBy(xpath = "//tr[@id='trSubProject']//li")
		private List<WebElement> ListOfGRNSubProject;
		public List<WebElement> getListOfGRNSubProject() {
			return ListOfGRNSubProject;
		}
		
		@FindBy(id = "lbnSelectPO")
		private WebElement SelectPO;
		public WebElement getSelectPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectPO));
			return SelectPO;
		}
		@FindBy(css = "select#ddlToStore")
		private WebElement GRNTo_Store;
		public WebElement getGRNTo_Store() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNTo_Store));
			return GRNTo_Store;
		}
		@FindBy(css = "input#txtDeliveryChallanInvoiceNo")
		private WebElement Challan_No;
		public WebElement getChallan_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Challan_No));
			return Challan_No;
		}
		@FindBy(id = "dtDeliveryChallanInvoiceDate_txtDatePicker")
		private WebElement Challan_Date;
		public WebElement getChallan_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(Challan_Date));
			return Challan_Date;
		}
		@FindBy(id = "txtDCDate_txtDatePicker")
		private WebElement EditChallan_Date;
		public WebElement getEditChallan_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(EditChallan_Date));
			return EditChallan_Date;
		}
		@FindBy(id = "dtGRNDate_txtDatePicker")
		private WebElement GRN_Date;
		public WebElement getGRN_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(GRN_Date));
			return GRN_Date;
		}
		@FindBy(id = "txtVehileNo")
		private WebElement Vehicle_No;
		public WebElement getVehicle_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Vehicle_No));
			return Vehicle_No;
		}
		@FindBy(id = "txtVehiNo")
		private WebElement EditVehicle_No;
		public WebElement getEditVehicle_No() {
			w2.until(ExpectedConditions.elementToBeClickable(EditVehicle_No));
			return EditVehicle_No;
		}
		@FindBy(id = "txtgateNo")
		private WebElement Gate_No;
		public WebElement getGate_No() {
			w2.until(ExpectedConditions.elementToBeClickable(Gate_No));
			return Gate_No;
		}
		@FindBy(id = "txtRemarks")
		private WebElement GRNRemarks;
		public WebElement getGRNRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNRemarks));
			return GRNRemarks;
		}
		
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//td[2]//span//div//button")
		private WebElement PO_NoDD;
		public WebElement getPO_NoDD() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_NoDD));
			return PO_NoDD;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//input[@placeholder='Search']")
		private WebElement EnterPO_No;
		public WebElement getEnterPO_No() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterPO_No));
			return EnterPO_No;
		}

		@FindBy(xpath = "//div[@class='btn-group open']//ul[@class='multiselect-container dropdown-menu']//li")
		private List<WebElement> ListofPO;
		public List<WebElement> getListofPO() {
			
			return ListofPO;
		}
		@FindBy(id = "btnSearch")
		private WebElement SearchButton;
		public void getSearchButton() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchButton));
			 SearchButton.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]")
		private WebElement PO_Radio;
		public void getPO_Radio() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_Radio));
			 PO_Radio.click();;
		}
		
		@FindBy(xpath = "//a[text()='Accept Selected']")
		private WebElement AcceptSelected;
		public void getAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(AcceptSelected));
			 AcceptSelected.click();;
		}
		//it will give the input to the first row
		@FindBy(xpath = "//table[@id='tblMaterialDetails']//tr[1]//td[3]//input[@type='text']")
		private WebElement Received_Qty;
		public WebElement getReceived_Qty() {
			w2.until(ExpectedConditions.elementToBeClickable(Received_Qty));
			return Received_Qty;
		}
		@FindBy(xpath = "//table[@id='tblMaterialDetails']//tr[1]//td[4]//input")
		private WebElement EditReceived_Qty;
		public WebElement getEditReceived_Qty() {
			w2.until(ExpectedConditions.elementToBeClickable(EditReceived_Qty));
			return EditReceived_Qty;
		}
		@FindBy(xpath = "//table[@id='tblMaterialDetails']//tr[1]//td[8]//input")
		private WebElement InspectedDate;
		public WebElement getInspectedDate() {
			w2.until(ExpectedConditions.elementToBeClickable(InspectedDate));
			return InspectedDate;
		}
		@FindBy(css = "input#btnCreate")
		private WebElement GRNCreateButton;
		public void getGRNCreateButton() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNCreateButton));
			GRNCreateButton.click();
		}
		@FindBy(id = "lnkChangeStatus")
		private WebElement GRNchangestatus;
		public void getGRNchangestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNchangestatus));
			GRNchangestatus.click();;
		
		}
		
		@FindBy(css = "select#ddlStatus")
		private WebElement GRNStatusDD;
		public WebElement getGRNStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNStatusDD));
			return GRNStatusDD;
	}
		@FindBy(css = "a#lbnUpdateStatus")
		private WebElement GRNupdatestatus;
		public void getGRNupdatestatus() {
			w2.until(ExpectedConditions.elementToBeClickable(GRNupdatestatus));
			GRNupdatestatus.click();
		
		}
		@FindBy(id = "lblGrnDisplayNo")
		private WebElement GRN_Number;
		public String getGRN_Number() throws Throwable {
			w2.until(ExpectedConditions.elementToBeClickable(GRN_Number));
			return GRN_Number.getText();
		}
		
		//ADVANCE LOCATORS 
		@FindBy(xpath = "//a[text()='Supplier Advances']")
		private WebElement SuppAdvlink;
		public void getSuppAdvlink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppAdvlink));
			SuppAdvlink.click();
		}
		
		@FindBy(id = "btnCreate")
		private WebElement CreateSuppAdvButton;
		public void getCreateSuppAdvButton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateSuppAdvButton));
			CreateSuppAdvButton.click();
		}
		
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement AdvCompanyDD;
		public WebElement getAdvCompanyDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvCompanyDD));
		return	AdvCompanyDD;
		}
		
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//button")
		private WebElement AdvprojectDD;
		public WebElement getAdvprojectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvprojectDD));
		return	AdvprojectDD;
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//button")
		private WebElement AdvprojectDDClick;
		public void getAdvprojectDDClick() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvprojectDDClick));
			AdvprojectDD.click();
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//input[@placeholder='Search']")
		private WebElement AdvEnterProjDD;
		public WebElement getAdvEnterProjDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvEnterProjDD));
		return	AdvEnterProjDD;
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//li")
		private List<WebElement> AdvListofProj;
		public List<WebElement> getAdvListofProj() {
			return	AdvListofProj;
		}
		
		
		
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//button")
		private WebElement AdvSubprojectDD;
		public WebElement getAdvSubprojectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvSubprojectDD));
		return	AdvSubprojectDD;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//input[@placeholder='Search']")
		private WebElement AdvEnterSubProjDD;
		public WebElement getAdvEnterSubProjDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvEnterSubProjDD));
		return	AdvEnterSubProjDD;
		}
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//li")
		private List<WebElement> AdvListofSubProj;
		public List<WebElement> getAdvListofSubProj() {
			return	AdvListofSubProj;
		}
		
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement AdvPayCompDD;
		public WebElement getAdvPayCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPayCompDD));
		return	AdvPayCompDD;
		}
		
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
		private WebElement EnterAdvPO;
		public WebElement getEnterAdvPO() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterAdvPO));
		return	EnterAdvPO;
		}
		
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
		private List<WebElement> EnterAdvListOfPO;
		public List<WebElement> getEnterAdvListOfPO() {
		return	EnterAdvListOfPO;
		}
		
		@FindBy(id = "btnSearch")
		private WebElement SearchAdvPO;
		public void getSearchAdvPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchAdvPO));
			SearchAdvPO.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//input[@type='radio']")
		private WebElement AdvPORadio;
		public void getAdvPORadio() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPORadio));
			AdvPORadio.click();
		}
		
		@FindBy(css = "a#btnAcceptSelected")
		private WebElement AdvPOAcceptSelected;
		public void getAdvPOAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPOAcceptSelected));
			AdvPOAcceptSelected.click();
		}
		@FindBy(css = "input#chkTaximpact")
		private WebElement AdvTaxImpact;
		public void getAdvTaxImpact() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvTaxImpact));
			AdvTaxImpact.click();
		}
		@FindBy(css = "input#txtInvoiceNumber")
		private WebElement AdvInvoiceNo;
		public WebElement getAdvInvoiceNo() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceNo));
			return AdvInvoiceNo;
		}
		@FindBy(css = "input#txtInvoiceAmt")
		private WebElement AdvInvoiceAmt;
		public WebElement getAdvInvoiceAmt() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceAmt));
			return AdvInvoiceAmt;
		}
		@FindBy(css = "input#invoicedt_txtDatePicker")
		private WebElement AdvInvoiceDate;
		public WebElement getAdvInvoiceDate() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvInvoiceDate));
			return AdvInvoiceDate;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//input[@type='text']")
		private WebElement AdvPOQty;
		public WebElement getAdvPOQty() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvPOQty));
			return AdvPOQty;
		}
		@FindBy(xpath = "//a[text()='Add Rate/Tax']")
		private WebElement Adv_AddRateTax;
		public void getAdv_AddRateTax() {
			w2.until(ExpectedConditions.elementToBeClickable(Adv_AddRateTax));
			 Adv_AddRateTax.click();
		}
		@FindBy(css = "input#txtUnitRate")
		private WebElement Adv_Rate;
		public WebElement getAdv_Rate() {
			w2.until(ExpectedConditions.elementToBeClickable(Adv_Rate));
			return Adv_Rate;
		}
		@FindBy(css = "input#txtUnitRate")
		private List<WebElement> AdvCharges;
		public List<WebElement> getAdvCharges(){
			return AdvCharges;
		}
		@FindBy(css = "a#lnkbtnAddTaxRow")
		private WebElement AdvDedTax;
		public void getAdvDedTax(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTax));
			AdvDedTax.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//div//select")
		private WebElement AdvDedTaxCategory;
		public WebElement getAdvDedTaxCategory(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxCategory));
		return	AdvDedTaxCategory;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//div//select")
		private WebElement AdvDedTaxPer;
		public WebElement getAdvDedTaxPer(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxPer));
		return	AdvDedTaxPer;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[5]//div//input")
		private WebElement AdvDedTaxableAmt;
		public WebElement getAdvDedTaxableAmt(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxableAmt));
		return	AdvDedTaxableAmt;
		}
		@FindBy(css = "a#lnkbtnAddTaxRow")
		private WebElement AdvDedTax2;
		public void getAdvDedTax2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTax2));
			AdvDedTax2.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//div//select")
		private WebElement AdvDedTaxCategory2;
		public WebElement getAdvDedTaxCategory2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxCategory2));
		return	AdvDedTaxCategory2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//div//select")
		private WebElement AdvDedTaxPer2;
		public WebElement getAdvDedTaxPer2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxPer2));
		return	AdvDedTaxPer2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[5]//div//input")
		private WebElement AdvDedTaxableAmt2;
		public WebElement getAdvDedTaxableAmt2(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvDedTaxableAmt2));
		return	AdvDedTaxableAmt2;
		}
		@FindBy(css = "input#btnCreate")
		private WebElement AdvCreate;
		public void getAdvCreate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvCreate));
			AdvCreate.click();
		}
		
		@FindBy(css = "input#btnCalculate")
		private WebElement AdvCalRate;
		public void getAdvCalRate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvCalRate));
			AdvCalRate.click();
		}
		@FindBy(css = "input#btnSave")
		private WebElement AdvSaveRate;
		public void getAdvSaveRate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvSaveRate));
			AdvSaveRate.click();
		}
		
		@FindBy(css = "select#ddlModeOfPayment")
		private WebElement AdvModeofPay;
		public WebElement getAdvModeofPay(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvModeofPay));
			return AdvModeofPay;
		}
		@FindBy(css = "input#dtPaymentDueDate_txtDatePicker")
		private WebElement AdvPayDueDate;
		public WebElement getAdvPayDueDate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvPayDueDate));
			return AdvPayDueDate;
		}
		@FindBy(id = "txtFavouring")
		private WebElement AdvFavouring;
		public WebElement getAdvFavouring(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvFavouring));
			return AdvFavouring;
		}
		
		@FindBy(css = "textarea#txtRemarks")
		private WebElement AdvRemarks;
		public WebElement getAdvRemarks(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvRemarks));
			return AdvRemarks;
		}
		
		
		@FindBy(id = "lblAdvanceNoView")
		private WebElement Advnumber;
		public String getAdvnumber(){
			w2.until(ExpectedConditions.elementToBeClickable(Advnumber));
			 return Advnumber.getText();
		}
		
		@FindBy(id = "gvAdvanceAdjustment_ctl02_lblAdvanceOutstandingCertificateDate")
		private WebElement AdvanceOutstanding;
		public String getAdvanceOutstanding(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvanceOutstanding));
			 return AdvanceOutstanding.getText();
		}

		@FindBy(xpath = "//table[@id='gvAdvanceAdjustment']//tr//td[1]")
		private List<WebElement> OutstandingAdvancesCount;
		public List<WebElement> getOutstandingAdvancesCount() {
			return OutstandingAdvancesCount;
		}
		@FindBy(xpath = "//table[@id='gvDebitNote']//tr//td[1]")
		private List<WebElement> DebitNoteCount;
		public List<WebElement> getDebitNoteCount() {
			return DebitNoteCount;
		}
		@FindBy(xpath = "//table[@id='gvAdvanceAdjustment']//tr[2]//td[9]//input")
		private WebElement EnterAdvanceAmount;
		public WebElement getEnterAdvanceAmount(){
			w2.until(ExpectedConditions.elementToBeClickable(EnterAdvanceAmount));
			 return EnterAdvanceAmount;
		}
		
		@FindBy(css = "input#btnModify")
		private WebElement AdvModify;
		public void getAdvModify(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvModify));
			AdvModify.click();
		}
		@FindBy(css = "input#btnUpdate")
		private WebElement AdvUpdate;
		public void getAdvUpdate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvUpdate));
			AdvUpdate.click();
		}
		@FindBy(id = "lnkBtnChangeStatus")
		private WebElement AdvChangestatus;
		public void getAdvChangestatus(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvChangestatus));
			AdvChangestatus.click();
		}
		@FindBy(css = "select#ddlNextStatus")
		private WebElement AdvStatusDD;
		public WebElement getAdvStatusDD(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvStatusDD));
			return AdvStatusDD;
		}
		@FindBy(css = "a#lnkBtnUpdateStatus")
		private WebElement AdvUpdateStatus;
		public void getAdvUpdateStatus(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvUpdateStatus));
			AdvUpdateStatus.click();
		}
		
		@FindBy(css = "input#dtExpectedDate_txtDatePicker")
		private WebElement AdvExpectedDate;
		public WebElement getAdvExpectedDate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvExpectedDate));
			return AdvExpectedDate;
		}
		
		@FindBy(css = "input#dtProcessedDate_txtDatePicker")
		private WebElement AdvprocessDate;
		public WebElement getAdvprocessDate(){
			w2.until(ExpectedConditions.elementToBeClickable(AdvprocessDate));
			return AdvprocessDate;
		}
		@FindBy(xpath="//a[text()='Supplier Adv.']")
		private static WebElement FinPurAdv;
		public void getFinPurAdv() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurAdv));
			FinPurAdv.click();
		}
		@FindBy(css = "input#txtStatus")
		private static WebElement FinPurAdvstatus;
		public WebElement getFinPurAdvstatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurAdvstatus));
			return FinPurAdvstatus;
		}
		
		@FindBy(id = "txtAdvanceNo")
		private static WebElement FinAdvNo;
		public WebElement getFinAdvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinAdvNo));
			return FinAdvNo;
		}
		
		@FindBy(id = "btnGo")
		private static WebElement FinAdvGo;
		public void getFinAdvGo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinAdvGo));
			FinAdvGo.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table mt-10']//tr[2]//a")
		private static WebElement AdvNo;
		public void getAdvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(AdvNo));
			AdvNo.click();
		}
		@FindBy(xpath = "//a[text()='Make Bank Payment']")
		private static WebElement PaymentLink;
		public WebElement getPaymentLink() {
			w2.until(ExpectedConditions.elementToBeClickable(PaymentLink));
		return	PaymentLink;
		}

		@FindBy(xpath = "//table[@id='tblBankPaymentsLinks']//a[2]")
		private static WebElement ServPayPaymentLink;
		public WebElement getServPayPaymentLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServPayPaymentLink));
		return	ServPayPaymentLink;
		}
		@FindBy(xpath = "//table[@id='tblBankPaymentsLinks']//tr[3]//a[2]")
		private static WebElement SerAdvPaymentLink;
		public WebElement getSerAdvPaymentLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SerAdvPaymentLink));
		return	SerAdvPaymentLink;
		}
		@FindBy(css = "select#ddlBankCash")
		private static WebElement BankAccountDD;
		public WebElement getBankAccountDD() {
			w2.until(ExpectedConditions.elementToBeClickable(BankAccountDD));
		return	BankAccountDD;
		}
		@FindBy(css = "input#txtInstrumentNo")
		private static WebElement InstrumentNo;
		public WebElement getInstrumentNo() {
			w2.until(ExpectedConditions.elementToBeClickable(InstrumentNo));
		return	InstrumentNo;
		}
		@FindBy(css = "input#btnSubmit")
		private static WebElement PaymentSubmit;
		public void getPaymentSubmit() {
			w2.until(ExpectedConditions.elementToBeClickable(PaymentSubmit));
			PaymentSubmit.click();
		}
		@FindBy(id = "lblStatus")
		private static WebElement paymentstatus;
		public String getpaymentstatus() {
			w2.until(ExpectedConditions.elementToBeClickable(paymentstatus));
		return	paymentstatus.getText();
		}
		
		//Supplier Payments locators
		@FindBy(xpath = "//a[text()='Supplier Certificates']")
		private WebElement SuppCertLink;
		public void getSuppCertLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertLink));
			SuppCertLink.click();
		}
		@FindBy(id = "btnCreateNew")
		private WebElement CreateSuppCertButton;
		public void getCreateSuppCertButton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateSuppCertButton));
			CreateSuppCertButton.click();
		}
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement SuppCertCompDD;
		public WebElement getSuppCertCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertCompDD));
			return SuppCertCompDD;
		}
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//span//button")
		private WebElement SuppCertProjectDD;
		public WebElement getSuppCertProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertProjectDD));
			return SuppCertProjectDD;
		}
		
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//input[@placeholder='Search']")
		private WebElement SuppCertEnterProject;
		public WebElement getSuppCertEnterProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterProject));
			return SuppCertEnterProject;
		}
		
		@FindBy(xpath = "//tr[@id='trProject']//td[2]//li")
		private List<WebElement> SuppCertProjectList;
		public List<WebElement> getSuppCertProjectList() {
			return	SuppCertProjectList;
		}
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement SuppPayCompDD;
		public WebElement getSuppPayCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppPayCompDD));
			return SuppPayCompDD;
		}
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//button")
		private WebElement SuppCertSubProjectDD;
		public WebElement getSuppCertSubProjectDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSubProjectDD));
			return SuppCertSubProjectDD;
		}
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//input[@placeholder='Search']")
		private WebElement SuppCertEnterSubProject;
		public WebElement getSuppCertEnterSubProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterSubProject));
			return SuppCertEnterSubProject;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProj']//td[2]//li")
		private List<WebElement> SuppCertSubProjectList;
		public List<WebElement> getSuppCertSubProjectList() {
			return	SuppCertSubProjectList;
		}
		
		@FindBy(id = "ddlSupplierList")
		private WebElement SuppCertSupplierDD;
		public WebElement getSuppCertSupplierDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSupplierDD));
			return SuppCertSupplierDD;
		}
		@FindBy(id = "ddlPoType")
		private WebElement SuppCertPOTypeDD;
		public WebElement getSuppCertPOTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPOTypeDD));
			return SuppCertPOTypeDD;
		}
		@FindBy(css = "a#lbnSelectPO")
		private WebElement SuppCertSelecttPOLink;
		public WebElement getSuppCertSelecttPOLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelecttPOLink));
			return SuppCertSelecttPOLink;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//span//button")
		private WebElement SuppCertPODD;
		public WebElement getSuppCertPODD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPODD));
			return SuppCertPODD;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//li//input[@placeholder='Search']")
		private WebElement SuppCertEnterPO;
		public WebElement getSuppCertEnterPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertEnterPO));
			return SuppCertEnterPO;
		}
		@FindBy(xpath = "//div[@id='updMaindtls']//tr[3]//li")
		private List<WebElement> SuppCertPOList;
		public List<WebElement> getSuppCertPOList() {
			return SuppCertPOList;
		}
		@FindBy(id = "btnSearch")
		private WebElement SuppCertSearchPO;
		public void getSuppCertSearchPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSearchPO));
			 SuppCertSearchPO.click();;
		}
		
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//input")
		private WebElement SuppCertSelcetPOcheck;
		public void getSuppCertSelcetPOcheck() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetPOcheck));
			 SuppCertSelcetPOcheck.click();;
		}
		@FindBy(xpath = "//a[text()='Accept Selected']")
		private WebElement SuppCertPOAcceptSelected;
		public void getSuppCertPOAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPOAcceptSelected));
			 SuppCertPOAcceptSelected.click();;
		}
		@FindBy(css = "input#txtInvoiceNo")
		private WebElement SuppCertInvoiceNO;
		public WebElement getSuppCertInvoiceNO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceNO));
			return SuppCertInvoiceNO;
		}
		@FindBy(css = "select#ddlEInvoice")
		private WebElement SuppCertE_Invoice;
		public WebElement getSuppCertE_Invoice() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertE_Invoice));
			return SuppCertE_Invoice;
		}
		@FindBy(css = "input#txtInvoiceAmount")
		private WebElement SuppCertInvoiceAmt;
		public WebElement getSuppCertInvoiceAmt() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceAmt));
			return SuppCertInvoiceAmt;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[6]")
		private WebElement SuppCertGRNAMOUNT;
		public String getSuppCertGRNAMOUNT() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertGRNAMOUNT));
			return SuppCertGRNAMOUNT.getText();
		}
		@FindBy(css =  "input#dtInvioceDate_txtDatePicker")
		private WebElement SuppCertInvoiceDate;
		public WebElement getSuppCertInvoiceDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertInvoiceDate));
			return SuppCertInvoiceDate;
		}
		@FindBy(css = "select#ddlCertificateType")
		private WebElement SuppCertTypeDD;
		public WebElement getSuppCertTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertTypeDD));
			return SuppCertTypeDD;
		}
		
		@FindBy(xpath = "//a[text()='Select GRN']")
		private WebElement SuppCertSelcetGRNLink;
		public WebElement getSuppCertSelcetGRNLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetGRNLink));
			return SuppCertSelcetGRNLink;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input[@type='checkbox']")
		private WebElement SuppCertSelcetGRNCheck;
		public void getSuppCertSelcetGRNCheck() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertSelcetGRNCheck));
			 SuppCertSelcetGRNCheck.click();;
		}
		
		@FindBy(css =  "input#lnkNext_ShowMaterialSelection")
		private WebElement SuppCertAddGRN_NextButton;
		public void getSuppCertAddGRN_NextButton() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddGRN_NextButton));
			 SuppCertAddGRN_NextButton.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']")
		private WebElement SuppCertGRNQty;
		public WebElement getSuppCertGRNQty() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertGRNQty));
			return SuppCertGRNQty;
		}
		@FindBy(css =  "input#btnAcceptSelected")
		private WebElement SuppCertAddGRN_AcceptSelcet;
		public void getSuppCertAddGRN_AcceptSelcet() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddGRN_AcceptSelcet));
			 SuppCertAddGRN_AcceptSelcet.click();;
		}
		@FindBy(xpath = "//a[text()='Add Row ']")
		private WebElement SuppCertAddRowDed;
		public void getSuppCertAddRowDed() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertAddRowDed));
			 SuppCertAddRowDed.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select[@class='input']")
		private WebElement SuppCertDedTaxCat1;
		public WebElement getSuppCertDedTaxCat1() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCat1));
			return SuppCertDedTaxCat1;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select[@class='input']")
		private WebElement SuppCertDedTaxCatPer1;
		public WebElement getSuppCertDedTaxCatPer1() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCatPer1));
			return SuppCertDedTaxCatPer1;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select[@class='input']")
		private WebElement SuppCertDedTaxCat2;
		public WebElement getSuppCertDedTaxCat2() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCat2));
			return SuppCertDedTaxCat2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select[@class='input']")
		private WebElement SuppCertDedTaxCatPer2;
		public WebElement getSuppCertDedTaxCatPer2() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertDedTaxCatPer2));
			return SuppCertDedTaxCatPer2;
		}
		@FindBy(css = "input#txtOtherDeduction")
		private WebElement SuppCertOtherDed;
		public WebElement getSuppCertOtherDed() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDed));
			return SuppCertOtherDed;
		}
		@FindBy(id = "txtOthDedRemarks")
		private WebElement SuppCertOtherDedRemarksclick;
		public void getSuppCertOtherDedRemarksclick() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDedRemarksclick));
			 SuppCertOtherDedRemarksclick.click();;
		}
		@FindBy(id = "txtOthDedRemarks")
		private WebElement SuppCertOtherDedRemarks;
		public WebElement getSuppCertOtherDedRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherDedRemarks));
			return SuppCertOtherDedRemarks;
		}
		@FindBy(css = "input#txtOtherAdditions")
		private WebElement SuppCertOtherAddTax;
		public WebElement getSuppCertOtherAddTax() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTax));
			return SuppCertOtherAddTax;
		}
		@FindBy(id = "txtOthAddRemarks")
		private WebElement SuppCertOtherAddTaxRemarksclick;
		public void getSuppCertOtherAddTaxRemarksclick() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTaxRemarksclick));
			 SuppCertOtherAddTaxRemarksclick.click();;
		}
		@FindBy(id = "txtOthAddRemarks")
		private WebElement SuppCertOtherAddTaxRemarks;
		public WebElement getSuppCertOtherAddTaxRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertOtherAddTaxRemarks));
			return SuppCertOtherAddTaxRemarks;
		}
		@FindBy(id = "txtRetentionPercentValue")
		private WebElement SuppCertRetentionPer;
		public WebElement getSuppCertRetentionPer() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertRetentionPer));
			return SuppCertRetentionPer;
		}
		
		@FindBy(id = "ddlPaymentMode")
		private WebElement SuppCertPayModeDD;
		public WebElement getSuppCertPayModeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPayModeDD));
			return SuppCertPayModeDD;
		}
		@FindBy(css = "input#dtpDueDate_txtDatePicker")
		private WebElement SuppCertPayDueDate;
		public WebElement getSuppCertPayDueDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertPayDueDate));
			return SuppCertPayDueDate;
		}
		@FindBy(css = "textarea#txtRemarks")
		private WebElement SuppCertRemarks;
		public WebElement getSuppCertRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertRemarks));
			return SuppCertRemarks;
		}
		@FindBy(css = "input#btnSave")
		private WebElement SuppCertCreate;
		public void getSuppCertCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertCreate));
			 SuppCertCreate.click();
		}
		@FindBy(id = "lblCertificateNoValue")
		private WebElement suppcetNo;
		public String getsuppcetNo() {
			w2.until(ExpectedConditions.elementToBeClickable(suppcetNo));
			return suppcetNo.getText();
		}
		
		@FindBy(id = "btnModify")
		private WebElement SuppCertModify;
		public void getSuppCertModify() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertModify));
			SuppCertModify.click();
		}
		@FindBy(id = "btnUpdate")
		private WebElement SuppCertUpdate;
		public void getSuppCertUpdate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertUpdate));
			SuppCertUpdate.click();
		}
		@FindBy(id = "lbnChangeStatus")
		private WebElement SuppCertChangeStatus;
		public void getSuppCertChangeStatus(){
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertChangeStatus));
			SuppCertChangeStatus.click();
		}
		@FindBy(css = "select#ddlStatus")
		private WebElement SuppCertChangeStatusDD;
		public WebElement getSuppCertChangeStatusDD(){
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertChangeStatusDD));
			return SuppCertChangeStatusDD;
		}
		@FindBy(css = "a#lbnUpdateStatus")
		private WebElement SuppCertUpdateStatus;
		public void getSuppCertUpdateStatus(){
			w2.until(ExpectedConditions.elementToBeClickable(SuppCertUpdateStatus));
			SuppCertUpdateStatus.click();
		}
		@FindBy(xpath="//a[text()='Purchase']")
		private static WebElement FinPurApprovals;
		public void getFinPurApprovals() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurApprovals));
			 FinPurApprovals.click();
		}
		@FindBy(xpath = "//a[text()='Supplier Cert.']")
		private static WebElement FinPurSuppCert;
		public void getFinPurSuppCertv() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCert));
			FinPurSuppCert.click();
		}
		@FindBy(css = "input#txtCertifyingCompPO")
		private static WebElement FinCertCompany;
		public WebElement getFinCertCompany() {
			w2.until(ExpectedConditions.elementToBeClickable(FinCertCompany));
			return FinCertCompany;
		}
		
		@FindBy(css = "input#txtCertificateNo")
		private static WebElement FinCertNo;
		public WebElement getFinCertNo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinCertNo));
			return FinCertNo;
		}
		
		@FindBy(css = "input#btnFilterGO")
		private static WebElement FinPurSuppCertGo;
		public void getFinPurSuppCertGo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurSuppCertGo));
			FinPurSuppCertGo.click();
		}
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[2]//a")
		private static WebElement FinCertNoclick;
		public void getFinCertNoclick() {
			w2.until(ExpectedConditions.elementToBeClickable(FinCertNoclick));
			FinCertNoclick.click();
		}
		
		
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//a")
		private static WebElement SuppPayFinCertNoclick;
		public void getSuppPayFinCertNoclick() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppPayFinCertNoclick));
			SuppPayFinCertNoclick.click();
		}
		
		@FindBy(css = "span#lblStatusValue")
		private static WebElement Supppaymentstatus;
		public String getSupppaymentstatus() {
			w2.until(ExpectedConditions.elementToBeClickable(Supppaymentstatus));
		return	Supppaymentstatus.getText();
		}
		@FindBy(id = "lblStatus")
		private  WebElement ServPaymentstatus;
		public String getServPaymentstatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServPaymentstatus));
		return	ServPaymentstatus.getText();
		}

		@FindBy(xpath = "//a[text()='Service Provider Advances']")
		private WebElement ServAdvlink;
		public void getServAdvlink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvlink));
			ServAdvlink.click();
		}
		@FindBy(id = "btnCreate")
		private WebElement CreateServAdvbutton;
		public void getCreateServAdvbutton() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateServAdvbutton));
			CreateServAdvbutton.click();
		}
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement ServAdvCompDD;
		public WebElement getServAdvCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvCompDD));
			return ServAdvCompDD;
		}
		@FindBy(xpath = "//div[@id='upServiceProviderCreateOrModifyMode']//tr[2]//button")
		private WebElement ServAdvProjDD;
		public WebElement getServAdvProjDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvProjDD));
			return ServAdvProjDD;
		}
		@FindBy(xpath = "//div[@id='upServiceProviderCreateOrModifyMode']//tr[2]//input[@placeholder='Search']")
		private WebElement ServAdvEnterProj;
		public WebElement getServAdvEnterProj() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvEnterProj));
			return ServAdvEnterProj;
		}
		@FindBy(xpath = "//div[@id='upServiceProviderCreateOrModifyMode']//tr[2]//li")
		private List<WebElement> ServAdvEnterListofProj;
		public List<WebElement> getServAdvEnterListofProj() {
			return ServAdvEnterListofProj;
		}
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement ServAdvPayComp;
		public WebElement getServAdvPayComp() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvPayComp));
			return ServAdvPayComp;
		}
		@FindBy(id = "lnkBtnPOSelect")
		private WebElement ServAdvSelectPOLink;
		public WebElement getServAdvSelectPOLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectPOLink));
			return ServAdvSelectPOLink;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
		private WebElement ServAdvPODD;
		public WebElement getServAdvPODD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvPODD));
			return ServAdvPODD;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
		private WebElement ServAdvEnterPO;
		public WebElement getServAdvEnterPO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvEnterPO));
			return ServAdvEnterPO;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
		private List<WebElement> ServAdvListofPO;
		public List<WebElement> getServAdvListofPO() {
			return ServAdvListofPO;
		}
		@FindBy(id = "btnSearch")
		private WebElement ServAdvSearchPO;
		public void getServAdvSearchPO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvSearchPO));
			ServAdvSearchPO.click();
		}
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input[@type='radio']")
		private WebElement ServAdvSelectPORadio;
		public void getServAdvSelectPORadio() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectPORadio));
			ServAdvSelectPORadio.click();
		}
		@FindBy(css = "a#btnAcceptSelected")
		private WebElement ServAdvAcceptSelectdPO;
		public void getServAdvAcceptSelectdPO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvAcceptSelectdPO));
			ServAdvAcceptSelectdPO.click();
		}
		@FindBy(id = "lnkBtnServiceProviderSelect")
		private WebElement ServAdvSelectServProviderLink;
		public WebElement getServAdvSelectServProviderLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectServProviderLink));
			return ServAdvSelectServProviderLink;
		}
		@FindBy(id = "textServiceProviderName")
		private WebElement ServAdvEnterSerProvider;
		public WebElement getServAdvEnterSerProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvEnterSerProvider));
			return ServAdvEnterSerProvider;
		}
		@FindBy(id = "btnFilterGO")
		private WebElement ServAdvSerProviderGo;
		public void getServAdvSerProviderGo() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvSerProviderGo));
			 ServAdvSerProviderGo.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//a")
		private WebElement ServAdvSelectSerProvider;
		public void getServAdvSelectSerProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvSelectSerProvider));
			ServAdvSelectSerProvider.click();;
		}
		@FindBy(css = "input#txtInvoiceNumber")
		private WebElement ServAdvInvNo;
		public WebElement getServAdvInvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvInvNo));
			return ServAdvInvNo;
		}
		@FindBy(css = "input#txtInvoiceAmt")
		private WebElement ServAdvInvAmount;
		public WebElement getServAdvInvAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvInvAmount));
			return ServAdvInvAmount;
		}
		@FindBy(css = "input#invoicedt_txtDatePicker")
		private WebElement ServAdvInvDate;
		public WebElement getServAdvInvDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvInvDate));
			return ServAdvInvDate;
		}
		@FindBy(css = "input#txtCertifiedAmount")
		private WebElement ServAdvCertAmt;
		public WebElement getServAdvCertAmt() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvCertAmt));
			return ServAdvCertAmt;
		}
		@FindBy(id = "ddlModeOfPayment")
		private WebElement ServAdvPayMode;
		public WebElement getServAdvPayMode() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvPayMode));
			return ServAdvPayMode;
		}
		@FindBy(css = "input#dpPaymentDueDate_txtDatePicker")
		private WebElement ServAdvPayDueDate;
		public WebElement getServAdvPayDueDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvPayDueDate));
			return ServAdvPayDueDate;
		}
		@FindBy(css = "input#txtFavouring")
		private WebElement ServAdvFavouring;
		public WebElement getServAdvFavouring() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvFavouring));
			return ServAdvFavouring;
		}
		@FindBy(id = "txtRemarks")
		private WebElement ServAdvCreateRemarks;
		public WebElement getServAdvCreateRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvCreateRemarks));
			return ServAdvCreateRemarks;
		}
		@FindBy(css = "a#lnkbtnAddTaxAdditionRow")
		private WebElement ServAdvTaxAddRow;
		public void getServAdvTaxAddRow() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvTaxAddRow));
			 ServAdvTaxAddRow.click();;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select")
		private WebElement ServAdvAddTaxCat;
		public WebElement getServAdvAddTaxCat() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxCat));
			return ServAdvAddTaxCat;
		}

		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select")
		private WebElement ServAdvAddTaxCat2;
		public WebElement getServAdvAddTaxCat2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxCat2));
			return ServAdvAddTaxCat2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select")
		private WebElement ServAdvAddTaxPer;
		public WebElement getServAdvAddTaxPer() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxPer));
			return ServAdvAddTaxPer;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select")
		private WebElement ServAdvAddTaxPer2;
		public WebElement getServAdvAddTaxPer2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxPer2));
			return ServAdvAddTaxPer2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[4]//select")
		private WebElement ServAdvAddTaxType;
		public WebElement getServAdvAddTaxType() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvAddTaxType));
			return ServAdvAddTaxType;
		}
		@FindBy(css = "a#lnkbtnAddTaxRow")
		private WebElement ServAdvTaxDedRow;
		public void getServAdvTaxDedRow() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvTaxDedRow));
			 ServAdvTaxDedRow.click();
		}
		@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table']//tr[2]//td[2]//select")
		private WebElement ServAdvDedTaxCat;
		public WebElement getServAdvDedTaxCat() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvDedTaxCat));
			return ServAdvDedTaxCat;
		}
		@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table']//tr[2]//td[3]//select")
		private WebElement ServAdvDedTaxPer;
		public WebElement getServAdvDedTaxPer() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvDedTaxPer));
			return ServAdvDedTaxPer;
		}

		@FindBy(css = "input#btnCreate")
		private WebElement ServAdvCreate;
		public WebElement getServAdvCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvCreate));
			return ServAdvCreate;
		}
		@FindBy(xpath = "//div[@class='in4-container mt-10 clear']//span[@id='lblViewAdvanceNumber']")
		private WebElement ServAdvNumber;
		public String getServAdvNumber() {
			return ServAdvNumber.getText();
		}
		
		@FindBy(id = "lnkBtnChangeStatus")
		private WebElement ServAdvChangeStatus;
		public void getServAdvChangeStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvChangeStatus));
			 ServAdvChangeStatus.click();;
		}
		@FindBy(css = "a#lnkBtnUpdateStatus")
		private WebElement ServAdvUpdateStatus;
		public void getServAdvUpdateStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvUpdateStatus));
			ServAdvUpdateStatus.click();;
		}
		@FindBy(css = "select#ddlNextStatus")
		private WebElement ServAdvStatusDD;
		public WebElement getServAdvStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServAdvStatusDD));
			return ServAdvStatusDD;
		}
		@FindBy(css = "input#dtProcessedDt_txtDatePicker")
		private WebElement ProcessedDt;
		public WebElement getProcessedDt() {
			w2.until(ExpectedConditions.elementToBeClickable(ProcessedDt));
			return ProcessedDt;
		}
		
		@FindBy(xpath="//a[text()='Service Advance']")
		private static WebElement FinPurServAdv;
		public void getFinPurServAdv() {
			w2.until(ExpectedConditions.elementToBeClickable(FinPurServAdv));
			FinPurServAdv.click();
		}
		@FindBy(css = "input#txtCertificateNo")
		private static WebElement EnterFinServAdvNo;
		public WebElement getEnterFinServAdvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterFinServAdvNo));
			return EnterFinServAdvNo;
		}
		@FindBy(css = "input#btnFilterGO")
		private static WebElement FinAdvNoGo;
		public void getFinAdvNoGo() {
			w2.until(ExpectedConditions.elementToBeClickable(FinAdvNoGo));
			FinAdvNoGo.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//a")
		private static WebElement FinAdvNoclick;
		public void getFinAdvNoclick() {
			w2.until(ExpectedConditions.elementToBeClickable(FinAdvNoclick));
			FinAdvNoclick.click();
		}
		@FindBy(css = "input#txtFavouring")
		private static WebElement FinFavouringName;
		public WebElement getFinFavouringName() {
			w2.until(ExpectedConditions.elementToBeClickable(FinFavouringName));
		return	FinFavouringName;
		}
		@FindBy(xpath = "//a[text()='Service Provider Certificates']")
		private WebElement SerCertificateLink;
		public void getSerCertificateLink() {
			w2.until(ExpectedConditions.elementToBeClickable(SerCertificateLink));
			SerCertificateLink.click();
		}
		@FindBy(id = "btnCreate")
		private WebElement CreateSerCertificate;
		public void getCreateSerCertificate() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateSerCertificate));
			CreateSerCertificate.click();
		}
		
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement ServCertCompDD;
		public WebElement getServCertCompDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertCompDD));
			return ServCertCompDD;
		}
		
		@FindBy(xpath = "//table[@class='in4-filter mb-10']//tr[2]//button")
		private WebElement getSerCertProjDD;
		public WebElement getSerCertProjDD() {
			w2.until(ExpectedConditions.elementToBeClickable(getSerCertProjDD));
			return getSerCertProjDD;
		}
		@FindBy(xpath = "//table[@class='in4-filter mb-10']//tr[2]//input[@placeholder='Search']")
		private WebElement SerCertEnterProj;
		public WebElement getSerCertEnterProj() {
			w2.until(ExpectedConditions.elementToBeClickable(SerCertEnterProj));
			return SerCertEnterProj;
		}
		@FindBy(xpath = "//table[@class='in4-filter mb-10']//tr[2]//li")
		private List<WebElement> SerCertListOfProj;
		public List<WebElement> getSerCertListOfProj() {
			return SerCertListOfProj;
		}
		@FindBy(id = "lnkBtnPOSelect")
		private WebElement ServCertSelectPOLink;
		public WebElement getServCertSelectPOLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectPOLink));
			return ServCertSelectPOLink;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
		private WebElement ServCertPODD;
		public WebElement getServCertPODD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertPODD));
			return ServCertPODD;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
		private WebElement ServCertEnterPO;
		public WebElement getServCertEnterPO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertEnterPO));
			return ServCertEnterPO;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
		private List<WebElement> ServCertListofPO;
		public List<WebElement> getServCertListofPO() {
			return ServCertListofPO;
		}
		
		@FindBy(id = "btnSearch")
		private WebElement ServCertSearchPO;
		public void getServCertSearchPO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertSearchPO));
			ServCertSearchPO.click();
		}
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input[@type='radio']")
		private WebElement ServCertSelectPORadio;
		public void getServCertSelectPORadio() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectPORadio));
			ServCertSelectPORadio.click();
		}
		@FindBy(css = "a#btnAcceptSelected")
		private WebElement ServcertAcceptSelectdPO;
		public void getServcertAcceptSelectdPO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServcertAcceptSelectdPO));
			ServcertAcceptSelectdPO.click();
		}
	
		@FindBy(id = "textServiceProviderName")
		private WebElement ServCertEnterSerProvider;
		public WebElement getServCertEnterSerProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertEnterSerProvider));
			return ServCertEnterSerProvider;
		}
		@FindBy(id = "btnFilterGO")
		private WebElement ServCertSerProviderGo;
		public void getServCertSerProviderGoo() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertSerProviderGo));
			ServCertSerProviderGo.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//a")
		private WebElement ServCertSelectSerProvider;
		public void getServCertSelectSerProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectSerProvider));
			ServCertSelectSerProvider.click();
		}
		
		@FindBy(css = "input#txtInvoiceNo")
		private WebElement ServCertInvNo;
		public WebElement getServCertInvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertInvNo));
			return ServCertInvNo;
		}
		@FindBy(css = "input#txtInvoiceAmount")
		private WebElement ServCertInvAmount;
		public WebElement getServCertInvAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertInvAmount));
			return ServCertInvAmount;
		}
		@FindBy(css = "input#dpInvoiceDate_txtDatePicker")
		private WebElement ServCertInvDate;
		public WebElement getServCertInvDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertInvDate));
			return ServCertInvDate;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[1]//input[@type='checkbox']")
		private WebElement ServCertSelectGRN;
		public void getServCertSelectGRN() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertSelectGRN));
			 ServCertSelectGRN.click();
		}

		@FindBy(xpath = "//table[@id='gvGRNTaxesAndCharges']//tr[4]//td[6]//input")
		private WebElement ServCertGRNValue;
		public WebElement getServCertGRNValue() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertGRNValue));
			return ServCertGRNValue;
		}
		
		@FindBy(css = "a#lnkbtnAddTaxAdditionRow")
		private WebElement ServCertTaxAddRow;
		public void getServCertTaxAddRow() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertTaxAddRow));
			ServCertTaxAddRow.click();;
		}
		
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//td[3]//select")
		private WebElement ServCertAddTaxCat;
		public WebElement getServCertAddTaxCat() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxCat));
			return ServCertAddTaxCat;
		}
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//td[4]//select")
		private WebElement ServCertAddTaxPer;
		public WebElement getServCertAddTaxPer() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxPer));
			return ServCertAddTaxPer;
		}
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//td[5]//select")
		private WebElement ServCertAddTaxType;
		public WebElement getServCertAddTaxType() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxType));
			return ServCertAddTaxType;
		}
		
		@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//td[3]//select")
		private WebElement ServCertAddTaxCat2;
		public WebElement getServCertAddTaxCat2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxCat2));
			return ServCertAddTaxCat2;
		}
		@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//td[4]//select")
		private WebElement ServCertAddTaxPer2;
		public WebElement getServCertAddTaxPer2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxPer2));
			return ServCertAddTaxPer2;
		}
		@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//td[5]//select")
		private WebElement ServCertAddTaxType2;
		public WebElement getServCertAddTaxType2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTaxType2));
			return ServCertAddTaxType2;
		}
		
		@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//a//img")
		private WebElement ServCertTaxAddDiv;
		public void getServServCertTaxAddDiv() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertTaxAddDiv));
			ServCertTaxAddDiv.click();
		}
		@FindBy(xpath = "//table[@class='in4-table1']//tr[4]//a//img")
		private WebElement ServCertTaxAddDiv2;
		public void getServServCertTaxAddDiv2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertTaxAddDiv2));
			ServCertTaxAddDiv2.click();
		}
		
		@FindBy(xpath = "//a[text()='Apply All']")
		private WebElement ServCertAddTAxApplyAll;
		public void getServCertAddTAxApplyAll() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTAxApplyAll));
			 ServCertAddTAxApplyAll.click();;
		}
		
		@FindBy(xpath = "//div[@id='divAddition2']//a[text()='Apply All']")
		private WebElement ServCertAddTAxApplyAll2;
		public void getServCertAddTAxApplyAll2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertAddTAxApplyAll2));
			 ServCertAddTAxApplyAll2.click();;
		}
		
		@FindBy(css = "a#lnkbtnAddTaxRow")
		private WebElement ServCertDedTaxAddRow;
		public void getServCertDedTaxAddRow() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxAddRow));
			ServCertDedTaxAddRow.click();;
		}
		@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table1']//tr[2]//td[3]//select")
		private WebElement ServCertDedTaxCat;
		public WebElement getServCertDedTaxCat() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxCat));
			return ServCertDedTaxCat;
		}
		@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table1']//tr[2]//td[4]//select")
		private WebElement ServCertDedTaxper;
		public WebElement getServCertDedTaxper() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxper));
			return ServCertDedTaxper;
		}
		@FindBy(xpath = "//div[@id='upTaxDeductionList']//table[@class='in4-table1']//tr[2]//a//img")
		private WebElement ServCertDedTaxDiv;
		public void getServCertDedTaxDiv() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxDiv));
			ServCertDedTaxDiv.click();;
		}
		@FindBy(xpath = "//div[@id='upTaxDeductionList']//a[text()='Apply All']")
		private WebElement ServCertDedTaxApplyAll;
		public void getServCertDedTaxApplyAll() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertDedTaxApplyAll));
			 ServCertDedTaxApplyAll.click();;
		}
		@FindBy(id ="ddlModeOfPayment")
		private WebElement ServCertModeofPay;
		public WebElement getServCertModeofPay() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertModeofPay));
			return ServCertModeofPay;
		}
		@FindBy(css = "input#dpPaymentDueDate_txtDatePicker")
		private WebElement ServCertPayDueDate;
		public WebElement getServCertPayDueDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertPayDueDate));
			return ServCertPayDueDate;
		}
		
		@FindBy(css = "textarea#txtRemarks")
		private WebElement ServCertRemarks;
		public WebElement getServCertRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertRemarks));
			return ServCertRemarks;
		}
		
		@FindBy(css = "input#btnCreate")
		private WebElement ServCertCreateButton;
		public void getServCertCreateButton() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertCreateButton));
			 ServCertCreateButton.click();;
		}
		
		@FindBy(id = "lblCertificateNoView")
		private WebElement ServCertNumber;
		public String getServCertNumber() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertNumber));
			return ServCertNumber.getText();
		}
		@FindBy(id = "lnkBtnChangeStatus")
		private WebElement ServCertChangeStatus;
		public void getServCertChangeStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertChangeStatus));
			ServCertChangeStatus.click();;
		}
		@FindBy(css = "select#ddlNextStatus")
		private WebElement ServCertStatusDD;
		public WebElement getServCertStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertStatusDD));
			return ServCertStatusDD;
		}
		@FindBy(css = "a#lnkBtnUpdateStatus")
		private WebElement ServCertUpdateStatus;
		public void getServCertUpdateStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertUpdateStatus));
			ServCertUpdateStatus.click();;
		}
	
		@FindBy(css = "input#dtProcessedDt_txtDatePicker")
		private WebElement ServCertProcesDate;
		public WebElement getServCertProcesDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertProcesDate));
			return ServCertProcesDate;
		}
		@FindBy(id = "lblStatus")
		private WebElement ServCertCurrentStatus;
		public String getServCertCurrentStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServCertCurrentStatus));
			return ServCertCurrentStatus.getText();
		}
		@FindBy(xpath="//a[text()='Service Cert.']")
		private  WebElement ServiceCertTab;
		public void getServiceCertTab() {
			w2.until(ExpectedConditions.elementToBeClickable(ServiceCertTab));
			ServiceCertTab.click();
		}

		@FindBy(css = "input#txtFavouring")
		private  WebElement FavoringPayee;
		public WebElement getFavoringPayee() {
			w2.until(ExpectedConditions.elementToBeClickable(FavoringPayee));
		return	FavoringPayee;
		}
		
		@FindBy(xpath = "//a[text()='Supplier Debit Note']")
		private WebElement SuppDNlink;
		public void getSuppDNlink() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNlink));
			SuppDNlink.click();
		}
		@FindBy(id = "btnCreateDebitNew")
		private WebElement SuppDNCreate;
		public void getSuppDNCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNCreate));
			SuppDNCreate.click();
		}
		
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement SuppDNCertComp;
		public WebElement getSuppDNCertComp() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNCertComp));
			return SuppDNCertComp;
		}
		
		
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement SuppDNPayingComp;
		public WebElement getSuppDNPayingComp() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNPayingComp));
			return SuppDNPayingComp;
		}

		@FindBy(xpath = "//tr[@id='trProject']//button")
		private WebElement SuppDNProject;
		public WebElement getSuppDNProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNProject));
			return SuppDNProject;
		}
		@FindBy(xpath = "//tr[@id='trProject']//input[@placeholder='Search']")
		private WebElement SuppDNEnterProject;
		public WebElement getSuppDNEnterProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNEnterProject));
			return SuppDNEnterProject;
		}
		@FindBy(xpath = "//tr[@id='trProject']//li")
		private List<WebElement> SuppDNListOfProject;
		public List<WebElement> getSuppDNListOfProject() {
			return SuppDNListOfProject;
		}
		
		@FindBy(xpath = "//tr[@id='trSubProject']//button")
		private WebElement SuppDNSubProject;
		public WebElement getSuppDNSubProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNSubProject));
			return SuppDNSubProject;
		}
		@FindBy(xpath = "//tr[@id='trSubProject']//input[@placeholder='Search']")
		private WebElement SuppDNEnterSubProject;
		public WebElement getSuppDNEnterSubProject() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNEnterSubProject));
			return SuppDNEnterSubProject;
		}
		@FindBy(xpath = "//tr[@id='trSubProject']//li")
		private List<WebElement> SuppDNListOfSubProject;
		public List<WebElement> getSuppDNListOfSubProject() {
			return SuppDNListOfSubProject;
		}

		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input")
		private WebElement SuppDNPO_Radio;
		public void getSuppDNPO_Radio() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNPO_Radio));
			SuppDNPO_Radio.click();
		}
		
		@FindBy(css = "a#btnAcceptSelected")
		private WebElement SuppDN_PO_selected;
		public void getSuppDN_PO_selected() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDN_PO_selected));
			SuppDN_PO_selected.click();
		}
		

		@FindBy(css = "input#txtinvoice")
		private WebElement SuppDNInvNo;
		public WebElement getSuppDNInvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNInvNo));
		return	SuppDNInvNo;
		}

		@FindBy(css = "select#ddlReasonType")
		private WebElement SuppDNReasonTypeDD;
		public WebElement getSuppDNReasonTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReasonTypeDD));
		return	SuppDNReasonTypeDD;
		}
		
		
		@FindBy(css = "input#txtDebitNoteAmt")
		private WebElement SuppDNAmount;
		public WebElement getSuppDNAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNAmount));
		return	SuppDNAmount;
		}
		
		@FindBy(css = "input#dtDebitNoteDate_txtDatePicker")
		private WebElement SuppDNDate;
		public WebElement getSuppDNDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNDate));
		return	SuppDNDate;
		}
		
		@FindBy(css = "input#chkTaxImpact")
		private WebElement SuppDNTaxImpact;
		public void getSuppDNTaxImpact() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNTaxImpact));
			SuppDNTaxImpact.click();;
		}
		
		@FindBy(xpath = "//div[@id='upMaterialDetailsEdit']//tr[2]//td[5]//input[1]")
		private WebElement SuppDNPOQty;
		public WebElement getSuppDNPOQty() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNPOQty));
		return	SuppDNPOQty;
		}
		
		@FindBy(xpath = "//a[text()='Add Rate/Tax']")
		private WebElement SuppDNAddRateNTax;
		public WebElement getSuppDNAddRateNTax() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNAddRateNTax));
		return	SuppDNAddRateNTax;
		}
		
		@FindBy(css = "input#txtUnitRate")
		private WebElement SuppDN_rateperUOM;
		public WebElement getSuppDN_rateperUOM() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDN_rateperUOM));
		return	SuppDN_rateperUOM;
		}
		@FindBy(css = "input#btnCalculate")
		private WebElement SuppDNCaluRate;
		public void getSuppDNCaluRate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNCaluRate));
			SuppDNCaluRate.click();
		}
		@FindBy(css = "input#btnSave")
		private WebElement SuppDBsaveRate;
		public void getSuppDNsaveRate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDBsaveRate));
			SuppDBsaveRate.click();
		}
		
		@FindBy(css = "input#btnCreate")
		private WebElement SuppDNcreateButton;
		public void getSuppDNcreateButton() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNcreateButton));
			SuppDNcreateButton.click();
		}
		
		
		@FindBy(id = "lblDebitNoteDisplayID")
		private WebElement SuppDN_ID;
		public String getSuppDN_ID() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDN_ID));
			return SuppDN_ID.getText() ;
		}
		
		@FindBy(xpath = "//textarea[@id='txtRemarks']")
		private WebElement SuppDNremarks;
		public WebElement getSuppDNremarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNremarks));
		return	SuppDNremarks;
		}
		@FindBy(xpath = "//a[text()='Change Status']")
		private WebElement SuppDNChangeStatus;
		public void getSuppDNChangeStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNChangeStatus));
			SuppDNChangeStatus.click();
		}
		
		@FindBy(css = "select#ddlStatus")
		private WebElement SuppDNStatusDD;
		public WebElement getSuppDNStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNStatusDD));
			return SuppDNStatusDD;
		}
		@FindBy(css = "input#txtProcesseddate_txtDatePicker")
		private WebElement SuppDNprocessDate;
		public WebElement getSuppDNprocessDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNprocessDate));
			return SuppDNprocessDate;
		}
		
		@FindBy(xpath = "//a[text()='Update Status']")
		private WebElement SuppDNUpdateStatus;
		public void getSuppDNUpdateStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNUpdateStatus));
			SuppDNUpdateStatus.click();
		}
		
		@FindBy(xpath = "//a[text()='Supplier Debit Note Receipt']")
		private WebElement SuppDNRecptLink;
			public void getSuppDNRecptLink() {
				w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptLink));
				SuppDNRecptLink.click();
			}
		@FindBy(id = "ButtonCreate")
		private WebElement CreateSuppDNRecpt;
		public void getCreateSuppDNRecpt() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateSuppDNRecpt));
			CreateSuppDNRecpt.click();
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlCompanyList")
		private WebElement SuppDNRecptComp;
		public WebElement getSuppDNRecptComp() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptComp));
			return SuppDNRecptComp;
		}

		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlProjectList")
		private WebElement SuppDNRecptProj;
		public WebElement getSuppDNRecptProj() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptProj));
			return SuppDNRecptProj;
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlSubProjectList")
		private WebElement SuppDNRecptSubProj;
		public WebElement getSuppDNRecptSubProj() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptSubProj));
			return SuppDNRecptSubProj;
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlSupplierList")
		private WebElement SuppDNRecptSupplier;
		public WebElement getSuppDNRecptSupplier() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNRecptSupplier));
			return SuppDNRecptSupplier;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_dtReceiptDate_txtDatePicker")
		private WebElement SuppDNReceiptDate;
		public WebElement getSuppDNReceiptDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptDate));
			return SuppDNReceiptDate;
		}
		@FindBy(css = "input#FormViewDebitNoteReceipt_txtReceiptAmount")
		private WebElement SuppDNReceiptAmount;
		public WebElement getSuppDNReceiptAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAmount));
			return SuppDNReceiptAmount;
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlPaymentModeList")
		private WebElement SuppDNReceiptPaymentMode;
		public WebElement getSuppDNReceiptPaymentMode() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptPaymentMode));
			return SuppDNReceiptPaymentMode;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtRemarks")
		private WebElement SuppDNReceiptRemarks;
		public WebElement getSuppDNReceiptRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptRemarks));
			return SuppDNReceiptRemarks;
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlReceiptCurrency")
		private WebElement SuppDNReceiptCurrency;
		public WebElement getSuppDNReceiptCurrency() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptCurrency));
			return SuppDNReceiptCurrency;
		}
		@FindBy(id = "FormViewDebitNoteReceipt_ddlBankList")
		private WebElement SuppDNReceiptBankList;
		public WebElement getSuppDNReceiptBankList() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptBankList));
			return SuppDNReceiptBankList;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtBranchName")
		private WebElement SuppDNReceiptBranchName;
		public WebElement getSuppDNReceiptBranchName() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptBranchName));
			return SuppDNReceiptBranchName;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtPayableAt")
		private WebElement SuppDNReceiptPayableAt;
		public WebElement getSuppDNReceiptPayableAt() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptPayableAt));
			return SuppDNReceiptPayableAt;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtAccountNumber")
		private WebElement SuppDNReceiptAccountNumber;
		public WebElement getSuppDNReceiptAccountNumber() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAccountNumber));
			return SuppDNReceiptAccountNumber;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_dtInstrumentDate_txtDatePicker")
		private WebElement SuppDNReceiptInstrumentDate;
		public WebElement getSuppDNReceiptInstrumentDate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptInstrumentDate));
			return SuppDNReceiptInstrumentDate;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentAmount")
		private WebElement SuppDNReceiptInstrumentAmount;
		public WebElement getSuppDNReceiptInstrumentAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptInstrumentAmount));
			return SuppDNReceiptInstrumentAmount;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentNumber")
		private WebElement SuppDNReceiptInstrumentNumber;
		public WebElement getSuppDNReceiptInstrumentNumber() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptInstrumentNumber));
			return SuppDNReceiptInstrumentNumber;
		}
		@FindBy(id = "FormViewDebitNoteReceipt_chkProjectBranch")
		private WebElement SuppDNReceiptIsSameBranch;
		public void getSuppDNReceiptIsSameBranch() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptIsSameBranch));
			 SuppDNReceiptIsSameBranch.click();;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_lnkAddNewDebitNote")
		private WebElement SuppDNReceiptAddDebitNote;
		public WebElement getSuppDNReceiptAddDebitNote() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAddDebitNote));
			return SuppDNReceiptAddDebitNote;
		}
		
		@FindBy(css = "input#txtDebitNoteNo")
		private WebElement SuppDNReceiptEnterDebitNoteNo;
		public WebElement getSuppDNReceiptEnterDebitNoteNo() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptEnterDebitNoteNo));
			return SuppDNReceiptEnterDebitNoteNo;
		}
		
		@FindBy(css = "input#txtFilterPurchaseOrder")
		private WebElement SuppDNReceiptEnterPurchaseOrder;
		public WebElement getSuppDNReceiptEnterPurchaseOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptEnterPurchaseOrder));
			return SuppDNReceiptEnterPurchaseOrder;
		}
		
		@FindBy(css = "input#btnFilterGO")
		private WebElement SuppDNReceiptSearchGO;
		public void getSuppDNReceiptSearchGO() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptSearchGO));
			 SuppDNReceiptSearchGO.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input")
		private WebElement SuppDNReceiptSelectDN;
		public void getSuppDNReceiptSelectDN() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptSelectDN));
			 SuppDNReceiptSelectDN.click();;
		}

		@FindBy(id = "lnkAcceptSelected")
		private WebElement SuppDNReceiptAcceptSelected;
		public void getSuppDNReceiptAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptAcceptSelected));
			 SuppDNReceiptAcceptSelected.click();;
		}
		
		@FindBy(xpath = "//div[@id='FormViewDebitNoteReceipt_upGridViewList']//tr[2]//td[9]//input")
		private WebElement SuppDNCurrentReceiptAmount;
		public WebElement getSuppDNCurrentReceiptAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNCurrentReceiptAmount));
			return SuppDNCurrentReceiptAmount;
		}

		
		@FindBy(css = "input#ButtonCreate")
		private WebElement SuppDNReceiptCreate;
		public void getSuppDNReceiptCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptCreate));
			 SuppDNReceiptCreate.click();;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_lblReceiptNoValue")
		private WebElement SuppDNReceiptID;
		public String getSuppDNReceiptID() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptID));
			return SuppDNReceiptID.getText();
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_btnFillDNAmt")
		private WebElement SuppDNReceiptFillAmount;
		public void getSuppDNReceiptFillAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptFillAmount));
			SuppDNReceiptFillAmount.click();;
		}
		@FindBy(id = "FormViewDebitNoteReceipt_linkChangeStatus")
		private WebElement SuppDNReceiptChangeStatus;
		public void getSuppDNReceiptChangeStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptChangeStatus));
			SuppDNReceiptChangeStatus.click();;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_ddlUpdateStatusList")
		private WebElement SuppDNReceiptStatusDD;
		public WebElement getSuppDNReceiptStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptStatusDD));
			return SuppDNReceiptStatusDD;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_linkUpdateStatus")
		private WebElement SuppDNReceiptUpdateStatus;
		public void getSuppDNReceiptUpdateStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(SuppDNReceiptUpdateStatus));
			SuppDNReceiptUpdateStatus.click();;
		}
		
		
		@FindBy(id = "FormViewDebitNoteReceipt_ddlBankHeaderAccount")
		private WebElement BankHeaderAccount;
		public WebElement getBankHeaderAccount() {
			w2.until(ExpectedConditions.elementToBeClickable(BankHeaderAccount));
			return BankHeaderAccount;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_dtReceivedDate_txtDatePicker")
		private WebElement ReceivedDate;
		public WebElement getReceivedDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ReceivedDate));
			return ReceivedDate;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtStatusRemark")
		private WebElement StatusRemarks;
		public WebElement getStatusRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(StatusRemarks));
			return StatusRemarks;
		}
		
		@FindBy(css = "input#FormViewDebitNoteReceipt_dtRealizedDate_txtDatePicker")
		private WebElement RealizedDate;
		public WebElement getRealizedDate() {
			w2.until(ExpectedConditions.elementToBeClickable(RealizedDate));
			return RealizedDate;
		}
		
		
		@FindBy(xpath = "//a[text()='Service Provider Debit Note']")
		private WebElement ServDNLink;
		public void getServDNLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNLink));
			ServDNLink.click();
		}
		@FindBy(id = "btnCreate")
		private WebElement CreateServDebitNote;
		public void getCreateServDebitNote() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateServDebitNote));
			CreateServDebitNote.click();
		}
		@FindBy(css = "select#ddlCertifyingCompany")
		private WebElement ServDNCertComp;
		public WebElement getServDNCertComp() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNCertComp));
			return ServDNCertComp;
		}
		@FindBy(id = "ddlPayingCompanyProvider")
		private WebElement ServDNPayingComp;
		public WebElement getServDNPayingComp() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNPayingComp));
			return ServDNPayingComp;
		}
		
		@FindBy(xpath = "//table[@id='CreateTable']//tr[2]//button")
		private WebElement ServDNProject;
		public WebElement getServDNProject() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNProject));
			return ServDNProject;
		}
		@FindBy(xpath = "//table[@id='CreateTable']//tr[2]//input[@placeholder='Search']")
		private WebElement ServDNEnterProject;
		public WebElement getServDNEnterProject() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNEnterProject));
			return ServDNEnterProject;
		}
		@FindBy(xpath = "//table[@id='CreateTable']//tr[2]//li")
		private List<WebElement> ServDNListOfProject;
		public List<WebElement> getServDNListOfProject() {
			return ServDNListOfProject;
		}
		
		@FindBy(xpath = "//a[text()='Select']")
		private WebElement SelectPOlink;
		public WebElement getSelectPOlink() {
			w2.until(ExpectedConditions.elementToBeClickable(SelectPOlink));
		return	SelectPOlink;
		}
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//span//button")
		private WebElement PO_NumDD;
		public WebElement getPO_NumDD() {
			w2.until(ExpectedConditions.elementToBeClickable(PO_NumDD));
		return	PO_NumDD;
		}
		
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//ul//input[@placeholder='Search']")
		private WebElement EnterSuppDNEnterPO;
		public WebElement getEnterSuppDNEnterPO() {
			w2.until(ExpectedConditions.elementToBeClickable(EnterSuppDNEnterPO));
		return	EnterSuppDNEnterPO;
		}
		
		@FindBy(xpath = "//table[@class='in4-filter']//tr[3]//td[2]//li")
		private List<WebElement> SuppDNListOfPO;
		public List<WebElement> getSuppDNListOfPO() {
		return	SuppDNListOfPO;
		}
		
		@FindBy(id = "btnSearch")
		private WebElement SearchSuppDNPO;
		public void getSearchSuppDNPO() {
			w2.until(ExpectedConditions.elementToBeClickable(SearchSuppDNPO));
			SearchSuppDNPO.click();
		}
		@FindBy(xpath = "//table[@class='in4-table mt-5']//tr[2]//td[1]//input")
		private WebElement ServDNPO_Radio;
		public void getServDNPO_Radio() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNPO_Radio));
			ServDNPO_Radio.click();
		}
		
		@FindBy(css = "a#btnAcceptSelected")
		private WebElement ServDN_PO_selected;
		public void getServDN_PO_selected() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_PO_selected));
			ServDN_PO_selected.click();
		}
		@FindBy(id = "lnkBtnServiceProviderSelect")
		private WebElement ServDN_SelectServProvider;
		public WebElement getServDN_SelectServProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_SelectServProvider));
			return ServDN_SelectServProvider;
		}
		@FindBy(id = "textServiceProviderName")
		private WebElement ServDN_EnterServProviderName;
		public WebElement getServDN_EnterServProviderName() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_EnterServProviderName));
			return ServDN_EnterServProviderName;
		}
		
		@FindBy(id = "btnFilterGO")
		private WebElement ServDN_ServProviderGOButton;
		public WebElement getServDN_ServProviderGOButton() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_ServProviderGOButton));
			return ServDN_ServProviderGOButton;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//a[@id='gdvServiceProviderList_ctl02_lnkServiceProviderName']")
		private WebElement clickServiceProvider;
		public void getclickServiceProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(clickServiceProvider));
			clickServiceProvider.click();
		}
		

		@FindBy(id = "lblinvoice")
		private WebElement ServDN_InvNo;
		public WebElement getServDN_InvNo() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_InvNo));
			return ServDN_InvNo;
		}
		
		@FindBy(id = "txtInvoiceEdit")
		private WebElement ServDN_InvNoEdit;
		public WebElement getServDN_InvNoEdit() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_InvNoEdit));
			return ServDN_InvNoEdit;
		}
		
		
		@FindBy(css = "select#ddlReasonType")
		private WebElement ServDN_ReasonTypeDD;
		public WebElement getServDN_ReasonTypeDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_ReasonTypeDD));
			return ServDN_ReasonTypeDD;
		}
		
		@FindBy(id = "txtDebitNoteamt")
		private WebElement ServDN_Amount;
		public WebElement getServDN_Amount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_Amount));
			return ServDN_Amount;
		}

		@FindBy(id = "txtdebitnotedate_txtDatePicker")
		private WebElement ServDN_Date;
		public WebElement getServDN_Date() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_Date));
			return ServDN_Date;
		}
		
		
		@FindBy(id = "txtDebitNoteDateEdit_txtDatePicker")
		private WebElement ServDN_DateEdit;
		public WebElement getServDN_DateEdit() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_DateEdit));
			return ServDN_DateEdit;
		}
		
		@FindBy(id = "txtRemarks")
		private WebElement ServDN_Remarks;
		public WebElement getServDN_Remarks() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_Remarks));
			return ServDN_Remarks;
		}
		
		
		@FindBy(id = "txtRemarksEdit")
		private WebElement ServDN_RemarksEdit;
		public WebElement getServDN_RemarksEdit() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_RemarksEdit));
			return ServDN_RemarksEdit;
		}
		
		@FindBy(css = "a#lnkbtnAddTaxAdditionRow")
		private WebElement ServDN_AddRowLink;
		public void getServDN_AddRowLink() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_AddRowLink));
			 ServDN_AddRowLink.click();
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[2]//select")
		private WebElement ServDN_TaxCat;
		public WebElement getServDN_TaxCat() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxCat));
			return ServDN_TaxCat;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[3]//select")
		private WebElement ServDN_TaxPer;
		public WebElement getServDN_TaxPer() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxPer));
			return ServDN_TaxPer;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[4]//select")
		private WebElement ServDN_TaxType;
		public WebElement getServDN_TaxType() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxType));
			return ServDN_TaxType;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[2]//select")
		private WebElement ServDN_TaxCat2;
		public WebElement getServDN_TaxCat2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxCat2));
			return ServDN_TaxCat2;
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[3]//select")
		private WebElement ServDN_TaxPer2;
		public WebElement getServDN_TaxPer2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxPer2));
			return ServDN_TaxPer2;
		}
		@FindBy(xpath = "//table[@class='in4-table']//tr[3]//td[4]//select")
		private WebElement ServDN_TaxType2;
		public WebElement getServDN_TaxType2() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_TaxType2));
			return ServDN_TaxType2;
		}

		@FindBy(id = "btnCreate")
		private WebElement ServDN_Create;
		public WebElement getServDN_Create() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_Create));
			return ServDN_Create;
		}
		@FindBy(id = "lblDebitNoteDisplayID")
		private WebElement ServDN_ID;
		public String getServDN_ID() {
			return ServDN_ID.getText();
		}
		@FindBy(id = "lnkBtnChangeStatus")
		private WebElement ServDN_ChangeStatus;
		public void getServDN_ChangeStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_ChangeStatus));
			ServDN_ChangeStatus.click();;
		}
		@FindBy(css = "select#ddlNextStatus")
		private WebElement ServDN_StatusDD;
		public WebElement getServDN_StatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_StatusDD));
			return ServDN_StatusDD;
		}
		@FindBy(css = "a#lnkBtnUpdateStatus")
		private WebElement ServDN_UpdateStatus;
		public void getServDN_UpdateStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDN_UpdateStatus));
			ServDN_UpdateStatus.click();;
		}
		@FindBy(css = "input#dtProcessedDt_txtDatePicker")
		private WebElement ServDN_ProcessDate;
		public WebElement getServDN_ProcessDate() {
			return ServDN_ProcessDate;
		}
		
		@FindBy(xpath = "//a[text()='Service Provider Debit Note Receipt']")
		private WebElement ServDNRecptLink;
			public void getServDNRecptLink() {
				w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptLink));
				ServDNRecptLink.click();
			}
		@FindBy(id = "ButtonCreate")
		private WebElement CreateServDNRecpt;
		public void getCreateServDNRecpt() {
			w2.until(ExpectedConditions.elementToBeClickable(CreateServDNRecpt));
			CreateServDNRecpt.click();
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlCompanyList")
		private WebElement ServDNRecptComp;
		public WebElement getServDNRecptComp() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptComp));
			return ServDNRecptComp;
		}
		
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlProjectList")
		private WebElement ServDNRecptProj;
		public WebElement getServDNRecptProj() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptProj));
			return ServDNRecptProj;
		}

		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlserviceProvider")
		private WebElement ServDNRecptserviceProvider;
		public WebElement getServDNRecptserviceProvider() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNRecptserviceProvider));
			return ServDNRecptserviceProvider;
		}

		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlReceiptCurrency")
		private WebElement ServDNReceiptCurrency;
		public WebElement getServDNReceiptCurrency() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptCurrency));
			return ServDNReceiptCurrency;
		}
		@FindBy(id = "FormViewDebitNoteReceipt_dtReceiptDate_txtDatePicker")
		private WebElement ServDNReceiptDate;
		public WebElement getServDNReceiptDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptDate));
			return ServDNReceiptDate;
		}
		
		@FindBy(css = "input#FormViewDebitNoteReceipt_txtReceiptAmount")
		private WebElement ServDNReceiptAmount;
		public WebElement getServDNReceiptAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAmount));
			return ServDNReceiptAmount;
		}
		@FindBy(css = "select#FormViewDebitNoteReceipt_ddlPaymentModeList")
		private WebElement ServDNReceiptPaymentMode;
		public WebElement getServDNReceiptPaymentMode() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptPaymentMode));
			return ServDNReceiptPaymentMode;
		}
		@FindBy(id = "FormViewDebitNoteReceipt_lnkAddNewDebitNote")
		private WebElement ServDNReceiptAddDebitNote;
		public WebElement getServDNReceiptAddDebitNote() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAddDebitNote));
			return ServDNReceiptAddDebitNote;
		}
		@FindBy(css = "input#txtDebitNoteNo")
		private WebElement ServDNReceiptEnterDebitNoteNo;
		public WebElement getServDNReceiptEnterDebitNoteNo() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptEnterDebitNoteNo));
			return ServDNReceiptEnterDebitNoteNo;
		}
		
		@FindBy(css = "input#txtFilterPurchaseOrder")
		private WebElement ServDNReceiptEnterPurchaseOrder;
		public WebElement getServDNReceiptEnterPurchaseOrder() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptEnterPurchaseOrder));
			return ServDNReceiptEnterPurchaseOrder;
		}
		
		@FindBy(css = "input#btnFilterGO")
		private WebElement ServDNReceiptSearchGO;
		public void getServDNReceiptSearchGO() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptSearchGO));
			ServDNReceiptSearchGO.click();
		}
		
		@FindBy(xpath = "//table[@class='in4-table']//tr[2]//td[1]//input")
		private WebElement ServDNReceiptSelectDN;
		public void getServDNReceiptSelectDN() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptSelectDN));
			ServDNReceiptSelectDN.click();;
		}

		@FindBy(id = "lnkAcceptSelected")
		private WebElement ServDNReceiptAcceptSelected;
		public void getServDNReceiptAcceptSelected() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAcceptSelected));
			ServDNReceiptAcceptSelected.click();;
		}
		
		
		@FindBy(id = "FormViewDebitNoteReceipt_ddlBankList")
		private WebElement ServDNReceiptBankList;
		public WebElement getServDNReceiptBankList() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptBankList));
			return ServDNReceiptBankList;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtBranchName")
		private WebElement ServDNReceiptBranchName;
		public WebElement getServDNReceiptBranchName() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptBranchName));
			return ServDNReceiptBranchName;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtPayableAt")
		private WebElement ServDNReceiptPayableAt;
		public WebElement getServDNReceiptPayableAt() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptPayableAt));
			return ServDNReceiptPayableAt;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtAccountNumber")
		private WebElement ServDNReceiptAccountNumber;
		public WebElement getServDNReceiptAccountNumber() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptAccountNumber));
			return ServDNReceiptAccountNumber;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_dtInstrumentDate_txtDatePicker")
		private WebElement ServDNReceiptInstrumentDate;
		public WebElement getServDNReceiptInstrumentDate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptInstrumentDate));
			return ServDNReceiptInstrumentDate;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentAmount")
		private WebElement ServDNReceiptInstrumentAmount;
		public WebElement getServDNReceiptInstrumentAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptInstrumentAmount));
			return ServDNReceiptInstrumentAmount;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtInstrumentNumber")
		private WebElement ServDNReceiptInstrumentNumber;
		public WebElement getServDNReceiptInstrumentNumber() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptInstrumentNumber));
			return ServDNReceiptInstrumentNumber;
		}
		@FindBy(id = "FormViewDebitNoteReceipt_chkProjectBranch")
		private WebElement ServDNReceiptIsSameBranch;
		public void getServDNReceiptIsSameBranch() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptIsSameBranch));
			ServDNReceiptIsSameBranch.click();;
		}
		

		@FindBy(xpath = "//div[@id='FormViewDebitNoteReceipt_upGridViewList']//tr[2]//td[9]//input")
		private WebElement ServDNCurrentReceiptAmount;
		public WebElement getServDNCurrentReceiptAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNCurrentReceiptAmount));
			return ServDNCurrentReceiptAmount;
		}

		
		@FindBy(css = "input#ButtonCreate")
		private WebElement ServDNReceiptCreate;
		public void getServDNReceiptCreate() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptCreate));
			ServDNReceiptCreate.click();
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_lblReceiptNoValue")
		private WebElement ServDNReceiptID;
		public String getServDNReceiptID() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptID));
			return ServDNReceiptID.getText();
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_btnFillDNAmt")
		private WebElement ServDNReceiptFillAmount;
		public void getServDNReceiptFillAmount() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptFillAmount));
			ServDNReceiptFillAmount.click();
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_txtRemarks")
		private WebElement ServDNReceiptRemarks;
		public WebElement getServDNReceiptRemarks() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptRemarks));
			return ServDNReceiptRemarks;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_linkChangeStatus")
		private WebElement ServDNReceiptChangeStatus;
		public void ServDNReceiptChangeStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptChangeStatus));
			ServDNReceiptChangeStatus.click();;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_ddlUpdateStatusList")
		private WebElement ServDNReceiptStatusDD;
		public WebElement getServDNReceiptStatusDD() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptStatusDD));
			return ServDNReceiptStatusDD;
		}
		
		@FindBy(id = "FormViewDebitNoteReceipt_linkUpdateStatus")
		private WebElement ServDNReceiptUpdateStatus;
		public void getServDNReceiptUpdateStatus() {
			w2.until(ExpectedConditions.elementToBeClickable(ServDNReceiptUpdateStatus));
			ServDNReceiptUpdateStatus.click();;
		}
		
	
		
		@FindBy(id = "FormViewDebitNoteReceipt_lblStatusValue")
		private WebElement ServDNReceiptCurrentStatus;
		public String getServDNReceiptCurrentStatus() {
			return ServDNReceiptCurrentStatus.getText();
		}
		
		
		public void MenuSubMenuIndent() {
			try {
				MainMenu mm = new MainMenu(iDriver);
				mm.clickEngineering();
				Thread.sleep(2000);
				Engineering en = new Engineering(iDriver);
				en.clickInventory();
				Thread.sleep(1000);
				xml = new Datatable();
				sheet = xml.excelData(sheetname, Engineering.inputCreatePath);
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String IndentNo="";
		public void Indent() throws Throwable {
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			getindlink(); 
				try {
					Frames.rightFrame();
					getCreateIndBtn();
//	 				if WO taking from excel changes the column, accordingly update the number here
//					if(WO_Number_Data == 10) {
//						getAssetRadioBtn();
//					}
					appInd.singleDropDown(getIndentTypeDD(), sheet.getRow(1).getCell(0).getStringCellValue());
					Thread.sleep(2000);
					appInd.singleDropDown(getIndProjectDD(), sheet.getRow(1).getCell(1).getStringCellValue());
					Thread.sleep(2000);
					appInd.singleDropDown(getIndSubProjectDD(), sheet.getRow(1).getCell(2).getStringCellValue());

					String parent = appInd.switchToChildWindow(getSelectWorkOrder());
					getEnterWorkOrder().sendKeys(sheet.getRow(1).getCell(9).getStringCellValue());
					getSearchWorkOrder();
					getSelectWorkOrderRadio();
					getWOAcceptSelected();
					appInd.switchToParentWindow(parent);

					Frames.rightFrame();
					getRemarks().sendKeys("working boss");
					getCreateBtn().click();
					
					IndentNo = getIndentNumber();
					IndentCreate = new Indent_Create(iDriver);
				
					WOSummary();
					//IndentCreate.BOQlevel(1);
					//IndentCreate.materialMaster(1);
					getchangestatus();
					Thread.sleep(1000);
					getStatusDD().sendKeys("Submitted");
					Thread.sleep(2000);
					getupdatestatus();
					Thread.sleep(2000);
					getchangestatus();
					Thread.sleep(1000);
					getStatusDD().sendKeys("Approved");
					Thread.sleep(2000);
					getupdatestatus();
					
					if (appInd.AlertPresent()) {
						Datatable.writeExcel("Indent", "Indent is Not Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
						System.out.println("Indent is Not Created");
					} else {
						Datatable.writeExcel(IndentNo, "Indent is Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
						System.out.println(IndentNo+"  Indent is Created");
					}
				} catch (Exception e) {
					Datatable.writeExcel("Indent", "Indent is not Created-Exception", PurpaymentflowOutput,Purchase.OutputCreatePath);
					System.out.println("Indent is Not Created Exception");
				}
			}
		
		
		public void WOSummary() throws Throwable {
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
				getWorkOrderSummaryBtn();
				String parent = appInd.switchToChildWindow(getIndentAddItemBtn());
				getWOSummaryRecord();
				getWOAcceptSelected();
				appInd.switchToParentWindow(parent);
				Frames.rightFrame();
				appInd.singleDropDown(getStoreDD(), sheet.getRow(1).getCell(5).getStringCellValue());
				getQuantity().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
		

				for (int j = 0; j < 4; j++) {

					try {
						getDownArrow();
					} catch (Exception e) {
					}
					if (DeliveryDateArrow.isDisplayed()) {
						break;
					}
				}
				appInd.seletDate(getDeliveryDateArrow(), appInd.CurrentDateIn_MMM_DD_YYYY());
				getQuantityArrow().sendKeys(sheet.getRow(1).getCell(6).getStringCellValue());
				appInd.isAlertPresent();
				getAddBtn();
		
			}catch (Exception e) {
				System.out.println("Work Order ummary exception"+e);
			
			}
		}
		public void MenuSubMenuPO() {
			try {
//				MainMenu mm = new MainMenu(iDriver);
//				mm.clickEngineering();
//				Thread.sleep(2000);
//				Engineering en = new Engineering(iDriver);
//				en.clickInventory();
//				Thread.sleep(1000);
				xml = new Datatable();
				sheetPO = xml.excelData(sheetnamePO, Engineering.inputCreatePath);
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String PurchaseOrder_No="";
		public void PurchaseOrder()throws Throwable{
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				try {
			Frames.SubMenuFrame();
			getPOlink();
			Frames.rightFrame();
			getCreatePObutton();
			getMaterialPO();
			getDomesticPO();
			getCompany().sendKeys(sheetPO.getRow(1).getCell(0).getStringCellValue());
			appInd.seletDate(getPOdate(), appInd.CurrentDateIn_MMM_DD_YYYY());
			getsupplier().sendKeys(sheetPO.getRow(1).getCell(1).getStringCellValue());
			getPOrefNo().sendKeys("refNo"+appInd.RandomNumbers(5));
			getDocumentThrough().sendKeys("E-Mail");
			getAddMaterial_Indent();
			Frames.iFrame();
			Thread.sleep(3000);
			appInd.singleDropDown(getPOProjectDD(),(sheetPO.getRow(1).getCell(2).getStringCellValue()));
			Thread.sleep(3000);
			appInd.singleDropDown(getPOSubProjectDD(), (sheetPO.getRow(1).getCell(3).getStringCellValue()));
			Thread.sleep(3000);
			getIndent_No().sendKeys(IndentNo);
			//getWO_No().sendKeys(sheet.getRow(1).getCell(9).getStringCellValue());
			appInd.seletDate(getIndentFromdate(), Indentstartdate);
			appInd.seletDate(getToDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
			getSearch();
			getcheckbox();
			Thread.sleep(3000);
			getAcceptSelected();
			Frames.rightFrame();
			getPO_Qty().clear();
			Thread.sleep(3000);
			getPO_Qty().sendKeys(sheetPO.getRow(1).getCell(6).getStringCellValue());
			Thread.sleep(1000);
			getcreatebutton();
			Thread.sleep(2000);
			getcreatebutton();
			Thread.sleep(2000);
			String parent1 = appInd.switchToChildWindow(getAddRateTax());
			getRate().clear();
			appInd.isAlertPresent();
			getRate().sendKeys(sheetPO.getRow(1).getCell(7).getStringCellValue());
			getCalRate();
			Thread.sleep(3000);
			getCalRate();
			int chargecount=0;
			for(int j=0; j<=getCharges().size(); j++) {
				chargecount++;
				if(getCharges().get(j).getText().equals("OTHER CHARGES"))
				{
					chargecount = chargecount + 1;
					////table[@class='in4-table mt-5']//tr[4]//td[2]//input
					iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).clear();
					Thread.sleep(3000);
					iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).sendKeys(sheetPO.getRow(1).getCell(8).getStringCellValue());
					break;		
				}
			}
			
			getCalRate();
			getSaveRate();
			Thread.sleep(3000);
			appInd.switchToParentWindow(parent1);
			Frames.rightFrame();
			Thread.sleep(3000);
			getUpdateRate();
			String parent2 = appInd.switchToChildWindow(getSelectServLink());
			getSearchBy().sendKeys(sheetPO.getRow(1).getCell(9).getStringCellValue());
			getGobutton();
			getServiceProviderName();
			appInd.switchToParentWindow(parent2);
			Frames.rightFrame();
			Thread.sleep(3000);
			getServAdvance().clear();
			Thread.sleep(3000);
			getServAdvance().sendKeys(sheetPO.getRow(1).getCell(11).getStringCellValue());
			getServcheckbox();
			Thread.sleep(3000);
			getServcheckbox();
			try {
			Thread.sleep(3000);
			getSuppAdvance().clear();
			Thread.sleep(3000);
			getSuppAdvance().sendKeys(sheetPO.getRow(1).getCell(10).getStringCellValue());
			}catch(Exception e) {
				System.out.println("getSuppAdvance  "+e);
			}
			Thread.sleep(2000);
			getUpdateTermandConditions();
			Thread.sleep(3000);
			getPOchangestatus();
			Thread.sleep(2000);
			getPOstatusDD().sendKeys("Submitted");
			appInd.AlertPresent();
			Thread.sleep(2000);
			getPOUpdatestaus();
			Thread.sleep(2000);
			getPOchangestatus();
			Thread.sleep(2000);
			getPOstatusDD().sendKeys("Approved");
			Thread.sleep(2000);
			getApproverRemarks().sendKeys("PO CREATED and APPROVED THROUGH AUTOMATION");
			Thread.sleep(1000);
			getPOUpdatestaus();
			Thread.sleep(2000);
			Thread.sleep(1000);
			PurchaseOrder_No=getPOnumber();
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("PurchaseOrder", "is Not Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
				System.out.println("  Purchase Order is Not Created");
			}else{
				
				Datatable.writeExcel(PurchaseOrder_No, "PO is Created", PurpaymentflowOutput,Purchase.OutputCreatePath);
				System.out.println(PurchaseOrder_No+"  Purchase Order is Created");
			}
				}catch (Exception e) {
					Datatable.writeExcel("Purchase Order", "is Not Created -Exception ", PurpaymentflowOutput,Purchase.OutputCreatePath);
					System.out.println("Not Created -Exception---"+e);
					System.out.println("  Purchase Order is Not Created Exception");
				}
		}
		public void MenuSubMenuGRN() {
			try {
//				MainMenu mm = new MainMenu(iDriver);
//				mm.clickEngineering();
//				Thread.sleep(2000);
//				Engineering en = new Engineering(iDriver);
//				en.clickInventory();
//				Thread.sleep(1000);
				xml = new Datatable();
				sheetGRN = xml.excelData(sheetnameGRN, Engineering.inputCreatePath);
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String GRN_No="";
		public void GRN() throws Throwable{
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
			Frames.SubMenuFrame();
			getGRN_Link();
			Frames.rightFrame();
			getCreateGRN();
			appInd.singleDropDown(getGRNTypeDD(), sheetGRN.getRow(1).getCell(0).getStringCellValue());
			appInd.singleDropDown(getSupplierDD(), sheetGRN.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getCompanyDD(), sheetGRN.getRow(1).getCell(2).getStringCellValue());
			Thread.sleep(2000);
			getGRNProjectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getGRNProjectDD(), getEnterGRNProject(), sheetGRN.getRow(1).getCell(3).getStringCellValue(), getListtOfGRNProject());
			Thread.sleep(1000);
			getGRNSubProjectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getGRNSubProjectDD(), getEnterGRNSubProject(), sheetGRN.getRow(1).getCell(4).getStringCellValue(), getListOfGRNSubProject());
			Thread.sleep(1000);
			String parent=appInd.switchToChildWindow(getSelectPO());
			Thread.sleep(2000);
			getPO_NoDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getPO_NoDD(), getEnterPO_No(), PurchaseOrder_No, getListofPO());
			Thread.sleep(1000);
			getSearchButton();
			Thread.sleep(2000);
			getPO_Radio();
			getAcceptSelected();
			appInd.switchToParentWindow(parent);
			Thread.sleep(1000);
			Frames.rightFrame();
			getChallan_No().sendKeys(appInd.RandomNumbers(5));
			appInd.seletDate(getChallan_Date(), appInd.CurrentDateIn_MMM_DD_YYYY());
			Thread.sleep(1000);
			appInd.seletDate(getGRN_Date(), appInd.CurrentDateIn_MMM_DD_YYYY());
			Thread.sleep(1000);
			getVehicle_No().sendKeys("KA 05 J 5296");
			Thread.sleep(1000);
			getGate_No().sendKeys(appInd.RandomNumbers(1));
			Thread.sleep(1000);
			getRemarks().sendKeys("GRN CREATED THROUGH AUTOMATION");
			Thread.sleep(1000);
			getReceived_Qty().sendKeys(sheetGRN.getRow(1).getCell(7).getStringCellValue());
			Thread.sleep(2000);
			getGRNCreateButton();
			Thread.sleep(5000);
			GRN_No=getGRN_Number();
			Thread.sleep(1000);
			getGRNchangestatus();
			Thread.sleep(3000);
			getGRNStatusDD().sendKeys("Submitted");
			Thread.sleep(3000);
			getGRNupdatestatus();
			Thread.sleep(3000);
			getGRNchangestatus();
			Thread.sleep(3000);
			getGRNStatusDD().sendKeys("Approved");
			Thread.sleep(5000);
			getGRNupdatestatus();
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("GRN", "Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("  GRN is Not Created");
			}else {
				Datatable.writeExcel(GRN_No, "GRN is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println(GRN_No + "  GRN IS CREATED ");
			}
			}catch (Exception e) {
				Datatable.writeExcel("GRN", "Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("  GRN is Not Created Exception");
			}
		}
		
	
	//Crating Supplier Advance
		public void MenuSubMenuAdvance()throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickPurchase();
				Thread.sleep(2000);
				Purchase en=new Purchase(iDriver);
				en.clickPayments();
				Thread.sleep(2000);
				xml = new Datatable();
				sheetAdv = xml.excelData(sheetnameAdv, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}
		String Supplier_Advance_No;
		public void CreateSuppAdvanace() throws Throwable {
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			getSuppAdvlink();
			Frames.rightFrame();
			getCreateSuppAdvButton();
			appInd.singleDropDown(getAdvCompanyDD(), sheetAdv.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			getAdvprojectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getAdvprojectDD(), getAdvEnterProjDD(), sheetAdv.getRow(1).getCell(1).getStringCellValue(), getAdvListofProj());
			Thread.sleep(1000);
			getAdvSubprojectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getAdvSubprojectDD(), getAdvEnterSubProjDD(), sheetAdv.getRow(1).getCell(3).getStringCellValue(), getAdvListofSubProj());
			Thread.sleep(1000);
			String parentPOSelect=appInd.switchToChildWindow(SelectPOlink);
			getPO_NumDD().click();
			Thread.sleep(1000);
			//	PO/11Jul2023/A.G.E/149
			//PurchaseOrder_No
			appInd.createMultiDD_withText(getPO_NumDD(), getEnterAdvPO(), PurchaseOrder_No, getEnterAdvListOfPO());
			Thread.sleep(1000);
			getSearchAdvPO();
			getAdvPORadio();
			Thread.sleep(2000);
			getAdvPOAcceptSelected();
			appInd.switchToParentWindow(parentPOSelect);
			Frames.rightFrame();
			getAdvInvoiceNo().sendKeys("ADVIN"+appInd.RandomNumbers(4));
			getAdvInvoiceAmt().sendKeys(sheetAdv.getRow(1).getCell(5).getStringCellValue());;
			appInd.seletDate(getAdvInvoiceDate(), appInd.getDateAsSpecified(0));
			getAdvTaxImpact();
			getAdvPOQty().clear();
			appInd.isAlertPresent();
			Thread.sleep(2000);
			getAdvPOQty().sendKeys(sheetAdv.getRow(1).getCell(6).getStringCellValue());
			String parentRateTax=appInd.switchToChildWindow(Adv_AddRateTax);
			getAdv_Rate().clear();
			appInd.isAlertPresent();
			getAdv_Rate().sendKeys(sheetAdv.getRow(1).getCell(7).getStringCellValue());
			getAdvCalRate();
			getAdvSaveRate();
			appInd.switchToParentWindow(parentRateTax);
			Frames.rightFrame();
			appInd.singleDropDown(getAdvModeofPay(), sheetAdv.getRow(1).getCell(9).getStringCellValue());
			getAdvFavouring().sendKeys(sheetAdv.getRow(1).getCell(10).getStringCellValue());
			getAdvPayDueDate().sendKeys(appInd.getBackDatedDate(-30));
			getAdvRemarks().sendKeys("Supplier Advance Created Through Automation");
			getAdvDedTax();
			appInd.singleDropDown(getAdvDedTaxCategory(), sheetAdv.getRow(1).getCell(11).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getAdvDedTaxPer(), sheetAdv.getRow(1).getCell(12).getStringCellValue());
			Thread.sleep(2000);
			//getAdvDedTaxableAmt().sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
			getAdvDedTax2();
			appInd.singleDropDown(getAdvDedTaxCategory2(),sheetAdv.getRow(1).getCell(13).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getAdvDedTaxPer2(),sheetAdv.getRow(1).getCell(14).getStringCellValue());
			//getAdvDedTaxableAmt2().sendKeys(sheet.getRow(0).getCell(14).getStringCellValue());
			Thread.sleep(2000);
			getAdvCreate();
			Thread.sleep(2000);
			Supplier_Advance_No=getAdvnumber();
			if(appInd.AlertPresent())
			{
				Datatable.writeExcel("Supplier Advance", "Supplier is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				
			}else {
				Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is  Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("Supplier Advance Number(Created) ----------"+Supplier_Advance_No);
			}
		}catch (Exception e) {			Datatable.writeExcel("Supplier Advance", "Supplier is Not Created-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
			}
			getAdvChangestatus();
			getAdvStatusDD().sendKeys("Approved");
			getAdvUpdateStatus();
			getAdvChangestatus();
			getAdvStatusDD().sendKeys("Processed");
			appInd.seletDate(getAdvExpectedDate(), appInd.getDateAsSpecified(-30));
			Thread.sleep(2000);
			appInd.seletDate(getAdvprocessDate(), appInd.getDateAsSpecified(0));
			Thread.sleep(2000);
			getAdvUpdateStatus();
			Thread.sleep(1000);
			AdvPayment(); //Supplier Payment Process From Finance Module
			}

		public void AdvPayment() throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickFinance();
				Thread.sleep(2000);
				Finance en=new Finance(iDriver);
				//en.clickFinApprovals();
				//Thread.sleep(2000);
				xml = new Datatable();
				sheetAdv = xml.excelData(sheetnameAdv, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
			Frames.SubMenuFrame();
			getFinPurApprovals();
			Frames.tabFrame();
			getFinPurAdv();
			try {
			Frames.innerFrame();
			WebElement searchcompny=PurPaymentFlow.getFinCertCompany();
			searchcompny.sendKeys(sheetAdv.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			searchcompny.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			searchcompny.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		//	getFinPurAdvstatusDD().clear();
		
			getFinAdvNo().sendKeys(Supplier_Advance_No);
			Thread.sleep(2000);
			getFinAdvGo();
			Thread.sleep(100);
			getAdvNo();
			Frames.innerFrame();
			String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
			Thread.sleep(1000);
			appInd.singleDropDown(getBankAccountDD(),sheetAdv.getRow(1).getCell(15).getStringCellValue());
			Thread.sleep(1000);
			appInd.isAlertPresent();
			Thread.sleep(1000);
			getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
			Thread.sleep(1000);
			getPaymentSubmit();
			if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
				}
			Thread.sleep(2000);
			appInd.switchToParentWindow(Parent_Payment);
			Frames.innerFrame();
			Thread.sleep(3000);
		//	String AdvancePaymentStatus=getpaymentstatus();
			if(getpaymentstatus().equals("Paid")) {
				Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
			}else {
				Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is Not Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
			}
			}catch (Exception e) {
				Datatable.writeExcel(Supplier_Advance_No, "Supplier Advance is Not Paid-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("Advance is Not Paid-Exception---------"+e);
				System.out.println("PAYMENT STATUS ---"+Supplier_Advance_No+" "+ getpaymentstatus());
		}
		}
		
		public void MenuSubMenuSuppDN() throws Throwable{
			try {
			MainMenu mm=new MainMenu(iDriver);
			mm.clickPurchase();
			Purchase en=new Purchase(iDriver);
			en.clickPayments();
			 xml=new Datatable();
			 sheetSuppDN=xml.excelData(sheetnameSuppDN,Purchase.InputCreatePath);
		}
		catch (Exception e)
	 	{
		e.printStackTrace();
		System.out.println("Module, Sub module click case Failed: "+e);
	 	}
		}
		String SuppDNID;
		public void SuppDebitNoteCreation() throws Throwable{
					try {	
					Frames.SubMenuFrame();
					Thread.sleep(1000);
					getSuppDNlink();
					Frames.rightFrame();
					Thread.sleep(1000);
					getSuppDNCreate();
					appInd.singleDropDown(getSuppDNCertComp(), sheetSuppDN.getRow(i).getCell(0).getStringCellValue());
					Thread.sleep(1000);
					getSuppDNProject().click();
					Thread.sleep(1000);
					appInd.createMultiDD_withText(getSuppDNProject(), getSuppDNEnterProject(), sheetSuppDN.getRow(i).getCell(1).getStringCellValue(), getSuppDNListOfProject());
					//appInd.singleDropDown(getSuppDNPayingComp(), sheet.getRow(i).getCell(2).getStringCellValue());
					
					
					getSuppDNSubProject().click();
					Thread.sleep(2000);
					appInd.createMultiDD_withText(getSuppDNSubProject(), getSuppDNEnterSubProject(), sheetSuppDN.getRow(i).getCell(3).getStringCellValue(), getSuppDNListOfSubProject());
					
					String ParentSelectPO=appInd.switchToChildWindow(SelectPOlink);
					getPO_NumDD().click();
					Thread.sleep(1000);
					//PurchaseOrder_No
					//PO/11Jul2023/A.G.E/149
					appInd.createMultiDD_withText(getPO_NumDD(), getEnterSuppDNEnterPO(),PurchaseOrder_No, getSuppDNListOfPO());
					getSearchAdvPO();
					getSuppDNPO_Radio();
					getSuppDN_PO_selected();
					appInd.switchToParentWindow(ParentSelectPO);
					Frames.rightFrame();
					Thread.sleep(1000);
					getSuppDNInvNo().sendKeys("INVNo"+appInd.RandomNoAsSpecified(3));
					appInd.singleDropDown(getSuppDNReasonTypeDD(), sheetSuppDN.getRow(i).getCell(5).getStringCellValue());
					Thread.sleep(1000);
					//getSuppDNAmount().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
					appInd.seletDate(getSuppDNDate(), appInd.getDateAsSpecified(0));
					Thread.sleep(1000);
					getSuppDNTaxImpact();
					Thread.sleep(1000);
					getSuppDNPOQty().clear();
					Thread.sleep(1000);
					getSuppDNPOQty().sendKeys(sheetSuppDN.getRow(i).getCell(7).getStringCellValue());
					String ParentAddRateTax=appInd.switchToChildWindow(SuppDNAddRateNTax);
					getSuppDN_rateperUOM().clear();
					if(appInd.AlertPresent()) {
					appInd.isAlertPresent();
					}
					getSuppDN_rateperUOM().sendKeys(sheetSuppDN.getRow(i).getCell(8).getStringCellValue());
					getSuppDNCaluRate();
					getSuppDNsaveRate();
					appInd.switchToParentWindow(ParentAddRateTax);
					Frames.rightFrame();
					getSuppDNremarks().sendKeys("Supplier Debit Note Created Through Automation");
					Thread.sleep(2000);
					getSuppDNcreateButton();
					Thread.sleep(2000);
					appInd.isAlertPresent();
					Thread.sleep(2000);
					 SuppDNID=getSuppDN_ID();
					if(appInd.AlertPresent()) {
						Datatable.writeExcel("Supplier Debit Note", "Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
					}else {
						Datatable.writeExcel(SuppDNID, "Supplier Debit Note Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
						System.out.println("Supplie DN "+SuppDNID+"  Created");
					}
					}catch (Exception e) {
						Datatable.writeExcel("Supplier Debit Note", "Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
						System.out.println("SUPPDNEXCEPTION----"+e);
							}
				
				Thread.sleep(2000);
				getSuppDNChangeStatus();
				Thread.sleep(1000);
				getSuppDNStatusDD().sendKeys("Approved");
				Thread.sleep(1000);
				getSuppDNUpdateStatus();
				Thread.sleep(1000);
				getSuppDNChangeStatus();
				Thread.sleep(1000);
				getSuppDNStatusDD().sendKeys("Processed");Thread.sleep(1000);
				appInd.seletDate(getSuppDNprocessDate(), appInd.getDateAsSpecified(0));
				getSuppDNUpdateStatus();
				Thread.sleep(1000);
				
				}
		public void MenuSubMenuSupPayment()throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickPurchase();
				Thread.sleep(2000);
				Purchase en=new Purchase(iDriver);
				en.clickPayments();
				Thread.sleep(2000);
				xml = new Datatable();
				sheetPayment = xml.excelData(sheetnamePayment, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
		}

		String SupperCertNo;
		public void SupplierPaymentCreation() throws Throwable{
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
				MenuSubMenuSupPayment();
			getSuppCertLink();
			Frames.rightFrame();
			getCreateSuppCertButton();
			appInd.singleDropDown(getSuppCertCompDD(), sheetPayment.getRow(1).getCell(0).getStringCellValue());
			getSuppCertProjectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getSuppCertProjectDD(), getSuppCertEnterProject(), sheetPayment.getRow(1).getCell(1).getStringCellValue(), getSuppCertProjectList());	
			
		//	appInd.singleDropDown(getSuppPayCompDD(), sheet.getRow(i).getCell(2).getStringCellValue());
			getSuppCertSubProjectDD().click();
			Thread.sleep(1000);
			appInd.createMultiDD_withText(getSuppCertSubProjectDD(), getSuppCertEnterSubProject(), sheetPayment.getRow(1).getCell(3).getStringCellValue(), getSuppCertSubProjectList());
			appInd.singleDropDown(getSuppCertSupplierDD(), sheetPayment.getRow(1).getCell(4).getStringCellValue());
			appInd.singleDropDown(getSuppCertPOTypeDD(), sheetPayment.getRow(1).getCell(5).getStringCellValue());
			String ParentSelectPO=appInd.switchToChildWindow(SuppCertSelecttPOLink);
			getSuppCertPODD().click();
			Thread.sleep(1000);//sheetPayment.getRow(1).getCell(6).getStringCellValue()
			//PurchaseOrder_No,
			appInd.createMultiDD_withText(getSuppCertPODD(), getSuppCertEnterPO(),PurchaseOrder_No, getSuppCertPOList());
			Thread.sleep(2000);
			getSuppCertSearchPO();
			Thread.sleep(1000);
			getSuppCertSelcetPOcheck();
			Thread.sleep(1000);
			getSuppCertPOAcceptSelected();
			Thread.sleep(1000);
			appInd.switchToParentWindow(ParentSelectPO);
			Thread.sleep(3000);
			Frames.rightFrame();
			getSuppCertInvoiceNO().sendKeys("INNO"+appInd.RandomNumbers(4));
			appInd.singleDropDown(getSuppCertE_Invoice(),sheetPayment.getRow(1).getCell(7).getStringCellValue());
			appInd.seletDate(getSuppCertInvoiceDate(), appInd.getDateAsSpecified(0));
			try {
			Thread.sleep(3000);
			getSuppCertInvoiceAmt().sendKeys(sheetPayment.getRow(1).getCell(25).getStringCellValue());
			Thread.sleep(3000);
			appInd.clickOutside();
			Thread.sleep(2000);
			}catch (Exception e) {
				System.out.println("Invoice Amount Exception-----"+e);			
				}
			
			appInd.singleDropDown(getSuppCertTypeDD(), sheetPayment.getRow(1).getCell(8).getStringCellValue());
			Thread.sleep(2000);
			String ParentSelectGRN=appInd.switchToChildWindow(SuppCertSelcetGRNLink);
			getSuppCertSelcetGRNCheck();
			String GRNAMOUNT=getSuppCertGRNAMOUNT();
			getSuppCertAddGRN_NextButton();
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor) iDriver;  
			try {
				jsExecutor.executeScript("document.getElementByXpath('//table[@class='in4-table']//tr[2]//td[8]//input[@type='text']').value='2'");
			}catch(Exception e) {
				jsExecutor.executeScript("arguments[0].value='2'", getSuppCertGRNQty());  
			}
			Thread.sleep(2000);
			getSuppCertAddGRN_AcceptSelcet();
			appInd.isAlertPresent();		
			appInd.switchToParentWindow(ParentSelectGRN);
			Frames.rightFrame();
//	Advance Recovery
			try {
			int AdvanceCount=0;
			System.out.println("Total Supplier Advances Listing ---"+AdvanceCount);
			for(int j=0; j<=getOutstandingAdvancesCount().size(); j++) {
				AdvanceCount++;
				//Supplier_Advance_No
				if(getOutstandingAdvancesCount().get(j).getText().equals(Supplier_Advance_No))
				{
					Thread.sleep(2000);
					AdvanceCount = AdvanceCount + 1;
					Thread.sleep(3000);
					iDriver.findElement(By.xpath("//table[@id='gvAdvanceAdjustment']//tr["+AdvanceCount+"]//td[9]//input[@type='text']")).sendKeys(sheetPayment.getRow(1).getCell(26).getStringCellValue());
					Thread.sleep(3000);
					break;		
				}
			}
			}catch (Exception e) {
				System.out.println("Supplier Advance Recoverey Exception"+e);
			}
		
			Thread.sleep(3000);
	//Debit Note Recovery
			try {
			int DebitNoteCount=0;
			System.out.println("Total Supplier Debit Notes Listing ---"+getDebitNoteCount().size());
			for(int j=0; j<=getDebitNoteCount().size(); j++) {
				DebitNoteCount++;
				//SuppDNID

				if(getDebitNoteCount().get(j).getText().equals(SuppDNID))
				{
					Thread.sleep(2000);
					DebitNoteCount = DebitNoteCount + 1;
					Thread.sleep(3000);
					////table[@id='gvDebitNote']//tr[14]//td[11]//input[@class='input']
					iDriver.findElement(By.xpath("//table[@id='gvDebitNote']//tr["+DebitNoteCount+"]//td[11]//input[@class='input']")).clear();
					Thread.sleep(5000);
					iDriver.findElement(By.xpath("//table[@id='gvDebitNote']//tr["+DebitNoteCount+"]//td[11]//input[@class='input']")).sendKeys(sheetPayment.getRow(1).getCell(27).getStringCellValue());
					Thread.sleep(5000);
					appInd.clickOutside();
					Thread.sleep(1000);
					break;		
				}
			}
			}catch (Exception e) {
				System.out.println("Supplier Debit Note Recoverey Exception"+e);
			}
			Thread.sleep(10000);
			// Deduction Taxes are not adding in the Supplier Payment since we are recovering the Advance and Taxes (Taxes are Auto caluclating)
//			getSuppCertAddRowDed();
//			Thread.sleep(2000);
//			appInd.singleDropDown(getSuppCertDedTaxCat1(),sheetPayment.getRow(1).getCell(10).getStringCellValue());
//			Thread.sleep(1000);
//			appInd.singleDropDown(getSuppCertDedTaxCatPer1(),sheetPayment.getRow(1).getCell(11).getStringCellValue());
//			Thread.sleep(1000);
//			getSuppCertAddRowDed();
//			Thread.sleep(2000);
//			appInd.singleDropDown(getSuppCertDedTaxCat2(),sheetPayment.getRow(1).getCell(12).getStringCellValue());
//			Thread.sleep(1000);
//			appInd.singleDropDown(getSuppCertDedTaxCatPer2(),sheetPayment.getRow(1).getCell(13).getStringCellValue());
			getSuppCertOtherDed().sendKeys(sheetPayment.getRow(1).getCell(14).getStringCellValue());
			getSuppCertOtherDedRemarksclick();
			Thread.sleep(1000);
			getSuppCertOtherDedRemarks().sendKeys("Other Deductions for Delay");
			getSuppCertOtherAddTax().sendKeys(sheetPayment.getRow(1).getCell(15).getStringCellValue());
			getSuppCertOtherAddTaxRemarksclick();
			Thread.sleep(1000);
			getSuppCertOtherAddTaxRemarks().sendKeys("Other Addition Tax");
			getSuppCertRetentionPer().sendKeys(sheetPayment.getRow(1).getCell(16).getStringCellValue());
			appInd.singleDropDown(getSuppCertPayModeDD(),sheetPayment.getRow(1).getCell(17).getStringCellValue());
			appInd.seletDate(getSuppCertPayDueDate(), appInd.getDateAsSpecified(-30));
			getSuppCertRemarks().sendKeys("Supplier Certificate Created Through Automation");
			Thread.sleep(3000);
			getSuppCertCreate();
			Thread.sleep(30000);
		 SupperCertNo=getsuppcetNo();
			if (appInd.AlertPresent()) {
				Datatable.writeExcel("Supplier Certificate ",  " is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
			} else {
				
				Datatable.writeExcel("Certificate No. "+SupperCertNo,  "Supplier Certificate is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("Supplier Certificate Created--- "+SupperCertNo);
			}
			}catch (Exception e) {
				Datatable.writeExcel("Supplier Certificate ",  " Not Created-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
			}
			
			//Approved
			getSuppCertChangeStatus();
			Thread.sleep(2000);
			getSuppCertChangeStatusDD().sendKeys("Approved");
			Thread.sleep(2000);
			getSuppCertUpdateStatus();
			Thread.sleep(2000);
			getSuppCertChangeStatus();
			Thread.sleep(2000);
			getSuppCertChangeStatusDD().sendKeys("Processed");
			Thread.sleep(2000);
			getSuppCertUpdateStatus();
			Thread.sleep(3000);
			SupplierPayment(); //Supplier Payment Process From Finance Module
		}
			
			public void SupplierPayment() throws Throwable{
			try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickFinance();
				Thread.sleep(2000);
				Finance en=new Finance(iDriver);
				//en.clickFinApprovals();
				//Thread.sleep(2000);
				xml = new Datatable();
				sheetPayment = xml.excelData(sheetnamePayment, Purchase.InputCreatePath);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: " + e);
			}
			Frames.SubMenuFrame();
			getFinPurApprovals();
			Frames.tabFrame();
			getFinPurSuppCertv();
			try {
			Frames.innerFrame();
			WebElement searchcompny=PurPaymentFlow.getFinCertCompany();
			searchcompny.sendKeys(sheetPayment.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			searchcompny.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			searchcompny.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		//	getFinPurAdvstatusDD().clear();
		
			getFinCertNo().sendKeys(SupperCertNo);
			Thread.sleep(1000);
			getFinPurSuppCertGo();
			Thread.sleep(100);
			getSuppPayFinCertNoclick();
			Frames.innerFrame();
			String Parent_Payment=appInd.switchToChildWindow(PaymentLink);
			Thread.sleep(1000);
			appInd.singleDropDown(getBankAccountDD(),sheetPayment.getRow(1).getCell(24).getStringCellValue());
			Thread.sleep(1000);
			appInd.isAlertPresent();
			Thread.sleep(1000);
			getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
			Thread.sleep(1000);
			getPaymentSubmit();
			if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
				}
			Thread.sleep(2000);
			appInd.switchToParentWindow(Parent_Payment);
			Frames.innerFrame();
			Thread.sleep(3000);
		//	String AdvancePaymentStatus=getpaymentstatus();
			if(getSupppaymentstatus().equals("Paid")) {
				Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
			}else {
				Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Not Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
			}
			}catch (Exception e) {
				Datatable.writeExcel("Certificate No. "+SupperCertNo, "Suppier Payment is Not Paid-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("PAYMENT STATUS ---"+SupperCertNo+" "+ getSupppaymentstatus());
			}
		}
			public void MenuSubMenuSuppDNReceipt() throws Throwable {
				try {
					MainMenu mm=new MainMenu(oBrowser);
					mm.clickPurchase();
					Purchase en=new Purchase(oBrowser);
					en.clickPayments();
					Thread.sleep(1000);
					xml=new Datatable();
					sheetSuppDNReceipt=xml.excelData(sheetnameSuppDNReceipt, Purchase.InputCreatePath);
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println("Module, Sub module click case Failed: "+e);
				 	}
			
				}
	
			String SuppDebitNoteReceiptID;
			public void SupplierDebitNoteReceiptCreation() throws Throwable{
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
						try {	
				Frames.SubMenuFrame();
				getSuppDNRecptLink();
				Frames.rightFrame();
				getCreateSuppDNRecpt();
				appInd.singleDropDown(getSuppDNRecptComp(), sheetSuppDNReceipt.getRow(i).getCell(0).getStringCellValue());
				Thread.sleep(2000);
				appInd.singleDropDown(getSuppDNRecptProj(), sheetSuppDNReceipt.getRow(i).getCell(1).getStringCellValue());
				Thread.sleep(2000);
				appInd.singleDropDown(getSuppDNRecptSubProj(), sheetSuppDNReceipt.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(2000);
				appInd.singleDropDown(getSuppDNRecptSupplier(), sheetSuppDNReceipt.getRow(i).getCell(3).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getSuppDNReceiptCurrency(), sheetSuppDNReceipt.getRow(i).getCell(4).getStringCellValue());
				Thread.sleep(1000);
				appInd.seletDate(getSuppDNReceiptDate(), appInd.getDateAsSpecified(0));
				Thread.sleep(1000);
				getSuppDNReceiptAmount().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(5).getStringCellValue());
				getSuppDNReceiptPaymentMode().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(6).getStringCellValue());
				Thread.sleep(3000);
				String ParentAddDN=appInd.switchToChildWindow(SuppDNReceiptAddDebitNote);
				//PO/12Jul2023/A.G.E/173
				//420
				//sheetSuppDNReceipt.getRow(i).getCell(7).getStringCellValue()
				//sheetSuppDNReceipt.getRow(i).getCell(8).getStringCellValue()
				getSuppDNReceiptEnterPurchaseOrder().sendKeys(PurchaseOrder_No);
				getSuppDNReceiptEnterDebitNoteNo().sendKeys(SuppDNID);
				getSuppDNReceiptSearchGO();
				getSuppDNReceiptSelectDN();
				getSuppDNReceiptAcceptSelected();
				appInd.switchToParentWindow(ParentAddDN);
				Frames.rightFrame();
				getSuppDNReceiptBankList().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(9).getStringCellValue());
				getSuppDNReceiptBranchName().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(10).getStringCellValue());
				getSuppDNReceiptPayableAt().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(11).getStringCellValue());
				getSuppDNReceiptAccountNumber().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(12).getStringCellValue());
				appInd.seletDate(getSuppDNReceiptInstrumentDate(), appInd.getDateAsSpecified(0));
				getSuppDNReceiptInstrumentNumber().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(13).getStringCellValue());
				getSuppDNReceiptInstrumentAmount().sendKeys(sheetSuppDNReceipt.getRow(i).getCell(14).getStringCellValue());
				getSuppDNReceiptIsSameBranch();
				Thread.sleep(1500);
				getSuppDNReceiptFillAmount();
				Thread.sleep(1000);
				getSuppDNReceiptRemarks().sendKeys("Supplier Debit Note Receipt is Cretaed Through Automation");
				Thread.sleep(1000);
				getSuppDNReceiptCreate();
				SuppDebitNoteReceiptID=getSuppDNReceiptID();
				Thread.sleep(5000);
				if(appInd.AlertPresent()) {
					Datatable.writeExcel("SuppDebit Note Receipt ",  "is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("  SuppDebit Note Receipt is NOT Created");
				}else {
					Datatable.writeExcel(SuppDebitNoteReceiptID, "SuppDebit Note Receipt is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println(SuppDebitNoteReceiptID+"  SuppDebit Note Receipt is Created");
				}
						} catch (Exception e) {
						Datatable.writeExcel("SuppDebit Note Receipt",  "is Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
						System.out.println(" SuppDebit Note Receipt is NOT Created - Exception");
						}
						
						try {
							getSuppDNReceiptChangeStatus();
							getSuppDNReceiptStatusDD().sendKeys("Submitted");
							getStatusRemarks().sendKeys("Submitting SuppDebit Note Receipt Through Automation");
							getSuppDNReceiptUpdateStatus();
							Thread.sleep(1000);
							getSuppDNReceiptChangeStatus();
							getSuppDNReceiptStatusDD().sendKeys("Approved");
							getStatusRemarks().sendKeys("Approving SuppDebit Note Receipt Through Automation");
							getSuppDNReceiptUpdateStatus();
							Thread.sleep(1000);
							getSuppDNReceiptChangeStatus();
							getSuppDNReceiptStatusDD().sendKeys("Processed");
							getStatusRemarks().sendKeys("Processing SuppDebit Note Receipt Through Automation");
							getSuppDNReceiptUpdateStatus();
							Thread.sleep(1000);
							getSuppDNReceiptChangeStatus();
							getSuppDNReceiptStatusDD().sendKeys("Received");
							appInd.seletDate(getReceivedDate(), appInd.getDateAsSpecified(0));
							Thread.sleep(1000);
							appInd.singleDropDown(getBankHeaderAccount(), sheetSuppDNReceipt.getRow(i).getCell(15).getStringCellValue());
							getStatusRemarks().sendKeys("Received SuppDebit Note Receipt Through Automation");
							getSuppDNReceiptUpdateStatus();
							Thread.sleep(1000);
							getSuppDNReceiptChangeStatus();
							getSuppDNReceiptStatusDD().sendKeys("Realized");
							appInd.seletDate(getRealizedDate(), appInd.getDateAsSpecified(0));	
							getStatusRemarks().sendKeys("Realized SuppDebit Note Receipt Through Automation");
							getSuppDNReceiptUpdateStatus();
							Thread.sleep(1000);	
						}catch (Exception e) {
								System.out.println("SuppDebit Note Receipt Status Changing Exception"+e);
							}
			}
			
			public void MenuSubMenuServiceAdvance()throws Throwable{
				try {
					MainMenu mm=new MainMenu(iDriver);
					mm.clickPurchase();
					Thread.sleep(2000);
					Purchase en=new Purchase(iDriver);
					en.clickPayments();
					Thread.sleep(2000);
					xml = new Datatable();
					sheetServAdv = xml.excelData(sheetnameServAdv, Purchase.InputCreatePath);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Module, Sub module click case Failed: " + e);
				}
			}
			String Service_Advance_No;
			public void ServiceAdvanceCreation() throws Throwable{
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				try {
					getServAdvlink();
					Frames.rightFrame();
					getCreateServAdvbutton();
					appInd.singleDropDown(getServAdvCompDD() ,(sheetServAdv.getRow(1).getCell(0).getStringCellValue()));
					Thread.sleep(1000);
					getServAdvProjDD().click();
					Thread.sleep(1000);
					appInd.createMultiDD_withText(getServAdvProjDD(), getServAdvEnterProj(), sheetServAdv.getRow(1).getCell(1).getStringCellValue(), getServAdvEnterListofProj());
					String PatentPO=appInd.switchToChildWindow(ServAdvSelectPOLink);
					getServAdvPODD().click();
					Thread.sleep(1000);
					//PurchaseOrder_No
					appInd.createMultiDD_withText(getServAdvPODD(), getServAdvEnterPO(), PurchaseOrder_No, getServAdvListofPO());
					getServAdvSearchPO();
					getServAdvSelectPORadio();
					getServAdvAcceptSelectdPO();
					appInd.switchToParentWindow(PatentPO);
					Frames.rightFrame();
					String PatentServProvider=appInd.switchToChildWindow(ServAdvSelectServProviderLink);
					getServAdvEnterSerProvider().sendKeys(sheetServAdv.getRow(1).getCell(4).getStringCellValue());
					getServAdvSerProviderGo();
					getServAdvSelectSerProvider();
					appInd.switchToParentWindow(PatentServProvider);
					Frames.rightFrame();
					Thread.sleep(1000);
					getServAdvInvNo().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
					getServAdvInvAmount().sendKeys(sheetServAdv.getRow(1).getCell(5).getStringCellValue());
					appInd.seletDate(getServAdvInvDate(), appInd.getDateAsSpecified(0));
					getServAdvCertAmt().sendKeys(sheetServAdv.getRow(1).getCell(6).getStringCellValue());
					appInd.singleDropDown(getServAdvPayMode(), sheetServAdv.getRow(1).getCell(7).getStringCellValue());
					Thread.sleep(1000);
					appInd.seletDate(getServAdvPayDueDate(), appInd.getDateAsSpecified(-30));
					Thread.sleep(1000);
				
					getServAdvTaxAddRow();
					Thread.sleep(1000);
					appInd.singleDropDown(getServAdvAddTaxCat(), sheetServAdv.getRow(1).getCell(9).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServAdvAddTaxPer(), sheetServAdv.getRow(1).getCell(10).getStringCellValue());	
					Thread.sleep(1000);
					getServAdvTaxAddRow();
					Thread.sleep(2000);
					appInd.singleDropDown(getServAdvAddTaxCat2(), sheetServAdv.getRow(2).getCell(9).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServAdvAddTaxPer2(), sheetServAdv.getRow(2).getCell(10).getStringCellValue());
					Thread.sleep(1000);
					
					getServAdvTaxDedRow();
					Thread.sleep(1000);
					appInd.singleDropDown(getServAdvDedTaxCat(), sheetServAdv.getRow(1).getCell(11).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServAdvDedTaxPer(), sheetServAdv.getRow(1).getCell(12).getStringCellValue());
					Thread.sleep(1000);
					
					getServAdvCreateRemarks().sendKeys("Service Provider Certificate Created Through Automation");
					Thread.sleep(2000);
					getCreateServAdvbutton();
					Thread.sleep(1000);
					Service_Advance_No=getServAdvNumber();
					if(appInd.AlertPresent())
					{
						Datatable.writeExcel("Service Advance", "is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
						
					}else {
						Datatable.writeExcel(Service_Advance_No, "Service Advance is  Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
						System.out.println(Service_Advance_No+">>> Service Advance Created");
						}
					}catch (Exception e) {
						Datatable.writeExcel("Service Advance", "is Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
						}
				getServAdvChangeStatus();
				Thread.sleep(1000);
				getServAdvStatusDD().sendKeys("Approved");
				Thread.sleep(1000);
				getServAdvUpdateStatus();
				Thread.sleep(1000);
				getServAdvChangeStatus();
				Thread.sleep(1000);
				getServAdvStatusDD().sendKeys("Processed");
				Thread.sleep(1000);
				appInd.seletDate(getProcessedDt(), appInd.getDateAsSpecified(0));
				Thread.sleep(1000);
				getServAdvUpdateStatus();
				if(appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}else{	
					Thread.sleep(1000);
				}
				ServiceAdvancePayment();
			}
			
			public void ServiceAdvancePayment() throws Throwable{
				try {
					MainMenu mm=new MainMenu(iDriver);
					mm.clickFinance();
					Thread.sleep(2000);
					Finance en=new Finance(iDriver);
					//en.clickFinApprovals();
					//Thread.sleep(2000);
					xml = new Datatable();
					sheetServAdv = xml.excelData(sheetnameServAdv, Purchase.InputCreatePath);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Module, Sub module click case Failed: " + e);
				}
				Frames.SubMenuFrame();
				getFinPurApprovals();
				Frames.tabFrame();
				getFinPurServAdv();
				Thread.sleep(1000);
				Frames.innerFrame();
				WebElement searchcompny=PurPaymentFlow.getFinCertCompany();
				Thread.sleep(2000);
				searchcompny.sendKeys(sheetServAdv.getRow(1).getCell(0).getStringCellValue());
				Thread.sleep(1000);
				searchcompny.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(1000);
				searchcompny.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				getEnterFinServAdvNo().sendKeys(Service_Advance_No);
				Thread.sleep(1000);
				getFinAdvNoGo();
				Thread.sleep(1000);
				getFinAdvNoclick();
				try {
				Frames.innerFrame();
				String Parent_Payment=appInd.switchToChildWindow(SerAdvPaymentLink);
				Thread.sleep(2000);
				appInd.singleDropDown(getBankAccountDD(),sheetServAdv.getRow(1).getCell(8).getStringCellValue());
				//appInd.singleDropDown(getBankAccountDD(),sheet.getRow(i).getCell(8).getStringCellValue());
				Thread.sleep(1000);
				appInd.isAlertPresent();
				Thread.sleep(1000);
				getFinFavouringName().sendKeys("Automation Payee");
				getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
				Thread.sleep(1000);
				if(appInd.AlertPresent()) {
					appInd.isAlertPresent();
					}
				getPaymentSubmit();
				Thread.sleep(2000);
				appInd.switchToParentWindow(Parent_Payment);
				Frames.innerFrame();
				Thread.sleep(3000);
				System.out.println("STATUS----"+getpaymentstatus());
				if(getpaymentstatus().equals("Paid")) {
					Datatable.writeExcel(Service_Advance_No, "Service Advance is Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("PAYMENT STATUS ---"+Service_Advance_No+" "+ getpaymentstatus());
				}else {
					Datatable.writeExcel(Service_Advance_No, "Service Advance is Not Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("PAYMENT STATUS ---"+Service_Advance_No+" "+ getpaymentstatus());
				}
				}catch (Exception e) {
					Datatable.writeExcel(Service_Advance_No, "Service Advance is Not Paid-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("Advance is Not Paid-Exception---------"+e);
					System.out.println("PAYMENT STATUS ---"+Service_Advance_No+" "+ getpaymentstatus());
				}
			}
			
			public void MenuSubMenuServDN() throws Throwable{
				try {
				MainMenu mm=new MainMenu(iDriver);
				mm.clickPurchase();
				Purchase en=new Purchase(iDriver);
				en.clickPayments();
				xml=new Datatable();
				sheetServDN=xml.excelData(sheetnameServDN, Purchase.InputCreatePath);
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: "+e);
				}
			}
			String ServDebitNoteID;
			public void ServDNCreation() throws Throwable{
				try {
					Frames.SubMenuFrame();
					getServDNLink();
					Frames.rightFrame();
					getCreateServDebitNote();
					getServDNCertComp().sendKeys(sheetServDN.getRow(i).getCell(0).getStringCellValue());
//					getServDNPayingComp().sendKeys(sheetServDN.getRow(i).getCell(2).getStringCellValue());
					getServDNProject().click();
					Thread.sleep(2000);
					appInd.createMultiDD_withText(getServDNProject(),getServDNEnterProject(), sheetServDN.getRow(i).getCell(1).getStringCellValue(), getServDNListOfProject());
					String ParentSelectPO=appInd.switchToChildWindow(SelectPOlink);
					getPO_NumDD().click();
					Thread.sleep(1500);
					appInd.createMultiDD_withText(getPO_NumDD(),getEnterSuppDNEnterPO(), PurchaseOrder_No, getSuppDNListOfPO());
					getSearchSuppDNPO();
					getServDNPO_Radio();
					getServDN_PO_selected();
					appInd.switchToParentWindow(ParentSelectPO);
					Frames.rightFrame();
					String ParentSelectServProvider=appInd.switchToChildWindow(ServDN_SelectServProvider);
					getServDN_EnterServProviderName().sendKeys(sheetServDN.getRow(i).getCell(4).getStringCellValue());
					getServDN_ServProviderGOButton();
					getclickServiceProvider();
					appInd.switchToParentWindow(ParentSelectServProvider);
					Frames.rightFrame();
					getServDN_InvNo().sendKeys("InvNo"+appInd.RandomNoAsSpecified(3));
					appInd.singleDropDown(getServDN_ReasonTypeDD(), sheetServDN.getRow(i).getCell(5).getStringCellValue());
					getServDN_Amount().sendKeys(sheetServDN.getRow(i).getCell(6).getStringCellValue());
					appInd.seletDate(getServDN_Date(), appInd.getDateAsSpecified(0));
					getServDN_AddRowLink();
					Thread.sleep(1000);
					getServDN_AddRowLink();
					appInd.singleDropDown(getServDN_TaxCat(), sheetServDN.getRow(i).getCell(7).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServDN_TaxPer(), sheetServDN.getRow(i).getCell(8).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServDN_TaxType(), sheetServDN.getRow(i).getCell(9).getStringCellValue());
					Thread.sleep(2000);
					getServDN_AddRowLink();
					appInd.singleDropDown(getServDN_TaxCat2(), sheetServDN.getRow(i).getCell(10).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServDN_TaxPer2(), sheetServDN.getRow(i).getCell(11).getStringCellValue());
					Thread.sleep(1000);
					appInd.singleDropDown(getServDN_TaxType2(), sheetServDN.getRow(i).getCell(12).getStringCellValue());
					Thread.sleep(2000);
					getServDN_Remarks().sendKeys("Service Debit Note Created Through Automation");
					Thread.sleep(1000);
					getServDN_Create().click();
					Thread.sleep(2000);
					ServDebitNoteID=getServDN_ID();
					Thread.sleep(1000);
					System.out.println("Service Debit Note "+ServDebitNoteID+" is created");
					if(appInd.AlertPresent()) {
						Datatable.writeExcel("Service Debit Note", "Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
					}else {
						Datatable.writeExcel(ServDebitNoteID, " Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
					}
					
				} catch (Exception e) {
					Datatable.writeExcel("Service Debit Note", "Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				}
				
				try {
					getServDN_ChangeStatus();
					Thread.sleep(1500);
					getServDN_StatusDD().sendKeys("Approved");
					Thread.sleep(1500);
					getServDN_UpdateStatus();
					Thread.sleep(1500);
					getServDN_ChangeStatus();
					Thread.sleep(1500);
					getServDN_StatusDD().sendKeys("Processed");
					Thread.sleep(1500);
					appInd.seletDate(getServDN_ProcessDate(), appInd.getDateAsSpecified(0));
					Thread.sleep(1500);
					getServDN_UpdateStatus();
					Thread.sleep(1500);
				}
				catch (Exception e) {
					System.out.println("Service Debit Change Status Exception"+e);		
					}
					
			}
			public void MenuSubMenuServicecertifiacte()throws Throwable{
				try {
					MainMenu mm=new MainMenu(iDriver);
					mm.clickPurchase();
					Thread.sleep(2000);
					Purchase en=new Purchase(iDriver);
					en.clickPayments();
					Thread.sleep(2000);
					xml = new Datatable();
					sheetServCert = xml.excelData(sheetnameServcert, Purchase.InputCreatePath);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Module, Sub module click case Failed: " + e);
				}
			}
			
			String ServiceCertNum ;
			public void Servcertcreation() throws Throwable{
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			try {
				Frames.SubMenuFrame();
				getSerCertificateLink();
				Frames.rightFrame();
				getCreateSerCertificate();
				getServCertCompDD().sendKeys(sheetServCert.getRow(i).getCell(0).getStringCellValue());
				getSerCertProjDD().click();
				Thread.sleep(1000);
				appInd.createMultiDD_withText(getSerCertProjDD(), getSerCertEnterProj(), sheetServCert.getRow(i).getCell(1).getStringCellValue(), getSerCertListOfProj());
				String ParentSelectPO=appInd.switchToChildWindow(ServCertSelectPOLink);
				getServCertPODD().click();
				Thread.sleep(1000);
				
				appInd.createMultiDD_withText(getServCertPODD(), getServCertEnterPO(),PurchaseOrder_No,getServCertListofPO());
				getServCertSearchPO();
				getServCertSelectPORadio();
				getServcertAcceptSelectdPO();
				appInd.switchToParentWindow(ParentSelectPO);
				Frames.rightFrame();
				String ParentSelectServProv=appInd.switchToChildWindow(ServAdvSelectServProviderLink);
				getServCertEnterSerProvider().sendKeys(sheetServCert.getRow(i).getCell(4).getStringCellValue());
				getServCertSerProviderGoo();
				getServCertSelectSerProvider();
				appInd.switchToParentWindow(ParentSelectServProv);
				Frames.rightFrame();
				getServCertInvNo().sendKeys("INNO"+appInd.RandomNoAsSpecified(4));
				getServCertInvAmount().sendKeys(sheetServCert.getRow(i).getCell(5).getStringCellValue());
				appInd.seletDate(getServCertInvDate(), appInd.getDateAsSpecified(0));
				getServCertSelectGRN();
				Thread.sleep(2000);
				getServCertGRNValue().clear();
				Thread.sleep(2000);
				getServCertGRNValue().sendKeys(sheetServCert.getRow(i).getCell(15).getStringCellValue());
				Thread.sleep(2000);
				appInd.clickOutside();
				Thread.sleep(2000);
				
				//Service Advance Recovery
				try {
					int AdvanceCount=0;
				System.out.println("Total Service provider Advances Listing ---"+getOutstandingAdvancesCount().size());
					for(int j=0; j<=getOutstandingAdvancesCount().size(); j++) {
						AdvanceCount++;
						
						//Service_Advance_No
						if(getOutstandingAdvancesCount().get(j).getText().equals(Service_Advance_No))
						{
							Thread.sleep(2000);
							AdvanceCount = AdvanceCount + 1;
						
							Thread.sleep(3000);
							iDriver.findElement(By.xpath("//table[@id='gvAdvanceAdjustment']//tr["+AdvanceCount+"]//td[7]//input[@type='text']")).sendKeys(sheetServCert.getRow(1).getCell(20).getStringCellValue());
							Thread.sleep(3000);
							break;		
						}
					}
					}catch (Exception e) {
						System.out.println("Service Advance Recoverey Exception"+e);
					}
				
				Thread.sleep(2000);
				//Debit Note Recovery
				try {
				int DebitNoteCount=0;
				System.out.println("Total Service provider Debit Note Listed   "+getDebitNoteCount().size());
				
				for(int j=0; j<=getDebitNoteCount().size(); j++) {
					DebitNoteCount++;
					if(getDebitNoteCount().get(j).getText().equals(ServDebitNoteID))
					{
						Thread.sleep(2000);
						DebitNoteCount = DebitNoteCount + 1;
						System.out.println("AdvanceCount(2nd)--"+DebitNoteCount);
						Thread.sleep(2000);
						System.out.println("Total Debit Notes Listed"+DebitNoteCount);
						//table[@id='gvDebitNote']//tr[6]//td[8]//input[@type='text']
						iDriver.findElement(By.xpath("//table[@id='gvDebitNote']//tr["+DebitNoteCount+"]//td[8]//input[@class='input']")).sendKeys(sheetServCert.getRow(1).getCell(21).getStringCellValue());
						Thread.sleep(3000);
						appInd.clickOutside();
						Thread.sleep(3000);
						break;		
					}
				}
				}catch (Exception e) {
					System.out.println("Service Debit Note Recoverey Exception"+e);
				}
			
//				getServCertTaxAddRow();
//				getServCertAddTaxCat().sendKeys(sheetServCert.getRow(i).getCell(6).getStringCellValue());
//				Thread.sleep(1000);
//				getServCertAddTaxPer().sendKeys(sheetServCert.getRow(i).getCell(7).getStringCellValue());
//				Thread.sleep(1000);
//				getServCertAddTaxType().sendKeys(sheetServCert.getRow(i).getCell(8).getStringCellValue());
//				getServServCertTaxAddDiv();
//				Thread.sleep(1000);
//				getServCertAddTAxApplyAll();
//				Thread.sleep(1000);
//				
//				getServCertTaxAddRow();
//				getServCertAddTaxCat2().sendKeys(sheetServCert.getRow(i).getCell(9).getStringCellValue());
//				Thread.sleep(1000);
//				getServCertAddTaxPer2().sendKeys(sheetServCert.getRow(i).getCell(10).getStringCellValue());
//				Thread.sleep(1000);
//				getServCertAddTaxType2().sendKeys(sheetServCert.getRow(i).getCell(11).getStringCellValue());
//				getServServCertTaxAddDiv2();
//				Thread.sleep(1000);
//				getServCertAddTAxApplyAll2();
//				Thread.sleep(1000);
//				
//				getServCertDedTaxAddRow();
//				getServCertDedTaxCat().sendKeys(sheetServCert.getRow(i).getCell(12).getStringCellValue());
//				Thread.sleep(2000);
//				getServCertDedTaxper().sendKeys(sheetServCert.getRow(i).getCell(13).getStringCellValue());
//				Thread.sleep(1000);
//				getServCertDedTaxDiv();
//				Thread.sleep(2000);
//				getServCertDedTaxApplyAll();
//				Thread.sleep(2000);
				
				getServCertModeofPay().sendKeys(sheetServCert.getRow(i).getCell(14).getStringCellValue());
				Thread.sleep(1000);
				appInd.seletDate(getServCertPayDueDate(), appInd.getDateAsSpecified(-30));
				Thread.sleep(2000);
				getServCertRemarks().sendKeys("Service Provider Payment Created Through Automation");
				Thread.sleep(2000);
				getServCertCreateButton();
				if(appInd.AlertPresent()) {
				String AlertText=iDriver.switchTo().alert().getText();
				if(AlertText.equalsIgnoreCase("Vendor does not have GSTIN and the certificate does not have RCM taxes. Do you want to proceed?")) {
					appInd.isAlertPresent();
					Thread.sleep(2000);
					ServiceCertNum =getServCertNumber();
					System.out.println("ServiceCertNum   "+ServiceCertNum);
					Datatable.writeExcel(ServiceCertNum,  "Service Certificate is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				}else {
					System.out.println("Alert Displayed ---"+AlertText);
					Datatable.writeExcel("Service Certificate ",  "Service Certificate is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
					}
				}
			}
				catch (Exception e) {
				Datatable.writeExcel("Service Certificate ",  "Service Certificate is Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
				}
			//Status Changing
			Thread.sleep(3000);
			getServCertChangeStatus();
			getServCertStatusDD().sendKeys("Approved");
			getServCertUpdateStatus();
			Thread.sleep(1000);
			getServCertChangeStatus();
			getServCertStatusDD().sendKeys("Processed");
			Thread.sleep(1000);
			appInd.seletDate(getServCertProcesDate(), appInd.getDateAsSpecified(0));
			Thread.sleep(1000);
			getServCertUpdateStatus();
			if(appInd.AlertPresent()) {
				appInd.isAlertPresent();
			}
			
			ServicePaymentProcess();
		Thread.sleep(2000);
		
		}
		public void ServicePaymentProcess() throws Throwable{
				try {
					MainMenu mm=new MainMenu(iDriver);
					mm.clickFinance();
					Thread.sleep(2000);
					Finance en=new Finance(iDriver);
					//en.clickFinApprovals();
					//Thread.sleep(2000);
					xml = new Datatable();
					sheetServCert = xml.excelData(sheetnameServcert, Purchase.InputCreatePath);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Module, Sub module click case Failed: " + e);
				}
				Frames.SubMenuFrame();
				getFinPurApprovals();
				Frames.tabFrame();
				Thread.sleep(3000);
				getServiceCertTab();
				try {
				Frames.innerFrame();
				WebElement searchcompny=PurPaymentFlow.getFinCertCompany();
				searchcompny.sendKeys(sheetServCert.getRow(i).getCell(0).getStringCellValue());
				Thread.sleep(2000);
				searchcompny.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(1000);
				searchcompny.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
			//	getFinPurAdvstatusDD().clear();
			
				getFinCertNo().sendKeys(ServiceCertNum);
				Thread.sleep(1000);
				getFinPurSuppCertGo();
				Thread.sleep(1000);
				getFinCertNoclick();
				Thread.sleep(1000);
				Frames.innerFrame();
				String Parent_Payment=appInd.switchToChildWindow(ServPayPaymentLink);
				Thread.sleep(1000);
				appInd.singleDropDown(getBankAccountDD(),sheetServCert.getRow(i).getCell(16).getStringCellValue());
				Thread.sleep(1000);
				appInd.isAlertPresent();
				Thread.sleep(1000);
				getInstrumentNo().sendKeys(appInd.RandomNumbers(6));
				Thread.sleep(1000);
				getFavoringPayee().clear();
				Thread.sleep(1000);
				getFavoringPayee().sendKeys(sheetServCert.getRow(i).getCell(4).getStringCellValue());
				Thread.sleep(1000);
				if(appInd.AlertPresent()) {
					appInd.isAlertPresent();
					}
				getPaymentSubmit();
				Thread.sleep(2000);
				appInd.switchToParentWindow(Parent_Payment);
				Frames.innerFrame();
				Thread.sleep(3000);
			//	String AdvancePaymentStatus=getpaymentstatus();
				if(getServPaymentstatus().equals("Paid")) {
					Datatable.writeExcel("Certificate No. "+ServiceCertNum, "Service Payment is Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("PAYMENT STATUS ---"+ServiceCertNum+" "+ getServPaymentstatus());
				}else {
					Datatable.writeExcel("Certificate No. "+ServiceCertNum, "Service Payment is Not Paid", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("PAYMENT STATUS ---"+ServiceCertNum+" "+ getServPaymentstatus());
				}
				}catch (Exception e) {
					Datatable.writeExcel("Certificate No. "+ServiceCertNum, "Service Payment is Not Paid-Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println("PAYMENT STATUS ---"+ServiceCertNum+" "+ getServPaymentstatus());
			}
		}
		
		public void MenuSubMenuServDNReceipt() throws Throwable {
			try {
				MainMenu mm=new MainMenu(oBrowser);
				mm.clickPurchase();
				Purchase en=new Purchase(oBrowser);
				en.clickPayments();
				Thread.sleep(1000);
				xml=new Datatable();
				sheetServDNReceipt=xml.excelData(sheetnameServDNReceipt, Purchase.InputCreatePath);
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Module, Sub module click case Failed: "+e);
			 	}
		
			}
		
		String ServDebitNoteReceiptID;
		public void ServiceDebitNoteReceiptCreation() throws Throwable{
					try {	
			Frames.SubMenuFrame();
			getServDNRecptLink();
			Frames.rightFrame();
			getCreateServDNRecpt();
			appInd.singleDropDown(getServDNRecptComp(), sheetServDNReceipt.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getServDNRecptProj(), sheetServDNReceipt.getRow(i).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			appInd.singleDropDown(getServDNRecptserviceProvider(), sheetServDNReceipt.getRow(i).getCell(2).getStringCellValue());
			Thread.sleep(1000);
			appInd.singleDropDown(getServDNReceiptCurrency(), sheetServDNReceipt.getRow(i).getCell(3).getStringCellValue());
			Thread.sleep(1000);
			appInd.seletDate(getServDNReceiptDate(), appInd.getDateAsSpecified(0));
			Thread.sleep(1000);
			getServDNReceiptAmount().sendKeys(sheetServDNReceipt.getRow(i).getCell(4).getStringCellValue());
			getServDNReceiptPaymentMode().sendKeys(sheetServDNReceipt.getRow(i).getCell(5).getStringCellValue());
			Thread.sleep(3000);
			String ParentAddDN=appInd.switchToChildWindow(ServDNReceiptAddDebitNote);
			getServDNReceiptEnterPurchaseOrder().sendKeys(PurchaseOrder_No);
			getServDNReceiptEnterDebitNoteNo().sendKeys(ServDebitNoteID);
			getServDNReceiptSearchGO();
			getServDNReceiptSelectDN();
			getServDNReceiptAcceptSelected();
			appInd.switchToParentWindow(ParentAddDN);
			Frames.rightFrame();
			getServDNReceiptBankList().sendKeys(sheetServDNReceipt.getRow(i).getCell(8).getStringCellValue());
			getServDNReceiptBranchName().sendKeys(sheetServDNReceipt.getRow(i).getCell(9).getStringCellValue());
			getServDNReceiptPayableAt().sendKeys(sheetServDNReceipt.getRow(i).getCell(10).getStringCellValue());
			getServDNReceiptAccountNumber().sendKeys(sheetServDNReceipt.getRow(i).getCell(11).getStringCellValue());
			appInd.seletDate(getServDNReceiptInstrumentDate(), appInd.getDateAsSpecified(0));
			getServDNReceiptInstrumentNumber().sendKeys(sheetServDNReceipt.getRow(i).getCell(12).getStringCellValue());
			getServDNReceiptInstrumentAmount().sendKeys(sheetServDNReceipt.getRow(i).getCell(13).getStringCellValue());
			getServDNReceiptIsSameBranch();
			Thread.sleep(1500);
			getServDNReceiptFillAmount();
			Thread.sleep(1000);
			getServDNReceiptRemarks().sendKeys("Service Provider Debit Note Receipt is Cretaed Through Automation");
			Thread.sleep(1000);
			getServDNReceiptCreate();
			ServDebitNoteReceiptID=getServDNReceiptID();
			Thread.sleep(5000);
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("Service Provider Debit Note Receipt ",  "is Not Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println("  Service Provider Debit Note Receipt is NOT Created");
			}else {
				Datatable.writeExcel(ServDebitNoteReceiptID, "Service Provider Debit Note Receipt is Created", PurpaymentflowOutput, Purchase.OutputCreatePath);
				System.out.println(ServDebitNoteReceiptID+"  Service Provider Debit Note is Created");
			}
					} catch (Exception e) {
					Datatable.writeExcel("Service Provider Debit Note Receipt",  "is Not Created Exception", PurpaymentflowOutput, Purchase.OutputCreatePath);
					System.out.println(" Service Provider Debit Note Receipt is NOT Created - Exception");
					}
					try {
						ServDNReceiptChangeStatus();
						getServDNReceiptStatusDD().sendKeys("Submitted");
						getStatusRemarks().sendKeys("Submitting Service Provider Debit Note Receipt Through Automation");
						getServDNReceiptUpdateStatus();
						Thread.sleep(1000);
						ServDNReceiptChangeStatus();
						getServDNReceiptStatusDD().sendKeys("Approved");
						getStatusRemarks().sendKeys("Approving Service Provider Debit Note Receipt Through Automation");
						getServDNReceiptUpdateStatus();
						Thread.sleep(1000);
						ServDNReceiptChangeStatus();
						getServDNReceiptStatusDD().sendKeys("Processed");
						getStatusRemarks().sendKeys("Processing Service Provider Debit Note Receipt Through Automation");
						getServDNReceiptUpdateStatus();
						Thread.sleep(1000);
						ServDNReceiptChangeStatus();
						getServDNReceiptStatusDD().sendKeys("Received");
						appInd.seletDate(getReceivedDate(), appInd.getDateAsSpecified(0));
						Thread.sleep(1000);
						appInd.singleDropDown(getBankHeaderAccount(), sheetServDNReceipt.getRow(i).getCell(14).getStringCellValue());
						getStatusRemarks().sendKeys("Received Service Provider Debit Note Receipt Through Automation");
						getServDNReceiptUpdateStatus();
						Thread.sleep(1000);
						ServDNReceiptChangeStatus();
						getServDNReceiptStatusDD().sendKeys("Realized");
						appInd.seletDate(getRealizedDate(), appInd.getDateAsSpecified(0));	
						getStatusRemarks().sendKeys("Realized Service Provider Debit Note Receipt Through Automation");
						getServDNReceiptUpdateStatus();
						Thread.sleep(1000);
					}	catch (Exception e) {
			System.out.println("Service Provider Debit Note Receipt Status Change Exception");
					}
		}
}
