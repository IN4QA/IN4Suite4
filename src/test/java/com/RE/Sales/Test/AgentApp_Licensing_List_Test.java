package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AgentApp_Licensing_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.AgentApp_Licensing_List licensinglist=null;
	
	@Test
	
	public void LicensingList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		licensinglist=new com.RE.Sales.ObjectRepository.AgentApp_Licensing_List(oBrowser);
		licensinglist.MenuSubMenu();
		licensinglist.nofilters();
		licensinglist.enableuser();
		licensinglist.disableuser();
	}

}
