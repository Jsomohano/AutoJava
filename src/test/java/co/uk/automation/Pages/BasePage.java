package co.uk.automation.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public WebDriver getDriver()
    {
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        return driver;

    }

    public BasePage(WebDriver driver)
    {
        BasePage.driver = driver;
    }

    public static void navigateTo(String URL)
    {
        driver.get(URL);
        driver.manage().deleteAllCookies();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.localStorage.clear();");
        js.executeScript("window.sessionStorage.clear();");
        driver.manage().window().maximize();
    }

    public WebElement Find(By identificator)
    {
        return wait.until(ExpectedConditions.presenceOfElementLocated(identificator));
    }

    public void clickElement(By identificator)
    {
        Find(identificator).click();
    }
    
    public void selectFromDropdownByValue(By locator, String value)
    {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }
    
    public void selectFromDropdownByVisibleText(By locator, String value)
    {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(value);
    }
    public static void closeBrowser()
    {
        driver.quit();
    }
}
