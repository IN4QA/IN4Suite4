package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_CompanyPayment_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Billing_CompanyPayment_List companypayment=null;
	
	@Test
	
	public void companypayment() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		companypayment= new com.RE.Sales.ObjectRepository.Billing_CompanyPayment_List(oBrowser);
		companypayment.MenuSubMenu();
		companypayment.go();
		companypayment.projectandsubprojectfilter();
		}
}


