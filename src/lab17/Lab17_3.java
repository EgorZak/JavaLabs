package lab17;

import java.util.Scanner;


public class Lab17_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[100];
        printArray(fillArray(array));
        prvArray(fillArray(array));
    }

    public static int[] fillArray(int[] array) {
        int min = 0;
        int max = 9;
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
        int k5 = 0;
        int k6 = 0;
        int k7 = 0;
        int k8 = 0;
        int k9 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1) k1++;
            if (array[i]==2) k2++;
            if (array[i]==3) k3++;
            if (array[i]==4) k4++;
            if (array[i]==5) k5++;
            if (array[i]==6) k6++;
            if (array[i]==7) k7++;
            if (array[i]==8) k8++;
            if (array[i]==9) k9++;

        }
        System.out.println();
        System.out.println("Кол-во повторов 1 : " + k1);
        System.out.println("Кол-во повторов 2 : " + k2);
        System.out.println("Кол-во повторов 3 : " + k3);
        System.out.println("Кол-во повторов 4 : " + k4);
        System.out.println("Кол-во повторов 5 : " + k5);
        System.out.println("Кол-во повторов 6 : " + k6);
        System.out.println("Кол-во повторов 7 : " + k7);
        System.out.println("Кол-во повторов 8 : " + k8);
        System.out.println("Кол-во повторов 9 : " + k9);

    }
}












