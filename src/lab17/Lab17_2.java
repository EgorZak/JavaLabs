package lab17;

import java.util.Scanner;


public class Lab17_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[2000];
        printArray(fillArray(array));
        prvArray(fillArray(array));
    }

    public static int[] fillArray(int[] array) {
        int min = 0;
        int max = 9999;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min) + 1);
        }
        return array;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }

    public static void prvArray(int[] array) {
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 0) && (array[i] < 10)) k1++;
            if ((array[i] >= 10) && (array[i] < 99)) k2++;
            if ((array[i] >= 100) && (array[i] < 999)) k3++;
            if ((array[i] >= 1000) && (array[i] < 9999)) k4++;
        }
        System.out.println();
        System.out.println("Кол-во однозначных чисел: " + k1);
        System.out.println("Кол-во двухзначных чисел: " + k2);
        System.out.println("Кол-во трёхзначных чисел: " + k3);
        System.out.println("Кол-во четырёхзначных чисел: " + k4);
    }
}











