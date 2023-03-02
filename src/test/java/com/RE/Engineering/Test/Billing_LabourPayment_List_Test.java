package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_LabourPayment_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Billing_LabourPayment_List labourpaymentlist=null;
	
	@Test
	public void labourPayment() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		labourpaymentlist=new com.RE.Engineering.ObjectRepository.Billing_LabourPayment_List(oBrowser);
		
		labourpaymentlist.MenuSubMenu();
		labourpaymentlist.nofilters();
		labourpaymentlist.projectfilter();
		labourpaymentlist.subprojectfilter();
		
	}

}
