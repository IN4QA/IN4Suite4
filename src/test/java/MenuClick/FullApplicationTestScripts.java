package MenuClick;


import java.awt.Frame;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.dom4j.dom.DOMElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Frames;

import com.google.common.graph.ElementOrder;

import Utilities.DriverScript;
import Utilities.LoginPage;
import MenuClick.PageCrash;
public class FullApplicationTestScripts extends DriverScript  {
	Actions aAction; 
	PageCrash crash = null;
   
	
	
	@Test
	public void loginTest() 
	{
		
		String browser = appInd.readConfig("Browser");
		try
		{
			oBrowser= appDep.launchBrowser(browser);
		    w2= new WebDriverWait(oBrowser,20);
			appDep.navigateToApp();
			utility.autoRunXml();
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		WebElement oEl = null;
		try
		{
			strTestName = "loginTest";
			lgnpage = new LoginPage(oBrowser);
			lgnpage.setUserName(appInd.readConfig("username"));
			lgnpage.setPassword(appInd.readConfig("password"));
			lgnpage.clickLogin();
		
		    datatable.setCellData(strController, "Sheet1", "Status", strTestName, "Pass");
			 	 
		} catch(Exception e)
		{
			System.out.println(e);
			datatable.setCellData(strController, "Sheet1", "Status", strTestName, "Fail");
		}	
	}
	
	@Test
	public void verify() throws InterruptedException
	{

		 
		WebElement oEL = null; 								
		
		 PageCrash pG = new PageCrash(oBrowser);
		 int i= 1;
		 String strStatus = null;
		 try
		 {
			 Frames.MainMenuFrame();
			 Iterator<WebElement> mainMenu = pG.getMainMenu().iterator();
			 while(mainMenu.hasNext())
			 {
				 Frames.MainMenuFrame();
				 oEL = mainMenu.next(); 
				try
				{menuName = oEL.getAttribute("class");} 
				catch(Exception e)
				{
					menuName= oBrowser.findElement(By.xpath("//body[@id='MainBody']/form/table/tbody/tr/td["+i+"]")).getAttribute("class");
				};
				 if(menuName.contains("DASH")) {
					 i++;
					 continue;
				 }		 
				  if(appInd.isStale(oEL))				
				  {
					  try
					  {
				          oEL = oBrowser.findElement(By.xpath("//body[@id='MainBody']/form/table/tbody/tr/td["+i+"]"));
						  appInd.isStale(oEL);
						  appInd.isAlertPresent();
					  }catch(Exception e) {};
				  }
				  i++;
				  if(Frames.mainFrame())
					{
					  strStatus+=String.valueOf(appInd.verifyPageCrash() );
					}
				  if(Frames.SubMenuFrame())
				  {
					// strStatus+=pG.clickOnSubMenu();
					  pG.subMenuLink();
				  }
			 }
			 if(strStatus.contains("false"))
			 {
				 datatable.setCellData("./ExecutionController/TestSet1.xlsx", "Sheet1", "Status", strTestName, "fail");
				 Assert.assertTrue(false);
			 } else
			 {
				 datatable.setCellData("./ExecutionController/TestSet1.xlsx", "Sheet1", "Status", strTestName, "fail");
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }	
	}

	   
}
