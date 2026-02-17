package andrey.lesson3;

public class PersonalCard {

    private String name;
    private int age;
    private String sex;
    private String hobby;

    public PersonalCard(String name, int age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public PersonalCard() {

    }

    public void printInfo() {
        String template = "My name: %s, my age: %d, my sex: %s, my hobby: %s";
        System.out.println(template.formatted(this.name, this.age, this.sex, this.hobby));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return this.hobby;
    }
}
