package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Send_Email_SMS_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Send_Email_SMS_List_Test extends DriverScript{

	public static Send_Email_SMS_List Send_Email_SMS_List = null;
	@Test
	public void Send_Email_SMS_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		Send_Email_SMS_List = new Send_Email_SMS_List(oBrowser);
		Send_Email_SMS_List.MenuSubMenu();
		
		Send_Email_SMS_List.emailCount();
		Send_Email_SMS_List.smsCount();
	//	Send_Email_SMS_List.whatsAppCount();
	}
}
