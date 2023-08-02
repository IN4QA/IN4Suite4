package Utilities;

/*********************************
 * class Name	: methods.Frames
 * Purpose		: for frames related operations
 * Author		: Ganesh
 * Date Creation: 05th-August-2019
 * Example		: 
 * 
 * ******************************
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Frames extends DriverScript {

	/*********************************
	 * Method Name : Container() Purpose : to switch to the Container Author :
	 * Ganesh Date Creation: 05th-August-2021 Example : Container;
	 * ******************************
	 */
	public static boolean Container() {

		try {
			if (oBrowser.findElements(By.id("erpContainer")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("erpContainer")));
				oBrowser.switchTo().frame(oBrowser.findElement(By.id("erpContainer")));
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

//Check for MVC Flag
	public static boolean isMVC() {
		if (oBrowser.findElements(By.id("erpContainer")).size() != 0)
			return true;
		else
			return false;
	}

	/*********************************
	 * Method Name : MainMenuFrame() Purpose : to switch to the MainMenuFrame Author
	 * : Ganesh Date Creation: 05th-August-2019 Example : MainMenuFrame;
	 * 
	 * ******************************
	 */

	public static void MainMenuFrame() {
		try {

			oBrowser.switchTo().defaultContent();
			if (isMVC()) {
				Container();
			}
			w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainmenuFrame"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/*********************************
	 * Method Name : SubMenuFrame() Purpose : to switch to the SubMenuFrame Author :
	 * Ganesh Date Creation: 05th-August-2019 Example : SubMenuFrame;
	 * 
	 * ******************************
	 */

	public static boolean SubMenuFrame() {
		try {

			oBrowser.switchTo().defaultContent();
			if (isMVC()) {
				Container();
			}
			System.out.println("submenu:" + oBrowser.findElements(By.cssSelector("iframe[name='submenuFrame']")).size());
			// if(oBrowser.findElements(By.cssSelector("frame[name='submenuFrame']")).size()>0)
			if (oBrowser.findElements(By.cssSelector("iframe[name='submenuFrame']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("submenuFrame"));
				
				//adding a method
				//Frames.leftDiv();
				
				
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	/*********************************
	 * Method Name : mainFrame() Purpose : to switch to the mainFrame Author :
	 * Ganesh Date Creation: 05th-August-2019 Example : mainFrame;
	 * 
	 * ******************************
	 */

	public static boolean mainFrame() {
		try {

			oBrowser.switchTo().defaultContent();
			if (isMVC()) {
				Container();
			}
			if (oBrowser.findElements(By.cssSelector("iframe[name='mainFrame']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame"));

				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	/*********************************
	 * Method Name : rightFrame() Purpose : to switch to the rightFrame Author :
	 * Ganesh Date Creation: 05th-August-2019 Example : rightFrame;
	 * 
	 * ******************************
	 */
	public static boolean rightFrame() {
		try {
			mainFrame();
														// right frame
			if (oBrowser.findElements(By.cssSelector("frame[name='rightframe']")).size() > 0) {
																	// right frame
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightframe"));
			
				return true;
			} else {
				System.out.println("Exception While Switching to right frame");
				appInd.captureScreenShot();
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	/*********************************
	 * Method Name	: leftFrame()
	 * Purpose		: to switch to the leftFrame
	 * Author		: Ganesh
	 * Date Creation: 05th-August-2019
	 * Example		: leftFrame;
	 * 
	 * ******************************
	 */
	
	public static boolean leftDiv() {
		try {

			oBrowser.switchTo().defaultContent();
			if (isMVC()) {
				Container();
			}
			System.out.println("submenu:" + oBrowser.findElements(By.cssSelector("iframe[name='submenuFrame']")).size());
			if (oBrowser.findElements(By.cssSelector("iframe[name='submenuFrame']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("submenuFrame"));				
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	/*********************************
	 * Method Name : tabFrame() Purpose : to switch to the tabFrame Author : Ganesh
	 * Date Creation: 05th-August-2019 Example : tabFrame;
	 * 
	 * ******************************
	 */

	public static boolean tabFrame() {
		try {
			rightFrame();
			if (oBrowser.findElements(By.cssSelector("frame[name='TabFrame']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("TabFrame"));
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
	
	public static boolean innerFrame() {
		try {
			rightFrame();
			if (oBrowser.findElements(By.cssSelector("frame[name='mainDn']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainDn"));
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	/*********************************
	 * Method Name : contentFrame() Purpose : to switch to the contentFrame Author :
	 * Ganesh Date Creation: 05th-August-2019 Example : contentFrame;
	 * 
	 * ******************************
	 */
	public static void contentFrame() {

		mainFrame();
		w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ContentFrame"));

	}

	/*********************************
	 * Method Name : mainDnFrame() Purpose : to switch to the mainDnFrame Author :
	 * Ganesh Date Creation: 05th-August-2019 Example : mainDnFrame;
	 * 
	 * ******************************
	 */
	public static boolean mainDnFrame() {
		try {
			rightFrame();
			if (oBrowser.findElements(By.cssSelector("frame[name='mainDn']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainDn"));
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

	public static boolean iFrame() {
		try {
			rightFrame();
			if (oBrowser.findElements(By.cssSelector("iframe[id= 'addEditDialog']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("addEditDialog"));
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}
	public static boolean bookingAccountFrame() {
		try {
			if (oBrowser.findElements(By.cssSelector("frame[name='AccountDetails']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("AccountDetails"));
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
	public static boolean bookingAccountTabFrame() {
		try {
			if (oBrowser.findElements(By.cssSelector("frame[name='AccountTabFrame']")).size() > 0) {
				w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("AccountTabFrame"));
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	
	
	public static boolean myMainFrame() {
        try {
            if (oBrowser.findElements(By.cssSelector("frame[name='mymainFrame']")).size() > 0) {
                w2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mymainFrame"));

 

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

 

    }

}