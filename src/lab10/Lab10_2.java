package lab10;

import java.util.Scanner;

public class Lab10_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 0, n = 0;
        System.out.println("Введите 15 чисел: ");
        for (int i = 1; i <= 15; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) k++;
            else n++;
        }
        System.out.println("Кол-во чётных чисел: " + k + " Кол-во нечётных чисел: " + n);


    }

}




