package lab4;

import java.util.Scanner;

public class Lab4_5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int b, c;
        int a = scanner.nextInt();
        b = a / 10;
        c = a % 10;
        System.out.println("Разница между десятками и единицами: "+(b-c));
    }
    }


