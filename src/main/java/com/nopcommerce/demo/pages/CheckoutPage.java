package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    //By firstName = By.id("BillingNewAddress_FirstName");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;
    //By lastName = By.id("BillingNewAddress_LastName");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;
    //By email = By.id("BillingNewAddress_Email");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    //By country = By.id("BillingNewAddress_CountryId");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    //By city = By.id("BillingNewAddress_City");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    //By address = By.id("BillingNewAddress_Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    //By postCode = By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    //By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//button[@name = 'save']")
    WebElement save;
    //By save = By.xpath("//button[@name = 'save']");
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement shippingMethod;
    //By shippingMethod = By.id("shippingoption_1");
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement shippingMethod2;
    //By shippingMethod2 = By.id("shippingoption_2");
    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Continue'][@class = 'button-1 shipping-method-next-step-button']")
    WebElement continueShipping;
    //By continueShipping = By.xpath("//button[text() = 'Continue'][@class = 'button-1 shipping-method-next-step-button']");
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement paymentMethod;
    //By paymentMethod = By.id("paymentmethod_1");
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[text()='Continue']")
    WebElement continuePayment;
    //By continuePayment = By.xpath("//div[@id='payment-method-buttons-container']//button[text()='Continue']");
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCard;
    //By selectCreditCard = By.id("CreditCardType");
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    //By cardHolderName = By.id("CardholderName");
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    //By cardNumber = By.id("CardNumber");
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    //By expireMonth = By.id("ExpireMonth");
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    //By expireYear = By.id("ExpireYear");
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    //By cardCode = By.id("CardCode");
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']//button[text()='Continue']")
    WebElement continueCard;
    //By continueCard = By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;
    //By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement confirmOrder;
    //By confirmOrder = By.xpath("//button[contains(text(),'Continue')]");

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
        Reporter.log("Enter Email" + text);
        sendTextToElement(email, text);
        CustomListeners.test.log(Status.PASS, "Enter Email" + text);
    }

    public void selectCountry(String text) {
        Reporter.log("Select Country " + text);
        selectByVisibleTextFromDropDown(country, text);
        CustomListeners.test.log(Status.PASS, "Select Country " + text);
    }

    public void enterCity(String text) {
        Reporter.log("Enter City " + text);
        sendTextToElement(city, text);
        CustomListeners.test.log(Status.PASS, "Enter City " + text);
    }

    public void enterAddress(String text) {
        Reporter.log("Enter Address " + text);
        sendTextToElement(address, text);
        CustomListeners.test.log(Status.PASS, "Enter Address " + text);
    }

    public void enterPostCode(String text) {
        Reporter.log("Enter PostCode " + text);
        sendTextToElement(postCode, text);
        CustomListeners.test.log(Status.PASS, "Enter PostCode " + text);
    }

    public void enterPhoneNumber(String text) {
        Reporter.log("Enter PhoneNumber " + text);
        sendTextToElement(phoneNumber, text);
        CustomListeners.test.log(Status.PASS, "Enter PhoneNumber " + text);
    }

    public void clickOnSave() {
        Reporter.log("Click on save " + save.toString());
        clickOnElement(save);
        CustomListeners.test.log(Status.PASS, "Click on save");
    }

    public void clickOnShippingMethod() {
        Reporter.log("Click on Shipping Method " + shippingMethod.toString());
        clickOnElement(shippingMethod);
        CustomListeners.test.log(Status.PASS, "Click on Shipping Method");
    }

    public void clickOnShippingMethod2() {
        Reporter.log("Click on Shipping Method2 " + shippingMethod2.toString());
        clickOnElement(shippingMethod2);
        CustomListeners.test.log(Status.PASS, "Click on Shipping Method2");
    }

    public void clickOnContinueShipping() {
        Reporter.log("Click on Continue Shipping " + continueShipping.toString());
        clickOnElement(continueShipping);
        CustomListeners.test.log(Status.PASS, "Click on Continue Shipping");
    }

    public void clickOnPaymentMethod() {
        Reporter.log("Click on Payment Method " + paymentMethod.toString());
        clickOnElement(paymentMethod);
        CustomListeners.test.log(Status.PASS, "Click on Payment Method");
    }

    public void clickOnContinuePayment() {
        Reporter.log("Click on Continue Payment " + continuePayment.toString());
        clickOnElement(continuePayment);
        CustomListeners.test.log(Status.PASS, "Click on Continue Payment");
    }

    public void selectCreditCard(String text) {
        Reporter.log("Select CreditCard " + text);
        selectByValueFromDropDown(selectCreditCard, text);
        CustomListeners.test.log(Status.PASS, "Select CreditCard " + text);
    }

    public void enterCardHolderName(String text) {
        Reporter.log("Enter Card Holder Name " + text);
        sendTextToElement(cardHolderName, text);
        CustomListeners.test.log(Status.PASS, "Enter Card Holder Name " + text);
    }

    public void enterCardNumber(String text) {
        Reporter.log("Enter Card Number " + text);
        sendTextToElement(cardNumber, text);
        CustomListeners.test.log(Status.PASS, "Enter Card Number " + text);
    }

    public void selectMonth(String text) {
        Reporter.log("Select Month " + text);
        selectByValueFromDropDown(expireMonth, text);
        CustomListeners.test.log(Status.PASS, "Select Month " + text);
    }

    public void selectYear(String text) {
        Reporter.log("Select Year " + text);
        selectByValueFromDropDown(expireYear, text);
        CustomListeners.test.log(Status.PASS, "Select Year " + text);
    }

    public void enterCardCode(String text) {
        Reporter.log("Enter Card Code " + text);
        sendTextToElement(cardCode, text);
        CustomListeners.test.log(Status.PASS, "Enter Card Code " + text);
    }

    public void clickOnContinueCard() {
        Reporter.log("Click on Continue Card ");
        clickOnElement(continueCard);
        CustomListeners.test.log(Status.PASS, "Click on Continue Card ");
    }

    public void clickOnConfirm() {
        Reporter.log("Click on Confirm ");
        clickOnElement(confirm);
        CustomListeners.test.log(Status.PASS, "Click on Confirm ");
    }

    public void clickOnConfirmOrder() {
        Reporter.log("Enter Confirm Order ");
        clickOnElement(confirmOrder);
        CustomListeners.test.log(Status.PASS, "Enter Confirm Order ");
    }
}
