package lab12;

import java.util.Scanner;

public class Lab12_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 1;

        while (a != 0) {
            System.out.println("Введите число: ");
            int x = scanner.nextInt();
            a = x;
            if (x > 0) System.out.println("Плюс ");

            if (x < 0) System.out.println(" Минус");

        }
    }
}







