package lab11;


public class Lab11_3 {

    public static void main(String[] args) {
        int x;
        int a = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 20; i++) {
            x = 10 + (int) (Math.random() * 89 + 1);
            System.out.println(x);
            if (x % 10 + x / 10 > max) max = x / 10 + x % 10;
            if (x % 10 + x / 10 == max) a = x;
        }

        System.out.println("Максимальная сумма цифр: " + max + " Это число: " + a);


    }
}





