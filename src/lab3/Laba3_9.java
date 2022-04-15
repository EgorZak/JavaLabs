package lab3;

import java.util.Scanner;

public class Laba3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой год рождения"); Integer number1 = scanner.nextInt();
        System.out.println("Введите нынешний год");  Integer number2 = scanner.nextInt();
        System.out.println("Ваш возраст: "+(number2-number1));
    }


}
