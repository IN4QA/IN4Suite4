package com.RE.Engineering.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_RateComparison_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_RateComparison_List tenderRatecomparison = null;

	@Test
	public void tenderRateComparisonList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		tenderRatecomparison = new com.RE.Engineering.ObjectRepository.Tendering_RateComparison_List(oBrowser);
		
		tenderRatecomparison.MenuSubMenu();
		tenderRatecomparison.go();
		//tenderRatecomparison.project();
	}
}