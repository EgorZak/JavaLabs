package lab11;


public class Lab11_4 {

    public static void main(String[] args) {
        int x;
        int a=0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 24; i++) {
            x = 100 + (int) (Math.random() * 899 + 1);
            System.out.println(x);
            if (x > max) max = x;
            if (x == max) a = i;
        }
        System.out.println("Самое большое число: " + max + " Порядковый номер этого числа: " + a);

    }
}





