package lab12;

import java.util.Scanner;

public class Lab12_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 2 числа: ");
        int sum1 = 0;
        int sum2 = 0;
        while (true) {
          int x = scanner.nextInt();
          int y = scanner.nextInt();

            if (x==y){
                break;
            }
            sum1 += x;
            sum2 += y;
            System.out.println("Сумма первых чисел в паре: " + sum1 + " Сумма вторых чисел в паре: " + sum2);
        }

    }
}








