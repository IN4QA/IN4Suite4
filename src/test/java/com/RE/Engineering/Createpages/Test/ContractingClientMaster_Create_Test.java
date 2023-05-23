package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ContractingClientMaster_Create_Test extends DriverScript {
	public static com.RE.Engineering.Createpages.ObjectRepository.ContractingClientMaster_Create clientmaster = null;

	@Test
	public void clientmastercreate() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		clientmaster = new com.RE.Engineering.Createpages.ObjectRepository.ContractingClientMaster_Create(oBrowser);
		
		clientmaster.MenuSubMenu();
		clientmaster.contractingclientcreate();
	}
}