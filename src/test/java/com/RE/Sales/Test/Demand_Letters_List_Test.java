package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Demand_Letters_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Demand_Letters_List_Test extends DriverScript {

	public static Demand_Letters_List demandLettersList = null;
	@Test
	public void Demand_Letter_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		demandLettersList = new Demand_Letters_List(oBrowser);
		demandLettersList.MenuSubMenu();
		
		demandLettersList.DemandprojectSubProjectCount();
		
	}
}
