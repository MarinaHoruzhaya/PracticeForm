package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

    SelenideElement
            userName= $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submitButton = $("#submit"),
            finalTable = $("#output");

    public TextBoxPage openPage(){
        open("/text-box");
        return this;
    }

    public TextBoxPage removeBanners(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage setName(String value){
        userName.setValue(value);
        return this;
    }

    public TextBoxPage setEmail (String value){
        userEmail.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value){
        currentAddress.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value){
        permanentAddress.setValue(value);
        return this;
    }

    public TextBoxPage clickOnSubmitButton(){
        submitButton.click();
        return this;
    }

    public TextBoxPage checkResult(String valueCheck, String value) {
        finalTable.$(byText(value)).parent().shouldHave(text(valueCheck));
        return this;
    }
}
