package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.EnggMilestone_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class EnggMilestone_List_Test extends DriverScript {

	public static EnggMilestone_List enggMilestoneList = null;
	@Test
	public void Leads_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		enggMilestoneList = new EnggMilestone_List(oBrowser);
		enggMilestoneList.MenuSubMenu();
		
		enggMilestoneList.projectCount();
	}
}
