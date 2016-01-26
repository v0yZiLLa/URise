/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alex
 */
public class Домашка5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3, b = 15;
        System.out.println("Стрелки встретились " + isArrowsMet(a, b));
        /*17*/
        System.out.print("/*17*/ ");
        a = 5;
        System.out.println(a + "! = " + fuck(5));
        System.out.println(isStringNumber("9"));
        String str = "5f6g6g";
        System.out.println("Из строки " + str + " число " + extractNumber(str));
        str = "5f6gfdf545fgdg6g";
        System.out.println("В строке " + str + " числа " + isStringNumber(str));
        /*24*/
        System.out.print("/*24*/ ");
        System.out.println("Если ноль то парное = " + maxPlusMin(numberToArray(3457)));
        /*25*/
        System.out.print("/*25*/ ");
        System.out.println(isPalindrom(numberToArray(296969399)));
        /*26*/
        System.out.print("/*26*/ ");
        System.out.println(numToBinary(10));
        int[] mass = new int[8];

        /*28*/
        System.out.print("/*28*/ ");
        System.out.println("Создаем массив...");
        mass = createArray(8);
        /*29*/
        System.out.print("/*29*/ ");
        System.out.print("Выводим его...");
        printArray(mass);
        /*30*/
        System.out.print("/*30*/ ");
        System.out.println("Ищем 5 " + searchNumInArray(mass, 5));
        int num = searchRanNumInArray(mass);
        /*31*/
        System.out.print("/*31*/ ");
        System.out.println("Число " + num + " ищем в массиве " + searchNumInArray(mass, num));
        int[][] mass2 = new int[8][8];
        mass2 = create2DimArray(8, 8);
        /*32*/
        System.out.print("/*32*/ ");
        System.out.println("Создаем 2-ух мерный массив...");
        mass2 = create2DimArray(8, 8);
        /*32*/
        System.out.print("/*33*/ ");
        System.out.println("Выводим его...");
        print2DimArray(mass2, 8, 8);

    }

    public static boolean isArrowsMet(int a, int b) {
        if (b / a == 5) {
            return true;
        }
        return false;
    }

    /*17*/
    public static int fuck(int num) {
        int fuck = 1;
        for (int i = 1; i <= num; i++) {
            fuck *= i;
        }

        return fuck;
    }

    //19
    public static boolean isCharNumber(char cha) {
        return Character.isDigit(cha);
    }

    public static ArrayList isStringNumber(String str) {
        char[] charArray = str.toCharArray();
        ArrayList array = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            if (isCharNumber(charArray[i])) {
                array.add(charArray[i]);
            }
        }
        return array;
    }

    public static String extractNumber(String str) {
        String buff = "";
        Pattern ptr = Pattern.compile("\\d+?");
        Matcher mt = ptr.matcher(str);
        while (mt.find()) {
            buff += mt.group();
        }
        return buff;
    }

    public static int[] numberToArray(int num) {
        int length = ("" + num).length();
        int mass[] = new int[length];
        for (int i = 0; i < length; i++) {
            mass[length - i - 1] = num % 10;
            num /= 10;
        }
        return mass;
        // 
    }

    /*24*/
    public static int maxPlusMin(int[] mass) {
        int max = mass[0], min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return (max + min) % 2;
    }

    /*25*/
    public static int isPalindrom(int[] mass) {
        int max = 0;

        ArrayList array = new ArrayList();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            array.add(mass[i]);
        }
        System.out.println(array.size() + "max" + array);
        for (int i = 0; i < array.size(); i++) {
            if ((int) array.get(i) == max) {
                array.remove(i);
            }
        }
        System.out.println(array.size() + "-max" + array);
        return max;
    }

    /*26*/
    public static String numToBinary(int num) {

        return Integer.toBinaryString(num);
    }

    public static void binary(int number) {
        String buff = "";
        int a;
        while (number != 0) {
            a = number % 2;
            buff = a + buff;
            number /= 2;
        }
        System.out.print(buff);
    }

    /*28 создать и заполнить массив рандомными значениями*/
    public static int[] createArray(int size) {
        int i = 0;
        Random rnd = new Random();
        int[] array = new int[size];
        while (i < size) {
            array[i] = rnd.nextInt(10);
            i++;
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }

    /*29 вывести массив в консоль*/
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /*30 поиск элемента*/
    public static boolean searchNumInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /*31 рандомим число*/
    public static int searchRanNumInArray(int[] array) {
        int ranNum = new Random().nextInt(array.length);
        return ranNum;
    }

    /*32 создаем 2-ух мерный массив*/
    public static int[][] create2DimArray(int x, int y) {

        Random rnd = new Random();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }

        return array;
    }

    /*33 выводим 2-ух мерный массив*/
    public static void print2DimArray(int[][] array, int x, int y) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }

    }
}
