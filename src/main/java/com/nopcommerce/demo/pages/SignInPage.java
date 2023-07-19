package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuest;
    //By checkoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;
    //By register = By.xpath("//button[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    //By email = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    //By password = By.id("Password");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement logInButton;
    //By logInButton = By.xpath("//button[contains(text(),'Log in')]");

    public void clickOnCheckoutAsGuest() {
        Reporter.log("Click on Checkout As Guest ");
        clickOnElement(checkoutAsGuest);
        CustomListeners.test.log(Status.PASS, "Click on Checkout As Guest ");
    }

    public void clickOnRegister() {
        Reporter.log("Click on Register ");
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "Click on Register ");
    }

    public void enterEmail(String text) {
        Reporter.log("Enter Email " + text);
        sendTextToElement(email, text);
        CustomListeners.test.log(Status.PASS, "Enter Email " + text);
    }

    public void enterPassword(String text) {
        Reporter.log("Enter Password " + text);
        sendTextToElement(password, text);
        CustomListeners.test.log(Status.PASS, "Enter Password " + text);
    }

    public void clickOnLogIn() {
        Reporter.log("Click on LogIn ");
        clickOnElement(logInButton);
        CustomListeners.test.log(Status.PASS, "Click on LogIn ");
    }
}
