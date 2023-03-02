package com.RE.Engineering.Test;

import org.testng.annotations.Test;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Labour_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Labour_List labourList = null;

	@Test
	public void labour() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		labourList = new com.RE.Engineering.ObjectRepository.Labour_List(oBrowser);
		
		labourList.MenuSubMenu();
		labourList.Go();
		labourList.projectwithdate();
	}
}
 		