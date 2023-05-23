package com.RE.Sales.Communication.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Communication.ObjectRepository.BankHTD_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BankHTD_List_Test extends DriverScript{
	public static com.RE.Sales.Communication.ObjectRepository.BankHTD_List BankHTDList=null;
	@Test
	public static void BankHTDlist() throws Throwable{
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		BankHTDList=new BankHTD_List(oBrowser);
		BankHTDList.MenuSubMenu();
		BankHTDList.nofilter();
		BankHTDList.project();
	}
}
