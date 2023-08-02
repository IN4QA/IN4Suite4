package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.Supp_MultiRecovery_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;
import Utilities.Frames;

public class Supp_MultiRecovery_Create_Test extends DriverScript{
	
	public static Supp_MultiRecovery_Create SuppMultiRecovery=null;
	
	@Test
	public void SuppMultiRecoveryCreate() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SuppMultiRecovery=new Supp_MultiRecovery_Create(oBrowser);
		
		SuppMultiRecovery.MenuSubMenuIndent();
		SuppMultiRecovery.Indent();	
		
		SuppMultiRecovery.MenuSubMenuPO();
		SuppMultiRecovery.PurchaseOrder();
		
		SuppMultiRecovery.MenuSubMenuGRN();
		SuppMultiRecovery.GRN();
		
		SuppMultiRecovery.MenuSubMenuAdvance();
		SuppMultiRecovery.CreateSuppAdvanace();
		
		SuppMultiRecovery.MenuSubMenuSuppDN();
		SuppMultiRecovery.SuppDebitNoteCreation();
	
		SuppMultiRecovery.MenuSubMenuSupPayment();
		SuppMultiRecovery.SupplierPaymentCreation();
		

		
	}

}
