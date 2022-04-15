package lab6;

import java.util.Scanner;

public class Lab6_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c,d,e;
        System.out.println("Введите трёхзначное число: ");
        int a = scanner.nextInt();
        b = a / 100;
        d = (a/10)%10;
        c = a % 10;
        e = (d+b+c);
        if (a%2==0 && e%2==0 )
            System.out.println("Число " + a + " 'Дважды чётное'");
        else
            System.out.println("Число " + a + " 'Не дважды чётное'");
    }
}


