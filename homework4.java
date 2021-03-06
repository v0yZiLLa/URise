
package testjavaapp;

//import java.util.Scanner;
//import javax.swing.JOptionPane;


public class TestJavaApp {

    public static void main(String[] args) {
        // Задание №1
        System.out.print("№1 ");
        String str = "world";
        printString(str);
        // Задание №2
        System.out.print("№2 ");
        char x = '4';
        if (isDigit(x)) {
            System.out.println("Символ " + x + " является числом");
        } else {
            System.out.println("Символ " + x + " НЕ является числом");
        }
        // Задание №3 (Теорема Пифагора) c^2=a^2+b^2
        System.out.print("№3 ");
        int a = 84, b = 187, c = 205;//(3, 4, 5)(5, 12, 13)(8, 15, 17)(7, 24, 25)
        System.out.println(rectangular(a, b, c));
        // Задание №4
        System.out.print("№4 ");
        a = 5;
        b = 8;
        c = 5;
        System.out.println(equilateral(a, b, c));
        // Задание №5
        System.out.print("№5 ");
        System.out.println(twoTriangles(6, 2, 6, 6, 2, 6));
        // Задание №6
        System.out.print("№6 ");
        a = 20;
        b = 5;
        if (divideEvenly(a, b)) {
            System.out.println(a + " делится на " + b + " без остатка");
        } else {
            System.out.println(a + " делится на " + b + " c остатком");
        }
        // Задание №7
        System.out.print("№7 ");
        if (checkPare(16, 2)) {
            System.out.println("Числа парные");
        } else {
            System.out.println("Числа НЕ парные");
        }
        // Задание №8
        System.out.print("№8 ");
        int k = 125;
        System.out.println(checkNumber(k));
        // Задание №9
        System.out.print("№9 ");
        int pal = 2662;
        if (checkPalindrom(pal)) {
            System.out.println("Число " + pal + " является палиндромом");
        } else {
            System.out.println("Число " + pal + " не является палиндромом");
        }
        // Задание №10
        System.out.print("№10 ");
        int number = 3471;
        if (checkSumms(number)) {
            System.out.println("Сумма одной половины числа "
                    + number + " равна сумме другой половины");
        } else {
            System.out.println("Сумма одной половины числа "
                    + number + " НЕ равна сумме другой половины");
        }
        // Задание №11
        System.out.print("№11 ");
        int numberForTest11 = 5689;
        System.out.println("Каждая следующая цифра числа " + numberForTest11 + " больше предыдущей - "
                + numbBigger(numberForTest11));
        //Задание №12
        System.out.print("№12 ");
        double[] Array = new double[2];
        roots(Array);
        //Задание №13
        System.out.print("№13 ");
        System.out.println("Корни " + Array[0] + " " + Array[1]);
        if (checkRoots(Array)) {
            System.out.println("Хотя бы один из корней является парным");
        } else {
            System.out.println("Корни НЕ парные");
        }

        //Задание №14
        System.out.print("№14 ");
        String str2 = "12";
        System.out.print("Строка " + str2 + " " + checkString(str2) + " числом\n");
    }
//Дальше реализации

    /*1*/ public static void printString(String str) {
        System.out.println("Hello " + str);
    }

    /*2*/ public static boolean isDigit(char x) {
        return Character.isDigit(x);
    }

    /*проверка треугольника*/
    public static boolean checkTriangle(int a, int b, int c) {
        if (a + b > c || a + c > b || c + b > a) {
            return true;
        }
        return false;
    }

    /*3*/ public static String rectangular(int a, int b, int c) {
        if (checkTriangle(a, b, c)) {
            if (a != 0 && b != 0 && c != 0) {
                if (c * c == (a * a) + (b * b) || a * a == (b * b) + (c * c) || b * b == (a * a) + (c * c)) {
                    return "Треугольник прямоугольный";
                }
            }
        }
        return "Треугольник НЕ прямоугольный";
    }

    /*4*/ public static String equilateral(int a, int b, int c) {
        if (checkTriangle(a, b, c)) {
            if (a != 0 && b != 0 && c != 0) {
                if (a == b || b == c || a == c) {
                    return "Треугольник равнобедренный";
                }
            }
        }
        return "Треугольник НЕ равнобедренный";
    }

    /*5*/ public static String twoTriangles(int a, int b, int c, int d, int e, int f) {
        if (checkTriangle(a, b, c) && (checkTriangle(d, e, f))) {
            if (a != 0 && b != 0 && c != 0 && d != 0 && e != 0 && f != 0) {
                if ((a == b || b == c || a == c) && (a == d || a == e || a == f) && (b == d || b == e || b == f) && (c == d || c == e || c == f)) {
                    return "Треугольники равносторонние и равны";
                }
            }
        }
        return "Треугольники НЕ равны";
    }

    /*6*/ public static boolean divideEvenly(int a, int b) {
        if (a % b == 0) {
            return true;
        }
        return false;
    }

    /*7*/ public static boolean checkPare(int k, int j) {
        if (divideEvenly(k, j)) {
            return true;
        }
        return false;

    }

    /*8*/ public static String checkNumber(int k) {
        int m = k;
        int s = 0;
        while (m != 0) {
            s += m % 10;
            m /= 10;
        }
        if (s % 2 == 0) {
            return "Сумма цифр числа " + k + " парная";
        }
        return "Сумма цифр числа " + k + " НЕ парная";
    }

    /*9*/ public static boolean checkPalindrom(int x) {
        {
            int next = 0;
            int x2 = x;
            while (x2 != 0) {
                next = (next * 10) + (x2 % 10);
                x2 /= 10;
            }
            if (x == next) {
                return true;
            }
            return false;
        }

    }

    /*10*/ public static boolean checkSumms(int number) {
        int summ = 0;
        int summ2 = 0;
        for (int i = 0; i < 2; i++) {
            summ += number % 10;
            number /= 10;
        }
        for (int i = 0; i < 2; i++) {
            summ2 += number % 10;
            number /= 10;
        }
        if (summ == summ2) {
            return true;
        }
        return false;
    }

    /*11*/ public static boolean numbBigger(int number) {
        int[] mass = new int[4];
        for (int i = 0; i < 4; i++) {
            mass[i] = number % 10;
            number /= 10;
            //System.out.println("mass [" + i + "] = " + mass[i]);
        }
        if (mass[0] > mass[1] && mass[1] > mass[2] && mass[2] > mass[3]) {
            return true;
        }
        return false;
    }

    /*12*/ public static double[] roots(double mass[]) {
        int a = 1, b = 4, c = 1, d;
        double x1, x2;
        d = (b * b) - (4 * a * c);
        System.out.println("Дискриминант = " + d);
        if (d < 0) {
            System.out.print(" Уравнение не имеет решений!!!\n");
        }
        if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("x = " + x1);
            mass[0] = x1;
        }
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Один корень=  " + x1 + "  Второй= " + x2);
            mass[0] = x1;
            mass[1] = x2;
        }
        return mass;
    }

    /*13*/ public static boolean checkRoots(double mass[]) {
        if (mass[0] % 2 == 0 || mass[1] % 2 == 0) {
            return true;
        }
        return false;
    }

    /*14*/ public static String checkString(String str) {
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (!isDigit(c)) //if (!(c >= '0' && c <= '9')) {
            {
                return "не является";
            }
        }

        return "является";
    }

}
