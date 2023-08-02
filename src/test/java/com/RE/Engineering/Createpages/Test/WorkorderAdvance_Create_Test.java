package com.RE.Engineering.Createpages.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.WorkorderAdvance_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;


public class WorkorderAdvance_Create_Test extends DriverScript{

	public static WorkorderAdvance_Create WOAdvance=null;
	
	@Test
	public void WOAdvanceCreate() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		WOAdvance = new WorkorderAdvance_Create (oBrowser);
		WOAdvance.MenuSubMenu_WOAdvance();
		WOAdvance.WOAdvCreate();
		
	}
}