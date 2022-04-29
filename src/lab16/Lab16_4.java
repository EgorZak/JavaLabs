package lab16;

import java.util.Scanner;


public class Lab16_3 {
    static Scanner scanner = new Scanner(System.in);

    //Основная программа
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        int n = scanner.nextInt();
        int[] testArray = new int[n];

        printArr(fillArr(testArray));

    }

    //Заполнение массива
    public static int[] fillArr(int[] array) {
        int min = 10;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            int rand = min + (int) (Math.random() * (max - min + 1));
            if (rand / 10 == rand % 10) array[i] = rand;
        }

        return array;
    }

    //Написание массива в консоль
    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}











