package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Market_Intelligence_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Market_Intelligence_List intelligencelist=null;
	
	@Test
	
	public void IntelligenceList() throws Throwable{
	FullApplicationTestScripts login=new FullApplicationTestScripts();
	login.loginTest();
	intelligencelist=new com.RE.Sales.ObjectRepository.Market_Intelligence_List(oBrowser);
	intelligencelist.MenuSubMenu();
	intelligencelist.nofilters();
	
	}
}
