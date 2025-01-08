package org.Features.Registration;

import org.Pages.EnterAccountInformation;
import org.Pages.SignupOrLogin;
import org.Utils.WebDriverManager;
import org.testng.annotations.Test;

public class Registration {
    @Test
    public void User_creates_a_new_account(){
        SignupOrLogin signupOrlogin=new SignupOrLogin(WebDriverManager.getDriver());
        signupOrlogin.signup("toni");
        EnterAccountInformation enteraccountinformation= new EnterAccountInformation(WebDriverManager.getDriver());
        enteraccountinformation.fillAccountInformation("Mr","12345678","8","September","2002",1,1,"Toni","Test","nope","1-1-5-/2,asjkhft","RTC x roads","India","Telangana","Hyderabad","500020","7894561230");
    }
}

