package org.Pages;

import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BasePage {
    @FindBy(xpath = "//u[text()=\"View Cart\"]")
    WebElement viewCarts;
    @FindBy(xpath = "//a[@class=\"cart_quantity_delete\"]")
    WebElement deleteProduct;

    public Cart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void viewCarts(){

        JSManager js=new JSManager(new WebDriverManager().getDriver());
        js.scrollToElement(viewCarts);
        js.clickElement(viewCarts);
    }
    public void setDeleteProduct(){
        click(deleteProduct);
    }
    public void finalCart(){
        viewCarts();
    }
}
