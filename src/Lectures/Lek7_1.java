package Lectures;

import java.util.Scanner;

public class Lek7_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int min;
        min=32000;
        for ( int i=1; i<=25; i++ ) {
            int a = scanner.nextInt();
            if (a<min) min=a;
        }
        System.out.println(min);
    }
}
