package lab4;

import java.util.Scanner;

public class Lab4_9 {
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

        System.out.println("Число 'с сдвигом вправо по кругу': "+d+e+b+c);
    }
}


