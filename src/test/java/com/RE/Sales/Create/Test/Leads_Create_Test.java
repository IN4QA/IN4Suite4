package com.RE.Sales.Create.Test;
import java.util.Random;

import org.testng.annotations.Test;
import com.RE.Sales.Create.ObjectRepository.Leads_Create;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Leads_Create_Test extends DriverScript{

	public static Leads_Create LeadsCreate = null;

	@Test
	public void LeadsCreateTest() throws Throwable {

		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		LeadsCreate = new Leads_Create(oBrowser);
		LeadsCreate.MenuSubMenu();
		LeadsCreate.createLead();
		
	}
}
