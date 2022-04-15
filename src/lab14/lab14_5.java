package lab14;

public class lab14_5 {
    public static void main(String[] args) {
        System.out.println(sumDigits(5413));
    }

    public static int sumDigits(int number) {
        System.out.println(countDigits(5413));
        return number;
    }

    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count += 1;
            number = number / 10;
        }

        return count;
    }
}
