package co.uk.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    public By haveAPromeCodeButton = By.cssSelector(".promo-code-button .collapse-button");
    public By proceedToCheckoutButton = By.cssSelector(".js-cart-detailed-actions .btn-primary");
    public By promoCodeTextField = By.cssSelector("input[name='discount_name']");
    public By addPromoCodeButton = By.cssSelector("div#promo-code .btn.btn-primary");
    public By totalValueText = By.cssSelector(".cart-total .value");

    public CartPage()
    {
        super(driver);
    }

    public void EnterPromoCode(String promoCode)
    {
        wait.until(ExpectedConditions.elementToBeClickable(haveAPromeCodeButton)).click();;
        wait.until(ExpectedConditions.elementToBeClickable(promoCodeTextField)).sendKeys(promoCode);
        clickElement(addPromoCodeButton);
    }

    public void proceedToCheckout()
    {
        clickElement(proceedToCheckoutButton);
    }

    public String getTotalValue()
    {
        return Find(totalValueText).getText();
    }
}
