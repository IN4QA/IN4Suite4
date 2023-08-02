package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.Sales_PaymentFlow;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Sales_PaymentFlow_Test extends DriverScript {
	
	public static Sales_PaymentFlow SalesPaymentFlow = null;
			
	@Test
	public void SalesPaymentFlowTest() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SalesPaymentFlow = new Sales_PaymentFlow(oBrowser);
		
		SalesPaymentFlow.MenuSubMenuUnit();	
		SalesPaymentFlow.MenuSubMenuUnit();
		String unitNo = SalesPaymentFlow.createUnit();
		SalesPaymentFlow.AddChargeTypes();
		SalesPaymentFlow.MenuSubMenuLead();
		String leadname = SalesPaymentFlow.createSalesIndividualLeads(unitNo);
		SalesPaymentFlow.MenuSubMenuBooking();
		SalesPaymentFlow.createBooking(unitNo, leadname);
		SalesPaymentFlow.demandLetter(unitNo, leadname);
		SalesPaymentFlow.createReceipt(unitNo);
		SalesPaymentFlow.MenuSubMenuCutomerCreditNote();
		SalesPaymentFlow.CutomerCreditNoteCreation();
		SalesPaymentFlow.MenuSubMenuCutomerDebitNote();
		SalesPaymentFlow.CutomerDebitNoteCreation();
	}

}
