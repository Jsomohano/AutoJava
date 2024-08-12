package co.uk.automation.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.uk.automation.Pages.CartPage;
import co.uk.automation.Pages.CheckoutPage;
import co.uk.automation.Pages.HomePageAutomation;
import co.uk.automation.Pages.ProductPage;
import co.uk.automation.Pages.StoreHomePage;
import co.uk.automation.Pages.StoreSignInPage;

public class CreateOrderTest extends BaseTest {

    @Test
    public void createOrder() throws InterruptedException
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

        storehome.selectFirstProduct();

        ProductPage firstProduct = new ProductPage();
        firstProduct.increaseQuantity();
        firstProduct.addToCart();
        firstProduct.proceedToCheckout();

        CartPage cart = new CartPage();
        cart.EnterPromoCode("20OFF");
        
        Thread.sleep(3000);
        Assert.assertEquals(cart.getTotalValue(), "$37.59");
        cart.proceedToCheckout();

        CheckoutPage checkout = new CheckoutPage();
        checkout.enterAlias("test");
        checkout.enterAddress("Toltecas");
        checkout.enterCity("CDMX");
        checkout.selectState("Texas");
        checkout.enterZip("01180");
        checkout.selectCountry("United States");
        checkout.enterPhone("9626247897");
        checkout.confirmAddress();
        checkout.enterMessageForDelivery("Leave in front the door");
        checkout.confirmDelivery();
        checkout.selectPayByCheckOption();
        checkout.checkAgreeWithTerms();
        checkout.clickCreateOrderButton();


    }
}
