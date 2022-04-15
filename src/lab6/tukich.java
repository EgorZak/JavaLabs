package lab6;
import java.util.Scanner;
public class tukich {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" введите число ");
        int a=scanner.nextInt();
        int b= a/100;
        int c= a%10;
        int d= (a/10)%10;
        System.out.println(a+" "+b+" " +d+ " " +c+ "");
    }
}

