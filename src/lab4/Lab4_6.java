package lab4;

import java.util.Scanner;

public class Lab4_6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int b,c,d,k,e;
        k = 0;
        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        e = a/1000;
        b = (a/100)%10;
        c = (a / 10)%10;
        d = a % 10;

        if (e%2==0) k++;
        if (b%2==0) k++;
        if (c%2==0) k++;
        if (d%2==0) k++;

        System.out.println("Кол-во чётных: "+k);
    }
}


