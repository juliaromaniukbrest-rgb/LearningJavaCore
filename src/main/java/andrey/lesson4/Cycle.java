package andrey.lesson4;

public class Cycle {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        // while (do while)
        // for
        // foreach

        int a = 1;
        int b = 1;


        System.out.println("-----WHILE-----");
        while (a <= 5) {
            System.out.println(a);
            a++;
        }

        System.out.println("-----DO-WHILE-----");
        do {
            System.out.println(b);
            b++;
        } while(b <= 5);

        System.out.println("-----FOR-----");
        for (int i = 1 /*Счетчик для цикла начинающийся с 1*/; i <= 5 /*Условие для цикла*/; i++ /*Итератор увеличивающий счетчик*/) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);
        }
        // эти циклы выведут одно и то же
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 100; i++) {
            boolean result = i % 2 != 0;
            if (result) {
                continue; // пропускает итерацию и переходит к следующей
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 200; i++) {
            if (i > 100) {
                break; // Выходим из цикла
            }
            boolean result = i % 2 != 0;
            if (result) {
                continue; // пропускает итерацию и переходит к следующей
            }
            System.out.println(i);
        }

        oddFromOneToHundred();
    }

    static void oddFromOneToHundred() {
        for (int i = 0; i <= 200; i++) {
            if (i > 100) {
                return; // Выходим из цикла
            }
            boolean result = i % 2 != 0;
            if (result) {
                continue; // пропускает итерацию и переходит к следующей
            }
            System.out.println(i);
        }
    }
}
