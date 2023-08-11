package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput =  $("#lastName"),
            userEmail = $("#userEmail"),
            genderWrapper =  $("#genterWrapper"),
            userNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            birthDateInput = $("#dateOfBirthInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            userAdress = $("#currentAddress"),
            uploadPictureInput = $("#uploadPicture"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            submitButton = $("#submit"),
            finalTable = $(".table-responsive");

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage removeBanners(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String name){
        firstNameInput.setValue(name);
        return this;
    }

    public RegistrationPage setLastName(String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String email){
        userEmail.setValue(email);
        return this;
    }

    public RegistrationPage setGender (String value){
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setMobileNumber (String number){
        userNumber.setValue(number);
        return this;
    }

    public RegistrationPage setSubject (String subject){
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobby (String hobby){
        hobbiesInput.$(byText(hobby)).click();
        return this;
    }

    public RegistrationPage setCurrentAdress (String adress){
        userAdress.setValue(adress);
        return this;
    }

    public RegistrationPage setBirthDate (String day, String month, String year){
        birthDateInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage uploadPicture (String fileName){
        uploadPictureInput.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationPage setState (String value){
        stateInput.click();
        stateInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity (String value){
        cityInput.click();
        cityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage clickSubmitButton (){
        submitButton.click();
        return this;
    }

    public RegistrationPage checkResult(String valueCheck, String value){
        finalTable.$(byText(value)).parent().shouldHave(text(valueCheck));
        return this;
    }

}
