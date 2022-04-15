package lab10;

import java.util.Scanner;

public class Lab10_7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float average = 0;
        int k = 0;


        System.out.println("Введите отметки 30 учащихся: ");
        for (int i = 1; i <= 30; i++) {
        int x = scanner.nextInt();
        if ((x<4)&&(x>0)) k++;
        average=average+x;
        }
        average/=30;
        System.out.println("Число учащихся с неудовлетворительными отметками: " + k);
        System.out.println("Средняя арифметическая отметка по классу: " + average);


    }

}




