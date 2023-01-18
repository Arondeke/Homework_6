public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        for (int i = 1; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");

        for (int year = 1904; year <= 2096; year = year + 4) {
            if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год является високосным");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int vklad = 29000;
        int total = 0;

        for (int month = 1; month <= 12; month++) {
            total = total + vklad;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }


    public static void task9() {
        System.out.println("Задача 9");
        int vklad = 29000;
        float total = 0;


        for (int month = 1; month <= 12; month++) {
            total = (total + vklad + vklad/100) + total/100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 10");
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = i * 2;
            System.out.println(result);
        }
    }
}