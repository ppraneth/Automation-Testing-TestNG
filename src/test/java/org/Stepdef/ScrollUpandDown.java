package org.Stepdef;

import io.cucumber.java.en.Then;
import org.Pages.HomePage;
import org.Utils.PropertiesManager;
import org.Utils.WebDriverManager;

public class ScrollUpandDown {
    public static WebDriverManager webDriverManager;
    
    @Then("User Scrolls to bottom and comes up")
    public void userScrollsToBottomAndComesUp() {
        webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homePage=new HomePage(webDriverManager.getDriver());
        homePage.finalscrollDownAndScrollUpArrow();
    }

    @Then("User Scrolls to bottom and comes up without arrow")
    public void userScrollsToBottomAndComesUpWithoutArrow() {
        HomePage homePage=new HomePage(webDriverManager.getDriver());
        homePage.finalscrollDownAndScrollUp();
    }
}
