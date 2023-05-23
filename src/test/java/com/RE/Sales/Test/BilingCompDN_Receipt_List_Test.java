package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.BilingCompDN_Receipt_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class BilingCompDN_Receipt_List_Test extends DriverScript{

	public static com.RE.Sales.ObjectRepository.BilingCompDN_Receipt_List CompanyDNReceiptList = null;
	@Test
	public void companyDNReceiptlist() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		CompanyDNReceiptList = new com.RE.Sales.ObjectRepository.BilingCompDN_Receipt_List(oBrowser);
		CompanyDNReceiptList.MenuSubMenu();
		CompanyDNReceiptList.nofilter();
		CompanyDNReceiptList.payingcomp();
}
}