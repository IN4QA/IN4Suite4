package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.TDS_Reconciliation_List;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class TDS_Reconciliation_List_Test extends DriverScript {

	public static TDS_Reconciliation_List TDSReconciliationList = null;
	@Test
	public void Send_Email_SMS_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		TDSReconciliationList = new TDS_Reconciliation_List(oBrowser);
		TDSReconciliationList.MenuSubMenu();
		
		TDSReconciliationList.noFilterCertificate();
		TDSReconciliationList.projectCertificate();
	}
}
