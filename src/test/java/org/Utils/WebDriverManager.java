package org.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class WebDriverManager {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }

    public void initializeBrowser() {
        switch(PropertiesManager.getProperty("browser")){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                options.addArguments("--start-maximized");
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("autofill.profile_enabled", false);
                options.setExperimentalOption("prefs", prefs);
                driver=new ChromeDriver(options);
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "IE":
                driver=new InternetExplorerDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

    }
}
