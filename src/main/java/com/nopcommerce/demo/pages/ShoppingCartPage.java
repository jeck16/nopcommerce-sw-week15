package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@class = 'qty-input']")
    WebElement quantity;
    //By quantity = By.xpath("//input[@class = 'qty-input']");
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCart;
    //By updateCart = By.id("updatecart");
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsofservice;
    //By termsofservice = By.id("termsofservice");
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;
    //By checkout = By.id("checkout");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement logIn;
    //By logIn = By.xpath("//a[contains(text(),'Log in')]");

    public void changeQuantity() {
        Reporter.log("Change Quantity 2");
        WebElement qty = quantity;
        qty.clear();
        sendTextToElement(quantity, "2");
        CustomListeners.test.log(Status.PASS, "Change Quantity 2");
    }

    public void clickOnUpdateCart() {
        Reporter.log("Click on Update Cart ");
        clickOnElement(updateCart);
        CustomListeners.test.log(Status.PASS, "Click on Update Cart ");
    }

    public void clickOnTerms() {
        Reporter.log("Click on Terms of Service ");
        clickOnElement(termsofservice);
        CustomListeners.test.log(Status.PASS, "Click on Terms of Service ");
    }

    public void clickOnCheckout() {
        Reporter.log("Click on Checkout ");
        clickOnElement(checkout);
        CustomListeners.test.log(Status.PASS, "Click on Checkout ");
    }

    public void clickOnLogIn() {
        Reporter.log("Click on LogIn ");
        clickOnElement(logIn);
        CustomListeners.test.log(Status.PASS, "Click on LogIn ");
    }

}
