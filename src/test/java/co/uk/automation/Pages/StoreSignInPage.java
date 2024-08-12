package co.uk.automation.Pages;

import org.openqa.selenium.By;

public class StoreSignInPage extends BasePage {

    private By emailTextField = By.cssSelector("input#field-email");
    private By passwordTextField = By.cssSelector("input#field-password");
    private By signInButton = By.cssSelector("button#submit-login");

    public StoreSignInPage()
    {
        super(driver);
    }

    public void enterEmail(String email)
    {
        Find(emailTextField).sendKeys(email);
    }

    public void enterPassword(String password)
    {
        Find(passwordTextField).sendKeys(password);
    }
    
    public void clickSignIn()
    {
        clickElement(signInButton);
    }
}
