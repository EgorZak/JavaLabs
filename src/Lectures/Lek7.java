package Lectures;

import java.util.Scanner;

public class Lek7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] testArray = new int[n];
        testArray = fillArray(testArray);
        printArray(testArray);
        System.out.println(sum(testArray, 2));
    }

    public static int sum(int[] array, int k)
    {
        int sum = 0;

        for (int i = k; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] fillArray(int[] array)
    {
        int min = 0;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }

        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}


