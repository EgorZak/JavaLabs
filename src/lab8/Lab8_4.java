package lab8;

import java.util.Scanner;

public class Lab8_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        int x, y, k;
        x = (int) (Math.random() * b);
        y = (int) (Math.random() * b);
        k = (int) (Math.random() * b);
        System.out.println(x + " " + y + " " + k);
    }
}


