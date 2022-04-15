package lab10;

import java.util.Scanner;

public class Lab10_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 0;
        int prev = 0;

        System.out.println("Введите 17 чисел: ");
        for (int i = 1; i <= 17; i++) {
            int x = scanner.nextInt();
            if (prev < x) k++;
            prev = x;
        }
        System.out.println("Числа больше предыдущего: " + (k - 1));


    }

}




