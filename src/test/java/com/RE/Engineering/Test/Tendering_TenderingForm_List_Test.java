package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Tendering_TenderingForm_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Tendering_TenderingForm_List TenderingForm = null;

	@Test
	public void Tenderingform() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		TenderingForm = new com.RE.Engineering.ObjectRepository.Tendering_TenderingForm_List(oBrowser);
		
		TenderingForm.MenuSubMenu();
		TenderingForm.go();
		//TenderingForm.project();
	}
}