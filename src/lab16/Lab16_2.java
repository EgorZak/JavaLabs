package lab16;

import java.util.Scanner;


public class Lab16_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        Mas(array);
    }

    public static void Mas(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 10+ (int) (Math.random() * 89 + 1);
            System.out.print(array[i] + " ");
        }

    }

}









