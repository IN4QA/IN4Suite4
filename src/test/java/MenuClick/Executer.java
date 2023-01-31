package MenuClick;

import org.testng.TestNG;
import Utilities.Reporting;

public class Executer 
{
public static TestNG testng;
	
	public static void main(String[] args) 
	{
		Reporting ext = new Reporting();
		testng = new TestNG();
		testng.setTestClasses(new Class[] {FullApplicationTestScripts.class});
		testng.run();
	}

}
