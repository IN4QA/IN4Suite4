package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_BrokerInvoice_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Billing_BrokerInvoice_List BrokerInvoices=null;
	
	@Test
	
	public void brokerinvoice() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		BrokerInvoices= new com.RE.Sales.ObjectRepository.Billing_BrokerInvoice_List(oBrowser);
		BrokerInvoices.MenuSubMenu();
		BrokerInvoices.go();
		BrokerInvoices.projectfilter();
		}
}


