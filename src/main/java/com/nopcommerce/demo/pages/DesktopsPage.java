package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id = 'products-orderby']")
    WebElement select;
    //By select = By.xpath("//select[@id = 'products-orderby']");

    By elements = By.xpath("//div[@class = 'details']//a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCart;
    //By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");

    public void selectSortOption(String optionValue) {
        Reporter.log("Select Sorting Option ");
        selectByValueFromDropDown(select, optionValue);
        CustomListeners.test.log(Status.PASS, "Select Sorting Option ");
    }

    public List<WebElement> getList() {
        Reporter.log("Get List of Elements");
        CustomListeners.test.log(Status.PASS, "Get List of Elements");
        return webElementList(elements);
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart ");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart ");
    }
}
