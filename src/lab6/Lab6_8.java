package lab6;

import java.util.Scanner;

public class Lab6_8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b, c, e;
        System.out.println("Введите сдачу: ");
        int a = scanner.nextInt();


        b = a / 100;
        c = (a - b * 100) / 50;
        e = (a - c * 50 - b * 100) / 10;
        System.out.println(b + "Сотен " + c + " Пятьдесяток " + e + " Десяток");
        if (a % 10 != 0) System.out.println("Cдачи не дам :),остальное мне ");
    }
}


