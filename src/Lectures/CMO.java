package Lectures;

import java.util.Scanner;

public class CMO {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int maxSum = Integer.MIN_VALUE;
        int maxI = 0;

        for (int i = 0; i < 15; i++) {
            int sum = 0;
            int num = scanner.nextInt();
            int copyNum = num;

            while (copyNum != 0) {
                int digit = copyNum % 10;
                sum += digit;
                copyNum = copyNum / 10;
            }

            if (sum > maxSum) {
                sum = maxSum;
                maxI = i;
            }
        }

        System.out.println(maxI);
    }
}
