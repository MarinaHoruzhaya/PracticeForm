package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationPageTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFirstName("Marina")
                .setLastName("Horuzhaya")
                .setUserEmail("marinakh192@gmail.com")
                .setGender("Female")
                .setMobileNumber("8076009123")
                .setBirthDate("19", "August","2002")
                .setSubject("Maths")
                .setHobby("Sports")
                .uploadPicture("homework1.png")
                .setCurrentAdress("Bobruiskaya")
                .setState("Haryana")
                .setCity("Karnal")
                .clickSubmitButton();

        registrationPage.checkResult("Marina Horuzhaya","Student Name")
                    .checkResult("marinakh192@gmail.com","Student Email")
                    .checkResult("Female","Gender")
                    .checkResult("8076009123","Mobile")
                    .checkResult("19 August,2002","Date of Birth")
                    .checkResult("Maths","Subjects")
                    .checkResult("Sports","Hobbies")
                    .checkResult("homework1.png","Picture")
                    .checkResult("Bobruiskaya","Address")
                    .checkResult("Haryana Karnal","State and City");

    }
}
