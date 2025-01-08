package org.Stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Pages.HomePage;
import org.Pages.LogOut;
import org.Utils.PropertiesManager;
import org.Utils.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static WebDriverManager webDriverManager;

    @Given("User on login page")
    public void user_on_login_page() {
        webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();

    }

    @Then("user enters user name and password")
    public void userEntersUserNameAndPassword() {
        org.Pages.Login login=new org.Pages.Login(webDriverManager.getDriver());
        login.enterUserNameAndPassword(PropertiesManager.getProperty("username"),PropertiesManager.getProperty("password"));
        
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        org.Pages.Login login=new org.Pages.Login(webDriverManager.getDriver());
        login.setLoginButton();

        
    }

    @Then("user navigated to home page")
    public void userNavigatedToHomePage() {
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.setHomeButton();
        Assert.assertEquals("Automation Exercise",webDriverManager.getDriver().getTitle());
    }

    @Then("user should see error")
    public void userShouldSeeError() {
        System.out.println("Invalid Credentials");
    }

    @Then("user enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
        org.Pages.Login login=new org.Pages.Login(webDriverManager.getDriver());
        login.enterUserNameAndPassword(arg0,arg1);

    }

    @Then("user enters <user_name> and <password>")
    public void userEntersUser_nameAndPassword() {
        
    }

    @And("display message {string}")
    public void displayMessage() {

    }

    @Then("user clicks on logout")
    public void userClicksOnLogout() {
        LogOut logout=new LogOut(webDriverManager.getDriver());
        logout.finalLogout();
    }
}
