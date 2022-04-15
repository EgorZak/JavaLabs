package lab9;

import java.util.Scanner;

public class Lab9_3 {
    public static void main(String[] args) {
        int x;
        for (int i = 1; i <= 15; i++) {

            x = -20 + (int) (Math.random() * 55 + 1);
            System.out.print(" "+x);
            if (x < 0) System.out.print("?");
        }
    }

}






