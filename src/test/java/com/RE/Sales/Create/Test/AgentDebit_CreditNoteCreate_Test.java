package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.AgentDebit_CreditNoteCreate;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AgentDebit_CreditNoteCreate_Test extends DriverScript{
	public static AgentDebit_CreditNoteCreate AgentDebitCreditNoteCreate=null;
	@Test
	public void CreateAgentDebitCreditNote() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		AgentDebitCreditNoteCreate=new AgentDebit_CreditNoteCreate(oBrowser);
		AgentDebitCreditNoteCreate.SalesAgentDebitCreditNoteCreation();
	}

}
