package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.Pur_Payment_Flow;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Pur_Payment_Flow_Test extends DriverScript{
	public static Pur_Payment_Flow PurPaymentFlow=null;
	@Test
	public void PurchaseTransactionCreate() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		PurPaymentFlow=new Pur_Payment_Flow(oBrowser);
		
		PurPaymentFlow.MenuSubMenuIndent();
		PurPaymentFlow.Indent();	
		
		PurPaymentFlow.MenuSubMenuPO();
		PurPaymentFlow.PurchaseOrder();
		
		PurPaymentFlow.MenuSubMenuGRN();
		PurPaymentFlow.GRN();
		
		PurPaymentFlow.MenuSubMenuAdvance();
		PurPaymentFlow.CreateSuppAdvanace();
		
		PurPaymentFlow.MenuSubMenuSuppDN();
		PurPaymentFlow.SuppDebitNoteCreation();
		
		PurPaymentFlow.MenuSubMenuSupPayment();
		PurPaymentFlow.SupplierPaymentCreation();
		
		PurPaymentFlow.MenuSubMenuSuppDNReceipt();
		PurPaymentFlow.SupplierDebitNoteReceiptCreation();
		
		PurPaymentFlow.MenuSubMenuServiceAdvance();
		PurPaymentFlow.ServiceAdvanceCreation();
		
		PurPaymentFlow.MenuSubMenuServDN();
		PurPaymentFlow.ServDNCreation();
	
		PurPaymentFlow.MenuSubMenuServicecertifiacte();
		PurPaymentFlow.Servcertcreation();
		
		PurPaymentFlow.MenuSubMenuServDNReceipt();
		PurPaymentFlow.ServiceDebitNoteReceiptCreation();
		
	}

}
