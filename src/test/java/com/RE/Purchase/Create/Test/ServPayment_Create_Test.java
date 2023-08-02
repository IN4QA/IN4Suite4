package com.RE.Purchase.Create.Test;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.ServPayment_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServPayment_Create_Test extends DriverScript{

	
	public static ServPayment_Create ServPaymentCreate=null;
	@Test
	public void CreateServPayment() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		ServPaymentCreate=new ServPayment_Create(oBrowser);
		
		ServPaymentCreate.MenuSubMenuServicecertifiacte();
		ServPaymentCreate.Servcertcreation();
		
	}
}
