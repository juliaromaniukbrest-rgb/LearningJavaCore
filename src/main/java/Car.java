public class Car {

  String color;
  String name;
  String model;

  public static void main(String[] args) {
    Car nissan = new Car();
    nissan.color = "blue";
    nissan.name = "nissan 1";
    nissan.model = "sedan";

    Car bmw = new Car();
    bmw.color = "black";
    bmw.name = "bmw 5";
    bmw.model = "crossover";

    System.out.println(nissan.color);
    System.out.println(bmw.color); // Исправлено: было "collor"

    System.out.println(nissan. name);
    System.out.println(bmw.name);

    System.out.println(nissan.model);
    System.out.println(bmw.model);
  }
}