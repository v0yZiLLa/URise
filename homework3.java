package helloworld;

public class Main {

    public static void main(String[] args) {
//Проверить результат формулы из второго теста ВТОРОЙ лекции
        int x = 50;
        if (someFormula(x) < 5) {
            System.out.println("Я условие и я меньше 5!!!");
        }
        if (someFormula(x) > 5) {
            System.out.println("Я условие и я больше 5!!!");
        }
        if (ternar(x) == 1) {
            System.out.println("Я тернарный и я меньше 5!!!");
        } else {
            System.out.println("Я тернарный и я больше 5!!!");
        }
//Показать примеры работы оставшихся операторов.
        operators();
//В зависимости от аргумента, который передается в метод, должен отрабатывать один из тестов.
        int n = 3;
        switchCase(n);
//Вывести пять раз строку из четвертого теста ВТОРОЙ лекции.
        
        printString();
        
//Вывести в консоль числа от 1 до 10 последовательно с новой строки.
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static double someFormula(int x) {
        return (x - 2 * 3.14 * 3 * 3);
    }

    public static int ternar(int x) {
        return ((x - 2 * 3.14 * 3 * 3) < 5) ? 1 : 0;
    }

    public static void operators() {
        int a = 2;
        a++;//increment
        System.out.println("инкремент a = " + a);
        a--;//Decrement
        System.out.println("декремент a = " + a);
        boolean b = true;
        System.out.println("b = " + b + " и !b = " + !b);
        if (b == true) {
            System.out.println("b = " + b);
        }
        if (b != false) {
            System.out.println("b = " + b);
        }
        if (a > 1) {
            System.out.println("переменная а > 1 = " + a);
        }
        if (a < 1) {
            System.out.println("переменная а < 1 = " + a);
        }
        if (a == 2 && b == true) {
            System.out.println("переменная а = " + a + " и b = " + b);
        }
        if (a < 2 || b == true) {
            System.out.println("переменная а < 2 или b = true " + a + " " + b);
        }
    }

    public static void switchCase(int n) {
        switch (n) {
            case 1:
                System.out.println("метод switchCase. case 1");
                break;
            case 2:
                System.out.println("метод switchCase. case 2");
                break;
            default:
                System.out.println("метод switchCase. значение по умолчанию");
        }
    }

    public static void printString() {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello motherfucker!!!");
    }
}
