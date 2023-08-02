package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.booking_Documents_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class booking_Documents_List_Test extends DriverScript{

	public static booking_Documents_List booking_Documents_List = null;
	@Test
	public void Request_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		booking_Documents_List = new booking_Documents_List(oBrowser);
		booking_Documents_List.MenuSubMenu();
		
		booking_Documents_List.project();
	}
}
