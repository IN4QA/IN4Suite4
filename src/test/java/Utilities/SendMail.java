package Utilities;


import org.testng.annotations.Test;

import MenuClick.FullApplicationTestScripts;

public class SendMail extends DriverScript{

	@Test
	public static void sendMailWithAttachment() throws Throwable, Throwable {
		FullApplicationTestScripts login=new FullApplicationTestScripts();
		login.loginTest();
		appInd.sendMail("D:\\myworkspace\\IN4Suite4\\test-output\\emailable-report.html");
	}
}
