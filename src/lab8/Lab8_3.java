package lab8;

public class Lab8_3 {
    public static void main(String[] args) {
        int x, y;
        x = -9 + (int) (Math.random() * 18);
        y = -9 + (int) (Math.random() * 18);
        System.out.println(x + " " + y);
        System.out.println("Наибольшее число: " + Math.max(x, y));
        System.out.println("Наименьшее число: " + Math.min(x, y));
    }
}


