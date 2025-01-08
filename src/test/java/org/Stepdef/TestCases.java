package org.Stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Pages.SignupOrLogin;
import org.Utils.WebDriverManager;

public class TestCases {
    public static WebDriverManager webDriverManager;

    @Given("User click on TestCase")
    public void userClickOnTestCase() {
        webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        org.Pages.TestCases testcases=new org.Pages.TestCases(webDriverManager.getDriver());
        testcases.finalTestCaseButton();
    }

    @Then("User runs and prints all testcases")
    public void userRunsAndPrintsAllTestcases() {
        org.Pages.TestCases testcases=new org.Pages.TestCases(webDriverManager.getDriver());
        testcases.fetchAllTestCases();
    }


}
