package com.RE.Engineering.Test;


import org.testng.annotations.Test;
import Utilities.DriverScript;
import MenuClick.FullApplicationTestScripts;

public class Indent_List_Test extends DriverScript
{
	public static com.RE.Engineering.ObjectRepository.Indent_List Indent_ListObj = null;
	
	@Test
	public  void Indent_List() throws Throwable
	{
		try
		{
						
			FullApplicationTestScripts login = new FullApplicationTestScripts();
			login.loginTest();
			Indent_ListObj = new com.RE.Engineering.ObjectRepository.Indent_List(oBrowser);

						
			Indent_ListObj.MenuSubMenu();
			Indent_ListObj.Date();
			Indent_ListObj.UnfullfilledPOTO();
			Indent_ListObj.Unfullfilledissue();
			Indent_ListObj.All();
			Indent_ListObj.SubProject();
			Indent_ListObj.Status();
			Indent_ListObj.Contractor();
			Indent_ListObj.Date();
			Indent_ListObj.WorkCategory();
			Indent_ListObj.TypeOfIndent();
			Indent_ListObj.Debitable();
			Indent_ListObj.MaterialType();
			Indent_ListObj.FulfilledPOTO();
			Indent_ListObj.FulfilledIssue();
				 
//			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
}