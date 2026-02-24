package julia.lesson3;

public class Main {

  public static void main(String[] args) { // объявление метода - точка входа в программу
    // Первый объект - пустая анкета для человека по имени Юля
    PersonalCardJR julia = new PersonalCardJR(); // имя переменной
    // Заполнение данных через сеттеры.
    // set - это метод, который позволяет установить значение приватного поля.
    julia.setName("Julia");
    julia.setAge(29);
    julia.setHobby("art");
    // Вывод данных через геттеры.
    // get — это метод, который просто возвращает значение поля.
    System.out.println(julia.getName());
    System.out.println(julia.getAge());
    System.out.println(julia.getHobby());
    julia.printInfo(); //Вывод всей информации сразу

    // Второй объект - пустая анкета для человека по имени Анна
    PersonalCardJR anna = new PersonalCardJR();  // имя переменной
    anna.setName("Anna");
    anna.setAge(25);
    anna.setHobby("music");

    anna.printInfo();
  }
}