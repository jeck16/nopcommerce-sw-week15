package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildPage extends Utility {
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    //By processor = By.id("product_attribute_1");
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    //By ram = By.id("product_attribute_2");
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;
    //By hdd = By.id("product_attribute_3_7");
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement os;
    //By os = By.id("product_attribute_4_9");
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement software;
    //By software = By.id("product_attribute_5_12");
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;
    //By addToCart = By.id("add-to-cart-button-1");
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement close;
    //By close = By.xpath("//span[@class = 'close']");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    //By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    //By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public void selectProcessor(String optionValue) {
        Reporter.log("Select Processor" + optionValue.toString());
        selectByValueFromDropDown(processor, optionValue);
        CustomListeners.test.log(Status.PASS, "Select Processor" + optionValue);
    }

    public void selectRAM(String optionValue) {
        Reporter.log("Select RAM" + optionValue.toString());
        selectByValueFromDropDown(ram, optionValue);
        CustomListeners.test.log(Status.PASS, "Select RAM" + optionValue);
    }

    public void clickOnHDD() {
        Reporter.log("Click on hdd");
        clickOnElement(hdd);
        CustomListeners.test.log(Status.PASS, "Click on hdd");
    }

    public void clickOnOS() {
        Reporter.log("Click on OS");
        clickOnElement(os);
        CustomListeners.test.log(Status.PASS, "Click on OS");
    }

    public void clickOnSoftware() {
        Reporter.log("Click on software");
        clickOnElement(software);
        CustomListeners.test.log(Status.PASS, "Click on software");
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart " + addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart");
    }

    public void clickOnClose() {
        Reporter.log("Click on close " + close.toString());
        clickOnElement(close);
        CustomListeners.test.log(Status.PASS, "Click on close");
    }

    public void mouseHoverToShoppingCart() {
        Reporter.log("Mouse hover to shopping cart " + shoppingCart.toString());
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover to shopping cart");
    }

    public void mouseHoverToGoToCartAndClick() {
        Reporter.log("Mouse hover on Go to Cart and click " + goToCart.toString());
        mouseHoverToElementAndClick(goToCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Go to Cart and click");
    }
}
