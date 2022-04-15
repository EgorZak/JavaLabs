package lab6;

import java.util.Scanner;

public class Lab6_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите углы треугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a + b + (180 - (a + b)) != 180 || a <= 0 || b <= 0 || 180 - a - b <= 0) System.out.println("Ошибочные данные");
        if (a == 90 || b == 90 || a + b == 90) System.out.println("Прямоугольный треугольник");
        if (a == b || 2 * b == 180 - a || 2 * a == 180 - b) System.out.println("Равнобедренный треугольник");
        if ((b == 60) && (a == b)) System.out.println("Равносторонний треугольник");
        if ((a < 90) && (b < 90) && (180 - (a + b) < 90)) System.out.println("Остроугольный треугольник");
        else if ((a > 90) || (b > 90) || (180 - (a + b) > 90))
            System.out.println("Тупоугольный треугольник");
    }
}


