package org.Features.Login;

import org.Pages.HomePage;
import org.Pages.LogOut;
import org.Utils.PropertiesManager;
import org.Utils.WebDriverManager;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void User_able_to_login_with_valid_credential(){
        org.Pages.Login login=new org.Pages.Login(WebDriverManager.getDriver());
        login.enterUserNameAndPassword(PropertiesManager.getProperty("username"),PropertiesManager.getProperty("password"));
        login.setLoginButton();
        HomePage homepage=new HomePage(WebDriverManager.getDriver());
        homepage.setHomeButton();
        Assert.assertEquals("Automation Exercise",WebDriverManager.getDriver().getTitle());
    }
    @Test
    public void User_able_to_logout(){
        org.Pages.Login login=new org.Pages.Login(WebDriverManager.getDriver());
        login.enterUserNameAndPassword(PropertiesManager.getProperty("username"),PropertiesManager.getProperty("password"));
        login.setLoginButton();
        LogOut logout=new LogOut(WebDriverManager.getDriver());
        logout.finalLogout();
    }
}
