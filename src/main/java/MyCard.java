public class MyCard { // Начало класса 🔵

  // свойства класса, переменные
  String name;
  String surname;
  String city;
  String hobby0;
  String hobby1;

  // Заголовок метода⤵︎ (главный метод)
  public static void main(String[] args) { // тело метода - начало 🔵
    MyCard one = new MyCard(); // new- создает новый объект/ Инициализация
    one.name = "Julia";
    one.surname = "Romaniuk";
    one.city = "Brest";
    one.hobby0 = "Art";
    one.hobby1 = "Sport";

    MyCard two = new MyCard();
    two.name = "Kate";
    two.surname = "Romaniuk";
    two.city = "Brest";
    two.hobby0 = "Photo";
    one.hobby1 = "Reed book";

    // Вывод данных
    System.out.println(one.name);
    System.out.println(one.name + one.surname);
    System.out.println("Хобби:" + one.city);
    System.out.println("Город:" + one.city);
    System.out.println(
        one.name + " " + one.surname + " - " + "Хобби:" + two.hobby0 + " " + "Хобби:" + one.city);

    System.out.println(two.name);
    System.out.println(two.name + two.surname);

    // СРАВНЕНИЕ
    // if - Если else - иначе
    // equals() — сравнивает, одинаковое ли содержание у объектов

    if (one.city.equals(two.city)) { // начало блока условия 🟡
      System.out.println(one.name + " и " + two.name + " из одного города!");
    } // конец блока условия 🟡

    if (one.surname.equals(two.surname)) {
      System.out.println("У них одинаковая фамилия!");
    }

    if (one.hobby0.equals(two.hobby0)) {
      System.out.println("У них одинаковое хобби: " + one.hobby0);
    } else {
      System.out.println("У них разные хобби:");
    }
    System.out.println("Рекомендации для совместного досуга:");

    // 🆕 && — это логический оператор "И" (AND). Оба условия должны быть true
    if (one.hobby0.equals("Art") && two.hobby0.equals("Photo")) {
      System.out.println("- Устроить фотосессию рисунков " + one.name);
    }
    // 🆕 || - или (OR) - Хотя бы одно условие true
    System.out.println("Поиск общих интересов:");

    if (one.hobby0.equals(two.hobby0) || one.hobby1.equals(two.hobby1)) {
      System.out.println("У " + one.name + " и " + two.name + " есть общее хобби!");
    } else {
      System.out.println("У них нет общих хобби");
    }
    System.out.println("Совпадения:");
    if (one.surname.equals(two.surname) || one.name.equals(two.name)) { // начало блока условия 🟠
      System.out.println("У " + one.name + " и " + two.name + " +");

      // 🆕 Начало уточнения - добовляется внутрь if 🟡
      if (one.surname.equals(two.surname)) {
        System.out.println("  • Одинаковая фамилия: " + one.surname);
      }
      if (one.name.equals(two.name)) {
        System.out.println("  • Одинаковое имя: " + one.name);
      }
      // 🆕 Конец уточнения🟡

    } else {
      System.out.println("-");
    } // Конец блока условия 🟠
  } // Конец тело метода main 🔵
} // Конец класса 🔵
