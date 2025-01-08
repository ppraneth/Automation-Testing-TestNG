package org.Pages;


import org.Features.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestCases extends BasePage {
    @FindBy(xpath = "//a[@href=\"/test_cases\"]")
    WebElement testCaseButton;

    @FindBy(xpath = "//section[@id=\"form\"]//a[@data-toggle=\"collapse\"]/u")
    List<WebElement> testCases;

    public TestCases(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setTestCaseButton(){
        click(testCaseButton);
    }

    public void fetchAllTestCases()  //Test cases list print
    {
        for(int i=0;i<testCases.size();i++)
        {
            System.out.println(testCases.get(i).getText());
            Hooks.test.info(testCases.get(i).getText());  //shows as info in report
        }

    }
    public void finalTestCaseButton(){
        setTestCaseButton();
        Hooks.test.info("User clicks on test case button");
    }
}
