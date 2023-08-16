package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static utils.UserVariables.*;

public class RegistrationPageWithFakerTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .removeBanners()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(email)
                .setGender(gender)
                .setMobileNumber(mobileNumber)
                .setBirthDate(dayBirth,monthBirth,yearBirth)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadPicture(picture)
                .setCurrentAdress(currentAddress)
                .setState(state)
                .setCity(city)
                .clickSubmitButton();

        registrationPage.checkResult(firstName,"Student Name")
                    .checkResult(email,"Student Email")
                    .checkResult(gender,"Gender")
                    .checkResult(mobileNumber,"Mobile")
                    .checkResult(dayBirth + " " + monthBirth + "," + yearBirth,"Date of Birth")
                    .checkResult(subject,"Subjects")
                    .checkResult(hobby,"Hobbies")
                    .checkResult(picture,"Picture")
                    .checkResult(currentAddress,"Address")
                    .checkResult(state +" "+city,"State and City");
    }
}
