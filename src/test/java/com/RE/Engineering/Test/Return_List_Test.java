package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.ObjectRepository.Return_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Return_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Return_List ReturnList = null;

	@Test
	public void ReturnInventry() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		ReturnList = new com.RE.Engineering.ObjectRepository.Return_List(oBrowser);
		
		ReturnList.MenuSubMenu();
		ReturnList.material();
		ReturnList.asset(); 
		ReturnList.matwithstatus();
	}
}
 		
