package com.RE.Engineering.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_TenderLinkToWO_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_TenderLinkToWO_List LinkToWO = null;

	@Test
	public void TenderLinkToWO() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		LinkToWO = new com.RE.Engineering.ObjectRepository.Tendering_TenderLinkToWO_List(oBrowser);
		
		LinkToWO.MenuSubMenu();
		LinkToWO.go();
		//tenderRatecomparison.project();
	}
}