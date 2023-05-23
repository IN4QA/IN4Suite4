package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_ContractorResponse_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_ContrResponse_List ContResponse = null;

	@Test
	public void ContResponse() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		ContResponse = new com.RE.Engineering.ObjectRepository.Tendering_ContrResponse_List(oBrowser);
		
		ContResponse.MenuSubMenu();
		ContResponse.go();
		//ContResponse.project();
	}
}