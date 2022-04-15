package lab9;

import java.util.Scanner;

public class Lab9_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Введите два целых числа: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = 1; i <= 20; i++) {
            x = start + (int) (Math.random() * (end - start + 1));
            System.out.println(x);
        }
    }

}






