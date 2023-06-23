package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.Transaction_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Transaction_Create_Test extends DriverScript{

	public static Transaction_Create TransactionCreate = null;

	@Test
	public void transactionCreateTest() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		TransactionCreate = new Transaction_Create(oBrowser);
		
		TransactionCreate.MenuSubMenuUnit();	
		TransactionCreate.MenuSubMenuUnit();
		String unitNo = TransactionCreate.createUnit();
		TransactionCreate.MenuSubMenuLead();
		String leadname = TransactionCreate.createSalesIndividualLeads(unitNo);
		TransactionCreate.MenuSubMenuBooking();
		TransactionCreate.createBooking(unitNo, leadname);
		TransactionCreate.demandLetter(unitNo, leadname);
		TransactionCreate.createReceipt(unitNo);
		
	}
}
