package lab10;

import java.util.Scanner;

public class Lab10_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 0, n = 0, c;
        System.out.println("Введите 12 чисел: ");
        c = scanner.nextInt();
        for (int i = 1; i <= 11; i++) {
            int x = scanner.nextInt();
            if (x > c) k++;
        }

        System.out.println("Кол-во чисел больше первого: " + k);


    }

}




