package lab5;

import java.util.Scanner;

public class Lab5_6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int c;
        System.out.println("Введите двухзначное число: ");
        int a = scanner.nextInt();

        c=(a%10)*(a/10);

        if (a>c) System.out.println("Число больше произведения цифр числа");
        if (a<c) System.out.println("Произведение цифр числа больше самого числа");

    }
    }


