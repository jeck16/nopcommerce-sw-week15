package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicTest extends BaseTest {
    HomePage homePage;
    ComputersPage computersPage;
    DesktopsPage desktopsPage;
    BuildPage buildPage;
    ShoppingCartPage shoppingCartPage;
    SignInPage signInPage;
    CheckoutPage checkoutPage;
    CellPhonesPage cellPhonesPage;
    NokiaPage nokiaPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computersPage = new ComputersPage();
        desktopsPage = new DesktopsPage();
        buildPage = new BuildPage();
        shoppingCartPage = new ShoppingCartPage();
        signInPage = new SignInPage();
        checkoutPage = new CheckoutPage();
        cellPhonesPage = new CellPhonesPage();
        nokiaPage = new NokiaPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnCellPhones();
        verifyTwoStrings("Cell phones", By.xpath("//h1[contains(text(),'Cell phones')]"));
    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnCellPhones();
        verifyTwoStrings("Cell phones", By.xpath("//h1[contains(text(),'Cell phones')]"));
        cellPhonesPage.clickOnListView();
        Thread.sleep(3000);
        cellPhonesPage.clickOnNokia();
        verifyTwoStrings("Nokia Lumia 1020", By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
        verifyTwoStrings("$349.00", By.xpath("//span[@id='price-value-20']"));
        nokiaPage.changeQuantity("2");
        nokiaPage.clickOnAddToCart();
        verifyTwoStrings("The product has been added to your shopping cart", By.xpath("//p[@class = 'content']"));
        nokiaPage.clickOnClose();
        buildPage.mouseHoverToShoppingCart();
        Thread.sleep(3000);
        buildPage.mouseHoverToGoToCartAndClick();
        verifyTwoStrings("Shopping cart", By.xpath("//h1[contains(text(),'Shopping cart')]"));
        String QtyValue = driver.findElement(By.xpath("//input[@class = 'qty-input']")).getAttribute("value");
        Assert.assertEquals(QtyValue, "2");
        verifyTwoStrings("$698.00", By.xpath("//span[text()='$698.00'][@class = 'product-subtotal']"));
        shoppingCartPage.clickOnTerms();
        shoppingCartPage.clickOnCheckout();
        verifyTwoStrings("Welcome, Please Sign In!", By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        signInPage.clickOnRegister();
        verifyTwoStrings("Register", By.xpath("//h1[contains(text(),'Register')]"));
        registerPage.clickOnGender();
        registerPage.enterFirstName("YK");
        registerPage.enterLastName("Modi");
        registerPage.enterEmail("prime55@gmail.com");
        registerPage.enterPassword("Prime@123");
        registerPage.enterConfirmPassword("Prime@123");
        registerPage.clickOnRegister();
        verifyTwoStrings("Your registration completed", By.xpath("//div[contains(text(),'Your registration completed')]"));
        registerPage.clickOnContinueRegister();
        shoppingCartPage.clickOnLogIn();
        signInPage.enterEmail("prime55@gmail.com");
        signInPage.enterPassword("Prime@123");
        signInPage.clickOnLogIn();
        verifyTwoStrings("Shopping cart", By.xpath("//h1[contains(text(),'Shopping cart')]"));
        shoppingCartPage.clickOnTerms();
        shoppingCartPage.clickOnCheckout();
        checkoutPage.enterFirstName("Ankur");
        checkoutPage.enterLastName("Ratahod");
        checkoutPage.enterEmail("prime33@gmail.com");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.enterCity("London");
        checkoutPage.enterAddress("abc");
        checkoutPage.enterPostCode("E112PP");
        checkoutPage.enterPhoneNumber("08128008020");
        checkoutPage.clickOnSave();
        checkoutPage.clickOnShippingMethod2();
        checkoutPage.clickOnContinueShipping();
        checkoutPage.clickOnPaymentMethod();
        checkoutPage.clickOnContinuePayment();
        checkoutPage.selectCreditCard("visa");
        checkoutPage.enterCardHolderName("Ankur");
        checkoutPage.enterCardNumber("1111222233334444");
        checkoutPage.selectMonth("5");
        checkoutPage.selectYear("2030");
        checkoutPage.enterCardCode("123");
        checkoutPage.clickOnContinueCard();
        verifyTwoStrings("Payment Method: Credit Card", By.xpath("//li[@class='payment-method']"));
        verifyTwoStrings("Shipping Method: 2nd Day Air", By.xpath("//li[@class='shipping-method']"));
        verifyTwoStrings("$698.00", By.xpath("//span[text()='$698.00'][@class = 'product-subtotal']"));
        checkoutPage.clickOnConfirm();
        verifyTwoStrings("Thank you", By.xpath("//h1[contains(text(),'Thank you')]"));
        verifyTwoStrings("Your order has been successfully processed!", By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
        checkoutPage.clickOnConfirmOrder();
        verifyTwoStrings("Welcome to our store", By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        homePage.clickOnLogOut();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

    }
}
