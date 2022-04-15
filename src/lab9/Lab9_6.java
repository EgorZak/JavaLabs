package lab9;

import java.util.Scanner;

public class Lab9_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.print("Начало цикла");
        for (int i = x+1; i <=x+18 ; i++) {
            System.out.print(" " + i  + " ");
        }
        System.out.println("Конец цикла");
    }

}






