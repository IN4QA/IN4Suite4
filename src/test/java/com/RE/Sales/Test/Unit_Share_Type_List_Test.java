package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Unit_Share_Type_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Unit_Share_Type_List_Test extends DriverScript{

	public static Unit_Share_Type_List UnitShareTypeList = null;
	@Test
	public void Send_Email_SMS_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		UnitShareTypeList = new Unit_Share_Type_List(oBrowser);
		UnitShareTypeList.MenuSubMenu();
		
		UnitShareTypeList.UnitShareType();
	}
}
