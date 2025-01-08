package org.Pages;

import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut extends BasePage {
    @FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
    WebElement checkOutButton;

    @FindBy(xpath = "//a[text()=\"Place Order\"]")
    WebElement placeOrderButton;

    public CheckOut(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void setCheckOutButton() {
        click(checkOutButton);
    }

    public void setPlaceOrderButton() {
        JSManager js=new JSManager(new WebDriverManager().getDriver());
        js.scrollToElement(placeOrderButton);
        click(placeOrderButton);
    }

    public void finalcheckout() {
        setCheckOutButton();
        setPlaceOrderButton();

    }

}
