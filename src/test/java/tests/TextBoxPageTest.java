package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxPageTest extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void fillFormTest() {
        textBoxPage.openPage()
                .removeBanners()
                .setName("Marina Horuzhaya")
                .setEmail("marinalh192@gmail.com")
                .setCurrentAddress("Some address 1")
                .setPermanentAddress("Another address 1")
                .clickOnSubmitButton();

        textBoxPage.checkResult("Marina Horuzhaya", "Name:")
                .checkResult("marinalh192@gmail.com","Email:")
                .checkResult("Some address 1","Current Address :")
                .checkResult("Another address 1","Permananet Address :");
    }
}
