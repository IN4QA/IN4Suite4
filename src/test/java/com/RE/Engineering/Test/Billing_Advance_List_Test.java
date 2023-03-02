package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.ObjectRepository.Billing_Advance_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Billing_Advance_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_Advance_List Advance = null;

	@Test
	public void Advance() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Advance = new com.RE.Engineering.ObjectRepository.Billing_Advance_List(oBrowser);
		
		Advance.MenuSubMenu();
		Advance.project();
		Advance.projectwithstatus();
	}
}
 		