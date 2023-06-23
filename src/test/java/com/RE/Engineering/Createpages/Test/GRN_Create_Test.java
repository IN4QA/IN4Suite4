package com.RE.Engineering.Createpages.Test;



import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.GRN_Create;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class GRN_Create_Test extends DriverScript{

	public static GRN_Create createGRN = null;
	@Test
	public void GRNCreate() throws Throwable{
	FullApplicationTestScripts login=new FullApplicationTestScripts();
	login.loginTest();
	createGRN = new GRN_Create(oBrowser);
	createGRN.MenuSubMenu();
	createGRN.GRN_Creation();
	
	}

}
