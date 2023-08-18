package utils;

import com.github.javafaker.Faker;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    Faker faker = new Faker();

    public int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public String getRandomFirstName(){
        return faker.name().firstName();
    }

    public String getRandomLastName(){
        return faker.name().lastName();
    }

    public String getRandomEmail(){
        return faker.internet().emailAddress();
    }

    public String getRandomGender(){
        String [] gender = {"Male","Female","Other"};
        return faker.options().option(gender);
    }

    public String getRandomMobileNumber(){
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomMonth(){
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return faker.options().option(months);
    }

    public String getRandomYear(){
        return faker.random().nextInt(1930,2023).toString();
    }

    public String getRandomDay(){
        int day = getRandomInt(1, 28);

        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public String getRandomSubject(){
        String [] subjects = {"Maths","Physics","English","Chemistry"};
        return faker.options().option(subjects);
    }

    public String getRandomHobbie(){
        String [] hobbies = {"Sports","Reading","Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomPicture(){
        String [] pictures = {"photo.jpg","homework1.png"};
        return faker.options().option(pictures);
    }

    public String getRandomAddress(){
        return faker.address().streetAddress();
    }

    public String getRandomState(){
        String [] states = {"NCR","Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public String getRandomCity(String randomState) {
        String[] cityNCR = {"Delhi", "Gurgaon", "Noida"};
        String[] cityUttar = {"Agra", "Lucknow", "Merrut"};
        String[] cityHaryana = {"Karnal", "Panipat"};
        String[] cityRajasthan = {"Jaipur", "Jaiselmer"};
        switch (randomState) {
            case "NCR": {
                return faker.options().option(cityNCR);
            }
            case "Uttar Pradesh": {
                return faker.options().option(cityUttar);
            }
            case "Haryana": {
                return faker.options().option(cityHaryana);
            }
            case "Rajasthan": {
                return faker.options().option(cityRajasthan);
            }
        }
        return null;
    }
}
