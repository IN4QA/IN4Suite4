package Utilities;

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
import org.openqa.selenium.ie.InternetExplorerDriver;
import Utilities.DriverScript;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppDependentMethods extends DriverScript {

	/************************************
	 * Method Name : launchBrowser() Purpose : to launch the browser Author : Sachin
	 * Reviewer : Ganesh Example :WebDriver =launchBrowser("Browser Name"));
	 * ***********************************
	 */
	public WebDriver launchBrowser(String br) throws InterruptedException {

		try {
			if (br.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				oBrowser = new ChromeDriver();
				oBrowser.manage().window().maximize();

			} else if (br.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", appInd.readConfig("iepath"));
				oBrowser = new InternetExplorerDriver();
				oBrowser.manage().window().maximize();
			}
			return oBrowser;

		} catch (Exception e) {
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
