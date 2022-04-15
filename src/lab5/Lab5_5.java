package lab5;

import java.util.Scanner;

public class Lab5_5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 1 число: ");
        int a = scanner.nextInt();
        System.out.println("Введите 2 число: ");
        int b = scanner.nextInt();



        if (a>b) System.out.println((a+b));
        if (a<b) System.out.println(a*b);
        if (a==b) System.out.println("Числа равны");

    }
    }


