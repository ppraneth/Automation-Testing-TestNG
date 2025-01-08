package org.Pages;

import org.Features.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage{
    @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    WebElement enterLoginEmail;

    @FindBy(xpath = "//input[@data-qa=\"login-password\"]")
    WebElement loginPassword;

    @FindBy(css = "button[data-qa=\"login-button\"]")
    WebElement loginButton;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setEnterLoginEmail(String login){
        sendKeys(enterLoginEmail,login);
    }
    public void setLoginPassword(String pwd){
        sendKeys(loginPassword,pwd);
    }
    public void setLoginButton(){
        click(loginButton);
        Hooks.test.info("User clicks on login btn");

    }
    public void finalLogin(String login,String pwd){
        setEnterLoginEmail(login);
        setLoginPassword(pwd);
        setLoginButton();
    }
    public void enterUserNameAndPassword(String login,String pwd){
        setEnterLoginEmail(login);
        Hooks.test.info("User enters user email as "+login);
        setLoginPassword(pwd);
        Hooks.test.info("User enters user password as "+pwd);

    }


}
