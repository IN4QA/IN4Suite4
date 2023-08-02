package com.RE.Purchase.Test;

import org.testng.annotations.Test;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class SupCert_List_Test extends DriverScript {
	public static com.RE.Purchase.ObjectRepository.SupCert_List SupCertList = null;

	@Test
	public void SupcertList() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			SupCertList = new com.RE.Purchase.ObjectRepository.SupCert_List(oBrowser);
			SupCertList.MenuSubMenu();
			SupCertList.company();
			SupCertList.project();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
