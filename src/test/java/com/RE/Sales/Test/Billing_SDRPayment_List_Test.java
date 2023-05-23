package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_SDRPayment_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Billing_SDRPayment_List SDRPayment=null;
	
	@Test
	
	public void SDRpayment() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SDRPayment= new com.RE.Sales.ObjectRepository.Billing_SDRPayment_List(oBrowser);
		SDRPayment.MenuSubMenu();
		SDRPayment.go();
		SDRPayment.projectandfromdatefilter();
		}
}


