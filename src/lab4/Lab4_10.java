package lab4;

import java.util.Scanner;

public class Lab4_10 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int c,d;
        System.out.println("Введите 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        d = a % 10;
        c = b % 10;


        System.out.println("Первое число: "+(a-d+c));
        System.out.println("Второе число: "+(b-c+d));

    }
}


