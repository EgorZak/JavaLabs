package lab5;

import java.util.Scanner;

public class Lab5_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        if (a<0)
            System.out.println("Число отрицательное");
        if (a>0)
            System.out.println("Число положительное");
        if (a==0)
            System.out.println("Число равно 0");
    }
    }


