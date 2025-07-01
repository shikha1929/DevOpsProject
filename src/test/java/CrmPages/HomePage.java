package CrmPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	private By signIn= By.id("SignIn");





	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

	public String getAppTitle()
	{
		return driver.getTitle();
	}


	public LoginPage clickOnSignIn()
	{
		driver.findElement(signIn).click();
		return new LoginPage(driver);
	}

	
	

}