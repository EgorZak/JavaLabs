package lab6;

import java.util.Scanner;

public class Lab6_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c;
        System.out.println("Введите трёхзначное число: ");
        int a = scanner.nextInt();
        b = a / 100;
        c = a % 10;
        if (b == c)
            System.out.println("Число " + a + " 'Симметричное'");
        else
            System.out.println("Число " + a + " 'НЕсимметричное'");
    }
}


