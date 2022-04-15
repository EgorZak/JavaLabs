package lab6;

import java.util.Scanner;

public class Lab6_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c;
        System.out.println("Введите двухзначное число: ");
        int a = scanner.nextInt();
        b = a / 10;
        c = a % 10;
        if (b > c)
            System.out.println("Десятки больше единиц");
        else if (b == c) System.out.println("Единицы равны с десятками");
        else
            System.out.println("Единицы больше десяток");
    }
}


