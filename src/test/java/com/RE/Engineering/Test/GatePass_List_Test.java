package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class GatePass_List_Test extends DriverScript {
	public static com.RE.Engineering.ObjectRepository.GatePass_List GatePass = null;

	@Test
	public void Gatepass() throws Throwable {
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		GatePass = new com.RE.Engineering.ObjectRepository.GatePass_List(oBrowser);
		
		GatePass.MenuSubMenu();
		GatePass.trasfer();
		GatePass.returnable();
		GatePass.nonreturnable();
}
}
