package com.RE.HR.Create.Test;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

import com.RE.HR.Create.ObjectRepository.Employee_Create;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Employee_Create_Test extends DriverScript {

	public static Employee_Create EmployeeCreate = null;

	@Test
	public void LeadsCreateTest() throws Throwable {		
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();		
		
		EmployeeCreate = new Employee_Create(oBrowser);
		EmployeeCreate.MenuSubMenu();
		EmployeeCreate.createEmployees();
	}
}
