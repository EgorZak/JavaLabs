package lab8;

import java.util.Scanner;

public class Exampletipboolean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.println(hell(c));
    }

    private static boolean hell(int c) {
        return c > 0;

    }

}


