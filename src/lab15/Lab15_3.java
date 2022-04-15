package lab15;


import java.util.Scanner;

public class Lab15_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int i;
        System.out.println("Введите размерность массива: ");
       int n = scanner.nextInt();

       int[] a = new int[n];

        for (i=0;i<n;i++){
        a[i]= (int) (100+(Math.random()*899+1));
        System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}








