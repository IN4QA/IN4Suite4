package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class EstimationChargeType_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.EstimationChargeType_List EstChargeType = null;

	@Test
	public void estimationchargetype() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		EstChargeType = new com.RE.Engineering_Masters.ObjectRepository.EstimationChargeType_List(oBrowser);
		
		EstChargeType.MenuSubMenu();
		EstChargeType.Go();
		//EstChargeType.status();
	}
}