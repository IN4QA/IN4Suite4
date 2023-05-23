package com.RE.Sales.Test;

import org.testng.annotations.Test;

import com.RE.Sales.ObjectRepository.Reminder_Letters_List;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Reminder_Letters_List_Test extends DriverScript{

	public static Reminder_Letters_List reminderLettersList = null;
	@Test
	public void Reminder_Letter_List() throws Throwable {
		
		FullApplicationTestScripts login = new FullApplicationTestScripts();
		login.loginTest();
		reminderLettersList = new Reminder_Letters_List(oBrowser);
		reminderLettersList.MenuSubMenu();
		
		reminderLettersList.ReminderprojectSubProjectCount();
	}
}
