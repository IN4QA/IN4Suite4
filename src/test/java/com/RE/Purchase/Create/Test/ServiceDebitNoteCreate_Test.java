package com.RE.Purchase.Create.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.ServiceDebitNoteCreate;

public class ServiceDebitNoteCreate_Test extends DriverScript{
	
	public static ServiceDebitNoteCreate ServiceDebitNoteCreate=null;
	@Test
	public void ServiceDebitNoteCreation() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		ServiceDebitNoteCreate=new ServiceDebitNoteCreate(oBrowser);
		ServiceDebitNoteCreate.MenuSubMenuServDN();
		ServiceDebitNoteCreate.ServDNCreation();
	}

}
