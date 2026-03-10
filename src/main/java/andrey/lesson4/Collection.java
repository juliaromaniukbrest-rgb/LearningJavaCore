package andrey.lesson4;

import andrey.lesson3.PersonalCard;

import java.util.ArrayList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        PersonalCard alexa = new PersonalCard("Alexa", 27, "Female", "Dancing");
        PersonalCard andrey = new PersonalCard("Andrey", 26, "Male", "Photo");
        PersonalCard ivan = new PersonalCard("Ivan", 19, "Male", "Svarka");

        List<PersonalCard> users = new ArrayList<>();
        users.add(alexa);
        users.add(andrey);
        users.add(ivan);

        users.forEach(PersonalCard::printInfo);

        for(var user : users) {
            user.printInfo();
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(12);
        numbers.add(5);
        numbers.add(9);

        for(var number : numbers) {
            int tempNumber = number;
            System.out.println(tempNumber);
        }
    }
}
