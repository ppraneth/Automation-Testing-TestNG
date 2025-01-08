package org.Features.TestCases;

import org.Utils.WebDriverManager;
import org.testng.annotations.Test;

public class TestCases {
    @Test
    public void User_click_on_TestCase(){
        org.Pages.TestCases testcases=new org.Pages.TestCases(WebDriverManager.getDriver());
        testcases.fetchAllTestCases();
    }
}
