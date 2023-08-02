package com.RE.Engineering.Createpages.Test;

import org.testng.annotations.Test;

import com.RE.Engineering.Createpages.ObjectRepository.WorkOrderCert_Create;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;


public class WorkOrderCert_Create_Test extends DriverScript{

	public static WorkOrderCert_Create WOCert=null;
	
	@Test
	public void WOCertificateCreate() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		WOCert = new WorkOrderCert_Create (oBrowser);
		WOCert.MenuSubMenu_WOCert();
		WOCert.WOCertCreate();
		
	}
}