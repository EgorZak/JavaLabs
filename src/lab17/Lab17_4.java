package lab17;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab17_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[20];
        int[] array1 = new int[46];

        fill(array);
        printArray(array);
        prvarray(array1);
        ifarray(array,array1);
    }

    private static void ifarray(int[] array, int[] array1) {
        ArrayList<Float> found = new ArrayList<Float>();
        System.out.println();
        System.out.println("итоговый массив: ");
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (i == j) continue;
                {
                    if (array[i] == array1[j]) {
                        System.out.print(array[i] + " ");
                        if(found.contains(array[i])) continue;
                        found.add((float) array[i]);
                    }
                }
            }
        }
    }

    private static void prvarray(int[] array1) {
        System.out.println();
        System.out.println("Второй массив: ");
        for (int i = 15; i <array1.length ; i++) {
            array1[i]=i;
            System.out.print(array1[i] + " ");
        }
    }


    private static int[] fill(int[] array) {
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (15 + Math.random() * 30 + 1);
        }
        return array;
    }

        public static void printArray (int[] array){
            for (int i = 0; i < 20; i++) {
                System.out.print(array[i] + " ");
            }
        }

        }













