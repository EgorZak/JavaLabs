package lab15;


import java.util.Scanner;

public class Lab15_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        System.out.println("Введите размерность массива: ");
        int n = scanner.nextInt();
//сделать методы
        int[] a = new int[n];
        System.out.println("Массив: ");
        for (i = 0; i < n; i++) {
            a[i] = (int) (10 + (Math.random() * 89 + 1));
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Первая половина массива: ");
        for (i = 0; i < n/2; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Вторая половина массива: ");
        for (i = n/2; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
