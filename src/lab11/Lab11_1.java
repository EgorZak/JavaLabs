package lab11;


public class Lab11_1 {

    public static void main(String[] args) {
        int x = 0;
        int k = 0;
        int minTotal = Integer.MAX_VALUE;
        int m = 0;
        int y = 0;

        for (int i = 1; i <= 150; i++) {
            x = (int) (Math.random() * 60 + 1);
            k = (int) (Math.random() * 60 + 1);
            System.out.println(x + "." + k + " минут");

            int total = x * 60 + k;

            if (total < minTotal) {
                minTotal = total;
                m = x;
                y = k;
            }

        }

        System.out.println("===");
        System.out.println(m + "." + y + " минут");
    }

}




