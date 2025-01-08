package org.Pages;

import org.Features.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends BasePage {
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logOutButton;

    public LogOut(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setLogOutButton(){
        click(logOutButton);
    }
    public void finalLogout(){
        setLogOutButton();
        Hooks.test.info("User clicks on logout ");
    }
}
