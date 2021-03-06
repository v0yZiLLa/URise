package helloworld;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Задание 1 - вернуть сумму всех значений массива
        int n = 10;
        double mass[] = new double[n];
        System.out.println("Массив");
        for (int i = 0; i < n; i++) {
            mass[i] = Math.random() * 100;
            System.out.println("[" + i + "] " + (int) mass[i]);
        }
        System.out.println("Сумма чисел в массиве = " + summMass(mass, n));

        // Задание 2 - число x в степень y
        int x = 2, y = 0;
        System.out.println("Число " + x + " в степени " + y + " = " + pow(x, y));
        // Но легче вот так)))
        System.out.println("Число " + x + " в степени " + y + " = " + Math.pow(x, y));

        // Задание 3 - Фибоначчи рекурсией. без - делал в домашке №1 
        int i = 1;
        if (fibonacci(i) == 0) {
            System.out.println("Некорректное значение переменной");
        }
        while (i < 20) {
            System.out.print(" " + fibonacci(i));
            i++;
        }
        System.out.println(" ");
    }

    // Реализации
    /*1*/
    public static int summMass(double mass[], int n) {

        int summ = 0, i = 0;
        while (i < n) {
            summ += mass[i];
            i++;
        }

        return summ;
    }

    /*2*/
    public static double pow(int x, int y) {

        if (y < 0) {
            return 1 / (x * pow(x, -(y + 1)));
        }

        if (y == 0) {
            return 1;
        }
        if (y == 1) {
            return x;
        }
        if (y > 1) {
            return x * pow(x, y - 1);
        }
        return 0;
    }


    /*3*/ public static int fibonacci(int i) {
        if (i > 0) {
            return (i <= 2) ? 1 : (fibonacci(i - 1) + fibonacci(i - 2));
        }
        return 0;
    }
}
