package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;
    //By listView = By.xpath("//a[contains(text(),'List')]");
    @CacheLookup
    @FindBy(xpath = "//a[@title = 'Show details for Nokia Lumia 1020']")
    WebElement nokia;
    //By nokia = By.xpath("//a[@title = 'Show details for Nokia Lumia 1020']");
    public void clickOnListView(){
        Reporter.log("Click on listView ");
        clickOnElement(listView);
        CustomListeners.test.log(Status.PASS, "Click on listView" );
    }
    public void clickOnNokia(){
        Reporter.log("Click on Nokia ");
        clickOnElement(nokia);
        CustomListeners.test.log(Status.PASS, "Click on Nokia");
    }

}
