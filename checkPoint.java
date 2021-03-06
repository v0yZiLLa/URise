package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) throws Exception {
        int number1 = 1334;
        int number2;
        do{
            number2 = getNumber2();
            System.out.println(doSmthwithNumbers(number1, number2) + " ");
        
        }
        while(doNumbers(number1, number2));
    }

    public static int getNumber2() {
        int number2;
        do {
            System.out.println("Введите второе число ");
            Scanner scn = new Scanner(System.in);
            number2 = scn.nextInt();
        } while (number2 < 1 || number2 > 3);
        return number2;
    }

    public static int doSmthwithNumbers(int number1, int number2) {
        switch (number2) {
            case 1:
                return number1;
            case 2:
                return summ(number1);
            case 3:
                return isTriangeEquiteral(number1);
        }
        return 0;
    }

    public static int summ(int number1) {
        int k;
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            k = number1 % 10;
            summa += k;
            number1 /= 10;
        }
        return summa;
    }

    public static int isTriangeEquiteral(int number1) {
        int[] mass = new int[3];
        for (int i = 0; i < 3; i++) {
            mass[i] = number1 % 10;
            number1 /= 10;
        }

        if (mass[0] != 0 && mass[1] != 0 && mass[2] != 0 && mass[0] == mass[1] && mass[1] == mass[2]) {
            return 1;
        }
        return 0;
    }

    public static int doNumbers(int number1, int number2) {
        while (number1 > 1000)
        {
            number1 -= number2;
            System.out.println(number1);
            return true;
        }
        return false;
    }
}
