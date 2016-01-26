package helloworld;
public class Main {
    public static void main(String[] args) {
        boolean bull=true;
        int a=7;
        int b=100;
        double c=0.99;
        String homeWork="\"Hello, U-Rise!\"\n" +
"\"There is "+bull+" , that there are "+b+" percent sucess with "+c+" happiness.\"\n";
        String buff = "мир";
        String buff1 = "world";
        System.out.println("Привет " + buff);
        System.out.println("Hello " + buff1);
        System.out.println("Переменная a = " + a);
        System.out.println("bool = " + bull);
        System.out.print(homeWork);
       int x=1,y=1;
       int sum=0;
        System.out.print(x+" ");
        System.out.print(y+" ");
       for(int i = 0; i < 15; i++){
         sum = x + y;
         x = y;
         y = sum;
         System.out.print(sum + " ");
        }
       System.out.println();
       buff();
    }
    public static void buff(){
    //Стринг="Жопа";
        System.out.println("Hello motherfucker");
    
    }
}
