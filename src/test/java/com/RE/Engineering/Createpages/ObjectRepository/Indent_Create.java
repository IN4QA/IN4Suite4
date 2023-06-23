package com.RE.Engineering.Createpages.ObjectRepository;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Engineering.Createpages.Test.Indent_Create_Test;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;

public class Indent_Create extends Indent_Create_Test{

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Sales en;
	public static String IndentNo;

	public Indent_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	}

	// Indents 
	@FindBy(xpath = "//a[text()='Indents']")
	private WebElement indlink;
	public void getindlink() {
		indlink.click();
	}
	
	// Create Indent button
	@FindBy(css = "input#btnCreate")
	private WebElement CreateIndBtn;
	public void getCreateIndBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateIndBtn));
		CreateIndBtn.click();
	} 
	
	// Indent Type Drop down
	@FindBy(name = "ddlIndentType")
	private WebElement IndentTypeDD;
	public WebElement getIndentTypeDD() {
		w2.until(ExpectedConditions.elementToBeClickable(IndentTypeDD));
		return IndentTypeDD;
	} 
	
	// Project Drop down
	@FindBy(css = "select#ddlProject")
	private WebElement ProjectDD;
	public WebElement getProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(ProjectDD));
		return ProjectDD;
	} 
	
	// sub-Project Drop down
	@FindBy(css = "select#ddlSubProject")
	private WebElement SubProjectDD;
	public WebElement getSubProjectDD() {
		w2.until(ExpectedConditions.elementToBeClickable(SubProjectDD));
		return SubProjectDD;
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
	@FindBy(xpath = "//a[text()='Accept Selected']")
	private WebElement AcceptSelected;
	public void getAcceptSelected() {
		w2.until(ExpectedConditions.elementToBeClickable(AcceptSelected));
		AcceptSelected.click();
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
	
	// BOQ Level button
	@FindBy(css = "input#btnBOQLevel")
	private WebElement BOQLevelBtn;
	public void getBOQLevelBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(BOQLevelBtn));
		BOQLevelBtn.click();
	}
	
	// Material Master button
	@FindBy(css = "input#btnMasterLevel")
	private WebElement MaterialMasterBtn;
	public void getMaterialMasterBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialMasterBtn));
		MaterialMasterBtn.click();
	} 
	
	// Add Material button
	@FindBy(css = "#btnIndentAddItem")
	private WebElement IndentAddItemBtn;
	public WebElement getIndentAddItemBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(IndentAddItemBtn));
		return IndentAddItemBtn;
	} 
	
	// Select Material Master record 
	@FindBy(xpath = "//table[@id='gvMaterialResult']//tr[3]//input")
	private WebElement MaterialResult;
	public void getMaterialResult() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialResult));
		MaterialResult.click();
	} 
	
	// Material Master records
	// Select Material master item record
	@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//input")
	private WebElement SelectMaterialItem;
	public void getSelectMaterialItem() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectMaterialItem));
		SelectMaterialItem.click();
	} 
	
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
	
	/*
	@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//td[7]//input")
	private WebElement MaterialMasterDeliveryDate;
	public WebElement getMaterialMasterDeliveryDate() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialMasterDeliveryDate));
		return MaterialMasterDeliveryDate;
	} */
	
	//Error message	
	@FindBy(xpath = "//span[text()='The following problems occured.']")
	private WebElement ErrorMessage;
	public WebElement getErrorMessage() {
		return ErrorMessage;
	} 
	
	//Cancel Button
	@FindBy(css = "#BtnCancel")
	private WebElement CancelBtn;
	public void getCancelBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CancelBtn));
		CancelBtn.click();
	} 
	
	// Add Button
	@FindBy(css = "input#BtnAddItem")
	private WebElement AddBtn;
	public void getAddBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AddBtn));
		AddBtn.click();
	}  
	
	// MM Notes
	@FindBy(xpath = "//table[@class='in4-table1']//tr//tr//td[8]//textarea")
	private WebElement MaterialMasterNotes;
	public WebElement getMaterialMasterNotes() {
		w2.until(ExpectedConditions.elementToBeClickable(MaterialMasterNotes));
		MaterialMasterNotes.click();
		return MaterialMasterNotes;
	}  
	
	// Delivery Schedule downward arrow
	@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//input[@type='image']")
	private WebElement DownArrow;
	public void getDownArrow() {
		w2.until(ExpectedConditions.elementToBeClickable(DownArrow));
		DownArrow.click();
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
	
	//WO Summary related
	//Search button
	@FindBy(css = "#btnSearch")
	private WebElement WOSSearchBtn;
	public void getWOSSearchBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(WOSSearchBtn));
		WOSSearchBtn.click();
	} 
	
	//Selecting records in WO Summary
	@FindBy(xpath = "//table[@class='in4-table1 mt-5']//tr[2]//td//input[@type='checkbox']")
	private WebElement WOSummaryRecord;
	public void getWOSummaryRecord() {
		w2.until(ExpectedConditions.elementToBeClickable(WOSummaryRecord));
		WOSummaryRecord.click();
	} 
	
	//BOQ Level
	//Search button
	@FindBy(css = "#btnFilterGO")
	private WebElement BOQSearchBtn;
	public void getBOQSearchBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(BOQSearchBtn));
		BOQSearchBtn.click();
	} 
	
	// selecting record in BOQ
	@FindBy(xpath = "//table[@class='in4-table1']//tr[2]//input")
	private WebElement BOQRecord;
	public void getBOQRecord() {
		w2.until(ExpectedConditions.elementToBeClickable(BOQRecord));
		BOQRecord.click();
	}
	
	// Quantity for BOQ	
	@FindBy(xpath = "//table[@class='GridView']//table//tr[3]//td[11]//input[@type='text']")
	private WebElement BOQQuantity;
	public WebElement getBOQQuantity() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(BOQQuantity));
		BOQQuantity.clear();
		Thread.sleep(2000);
		w2.until(ExpectedConditions.elementToBeClickable(BOQQuantity));
		return BOQQuantity;
	} 
	
	// Indent Number
	@FindBy(xpath = "//div[@id='upIndentType']/..//span[@id='lblIndentNo']")
	private WebElement IndentNumber;
	public String getIndentNumber() throws Throwable {
		w2.until(ExpectedConditions.elementToBeClickable(IndentNumber));
		return IndentNumber.getText();
	} 
	
	// Assert Radio button
	@FindBy(css = "input#rdAsset")
	private WebElement AssetRadioBtn;
	public void getAssetRadioBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(AssetRadioBtn));
		AssetRadioBtn.click();
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
//	
//	public void Material() throws Throwable {
//		// taking data from excel sheet of column - 9
//		int WO_Number_Data = 9;
//		createIndent(WO_Number_Data);
//	}
//	public void Asset() throws Throwable {
//		// taking data from excel sheet of column - 10
//		int WO_Number_Data = 10;
//		createIndent(WO_Number_Data);
//	}
	
	public void createIndent() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		getindlink();
		int count = 0;
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				Frames.rightFrame();
				getCreateIndBtn();
