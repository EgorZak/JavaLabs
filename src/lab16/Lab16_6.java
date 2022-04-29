package lab16;

import java.util.Scanner;


public class Lab16_5 {
    static Scanner scanner = new Scanner(System.in);

    //Основная программа
    public static void main(String[] args) {
        System.out.println("Введите размерность");
        int n = scanner.nextInt();
        System.out.println("Введите номер ячейки");
        int k = scanner.nextInt();
        int[] Array = new int[n];
        Array = fillArr(Array);
        printArr(Array);
        System.out.println(sum(Array, k));
    }

    //Заполнение массива
    public static int sum(int[] array, int k) {
        int sum = 0;
        for (int i = k; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] fillArr(int[] array)
    {
        int min = 0;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }

        return array;
    }

    public static void printArr(int[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}











