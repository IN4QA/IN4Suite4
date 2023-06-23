package com.RE.Expenses.Create.Test;

import org.testng.annotations.Test;
import com.RE.Expenses.Create.ObjectRepository.WO_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class WO_Create_Test extends DriverScript {

	public static WO_Create WOCreate = null;

	@Test
	public void BudgetPeriodCreateTest() throws Throwable {		
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		
		WOCreate = new WO_Create(oBrowser);
		WOCreate.MenuSubMenu();
		WOCreate.createWO();
	}
}