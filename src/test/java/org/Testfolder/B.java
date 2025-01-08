package org.Testfolder;

import org.Pages.*;
import org.Utils.PropertiesManager;
import org.Utils.ScreenShotManager;
import org.Utils.WebDriverManager;
import org.junit.Test;
//import org.testng.annotations.Test;

public class B {
@Test
    public void test(){



        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();
        SignupOrLogin signupOrlogin=new SignupOrLogin(webDriverManager.getDriver());
        signupOrlogin.signup("toni");
        EnterAccountInformation enteraccountinformation= new EnterAccountInformation(webDriverManager.getDriver());
        enteraccountinformation.fillAccountInformation("Mr","12345678","8","September","2002",1,1,"Toni","Test","nope","1-1-5-/2,asjkhft","RTC x roads","India","Telangana","Hyderabad","500020","7894561230");
        //String currentUrl = webDriverManager.getDriver().getCurrentUrl();
        //System.out.println(currentUrl);
        Products products=new Products(webDriverManager.getDriver());
        products.finalproduct();
        Cart cart=new Cart(webDriverManager.getDriver());
        cart.finalCart();
        CheckOut checkOut=new CheckOut(webDriverManager.getDriver());
        checkOut.finalcheckout();
        Payment payment=new Payment(webDriverManager.getDriver());
        payment.finalPayment("Toni","7845668955","007","08","2030");





    }
    
    public void loginTest(){
        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();
        //ScreenShotManager ssm=new ScreenShotManager(webDriverManager.getDriver());
        Login login=new Login(webDriverManager.getDriver());
        login.finalLogin(PropertiesManager.getProperty("username"),PropertiesManager.getProperty("password"));
        //ssm.captureScreenshot("login_test");

    }
    
    public void logOutTest(){
        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homepage=new HomePage(webDriverManager.getDriver());
        homepage.clickOnsignupOrLoginTab();
        Login login=new Login(webDriverManager.getDriver());
        login.finalLogin("toni896qeee972@gmail.com","12345678");
        LogOut logout=new LogOut(webDriverManager.getDriver());
        logout.finalLogout();
    }
    
    public void testCaseClick() {
        WebDriverManager webDriverManager = new WebDriverManager();
        webDriverManager.initializeBrowser();
        TestCases testCases=new TestCases(webDriverManager.getDriver());
        testCases.finalTestCaseButton();

    }
    
    public void emptyCart(){
        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        Products products=new Products(webDriverManager.getDriver());
        products.finalproduct();
        Cart cart=new Cart(webDriverManager.getDriver());
        cart.finalCart();
        cart.setDeleteProduct();
    }
     //Test case 25
    public void scrollDownWebPage(){
        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homePage=new HomePage(webDriverManager.getDriver());
        homePage.finalscrollDownAndScrollUpArrow();
    }
     //TestCase 26
    public void testCase26(){
        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        HomePage homePage=new HomePage(webDriverManager.getDriver());
        homePage.finalscrollDownAndScrollUp();
    }
    @Test  //prints all test cases
    public void tempo(){
        WebDriverManager webDriverManager =new WebDriverManager();
        webDriverManager.initializeBrowser();
        TestCases testcases=new TestCases(webDriverManager.getDriver());
        testcases.finalTestCaseButton();
        testcases.fetchAllTestCases();
    }
    @Test
    public void tempo2(){
        System.out.println("Hello");
    }


}
