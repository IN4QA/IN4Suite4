package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BillingCreditNote_List_Test extends DriverScript {
	
public static com.RE.Engineering.ObjectRepository.BillingCreditNote_List crditnotelist=null;
	
	@Test
	public void CrditNotelist() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		crditnotelist=new com.RE.Engineering.ObjectRepository.BillingCreditNote_List(oBrowser);
		crditnotelist.MenuSubMenu();
		crditnotelist.project();
		crditnotelist.projectwithstatus();
	}
}

//Data is not listing in the project dropdown in auto server 