package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.SuppPayment_Create;
import com.RE.Submodules.Purchase;
import com.github.dockerjava.api.model.Driver;

import MenuClick.FullApplicationTestScripts;
import Utilities.Datatable;
import Utilities.DriverScript;
import Utilities.MainMenu;

public class SuppPayment_Create_Test extends DriverScript{
	
	public static SuppPayment_Create SuppPaymentCreate=null;
	@Test
	public void CreateSuppPayment() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SuppPaymentCreate=new SuppPayment_Create(oBrowser);
		SuppPaymentCreate.MenuSubMenu();
		SuppPaymentCreate.SupplierPaymentCreation();
	
	}
	

}
