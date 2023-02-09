package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class GRN_List_Test extends DriverScript{

	public static com.RE.Engineering.ObjectRepository.GRN_List GRNList = null;
	
	@Test
	public void GRN_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		GRNList = new com.RE.Engineering.ObjectRepository.GRN_List(oBrowser);
		
		GRNList.MenuSubMenu();
		GRNList.material();
		GRNList.Asset();
		GRNList.materialwithstatus();
		GRNList.assetwithstatus();
	}
}
