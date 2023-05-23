package com.RE.Engineering.Test;

import org.testng.annotations.Test;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Material_Budget_List_Test extends DriverScript{

	public static com.RE.Engineering.ObjectRepository.WCB_MB_WO_List MaterialBudgetList = null;

	@Test
	public void Material_Budget_List() throws Throwable {
		try {
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			MaterialBudgetList = new com.RE.Engineering.ObjectRepository.WCB_MB_WO_List(oBrowser);
			MaterialBudgetList.MenuSubMenu();
			MaterialBudgetList.workCategoryBudget();
			MaterialBudgetList.MaterialBudget();
			MaterialBudgetList.workOrderCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
