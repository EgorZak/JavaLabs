package lab14;

import java.util.Scanner;

public class lab14_8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите цифру : ");
        int c = scanner.nextInt();
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.println(proverka(a, c));
    }

    static int proverka(int a, int c) {
        int k = 0;

        while (a != 0) {
            if (a % 10 == c) k++;
            a = a / 10;
        }

        return k;
    }

}



