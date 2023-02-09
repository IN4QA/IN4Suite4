package com.RE.Engineering.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class PendingIndent_List_Test extends DriverScript{
	public static com.RE.Engineering.ObjectRepository.PendingIndent_List PendingIndents=null;
	@Test
	
	public void pendingindents() throws Throwable{
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		PendingIndents= new com.RE.Engineering.ObjectRepository.PendingIndent_List(oBrowser);
		PendingIndents.MenuSubMenu();
		PendingIndents.unfullfilledPOTo();
		PendingIndents.UnfulfilledIssue();
		PendingIndents.unfullfilledPOToAsset();
		PendingIndents.UnfulfilledIssueAsset();
		PendingIndents.project();
	
	}

}
