package lab6;

import java.util.Scanner;

public class Lab6_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c, e;
        System.out.println("Введите трёхзначное число: ");
        int a = scanner.nextInt();
        b = a / 100;
        e = (a / 10) % 10;
        c = a % 10;
        if (a > 500)
            System.out.println("Число >500 " + c + e + b);
        else
            System.out.println("Число <500 " + b + c + e);
    }
}


