package org.Pages;

import org.Features.Hooks;
import org.Utils.RandomDataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupOrLogin extends BasePage{
    @FindBy(css = "input[data-qa=\"signup-name\"]")
    WebElement nameInputField;


    @FindBy(css = "input[data-qa=\"signup-email\"]")
    WebElement emailInputField;


    @FindBy(css = "button[data-qa=\"signup-button\"]")
    WebElement signupButton;

    public SignupOrLogin(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String userName)
    {
        sendKeys(nameInputField,userName);
    }

    public void enterUserEmail(String userName)
    {
        RandomDataManager randomDataManager=new RandomDataManager();

        sendKeys(emailInputField,randomDataManager.getEmailAddress(userName));

    }


    public void clickOnsignupButton()
    {
        click(signupButton);
    }


    public void signup(String userName)
    {
        enterUserName(userName);
        Hooks.test.info("User enters username"+userName);
        enterUserEmail(userName);
        Hooks.test.info("User enters email"+userName);
        clickOnsignupButton();
    }

}


