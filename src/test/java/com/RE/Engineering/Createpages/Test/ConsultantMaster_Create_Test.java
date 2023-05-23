package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ConsultantMaster_Create_Test extends DriverScript {
	
	public static com.RE.Engineering.Createpages.ObjectRepository.ConsultantMaster_Create contractormaster = null;

	@Test
	public void consultantmastercreate() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		contractormaster = new com.RE.Engineering.Createpages.ObjectRepository.ConsultantMaster_Create(oBrowser);
		
		contractormaster.MenuSubMenu();
		contractormaster.consultantcreate();
	}
}