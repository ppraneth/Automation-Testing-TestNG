package org.Pages;

import org.Features.Hooks;
import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homeButton;

    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    WebElement signupOrLoginTab;

    @FindBy(xpath = "//div[@class=\"shop-menu pull-right\"]//a")
    List<WebElement> category;

    @FindBy(xpath = "//a[@href=\"#top\"]")
    WebElement scrollUpButton;                   //for homepage only not for singUpOrLoginButton

    @FindBy(xpath = "//h2[text()=\"Subscription\"]")
    WebElement checkSubscriptiomVisibility;      //for homepage only not for singUpOrLoginButton

    JSManager js;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        js=new JSManager(new WebDriverManager().getDriver());
    }

    public void setHomeButton(){
        click(homeButton);
        Hooks.test.info("User clicks on home button");

    }

    // For Test case 25 only
    public void scrollToBottom(){
        js.scrollToBottomOfWebPage();
        if(checkSubscriptiomVisibility.isDisplayed()){
            System.out.println("Subscription Visible");
        }
        else {
            js.scrollToElement(checkSubscriptiomVisibility);
        }
    }
    public void scrollUpWithArrow(){
        try{
            click(scrollUpButton);
        }
        catch (ElementClickInterceptedException ec){
            js.clickElement(scrollUpButton);
        }
    }
    public void finalscrollDownAndScrollUpArrow(){
        scrollToBottom();
        scrollUpWithArrow();
        Hooks.test.info("User scrolls to bottom of webpage and scrolls up with arrow button");
    } //Test case 25 end

    //Test Case 26 Start
    public void finalscrollDownAndScrollUp(){
        scrollToBottom();
        js.scrollToTopOfWebPage();
        Hooks.test.info("User scrolls to bottom of webpage and scrolls up without arrow button");
    } //Test case 26 End

    public void clickOnsignupOrLoginTab(){
        click(signupOrLoginTab);
        Hooks.test.info("User clicked on Signup Or Login Tab");
    }
}
