package lab4;

import java.util.Scanner;

public class Lab4_8 {
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

        System.out.println("Число 'с сдвигом влево по кругу': "+b+c+d+e);
    }
}


