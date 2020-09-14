package test.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    WebDriver webDriver;
    protected BaseActions(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    public void watiForElement(WebElement elementToWaitTo,int secToWait){
        WebDriverWait wait = new WebDriverWait(webDriver,secToWait);
        wait.until(ExpectedConditions.visibilityOf(elementToWaitTo));
    }
}
