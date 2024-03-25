package SELENIUM;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Random;

import static java.lang.Integer.MAX_VALUE;

public class Reausable {

    Random random = new Random();
    public String randomNo = String.format("%10d", random.nextInt(154545));
    Faker faker = new Faker();
    public String cityName = faker.address().city();
    public String Firstname = faker.name().firstName();
    public String Lastname = faker.name().lastName();
    public String zipCode = faker.address().zipCode();
    public String name2 = faker.animal().name();
    public Integer percentage = faker.number().numberBetween(1, 100);
    public Integer Negative_percentage = faker.number().numberBetween(-1, -100);
    public Integer greater_than_100_percentage = faker.number().numberBetween(101, MAX_VALUE);


    //String mysz2 = mysz.replaceAll("\\s","");

    String combine2strings = cityName.substring(0, 2) + "_Test" + randomNo;

    public String externalId = combine2strings.replaceAll("\\s", "");

    @Test
    public void test() {
        System.out.println(percentage);
//        System.out.println(externalId);
    }
}
