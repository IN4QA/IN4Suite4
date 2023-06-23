package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Create.ObjectRepository.Unit_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Unit_Create_Test extends DriverScript{

	public static Unit_Create UnitCreate = null;

	@Test
	public void unitCreateTest() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		UnitCreate = new Unit_Create(oBrowser);
		
		UnitCreate.MenuSubMenu();
		UnitCreate.createUnit();
	}
}
