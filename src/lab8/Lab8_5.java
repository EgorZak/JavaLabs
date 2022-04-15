package lab8;

import java.util.Scanner;

public class Lab8_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, k,b;
        b=(int) (Math.random()*89);
        System.out.println(b);
        x = (int) (Math.random() * b);
        y = (int) (Math.random() * b);
        k = (int) (Math.random() * b);
        System.out.println(x + " " + y + " " + k);
    }
}


