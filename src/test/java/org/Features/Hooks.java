package org.Features;

import com.aventstack.extentreports.ExtentTest;
import org.Pages.HomePage;
import org.Pages.LogOut;
import org.Utils.PropertiesManager;
import org.Utils.ReportingManager;
import org.Utils.WebDriverManager;
import org.testng.annotations.*;

public class Hooks {
    public static ExtentTest test;
    WebDriverManager webDriverManager;

    @BeforeSuite(groups = {"regression"})
    public void beforeSuite() {
        System.out.println("Executing @BeforeSuite");
        ReportingManager.intializeReport();
    }

    @AfterSuite(groups = {"regression"})
    public void afterSuite() {
        System.out.println("Executing @AfterSuite");
        ReportingManager.flushReport();
    }

    @BeforeTest(groups = {"regression"})
    public void beforeTest() {
        System.out.println("Executing @BeforeTest");
    }

    @AfterTest(groups = {"regression"})
    public void afterTest() {
        System.out.println("Executing @AfterTest");
    }

    @BeforeClass(groups = {"regression"})
    public void beforeClass() {
        System.out.println("Executing @BeforeClass");
    }

    @AfterClass(groups = {"regression"})
    public void afterClass() {
        System.out.println("Executing @AfterClass");
    }

    @BeforeMethod(groups = {"regression"})
    public void beforeMethod() {
        System.out.println("Executing @BeforeMethod");
        webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
    }

    @AfterMethod(groups = {"regression"})
    public void afterMethod() {
        System.out.println("Executing @AfterMethod");

    }

    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("Executing @Test - testMethod1 with priority 1");
        test=ReportingManager.extent.createTest("User Login");
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();
        org.Pages.Login login=new org.Pages.Login(webDriverManager.getDriver());
        login.enterUserNameAndPassword(PropertiesManager.getProperty("username"),PropertiesManager.getProperty("password"));
        login.setLoginButton();
        homepage.setHomeButton();

    }
    @Test(priority = 0)
    public void testMethod2() {
        System.out.println("Executing @Test - testMethod2 with priority 0");
        test=ReportingManager.extent.createTest("User Login and logout");
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();
        org.Pages.Login login=new org.Pages.Login(webDriverManager.getDriver());
        login.enterUserNameAndPassword(PropertiesManager.getProperty("username"),PropertiesManager.getProperty("password"));
        login.setLoginButton();
        LogOut logout=new LogOut(webDriverManager.getDriver());
        logout.finalLogout();
    }

    @Test(priority = 2)
    public void testMethod3() {
        System.out.println("Executing @Test - testMethod3 with priority 2");
        test=ReportingManager.extent.createTest("Products add");
        org.Pages.Products products=new org.Pages.Products(webDriverManager.getDriver());
        products.setProducts();
        products.men();
        products.settShirts();
        products.setSelectShirt();
        products.setAddToCartButton();
    }
    @Parameters({"userId","pwd"})
    @Test(groups = {"regression"})
    public void testMethodtemp(String userName, String pwd) {
        System.out.println("Executing @Test - testMethod1 with priority 1");
        test=ReportingManager.extent.createTest("User Login");
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();
        org.Pages.Login login=new org.Pages.Login(webDriverManager.getDriver());
        login.enterUserNameAndPassword(userName,pwd);
        login.setLoginButton();
        homepage.setHomeButton();
    }

}
