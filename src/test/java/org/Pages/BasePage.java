package org.Pages;


import org.Utils.JSManager;
import org.Utils.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public void click(WebElement element){
        element.click();
    }
    public void sendKeys(WebElement element, String data){
        element.sendKeys(data);
    }
    public void selectValueFromDropDown(WebElement element, String optionType,String option) {
        Select select = new Select(element);
        switch (optionType) {
            case "value":
                select.selectByValue(option);
                break;
            case "text":
                select.selectByVisibleText(option);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(option));
                break;

        }
    }
    public void hoverOnProduct(WebElement element){
        Actions actions=new Actions(new WebDriverManager().getDriver());
        actions.moveToElement(element).perform();
    }

}
