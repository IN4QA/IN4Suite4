package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends DriverScript{
	
	WebDriver ldriver;
	
	
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtLoginId")
	@CacheLookup
	static
	WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="cmbLogin")
	@CacheLookup
	WebElement btnLogin;
	
	WebElement btnYes;
	
	WebElement lnkLogout;
	public WebElement logout()
	{
		return lnkLogout;
	}
	public static void setUserName(String Username)
	{
		txtUsername.sendKeys(Username);
	}
	
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
		
		try
		{
			w2.until(ExpectedConditions.elementToBeClickable((By.cssSelector("input[id='btnYes']")))).click();
			
			
		}
		catch(Exception e)		
		{
			System.out.println("Catch block"+"Multiple login is not present");
			
		}
	}
	
}


