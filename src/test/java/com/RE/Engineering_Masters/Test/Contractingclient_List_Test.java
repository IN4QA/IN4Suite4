package com.RE.Engineering_Masters.Test;

import org.testng.annotations.Test;


import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Contractingclient_List_Test extends DriverScript{
	
	public static com.RE.Engineering_Masters.ObjectRepository.Contractingclient_List contclientlist = null;

	@Test
	public void contClientList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		contclientlist = new com.RE.Engineering_Masters.ObjectRepository.Contractingclient_List(oBrowser);
		
		contclientlist.MenuSubMenu();
		contclientlist.Go();
		//contclientlist.status();
	}
}