package andrey.lesson3;

public class Main {

    public static void main(String[] args) {
        PersonalCard andrey = new PersonalCard();
        andrey.setName("Andrey");
        andrey.setAge(26);
        andrey.setSex("Male");
        andrey.setHobby("Photography");

        System.out.println(andrey.getName());
        System.out.println(andrey.getAge());
        System.out.println(andrey.getSex());
        System.out.println(andrey.getHobby());

        andrey.printInfo();

        PersonalCard alexa = new PersonalCard("Alexa", 27, "Female", "Dancing");
        alexa.printInfo();
    }
}
