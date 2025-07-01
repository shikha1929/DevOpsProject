package TestCaseClass;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseClass{
 
	
	public void pageSetup()
	{
		
	lp=	hp.clickOnSignIn();
	}
	
	
	@Test
  public void validateLoginPage() {
		
		
		lp.Login();
		System.out.println("User landed to customer page");
		
		
  }
}
