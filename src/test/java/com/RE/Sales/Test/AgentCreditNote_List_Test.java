/**
 * 
 */
package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class AgentCreditNote_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.AgentCreditNote_List creditnotelist=null;
	
	@Test
	
	public void CreditNoteList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();  
		login.loginTest();
		creditnotelist=new com.RE.Sales.ObjectRepository.AgentCreditNote_List(oBrowser);
		creditnotelist.MenuSubMenu();
		creditnotelist.company();
		creditnotelist.project();
	}
	
}
