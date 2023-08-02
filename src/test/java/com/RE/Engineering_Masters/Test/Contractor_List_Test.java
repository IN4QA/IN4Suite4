package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Contractor_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.Contractor_List contractorlist = null;

	@Test
	public void contractorlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		contractorlist = new com.RE.Engineering_Masters.ObjectRepository.Contractor_List(oBrowser);
		
		contractorlist.MenuSubMenu();
		//contractorlist.Go();
		contractorlist.status();
	}
}