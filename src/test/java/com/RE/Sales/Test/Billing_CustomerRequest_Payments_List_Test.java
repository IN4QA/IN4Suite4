package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_CustomerRequest_Payments_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Billing_CusRequest_Payment_List payments=null;
	
	@Test
	
	public void customerpayments() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		payments= new com.RE.Sales.ObjectRepository.Billing_CusRequest_Payment_List(oBrowser);
		payments.MenuSubMenu();
		payments.go();
		payments.projectandsubprojectfilter();
		}
}


