package com.RE.Sales.Create.Test;

import org.testng.annotations.Test;

import com.RE.Sales.Create.ObjectRepository.Create_Booking;

import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Create_Booking_Test extends DriverScript{

	public static Create_Booking CreateBooking = null;

	@Test
	public void LeadsCreateTest() throws Throwable {

		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		CreateBooking = new Create_Booking(oBrowser);
		CreateBooking.MenuSubMenu();
		CreateBooking.createBooking();
	}
}
