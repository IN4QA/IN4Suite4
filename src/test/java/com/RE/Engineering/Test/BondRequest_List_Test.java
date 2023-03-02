package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BondRequest_List_Test extends DriverScript{
	public static com.RE.Engineering.ObjectRepository.BondRequest_List bondrequestlist=null;
	
	@Test
	
	public void BondRequestList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		bondrequestlist=new com.RE.Engineering.ObjectRepository.BondRequest_List(oBrowser);
		bondrequestlist.MenuSubMenu();
		bondrequestlist.clientname();
		
		}

}

// No Data is listing in 'Client Name' dropdown in auto server