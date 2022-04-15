package lab10;

import java.util.Scanner;

public class Lab10_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, n = 0, k = 0;
        System.out.println("Введите 15 чисел: ");
        for (int i = 1; i <= 15; i++) {
            x = -25 + (int) (Math.random() * 50 + 1);
            System.out.println(x);
            if (x % 2 == 0) k++;
            else n++;
        }
        System.out.println("Кол-во чётных чисел: " + k + " Кол-во нечётных чисел: " + n);


    }

}




