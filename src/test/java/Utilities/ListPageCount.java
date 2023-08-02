package Utilities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.RE.Submodules.Engineering;
import com.RE.Submodules.Sales;
import com.codeborne.selenide.impl.JavaScript;

public class ListPageCount extends DriverScript {
	/*********************************
	 * Method Name : ListPageCount() Purpose : To count the number of records in
	 * list page Author : Sandhya Date Creation: 17th-August-2021
	 * 
	 **********************************
	 */

	public static int multi;
	public static int records;
	public static String pagelistname;
	public static int row = 0, col = 1;

	public static void PageCount(String testname, String sheetname, String path) throws Exception {

		try {
			// Total record count
			String TotalNoOfRecords = oBrowser.findElement(By.xpath("//span[contains(text(), ' Displaying')]"))
					.getText().split(" ")[5];
			System.out.println("Total number of records Expected: " + TotalNoOfRecords);
			records = Integer.parseInt(TotalNoOfRecords);
		} catch (Exception e) {
		}

		try {
			// To get ID of each page in case multiple pages
			pagelistname = oBrowser.findElement(By.xpath("//table[contains(@class,'in4-table')]//table")).getAttribute("id"); 
			System.out.println("----------------------------   " + pagelistname);
		} catch (Exception e) {
		}

		try {
			multi = oBrowser.findElements(By.id(pagelistname)).size();

		} catch (Exception e) {
		}

		System.out.println("if number is more than 1 than is its multipage: " + multi);

		// To check if single or multi page
		if (multi > 0) {
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//input[contains(@id,'lastButton')]")).click();


//			 w2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[contains(@id,'lastButton')]")));
//			 oBrowser.findElement(By.xpath("//input[contains(@id,'lastButton')]")).click();
			
			// To count Total no. of pages
			List<WebElement> totalpage = oBrowser
					.findElements(By.xpath("//table[@id = '" + pagelistname + "']//tr[2]//a"));
			Thread.sleep(3000);
			int pageNo = totalpage.size();
			Thread.sleep(3000);
			System.out.println("pageNo  "+pageNo);
			String text = oBrowser
					.findElement(By.xpath("//table[@id = '" + pagelistname + "']//tr[2]//a[" + pageNo + "]")).getText();
			Thread.sleep(3000);
			int ActualPage = Integer.parseInt(text);
			Thread.sleep(3000);
			System.out.println("ACTUAL PAGE  "+ActualPage);
			// Record count in each page
			int semiTotal = ActualPage * 30;
			Thread.sleep(3000);
			// Total records in last page
			int listedrecord = (MainMenu.recordListed().size()) - 2;
			System.out.println("listed record in last page "+listedrecord);
			System.out.println("Total number of records displayed : " + (semiTotal + listedrecord));
			System.out.println("method name :" + testname);
			if (records == (semiTotal + listedrecord)) {
				try {
					Datatable.writeExcel(testname, "PASS", sheetname, path);
					Assert.assertEquals(records, (semiTotal + listedrecord));
				} catch (Exception e) {
					System.out.println(e);
				}
			} else {
				Datatable.writeExcel(testname, "FAIL", sheetname, path);
			}
			row++;

		} else {
			int emptyRecords = oBrowser.findElements(By.xpath("//td[text()='No Records Found.']")).size();
			if (emptyRecords > 0) {
				Datatable.writeExcel(testname, "No Records Found", sheetname, path);
			} else {
				List<WebElement> totalindentno = oBrowser
						.findElements(By.xpath("//table[contains(@class,'in4-table')]//tbody/tr/td[1]")); //table[@class='in4-table']/tbody/tr/td[1]
				int size = totalindentno.size();
				if (size > 0) {
					System.out.println("Total Records displayed in case of single page: " + size);
					Datatable.writeExcel(testname, "PASS", sheetname,path);
				}
			}
		}
	}
}
