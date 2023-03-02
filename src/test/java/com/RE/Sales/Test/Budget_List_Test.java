package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Budget_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Budget_List_Test extends DriverScript{

	public static Budget_List Budget = null;
	@Test
	public void Budget_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Budget = new Budget_List(oBrowser);
		Budget.MenuSubMenu();
		
		Budget.noFilter();
		Budget.promotion();
	}
}
