package com.RE.Purchase.Create.Test;



import org.testng.annotations.Test;

import com.RE.Purchase.Create.ObjectRepository.SuppDebitNoteCreate;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SuppDebitNoteCreate_Test extends DriverScript{
	
	public static SuppDebitNoteCreate SuppDNCreate=null;
@Test
	public void CreateSuppDebitNote() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		SuppDNCreate=new SuppDebitNoteCreate(oBrowser);
		SuppDNCreate.MenuSubMenuSuppDN();
		SuppDNCreate.SuppDebitNoteCreation();
	}

}
