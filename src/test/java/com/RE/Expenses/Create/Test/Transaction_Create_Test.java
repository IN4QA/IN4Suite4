package com.RE.Expenses.Create.Test;

import org.testng.annotations.Test;
import com.RE.Expenses.Create.ObjectRepository.Transaction_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Transaction_Create_Test extends DriverScript {

	public static Transaction_Create TransactionCreate = null;

	@Test
	public void BudgetPeriodCreateTest() throws Throwable {		
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		
		TransactionCreate = new Transaction_Create(oBrowser);
		TransactionCreate.MenuSubMenu();
		TransactionCreate.createBudgetPeriod();
		TransactionCreate.WOMenuSubMenu();
		TransactionCreate.createWO();
		TransactionCreate.ADVPAYMenuSubMenu();
		TransactionCreate.createAdvanceAndPayments();
	}
}
