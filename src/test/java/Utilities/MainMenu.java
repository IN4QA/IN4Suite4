package Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu extends DriverScript {
	WebDriver iDriver;
	
	public MainMenu(WebDriver oDriver)
	{

		iDriver = oDriver;
		PageFactory.initElements(iDriver, this);
	}
		
	@FindBy(xpath = "//table[contains(@class , 'in4-table')]/tbody/tr")
	static List<WebElement> list;
	public static List<WebElement> recordListed() {
		return list;
	}
	
	@FindBy(css = "td[class='HOME custom-css custom-cssHi']")
	private WebElement home;
	public WebElement getHome()
	{
		return home;
	}
	
	@FindBy(css= "td[class='DASH custom-css']")
	private WebElement bi;
	public WebElement getBi()
	{
		return bi;
	}
	
	@FindBy(css = "td[class='BIZDEV custom-css']")
	private WebElement land;
	public WebElement getLand()
	{
		return land;
	}
	
	@FindBy(css = "td[class='LEGAL custom-css']")
	private WebElement legal;
	public WebElement getLegal()
	{
		return legal;
	}
	
	@FindBy(css = "td[class='LIAISON custom-css']")  
	private WebElement liaison;
	public WebElement getLiaison()
	{
		return liaison;
	}
	
	@FindBy(xpath = "//span[text()='Projects']")
	private WebElement project;
	public WebElement getProject()
	{
		return project;
	}
	

	@FindBy(xpath = "//span[text()='Engg']")
	private WebElement eng;
	public WebElement getEngineering()
	{
		return eng;
	} 
	
	
	
	@FindBy(xpath = "//span[text()='Purchase']")
	private WebElement prchase;
	public WebElement getPurchase()
	{
		return prchase;
	}
	@FindBy(xpath = "//span[text()= 'Leads']")
	private WebElement leads;
	public WebElement getLeads()
	{
		return leads;
	}
	
	@FindBy(xpath="//span[text()='Sales']")
	private WebElement sales;
	public WebElement getSales()
	{
		return sales;
	}
	
	@FindBy(xpath = "//span[text()='Finance']")
	private WebElement finance;
	public WebElement getFINANCE()
	{
		return finance;
	}
	
	@FindBy(xpath = "//span[text()='Expenses']")
	private WebElement expense;
	public WebElement getExpense()
	{
		return expense;
	}
	
	@FindBy(css ="td[class='FA custom-css']")
	private WebElement assets;
	public WebElement getAssets()
	{
		return assets;
	}
	
	@FindBy(xpath = "//span[text()='HR']")
	private WebElement hr;
	public WebElement getHr()
	{
		return hr;
	}
	
	@FindBy(css="td[class= 'RENTAL custom-css']")
	private WebElement rental;
	public WebElement getRental()
	{
		return rental;
	}
	
	@FindBy(css="td[class= 'PFMS custom-css']")
	private WebElement facilities;
	public WebElement getFacilities()
	{
		return facilities;
	}
	
	@FindBy(css = "td[class='FILES custom-css']")
	private WebElement files;
	public WebElement getFiles()
	{
		return files;
	}
	
	@FindBy(css ="td[class='TRAVEL custom-css']")
	private WebElement travel;
	public WebElement getTravel()
	{
		return travel;
	}
	
	public void clickHomeMenu() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getHome());		
	}
	
	public void clickBiMenu() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getBi());
	}
	
	public void clickLand() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getLand());		
	}
	
	public void clickLegal() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getLegal());		
	}
	
	public static void clickLiaison() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getLiaison());		
	}
	
	public void clickProjects() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(project);
	}
	
	public void clickEngineering() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(eng);
	}
	
	public void clickPurchase() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(prchase);		
	}
	
	public void clickLeads() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(leads);		
	}
	
	public void clickSales() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(sales);		
	}
	
	public void clickFinance() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(finance);			
	}
	
	public void clickExpenses() throws Exception
	{
	
			Frames.MainMenuFrame();
			appInd.clickObject(expense);
	}
	
	public void clickAssets() throws Exception
	{
	        Frames.MainMenuFrame();
			appInd.clickObject(mainMenu.getAssets());
		
	}
	
	public void clickHR() throws Exception
	{
		    Frames.MainMenuFrame();
			appInd.clickObject(hr);	
	}
	
	public void clckRentals() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getRental());		
	}
	
	public void clickFacilities() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getFacilities());	
				
	}
	
	public void clickFiles() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getFiles());	
	}
	
	public void clickTravel() throws Exception
	{
		Frames.MainMenuFrame();
		appInd.clickObject(mainMenu.getTravel());			
	}
	
}
