package lab3;

import java.util.Scanner;

public class Laba3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();
        System.out.println("Сумма: "+(number1+number2));
        System.out.println("Произведение: "+(number1*number2));
        System.out.println("Разница между первым и вторым: "+(number1-number2));
        System.out.println("Разница между вторым и первым: "+(number2-number1));
    }

}
