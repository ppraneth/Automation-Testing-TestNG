package org.Features.Scroll;

import org.Pages.HomePage;
import org.Utils.WebDriverManager;
import org.testng.annotations.Test;

public class ScrollUpandDown {
    @Test
    public void User_Scroll_up_and_down_without_arrow(){
        HomePage homePage=new HomePage(WebDriverManager.getDriver());
        homePage.finalscrollDownAndScrollUp();
    }
    @Test
    public void User_Scroll_up_and_down_with_arrow(){
        HomePage homePage=new HomePage(WebDriverManager.getDriver());
        homePage.finalscrollDownAndScrollUpArrow();
    }
}
