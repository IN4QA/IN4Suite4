package Utilities;

import org.openqa.selenium.Proxy;

/************************************
 * class Name	: methods.AppDependentMethods
 * Purpose		: to perform applicatiuon related operation
 * Author		: Sachin
 * Reviewer		: Ganesh
 * Example		:
 * ***********************************
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import Utilities.DriverScript;
import io.github.bonigarcia.wdm.WebDriverManager;



public class AppDependentMethods extends DriverScript {
	
	static final String ZAP_PROXY_ADDRESS="localhost";
	static final int ZAP_PROXY_PORT=8080;
	static final String ZAP_API_KEY="qngkddvrnrla82tpa4jo6cggeb";
	public static ClientApi api;

	/************************************
	 * Method Name : launchBrowser() Purpose : to launch the browser Author : Sachin
	 * Reviewer : Ganesh Example :WebDriver =launchBrowser("Browser Name"));
	 * ***********************************
	 */
	public WebDriver launchBrowser(String br) throws InterruptedException {

		
		
		try
		{
			if (br.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver", appInd.readConfig("chromepath"));
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			
			}
			else if (br.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", appInd.readConfig("iepath"));
				oBrowser=new InternetExplorerDriver();
				oBrowser.manage().window().maximize();
			}
			return oBrowser;
			
		} catch(Exception e) {
			System.out.println(e);
			return null;
			
		}

	}
	

	/************************************
	 * Method Name : launchBrowser() Purpose : to launch the browser Author : Sachin
	 * Reviewer : Ganesh Example :WebDriver =launchBrowser("Browser Name"));
	 * ***********************************
	 */
	public boolean navigateToApp() {
		try {
			oBrowser.navigate().to(appInd.readConfig("baseURL"));
			if (oBrowser.getTitle().contains("In4Suite® RE LOGIN")) {

				return true;
			} else {

				return false;
			}

		} catch (Exception e) {

			return false;
		}

	}

	/************************************
	 * Method Name : closeDriver() Purpose : to close the browser Author : Sachin
	 * Reviewer : Ganesh Example : boolean =closeDriver();
	 * ***********************************
	 */
	public boolean closeDriver() {
		try {
			oBrowser.switchTo().defaultContent();
			lgnpage.logout();
			oBrowser.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	

}
