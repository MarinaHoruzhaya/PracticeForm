package utils;

public class UserVariables {

   RandomUtils randomUtils = new RandomUtils();
   public String firstName = randomUtils.getRandomFirstName(),
        lastName = randomUtils.getRandomLastName(),
        email = randomUtils.getRandomEmail(),
        gender = randomUtils.getRandomGender(),
        mobileNumber = randomUtils.getRandomMobileNumber(),
        dayBirth = randomUtils.getRandomDay(),
        monthBirth = randomUtils.getRandomMonth(),
        yearBirth  = randomUtils.getRandomYear(),
        subject = randomUtils.getRandomSubject(),
        hobby = randomUtils.getRandomHobbie(),
        picture = randomUtils.getRandomPicture(),
        currentAddress = randomUtils.getRandomAddress(),
        state = randomUtils.getRandomState(),
        city = randomUtils.getRandomCity(state);
}
