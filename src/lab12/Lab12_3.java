package lab12;

import java.util.Scanner;

public class Lab12_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (sum < x * x) {
            i++;
            int v = x + i;
            sum += v;
            if (sum < x * x) {
                System.out.println(v);
        }
            }
    }
}






