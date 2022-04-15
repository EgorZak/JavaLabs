package lab5;

import java.util.Scanner;

public class Lab5_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();


        if (a<0 && b<0) System.out.println("Один и тот же знак -");
        if (a>0 && b>0) System.out.println("Один и тот же знак +");
        if (a<0 && b>0) System.out.println("Разные знаки 1(-) 2(+) ");
        if (a>0 && b<0) System.out.println("Разные знаки 1(+) 2(-) ");
        if (a==0) System.out.println("Некорректно");
        if (b==0) System.out.println("Некорректно");




    }
    }


