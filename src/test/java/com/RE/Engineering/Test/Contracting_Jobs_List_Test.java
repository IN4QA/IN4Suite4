package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Contracting_Jobs_List_Test extends DriverScript{
	
	public static com.RE.Engineering.ObjectRepository.Contracting_Jobs_List jobslist=null;
	
	@Test
	
	public void ContractingJobsList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		jobslist=new com.RE.Engineering.ObjectRepository.Contracting_Jobs_List(oBrowser);
		jobslist.MenuSubMenu();
		jobslist.nofilter();
		jobslist.closed();
		jobslist.lost();
		jobslist.open();
		jobslist.own();
	}

}
