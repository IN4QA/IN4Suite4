package com.RE.Expenses.Create.Test;

import org.testng.annotations.Test;

import com.RE.Expenses.Create.ObjectRepository.AdvanceAndPayments_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class AdvanceAndPayments_Create_Test extends DriverScript {

	public static AdvanceAndPayments_Create AdvanceAndPaymentsCreate = null;

	@Test
	public void BudgetPeriodCreateTest() throws Throwable {		
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		
		AdvanceAndPaymentsCreate = new AdvanceAndPayments_Create(oBrowser);
		AdvanceAndPaymentsCreate.MenuSubMenu();
		AdvanceAndPaymentsCreate.createAdvanceAndPayments();
	}
}
