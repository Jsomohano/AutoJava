package co.uk.automation.Pages;

import org.openqa.selenium.By;

public class StoreHomePage extends BasePage {
    
    private By signInButton = By.cssSelector(".user-info [title]");
    private By userNameButton = By.cssSelector("div#_desktop_user_info a.account .hidden-sm-down");
    private By firstProduct = By.cssSelector(".products.row [alt='Hummingbird printed t-shirt']");

    public StoreHomePage ()
    {
        super(driver);
    }

    public void navigateToSignIn()
    {
        clickElement(signInButton);
    }

    public String getUserName()
    {
        return Find(userNameButton).getText();
    }

    public void selectFirstProduct()
    {
        clickElement(firstProduct);
    }

}
