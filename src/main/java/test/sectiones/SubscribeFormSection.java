package test.sectiones;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubscribeFormSection extends BaseSection {



    @FindBy(how = How.XPATH,using = "//input[contains(@id,'FirstName')]")
    private WebElement ftsNameInput;

    @FindBy(how = How.XPATH,using = "//input[contains(@id,'LastName')]")
    private WebElement lastNameInput;

    @FindBy(how = How.XPATH,using = "//input[contains(@id,'Email')]")
    private WebElement emailInput;

    @FindBy(how = How.XPATH,using = "//input[contains(@id,'Company')]")
    private WebElement companyNameInput;

    @FindBy(how = How.XPATH,using = "//input[contains(@id,'Title')]")
    private WebElement jobTitleInput;

    @FindBy(how = How.XPATH,using = "//input[contains(@id,'Phone')]")
    private WebElement phoneInput;



    public SubscribeFormSection(WebDriver driver){
       super(driver);
    }
    public WebElement getFtsNameInput() {
        return ftsNameInput;
    }

    public void seFstName(String nameToSet){
        ftsNameInput.sendKeys(nameToSet);
    }
    public void setLastName(String nameToSet){
        lastNameInput.sendKeys(nameToSet);
    }
    public void setEmail(String mailToSet){
        emailInput.sendKeys(mailToSet);
    }
    public void setCompany(String CompanyToSet){
        companyNameInput.sendKeys(CompanyToSet);
    }
    public void setJobTitle(String jobTitleToSet){
        jobTitleInput.sendKeys(jobTitleToSet);
    }
    public void setPhone(String phoneToSet){
        phoneInput.sendKeys(phoneToSet);
    }

}
