package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Utilities_AreaFinalization_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Utilities_AreaFinalization_List AreaFinlist=null;
	
	@Test
	
	public void areafinallist() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		AreaFinlist= new com.RE.Sales.ObjectRepository.Utilities_AreaFinalization_List(oBrowser);
		AreaFinlist.MenuSubMenu();
		AreaFinlist.mandatoryfilters();
		AreaFinlist.mandatorywithstatus();
	}
}


