package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space() = 'Electronics']")
    WebElement electronics;
    //By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space() = 'Electronics']");
    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Cell phones ']")
    WebElement cellPhones;
    //By cellPhones = By.xpath("//a[text() = 'Cell phones ']");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;
    //By logOut = By.xpath("//a[contains(text(),'Log out')]");

    public void selectMenu(String menu) {
        Reporter.log("Select Menu");
        //click on menu
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space() = '" + menu + "']"));
        CustomListeners.test.log(Status.PASS, "Select Menu");
    }

    public void mouseHoverOnElectronics() {
        Reporter.log("Mouse hover on Electronics ");
        mouseHoverToElement(electronics);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Electronics ");
    }

    public void mouseHoverOnCellPhones() {
        Reporter.log("Mouse hover on Cellphones ");
        mouseHoverToElementAndClick(cellPhones);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Cellphones ");
    }

    public void clickOnLogOut() {
        Reporter.log("Click on Logout ");
        clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS, "Click on Logout ");
    }
}
