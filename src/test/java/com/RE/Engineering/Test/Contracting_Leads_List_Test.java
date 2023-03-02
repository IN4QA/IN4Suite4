package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Contracting_Leads_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Contracting_Leads_List leadslist=null;
	@Test
	public void contactinglead() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		leadslist=new com.RE.Engineering.ObjectRepository.Contracting_Leads_List(oBrowser);
		leadslist.MenuSubMenu();
		leadslist.allleads();
		leadslist.activeleads();
		leadslist.inactiveleads();
		
	}
}
