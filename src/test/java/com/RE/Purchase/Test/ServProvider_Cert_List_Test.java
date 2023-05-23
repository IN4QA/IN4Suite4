package com.RE.Purchase.Test;

import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class ServProvider_Cert_List_Test extends DriverScript{
	
	public static com.RE.Purchase.ObjectRepository.ServProvider_Cert_List sercertificatelist=null;
	@Test
	public void SerCertificateList() throws Throwable{
		
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		
		sercertificatelist=new com.RE.Purchase.ObjectRepository.ServProvider_Cert_List(oBrowser);
		sercertificatelist.MenuSubMenu();
		sercertificatelist.company();
		sercertificatelist.project();
	}

}
