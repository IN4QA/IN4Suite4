package com.RE.Expenses.Create.Test;
import org.testng.annotations.Test;

import com.RE.Expenses.Create.ObjectRepository.BudgetPeriod_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class BudgetPeriod_Create_Test extends DriverScript{

	public static BudgetPeriod_Create BudgetPeriodCreate = null;

	@Test
	public void BudgetPeriodCreateTest() throws Throwable {		
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		
		BudgetPeriodCreate = new BudgetPeriod_Create(oBrowser);
		BudgetPeriodCreate.MenuSubMenu();
		BudgetPeriodCreate.createBudgetPeriod();
	}
}
