package com.RE.Engineering.Test;

import org.testng.annotations.Test;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Issue_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Issue_List IssueList = null;

	@Test
	public void IssueInventry() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		IssueList = new com.RE.Engineering.ObjectRepository.Issue_List(oBrowser);
		
		IssueList.MenuSubMenu();
		IssueList.material();
		IssueList.asset();
		IssueList.matstatus();
	}
}
