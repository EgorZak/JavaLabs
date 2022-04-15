package lab4;

import java.util.Scanner;

public class Laba4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number3;
        System.out.println("Введите кол-во мальчиков: ");
        float number1 = scanner.nextInt();
        System.out.println("Введите кол-во девочек: ");
        float number2 = scanner.nextInt();
        number3=number1+number2;
        int a =5;
        int d = 3;
        float c;
        c = ( a/d);
        System.out.println("Кол-во человек в группе: "+(number3));
        System.out.println("Процент мальчиков: "+(number1/number3)*100+"%");
        System.out.println("Процент девочек : "+(number2/number3)*100+"%");
    }

}
