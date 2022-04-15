package Lectures;

import java.util.Scanner;

public class methods {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число математической функции :" );
        System.out.println("1 - сумма" );
        System.out.println("2 - разность" );
        System.out.println("3 - произведение" );
        System.out.println("4 - деление" );
        int a = scanner.nextInt();
        if (a!=0)
        System.out.println("Введите числа: ");
            int f = scanner.nextInt();
            int g = scanner.nextInt();

        if (a==1) {
        sum(f,g);
        }
        if (a==2) {
            rz(f,g);
        }
        if (a==3) {
            pr(f,g);
        }
        if (a==4) {
            del(f,g);
        }

    }
    static void sum(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    static void rz(int x,int y){
        int z=x-y;
        System.out.println(z);
    }
    static void pr(int x,int y){
        int z=x*y;
        System.out.println(z);
    }
    static void del(float x,float y){
        float  z=x/y;
        System.out.println(z);
    }
}





