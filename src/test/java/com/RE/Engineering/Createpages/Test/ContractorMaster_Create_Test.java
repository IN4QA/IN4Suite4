package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ContractorMaster_Create_Test extends DriverScript{
	
	public static com.RE.Engineering.Createpages.ObjectRepository.ContractorMaster_Create contractormaster = null;

	@Test
	public void contractormastercreate() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		contractormaster = new com.RE.Engineering.Createpages.ObjectRepository.ContractorMaster_Create(oBrowser);
		
		contractormaster.MenuSubMenu();
		contractormaster.contractorCreate();
	}
}