package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServProvider_Advance_List_Test extends DriverScript {

	public static com.RE.Purchase.ObjectRepository.ServProvider_Advance_List advancelist = null;

	@Test

	public void AdvanceList() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();

			advancelist = new com.RE.Purchase.ObjectRepository.ServProvider_Advance_List(oBrowser);
			advancelist.MenuSubMenu();
			advancelist.company();
			advancelist.project();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}