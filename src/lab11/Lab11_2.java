package lab11;


public class Lab11_2 {

    public static void main(String[] args) {
        int x;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 50; i++) {
            x = -40 + (int) (Math.random() * 80 + 1);
            System.out.println(x);
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("Наибольшее число: " + max + " Наименьшее число: " + min);
    }
}





