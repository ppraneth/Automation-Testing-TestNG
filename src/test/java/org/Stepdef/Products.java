package org.Stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Pages.HomePage;
import org.Utils.WebDriverManager;

public class Products {
    @When("User clicks on product page")
    public void userClicksOnProductPage() {
        org.Pages.Products products=new org.Pages.Products(WebDriverManager.getDriver());
        products.setProducts();
    }


    @And("User selects Mens Category")
    public void userSelectsMensCategory() {
        org.Pages.Products products=new org.Pages.Products(WebDriverManager.getDriver());
        products.men();

    }
    @Then("User clicks on Tshirt")
    public void userClicksOnTshirt() {
        org.Pages.Products products=new org.Pages.Products(WebDriverManager.getDriver());
        products.settShirts();
    }
    @And("User Select a Tshirt")
    public void userSelectATshirt() {
        org.Pages.Products products=new org.Pages.Products(WebDriverManager.getDriver());
        products.setSelectShirt();

    }

    @Then("User adds it to cart")
    public void userAddsItToCart() {
        org.Pages.Products products=new org.Pages.Products(WebDriverManager.getDriver());
        products.setAddToCartButton();
    }


}
