package co.uk.automation.Pages;

import org.openqa.selenium.By;

public class HomePageAutomation extends BasePage {
    private By buttonsMenuItem = By.cssSelector("[href='buttons\\.html']");
    private By sideBar = By.cssSelector("div#sidebar");
    private By toggle = By.cssSelector("dBy.cssSelector(iv#sidebar > .toggle");
    private By storeLink = By.cssSelector("[href='https\\:\\/\\/teststore\\.automationtesting\\.co\\.uk\\/']");
    private By closeCookiesButton = By.cssSelector(".close-cookie-warning span");
    public HomePageAutomation()
    {
        super(driver);
    }

    public void navigateToHomePage()
    {
        navigateTo("https://automationtesting.co.uk/");
    }
    
    public void openToggle()
    {
        Boolean toggleStatus = getSideBarStatus();
        if(toggleStatus == false)
        {
            clickElement(toggle);
        }

    }
    
    public Boolean getSideBarStatus()
    {
        String sideBarStatus = Find(sideBar).getAttribute("class").toString();
        if(sideBarStatus.equals("inactive"))
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    public void navigateToStore()
    {
        clickElement(storeLink);
    }

    public void closeCookies()
    {
        clickElement(closeCookiesButton);
    }
}
