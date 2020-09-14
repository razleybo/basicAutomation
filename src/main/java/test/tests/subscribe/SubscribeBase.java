package test.tests.subscribe;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.actions.ContactUsActions;
import test.tests.BaseTest;

import java.net.MalformedURLException;

public abstract class SubscribeBase extends BaseTest {
 protected ContactUsActions contactUsActions ;

    @BeforeClass
    public void actionsSetup(){
        contactUsActions = new ContactUsActions(this.driver);
    }
    @Test(description="Load Page",priority = 10)
    public void goToPage() throws MalformedURLException {
        contactUsActions.goToContactUsPage();
    }
    @Test(description="Fill Data",priority = 20)
    public void FillData(){
        contactUsActions.fillForm(getData());
        //submit
    }
    @Test(description="Verify Form",priority = 30)
    public void verify(){
        verifyData();
    }

    protected abstract ContactUsActions.FormData getData();

    protected abstract void verifyData();

}
