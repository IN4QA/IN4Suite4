package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_CompanyDebitNote_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Billing_CompanyDebitNote_List companyDN=null;
	
	@Test
	
	public void companyDN() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		companyDN= new com.RE.Sales.ObjectRepository.Billing_CompanyDebitNote_List(oBrowser);
		companyDN.MenuSubMenu();
		companyDN.go();
		companyDN.companyfilter();
		}
}

