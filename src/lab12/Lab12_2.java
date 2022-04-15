package lab12;

import java.util.Scanner;

public class Lab12_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 1;
        int sum=0, k = 0;
        while (a != 999) {
            System.out.println("Введите число: ");
            int x = scanner.nextInt();
            k++;
            a = x;
            sum = sum+x;
        }
        System.out.println("КОличество введённных чисел: " + (k-1) + " Сумма этих чисел: " + (sum-999));
    }
}







