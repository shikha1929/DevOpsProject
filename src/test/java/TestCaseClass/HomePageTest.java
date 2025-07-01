package TestCaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{
 
	
	
	
	
@Test(priority=1)
  public void verifyGetAppUrl() 
	{
		
		String actUrl= hp.getAppUrl();
		Assert.assertTrue(actUrl.contains("crm"));
		System.out.println("Url Validated");
	}
	
@Test(priority=2)
	public void verifyGetAppTitle() 
	{
		
		String actTitle= hp.getAppTitle();
		Assert.assertEquals(actTitle, "Customer Service");
		System.out.println("Tilte Matched ");
		
	}
	
@Test(priority=3)
	public void validateSignInLink() 
	{
		 hp.clickOnSignIn();
		 
	
	}


	
}
