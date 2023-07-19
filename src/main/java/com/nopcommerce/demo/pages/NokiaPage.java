package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement quantity;
    //By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    //By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement close;
    //By close = By.xpath("//span[@class = 'close']");

    public void changeQuantity(String text) {
        Reporter.log("Change Quantity "+ text);
        WebElement qty = quantity;
        qty.clear();
        sendTextToElement(quantity, text);
        CustomListeners.test.log(Status.PASS, "Change Quantity "+ text);
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart ");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart ");
    }

    public void clickOnClose() {
        Reporter.log("Click on close ");
        clickOnElement(close);
        CustomListeners.test.log(Status.PASS, "Click on close ");
    }
}
