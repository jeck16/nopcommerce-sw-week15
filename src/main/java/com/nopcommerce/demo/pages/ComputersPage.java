package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputersPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'sub-category-item']/h2/a[normalize-space() = 'Desktops']")
    WebElement desktop;

    //By desktop = By.xpath("//div[@class = 'sub-category-item']/h2/a[normalize-space() = 'Desktops']");
    public void clickOnDesktop() {
        Reporter.log("Click on Desktop");
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS, "Click on Desktop");
    }
}
