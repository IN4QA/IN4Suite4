package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Create.ObjectRepository.Leads_Create;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Leads_Create_Test extends DriverScript{

	public static Leads_Create LeadsCreate = null;
	@Test
	public void main() throws Throwable {
		
	
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		LeadsCreate = new Leads_Create(oBrowser);
		LeadsCreate.MenuSubMenu();
		LeadsCreate.createLead();
		
	}
	
}
