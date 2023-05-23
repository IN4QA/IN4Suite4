package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.Permission_Letter_List;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Permission_Letter_List_Test extends DriverScript{


	public static com.RE.Sales.Communication.ObjectRepository.Permission_Letter_List PermissionLetterList=null;
	@Test
	
		public static void PermissionLetterlist() throws Throwable{
			FullApplicationTestScripts login= new FullApplicationTestScripts();
			login.loginTest();
			PermissionLetterList=new Permission_Letter_List(oBrowser);
			PermissionLetterList.MenuSubMenu();
			PermissionLetterList.nofilter();
			PermissionLetterList.project();
}
}