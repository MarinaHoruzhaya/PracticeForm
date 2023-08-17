package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.RandomUtils;
import utils.UserVariables;

import static utils.UserVariables.*;

public class RegistrationPageWithFakerTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    UserVariables userVariables = new UserVariables();

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .removeBanners()
                .setFirstName(userVariables.firstName)
                .setLastName(userVariables.lastName)
                .setUserEmail(userVariables.email)
                .setGender(userVariables.gender)
                .setMobileNumber(userVariables.mobileNumber)
                .setBirthDate(userVariables.dayBirth,userVariables.monthBirth,userVariables.yearBirth)
                .setSubject(userVariables.subject)
                .setHobby(userVariables.hobby)
                .uploadPicture(userVariables.picture)
                .setCurrentAdress(userVariables.currentAddress)
                .setState(userVariables.state)
                .setCity(userVariables.city)
                .clickSubmitButton();

        registrationPage.checkResult(userVariables.firstName,"Student Name")
                    .checkResult(userVariables.email,"Student Email")
                    .checkResult(userVariables.gender,"Gender")
                    .checkResult(userVariables.mobileNumber,"Mobile")
                    .checkResult(userVariables.dayBirth + " " + userVariables.monthBirth + "," + userVariables.yearBirth,"Date of Birth")
                    .checkResult(userVariables.subject,"Subjects")
                    .checkResult(userVariables.hobby,"Hobbies")
                    .checkResult(userVariables.picture,"Picture")
                    .checkResult(userVariables.currentAddress,"Address")
                    .checkResult(userVariables.state +" "+userVariables.city,"State and City");
    }
}
