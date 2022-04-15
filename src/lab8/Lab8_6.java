package lab8;

public class Lab8_6 {
    public static void main(String[] args) {
        int x, y, k;
        x = 10 + (int) (Math.random() * 89+1);
        System.out.println(x);
        y = x + (int) (Math.random() * 89+1);
        x = x + (int) (Math.random() * 89+1);
        k = x + (int) (Math.random() * 89+1);
        System.out.println(x + " " + y + " " + k);
    }
}


