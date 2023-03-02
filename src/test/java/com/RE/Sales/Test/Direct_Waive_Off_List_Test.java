package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Direct_Waive_Off_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Direct_Waive_Off_List_Test extends DriverScript{


	public static Direct_Waive_Off_List DWavieOffNote = null;
	@Test
	public void tempReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		DWavieOffNote = new Direct_Waive_Off_List(oBrowser);
		DWavieOffNote.MenuSubMenu();
		
		DWavieOffNote.noFilter();
		DWavieOffNote.project();
	}
}
