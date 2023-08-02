package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class MaterialBuyer_List_Test extends DriverScript{
	
 public static com.RE.Purchase.ObjectRepository.MaterialBuyer_List materialbuyerlist=null;
	@Test
	public void materialbuyer() throws Throwable {
		try {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		materialbuyerlist=new com.RE.Purchase.ObjectRepository.MaterialBuyer_List(oBrowser);
		materialbuyerlist.MainSubmenu();
		materialbuyerlist.go();
		materialbuyerlist.location();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	
}
