package com.RE.Expenses.Create.ObjectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.RE.Expenses.Create.Test.BudgetPeriod_Create_Test;
import com.RE.Submodules.Expenses;

import Utilities.Datatable;
import Utilities.Frames;
import Utilities.MainMenu;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class BudgetPeriod_Create extends BudgetPeriod_Create_Test {

	public static XSSFSheet sheet;
	public static Datatable xml;
	public static WebDriver iDriver;
	public static String sheetname;
	public static Expenses expense;

	public BudgetPeriod_Create(WebDriver oDriver) {
		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
		sheetname = this.getClass().getSimpleName();
	} 
	
	@FindBy(xpath = "//a[text()='Budget Period']")
	private WebElement BudgetPeriodLink;
	public void getBudgetPeriodLink() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetPeriodLink));
		BudgetPeriodLink.click();
	} 
	
	@FindBy(css = "#btnNewPeriod")
	private WebElement CreateBudgetPeriodBtn;
	public void getCreateBudgetPeriodBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBudgetPeriodBtn));
		CreateBudgetPeriodBtn.click();
	} 
	
	@FindBy(css = "#ddlCompany")
	private WebElement CompanyDD;
	public WebElement getCompanyDD() {
		w2.until(ExpectedConditions.elementToBeClickable(CompanyDD));
		return CompanyDD;
	} 
	
	@FindBy(css = "#txtFromDate_txtDatePicker")
	private WebElement FromDate;
	public WebElement getFromDate() {
		w2.until(ExpectedConditions.elementToBeClickable(FromDate));
		return FromDate;
	}
	
	@FindBy(css = "#txtToDate_txtDatePicker")
	private WebElement ToDate;
	public WebElement getToDate() {
		w2.until(ExpectedConditions.elementToBeClickable(ToDate));
		return ToDate;
	}
	
	@FindBy(css = "#txtRemarks")
	private WebElement Remarks;
	public WebElement getRemarks() {
		w2.until(ExpectedConditions.elementToBeClickable(Remarks));
		return Remarks;
	}
	
	@FindBy(css = "#ddlStatus")
	private WebElement Status;
	public WebElement getStatus() {
		w2.until(ExpectedConditions.elementToBeClickable(Status));
		return Status;
	}
	
	@FindBy(css = "#btnSubmit")
	private WebElement CreateBtn;
	public void getCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBtn));
		CreateBtn.click();
	}
	
	@FindBy(xpath = "//a[text()='Approvals ']")
	private WebElement ApprovalsLink;
	public void getApprovalsLink() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsLink));
		ApprovalsLink.click();
	} 
	
	@FindBy(xpath = "//a[text()='Approvals ']//following-sibling::div//a[text()='Budget Period']")
	private WebElement ApprovalsBudgetPeriod;
	public void getApprovalsBudgetPeriod() {
		w2.until(ExpectedConditions.elementToBeClickable(ApprovalsBudgetPeriod));
		ApprovalsBudgetPeriod.click();
	} 
	
	@FindBy(xpath = "//table[@id='dgBudgetPeriod']//a[contains(@id,'FromDate')]")
	private List<WebElement> clickBudgetPeriod;
	public List<WebElement> getclickBudgetPeriod() {
		return clickBudgetPeriod;
	} 
	
	@FindBy(xpath = "//a[text()='Budget'][@id='defTab']")
	private WebElement clickBudget;
	public void getclickBudget() {
		w2.until(ExpectedConditions.elementToBeClickable(clickBudget));
		clickBudget.click();
	} 
	
	// Budget entity
	
	@FindBy(xpath = "//a[text()='Budget'][@id='dir']")
	private WebElement clickBudgetBudget;
	public void getclickBudgetBudget() {
		w2.until(ExpectedConditions.elementToBeClickable(clickBudgetBudget));
		clickBudgetBudget.click();
	} 
	
	@FindBy(css = "#btnNewPeriod")
	private WebElement CreateBudgetBtn;
	public void getCreateBudgetBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(CreateBudgetBtn));
		CreateBudgetBtn.click();
	}
	
	@FindBy(css = "#ddlDate")
	private WebElement PeriodDD;
	public WebElement getPeriodDD() {
		w2.until(ExpectedConditions.elementToBeClickable(PeriodDD));
		return PeriodDD;
	} 
	
	@FindBy(css = "#txtDescription")
	private WebElement Description;
	public WebElement getDescription() {
		w2.until(ExpectedConditions.elementToBeClickable(Description));
		return Description;
	} 
	
	@FindBy(css = "#btnSearch")
	private WebElement GoBtn;
	public void getGoBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(GoBtn));
		GoBtn.click();
	}
	
	@FindBy(css = "#lnkBtnAddRow")
	private WebElement AddRowLink;
	public void getAddRowLink() {
		w2.until(ExpectedConditions.elementToBeClickable(AddRowLink));
		AddRowLink.click();
	}
	
	@FindBy(xpath = "//select[contains(@id,'gvBudget')]")
	private WebElement AddType;
	public WebElement getAddType() {
		w2.until(ExpectedConditions.elementToBeClickable(AddType));
		return AddType;
	} 	
	
	@FindBy(xpath = "//input[contains(@id,'gvBudget')][contains(@title,'Click to add SubType  ')]")
	private WebElement ClickSubType;
	public void getClickSubType() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickSubType));
		ClickSubType.click();
	} 
	
	@FindBy(xpath = "//table[contains(@id,'gvBudgetView')]//tr//td[3]//input")
	private WebElement BudgetAllocatedAmount;
	public WebElement getBudgetAllocatedAmount() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetAllocatedAmount));
		return BudgetAllocatedAmount;
	} 	
	
	@FindBy(css = "#btnUpdate")
	private WebElement Update;
	public WebElement getUpdate() {
		w2.until(ExpectedConditions.elementToBeClickable(Update));
		return Update;
	}
	
	@FindBy(xpath = "//table[@id='gvBudgetList']//tr[2]//a[contains(@id,'gvBudget')]")
	private WebElement ClickPeriod;
	public void getClickPeriod() {
		w2.until(ExpectedConditions.elementToBeClickable(ClickPeriod));
		ClickPeriod.click();
	} 
	
	@FindBy(xpath = "//select[@id='ddlDate']//option[2]")
	private WebElement SelectedPeriod;
	public String getSelectedPeriod() {
		w2.until(ExpectedConditions.elementToBeClickable(SelectedPeriod));
		return SelectedPeriod.getText();
	} 
	
	@FindBy(xpath = "//tr[3]//select[contains(@id,'gvBudget')]")
	private WebElement AddSubType;
	public WebElement getAddSubType() {
		w2.until(ExpectedConditions.elementToBeClickable(AddSubType));
		return AddSubType;
	} 
	
	@FindBy(css = "#btnModify")
	private WebElement BudgetCreateBtn;
	public void getBudgetCreateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetCreateBtn));
		BudgetCreateBtn.click();
	}
	
	
	@FindBy(css = "input#btnUpdate")
	private WebElement BudgetUpdateBtn;
	public WebElement getBudgetUpdateBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(BudgetUpdateBtn));
		return BudgetUpdateBtn;
	}
	
	@FindBy(css = "#btnSubmit")
	private WebElement SubmitBtn;
	public void getSubmitBtn() {
		w2.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		SubmitBtn.click();
	}

	public void MenuSubMenu() {
		try {
			MainMenu mm = new MainMenu(iDriver);
			mm.clickExpenses();
			Thread.sleep(2000);
			xml = new Datatable();
			sheet = xml.excelData(sheetname, Expenses.CreateInputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Module, Sub module click case Failed: " + e);
		}
	}
	int date ;
	String budgetDate;
	public void createBudgetPeriod() throws Throwable {
		date = Integer.parseInt(sheet.getRow(0).getCell(1).getStringCellValue());
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			try {
				Frames.SubMenuFrame();
				if (i != 1) {
//					getclickBudget();
				}
				Thread.sleep(1000);
				getBudgetPeriodLink();
				Frames.rightFrame();
				getCreateBudgetPeriodBtn();
				Thread.sleep(1000);
				appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				budgetDate = appInd.getDateAsSpecified(date);
				appInd.seletDate(getFromDate(), budgetDate);
				Thread.sleep(1000);
				appInd.seletDate(getToDate(), budgetDate);
				Thread.sleep(1000);
				getRemarks().sendKeys("Budget From and To Date - " + budgetDate);
				date--;
				appInd.singleDropDown(getStatus(), sheet.getRow(i).getCell(3).getStringCellValue());
				Thread.sleep(1000);
				getCreateBtn();
				Frames.SubMenuFrame();
				getApprovalsLink();
				Thread.sleep(1000);
				getApprovalsBudgetPeriod();
				Frames.rightFrame();
				
				for(WebElement e : getclickBudgetPeriod()) {
					
					if(e.getText().equals(budgetDate)) {
						e.click();
					}
				}
				appInd.singleDropDown(getStatus(), sheet.getRow(i).getCell(4).getStringCellValue());
				Thread.sleep(1000);
				getCreateBtn();
				
				Frames.SubMenuFrame();
				Thread.sleep(1000);
				getclickBudget();
				Frames.rightFrame();
				getCreateBudgetBtn();
				appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPeriodDD(), (budgetDate+" - "+budgetDate));
				getDescription().sendKeys((budgetDate+" - "+budgetDate));
				getGoBtn();
				getAddRowLink();
				appInd.singleDropDown(getAddType(), sheet.getRow(i).getCell(5).getStringCellValue());
				getClickSubType();
				appInd.singleDropDown(getAddSubType(), sheet.getRow(i).getCell(6).getStringCellValue());
				getBudgetAllocatedAmount().sendKeys("1000000000");
				getBudgetCreateBtn();
				Thread.sleep(1000);
				
				appInd.singleDropDown(getStatus(), sheet.getRow(i).getCell(3).getStringCellValue());
				appInd.clickWebelement(getUpdate());
				appInd.singleDropDown(getCompanyDD(), sheet.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(1000);
				appInd.singleDropDown(getPeriodDD(), (budgetDate+" - "+budgetDate));
				getGoBtn();
				getClickPeriod();
				appInd.singleDropDown(getStatus(), sheet.getRow(i).getCell(4).getStringCellValue());
				appInd.clickWebelement(getUpdate());
				
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
				}
				Thread.sleep(1000);
				String parent = appInd.switchToChildWindow(null);
				getSubmitBtn();
				appInd.switchToParentWindow(parent);
				
				if (appInd.AlertPresent()) {
					appInd.isAlertPresent();
					Datatable.writeExcel(budgetDate, "Budget Period Not Created", sheetname, Expenses.CreateOutPutPath);
				} else {
					Datatable.writeExcel(budgetDate, "Budget Period Created", sheetname, Expenses.CreateOutPutPath);
				}
			} catch (Exception e) {
				System.out.println(e);
				Datatable.writeExcel(budgetDate, "Budget Period Not Created Exception", sheetname, Expenses.CreateOutPutPath);
			}
		}
		writeExcelBudget("Date", (String.valueOf((date))), sheetname, Expenses.CreateInputPath);
	}
	
	public void writeExcelBudget(String testname, String output, String sheetname, String path) throws IOException {

		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = null;
		Workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = Workbook.getSheet(sheetname);
		Row newRow = sheet.createRow(0);
		String s[] = { testname, output };
		for (int j = 0; j < 2; j++) {
			Cell cell = newRow.createCell(j);
			cell.setCellValue(s[j]);
		}
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		Workbook.write(outputStream);
		outputStream.close();
	}
}
