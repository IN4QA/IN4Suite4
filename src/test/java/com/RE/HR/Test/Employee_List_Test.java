package com.RE.HR.Test;

import org.testng.annotations.Test;

import com.RE.HR.ObjectRepository.Employee_List;import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Employee_List_Test extends DriverScript {

	public static Employee_List EmployeeList = null;

	@Test
	public void employeeListTest() throws Throwable {

		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		EmployeeList = new Employee_List(oBrowser);
		EmployeeList.MenuSubMenu();
		EmployeeList.employeelist_NoFilters();
		EmployeeList.employeelist_Company();
		EmployeeList.employeelist_InActiveStatus();
		EmployeeList.employeelist_ActiveStatus();
		EmployeeList.employeelist_InActiveAppUser();
	}
}
