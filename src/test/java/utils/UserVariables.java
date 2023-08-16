package utils;
import static utils.RandomUtils.*;

public class UserVariables {

   public static String firstName = getRandomFirstName(),
        lastName = getRandomLastName(),
        email = getRandomEmail(),
        gender = getRandomGender(),
        mobileNumber = getRandomMobileNumber(),
        dayBirth = getRandomDay(),
        monthBirth = getRandomMonth(),
        yearBirth  = getRandomYear(),
        subject = getRandomSubject(),
        hobby = getRandomHobbie(),
        picture = getRandomPicture(),
        currentAddress = getRandomAddress(),
        state = getRandomState(),
        city = getRandomCity(state);
}
