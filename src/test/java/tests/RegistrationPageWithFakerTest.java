package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.UserVariables;

import static io.qameta.allure.Allure.step;

public class RegistrationPageWithFakerTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    UserVariables userVariables = new UserVariables();

    @DisplayName("Successful registration on form")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("HoruzhayaMarina")
    @Tag(value = "faker")
    @Test
    void fillFormTest() {
        step("Open main page",() ->
        registrationPage.openPage()
                .removeBanners());
        step("Fill the fields",() ->
        registrationPage.setFirstName(userVariables.firstName)
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
                .clickSubmitButton());

        step("Check results", () ->
        registrationPage.checkResult(userVariables.firstName,"Student Name")
                    .checkResult(userVariables.email,"Student Email")
                    .checkResult(userVariables.gender,"Gender")
                    .checkResult(userVariables.mobileNumber,"Mobile")
                    .checkResult(userVariables.dayBirth + " " + userVariables.monthBirth + "," + userVariables.yearBirth,"Date of Birth")
                    .checkResult(userVariables.subject,"Subjects")
                    .checkResult(userVariables.hobby,"Hobbies")
                    .checkResult(userVariables.picture,"Picture")
                    .checkResult(userVariables.currentAddress,"Address")
                    .checkResult(userVariables.state +" "+userVariables.city,"State and City"));
    }
}
