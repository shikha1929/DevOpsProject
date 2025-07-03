package TestCaseClass;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import CrmPages.HomePage;
import CrmPages.LoginPage;


public class BaseClass {

	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
	
	
	@BeforeClass
	public void setup()
	{
		
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://automationplayground.com/crm/");
		driver.manage().window().maximize();
		hp= new HomePage(driver);
		lp= new LoginPage(driver);
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
		
}
