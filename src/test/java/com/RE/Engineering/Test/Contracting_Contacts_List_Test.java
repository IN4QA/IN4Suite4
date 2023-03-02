package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Contracting_Contacts_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Contracting_Contacts_List contactslist=null;
	
	@Test
	
	public void ContractingContacts() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		contactslist=new com.RE.Engineering.ObjectRepository.Contracting_Contacts_List(oBrowser);
		contactslist.MenuSubMenu();
		contactslist.nofilter();
	}

}