// 				if WO taking from excel changes the column, accordingly update the number here
//				if(WO_Number_Data == 10) {
//					getAssetRadioBtn();
//				}
				appInd.singleDropDown(getIndentTypeDD(), sheet.getRow(i).getCell(0).getStringCellValue());
				appInd.singleDropDown(getProjectDD(), sheet.getRow(i).getCell(1).getStringCellValue());
				appInd.singleDropDown(getSubProjectDD(), sheet.getRow(i).getCell(2).getStringCellValue());

				String parent = appInd.switchToChildWindow(getSelectWorkOrder());
				getEnterWorkOrder().sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
				getSearchWorkOrder();
				getSelectWorkOrderRadio();
				getAcceptSelected();
				appInd.switchToParentWindow(parent);

				Frames.rightFrame();
				getRemarks().sendKeys("working boss");
				getCreateBtn().click();
				
				IndentNo = getIndentNumber();
				
				WOSummary(i);
				BOQlevel(i);
				materialMaster(i);
				getchangestatus();
				Thread.sleep(1000);
				getStatusDD().sendKeys("Submitted");
				Thread.sleep(2000);
				getupdatestatus();
				
				if (appInd.AlertPresent()) {
					Datatable.writeExcel(IndentNo, "Indent is Not Created", sheetname,
							Engineering.outputCreatePath);
					Frames.SubMenuFrame();
					getindlink();
				} else {
					count++;
					Datatable.writeExcel(IndentNo, "Indent is Created", sheetname,
							Engineering.outputCreatePath);
					Frames.SubMenuFrame();
					getindlink();
				}
			} catch (Exception e) {
				Datatable.writeExcel(IndentNo, "Indent is not Created", sheetname,
						Engineering.outputCreatePath);
				Frames.SubMenuFrame();
				getindlink();
			}
		}
		if (sheet.getLastRowNum() == count) {
			Datatable.writeExcel(nameofCurrMethod, "PASS", sheetname, Engineering.outputCreatePath);
		} else {
			Datatable.writeExcel(nameofCurrMethod, "FAIL", sheetname, Engineering.outputCreatePath);
		}
	}

	public void WOSummary(int i) throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			getWorkOrderSummaryBtn();
			String parent = appInd.switchToChildWindow(getIndentAddItemBtn());
			getWOSummaryRecord();
			getAcceptSelected();
			appInd.switchToParentWindow(parent);
			Frames.rightFrame();
			appInd.singleDropDown(getStoreDD(), sheet.getRow(i).getCell(5).getStringCellValue());
			getQuantity().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());

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
			getQuantityArrow().sendKeys("1");
			appInd.isAlertPresent();
			getAddBtn();
		
	
			try {
				if (ErrorMessage.isDisplayed()) {
					
					Datatable.writeExcel((nameofCurrMethod), "Material Not Added", sheetname, Engineering.outputCreatePath);
					getCancelBtn();
				}
			} catch (Exception e) {
				Datatable.writeExcel((nameofCurrMethod), "Material is Added", sheetname, Engineering.outputCreatePath);
			}

		}catch (Exception e) {
			System.out.println("WOSummary exception :: "+e);
			Datatable.writeExcel((nameofCurrMethod), "Material Not Added", sheetname, Engineering.outputCreatePath);
			getCancelBtn();
			
		}

	}

	public void BOQlevel(int i) throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			getBOQLevelBtn();
			String parent = appInd.switchToChildWindow(getIndentAddItemBtn());
			getBOQSearchBtn();
			getBOQRecord();
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Engineering.inputCreatePath);
			getBOQQuantity().sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
			getAcceptSelected();
			appInd.switchToParentWindow(parent);

			Frames.rightFrame();
			appInd.singleDropDown(getStoreDD(), sheet.getRow(i).getCell(7).getStringCellValue());

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
			appInd.isAlertPresent();
			getAddBtn();
			try {
				if (ErrorMessage.isDisplayed()) {
					Datatable.writeExcel((nameofCurrMethod), "Material Not Added", sheetname, Engineering.outputCreatePath);
					getCancelBtn();
				}
			} catch (Exception e) {
				Datatable.writeExcel((nameofCurrMethod), "Material is Added", sheetname, Engineering.outputCreatePath);
			}
		} catch (Exception e) {
			System.out.println(e);
			Datatable.writeExcel((nameofCurrMethod), "Material Not Added", sheetname, Engineering.outputCreatePath);
			getCancelBtn();
		}
	}

	public void materialMaster(int i) throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		try {
			getMaterialMasterBtn();
			String parent = appInd.switchToChildWindow(getIndentAddItemBtn());
			getMaterialResult();
			getAcceptSelected();
			appInd.switchToParentWindow(parent);
			Frames.rightFrame();
			getSelectMaterialItem();
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Engineering.inputCreatePath);
			appInd.singleDropDown(getStoreDD(), sheet.getRow(i).getCell(3).getStringCellValue());
			getQuantity().sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());

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
			getQuantityArrow().sendKeys("1");
			appInd.isAlertPresent();
			getAddBtn();
			try {
				if (ErrorMessage.isDisplayed()) {
					Datatable.writeExcel((nameofCurrMethod), "Material Not Added", sheetname,  Engineering.outputCreatePath);
					getCancelBtn();
				}
			} catch (Exception e) {
				Datatable.writeExcel((nameofCurrMethod), "Material is Added", sheetname, Engineering.outputCreatePath);
			}
		} catch (Exception e) {
			System.out.println(e);
			Datatable.writeExcel((nameofCurrMethod), "Material Not Added", sheetname, Engineering.outputCreatePath);
			getCancelBtn();
		}
	}
}
