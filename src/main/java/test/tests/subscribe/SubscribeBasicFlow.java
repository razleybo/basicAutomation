package test.tests.subscribe;

import test.actions.ContactUsActions;

public class SubscribeBasicFlow extends  SubscribeBase {

    protected ContactUsActions.FormData getData() {
        ContactUsActions.FormData data = new ContactUsActions.FormData();
        data
            .withFstName("raz")
            .withLastName("leybo")
            .withCompMail("my@mail")
            .withCompName("observit")
            .withJobTitle("automatio")
            .withPhoneNumber("1800-555555")
            .withCountry("Israel");
        return data;
    }

    protected void verifyData() {
        // verify ceriation
    }
}
