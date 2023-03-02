package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.Leads_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Leads_List_Test extends DriverScript {

	public static Leads_List leadsList = null;
	@Test
	public void Leads_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		leadsList = new Leads_List(oBrowser);
		leadsList.MenuSubMenu();
		
		leadsList.noFilter();
		leadsList.leadsCount();
	}
}
