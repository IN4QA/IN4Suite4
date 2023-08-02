package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.AgentCreditNote_Create;
import com.RE.Sales.Create.ObjectRepository.AgentDebitNote_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AgentDebitNote_Create_Test extends DriverScript{
	
	public static AgentDebitNote_Create AgentDebitNoteCreate=null;
	@Test
	public void CreateAgentDebitNote() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		AgentDebitNoteCreate=new AgentDebitNote_Create(oBrowser);
		AgentDebitNoteCreate.MenuSubMenuAgentDebitNote();
		AgentDebitNoteCreate.SalesAgentDebitNoteCreation();
		
	}
}
