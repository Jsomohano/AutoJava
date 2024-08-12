package co.uk.automation.Pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{

    private By aliasTextField = By.cssSelector("input#field-alias");
    private By addressTextField = By.cssSelector("input#field-address1");
    private By cityTextField = By.cssSelector("input#field-city");
    private By stateDropdown = By.cssSelector("select#field-id_state");
    private By zipTextField = By.cssSelector("input#field-postcode");
    private By countryDropdown = By.cssSelector("select#field-id_country");
    private By phoneTextField = By.cssSelector("input#field-phone");
    private By confirmAddressButton = By.cssSelector("button[name='confirm-addresses']");
    private By messageArea = By.cssSelector("textarea#delivery_message");
    private By confirmDeliveryButton = By.cssSelector("[name='confirmDeliveryOption']");
    private By payByCheckRadioButton = By.cssSelector("[data-module-name='ps_checkpayment']");
    private By agreeTermsCheckbox = By.cssSelector("input#conditions_to_approve\\[terms-and-conditions\\]");
    private By placeOrderButton = By.cssSelector(".btn.btn-primary.center-block");
    
    
    public CheckoutPage()
    {
        super(driver);
    }

    public void enterAlias(String alias)
    {
        Find(aliasTextField).sendKeys(alias);
    }

    public void enterAddress(String address)
    {
        Find(addressTextField).sendKeys(address);
    } 

    public void enterCity(String city)
    {
        Find(cityTextField).sendKeys(city);
    }

    public void selectState(String state)
    {
        selectFromDropdownByVisibleText(stateDropdown, state);
    }

    public void enterZip(String zip)
    {
        Find(zipTextField).sendKeys(zip);
    }

    public void selectCountry(String country)
    {
        selectFromDropdownByVisibleText(countryDropdown, country);
    }

    public void enterPhone(String phone)
    {
        Find(phoneTextField).sendKeys(phone);
    }

    public void confirmAddress()
    {
        clickElement(confirmAddressButton);
    }

    public void enterMessageForDelivery(String message)
    {
        Find(messageArea).sendKeys(message);
    }

    public void confirmDelivery()
    {
        clickElement(confirmDeliveryButton);
    }

    public void selectPayByCheckOption()
    {
        clickElement(payByCheckRadioButton);
    }

    public void checkAgreeWithTerms()
    {
        clickElement(agreeTermsCheckbox);
    }

    public void clickCreateOrderButton()
    {
        clickElement(placeOrderButton);
    }
}
