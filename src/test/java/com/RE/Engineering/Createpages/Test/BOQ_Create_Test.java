package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.BOQ_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BOQ_Create_Test extends DriverScript{
	
	public static BOQ_Create createBOQ=null;
	@Test
	public void CreateBOQ()throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		createBOQ=new BOQ_Create(oBrowser);
		createBOQ.MenuSubMenu();
		createBOQ.BOQCreation();
	}
	

}
