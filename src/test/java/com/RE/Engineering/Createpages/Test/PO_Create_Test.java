package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.PO_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class PO_Create_Test extends DriverScript{
	
	public static PO_Create createPO=null;
	@Test
	public  void POCreation() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		createPO=new PO_Create(oBrowser);
		createPO.MenuSubMenu();
		createPO.PurchaseorderCreate();
		
	}
}
