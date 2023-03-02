package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.Sales_Agent_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Sales_Agent_List_Test extends DriverScript{

	public static Sales_Agent_List SAgentList = null;
	@Test
	public void Sales_Agent_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SAgentList = new Sales_Agent_List(oBrowser);
		SAgentList.MenuSubMenu();
		
		SAgentList.noFilter();
	}
}
