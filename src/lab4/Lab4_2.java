package lab4;

import java.util.Scanner;

public class Lab4_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int b, c, d;
        int a = scanner.nextInt();
        b = a / 100;
        c = a % 10;
        d = (a / 10) % 10;
        System.out.println((c + " " + d + " " + b));
    }
    }


