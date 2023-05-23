package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Billing_Payments_List_Test extends  DriverScript{

	public static com.RE.Sales.ObjectRepository.Billing_Payments_List BillingPaymentsList = null;
	@Test
	public void billingpaymentslist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		BillingPaymentsList = new com.RE.Sales.ObjectRepository.Billing_Payments_List(oBrowser);
		BillingPaymentsList.MenuSubMenu();
		BillingPaymentsList.nofilter();
		BillingPaymentsList.project();
		}
}
