package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver webDriver){
        this.driver=webDriver;
        PageFactory.initElements(this.driver, this);
    }
    public abstract String getPageUrl();
}
