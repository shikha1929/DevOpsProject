package CrmPages;

   
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	private WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	private By search= By.xpath("//input[@placeholder='Search']");
	private By userEmail=  By.id("email-id");
	private By psw= By.id("password");
	private By chkBox= By.id("remember");
	private By submitBtn= By.id("submit-id");


    public void searchField()
	{
		driver.findElement(search).sendKeys("test");
	}



	public  String Login()
	{
        driver.findElement(userEmail).sendKeys("Test@gmail.com");
		driver.findElement(psw).sendKeys("Test");
		driver.findElement(chkBox).click();
		driver.findElement(submitBtn).click();

		return driver.getTitle();
	}

}