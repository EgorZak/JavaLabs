package lab8;

public class Lab8_8 {
    public static void main(String[] args) {
        int a, b, c, d, e, min=10, max=99;
        a = (int) (Math.random() * (max - min) + min);
        b = (int) (Math.random() * (max - min) + min);
        c = (int) (Math.random() * (max - min) + min);
        d = (int) (Math.random() * (max - min) + min);
        e = (int) (Math.random() * (max - min) + min);
        a = (a / 10) * 10;
        b = (b / 10) * 10;
        c = (c / 10) * 10;
        d = (d / 10) * 10;
        e = (e / 10) * 10;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}


