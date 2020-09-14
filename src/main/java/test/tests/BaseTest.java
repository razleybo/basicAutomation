package test.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver ;
    @BeforeClass
    public void driverSetup(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
    }
}
