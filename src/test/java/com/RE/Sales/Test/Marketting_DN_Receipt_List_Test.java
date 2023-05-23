package com.RE.Sales.Test;

import org.testng.annotations.Test;
import com.RE.Sales.ObjectRepository.Marketting_DN_Receipt_List;
import MenuClick.FullApplicationTestScripts;
import Utilities.DriverScript;

public class Marketting_DN_Receipt_List_Test  extends DriverScript{

	public static Marketting_DN_Receipt_List DNReceiptlist= null;
	@Test
	public void DNReceipt_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		DNReceiptlist = new Marketting_DN_Receipt_List(oBrowser);
		DNReceiptlist.MenuSubMenu();
		DNReceiptlist.PayCompany();
		DNReceiptlist.projectDD();
	}
}
