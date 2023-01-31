package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class PO_List_Test extends DriverScript{

	public static com.RE.Engineering.ObjectRepository.PO_List POList = null;
	
	@Test
	public void PO_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		POList = new com.RE.Engineering.ObjectRepository.PO_List(oBrowser);
		
		POList.MenuSubMenu();
//		POList.getPoLink();
		POList.Unfullfilled();
		POList.fullFilled();
		POList.ROPO();
		POList.All_Radio();
		
		
		
		
	}
}
