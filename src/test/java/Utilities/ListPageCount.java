package Utilities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.RE.Submodules.Engineering;
public class ListPageCount extends DriverScript
{
	/*********************************
	 * Method Name	: ListPageCount()
	 * Purpose		: To count the number of records in list page
	 * Author		: Sandhya
	 * Date Creation: 17th-August-2021
	 * 
	 **********************************
	 */

	public static int multi;
	public static int records;
	public static String pagelistname;
	public static int row=0,col=1;
	public static void PageCount(String testname) throws Exception
	{
				
		 
		 try {
		// Total record count
		 String TotalNoOfRecords=oBrowser.findElement(By.xpath("//span[contains(text(), ' Displaying')]")).getText().split(" ")[5];
		 System.out.println("Total number of records Expected: "+TotalNoOfRecords);
		 records = Integer.parseInt(TotalNoOfRecords);
		 }catch(Exception e) {}
		 
		 try {
			 // To get ID of each page in case multiple pages
			pagelistname = oBrowser.findElement(By.xpath("//table[@class='in4-table']//table")).getAttribute("id");
			 System.out.println("----------------------------   "+pagelistname);
		 }catch(Exception e) {}
		 	
		 try {
			  multi = oBrowser.findElements(By.id(pagelistname)).size();
			
			 }catch(Exception e) {}
		 
		 System.out.println("if number is more than 1 than is its multipage: "+multi);
		 
		 // To check if single or multi page
		 if(multi>0) {			 
			 
			 oBrowser.findElement(By.xpath("//input[contains(@id,'lastButton')]")).click();
			 Thread.sleep(2000);
			 // To count Total no. of pages 
			 List<WebElement> totalpage=oBrowser.findElements(By.xpath("//table[@id = '"+pagelistname+"']//tr[2]//a"));
			 int pageNo = totalpage.size();
			 String text = oBrowser.findElement(By.xpath("//table[@id = '"+pagelistname+"']//tr[2]//a["+pageNo+"]")).getText();
			 int ActualPage = Integer.parseInt(text);	
			 //Record count in each page
			 int semiTotal = ActualPage * 30;
			 // Total records in last page
			 int listedrecord = (Engineering.recordListed().size()) - 2;
			 
			 System.out.println("Total number of records displayed : " +(semiTotal+listedrecord));
			 System.out.println("method name :"+testname);
			 if(records == (semiTotal+listedrecord)) {
			 try {
				 Datatable.writeExcel(testname, "PASS");
				 Assert.assertEquals(records, (semiTotal+listedrecord));
			 }catch(Exception e) {
				 System.out.println(e);
			 }
			 }else {
				 Datatable.writeExcel(testname, "FAIL");
			 }
			 row++;
			
		 }else {
			 //To get the record count in Single Page
			 List<WebElement> totalindentno=oBrowser.findElements(By.xpath("//table[@class='in4-table']/tbody/tr/td[1]"));
			 int size = totalindentno.size();
			 if(size>0)
			 {
				 System.out.println("Total Indents displayed in case of single page: " + size);		 
			 }
			 else
			 {
			 System.out.println("No records are displayed in case of single page: ");
			 }
		 }
 }
}
	


