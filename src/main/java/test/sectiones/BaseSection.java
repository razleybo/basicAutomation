package test.sectiones;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseSection {

    protected WebDriver driver;
    //acsses only to packeg -> avoiding using in tests
    BaseSection (WebDriver webDriver){
        this.driver=webDriver;
        PageFactory.initElements(this.driver, this);
    }
}
