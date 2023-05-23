package com.RE.Sales.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Biling_SolicitorReceipt_List_Test extends DriverScript{

	public static com.RE.Sales.ObjectRepository.Biling_SolicitorReceipt_List SolicitorReceiptList = null;
	@Test
	public void solicitorReceiptlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SolicitorReceiptList = new com.RE.Sales.ObjectRepository.Biling_SolicitorReceipt_List(oBrowser);
		SolicitorReceiptList.MenuSubMenu();
		SolicitorReceiptList.nofilters();
		SolicitorReceiptList.project();
		}
}