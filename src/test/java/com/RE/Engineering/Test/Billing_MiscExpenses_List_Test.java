package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Billing_MiscExpenses_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_MiscExpenses_List MiscExpenses = null;

	@Test
	public void MiscExpenses() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		MiscExpenses = new com.RE.Engineering.ObjectRepository.Billing_MiscExpenses_List(oBrowser);
		
		MiscExpenses.MenuSubMenu();
		MiscExpenses.go();
		MiscExpenses.project();
		MiscExpenses.projectwithstatus();
	}
}
 		