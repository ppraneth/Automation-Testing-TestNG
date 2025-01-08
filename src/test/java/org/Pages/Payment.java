package org.Pages;

import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends BasePage{
    @FindBy(xpath = "//input[@name=\"name_on_card\"]")
    WebElement cardName;

    @FindBy(xpath = "//input[@data-qa=\"card-number\"]")
    WebElement cardNumber;

    @FindBy(xpath = "//input[@name=\"cvc\"]")
    WebElement cvvNumber;

    @FindBy(xpath = "//input[@class=\"form-control card-expiry-month\"]")
    WebElement monthExpiry;

    @FindBy(xpath = "//input[@name=\"expiry_year\"]")
    WebElement yearExpiry;

    @FindBy(css = "button[id=\"submit\"]")
    WebElement payButton;

    public Payment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setCardName(String name){
        sendKeys(cardName,name);
    }
    public void setCardNumber(String number){
        sendKeys(cardNumber,number);
    }
    public void setCvvNumber(String cvvNum){
        sendKeys(cvvNumber,cvvNum);
    }
    public void setMonthExpiry(String month){
        sendKeys(monthExpiry,month);
    }
    public void setYearExpiry(String year){
        sendKeys(yearExpiry,year);
    }
    public void setPayButton(){
        JSManager js=new JSManager(new WebDriverManager().getDriver());
        js.clickElement(payButton);
    }
    public void finalPayment(String name, String number, String cvv,String month,String year){
        setCardName(name);
        setCardNumber(number);
        setCvvNumber(cvv);
        setMonthExpiry(month);
        setYearExpiry(year);
        setPayButton();
    }
}
