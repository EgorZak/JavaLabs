package lab5;

import java.util.Scanner;

public class Lab5_4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int i = scanner.nextInt();

        if (i>99) i--;

        System.out.println("Результат: "+i);
    }
    }


