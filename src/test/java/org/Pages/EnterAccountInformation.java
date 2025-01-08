package org.Pages;

import org.Features.Hooks;
import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EnterAccountInformation extends BasePage{

    @FindBy(xpath = "//div[@id=\"uniform-id_gender1\"]")
    WebElement mrButton;

    @FindBy(xpath = "//div[@id=\"uniform-id_gender2\"]")
    WebElement mrsButton;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement passWord;


    @FindBy(id = "days")
    WebElement daysDropdown;

    @FindBy(id = "months")
    WebElement monthDropdown;

    @FindBy(id = "years")
    WebElement yearDropdown;

    @FindBy(xpath = "//input[@id=\"newsletter\"]")
    WebElement newsLetter;

    @FindBy(xpath = "//input[@id=\"optin\"]")
    WebElement offers;

    @FindBy(xpath = "//input[@id=\"first_name\"]")
    WebElement fName;

    @FindBy(xpath = "//input[@id=\"last_name\"]")
    WebElement lName;

    @FindBy(xpath = "//input[@id=\"company\"]")
    WebElement company;

    @FindBy(xpath = "//input[@id=\"address1\"]")
    WebElement address1;

    @FindBy(xpath ="//input[@id=\"address2\"]")
    WebElement address2;

    @FindBy(id = "country")
    WebElement countryDropdown;

    @FindBy(xpath = "//input[@id=\"state\"]")
    WebElement state;

    @FindBy(xpath = "//input[@id=\"city\"]")
    WebElement city;

    @FindBy(xpath = "//input[@id=\"zipcode\"]")
    WebElement zipCode;

    @FindBy(xpath = "//input[@id=\"mobile_number\"]")
    WebElement mobileNumber;

    @FindBy(css = "button[data-qa=\"create-account\"]")
    WebElement createButton;

    @FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
    WebElement continueButton;

    JSManager js;

    public EnterAccountInformation(WebDriver driver){

        PageFactory.initElements(driver, this);
        js=new JSManager(new WebDriverManager().getDriver());
    }

    public void chooseGender(String gender){
        if(gender.equalsIgnoreCase("Mr")){
            click(mrButton);
        } else if (gender.equalsIgnoreCase("Mrs")) {
            click(mrsButton);

        }
    }

    public void setPassWord(String pword){
        sendKeys(passWord,pword);

    }


    public void setDOB(String day, String month, String year){
        selectValueFromDropDown(daysDropdown,"text",day);
        selectValueFromDropDown(monthDropdown,"text",month);
        selectValueFromDropDown(yearDropdown,"text",year);
    }

    public void nletters(int ans){

        js.scrollToElement(newsLetter);
        if(ans==0){
            return;

        } else if (ans==1) {
            click(newsLetter);
        }
    }

    public void offer(int ans){

        if(ans==0){
            return;
        }
        else if (ans==1) {
            click(offers);
        }

    }

    public void firstNameAndLastName(String name, String name1){
        sendKeys(fName,name);
        sendKeys(lName,name1);
    }

    public void setCompany(String company1){
        sendKeys(company,company1);
    }

    public void setAddress1(String add1) {
        sendKeys(address1,add1);
    }

    public void setAddress2(String add1) {
        sendKeys(address2,add1);
    }

    public void setCountryDropdown(String country){
        selectValueFromDropDown(countryDropdown,"text",country);
    }

    public void setStateAndCity(String state1, String city1){
        sendKeys(state,state1);
        sendKeys(city,city1);
    }

    public void setZipCode(String zip){
        sendKeys(zipCode,zip);
    }

    public void setMobileNumber(String num){
        sendKeys(mobileNumber,num);
    }

    public void createAcc(){

        js.scrollToElement(createButton);
        click(createButton);
    }
    public void setContinueButton(){
        click(continueButton);
    }


    public void fillAccountInformation(String gender, String password, String day, String month, String year, int newsletter, int offers,
                                       String firstName, String lastName, String companyName,
                                       String address1, String address2,String country, String stateName,
                                       String cityName, String zip, String mobile) {
        chooseGender(gender);
        setPassWord(password);
        setDOB(day, month, year);
        nletters(newsletter);
        offer(offers);
        firstNameAndLastName(firstName, lastName);
        setCompany(companyName);
        setAddress1(address1);
        setAddress2(address2);
        setCountryDropdown(country);
        setStateAndCity(stateName, cityName);
        setZipCode(zip);
        setMobileNumber(mobile);
        createAcc();
        setContinueButton();
        Hooks.test.info("User enters all the require info and clicked on continue button");
    }
}
