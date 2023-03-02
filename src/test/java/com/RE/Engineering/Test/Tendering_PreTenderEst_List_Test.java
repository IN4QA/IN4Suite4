package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_PreTenderEst_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_PreTenderEst_List PreTenderEstimation = null;

	@Test
	public void pretendering() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		PreTenderEstimation = new com.RE.Engineering.ObjectRepository.Tendering_PreTenderEst_List(oBrowser);
		
		PreTenderEstimation.MenuSubMenu();
		PreTenderEstimation.go();
		//PreTenderEstimation.project();
	}
}