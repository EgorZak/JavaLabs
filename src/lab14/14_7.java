package lab14;

import java.util.Scanner;

class methods2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean number;
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        System.out.print("c= ");
        int c = scanner.nextInt();
        proverka(a, b, c, 2, false);


    }

    static void proverka(int a, int b, int c, int d, boolean number) {
        d = 0;
        d = b * b - 4 * a * c;
        if (d > 0) number = true;
        else
            number = false;
        System.out.println(number);
    }

}





