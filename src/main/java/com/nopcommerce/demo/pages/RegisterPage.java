package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;
    //By gender = By.id("gender-male");
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    //By firstName = By.id("FirstName");
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    //By lastName = By.id("LastName");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    //By email = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    //By password = By.id("Password");
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    //By confirmPassword = By.id("ConfirmPassword");
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    //By registerButton = By.id("register-button");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueRegister;
    //By continueRegister = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnGender() {
        Reporter.log("Click on Gender ");
        clickOnElement(gender);
        CustomListeners.test.log(Status.PASS, "Click on Gender ");
    }

    public void enterFirstName(String text) {
        Reporter.log("Enter FirstName " + text);
        sendTextToElement(firstName, text);
        CustomListeners.test.log(Status.PASS, "Enter FirstName " + text);
    }

    public void enterLastName(String text) {
        Reporter.log("Enter LastName " + text);
        sendTextToElement(lastName, text);
        CustomListeners.test.log(Status.PASS, "Enter LastName " + text);
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

    public void enterConfirmPassword(String text) {
        Reporter.log("Enter ConfirmPassword " + text);
        sendTextToElement(confirmPassword, text);
        CustomListeners.test.log(Status.PASS, "Enter ConfirmPassword " + text);
    }

    public void clickOnRegister() {
        Reporter.log("Click on Register ");
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on Register ");
    }

    public void clickOnContinueRegister() {
        Reporter.log("Click on Continue ");
        clickOnElement(continueRegister);
        CustomListeners.test.log(Status.PASS, "Click on Continue ");
    }

}
