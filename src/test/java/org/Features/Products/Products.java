package org.Features.Products;

import org.Utils.WebDriverManager;
import org.testng.annotations.Test;

public class Products {
    @Test
    public void User_on_products(){
        org.Pages.Products products=new org.Pages.Products(WebDriverManager.getDriver());
        products.setProducts();
        products.men();
        products.settShirts();
        products.setSelectShirt();
        products.setAddToCartButton();
    }
}
