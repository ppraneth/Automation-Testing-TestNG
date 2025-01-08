package org.Pages;

import org.Features.Hooks;
import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products extends BasePage{

    @FindBy(xpath = "//a[@href=\"/products\"]")
    WebElement products;

    @FindBy(xpath = "//a[@href=\"#Men\"]")
    WebElement mens;

    @FindBy(xpath = "//a[text()=\"Tshirts \"]")
    WebElement tShirts;

    @FindBy(css = "div.single-products")
    WebElement selectShirt;

    @FindBy(xpath = "//div[@class=\"product-overlay\"]//i")
    WebElement addToCartButton;

    JSManager js;



    public Products(WebDriver driver){
        PageFactory.initElements(driver, this);
        js=new JSManager(new WebDriverManager().getDriver());

    }
    public void setProducts(){
        click(products);
        Hooks.test.info("User clicks on products");
    }
    public void men(){
        js.scrollToElement(mens);
        click(mens);
        Hooks.test.info("User selects Men's Category");
    }
    public void settShirts(){
        js.clickElement(tShirts);
        Hooks.test.info("User selects T-Shirts");
    }

    public void setSelectShirt(){
        js.scrollToElement(selectShirt);
        hoverOnProduct(selectShirt);
        Hooks.test.info("User selects first T-Shirts");

    }
    public void setAddToCartButton(){
        js.scrollToElement(addToCartButton);
        try {
            click(addToCartButton);
            Hooks.test.info("User adds to cart");
        }
        catch (ElementClickInterceptedException ec){
            js.clickElement(addToCartButton);
            Hooks.test.info("User adds to cart");
        }
    }

    public void finalproduct(){
        setProducts();
        men();
        settShirts();
        setSelectShirt();
        setAddToCartButton();

    }


}
