package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int rr = 5;
        System.out.println(rr);
        String tt = "hello world";
        System.out.println(tt);



        byte bt = 123;
        short sht = 12321;
        int boxOfIntegers = 2; // int - тип, boxOfIntegers - имя, 2 - то что лежит внутри коробки
        long lng = 1232132142;
        float fl = 7.25f;
        double db = 7.25;
        boolean bl = true; // false
        char ch = 'a';

        String str = "Hello World!";

        // int, double, String, char (возможно)

        System.out.println(str);
        System.out.println(boxOfIntegers);
        System.out.println(boxOfIntegers + 5);

        int i = 1;
        int a = i++; // i + 1
        int b = i--; // i - 1

        System.out.println(5 / 2);

        System.out.println(i);

        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(10 % 3);

        System.out.println(str.concat(" Have a nice day!"));

        boolean bl1 = true;


        // условные операторы
        if (1 > 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int i1 = 5; // оператор присваивания

        if (i1 == 3) {
            System.out.println("i = 3");
            int frerfe = 0;
            bt = 1;

        } else if (i1 == 5) {
            System.out.println("i = 5");
        } else {
            System.out.println("i != 3 and i != 5");
        }
        boolean bool = true;
        System.out.println(!bool);

        // тернарный оператор (тоже самое что и if, else, else if, но короче и только для двух исходов
        String str1 = (1 > 2) ? "1 < 2" : "1 > 2";

        System.out.println(str1);

        // switch case
        String day = "thuesday";

        switch (day) {
            case "thuesday":
                System.out.println("thuesday");
                break;
            case "monday":
                System.out.println("monday");
                break;
            default:
                System.out.println("nothing match");
                break;
        }
    }
}