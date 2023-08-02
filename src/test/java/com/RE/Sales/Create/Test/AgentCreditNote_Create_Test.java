package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.AgentCreditNote_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AgentCreditNote_Create_Test extends DriverScript{
	
	public static AgentCreditNote_Create AgentCreditNoteCreate=null;
	@Test
	public void CreateAgentCreditNote() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		AgentCreditNoteCreate=new AgentCreditNote_Create(oBrowser);
		AgentCreditNoteCreate.MenuSubMenuAgentCreditNote();
		AgentCreditNoteCreate.SalesAgentCreditNoteCreation();
	}

}
