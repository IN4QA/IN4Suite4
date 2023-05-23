package com.RE.Sales.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Utilities_BankDetails_List_Test extends DriverScript{
	
	public static com.RE.Sales.ObjectRepository.Utilities_BankDetails_List bankdetails=null;
	
	@Test
	
	public void bankdetailslist() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		bankdetails= new com.RE.Sales.ObjectRepository.Utilities_BankDetails_List(oBrowser);
		bankdetails.MenuSubMenu();
		bankdetails.go();
		}
}


