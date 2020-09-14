package test.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.UrlChecker;
import test.pages.RequestDemoPage;
import test.sectiones.SubscribeFormSection;

import java.net.MalformedURLException;
import java.net.URL;

public class ContactUsActions extends  BaseActions{

    private RequestDemoPage requestDemoPage;
    private SubscribeFormSection subscribeFormSection;

    public ContactUsActions(WebDriver webDriver) {
        super(webDriver);
        requestDemoPage = new RequestDemoPage(this.webDriver);
        subscribeFormSection = new SubscribeFormSection(this.webDriver);
    }

    public void goToContactUsPage() {
        webDriver.navigate().to(requestDemoPage.getPageUrl());
        watiForElement(requestDemoPage.getFreeTileBatten(),5); // 5 need to go to propeties
    }

    public void fillForm (FormData dataToFill){
        watiForElement(subscribeFormSection.getFtsNameInput(),5); // 5 need to go to propeties
        subscribeFormSection.seFstName(dataToFill.fstName);
        subscribeFormSection.setLastName(dataToFill.lastName);
        subscribeFormSection.setJobTitle(dataToFill.jobTitle);
        subscribeFormSection.setPhone(dataToFill.phoneNumber);

    }


    public static class FormData{
        String fstName ,lastName ,bisMail,compMail, compName, jobTitle ,phoneNumber ,country ;

        public FormData withFstName(String fstName) {
            this.fstName = fstName;
            return this;
        }

        public FormData withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public FormData withBisMail(String bisMail) {
            this.bisMail = bisMail;
            return this;
        }

        public FormData withCompMail(String compMail) {
            this.compMail = compMail;
            return this;
        }

        public FormData withCompName(String compName) {
            this.compName = compName;
            return this;
        }

        public FormData withJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public FormData withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public FormData withCountry(String country) {
            this.country = country;
            return this;
        }
    }
}
