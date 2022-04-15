package lab12;

import java.util.Scanner;

public class Lab12_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите числа: ");
        int sum = 0;

        int i = 999;
        while (i != 0) {
            int a = scanner.nextInt();
            int b = 0;

            if (a == b) {
                break;
            } else
                sum += a;
            System.out.println("Сумма чисел" + sum);
        }

    }
}








