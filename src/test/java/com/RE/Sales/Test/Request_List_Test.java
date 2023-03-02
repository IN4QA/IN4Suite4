package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Request_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Request_List_Test extends DriverScript{

	public static Request_List Request = null;
	@Test
	public void Request_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Request = new Request_List(oBrowser);
		Request.MenuSubMenu();
		
		Request.noFilter();
		Request.promotion();
	}
}
