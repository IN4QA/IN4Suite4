package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Cancellation_Letters_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Cancellation_Letters_List_Test extends DriverScript{

	public static com.RE.Sales.ObjectRepository.Cancellation_Letters_List cancellationletterslist = null;
	@Test
	public void CancellationLettersList() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		cancellationletterslist = new com.RE.Sales.ObjectRepository.Cancellation_Letters_List(oBrowser);
		cancellationletterslist.MenuSubMenu();
		cancellationletterslist.mandatory();
		cancellationletterslist.filestatus();
	}
}
