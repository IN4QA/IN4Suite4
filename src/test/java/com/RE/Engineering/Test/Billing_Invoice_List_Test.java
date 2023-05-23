package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_Invoice_List_Test extends DriverScript{
	public static com.RE.Engineering.ObjectRepository.Billing_Invoice_List invoicelist=null;
	
	@Test
	public void InvoiceList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		invoicelist=new com.RE.Engineering.ObjectRepository.Billing_Invoice_List(oBrowser);
		invoicelist.MenuSubMenu();
		invoicelist.nofilter();
		invoicelist.project();
		invoicelist.projectwithclient();
	}


}

