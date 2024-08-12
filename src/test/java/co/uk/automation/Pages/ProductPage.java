package co.uk.automation.Pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    
    private By increaseQuantityButton = By.cssSelector(".bootstrap-touchspin-up.btn.btn-touchspin.js-touchspin");
    private By addToCartButton = By.cssSelector(".add-to-cart.btn.btn-primary");
    private By addToWishListButton = By.cssSelector(".wishlist-button-add.wishlist-button-product");
    private By proceedToCheckoutButton = By.cssSelector(".modal-body .btn.btn-primary");
    
    public ProductPage()
    {
        super(driver);
    }

    public void increaseQuantity()
    {
        clickElement(increaseQuantityButton);
    }

    public void addToCart()
    {
        clickElement(addToCartButton);
    }

    public void addToWishList()
    {
        clickElement(addToWishListButton);
    }

    public void proceedToCheckout()
    {
        clickElement(proceedToCheckoutButton);
    }

}
