package com.RE.Engineering.Test;

import org.testng.annotations.Test;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Billing_WO_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_WO_List WOcertList = null;

	@Test
	public void WOPaymentslist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		WOcertList = new com.RE.Engineering.ObjectRepository.Billing_WO_List(oBrowser);
		
		WOcertList.MenuSubMenu();
		WOcertList.project();
		WOcertList.projectwithstatus();
	}
}
 		