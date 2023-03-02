package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Promotion_Agent_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Promotion_Agent_List_Test extends DriverScript {

	public static Promotion_Agent_List PAgentList = null;
	@Test
	public void Promotion_Agent_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		PAgentList = new Promotion_Agent_List(oBrowser);
		PAgentList.MenuSubMenu();
		
		PAgentList.noFilter();
		PAgentList.expertiseCount();
	}
}
