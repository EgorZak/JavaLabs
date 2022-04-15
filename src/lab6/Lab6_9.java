package lab6;

import java.util.Scanner;

public class Lab6_9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c, e;
        System.out.println("Введите трёхзначное число: ");
        int a = scanner.nextInt();
        b = a / 100;
        e = (a / 10) % 10;
        c = a % 10;
        if (e>b && e>c )
            System.out.println("Число 'Гора' " + a);
        else
            System.out.println("Число не является 'Горой' " + a);
    }
}


