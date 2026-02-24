package julia.lesson3;

public class PersonalCardJR {   // Класс — это как чертеж или шаблон.
  // Здесь описание того, из чего состоит "персональная карточка"

  //Поля класса (характеристики)
  private String name; //
  private int age;
  private String sex;
  private String hobby;
  //private-к полю или методу можно обращаться только внутри того же класса, где они объявлены.
  // Из других классов доступа нет.

  // Конструктор с параметрами. Это специальный метод, который создает новый объект.
  public PersonalCardJR(String name, int age, String sex, String hobby) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.hobby = hobby;
  }

  // Пустой конструктор
  public PersonalCardJR() {
  }

  // Геттеры — это методы, которые возвращают значения полей.
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public String getHobby() {
    return hobby;
  }

  // Сеттеры — это методы, которые изменяют значения полей.
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  // Метод для вывода информации
  public void printInfo() {
    String template = "My name: %s, my age: %d, my sex: %s, my hobby: %s";

    // Если sex не установлен, выводим "не указан"
    String sexValue = (sex != null) ? sex : "не указан";
    System.out.println(template.formatted(name, age, sexValue, hobby));
  }
}