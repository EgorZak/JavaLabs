package lab10;

import java.util.Scanner;

public class Lab10_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.println("Введите ещё 29 дополнительных чисел: ");
        for (int i = 1; i <= 29; i++) {
            int n = scanner.nextInt();
            if (x > n) k++;
            else if (x == n) m++;
        }
        System.out.println("Числа меньше первого числа: " + k);
        System.out.println("Числа равные первому числу: " + m);


    }

}




