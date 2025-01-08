package org.Stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Pages.EnterAccountInformation;
import org.Pages.HomePage;
import org.Pages.SignupOrLogin;
import org.Utils.WebDriverManager;

public class Registration {

    @Then("User enters name and email")
    public void userEntersNameAndEmail() {
        SignupOrLogin signupOrlogin=new SignupOrLogin(WebDriverManager.getDriver());
        signupOrlogin.signup("toni");


    }

    @And("User enters the account info")
    public void userEntersTheAccountInfo() {
        EnterAccountInformation enteraccountinformation= new EnterAccountInformation(WebDriverManager.getDriver());
        enteraccountinformation.fillAccountInformation("Mr","12345678","8","September","2002",1,1,"Toni","Test","nope","1-1-5-/2,asjkhft","RTC x roads","India","Telangana","Hyderabad","500020","7894561230");
    }

}
