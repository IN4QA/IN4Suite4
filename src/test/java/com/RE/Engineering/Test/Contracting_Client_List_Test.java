package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Contracting_Client_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Contracting_Client_List clientlist=null;
	
	@Test
	public void contractingclient() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		clientlist=new com.RE.Engineering.ObjectRepository.Contracting_Client_List(oBrowser);
		
		clientlist.MenuSubMenu();
		clientlist.allclients();
		clientlist.activeclients();
		clientlist.inactiveclients();
		
	}

}
