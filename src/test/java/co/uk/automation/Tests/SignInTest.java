package co.uk.automation.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.uk.automation.Pages.HomePageAutomation;
import co.uk.automation.Pages.StoreHomePage;
import co.uk.automation.Pages.StoreSignInPage;

public class SignInTest extends BaseTest {
    
    @Test
    public void userNameValidation()
    {
        
      HomePageAutomation home = new HomePageAutomation();
      home.navigateToHomePage();
      home.closeCookies();
      home.openToggle();
      home.navigateToStore();

      StoreHomePage storehome = new StoreHomePage();
      storehome.navigateToSignIn();
  
      StoreSignInPage signIn = new StoreSignInPage();
      signIn.enterEmail("test@test.com");
      signIn.enterPassword("test123");
      signIn.clickSignIn();

      Assert.assertEquals(storehome.getUserName(), "John Smith");

    }
}
