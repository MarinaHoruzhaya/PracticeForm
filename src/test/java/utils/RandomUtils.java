package utils;

import com.github.javafaker.Faker;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    static Faker faker = new Faker();

    public static int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomItemFromArray(String [] array){
        int index = getRandomInt(0,array.length - 1);
        return array[index];
    }

    public static String getRandomFirstName(){
        return faker.name().firstName();
    }

    public static String getRandomLastName(){
        return faker.name().lastName();
    }

    public static String getRandomEmail(){
        return faker.internet().emailAddress();
    }

    public static String getRandomGender(){
        String [] gender = {"Male","Female","Other"};
        return faker.options().option(gender);
    }

    public static String getRandomMobileNumber(){
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String getRandomMonth(){
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return faker.options().option(months);
    }

    public static String getRandomYear(){
        return faker.random().nextInt(1930,2023).toString();
    }

    public static String getRandomDay(){
        int day = getRandomInt(1, 31);

        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public static String getRandomSubject(){
        String [] subjects = {"Maths","Physics","English","Chemistry"};
        return faker.options().option(subjects);
    }

    public static String getRandomHobbie(){
        String [] hobbies = {"Sports","Reading","Music"};
        return faker.options().option(hobbies);
    }

    public static String getRandomPicture(){
        String [] pictures = {"photo.jpg","homework1.png"};
        return faker.options().option(pictures);
    }

    public static String getRandomAddress(){
        return faker.address().streetAddress();
    }

    public static String getRandomState(){
        String [] states = {"NCR","Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public static String getRandomCity(String randomState) {
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
