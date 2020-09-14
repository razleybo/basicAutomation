package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RequestDemoPage extends BasePage {

    final String pageUrl  = "https://www.observeit.com/contact-us/";



    @FindBy (how = How.LINK_TEXT , using = "Free Trial")
    WebElement freeTileBatten;

    public RequestDemoPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String getPageUrl() {
        return pageUrl;
    }
    public WebElement getFreeTileBatten() {
        return freeTileBatten;
    }

}
