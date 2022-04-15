package lab6;

import java.util.Scanner;

public class Lab6_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c, e;
        System.out.println("Введите четырёхзначное число: ");
        int a = scanner.nextInt();
        b = a / 100;
        c = a % 100;
        if (b == c) System.out.println("Число " + a + " 'Парно-симметричное'");
        else
            System.out.println("Число " + a + " 'Непарно-симметричное'");
    }
}


