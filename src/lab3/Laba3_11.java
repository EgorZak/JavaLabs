package lab3;

import java.util.Scanner;

public class Laba3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите часы: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите минуты: ");
        int number2 = scanner.nextInt();
        System.out.println("Время с полуночи: "+(3600*(number1)+60*(number2))+" секунд");
        System.out.println("Время до полуночи: "+(1440-(60*(number1)+number2))+" минут");
    }

}
