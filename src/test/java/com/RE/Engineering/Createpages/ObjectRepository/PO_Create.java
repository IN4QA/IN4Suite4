package com.RE.Engineering.Createpages.ObjectRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.PO_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;
import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class PO_Create extends PO_Create_Test{
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;
	public static XSSFSheet sheet;
	public static String PODate="May 24, 2023";
	public static String Indentstartdate="May 01, 2023";
	public static String IndentTodate="May 24, 2023";
	
	

	public PO_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}
	
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
	@FindBy(xpath = "//table[@id='frmViewPOIndent_rdPOTypeList']//tr[1]//td[2]//input[@type='radio']")
	private WebElement ImportPO;
	public void getImportPO() {
		w2.until(ExpectedConditions.elementToBeClickable(ImportPO));
		ImportPO.click();
	}
	@FindBy(xpath = "//table[@id='frmViewPOIndent_rdPOTypeList']//tr[1]//td[3]//input[@type='radio']")
	private WebElement RopoPO;
	public void getRopoPO() {
		w2.until(ExpectedConditions.elementToBeClickable(RopoPO));
		RopoPO.click();
	}
	
	@FindBy(xpath = "//table[@id='frmViewPOIndent_rdoPOCategoryList']//tr[1]//td[1]//input[@type='radio']")
	private WebElement MaterialPO;
	public void getMaterialPO() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialPO));
		MaterialPO.click();
	}
	
	@FindBy(xpath = "//table[@id='frmViewPOIndent_rdoPOCategoryList']//tr[1]//td[2]//input[@type='radio']")
	private WebElement AssetPO;
	public void getAssetPO() {
		w2.until(ExpectedConditions.elementToBeClickable(AssetPO));
		AssetPO.click();
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
	@FindBy(id = "frmViewPOIndent_ddlGSTIN")
	private WebElement BranchDD	;
	public WebElement getBranchDD() {
		w2.until(ExpectedConditions.elementToBeClickable(BranchDD));
		return BranchDD	;
	}
	@FindBy(id = "frmViewPOIndent_btnIndent")
	private WebElement AddMaterial_Indent;
	public void getAddMaterial_Indent() {
		w2.until(ExpectedConditions.elementToBeClickable(AddMaterial_Indent));
		 AddMaterial_Indent.click();;
	}
	@FindBy(id = "frmViewPOIndent_btnRFQ")
	private WebElement AddMaterial_RFQ;
	public void getAddMaterial_RFQ() {
		w2.until(ExpectedConditions.elementToBeClickable(AddMaterial_RFQ));
		 AddMaterial_RFQ.click();;
	}
	@FindBy(xpath = "//div[@id='rptParamPanel']//tr[@id='trProject']//select[@name='ddlProjectList']")
	private WebElement ProjDD;
	public void getProjDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ProjDD));
		 ProjDD.click();;
	}
	@FindBy(css = "select#ddlProjectList")
	private WebElement ProjectDD;
	public WebElement getProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ProjectDD));
		return ProjectDD;
	}
	@FindBy(css = "select#ddlSubProject")
	private WebElement SubProjectDD;
	public WebElement getSubProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SubProjectDD));
		return SubProjectDD;
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
	@FindBy()
	private WebElement MaterialTypeDD;
	public WebElement getMaterialTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialTypeDD));
		return MaterialTypeDD;
	}
	@FindBy()
	private WebElement MaterialSubTypeDD;
	public WebElement getMaterialSubTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialSubTypeDD));
		return MaterialSubTypeDD;
	}
	@FindBy()
	private WebElement MaterialDD;
	public WebElement getMaterialDD() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialDD));
		return MaterialDD;
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
	@FindBy(id = "lnkAcceptSelected")
	private WebElement AcceptSelected;
	public void getAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(AcceptSelected));
		AcceptSelected.click();
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
	private WebElement changestatus;
	public void getchangestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(changestatus));
		 changestatus.click();
	}
	@FindBy(css = "select#frmViewPOIndent_ddlUpdateStatusList")
	private WebElement statusDD;
	public WebElement getstatusDD() {
		w2.until(ExpectedConditions.elementToBeClickable(statusDD));
		return statusDD;
	}
	@FindBy(css = "a#frmViewPOIndent_lnkUpdateStatus")
	private WebElement updatestatus;
	public void getupdatestatus() {
		w2.until(ExpectedConditions.elementToBeClickable(updatestatus));
		 updatestatus.click();
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
	@FindBy(id = "btnModify")
	private WebElement ModifyPo_Indent;
	public void getModifyPo_Indent() {
		w2.until(ExpectedConditions.elementToBeClickable(ModifyPo_Indent));
		ModifyPo_Indent.click();
	}
	@FindBy(css = "input#btnUpdate")
	private WebElement UpdatePo_Indent;
	public void getUpdatePo_Indent() {
		w2.until(ExpectedConditions.elementToBeClickable(UpdatePo_Indent));
		UpdatePo_Indent.click();
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
			sheet = xml.excelData(sheetname, Engineering.inputCreatePath);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	
	public void PurchaseorderCreate() throws Throwable{
//		iDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		int count=0;
		int	updatecount=0;
		for(int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
		Frames.SubMenuFrame();
		getPOlink();
		Frames.rightFrame();
		getCreatePObutton();
		getMaterialPO();
		getDomesticPO();
		getCompany().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		appInd.seletDate(getPOdate(), appInd.CurrentDateIn_MMM_DD_YYYY());
		getsupplier().sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		getPOrefNo().sendKeys("refNo"+appInd.RandomNumbers(5));
		getDocumentThrough().sendKeys("E-Mail");
		getAddMaterial_Indent();
		Frames.iFrame();
		Thread.sleep(3000);
		appInd.singleDropDown(getProjectDD(),(sheet.getRow(i).getCell(2).getStringCellValue()));
		Thread.sleep(3000);
		appInd.singleDropDown(getSubProjectDD(), (sheet.getRow(i).getCell(3).getStringCellValue()));
		Thread.sleep(3000);
		getIndent_No().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
	//	getWO_No().sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
		appInd.seletDate(getIndentFromdate(), Indentstartdate);
		appInd.seletDate(getToDate(), appInd.CurrentDateIn_MMM_DD_YYYY());
		getSearch();
		getcheckbox();
		Thread.sleep(3000);
		getAcceptSelected();
		Frames.rightFrame();
		getPO_Qty().clear();
		Thread.sleep(3000);
		getPO_Qty().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
		Thread.sleep(3000);
		getcreatebutton();
		Thread.sleep(3000);
		String parent1 = appInd.switchToChildWindow(getAddRateTax());
		getRate().clear();
		appInd.isAlertPresent();
		getRate().sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
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
				iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
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
		getSearchBy().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
		getGobutton();
		getServiceProviderName();
		appInd.switchToParentWindow(parent2);
		Frames.rightFrame();
		Thread.sleep(3000);
		getServAdvance().clear();
		Thread.sleep(3000);
		getServAdvance().sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
		getServcheckbox();
		Thread.sleep(3000);
		getServcheckbox();
		try {
		getSuppAdvance().clear();
		Thread.sleep(3000);
		getSuppAdvance().sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
		}catch(Exception e) {
			System.out.println("getSuppAdvance  "+e);
		}
		Thread.sleep(5000);
		getUpdateTermandConditions();
		Thread.sleep(3000);
		
		
	
		if(appInd.AlertPresent()) {
			Datatable.writeExcel("Purchase Order", "Not Created", sheetname, Engineering.outputCreatePath);
			
		}else{
			
			Datatable.writeExcel("Purchase Order", "Created", sheetname, Engineering.outputCreatePath);
			count++;
		}
			}catch (Exception e) {
				Datatable.writeExcel("Purchase Order", "Not Created -Exception ", sheetname, Engineering.outputCreatePath);
			}
			
			getModifyPo_Indent();
			try {
				
			switch (i) {
			case 1:getPO_Qty().clear();
					Thread.sleep(1000);
				   getPO_Qty().sendKeys(sheet.getRow(0).getCell(14).getStringCellValue());
				   getUpdatePo_Indent();
				   getUpdateRate();
				   getUpdateTermandConditions();
				
				break;
			case 2:	getUpdatePo_Indent();
					String parent3 = appInd.switchToChildWindow(getAddRateTax());
					getRate().clear();
					appInd.isAlertPresent();
					getRate().sendKeys(sheet.getRow(1).getCell(14).getStringCellValue());
					getCalRate();
					Thread.sleep(3000);
					getCalRate();
					getSaveRate();
					appInd.switchToParentWindow(parent3);
					Frames.rightFrame();
					getUpdateRate();
					getUpdateTermandConditions();
				break;
			
			case 3: getUpdatePo_Indent();
			  		String parent4 = appInd.switchToChildWindow(getAddRateTax());
			int chargecount=0;
			for(int j=0; j<=getCharges().size(); j++) {
				chargecount++;
				if(getCharges().get(j).getText().equals("HANDLING CHARGES"))
				{
					chargecount = chargecount + 1;
					iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).clear();
					Thread.sleep(3000);
					if(appInd.AlertPresent()) {
						appInd.isAlertPresent();
					}
					iDriver.findElement(By.xpath("//table[@class='in4-table mt-5']//tr["+chargecount+"]//td[2]//input")).sendKeys(sheet.getRow(2).getCell(14).getStringCellValue());
					break;		
				}
			}
			getCalRate();
			getSaveRate();
			appInd.switchToParentWindow(parent4);
			Frames.rightFrame();
			Thread.sleep(1000);
			getUpdateRate();
			Thread.sleep(1000);
			getUpdateTermandConditions();
			break;
			
			case 4:getUpdatePo_Indent();
			getUpdateRate();
			getUpdateTermandConditions();
			break;
			
			case 5:getUpdatePo_Indent();
			getUpdateRate();
			getUpdateTermandConditions();
			break;
			
			default:
				break;
			
					
			}
			
			if(appInd.AlertPresent()) {
				Datatable.writeExcel("Purchase Order", "Not Updated", sheetname, Engineering.outputCreatePath);
				
			}else{
				
				Datatable.writeExcel("Purchase Order", "Updated", sheetname, Engineering.outputCreatePath);
				updatecount++;
			}
		} 
			catch (Exception e) {
				Datatable.writeExcel("Purchase Order", "Not Updated -Exception ", sheetname, Engineering.outputCreatePath);
			}
			Thread.sleep(2000);
			getchangestatus();
			Thread.sleep(2000);
			getstatusDD().sendKeys("Submitted");
			getupdatestatus();
			getchangestatus();
			Thread.sleep(2000);
			getstatusDD().sendKeys("Approved");
			getApproverRemarks().sendKeys("PO IS APPROVED THROUGH AUTOMATION");
			getupdatestatus();
			
			
		}
		System.out.println("Total number of Suppliers Created----"+count);
		System.out.println("Total number of Suppliers Updated----"+updatecount);
		if (sheet.getLastRowNum()==count) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Engineering.outputCreatePath);
			
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Engineering.outputCreatePath);

		}
		if (sheet.getLastRowNum()==updatecount) {
			Datatable.writeExcel("PO MOdified & Updated", "PASS", sheetname, Engineering.outputCreatePath);
			
		} else {
			Datatable.writeExcel("PO MOdified & Updated", "FAIL", sheetname, Engineering.outputCreatePath);

		}
	}
	}
	

	

