package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Customers_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Customers_List_Test extends DriverScript {

	public static Customers_List customersList = null;
	@Test
	public void Leads_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		customersList = new Customers_List(oBrowser);
		customersList.MenuSubMenu();
		
		customersList.noFilter();
		customersList.CustomersCount();
	}
}
