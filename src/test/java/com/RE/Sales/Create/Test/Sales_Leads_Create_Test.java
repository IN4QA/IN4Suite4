package com.RE.Sales.Create.Test;
import org.testng.annotations.Test;
import com.RE.Sales.Create.ObjectRepository.Sales_Leads_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Sales_Leads_Create_Test extends DriverScript{

	public static Sales_Leads_Create SalesLeadsCreate = null;
	@Test
	public void main() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		SalesLeadsCreate = new Sales_Leads_Create(oBrowser);
		SalesLeadsCreate.MenuSubMenu();
		
		SalesLeadsCreate.createSalesIndividualLeads();
		SalesLeadsCreate.createSalesCorporateLeads();
	} 
}
