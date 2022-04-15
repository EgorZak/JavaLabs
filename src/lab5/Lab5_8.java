package lab5;

import java.util.Scanner;

public class Lab5_8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите числитель: ");
        int a = scanner.nextInt();
        System.out.println("Введите знаменатель: ");
        int b = scanner.nextInt();

        if (b==0) System.out.println("Некорректно");
        if (a==0) System.out.println("Дробь равна 0");
        if (a>0 && b>0) System.out.println("Положительная дробь");
        if (a<0 && b<0) System.out.println("Положительная дробь");
        if (a>0 && b<0) System.out.println("Отрицательная дробь");
        if (a<0 && b>0) System.out.println("Отрицательная дробь");
    }
    }


