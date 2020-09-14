package test.tests.subscribe;

import test.actions.ContactUsActions;

public class SubscribeSqlInjeection extends SubscribeBase {
    protected ContactUsActions.FormData getData() {
        ContactUsActions.FormData data = new ContactUsActions.FormData();
        data
                .withFstName("raz")
                .withLastName("leybo")
                .withCompMail("my@mail")
                .withCompName(";\" 1=1 ;")
                .withJobTitle("automatio")
                .withPhoneNumber("1800-555555")
                .withCountry("Israel");
        return data;
    }

    protected void verifyData() {
        //verify fail
    }
}
