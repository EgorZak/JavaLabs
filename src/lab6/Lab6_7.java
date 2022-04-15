package lab6;

import java.util.Scanner;

public class Lab6_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите месяц: ");
        int a = scanner.nextInt();
        if((a>12)||(a<1))
            System.out.println("Введённое число неккоректно :(иди в школу");
        if (a==12 || a==1 || a==2) System.out.println("Сезон Зима");
        if (a==3 || a==4 || a==5) System.out.println("Сезон Весна");
        if (a==6 || a==7|| a==8) System.out.println("Сезон Лето");
        if (a==9 || a==10|| a==11) System.out.println("Сезон Осень");



    }
}


