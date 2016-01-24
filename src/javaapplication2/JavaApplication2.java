package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class JavaApplication2 {

   public static void main(String[] args) throws Exception {
//        int number1 = 1333;
//        int buff; 
//        buff=number1%10;
//        if(buff%2==0)
//            System.out.println(summa(number1));
//        else 
//            System.out.println(summa2(number1));
    //reversedFact(72);
    binary(10);
    System.out.print(" ");
    binar(10);
       
    }
        public static void binar(int a){    
                int b;     
            String temp = "";    
                while(a !=0){  
                b = a%2;  
                temp = b + temp;  
                a = a/2;  
           } System.out.print(temp);  
        }  
   public static void binary(int number){
       String buff="";
       
       int a;
       while(number!=0){
       //int i=0;
           a=number%2;
           buff=a+buff;
       //array.add(buff);
       
       number/=2;
       //i++;
       
       }System.out.print(buff);
       //System.out.println(array);
  
   
   }
public static int reversedFact(int number){
double buff=number;
int count=0;
int i=1;
    do{
        buff/=i;
            i++;
            count++;
            }
    while(buff>1);
    int buffMax=(Fact(count));
    int buffMin=(Fact(count-1));
    int result=buffMax-number;
    int result1=number-buffMin;
if(result>result1)
        System.out.println(count-1);
else System.out.println(count);
return 0;
}
public static int Fact(int number){
int buff=1;
for(int i=1;i<=number;i++)
    buff*=i;
return buff;
}


   public static int closerFact(int number){
        for(int i;;)
   return 0;
   }
    public static int summa(int number1){
        int buff; 
        int summ=0;
        number1/=10;
           for (int i=0;i<3;i++){
                buff=number1%10;
                summ+=buff;
                number1/=10;
        }
           return summ;
    }
    public static int summa2(int number1){
    int buff; 
        int summ=0;
           for (int i=0;i<2;i++){
                buff=number1%10;
                summ+=buff;
                number1/=10;
        }
           return summ;
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
        System.out.println(Arrays.toString(mass));
        
        for (int i = 0; i < 3; i++) {
            mass[i] = number1 % 10;
            number1 /= 10;
        }

        if (mass[0] != 0 && mass[1] != 0 && mass[2] != 0 && mass[0] == mass[1] && mass[1] == mass[2]) {
            return 1;
        }
        return 0;
    }

    public static boolean doNumbers(int number1, int number2) {
        while (number1 > 1000) {
            number1 -= number2;
            System.out.println(number1);
            return true;
        }
        return false;
    }
}
