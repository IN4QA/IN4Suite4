package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;
import com.RE.Sales.Create.ObjectRepository.PromotionAgent_Create;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class PromotionAgent_Create_Test extends DriverScript{

	public static PromotionAgent_Create createpromotionagent=null;
	@Test
	public void CreatePromotionAgent() throws Throwable {
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		createpromotionagent=new PromotionAgent_Create(oBrowser);
		createpromotionagent.MenuSubMenu();
		createpromotionagent.AgentCreation();
	}
	
}
