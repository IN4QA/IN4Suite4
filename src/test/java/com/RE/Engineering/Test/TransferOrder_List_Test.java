package com.RE.Engineering.Test;

import org.testng.annotations.Test;


import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class TransferOrder_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.TransferOrder_List TransferOrder = null;

	@Test
	public void transferorderlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		TransferOrder = new com.RE.Engineering.ObjectRepository.TransferOrder_List(oBrowser);
		
		TransferOrder.MenuSubMenu();
		TransferOrder.material();		
		TransferOrder.asset();
		TransferOrder.materialwithfromstore();		
		TransferOrder.assetwithfromstore();
	}
}