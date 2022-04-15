package lab8;

public class Lab8_7 {
    public static void main(String[] args) {
        int x, y, a, c, d, min=10, max=99;
        x = (int) (Math.random() * (max - min) + min);
        y = (int) (Math.random() * (max - x) + x);
        System.out.println(x + " " + y);
        a = (int) (Math.random() * (y - x) + x);
        c = (int) (Math.random() * (y - x) + x);
        d = (int) (Math.random() * (y - x) + x);
        System.out.println(a + " " + c + " " + d);

    }
}


