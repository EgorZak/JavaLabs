package lab16;

import java.util.Scanner;


public class Lab16_6 {
    static Scanner scanner = new Scanner(System.in);

    //Основная программа
    public static void main(String[] args) {
        Integer[] testArray = new Integer[] {1, 2, 99, 98, 97, 96, 95, 94, 93, 1};
        System.out.println(findMax(testArray));
    }

    public static Integer findMax(Integer[] testArray)
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > max) max = testArray[i];
        }

        return max;
    }
}










