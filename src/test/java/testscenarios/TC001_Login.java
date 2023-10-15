package testscenarios;
 
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.HomePage;

public class TC001_Login extends BaseClass {
 
	@Test(priority=1)
	public void loginFieldValidation() {
	
	   boolean result = new LoginPage()
			   .VerifyElement();
	         Assert.assertTrue(result);
   }
	@Test(priority=2)
	public void loginWithValidCredentials() {
		boolean result = new LoginPage()
				.enteruserName("Mathan")
				.enterPassword("Testing123")
				.signInbutton()
				.VerifyElement();
				Assert.assertTrue(result);
	}
}

