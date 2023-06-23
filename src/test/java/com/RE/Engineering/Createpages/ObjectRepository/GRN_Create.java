package com.RE.Engineering.Createpages.ObjectRepository;


import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.RE.Engineering.Createpages.Test.GRN_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class GRN_Create extends GRN_Create_Test{
	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;
	public static String GRN_No;
	int i =1;

	public GRN_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
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
	private WebElement EnterProject;
	public WebElement getEnterProject() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterProject));
		return EnterProject;
	}
	@FindBy(xpath = "//tr[@id='trProject']//li")
	private List<WebElement> ListtOfProject;
	public List<WebElement> getListtOfProject() {
			return ListtOfProject;
	}
	@FindBy(xpath = "//tr[@id='trProject']//span[@class='multiselect-selected-text']")
	private WebElement ProjectDD;
	public WebElement getProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ProjectDD));
		return ProjectDD;
	}
	

	@FindBy(xpath = "//tr[@id='trSubProject']//span[@class='multiselect-selected-text']")
	private WebElement SubProjectDD;
	public WebElement getSubProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SubProjectDD));
		return SubProjectDD;
	}
	
	@FindBy(xpath = "//tr[@id='trSubProject']//input[@placeholder='Search']")
	private WebElement EnterSubProject;
	public WebElement getEnterSubProject() {
		w2.until(ExpectedConditions.elementToBeClickable(EnterSubProject));
		return EnterSubProject;
	}
	@FindBy(xpath = "//tr[@id='trSubProject']//li")
	private List<WebElement> ListOfSubProject;
	public List<WebElement> getListOfSubProject() {
		return ListOfSubProject;
	}
	
	@FindBy(id = "lbnSelectPO")
	private WebElement SelectPO;
	public WebElement getSelectPO() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectPO));
		return SelectPO;
	}
	@FindBy(css = "select#ddlToStore")
	private WebElement To_Store;
	public WebElement getTo_Store() {
		w2.until(ExpectedConditions.elementToBeClickable(To_Store));
		return To_Store;
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
	private WebElement Remarks;
	public WebElement getRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(Remarks));
		return Remarks;
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
	private WebElement CreateButton;
	public void getCreateButton() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateButton));
		 CreateButton.click();;
	}
	@FindBy(id = "btnModify")
	private WebElement ModifyButton;
	public void getModifyButton() {
		w2.until(ExpectedConditions.elementToBeClickable(ModifyButton));
		 ModifyButton.click();;
	}
	@FindBy(id = "btnSubmit")
	private WebElement UpdateButton;
	public void getUpdateButton() {
		w2.until(ExpectedConditions.elementToBeClickable(UpdateButton));
		 UpdateButton.click();;
	}
	
	@FindBy(id = "lnkChangeStatus")
	private WebElement changestatus;
	public void getchangestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(changestatus));
		 changestatus.click();;
	
	}
	
	@FindBy(css = "select#ddlStatus")
	private WebElement StatusDD;
	public WebElement getStatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(StatusDD));
		return StatusDD;
}
	@FindBy(css = "a#lbnUpdateStatus")
	private WebElement updatestatus;
	public void getupdatestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(updatestatus));
		updatestatus.click();
	
	}
	@FindBy(id = "lblGrnDisplayNo")
	private WebElement GRN_Number;
	public String getGRN_Number() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(GRN_Number));
		return GRN_Number.getText();
	} 
	
	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickEngineering();
			Thread.sleep(2000);
			Engineering en = new Engineering(iDriver);
			en.clickInventory();
			Thread.sleep(1000);
			xml = new Datatable();
			//sheetBooking = xml.excelData(sheetnameBooking, Sales.CreatePath);
			sheet = xml.excelData(sheetname, Engineering.inputCreatePath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	@SuppressWarnings("unchecked")
	public void GRN_Creation() throws Throwable{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println("Total Rows in Excel ----"+sheet.getLastRowNum());
		  int count=0; 		int updatecount=0;
		for(;i<=sheet.getLastRowNum();i++) {
			try{
		Frames.SubMenuFrame();
		getGRN_Link();
		Frames.rightFrame();
		getCreateGRN();
		appInd.singleDropDown(getGRNTypeDD(), sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		appInd.singleDropDown(getSupplierDD(), sheet.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		getProjectDD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getProjectDD(), getEnterProject(), sheet.getRow(i).getCell(3).getStringCellValue(), getListtOfProject());
		Thread.sleep(3000);
		getSubProjectDD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getSubProjectDD(), getEnterSubProject(), sheet.getRow(i).getCell(4).getStringCellValue(), getListOfSubProject());
		Thread.sleep(1000);
		String parent=appInd.switchToChildWindow(getSelectPO());
		Thread.sleep(2000);
		getPO_NoDD().click();
		Thread.sleep(1000);
		appInd.createMultiDD_withText(getPO_NoDD(), getEnterPO_No(), sheet.getRow(i).getCell(5).getStringCellValue(), getListofPO());
		Thread.sleep(2000);
		getSearchButton();
		Thread.sleep(2000);
		getPO_Radio();
		getAcceptSelected();
		appInd.switchToParentWindow(parent);
		Thread.sleep(2000);
		Frames.rightFrame();
		Thread.sleep(2000);
		appInd.singleDropDown(getTo_Store(), sheet.getRow(i).getCell(6).getStringCellValue());
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
		getReceived_Qty().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
		Thread.sleep(2000);
		getCreateButton();
		Thread.sleep(5000);
		GRN_No=getGRN_Number();
		Thread.sleep(1000);
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("GRN", "Not Created", sheetname, Engineering.outputCreatePath);
			
		}else {
			Datatable.writeExcel(GRN_No, "GRN Created", sheetname, Engineering.outputCreatePath);

			count++;
		}
		}catch (Exception e) {
				Datatable.writeExcel("GRN", "Not CreatedException", sheetname, Engineering.outputCreatePath);
				
			}
					
		try {
			Thread.sleep(2000);
			getModifyButton();
			Thread.sleep(2000);
			switch (i) {
			case 1:	getEditVehicle_No().clear();
					Thread.sleep(1000);
					getEditVehicle_No().sendKeys("KA 16 H 9999");
					getRemarks().clear();
					getRemarks().sendKeys("GRN EDITED AND UPDATED THROUGH AUTOMATION ");
					Thread.sleep(2000);
				break;
			case 2:	
					getEditChallan_Date().sendKeys(appInd.getBackDatedDate(1));
					
					getRemarks().clear();
					getRemarks().sendKeys("GRN EDITED AND UPDATED THROUGH AUTOMATION ");
					Thread.sleep(2000);
				break;
			case 3:	try{getEditReceived_Qty().clear();
						Thread.sleep(1000);
					getEditReceived_Qty().sendKeys(sheet.getRow(0).getCell(10).getStringCellValue());
					getRemarks().clear();
					Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println("EXCEPTION ______"  +e);
			}
					getRemarks().sendKeys("GRN EDITED AND UPDATED THROUGH AUTOMATION ");
					Thread.sleep(2000);
			
				break;
			case 4:	getEditReceived_Qty().clear();
					Thread.sleep(1000);
					getEditReceived_Qty().sendKeys(sheet.getRow(1).getCell(10).getStringCellValue());
					getRemarks().clear();
					Thread.sleep(1000);
					getRemarks().sendKeys("GRN EDITED AND UPDATED THROUGH AUTOMATION ");
					Thread.sleep(2000);
	
				break;
			case 5:	getEditReceived_Qty().clear();
					Thread.sleep(1000);
					getEditReceived_Qty().sendKeys(sheet.getRow(2).getCell(10).getStringCellValue());
					getRemarks().clear();
					Thread.sleep(1000);
					getRemarks().sendKeys("GRN EDITED AND UPDATED THROUGH AUTOMATION ");
					Thread.sleep(2000);
				break;

			default:
				break;
			}
			Thread.sleep(3000);
			getUpdateButton();
			Thread.sleep(3000);
		if(appInd.AlertPresent()) {
			Datatable.writeExcel(GRN_No, "Not Updated", sheetname, Engineering.outputCreatePath);
		}else {
			Datatable.writeExcel(GRN_No, "Modified & Updated", sheetname, Engineering.outputCreatePath);
			updatecount++;
		}
			
		}catch (Exception e) {
			System.out.println(e);
			Datatable.writeExcel(GRN_No, "Not Updated-Exception", sheetname, Engineering.outputCreatePath);
		}
	
		getchangestatus();
		Thread.sleep(1000);
		getStatusDD().sendKeys("Submitted");
		Thread.sleep(1000);
		getupdatestatus();
		Thread.sleep(1000);
		getchangestatus();
		Thread.sleep(3000);
		getStatusDD().sendKeys("Approved");
		Thread.sleep(1000);
		getupdatestatus();
		
	}
		System.out.println("Total GRN's Created ---"+count);
		System.out.println("Total GRN's Modified & Updated ---"+updatecount);
		
		if(count==sheet.getLastRowNum()) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Engineering.outputCreatePath);
			
		}else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Engineering.outputCreatePath);
		}
		if(updatecount==sheet.getLastRowNum()) {
			Datatable.writeExcel("GRN EDIT", "PASS", sheetname, Engineering.outputCreatePath);
			
		}else {
			Datatable.writeExcel("GRN EDIT", "FAIL", sheetname, Engineering.outputCreatePath);
		}
	}


}
