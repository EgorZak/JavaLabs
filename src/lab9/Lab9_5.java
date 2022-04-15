package lab9;

import java.util.Scanner;

public class Lab9_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.print("Начало цикла");
        for (int i = 0; i <= Math.abs(x); i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println("Конец цикла");
    }

}






